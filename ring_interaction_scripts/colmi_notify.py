#!/usr/bin/env python3
"""
Colmi R11CR — push a notification to the ring's 5-digit 7-segment display over BLE.

WHAT ACTUALLY PAINTS THE SCREEN (traced in Ghidra):
    cmd 0x18 (ble_cmd_push_notification @0x82bd5c) is the real "show a
    notification" command. It stores a category byte + name/text, then calls
    FUN_0082d368 -> FUN_0082cf98, which formats the name into a string and posts
    it to the display SCROLL engine (events 0x261/0x262/0x222, text buffer
    @0x208525). A notification on this ring is therefore SCROLLING TEXT (the
    sender/app name) marching across the 5 digits — that IS the "animation".

    cmd 0x04 (FUN_0082b306) does NOT paint anything — it only arms notification
    state (g_bNotifyDisplayMode / icon id / per-device timing). That's why
    firing 0x04 alone showed nothing on screen. It's kept here as --arm for the
    curious (mode 2 = the "known device" icon path gated behind the hardcoded
    phone-model table @0x846244), but 0x18 is what you want.

cmd 0x18 packet (16 bytes, primary channel, checksum = sum(bytes[0:15]) & 0xFF):
    [0]=0x18
    [1]=category  (2 = default; firmware maps category 2/0x12/0x22/0x32 -> tag
                   0xA5/0xA4/0xA3/0xA2 = app/sms/call/etc.)
    [2]=len       (1..12 = number of text bytes that follow; must be < 13 so it
                   fits the single-packet short path)
    [3..]=text    ASCII, up to 12 bytes. 7-seg can only render 0-9 and 7-seg-able
                   letters (A b C d E F H L P U o r t n S y ...), so prefer those.
    [15]=checksum

NOTE: the ring's screen must be able to come up for you to see it — wear it /
keep it raised while firing. If nothing shows from full sleep, raise-to-wake
right after sending.

Usage:
    python colmi_notify.py --address <mac> --text HELLO
    python colmi_notify.py --address <mac> --text CALL --category 0x22
    python colmi_notify.py --address <mac> --demo
    python colmi_notify.py --address <mac> --text S10 --arm SM-G975U   # arm mode-2 icon, then show
"""

import argparse
import asyncio
import subprocess
import sys

WRITE_CHAR  = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

CMD_PUSH_NOTIFY = 0x18   # ble_cmd_push_notification — actually shows scrolling text
CMD_NOTIFY_ARM  = 0x04   # FUN_0082b306 — arms icon/mode state only (no paint)

# The five hardcoded model keys from the firmware table @ 0x846244 (used by --arm).
MODELS = {
    "DUK-AL20": "Honor V9 / 8 Pro",
    "VOG-AL00": "Huawei P30 Pro",
    "SM-G975U": "Samsung Galaxy S10+",
    "SM-N970U": "Samsung Galaxy Note10",
    "CLT-AL00": "Huawei P20 Pro",
}


def make_packet(cmd: int, payload: bytes) -> bytes:
    pkt = bytearray(16)
    pkt[0] = cmd
    pkt[1:1 + len(payload[:14])] = payload[:14]
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)


def push_packet(category: int, text: str) -> bytes:
    body = text.encode("latin-1", "ignore")[:12]
    return make_packet(CMD_PUSH_NOTIFY, bytes([category & 0xFF, len(body)]) + body)


def arm_packet(mode: int, submode: int, key: str) -> bytes:
    kb = key.encode("latin-1", "ignore")[:12].ljust(12, b"\x00")
    return make_packet(CMD_NOTIFY_ARM, bytes([mode, submode]) + kb)


class NotifyClient:
    def __init__(self):
        self.rx = asyncio.Queue()

    def on_notify(self, _char, data: bytearray):
        self.rx.put_nowait(bytes(data))

    async def drain(self, seconds: float):
        try:
            while True:
                d = await asyncio.wait_for(self.rx.get(), timeout=seconds)
                print(f"    <- {d.hex()}" + (f"   (cmd 0x{d[0]:02x})" if d else ""))
        except asyncio.TimeoutError:
            pass


