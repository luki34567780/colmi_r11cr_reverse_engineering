#!/usr/bin/env python3
"""
Colmi R11CR — live heart-rate + SpO2 chart from TWO rings, using the ring's
genuine continuous measurement mode (BLE cmd 0x69).

Background: the ring's normal "start measurement" commands (reading_type=1
for HR, same as the app's "Measure Now") are spot-checks — warm up ~15-30s,
lock one value, hold it briefly, go silent. reading_type=6 ("realtime",
undocumented, unused by the official app) is a *different* firmware code
path (realtime_reading_report_type6, found via Ghidra) that streams a fresh
HR sample about every 500ms — but it force-stops after a fixed ~40s budget
(10s warm-up + 30s streaming). Sending another start command with action=3
("continue") before that ~40s mark resets the streaming budget without
paying the 10s warm-up penalty again, as long as it's sent after the first
~10s — confirmed working consistently on real hardware for HR.

Confirmed (2026-07-11): a single ring can only run ONE realtime reading_type
at a time — starting SpO2 (reading_type=3) on a ring already streaming HR
(reading_type=6) silently kills the HR stream (the firmware's active-mode
state is a single byte, not a set). So concurrent HR+SpO2 needs two physical
rings, one dedicated to each reading_type, each on its own BLE connection —
that's what this script does now (--hr-address / --spo2-address).

(An earlier version of this script tried to derive its own BPM estimate via
DIY beat detection on a raw byte that rides along in every reading_type=1
response. That byte turned out — per Ghidra ground truth — to be an internal
intermediate value of the vendor's own HR algorithm, not real sensor data, so
that whole approach has been dropped. This version just plots the rings' own
officially-computed values.)

Each ring's connection is supervised independently: if the BLE link drops,
or if we go more than STALL_TIMEOUT seconds without receiving even a single
matching-reading_type packet (a zero-value "still warming up" packet counts
— only true silence counts as a stall), the connection is torn down and
re-established from scratch (fresh connect + start, paying the warm-up
penalty again).

Optional: --hr-phy/--spo2-phy can request a switch to LE Coded PHY (BLE 5
long-range mode, S=2 "500kbps"/S=8 "125kbps" coding) on that connection.
This is a link-layer property outside GATT/bleak's scope, so it's done via
a raw HCI command (`hcitool cmd`, same tool already used to shorten the
connection interval) rather than through bleak. Needs root/cap_net_raw for
hcitool's raw HCI socket, and whether it actually takes effect depends on
both controllers agreeing to it — unconfirmed against real hardware yet.

Usage:
    python colmi_heart_rate_live.py --scan
    python colmi_heart_rate_live.py --hr-address XX:XX:XX:XX:XX:XX --spo2-address YY:YY:YY:YY:YY:YY
    python colmi_heart_rate_live.py --hr-address XX:XX:XX:XX:XX:XX --spo2-address YY:YY:YY:YY:YY:YY --window 60
    python colmi_heart_rate_live.py --hr-address XX:XX:XX:XX:XX:XX --hr-phy coded-s8
"""

import argparse
import asyncio
import csv
import re
import sys
import threading
import time
from collections import deque
from datetime import datetime

import matplotlib.pyplot as plt
import matplotlib.animation as animation
from bleak import BleakClient, BleakScanner

WRITE_CHAR = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

CMD_START = 0x69  # ble_cmd_realtime_measure
CMD_STOP = 0x6A
CMD_BATTERY = 0x03  # response byte[1] = battery level 0-100

TYPE_HR = 6      # undocumented reading_type -> realtime_reading_report_type6, confirmed continuous
TYPE_SPO2 = 3    # documented "SpO2" reading_type; continuous behavior unconfirmed, assumed same as HR

ACTION_START = 1
ACTION_CONTINUE = 3    # resets the streaming budget without repaying warm-up
ACTION_STOP = 4

# realtime_reading_report_type6 force-stops ~40s after (re)start: 10s warm-up
# + 30s streaming. Resending action=3 before that resets the 30s streaming
# budget in place, as long as we're already past the initial ~10s warm-up
# window. 25s gives a comfortable margin on both sides.
KEEPALIVE_INTERVAL = 25.0
POLL_INTERVAL = 1.0
BATTERY_POLL_INTERVAL = 60.0

