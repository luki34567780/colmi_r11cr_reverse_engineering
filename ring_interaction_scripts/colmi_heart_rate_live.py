#!/usr/bin/env python3
"""
Colmi R11CR — live heart-rate chart.

Two modes, both BLE cmd 0x69 (StartHeartRateReq in the QRing APK):

  spot (default) — type=1, "measure now". Send once, then just listen; the
    ring locks a stable BPM after a ~15-30s warm-up, holds/repeats it for a
    few seconds, then goes fully silent on its own (confirmed by testing).
    We detect that silence (no packets at all, not just value=0) and start a
    fresh cycle. This is the same flow the app's manual "Measure Now" button
    uses — a spot-check, not a continuous monitor. Expect one real reading
    roughly every 25-30 seconds.

  --realtime (EXPERIMENTAL) — type=6, using the request class's own
    ACTION_START/CONTINUE/STOP bytes (1/3/4). This is a second, distinct
    packet the QRing APK's StartHeartRateReq class can build
    (getRealtimeHeartRate()) but which has ZERO call sites in the decompiled
    app — unused in this build, so it's unverified whether the firmware
    honors it as a genuinely continuous stream. Worth trying since it's
    cheap and firmware-side Ghidra analysis shows type=6 is dispatched by a
    separate code path (realtime_reading_report_type6) from the type=1..10
    spot-check flow. If it behaves like `spot` (locks briefly then goes
    silent), it isn't actually different in practice.

Every decoded BPM value is plotted live with matplotlib as it arrives.

Usage:
    python colmi_heart_rate_live.py --scan
    python colmi_heart_rate_live.py --address XX:XX:XX:XX:XX:XX
    python colmi_heart_rate_live.py --address XX:XX:XX:XX:XX:XX --realtime
    python colmi_heart_rate_live.py --address XX:XX:XX:XX:XX:XX --window 120
"""

import argparse
import asyncio
import sys
import threading
import time
from collections import deque

import matplotlib.pyplot as plt
import matplotlib.animation as animation
from bleak import BleakClient, BleakScanner

WRITE_CHAR = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

CMD_START = 0x69  # StartHeartRateReq (cmd 105 in the QRing APK)
CMD_STOP = 0x6A   # StopHeartRateReq (cmd 106)

TYPE_HR_SPOT = 1      # StartHeartRateReq.TYPE_HEARTRATE — single-shot "measure now"
TYPE_HR_REALTIME = 6  # StartHeartRateReq.getRealtimeHeartRate() type — EXPERIMENTAL, see module docstring

# StartHeartRateReq.ACTION_* — only meaningful for TYPE_HR_REALTIME's request
# layout ([type, action]); the spot-check request layout is [type, sub=0].
ACTION_START = 1
ACTION_CONTINUE = 3
ACTION_STOP = 4

# Response payload (both types, as far as tested) = [type, errCode, value, ...]
# → data[1]=type, data[2]=errCode, data[3]=value. value=0 while warming up.
#
# IMPORTANT (spot mode): send `start` ONCE, then just keep listening — do NOT
# re-send it after getting a value. The ring keeps refreshing the measurement
# on its own (confirmed: repeated distinct BPM values arrive over many
# seconds once locked). Re-sending `start` resets the ring's internal
# warm-up/sample-tick counter, throwing away an active stream — only do it if
# the ring has gone fully silent (no packets at all, valid or not) for
# STALL_TIMEOUT seconds, which means the measurement actually ended/lost
# contact.
STALL_TIMEOUT = 8.0
POLL_INTERVAL = 1.0
REALTIME_CONTINUE_PERIOD = 2.0  # how often to send ACTION_CONTINUE in --realtime mode


def make_packet(cmd: int, payload: bytes = b"") -> bytes:
    pkt = bytearray(16)
    pkt[0] = cmd
    pkt[1:1 + len(payload[:14])] = payload[:14]
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)


def verify_checksum(data: bytes) -> bool:
    return len(data) == 16 and data[15] == (sum(data[:15]) & 0xFF)


def log(msg: str) -> None:
    print(f"[{time.strftime('%H:%M:%S')}] {msg}", flush=True)


