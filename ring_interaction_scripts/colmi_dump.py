#!/usr/bin/env python3
"""
Colmi R12 memory-region dumper — reads a range of device memory over BLE and
writes it to a file. Two back-ends (``--method``):

  hook   (default) — our custom firmware hook (cmd 0x37 / subcmd 0xFE, 32-bit
                     reads). One 32-bit word per BLE round-trip. Requires the
                     patched firmware to be running (see mem-rw-hook). Same
                     read primitive as colmi_mem.py.

  native           — the STOCK firmware's built-in cmd 0xC0 (ble_cmd_mem_read):
                     an unauthenticated arbitrary-memory read that returns up to
                     512 bytes per request, streamed back as ~14-byte BLE
                     notification fragments. No custom firmware needed and much
                     faster (one request covers 512 bytes vs. one word). Byte-
                     addressed, so NO alignment requirement.

ADDRESSES ARE RUNTIME addresses (what the CPU sees). For firmware/payload that
Ghidra loaded at 0x826000, runtime = Ghidra-address + 0x400. ROM is at its own
fixed address and needs no rebasing.

Examples:
    # native (stock 0xC0) dump of 64 KiB of ROM starting at 0x00000000
    python colmi_dump.py --address <mac> --method native \
        --start 0x00000000 --length 0x10000 --out rom.bin

    # hook dump of the whole active app bank image (descriptor + payload)
    python colmi_dump.py --address <mac> --method hook \
        --start 0x00826000 --length 0x22800 --out bank.bin
"""

import argparse
import asyncio
import subprocess
import sys
import time

SERVICE_UUID = "6e40fff0-b5a3-f393-e0a9-e50e24dcca9e"
WRITE_CHAR   = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR  = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

# ---- hook back-end (custom firmware) ----
CMD     = 0x37   # hooked command (BLE-reachable stress-for-day handler)
MAGIC   = 0xFE
OP_READ = 1

# ---- native back-end (stock firmware ble_cmd_mem_read, cmd 0xC0) ----
CMD_NATIVE   = 0xC0     # ble_cmd_mem_read: addr=msg[1..4] BE, len=msg[5..8] BE
MAX_CHUNK    = 0x200    # firmware caps a single 0xC0 read at 512 bytes/request
PKT_PAYLOAD  = 14       # data bytes per response fragment ([0]=cmd, [15]=checksum)


def make_packet(cmd: int, payload: bytes) -> bytes:
    pkt = bytearray(16)
    pkt[0] = cmd
    pkt[1:1 + len(payload[:14])] = payload[:14]
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)


def read_packet(addr: int) -> bytes:
    return make_packet(CMD, bytes([MAGIC, OP_READ]) + addr.to_bytes(4, "big"))


def native_read_packet(addr: int, length: int) -> bytes:
    """0xC0 request: [1..4]=addr (big-endian), [5..8]=len (big-endian)."""
    return make_packet(CMD_NATIVE, addr.to_bytes(4, "big") + length.to_bytes(4, "big"))


class Reader:
    """Hook back-end: one 32-bit word per request."""

    def __init__(self):
        self.resp = asyncio.Queue()

    def on_notify(self, _char, data: bytearray):
        d = bytes(data)
        if len(d) == 16 and (d[0] & 0x7F) == CMD:
            self.resp.put_nowait(d)

    async def read32(self, client, addr, timeout=6.0, retries=4):
        """Return the 32-bit word at addr, or None if it never answered."""
        for _ in range(retries):
            while not self.resp.empty():
                self.resp.get_nowait()
            try:
                await client.write_gatt_char(WRITE_CHAR, read_packet(addr), response=False)
                r = await asyncio.wait_for(self.resp.get(), timeout=timeout)
                return int.from_bytes(r[3:7], "big")
            except (asyncio.TimeoutError, Exception):
                await asyncio.sleep(0.2)
        return None


