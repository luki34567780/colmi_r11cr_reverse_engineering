#!/usr/bin/env python3
"""
Colmi R11CR — live heart-rate chart, using the ring's genuine continuous
measurement mode (BLE cmd 0x69, reading_type=6).

Background: the ring's normal "start heart-rate measurement" (reading_type=1,
same as the app's "Measure Now") is a spot-check — warm up ~15-30s, lock one
value, hold it briefly, go silent. reading_type=6 ("realtime", undocumented,
unused by the official app) is a *different* firmware code path
(realtime_reading_report_type6, found via Ghidra) that streams a fresh sample
about every 500ms — but it force-stops after a fixed ~40s budget (10s warm-up
+ 30s streaming). Sending another start command with action=3 ("continue")
before that ~40s mark resets the streaming budget without paying the 10s
warm-up penalty again, as long as it's sent after the first ~10s — confirmed
working consistently on real hardware. This script sends that keep-alive
automatically every KEEPALIVE_INTERVAL seconds, so the stream just keeps
going indefinitely.

(An earlier version of this script tried to derive its own BPM estimate via
DIY beat detection on a raw byte that rides along in every reading_type=1
response. That byte turned out — per Ghidra ground truth — to be an internal
intermediate value of the vendor's own HR algorithm, not real sensor data, so
that whole approach has been dropped. This version just plots the ring's own
officially-computed BPM, sampled at the rate reading_type=6 actually streams
it, which is high enough on its own.)

Usage:
    python colmi_heart_rate_live.py --scan
    python colmi_heart_rate_live.py --address XX:XX:XX:XX:XX:XX
    python colmi_heart_rate_live.py --address XX:XX:XX:XX:XX:XX --window 60
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

CMD_START = 0x69  # ble_cmd_realtime_measure
CMD_STOP = 0x6A

TYPE_REALTIME = 6      # undocumented reading_type -> realtime_reading_report_type6
ACTION_START = 1
ACTION_CONTINUE = 3    # resets the streaming budget without repaying warm-up
ACTION_STOP = 4

# realtime_reading_report_type6 force-stops ~40s after (re)start: 10s warm-up
# + 30s streaming. Resending action=3 before that resets the 30s streaming
# budget in place, as long as we're already past the initial ~10s warm-up
# window. 25s gives a comfortable margin on both sides.
KEEPALIVE_INTERVAL = 25.0
POLL_INTERVAL = 1.0


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
    ever reads the deques under `lock` to drive the matplotlib redraw."""

    def __init__(self, address: str, max_points: int = 2000):
        self.address = address
        self.bpm_times = deque(maxlen=max_points)
        self.bpm_values = deque(maxlen=max_points)
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
        if cmd != CMD_START:
            log(f"   cmd=0x{cmd:02x} (unhandled)")
            return

        rsp_type, err_code, value = data[1], data[2], data[3]
        log(f"   cmd=0x{cmd:02x} type={rsp_type} errCode={err_code} value={value}")
        if rsp_type != TYPE_REALTIME:
            return

        if value:
            t = time.monotonic() - self.start_time
            with self.lock:
                if self.bpm_times and t <= self.bpm_times[-1]:
                    t = self.bpm_times[-1] + 1e-6
                self.bpm_times.append(t)
                self.bpm_values.append(value)
            self.last_value = value
            self.status = "streaming"
        else:
            self.status = "measuring (warming up)"

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
            start_pkt = make_packet(CMD_START, bytes([TYPE_REALTIME, ACTION_START]))
            continue_pkt = make_packet(CMD_START, bytes([TYPE_REALTIME, ACTION_CONTINUE]))

            try:
                self.status = "measuring (warming up)"
                self.last_packet_time = time.monotonic()
                await self._send(client, start_pkt, "start realtime measurement")
                last_keepalive = time.monotonic()

                while not self.stop_event.is_set():
                    await asyncio.sleep(POLL_INTERVAL)
                    now = time.monotonic()
                    if now - last_keepalive > KEEPALIVE_INTERVAL:
                        await self._send(client, continue_pkt, "keep-alive (continue)")
                        last_keepalive = now
            finally:
                self.status = "stopping"
                try:
                    stop_pkt = make_packet(CMD_START, bytes([TYPE_REALTIME, ACTION_STOP]))
                    await self._send(client, stop_pkt, "stop realtime measurement")
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
    ap = argparse.ArgumentParser(description="Live heart-rate chart from a Colmi ring (continuous mode)")
    ap.add_argument("--address", help="ring BLE address")
    ap.add_argument("--scan", action="store_true", help="scan for nearby rings")
    ap.add_argument("--window", type=float, default=60.0,
                     help="seconds of history visible on screen (default 60)")
    ap.add_argument("--min-bpm", type=float, default=40.0, help="chart y-axis lower bound (default 40)")
    ap.add_argument("--max-bpm", type=float, default=180.0, help="chart y-axis upper bound (default 180)")
    args = ap.parse_args()

    if args.scan:
        asyncio.run(scan())
        return
    if not args.address:
        ap.error("--address is required (or use --scan)")

    stream = HeartRateStream(args.address)
    stream.start()

    LIGHT_BPM, DARK_BPM = "#e34948", "#e66767"
    is_dark = plt.rcParams["figure.facecolor"] in ("black", "#000000") or \
        str(plt.rcParams.get("axes.facecolor", "")).lower() in ("black", "#000000")
    bpm_color = DARK_BPM if is_dark else LIGHT_BPM

    fig, ax = plt.subplots(figsize=(9, 5))
    bpm_line, = ax.plot([], [], "-o", linewidth=2, markersize=4, color=bpm_color, label="heart rate")
    bpm_text = ax.text(0.98, 0.92, "", transform=ax.transAxes,
                        ha="right", va="top", fontsize=26, color=bpm_color)
    status_text = ax.text(0.02, 0.04, "", transform=ax.transAxes,
                           ha="left", va="bottom", fontsize=9, color="0.5")
    ax.set_xlabel("time (s)")
    ax.set_ylabel("heart rate (bpm)")
    ax.set_ylim(args.min_bpm, args.max_bpm)
    ax.set_title("Colmi R11CR — continuous heart rate (reading_type=6)")
    ax.grid(True, alpha=0.25)
    ax.legend(loc="upper left", fontsize=8)
    for spine in ("top", "right"):
        ax.spines[spine].set_visible(False)

    def update(_frame):
        with stream.lock:
            t = list(stream.bpm_times)
            v = list(stream.bpm_values)

        status_text.set_text(f"status: {stream.status}   samples: {len(t)}")
        if not t:
            return bpm_line, bpm_text, status_text

        right = t[-1]
        left = max(0.0, right - args.window)
        vis_idx = [i for i, tt in enumerate(t) if tt >= left]
        bpm_line.set_data([t[i] for i in vis_idx], [v[i] for i in vis_idx])
        ax.set_xlim(left, max(right, args.window))
        bpm_text.set_text(f"{v[-1]:.0f} bpm")

        return bpm_line, bpm_text, status_text

    ani = animation.FuncAnimation(fig, update, interval=500, cache_frame_data=False)
    try:
        plt.show()
    finally:
        stream.stop()


if __name__ == "__main__":
    main()
