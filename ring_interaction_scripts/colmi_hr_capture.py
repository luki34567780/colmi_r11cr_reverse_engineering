#!/usr/bin/env python3
"""
Colmi R11CR — raw packet capture for offline heart-rate signal analysis.

Connects, starts the ring's HR spot-check (BLE cmd 0x69, type=1), and logs
every valid 0x69 response packet (monotonic timestamp + full 16-byte hex) to
a CSV file. No plotting, no assumptions about which byte carries a useful
signal — that's what analyze_hr_spectrum.py figures out afterward from this
raw capture. Runs the same stall-detection/restart logic as
colmi_heart_rate_live.py so a long capture survives the ring's own
measurement cycles ending.

Usage:
    python colmi_hr_capture.py --address XX:XX:XX:XX:XX:XX --duration 180 --out capture.csv
"""

import argparse
import asyncio
import csv
import time

from bleak import BleakClient

WRITE_CHAR = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

CMD_START = 0x69
CMD_STOP = 0x6A
TYPE_HEART_RATE = 1

STALL_TIMEOUT = 8.0
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


class Capture:
    def __init__(self, address: str, out_path: str, duration: float):
        self.address = address
        self.out_path = out_path
        self.duration = duration
        self.start_time = None
        self.last_packet_time = None
        self.last_value = 0
        self.n_packets = 0
        self.n_confirmed = 0
        self.csv_file = None
        self.csv_writer = None

    def on_notify(self, _char, data):
        data = bytes(data)
        if not verify_checksum(data):
            return
        self.last_packet_time = time.monotonic()
        cmd = data[0] & 0x7F
        if cmd != CMD_START:
            return
        t = time.monotonic() - self.start_time
        self.csv_writer.writerow([f"{t:.4f}", data.hex()])
        self.n_packets += 1
        value = data[3]
        if data[1] == TYPE_HEART_RATE and value:
            self.last_value = value
            self.n_confirmed += 1

    async def run(self):
        log(f"connecting to {self.address} ...")
        with open(self.out_path, "w", newline="") as f:
            self.csv_file = f
            self.csv_writer = csv.writer(f)
            self.csv_writer.writerow(["t", "hex"])

            async with BleakClient(self.address, timeout=20.0) as client:
                log("connected")
                await client.start_notify(NOTIFY_CHAR, self.on_notify)

                self.start_time = time.monotonic()
                self.last_packet_time = time.monotonic()
                start_pkt = make_packet(CMD_START, bytes([TYPE_HEART_RATE, 0]))
                await client.write_gatt_char(WRITE_CHAR, start_pkt)
                log("start HR measurement sent, capturing...")

                try:
                    while time.monotonic() - self.start_time < self.duration:
                        await asyncio.sleep(POLL_INTERVAL)
                        elapsed = time.monotonic() - self.start_time
                        log(f"  {elapsed:5.1f}s / {self.duration:.0f}s   "
                            f"packets={self.n_packets}  confirmed_readings={self.n_confirmed}")
                        if time.monotonic() - self.last_packet_time > STALL_TIMEOUT:
                            log("  stalled, restarting measurement")
                            await client.write_gatt_char(WRITE_CHAR, start_pkt)
                            self.last_packet_time = time.monotonic()
                finally:
                    try:
                        stop_pkt = make_packet(CMD_STOP, bytes([TYPE_HEART_RATE, self.last_value & 0xFF, 0]))
                        await client.write_gatt_char(WRITE_CHAR, stop_pkt)
                    except Exception:
                        pass

        log(f"done. {self.n_packets} packets ({self.n_confirmed} confirmed readings) written to {self.out_path}")


def main():
    ap = argparse.ArgumentParser(description="Capture raw Colmi HR packets to CSV for offline spectral analysis")
    ap.add_argument("--address", required=True, help="ring BLE address")
    ap.add_argument("--duration", type=float, default=180.0, help="capture duration in seconds (default 180)")
    ap.add_argument("--out", default="hr_capture.csv", help="output CSV path (default hr_capture.csv)")
    args = ap.parse_args()

    cap = Capture(args.address, args.out, args.duration)
    try:
        asyncio.run(cap.run())
    except KeyboardInterrupt:
        log("interrupted")


if __name__ == "__main__":
    main()