class NativeReader:
    """Native back-end: stock cmd 0xC0, up to 512 bytes per request.

    The firmware streams the reply as 16-byte notifications with no per-packet
    sequence header — [0]=0xC0, [1..14]=up to 14 payload bytes, [15]=checksum.
    BLE notifications on a single connection arrive in order, so we just collect
    ceil(len/14) fragments and concatenate. Any shortfall (a lost fragment →
    timeout waiting for the last one) retries the whole chunk, which keeps the
    stream re-aligned.
    """

    def __init__(self):
        self.pkts = asyncio.Queue()

    def on_notify(self, _char, data: bytearray):
        d = bytes(data)
        if len(d) == 16 and d[0] == CMD_NATIVE:
            self.pkts.put_nowait(d)

    async def read_chunk(self, client, addr, length, timeout=6.0, retries=5):
        """Return `length` bytes at addr (length <= MAX_CHUNK), or None."""
        npkts = (length + PKT_PAYLOAD - 1) // PKT_PAYLOAD
        for _ in range(retries):
            while not self.pkts.empty():
                self.pkts.get_nowait()
            try:
                await client.write_gatt_char(
                    WRITE_CHAR, native_read_packet(addr, length), response=False)
                buf = bytearray()
                for i in range(npkts):
                    d = await asyncio.wait_for(self.pkts.get(), timeout=timeout)
                    take = min(PKT_PAYLOAD, length - i * PKT_PAYLOAD)
                    buf += d[1:1 + take]
                if len(buf) == length:
                    return bytes(buf)
            except (asyncio.TimeoutError, Exception):
                await asyncio.sleep(0.2)
        return None


def _request_fast_connection_interval(address, min_units=6, max_units=6, latency=0, timeout_units=500):
    """Ask the controller for a short LE connection interval (default 6*1.25ms=7.5ms).

    The ring requests a slow power-saving interval right after connecting and BlueZ
    just accepts it; hcitool lecup issues a raw HCI_LE_Connection_Update_Command to
    override it. Requires cap_net_admin,cap_net_raw on /usr/bin/hcitool (one-time
    setcap) — without it this just warns and the transfer stays slow but correct.
    """
    try:
        con = subprocess.run(["hcitool", "con"], capture_output=True, text=True, timeout=5)
    except Exception as e:
        print(f"  [interval] hcitool con failed: {e}")
        return
    handle = None
    for line in con.stdout.splitlines():
        if "LE" in line and address.lower() in line.lower():
            parts = line.split()
            if "handle" in parts:
                handle = int(parts[parts.index("handle") + 1])
            break
    if handle is None:
        le_lines = [l for l in con.stdout.splitlines() if "LE" in l]
        if len(le_lines) == 1:
            parts = le_lines[0].split()
            if "handle" in parts:
                handle = int(parts[parts.index("handle") + 1])
    if handle is None:
        print("  [interval] could not find connection handle; skipping interval speedup")
        return
    try:
        r = subprocess.run(
            ["hcitool", "lecup", f"--handle=0x{handle:04x}",
             f"--min={min_units}", f"--max={max_units}",
             f"--latency={latency}", f"--timeout={timeout_units}"],
            capture_output=True, text=True, timeout=5)
        if r.returncode == 0 and "Could not" not in r.stdout:
            print(f"  [interval] requested {min_units*1.25:.1f}-{max_units*1.25:.1f}ms interval on handle 0x{handle:04x}")
        else:
            print(f"  [interval] lecup failed ({r.stdout.strip() or r.stderr.strip()}) — "
                  f"run: sudo setcap 'cap_net_admin,cap_net_raw+eip' /usr/bin/hcitool")
    except Exception as e:
        print(f"  [interval] hcitool lecup failed: {e}")


async def _connect_with_retry(address, attempts=12):
    """BlueZ auto-connects to the paired ring; force a disconnect + settle before
    each try so a fresh connect can win the race."""
    from bleak import BleakClient
    for attempt in range(attempts):
        subprocess.run(["bluetoothctl", "disconnect", address], capture_output=True, timeout=10)
        await asyncio.sleep(1.5)
        c = BleakClient(address, timeout=15.0)
        try:
            await c.connect()
            return c
        except Exception as e:
            print(f"  connect attempt {attempt+1}/{attempts} failed ({type(e).__name__}); retrying…")
            await asyncio.sleep(0.5)
    return None


