#!/usr/bin/env python3
"""
colmi_display.py — drive the L0L display hook on a patched Colmi R11CR ring.

The custom firmware (ota_images/RT11CR_1.00.08_lolhook.bin) splices a hook into
display_send_frame (runtime 0x0083ab1c). On EVERY frame the ring is about to
push to its 5-digit 7-segment display, the hook checks a guard word in RAM:

    GUARD  @ 0x00206e00  (u32)  — hook is ACTIVE only when it == 0xA5A55A5A
    TEXT   @ 0x00206e04  (5 bytes) — the 5 segment patterns, left→right digit

When the guard matches, the hook overwrites the 5 digit columns with TEXT,
so whatever screen the firmware was drawing (time/steps/battery/…) shows your
text instead. When it doesn't match, the hook is transparent.

At boot the guard reads 0 (it lives in a zero-init RAM hole), so a freshly
flashed ring behaves 100% stock until you explicitly enable the hook here.
That's the safety gate: a buggy hook can never brick the boot path, because it
does nothing until you write the magic.

Both GUARD and TEXT are written live over BLE with the stock 0xBF mem-write
command — no reflash needed to change the text or toggle it on/off.

Examples:
    # show "L0L" (default) and enable the hook
    python colmi_display.py --address <mac>

    # show custom text (up to 5 chars, 7-seg alphabet), enable
    python colmi_display.py --address <mac> --text "HELLO"

    # raw segment bytes (5 bytes, bit0=a .. bit6=g, bit7=dot)
    python colmi_display.py --address <mac> --raw 38,3f,38,00,00

    # turn the hook off (restore stock display) without reflashing
    python colmi_display.py --address <mac> --off

    # read back the live guard + text (via stock 0xC0 mem-read)
    python colmi_display.py --address <mac> --status
"""

import argparse
import asyncio
import subprocess
import sys

SERVICE_UUID = "6e40fff0-b5a3-f393-e0a9-e50e24dcca9e"
WRITE_CHAR   = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR  = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

CMD_WRITE = 0xBF   # ble_cmd_mem_write: dest=msg[1..4] BE, len=msg[5]<=8, src=msg[6..]
CMD_READ  = 0xC0   # ble_cmd_mem_read : addr=msg[1..4] BE, len=msg[5..8] BE

# --- must match the hook baked into the firmware ---
GUARD_ADDR = 0x00206E00
MAGIC      = 0xA5A55A5A
TEXT_ADDR  = 0x00206E04
NUM_DIGITS = 5

# 7-segment font: bit0=a(top) 1=b(top-right) 2=c(bot-right) 3=d(bottom)
#                 4=e(bot-left) 5=f(top-left) 6=g(middle) 7=dp(dot)
SEGMENTS = {
    '0': 0x3F, '1': 0x06, '2': 0x5B, '3': 0x4F, '4': 0x66,
    '5': 0x6D, '6': 0x7D, '7': 0x07, '8': 0x7F, '9': 0x6F,
    'A': 0x77, 'b': 0x7C, 'C': 0x39, 'c': 0x58, 'd': 0x5E,
    'E': 0x79, 'F': 0x71, 'G': 0x3D, 'H': 0x76, 'h': 0x74,
    'I': 0x30, 'J': 0x1E, 'L': 0x38, 'n': 0x54, 'O': 0x3F,
    'o': 0x5C, 'P': 0x73, 'q': 0x67, 'r': 0x50, 'S': 0x6D,
    't': 0x78, 'U': 0x3E, 'u': 0x1C, 'y': 0x6E, 'Z': 0x5B,
    ' ': 0x00, '-': 0x40, '_': 0x08, '=': 0x48, '"': 0x22,
    "'": 0x20, '.': 0x80, '*': 0x63,
}


def make_packet(cmd: int, payload: bytes) -> bytes:
    pkt = bytearray(16)
    pkt[0] = cmd
    pkt[1:1 + len(payload[:14])] = payload[:14]
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)


def write_packet(addr: int, data: bytes) -> bytes:
    assert 1 <= len(data) <= 8
    return make_packet(CMD_WRITE, addr.to_bytes(4, "big") + bytes([len(data)]) + data)


def read_packet(addr: int, length: int) -> bytes:
    return make_packet(CMD_READ, addr.to_bytes(4, "big") + length.to_bytes(4, "big"))


def text_to_segments(text: str) -> bytes:
    """Left-aligned, blank-padded to NUM_DIGITS. Unknown chars → blank + warning."""
    cols = []
    for ch in text:
        if ch in SEGMENTS:
            cols.append(SEGMENTS[ch])
        elif ch.upper() in SEGMENTS:
            cols.append(SEGMENTS[ch.upper()])
        else:
            print(f"  [warn] '{ch}' has no 7-seg glyph; using blank", file=sys.stderr)
            cols.append(0x00)
    if len(cols) > NUM_DIGITS:
        print(f"  [warn] text longer than {NUM_DIGITS} digits; truncating", file=sys.stderr)
        cols = cols[:NUM_DIGITS]
    cols += [0x00] * (NUM_DIGITS - len(cols))
    return bytes(cols)


