#!/usr/bin/env python3
"""
Colmi R12 memory read/write over BLE — via the custom firmware hook.

Our patched firmware hooks primary-channel cmd 0x37 (CMD_PRESSURE / stress-for-day,
FUN_0082b6b6) and adds subcommand 0xFE: a 32-bit memory read/write primitive
(see mem-rw-hook). NOTE: originally hooked 0x39, but raw BLE 0x39 is never dispatched
(internal-only); 0x37 is the BLE-reachable twin, so the hook was re-targeted to it.

Request packet (16 bytes, primary channel, checksum = sum(bytes[0:15]) & 0xFF):
    [0]=0x37  [1]=0xFE  [2]=op(1=read32,2=write32)  [3..6]=addr (BIG-endian)
    [7..10]=value (BIG-endian, write only)
Read response:  [0]=0x37 [1]=0x01 [3..6]=value (BIG-endian) [15]=checksum
Write response: [0]=0x37 [1]=0x02

Usage:
    python colmi_mem.py --address <mac> --verify
    python colmi_mem.py --address <mac> --read 0x00848052
    python colmi_mem.py --address <mac> --write 0x20000000 0xDEADBEEF
"""

import argparse
import asyncio
import sys

SERVICE_UUID = "6e40fff0-b5a3-f393-e0a9-e50e24dcca9e"
WRITE_CHAR   = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR  = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

CMD   = 0x37   # hooked command (BLE-reachable stress-for-day handler)
MAGIC = 0xFE
OP_READ, OP_WRITE = 1, 2

# Known ground-truth words (little-endian memory) for --verify. Addresses are RUNTIME
# addresses. IMPORTANT: runtime = Ghidra-address + 0x400 (the 0x400 Realtek image
# descriptor sits at the bank base 0x826000, so the payload/code starts at 0x826400).
#   0x826400 = payload vector table (Ghidra 0x826000) -> u32 0x47004800
#   0x82BAB8 = our in-place hook's own bytes (Ghidra 0x82B6B8: ldrb r1,[r0,#1]; cmp #0xfe)
#              -> u32 0x29FE7841  (the hook reading itself back = proof it's live)
KNOWN = {0x00826400: 0x47004800, 0x0082BAB8: 0x29FE7841}


def make_packet(cmd: int, payload: bytes) -> bytes:
    pkt = bytearray(16)
    pkt[0] = cmd
    pkt[1:1 + len(payload[:14])] = payload[:14]
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)


def read_packet(addr: int) -> bytes:
    return make_packet(CMD, bytes([MAGIC, OP_READ]) + addr.to_bytes(4, "big"))


def write_packet(addr: int, value: int) -> bytes:
    return make_packet(CMD, bytes([MAGIC, OP_WRITE]) + addr.to_bytes(4, "big")
                        + value.to_bytes(4, "big"))


class MemClient:
    def __init__(self):
        self.resp = asyncio.Queue()

    def on_notify(self, _char, data: bytearray):
        d = bytes(data)
        if len(d) == 16 and (d[0] & 0x7F) == CMD:
            self.resp.put_nowait(d)

    async def _txn(self, client, pkt, timeout=6.0):
        while not self.resp.empty():
            self.resp.get_nowait()
        await client.write_gatt_char(WRITE_CHAR, pkt, response=False)
        return await asyncio.wait_for(self.resp.get(), timeout=timeout)

    async def read32(self, client, addr):
        r = await self._txn(client, read_packet(addr))
        return int.from_bytes(r[3:7], "big"), r

    async def write32(self, client, addr, value):
        r = await self._txn(client, write_packet(addr, value))
        return r