async def _run_hook(client, start, length, out_path):
    if start & 3:
        print(f"[FAIL] start 0x{start:08X} is not 4-byte aligned (hook reads 32-bit words)")
        sys.exit(1)
    length = (length + 3) & ~3          # round up to whole words
    nwords = length // 4

    rd = Reader()
    await client.start_notify(NOTIFY_CHAR, rd.on_notify)
    await asyncio.sleep(0.5)

    holes = []
    print(f"[hook] Dumping 0x{length:X} bytes ({nwords} words) from 0x{start:08X} → {out_path}")
    t0 = time.time()
    with open(out_path, "wb") as f:
        for i in range(nwords):
            addr = start + i * 4
            if not client.is_connected:
                print(f"\n[FAIL] link dropped at 0x{addr:08X} — ring may have crashed")
                sys.exit(3)
            val = await rd.read32(client, addr)
            if val is None:
                holes.append(addr)
                f.write(b"\xFF\xFF\xFF\xFF")   # placeholder for unreadable word
            else:
                f.write(val.to_bytes(4, "little"))
            if i % 64 == 0 or i == nwords - 1:
                done = i + 1
                rate = done / max(time.time() - t0, 1e-6)
                eta = (nwords - done) / max(rate, 1e-6)
                print(f"\r  0x{addr:08X}  {done}/{nwords} words "
                      f"({100*done/nwords:5.1f}%)  {rate:5.1f} w/s  ETA {eta:5.0f}s  "
                      f"holes={len(holes)}   ", end="", flush=True)
                f.flush()
    print()
    return length, [(h, 4) for h in holes]


async def _run_native(client, start, length, out_path):
    rd = NativeReader()
    await client.start_notify(NOTIFY_CHAR, rd.on_notify)
    await asyncio.sleep(0.5)

    holes = []          # list of (addr, len) chunks that never fully answered
    nchunks = (length + MAX_CHUNK - 1) // MAX_CHUNK
    print(f"[native 0xC0] Dumping 0x{length:X} bytes ({nchunks} chunks of "
          f"≤{MAX_CHUNK}) from 0x{start:08X} → {out_path}")
    t0 = time.time()
    with open(out_path, "wb") as f:
        off = 0
        chunk_i = 0
        while off < length:
            addr = start + off
            n = min(MAX_CHUNK, length - off)
            if not client.is_connected:
                print(f"\n[FAIL] link dropped at 0x{addr:08X} — ring may have crashed")
                sys.exit(3)
            data = await rd.read_chunk(client, addr, n)
            if data is None:
                holes.append((addr, n))
                f.write(b"\xFF" * n)        # placeholder for the unreadable chunk
            else:
                f.write(data)
            off += n
            chunk_i += 1
            done = off
            rate = done / max(time.time() - t0, 1e-6)
            eta = (length - done) / max(rate, 1e-6)
            print(f"\r  0x{addr:08X}  {done}/{length} bytes "
                  f"({100*done/length:5.1f}%)  {rate/1024:6.2f} KiB/s  ETA {eta:5.0f}s  "
                  f"holes={len(holes)}   ", end="", flush=True)
            f.flush()
    print()
    return length, holes


async def run(address, method, start, length, out_path):
    print(f"Connecting to {address} …")
    client = await _connect_with_retry(address)
    if client is None:
        print("[FAIL] could not connect (BlueZ auto-connect race)"); sys.exit(1)

    try:
        print(f"Connected: {client.is_connected}")
        _request_fast_connection_interval(address)
        if method == "native":
            written, holes = await _run_native(client, start, length, out_path)
        else:
            written, holes = await _run_hook(client, start, length, out_path)
    finally:
        try:
            await client.disconnect()
        except Exception:
            pass

    print(f"\nWrote {written} bytes to {out_path}")
    if holes:
        total = sum(n for _, n in holes)
        print(f"WARNING: {len(holes)} region(s) ({total} bytes) never fully answered "
              f"and are 0xFF placeholders:")
        for a, n in holes[:16]:
            print(f"    0x{a:08X} +0x{n:X}")
        if len(holes) > 16:
            print(f"    … and {len(holes)-16} more")


def auto_int(s):
    return int(s, 0)


def main():
    ap = argparse.ArgumentParser(description="Dump a Colmi R12 memory region to a file over BLE")
    ap.add_argument("--address", required=True, help="ring BLE address")
    ap.add_argument("--method", choices=("hook", "native"), default="hook",
                    help="hook = custom 0x37/0xFE firmware hook (default); "
                         "native = stock 0xC0 ble_cmd_mem_read (faster, no patch needed)")
    ap.add_argument("--start", type=auto_int, required=True,
                    help="start address (runtime; word-aligned for hook, any for native)")
    ap.add_argument("--length", type=auto_int, required=True, help="number of bytes to read")
    ap.add_argument("--out", required=True, help="output file path")
    args = ap.parse_args()
    asyncio.run(run(args.address, args.method, args.start, args.length, args.out))


if __name__ == "__main__":
    main()