class HeartRateStream:
    """Runs the BLE connection on a background thread; the main thread only
    ever reads `times`/`values` under `lock` to drive the matplotlib redraw."""

    def __init__(self, address: str, realtime: bool = False, max_points: int = 600):
        self.address = address
        self.realtime = realtime
        self.type_byte = TYPE_HR_REALTIME if realtime else TYPE_HR_SPOT
        self.times = deque(maxlen=max_points)
        self.values = deque(maxlen=max_points)
        self.lock = threading.Lock()
        self.start_time = None
        self.stop_event = threading.Event()
        self.status = "connecting"
        self.thread = None
        self.last_value = 0
        self.last_packet_time = None

    def on_notify(self, _char, data):
        data = bytes(data)
        ok = verify_checksum(data)
        log(f"<- {data.hex()}" + ("" if ok else "  [BAD CHECKSUM]"))
        if not ok:
            return
        self.last_packet_time = time.monotonic()
        cmd = data[0] & 0x7F
        if cmd == CMD_START:
            rsp_type, err_code, value = data[1], data[2], data[3]
            log(f"   cmd=0x{cmd:02x} type={rsp_type} errCode={err_code} value={value}")
            if rsp_type == self.type_byte and value:
                self.last_value = value
                self.status = "measuring (locked)"
                t = time.monotonic() - self.start_time
                with self.lock:
                    self.times.append(t)
                    self.values.append(value)
        else:
            log(f"   cmd=0x{cmd:02x} (unhandled)")

    async def _send(self, client, pkt, label):
        log(f"-> {pkt.hex()}   [{label}]")
        await client.write_gatt_char(WRITE_CHAR, pkt)

    async def _run(self):
        self.status = "connecting"
        log(f"connecting to {self.address} ...")
        async with BleakClient(self.address, timeout=20.0) as client:
            self.status = "connected"
            log("connected")
            await client.start_notify(NOTIFY_CHAR, self.on_notify)

            self.start_time = time.monotonic()
            sub_byte = ACTION_START if self.realtime else 0
            start_pkt = make_packet(CMD_START, bytes([self.type_byte, sub_byte]))
            continue_pkt = make_packet(CMD_START, bytes([self.type_byte, ACTION_CONTINUE]))

            try:
                self.status = "measuring (warming up)"
                self.last_packet_time = time.monotonic()
                last_continue = time.monotonic()
                await self._send(client, start_pkt,
                                  "start HR measurement" + (" (realtime, EXPERIMENTAL)" if self.realtime else ""))

                while not self.stop_event.is_set():
                    await asyncio.sleep(POLL_INTERVAL)
                    now = time.monotonic()
                    if now - self.last_packet_time > STALL_TIMEOUT:
                        self.status = "stalled, restarting measurement"
                        await self._send(client, start_pkt, "restart HR measurement (stalled)")
                        self.last_packet_time = now
                        last_continue = now
                    elif self.realtime and now - last_continue > REALTIME_CONTINUE_PERIOD:
                        await self._send(client, continue_pkt, "continue realtime HR")
                        last_continue = now
            finally:
                self.status = "stopping"
                try:
                    if self.realtime:
                        stop_pkt = make_packet(CMD_START, bytes([self.type_byte, ACTION_STOP]))
                    else:
                        stop_pkt = make_packet(CMD_STOP, bytes([self.type_byte, self.last_value & 0xFF, 0]))
                    await self._send(client, stop_pkt, "stop HR reading")
                except Exception:
                    pass

    def _thread_main(self):
        loop = asyncio.new_event_loop()
        asyncio.set_event_loop(loop)
        try:
            loop.run_until_complete(self._run())
        except Exception as e:
            self.status = f"error: {e}"
            log(f"ERROR: {e!r}")
        finally:
            self.status = "stopped"

    def start(self):
        self.thread = threading.Thread(target=self._thread_main, daemon=True)
        self.thread.start()

    def stop(self):
        self.stop_event.set()


async def scan():
    print("Scanning for rings (10s)...")
    devices = await BleakScanner.discover(timeout=10.0)
    rings = [d for d in devices if (d.name or "").upper().startswith(
        ("R02", "R03", "R06", "R09", "R10", "R11", "R12", "COLMI", "HELLO RING", "RING1"))]
    if not rings:
        print("No rings found. Make sure it's charged and not connected in the QRing app.")
        return
    for d in rings:
        print(f"  {d.name or 'unknown':<20s} {d.address}  {d.rssi} dBm")
    print(f"\nRun with:  python {sys.argv[0]} --address {rings[0].address}")


def main():
    ap = argparse.ArgumentParser(description="Live heart-rate chart from a Colmi ring")
    ap.add_argument("--address", help="ring BLE address")
    ap.add_argument("--scan", action="store_true", help="scan for nearby rings")
    ap.add_argument("--window", type=float, default=60.0,
                     help="seconds of history visible on screen (default 60)")
    args = ap.parse_args()

    if args.scan:
        asyncio.run(scan())
        return
    if not args.address:
        ap.error("--address is required (or use --scan)")

    stream = HeartRateStream(args.address)
    stream.start()

    LIGHT_LINE, DARK_LINE = "#e34948", "#e66767"
    is_dark = plt.rcParams["figure.facecolor"] in ("black", "#000000") or \
        str(plt.rcParams.get("axes.facecolor", "")).lower() in ("black", "#000000")
    line_color = DARK_LINE if is_dark else LIGHT_LINE

    fig, ax = plt.subplots(figsize=(9, 5))
    line, = ax.plot([], [], "-o", markersize=4, linewidth=2, color=line_color)
    value_text = ax.text(0.98, 0.95, "", transform=ax.transAxes,
                          ha="right", va="top", fontsize=28, color=line_color)
    status_text = ax.text(0.02, 0.02, "", transform=ax.transAxes,
                           ha="left", va="bottom", fontsize=9, color="0.5")

    ax.set_xlabel("time (s)")
    ax.set_ylabel("heart rate (bpm)")
    ax.set_title("Colmi live heart rate")
    ax.grid(True, alpha=0.25)
    for spine in ("top", "right"):
        ax.spines[spine].set_visible(False)

    def update(_frame):
        with stream.lock:
            xs = list(stream.times)
            ys = list(stream.values)
        status_text.set_text(f"status: {stream.status}   samples: {len(ys)}")
        if not xs:
            return line, value_text, status_text

        line.set_data(xs, ys)
        value_text.set_text(f"{ys[-1]} bpm")

        right = max(xs[-1], args.window)
        ax.set_xlim(max(0, right - args.window), right)
        ymin, ymax = min(ys), max(ys)
        pad = max(5, (ymax - ymin) * 0.25)
        ax.set_ylim(ymin - pad, ymax + pad)
        return line, value_text, status_text

    ani = animation.FuncAnimation(fig, update, interval=1000, cache_frame_data=False)
    try:
        plt.show()
    finally:
        stream.stop()


if __name__ == "__main__":
    main()