def _request_fast_connection_interval(address, min_units=6, max_units=6, latency=0, timeout_units=500):
    """Ask the controller for a short LE connection interval (default 6*1.25ms=7.5ms).

    The ring requests a slow power-saving interval right after connecting (observed
    ~625ms, i.e. 1.6 reads/sec even with a tight request/response loop) and BlueZ just
    accepts it. hcitool lecup issues a raw HCI_LE_Connection_Update_Command to override
    it. Requires cap_net_admin,cap_net_raw on /usr/bin/hcitool (setcap, one-time, see
    [[ghidra-thumb-jumptable-technique]]-adjacent mem-rw-hook notes) — without it this
    just prints a warning and the transfer stays slow but correct.
    """
    import subprocess
    try:
        con = subprocess.run(["hcitool", "con"], capture_output=True, text=True, timeout=5)
    except Exception as e:
        print(f"  [interval] hcitool con failed: {e}")
        return
    handle = None
    for line in con.stdout.splitlines():
        if "LE" in line and address.lower() in line.lower():
            for tok_i, tok in enumerate(line.split()):
                if tok == "handle" and tok_i + 1 < len(line.split()):
                    handle = int(line.split()[tok_i + 1])
                    break
            break
    if handle is None:
        # fall back to the sole LE connection, in case the address is an RPA mismatch
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
    import subprocess
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


async def run(address, action):
    mc = MemClient()
    print(f"Connecting to {address} …")
    client = await _connect_with_retry(address)
    if client is None:
        print("[FAIL] could not connect (BlueZ auto-connect race)"); sys.exit(1)
    try:
        print(f"Connected: {client.is_connected}")
        _request_fast_connection_interval(address)
        await client.start_notify(NOTIFY_CHAR, mc.on_notify)
        await asyncio.sleep(0.5)

        if action[0] == "verify":
            print("\nVerifying the hook is live (reading known addresses)…")
            ok = True
            for addr, expected in KNOWN.items():
                try:
                    val, raw = await mc.read32(client, addr)
                except asyncio.TimeoutError:
                    print(f"  0x{addr:08X}: NO RESPONSE — hook not answering")
                    ok = False
                    continue
                mark = "✓" if val == expected else "✗"
                if val != expected:
                    ok = False
                print(f"  0x{addr:08X}: read 0x{val:08X}  expect 0x{expected:08X}  {mark}"
                      f"   [{raw.hex()}]")
            print()
            if ok:
                print("*** HOOK IS LIVE — the ring is running our patched firmware. ***")
            else:
                print("!!! Reads did not match — check the RUNTIME addresses (runtime = Ghidra + 0x400).")
            sys.exit(0 if ok else 2)

        elif action[0] == "read":
            addr = action[1]
            val, raw = await mc.read32(client, addr)
            print(f"[0x{addr:08X}] = 0x{val:08X}   (raw {raw.hex()})")

        elif action[0] == "write":
            addr, value = action[1], action[2]
            raw = await mc.write32(client, addr, value)
            status = raw[1]
            print(f"write 0x{value:08X} -> [0x{addr:08X}]: response [1]={status} "
                  f"({'ack' if status == OP_WRITE else '?'})   (raw {raw.hex()})")
    finally:
        try:
            await client.disconnect()
        except Exception:
            pass


def auto_int(s):
    return int(s, 0)


def main():
    ap = argparse.ArgumentParser(description="Colmi R12 memory access via firmware hook")
    ap.add_argument("--address", required=True, help="ring BLE address")
    g = ap.add_mutually_exclusive_group(required=True)
    g.add_argument("--verify", action="store_true", help="check the hook is live")
    g.add_argument("--read", type=auto_int, metavar="ADDR", help="read a 32-bit word")
    g.add_argument("--write", nargs=2, type=auto_int, metavar=("ADDR", "VALUE"),
                   help="write a 32-bit word")
    args = ap.parse_args()

    if args.verify:
        action = ("verify",)
    elif args.read is not None:
        action = ("read", args.read)
    else:
        action = ("write", args.write[0], args.write[1])

    asyncio.run(run(args.address, action))


if __name__ == "__main__":
    main()