async def _connect_with_retry(address, attempts=12):
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


async def send(nc, client, pkt, label, listen=2.0):
    print(f"  -> {pkt.hex()}   [{label}]")
    await client.write_gatt_char(WRITE_CHAR, pkt, response=False)
    await nc.drain(listen)


# ---- native 0xC0 read, used to watch the notification-display gate flag ----
CMD_MEM_READ = 0xC0
NOTIFY_GATE_ADDR = 0x002002DC   # bit0 = "display/GUI active"; gates the notification window


def mem_read_packet(addr: int, length: int) -> bytes:
    return make_packet(CMD_MEM_READ, addr.to_bytes(4, "big") + length.to_bytes(4, "big"))


async def read_bytes(nc, client, addr, length, timeout=4.0):
    while not nc.rx.empty():
        nc.rx.get_nowait()
    await client.write_gatt_char(WRITE_CHAR, mem_read_packet(addr, length), response=False)
    npkts = (length + 13) // 14
    buf = bytearray()
    try:
        for i in range(npkts):
            while True:
                d = await asyncio.wait_for(nc.rx.get(), timeout=timeout)
                if d and d[0] == CMD_MEM_READ:
                    break
            take = min(14, length - i * 14)
            buf += d[1:1 + take]
    except asyncio.TimeoutError:
        return None
    return bytes(buf)


async def run_gate(address, seconds):
    """Poll the notification-display gate flag while you raise/wake the ring."""
    nc = NotifyClient()
    print(f"Connecting to {address} …")
    client = await _connect_with_retry(address)
    if client is None:
        print("[FAIL] could not connect"); sys.exit(1)
    try:
        await client.start_notify(NOTIFY_CHAR, nc.on_notify)
        await asyncio.sleep(0.5)
        print(f"Polling gate byte @0x{NOTIFY_GATE_ADDR:08X} (bit0 = display active) for {seconds}s.")
        print("Raise/tap the ring to wake the screen and watch bit0 flip.\n")
        import time as _t
        t0 = _t.time()
        last = None
        while _t.time() - t0 < seconds:
            b = await read_bytes(nc, client, NOTIFY_GATE_ADDR, 1)
            if b is not None:
                v = b[0]
                mark = "  <-- screen/GUI ACTIVE" if (v & 1) else ""
                line = f"  0x{NOTIFY_GATE_ADDR:08X} = 0x{v:02X}  bit0={v & 1}{mark}"
                if line != last:
                    print(line); last = line
            await asyncio.sleep(0.25)
    finally:
        try:
            await client.disconnect()
        except Exception:
            pass


async def run_spam(address, category, text, seconds, interval):
    """Repeatedly push a notification so one lands while the screen is awake."""
    nc = NotifyClient()
    print(f"Connecting to {address} …")
    client = await _connect_with_retry(address)
    if client is None:
        print("[FAIL] could not connect"); sys.exit(1)
    try:
        await client.start_notify(NOTIFY_CHAR, nc.on_notify)
        await asyncio.sleep(0.5)
        pkt = push_packet(category, text)
        print(f"Spamming notify {text!r} every {interval}s for {seconds}s.")
        print("KEEP THE SCREEN AWAKE (raise/tap repeatedly) so a send lands while bit0=1.\n")
        import time as _t
        t0 = _t.time()
        n = 0
        while _t.time() - t0 < seconds:
            await client.write_gatt_char(WRITE_CHAR, pkt, response=False)
            n += 1
            await asyncio.sleep(interval)
        print(f"\nSent {n} notifications.")
    finally:
        try:
            await client.disconnect()
        except Exception:
            pass


async def run(address, actions, hold):
    nc = NotifyClient()
    print(f"Connecting to {address} …")
    client = await _connect_with_retry(address)
    if client is None:
        print("[FAIL] could not connect (BlueZ auto-connect race)"); sys.exit(1)
    try:
        print(f"Connected: {client.is_connected}")
        await client.start_notify(NOTIFY_CHAR, nc.on_notify)
        await asyncio.sleep(0.5)
        print("\nWatch the ring's screen now (wear/raise it so the display can wake).\n")
        for pkt, label, delay in actions:
            await send(nc, client, pkt, label)
            await asyncio.sleep(hold if delay is None else delay)
    finally:
        try:
            await client.disconnect()
        except Exception:
            pass