def parse_raw(s: str) -> bytes:
    vals = [int(x, 16) & 0xFF for x in s.replace(" ", "").split(",") if x]
    if not 1 <= len(vals) <= NUM_DIGITS:
        raise ValueError(f"--raw expects 1..{NUM_DIGITS} hex bytes")
    vals += [0x00] * (NUM_DIGITS - len(vals))
    return bytes(vals)


async def _connect_with_retry(address, attempts=12):
    from bleak import BleakClient
    for attempt in range(attempts):
        subprocess.run(["bluetoothctl", "disconnect", address],
                       capture_output=True, timeout=10)
        c = BleakClient(address, timeout=15.0)
        try:
            await c.connect()
            return c
        except Exception as e:
            print(f"  connect attempt {attempt+1}/{attempts} failed "
                  f"({type(e).__name__}); retrying…")
            await asyncio.sleep(1.0)
    return None


class Notifier:
    def __init__(self):
        self.q = asyncio.Queue()

    def on_notify(self, _char, data):
        d = bytes(data)
        if len(d) == 16 and d[0] == CMD_READ:
            self.q.put_nowait(d)


async def _read_mem(client, notf, addr, length, timeout=6.0):
    """Read up to 14 bytes via a single stock 0xC0 request."""
    while not notf.q.empty():
        notf.q.get_nowait()
    await client.write_gatt_char(WRITE_CHAR, read_packet(addr, length), response=False)
    got = bytearray()
    try:
        while len(got) < length:
            d = await asyncio.wait_for(notf.q.get(), timeout=timeout)
            take = min(14, length - len(got))
            got += d[1:1 + take]
    except asyncio.TimeoutError:
        pass
    return bytes(got[:length])


async def run(args):
    print(f"Connecting to {args.address} …")
    client = await _connect_with_retry(args.address)
    if not client:
        print("[FAIL] could not connect"); sys.exit(1)
    try:
        print(f"Connected: {client.is_connected}")

        if args.status:
            notf = Notifier()
            await client.start_notify(NOTIFY_CHAR, notf.on_notify)
            guard = await _read_mem(client, notf, GUARD_ADDR, 4)
            text  = await _read_mem(client, notf, TEXT_ADDR, NUM_DIGITS)
            await client.stop_notify(NOTIFY_CHAR)
            gval = int.from_bytes(guard, "little") if len(guard) == 4 else None
            active = gval == MAGIC
            print(f"  GUARD @0x{GUARD_ADDR:08X} = "
                  f"{('0x%08X' % gval) if gval is not None else '??'}  "
                  f"→ hook {'ACTIVE' if active else 'inactive'}")
            print(f"  TEXT  @0x{TEXT_ADDR:08X} = "
                  f"{' '.join('%02x' % b for b in text)}")
            return

        if args.off:
            # clear the guard → hook goes transparent, stock display returns
            await client.write_gatt_char(WRITE_CHAR,
                                         write_packet(GUARD_ADDR, b"\x00\x00\x00\x00"),
                                         response=False)
            print("  hook DISABLED (guard cleared) — display back to stock")
            return

        # enable path: write text first, THEN the magic (so we never enable
        # with a stale/blank buffer)
        if args.raw:
            segs = parse_raw(args.raw)
        else:
            segs = text_to_segments(args.text)
        print(f"  TEXT  = {' '.join('%02x' % b for b in segs)}"
              + (f"   ('{args.text}')" if not args.raw else ""))
        await client.write_gatt_char(WRITE_CHAR, write_packet(TEXT_ADDR, segs),
                                     response=False)
        await asyncio.sleep(0.1)
        await client.write_gatt_char(WRITE_CHAR,
                                     write_packet(GUARD_ADDR,
                                                  MAGIC.to_bytes(4, "little")),
                                     response=False)
        print(f"  GUARD = 0x{MAGIC:08X} → hook ACTIVE")
        print("  Wake the screen (button/gesture); the next frame shows your text.")
    finally:
        await asyncio.sleep(0.2)
        await client.disconnect()


def main():
    ap = argparse.ArgumentParser(
        description="Drive the L0L display hook on a patched Colmi R11CR ring",
        formatter_class=argparse.RawDescriptionHelpFormatter, epilog=__doc__)
    ap.add_argument("--address", required=True, help="ring BLE address")
    g = ap.add_mutually_exclusive_group()
    g.add_argument("--text", default="L0L", help="text to show (<=5 chars, 7-seg alphabet)")
    g.add_argument("--raw", help="5 raw segment bytes, comma-separated hex (e.g. 38,3f,38,00,00)")
    ap.add_argument("--off", action="store_true", help="disable the hook (restore stock display)")
    ap.add_argument("--status", action="store_true", help="read back live guard + text")
    asyncio.run(run(ap.parse_args()))


if __name__ == "__main__":
    main()