# If we go this long without even a single matching-reading_type packet
# (zero-value "warming up" packets count as received — only true silence
# counts), or the BLE link itself drops, tear down and reconnect from
# scratch. Normal operation sends a packet every ~500ms, so 10s is already
# a generous margin above any expected jitter.
STALL_TIMEOUT = 10.0
RECONNECT_DELAY = 3.0


def make_packet(cmd: int, payload: bytes = b"") -> bytes:
    pkt = bytearray(16)
    pkt[0] = cmd
    pkt[1:1 + len(payload[:14])] = payload[:14]
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)


def verify_checksum(data: bytes) -> bool:
    return len(data) == 16 and data[15] == (sum(data[:15]) & 0xFF)


async def _run_hcitool(args, name: str, label: str):
    """Run an hcitool subcommand, returning combined stdout+stderr text (or
    None on failure). Requires raw HCI socket access (root/cap_net_raw) —
    logs and returns rather than tearing down the BLE connection on error."""
    try:
        proc = await asyncio.create_subprocess_exec(
            "hcitool", *args,
            stdout=asyncio.subprocess.PIPE, stderr=asyncio.subprocess.STDOUT,
        )
        out, _ = await proc.communicate()
        text = out.decode(errors="replace").strip()
        if proc.returncode != 0:
            log(name, f"{label} failed (rc={proc.returncode}): {text}")
            return None
        return text
    except FileNotFoundError:
        log(name, f"{label} failed: hcitool not found")
        return None


async def _get_hci_handle(address: str, name: str):
    """Look up the kernel's connection handle for an already-connected
    device by matching its address in `hcitool con` output."""
    text = await _run_hcitool(["con"], name, "hcitool con")
    if not text:
        return None
    for line in text.splitlines():
        if address.lower() in line.lower():
            m = re.search(r"handle\s+(\d+)", line)
            if m:
                return int(m.group(1))
    return None


async def request_coded_phy(address: str, s: int, name: str) -> None:
    """Ask the controller to switch this connection's link layer to LE
    Coded PHY (BLE 5 long-range mode), preferring S=2 (500kbps) or S=8
    (125kbps) coding. PHY selection is a link-layer property outside
    GATT/bleak's scope, so this goes straight to the controller via a raw
    HCI command (Core spec Vol 4 Part E 7.8.49 "LE Set PHY") on the
    already-open connection — the same mechanism already used manually to
    shorten the connection interval via hcitool. Whether it actually takes
    effect depends on the peer (the ring's RTL8762C) accepting the
    resulting LL_PHY_UPDATE_REQ — not confirmed against real hardware yet."""
    handle = await _get_hci_handle(address, name)
    if handle is None:
        log(name, "PHY request skipped: no active HCI connection handle found "
                   "(needs root — try `sudo setcap cap_net_raw+eip $(which hcitool)`)")
        return
    lo, hi = handle & 0xFF, (handle >> 8) & 0xFF
    phy_option = 1 if s == 2 else 2   # PHY_Options: 1=prefer S=2, 2=prefer S=8
    all_phys = 0x00                   # we DO have a preference for both TX and RX
    coded_phy_mask = 0x04             # TX/RX_PHYs bit2 = LE Coded PHY
    args = ["cmd", "0x08", "0x31",                       # HCI LE Set PHY (OGF 0x08, OCF 0x31)
            f"0x{lo:02x}", f"0x{hi:02x}",                 # Connection_Handle (LE)
            f"0x{all_phys:02x}",                          # All_PHYs
            f"0x{coded_phy_mask:02x}", f"0x{coded_phy_mask:02x}",  # TX_PHYs, RX_PHYs
            f"0x{phy_option:02x}", "0x00"]                # PHY_Options (LE)
    log(name, f"requesting Coded PHY S={s} on handle {handle}: hcitool {' '.join(args)}")
    await _run_hcitool(args, name, "hcitool cmd (LE Set PHY)")


def log(tag: str, msg: str) -> None:
    print(f"[{time.strftime('%H:%M:%S')}] [{tag}] {msg}", flush=True)