def build_actions(args):
    acts = []
    if args.demo:
        # Cycle through each known device model: ARM it (0x04 mode 2 + model key),
        # then immediately push a notification (0x18). This tests whether the
        # notification only displays once a KNOWN device is armed. A distinct
        # 7-seg-friendly token per model tells you which iteration is on screen.
        # Ends with an UNKNOWN-model control (should NOT match the table).
        tokens = {"DUK-AL20": "1", "VOG-AL00": "2", "SM-G975U": "3",
                  "SM-N970U": "4", "CLT-AL00": "5"}
        steps = [(m, tokens[m]) for m in MODELS] + [("NOPE-0000", "0")]
        for model, tok in steps:
            desc = MODELS.get(model, "UNKNOWN / control")
            acts.append((arm_packet(2, 1, model), f"arm mode-2 device={model} ({desc})", 0.6))
            acts.append((push_packet(args.category, tok),
                         f"  notify {tok!r} under device={model}", None))
        return acts
    if args.arm:
        acts.append((arm_packet(2, 1, args.arm),
                     f"arm mode-2 icon ({MODELS.get(args.arm, 'custom')})", 0.6))
    if args.icon_only:
        # just the arm poke, nothing else (old behavior for experimentation)
        if not args.arm:
            acts.append((arm_packet(args.mode, args.submode, args.model),
                         f"arm only ({MODELS.get(args.model, 'custom')})", None))
        return acts
    acts.append((push_packet(args.category, args.text),
                 f"notify cat=0x{args.category:02x} {args.text!r}", None))
    return acts


def auto_int(s):
    return int(s, 0)


def main():
    ap = argparse.ArgumentParser(
        description="Push a notification (scrolling text) to the Colmi R11CR 7-seg display")
    ap.add_argument("--address", required=True, help="ring BLE address")
    ap.add_argument("--text", default="HELLO", help="notification text, <=12 chars (default HELLO)")
    ap.add_argument("--category", type=auto_int, default=0x02,
                    help="cmd 0x18 category byte (2/0x12/0x22/0x32; default 2)")
    ap.add_argument("--demo", action="store_true",
                    help="send several notifications with different text/categories")
    ap.add_argument("--arm", metavar="MODEL",
                    help=f"first arm the mode-2 icon path with a known model key ({', '.join(MODELS)}), then show --text")
    ap.add_argument("--icon-only", action="store_true",
                    help="ONLY send the 0x04 arm poke (no 0x18) — for state experimentation")
    ap.add_argument("--model", default="SM-G975U", help="model key for --icon-only (default SM-G975U)")
    ap.add_argument("--mode", type=auto_int, default=2, help="mode byte for --icon-only (default 2)")
    ap.add_argument("--submode", type=auto_int, default=1, help="submode byte for --icon-only (default 1)")
    ap.add_argument("--hold", type=float, default=3.0,
                    help="seconds to wait between/after packets so you can watch (default 3)")
    ap.add_argument("--gate", type=float, metavar="SECONDS", nargs="?", const=15.0,
                    help="poll the notification gate flag @0x2002dc while you wake the ring (default 15s)")
    ap.add_argument("--spam", type=float, metavar="SECONDS", nargs="?", const=15.0,
                    help="repeatedly push --text so one lands while the screen is awake (default 15s)")
    ap.add_argument("--interval", type=float, default=0.5,
                    help="seconds between --spam sends (default 0.5)")
    args = ap.parse_args()

    if args.gate is not None:
        asyncio.run(run_gate(args.address, args.gate))
    elif args.spam is not None:
        asyncio.run(run_spam(args.address, args.category, args.text, args.spam, args.interval))
    else:
        asyncio.run(run(args.address, build_actions(args), args.hold))


if __name__ == "__main__":
    main()
