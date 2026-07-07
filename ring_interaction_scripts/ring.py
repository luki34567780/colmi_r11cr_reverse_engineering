#!/usr/bin/env python3
"""
Colmi R02/R06/R10 Smart Ring — Heart Rate & SpO2 Reader
Reads blood oxygen and heart rate every 60 seconds.

Requirements:
    pip install bleak

Usage:
    # Scan for your ring first:
    python ring_reader.py --scan

    # Then run with your ring's address:
    python ring_reader.py --address XX:XX:XX:XX:XX:XX
"""

import argparse
import asyncio
import signal
import struct
import sys
from datetime import datetime

from bleak import BleakClient, BleakScanner

# BLE UUIDs (Nordic UART Service style)
SERVICE_UUID = "6e40fff0-b5a3-f393-e0a9-e50e24dcca9e"
WRITE_CHAR   = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR  = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

# Commands
CMD_SET_TIME        = 0x01
CMD_BATTERY         = 0x03
CMD_START_REALTIME  = 0x69
CMD_STOP_REALTIME   = 0x6A
CMD_REALTIME_DATA   = 0x1E

# Real-time reading types
READING_HEART_RATE = 1
READING_SPO2       = 3

# Real-time actions
ACTION_START = 1
ACTION_STOP  = 4

# Packet size
PACKET_LEN = 16


def make_packet(cmd: int, payload: bytes = b"") -> bytes:
    pkt = bytearray(PACKET_LEN)
    pkt[0] = cmd
    for i, b in enumerate(payload[:14]):
        pkt[1 + i] = b
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)


def verify_checksum(data: bytes) -> bool:
    if len(data) != PACKET_LEN:
        return False
    return data[15] == (sum(data[:15]) & 0xFF)

def mem_read_packet(address: int) -> bytes:
    payload = bytearray(2)
    payload[0] = 

def set_time_packet() -> bytes:
    """Sync current time to the ring (BCD encoded)."""
    now = datetime.utcnow()

    def bcd(n):
        return ((n // 10) << 4) | (n % 10)

    payload = bytearray(7)
    payload[0] = bcd(now.year % 100)
    payload[1] = bcd(now.month)
    payload[2] = bcd(now.day)
    payload[3] = bcd(now.hour)
    payload[4] = bcd(now.minute)
    payload[5] = bcd(now.second)
    payload[6] = 1  # language: english
    return make_packet(CMD_SET_TIME, payload)


class RingReader:
    def __init__(self):
        self.latest_hr = None
        self.latest_spo2 = None
        self.reading_done = asyncio.Event()
        self.current_reading = None

    def notification_handler(self, sender, data: bytearray):
        if len(data) != PACKET_LEN:
            return
        if not verify_checksum(data):
            return

        cmd = data[0] & 0x7F

        if cmd == CMD_BATTERY:
            print(f"  Battery: {data[1]}%")

        elif cmd == CMD_REALTIME_DATA:
            reading_type = data[1]
            value = data[2]

            if reading_type == READING_HEART_RATE and value > 0:
                self.latest_hr = value
                print(f"  HR: {value} bpm")
                if self.current_reading == "hr":
                    self.reading_done.set()

            elif reading_type == READING_SPO2 and value > 0:
                self.latest_spo2 = value
                print(f"  SpO2: {value}%")
                if self.current_reading == "spo2":
                    self.reading_done.set()

        elif cmd == CMD_START_REALTIME:
            # ack from ring
            pass

        elif cmd == 0x73:
            # device notify (unsolicited) — ignore
            pass

    async def read_once(self, client: BleakClient, reading_type: str,
                        reading_enum: int, timeout: float = 30.0):
        """Start a real-time reading and wait for a valid result."""
        self.current_reading = reading_type
        self.reading_done.clear()

        pkt = make_packet(CMD_START_REALTIME,
                          bytes([ACTION_START, reading_enum]))
        await client.write_gatt_char(WRITE_CHAR, pkt)

        try:
            await asyncio.wait_for(self.reading_done.wait(), timeout=timeout)
        except asyncio.TimeoutError:
            print(f"  {reading_type} timed out (ring may not be worn)")

        # stop the measurement
        stop_pkt = make_packet(CMD_START_REALTIME,
                               bytes([ACTION_STOP, reading_enum]))
        await client.write_gatt_char(WRITE_CHAR, stop_pkt)
        await asyncio.sleep(0.5)

    async def run(self, address: str, interval: int = 60):
        print(f"Connecting to {address}...")

        async with BleakClient(address, timeout=20.0) as client:
            print(f"Connected: {client.is_connected}")

            await client.write_gatt_char(WRITE_CHAR, )

            await client.start_notify(NOTIFY_CHAR, self.notification_handler)

            # sync time
            print("Syncing time...")
            await client.write_gatt_char(WRITE_CHAR, set_time_packet())
            await asyncio.sleep(1)

            # read battery
            print("Reading battery...")
            await client.write_gatt_char(WRITE_CHAR, make_packet(CMD_BATTERY))
            await asyncio.sleep(1)

            print(f"\nStarting readings every {interval}s. Ctrl+C to stop.\n")

            while True:
                ts = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
                print(f"[{ts}] Starting measurement...")

                # heart rate first
                await self.read_once(client, "hr", READING_HEART_RATE)
                await asyncio.sleep(2)

                # then SpO2
                await self.read_once(client, "spo2", READING_SPO2)

                print(f"  => HR={self.latest_hr or '?'} bpm, "
                      f"SpO2={self.latest_spo2 or '?'}%\n")

                # wait for next cycle
                await asyncio.sleep(interval)


async def scan():
    """Scan for nearby rings."""
    print("Scanning for rings (10s)...")
    devices = await BleakScanner.discover(timeout=10.0)

    rings = []
    for d in devices:
        name = d.name or ""
        if any(name.startswith(p) for p in
               ["R02", "R03", "R06", "R09", "R10", "R11", "R12",
                "COLMI", "Hello Ring", "RING1"]):
            rings.append(d)

    if not rings:
        print("No rings found. Make sure the ring is charged and not")
        print("connected to the QRing app or any other device.")
        return

    print(f"\nFound {len(rings)} ring(s):\n")
    print(f"  {'Name':<20s} {'Address':<20s} {'RSSI'}")
    print(f"  {'─'*20} {'─'*20} {'─'*6}")
    for d in rings:
        print(f"  {d.name or 'unknown':<20s} {d.address:<20s} {d.rssi} dBm")

    print(f"\nRun with:  python {sys.argv[0]} --address {rings[0].address}")


def main():
    parser = argparse.ArgumentParser(
        description="Read HR and SpO2 from Colmi smart ring")
    parser.add_argument("--scan", action="store_true",
                        help="Scan for nearby rings")
    parser.add_argument("--address", type=str,
                        help="Bluetooth address of the ring")
    parser.add_argument("--interval", type=int, default=60,
                        help="Seconds between readings (default: 60)")
    args = parser.parse_args()

    if args.scan:
        asyncio.run(scan())
        return

    if not args.address:
        print("Specify --address or use --scan to find your ring.")
        sys.exit(1)

    reader = RingReader()

    try:
        asyncio.run(reader.run(args.address, args.interval))
    except KeyboardInterrupt:
        print("\nStopped.")


if __name__ == "__main__":
    main()