class CsvLogger:
    """Shared, thread-safe CSV writer — both channels' background threads
    log through the same file/lock."""

    def __init__(self, path: str):
        self.file = open(path, "w", newline="")
        self.writer = csv.writer(self.file)
        self.writer.writerow(["time_iso", "elapsed_s", "channel", "reading_type", "value", "battery"])
        self.lock = threading.Lock()

    def write(self, elapsed_s: float, channel: str, reading_type, value, battery):
        with self.lock:
            self.writer.writerow([
                datetime.now().isoformat(timespec="milliseconds"),
                f"{elapsed_s:.3f}", channel, reading_type, value,
                battery if battery is not None else "",
            ])
            self.file.flush()

    def close(self):
        with self.lock:
            self.file.close()


class ChannelStream:
    """One ring, one reading_type, one BLE connection, run on a background
    thread. The main thread only ever reads `times`/`values` under `lock`."""

    def __init__(self, name: str, reading_type: int, address: str, start_time: float,
                 csv_logger: "CsvLogger | None" = None, coded_phy: int | None = None,
                 max_points: int = 2000):
        self.name = name
        self.reading_type = reading_type
        self.address = address
        self.start_time = start_time
        self.csv_logger = csv_logger
        self.coded_phy = coded_phy  # None, 2 (S=2), or 8 (S=8)
        self.times = deque(maxlen=max_points)
        self.values = deque(maxlen=max_points)
        self.battery = None
        self.last_packet_time = time.monotonic()
        self.lock = threading.Lock()
        self.stop_event = threading.Event()
        self.status = "connecting"
        self.thread = None

    def _start_pkt(self):
        return make_packet(CMD_START, bytes([self.reading_type, ACTION_START]))

    def _continue_pkt(self):
        return make_packet(CMD_START, bytes([self.reading_type, ACTION_CONTINUE]))

    def _stop_pkt(self):
        return make_packet(CMD_START, bytes([self.reading_type, ACTION_STOP]))

    def on_notify(self, _char, data):
        data = bytes(data)
        ok = verify_checksum(data)
        log(self.name, f"<- {data.hex()}" + ("" if ok else "  [BAD CHECKSUM]"))
        if not ok:
            return
        cmd = data[0] & 0x7F
        if cmd == CMD_BATTERY:
            with self.lock:
                self.battery = data[1]
            log(self.name, f"   battery={data[1]}%")
            if self.csv_logger:
                self.csv_logger.write(time.monotonic() - self.start_time, self.name,
                                       "battery", "", data[1])
            return
        if cmd != CMD_START:
            log(self.name, f"   cmd=0x{cmd:02x} (unhandled)")
            return

        rsp_type, err_code, value = data[1], data[2], data[3]
        log(self.name, f"   cmd=0x{cmd:02x} type={rsp_type} errCode={err_code} value={value}")
        if rsp_type != self.reading_type:
            return
        self.last_packet_time = time.monotonic()  # zero-value packets count too — only true silence is a stall

        if value:
            t = time.monotonic() - self.start_time
            with self.lock:
                if self.times and t <= self.times[-1]:
                    t = self.times[-1] + 1e-6
                self.times.append(t)
                self.values.append(value)
            if self.csv_logger:
                self.csv_logger.write(t, self.name, self.reading_type, value, self.battery)
            self.status = "streaming"
        else:
            self.status = "measuring (warming up)"

    async def _send(self, client, pkt, label):
        log(self.name, f"-> {pkt.hex()}   [{label}]")
        await client.write_gatt_char(WRITE_CHAR, pkt)

    async def _connect_and_stream(self):
        self.status = "connecting"
        log(self.name, f"connecting to {self.address} ...")
        async with BleakClient(self.address, timeout=20.0) as client:
            self.status = "connected"
            log(self.name, "connected")
            await client.start_notify(NOTIFY_CHAR, self.on_notify)

            if self.coded_phy:
                await request_coded_phy(self.address, self.coded_phy, self.name)

            try:
                self.status = "measuring (warming up)"
                self.last_packet_time = time.monotonic()
                await self._send(client, self._start_pkt(), f"start {self.name} measurement")
                last_keepalive = time.monotonic()
                await self._send(client, make_packet(CMD_BATTERY), "battery query")
                last_battery = time.monotonic()

                while not self.stop_event.is_set():
                    await asyncio.sleep(POLL_INTERVAL)
                    if not client.is_connected:
                        raise ConnectionError("BLE link dropped")
                    now = time.monotonic()
                    if now - self.last_packet_time > STALL_TIMEOUT:
                        raise TimeoutError(f"no {self.name} packet for over {STALL_TIMEOUT:.0f}s")
                    if now - last_keepalive > KEEPALIVE_INTERVAL:
                        await self._send(client, self._continue_pkt(), "keep-alive (continue)")
                        last_keepalive = now
                    if now - last_battery > BATTERY_POLL_INTERVAL:
                        await self._send(client, make_packet(CMD_BATTERY), "battery query")
                        last_battery = now
            finally:
                self.status = "stopping"
                try:
                    await self._send(client, self._stop_pkt(), f"stop {self.name} measurement")
                except Exception:
                    pass

    async def _run(self):
        while not self.stop_event.is_set():
            try:
                await self._connect_and_stream()
            except Exception as e:
                log(self.name, f"connection error: {e!r}")
            if self.stop_event.is_set():
                break
            self.status = f"reconnecting in {RECONNECT_DELAY:.0f}s"
            log(self.name, self.status)
            await asyncio.sleep(RECONNECT_DELAY)

    def _thread_main(self):
        loop = asyncio.new_event_loop()
        asyncio.set_event_loop(loop)
        try:
            loop.run_until_complete(self._run())
        except Exception as e:
            self.status = f"error: {e}"
            log(self.name, f"ERROR: {e!r}")
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
    for d in devices:
        print(f"  {d.name or 'unknown':<20s} {d.address}")


def main():
    ap = argparse.ArgumentParser(description="Live heart-rate + SpO2 chart from two Colmi rings (continuous mode)")
    ap.add_argument("--hr-address", help="BLE address of the ring dedicated to heart-rate streaming")
    ap.add_argument("--spo2-address", help="BLE address of the ring dedicated to SpO2 streaming")
    ap.add_argument("--scan", action="store_true", help="scan for nearby rings")
    ap.add_argument("--window", type=float, default=60.0,
                     help="seconds of history visible on screen (default 60)")
    ap.add_argument("--min-bpm", type=float, default=40.0, help="HR y-axis lower bound (default 40)")
    ap.add_argument("--max-bpm", type=float, default=180.0, help="HR y-axis upper bound (default 180)")
    ap.add_argument("--min-spo2", type=float, default=80.0, help="SpO2 y-axis lower bound (default 80)")
    ap.add_argument("--max-spo2", type=float, default=100.0, help="SpO2 y-axis upper bound (default 100)")
    ap.add_argument("--csv", help="log every reading to this CSV file (time_iso,elapsed_s,channel,reading_type,value)")
    ap.add_argument("--hr-phy", choices=["1m", "coded-s2", "coded-s8"], default="1m",
                     help="request a PHY switch on the HR connection (default 1m = no change, needs root)")
    ap.add_argument("--spo2-phy", choices=["1m", "coded-s2", "coded-s8"], default="1m",
                     help="request a PHY switch on the SpO2 connection (default 1m = no change, needs root)")
    args = ap.parse_args()

    if args.scan:
        asyncio.run(scan())
        return
    if not args.hr_address and not args.spo2_address:
        ap.error("at least one of --hr-address / --spo2-address is required (or use --scan)")

    csv_logger = CsvLogger(args.csv) if args.csv else None
    if csv_logger:
        log("csv", f"logging to {args.csv}")

    phy_s = {"coded-s2": 2, "coded-s8": 8}
    start_time = time.monotonic()
    hr_stream = ChannelStream("heart rate", TYPE_HR, args.hr_address, start_time, csv_logger,
                               phy_s.get(args.hr_phy)) if args.hr_address else None
    spo2_stream = ChannelStream("SpO2", TYPE_SPO2, args.spo2_address, start_time, csv_logger,
                                 phy_s.get(args.spo2_phy)) if args.spo2_address else None
    for s in (hr_stream, spo2_stream):
        if s is not None:
            s.start()

    LIGHT_BPM, DARK_BPM = "#e34948", "#e66767"
    LIGHT_SPO2, DARK_SPO2 = "#2a78d6", "#3987e5"
    is_dark = plt.rcParams["figure.facecolor"] in ("black", "#000000") or \
        str(plt.rcParams.get("axes.facecolor", "")).lower() in ("black", "#000000")
    bpm_color = DARK_BPM if is_dark else LIGHT_BPM
    spo2_color = DARK_SPO2 if is_dark else LIGHT_SPO2

    fig, ax_bpm = plt.subplots(figsize=(9, 5))
    # only split into two y-axes when both channels are active; a single
    # channel gets the whole plot to itself with its own natural y-axis.
    ax_spo2 = ax_bpm.twinx() if (hr_stream and spo2_stream) else ax_bpm

    lines, texts = [], []
    bpm_line = spo2_line = bpm_text = spo2_text = None
    if hr_stream:
        bpm_line, = ax_bpm.plot([], [], "-o", linewidth=2, markersize=4, color=bpm_color, label="heart rate")
        bpm_text = ax_bpm.text(0.98, 0.92, "", transform=ax_bpm.transAxes,
                                ha="right", va="top", fontsize=22, color=bpm_color)
        ax_bpm.set_ylabel("heart rate (bpm)", color=bpm_color)
        ax_bpm.set_ylim(args.min_bpm, args.max_bpm)
        lines.append(bpm_line)
        texts.append(bpm_text)
    if spo2_stream:
        spo2_line, = ax_spo2.plot([], [], "-o", linewidth=2, markersize=4, color=spo2_color, label="SpO2")
        spo2_text = ax_bpm.text(0.98, 0.92 if not hr_stream else 0.74, "", transform=ax_bpm.transAxes,
                                 ha="right", va="top", fontsize=22, color=spo2_color)
        ax_spo2.set_ylabel("SpO2 (%)", color=spo2_color)
        ax_spo2.set_ylim(args.min_spo2, args.max_spo2)
        lines.append(spo2_line)
        texts.append(spo2_text)

    status_text = ax_bpm.text(0.02, 0.04, "", transform=ax_bpm.transAxes,
                               ha="left", va="bottom", fontsize=9, color="0.5")
    ax_bpm.set_xlabel("time (s)")
    title = " + ".join(n for n, s in (("heart rate", hr_stream), ("SpO2", spo2_stream)) if s)
    ax_bpm.set_title(f"Colmi R11CR — continuous {title}")
    ax_bpm.grid(True, alpha=0.25)
    ax_bpm.legend(lines, [l.get_label() for l in lines], loc="upper left", fontsize=8)
    ax_bpm.spines["top"].set_visible(False)

    def update(_frame):
        hr_t = hr_v = spo2_t = spo2_v = []
        hr_batt = spo2_batt = None
        if hr_stream:
            with hr_stream.lock:
                hr_t = list(hr_stream.times)
                hr_v = list(hr_stream.values)
                hr_batt = hr_stream.battery
        if spo2_stream:
            with spo2_stream.lock:
                spo2_t = list(spo2_stream.times)
                spo2_v = list(spo2_stream.values)
                spo2_batt = spo2_stream.battery

        status_bits = []
        if hr_stream:
            batt = f", batt {hr_batt}%" if hr_batt is not None else ""
            status_bits.append(f"HR: {hr_stream.status} ({len(hr_t)}{batt})")
        if spo2_stream:
            batt = f", batt {spo2_batt}%" if spo2_batt is not None else ""
            status_bits.append(f"SpO2: {spo2_stream.status} ({len(spo2_t)}{batt})")
        status_text.set_text("   ".join(status_bits))

        artists = [a for a in (bpm_line, spo2_line, bpm_text, spo2_text, status_text) if a is not None]
        right = max([t[-1] for t in (hr_t, spo2_t) if t], default=None)
        if right is None:
            return artists
        left = max(0.0, right - args.window)

        if hr_stream:
            hr_idx = [i for i, t in enumerate(hr_t) if t >= left]
            bpm_line.set_data([hr_t[i] for i in hr_idx], [hr_v[i] for i in hr_idx])
            if hr_v:
                bpm_text.set_text(f"{hr_v[-1]:.0f} bpm")

        if spo2_stream:
            spo2_idx = [i for i, t in enumerate(spo2_t) if t >= left]
            spo2_line.set_data([spo2_t[i] for i in spo2_idx], [spo2_v[i] for i in spo2_idx])
            if spo2_v:
                spo2_text.set_text(f"{spo2_v[-1]:.0f}% SpO2")

        ax_bpm.set_xlim(left, max(right, args.window))

        return artists

    ani = animation.FuncAnimation(fig, update, interval=500, cache_frame_data=False)
    try:
        plt.show()
    finally:
        for s in (hr_stream, spo2_stream):
            if s is not None:
                s.stop()
        if csv_logger:
            csv_logger.close()


if __name__ == "__main__":
    main()
