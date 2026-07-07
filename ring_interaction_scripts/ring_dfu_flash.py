#!/usr/bin/env python3
"""
Colmi R12 (RTL8762C) BLE DFU / OTA flasher.

Speaks the QRing serial-port DFU protocol on the secondary channel
(service de5bf728-...). Protocol decoded from the QRing app's DfuHandle.java
and cross-checked byte-for-byte against atc1441's ATC_RF03_Writer.html — both
agree exactly.

Frame (addHeader):
    [0]=0xBC  [1]=cmd  [2..3]=payload_len (LE u16)  [4..5]=CRC16(payload) (LE)
    [6..]=payload            # no payload -> len=0, crc bytes = 0xFF 0xFF
CRC16 = CRC-16/MODBUS (init 0xFFFF, poly 0xA001).  ALL multi-byte fields LE.

Commands:  1=start  2=init  3=data  4=check  5=end/release
    init payload : 01 | file_len(LE u32) | crc16(whole file)(LE) | checksum16(whole file)(LE)
    data payload : (block_index+1)(LE u16, 1-based) | up to 1024 bytes at block*1024
State machine (ACK-driven, response status at frame byte 6, 0 = OK):
    start ->(ack1) init ->(ack2) data(block0) -> each data-ack sends next block
          -> after last block: check ->(ack4) end -> ring reboots/disconnects

The "firmware" file is the COMPLETE OTA image (0x50 outer + 0x400 desc + payload),
e.g. ota_images/RT11CR_1.00.08_hookrw.bin. checksums are over the whole file.

Usage:
    python ring_dfu_flash.py --file OTA.bin --dry-run          # offline; print every frame
    python ring_dfu_flash.py --scan
    python ring_dfu_flash.py --file OTA.bin --address XX:XX:.. # REAL flash (irreversible!)
"""

import argparse
import asyncio
import sys

# ---- BLE UUIDs (secondary "serial port" service) ----
SERVICE_UUID = "de5bf728-d711-4e47-af26-65e3012a5dc7"
WRITE_CHAR   = "de5bf72a-d711-4e47-af26-65e3012a5dc7"   # write (no response)
NOTIFY_CHAR  = "de5bf729-d711-4e47-af26-65e3012a5dc7"

MAGIC        = 0xBC
BLOCK_SIZE   = 0x400        # 1024-byte "big pocket"
BLE_CHUNK    = 200          # bytes per BLE write (matches ATC writer)
MAX_OTA_SIZE = 12288000     # checkFile() hard limit in the app

CMD_START, CMD_INIT, CMD_DATA, CMD_CHECK, CMD_END = 1, 2, 3, 4, 5

# DfuHandle response status codes (frame byte 6)
RSP = {0: "OK", 1: "DATA_SIZE", 2: "DATA_CONTENT", 3: "CMD_STATUS",
       4: "CMD_FORMAT", 5: "INNER", 6: "LOW_BATTERY"}


def crc16_modbus(data: bytes) -> int:
    crc = 0xFFFF
    if not data:
        return crc
    for b in data:
        crc ^= b
        for _ in range(8):
            crc = (crc >> 1) ^ 0xA001 if (crc & 1) else (crc >> 1)
    return crc & 0xFFFF


def checksum16(data: bytes) -> int:
    return sum(data) & 0xFFFF


def add_header(cmd: int, payload: bytes | None) -> bytes:
    """Wrap a payload in the BC frame (little-endian len + CRC)."""
    if payload:
        n = len(payload)
        c = crc16_modbus(payload)
        return bytes([MAGIC, cmd, n & 0xFF, (n >> 8) & 0xFF,
                      c & 0xFF, (c >> 8) & 0xFF]) + payload
    return bytes([MAGIC, cmd, 0, 0, 0xFF, 0xFF])


def build_init_payload(file_bytes: bytes) -> bytes:
    n = len(file_bytes)
    crc = crc16_modbus(file_bytes)
    chk = checksum16(file_bytes)
    return (b"\x01"
            + n.to_bytes(4, "little")
            + crc.to_bytes(2, "little")
            + chk.to_bytes(2, "little"))


def build_data_frame(file_bytes: bytes, block_index: int) -> bytes:
    off = block_index * BLOCK_SIZE
    chunk = file_bytes[off:off + BLOCK_SIZE]
    prefix = (block_index + 1).to_bytes(2, "little")   # 1-based index
    return add_header(CMD_DATA, prefix + chunk)


def num_blocks(file_bytes: bytes) -> int:
    return (len(file_bytes) + BLOCK_SIZE - 1) // BLOCK_SIZE


def parse_ack(frame: bytes):
    """Validate a BC response frame. Returns (cmd, status) or None if malformed."""
    if len(frame) < 6 or frame[0] != MAGIC:
        return None
    plen = frame[2] | (frame[3] << 8)
    if plen != len(frame) - 6:
        return None
    payload = frame[6:]
    crc = frame[4] | (frame[5] << 8)
    if crc != crc16_modbus(payload):
        return None
    status = frame[6] if len(frame) > 6 else 0
    return frame[1], status


# ---------------------------------------------------------------- dry run ----
def dry_run(file_bytes: bytes):
    n = len(file_bytes)
    blocks = num_blocks(file_bytes)
    print(f"=== DRY RUN (offline — no BLE) ===")
    print(f"File size        : {n} bytes (0x{n:X})")
    if n > MAX_OTA_SIZE:
        print(f"  !! exceeds app limit {MAX_OTA_SIZE} — the ring would reject this file")
    print(f"CRC16 whole file : 0x{crc16_modbus(file_bytes):04X}")
    print(f"Checksum16 (sum) : 0x{checksum16(file_bytes):04X}")
    print(f"Data blocks      : {blocks} x {BLOCK_SIZE}B (last = {n - (blocks-1)*BLOCK_SIZE}B)")
    print()

    def show(label, frame, note=""):
        head = frame[:6].hex()
        body = frame[6:]
        tail = (body[:12].hex() + ("..." if len(body) > 12 else ""))
        print(f"{label:<16} [{len(frame):>5}B] hdr={head} payload={tail}  {note}")

    show("START (cmd1)", add_header(CMD_START, None))
    init_p = build_init_payload(file_bytes)
    show("INIT  (cmd2)", add_header(CMD_INIT, init_p),
         f"= 01|len={n}|crc=0x{crc16_modbus(file_bytes):04X}|chk=0x{checksum16(file_bytes):04X}")
    # sample data frames: first, second, last
    samples = sorted(set([0, min(1, blocks - 1), blocks - 1]))
    for bi in samples:
        f = build_data_frame(file_bytes, bi)
        show(f"DATA  blk {bi}", f, f"idx_prefix={f[6] | (f[7] << 8)} (1-based)")
    show("CHECK (cmd4)", add_header(CMD_CHECK, None))
    show("END   (cmd5)", add_header(CMD_END, None))
    print()

    # show BLE fragmentation of the largest data frame
    big = build_data_frame(file_bytes, 0)
    writes = (len(big) + BLE_CHUNK - 1) // BLE_CHUNK
    print(f"BLE fragmentation: each {len(big)}B data frame -> {writes} writes of <= {BLE_CHUNK}B "
          f"(no-response) on {WRITE_CHAR}")
    print(f"Total BLE writes (approx): start/init/check/end + "
          f"{blocks} data frames * ~{writes} = ~{4 + blocks*writes}")
    print("\nDry run only — nothing was transmitted.")


# --------------------------------------------------------------- real flash --
async def _connect_with_retry(address, on_disconnect, attempts=12):
    """BlueZ auto-connects to the paired ring, making a fresh connect fail with
    'not found'. Force a disconnect, let it settle (~1.5s, which empirically lets a
    fresh connect win), then try. Longer connect timeout so a slow-but-working
    connection isn't cut short."""
    from bleak import BleakClient
    import subprocess
    for attempt in range(attempts):
        subprocess.run(["bluetoothctl", "disconnect", address], capture_output=True, timeout=10)
        await asyncio.sleep(1.5)
        c = BleakClient(address, disconnected_callback=on_disconnect, timeout=15.0)
        try:
            await c.connect()
            return c
        except Exception as e:
            print(f"  connect attempt {attempt+1}/{attempts} failed ({type(e).__name__}); retrying…")
            await asyncio.sleep(0.5)
    return None


async def _dfu_session(client, file_bytes, chunk, blocks):
    """Run one full START..END DFU session. Returns (ok, err)."""
    state = {"step": 0, "block": 0}
    done = asyncio.Event()
    result = {"ok": False, "err": None}
    loop = asyncio.get_running_loop()

    async def send_big(frame):
        for i in range(0, len(frame), chunk):
            await client.write_gatt_char(WRITE_CHAR, frame[i:i + chunk], response=False)
            await asyncio.sleep(0.008)

    async def advance(cmd, status):
        if status != 0:
            result["err"] = f"status {status} ({RSP.get(status, '?')}) on cmd {cmd}"
            done.set(); return
        if state["step"] == CMD_START and cmd == CMD_START:
            await send_big(add_header(CMD_INIT, build_init_payload(file_bytes))); state["step"] = CMD_INIT
        elif state["step"] == CMD_INIT and cmd == CMD_INIT:
            await send_big(build_data_frame(file_bytes, 0)); state["block"] = 1; state["step"] = CMD_DATA
        elif state["step"] == CMD_DATA and cmd == CMD_DATA:
            if state["block"] < blocks:
                await send_big(build_data_frame(file_bytes, state["block"])); state["block"] += 1
                print(f"\r  block {state['block']}/{blocks} ({state['block']*100//blocks}%)", end="", flush=True)
            else:
                print("\r  all blocks sent — CHECK".ljust(40))
                await send_big(add_header(CMD_CHECK, None)); state["step"] = CMD_CHECK
        elif state["step"] == CMD_CHECK and cmd == CMD_CHECK:
            print("  CHECK ok — END")
            await send_big(add_header(CMD_END, None)); state["step"] = CMD_END
            result["ok"] = True; done.set()

    def on_notify(_c, data):
        ack = parse_ack(bytes(data))
        if ack is not None:
            asyncio.run_coroutine_threadsafe(advance(*ack), loop)

    # disconnect BEFORE reaching END is a failure (link dropped mid-transfer)
    def on_disc(_c):
        if not result["ok"] and result["err"] is None:
            result["err"] = f"disconnected mid-transfer at block {state['block']}/{blocks}"
        done.set()
    client._disconnected_callback = on_disc

    await client.start_notify(NOTIFY_CHAR, on_notify)
    state["step"] = CMD_START
    await send_big(add_header(CMD_START, None))
    try:
        await asyncio.wait_for(done.wait(), timeout=180)
    except asyncio.TimeoutError:
        result["err"] = f"timeout at block {state['block']}/{blocks}"
    return result["ok"], result["err"]


async def flash(address: str, file_bytes: bytes, chunk: int, sessions: int = 8):
    blocks = num_blocks(file_bytes)
    print(f"File: {len(file_bytes)} B | {blocks} blocks | "
          f"crc16=0x{crc16_modbus(file_bytes):04X} chk=0x{checksum16(file_bytes):04X}")
    for s in range(sessions):
        print(f"\n=== DFU session {s+1}/{sessions} ===")
        client = await _connect_with_retry(address, None)
        if client is None:
            print("  could not connect; retrying session…"); continue
        print("  connected")
        try:
            ok, err = await _dfu_session(client, file_bytes, chunk, blocks)
        finally:
            try: await client.disconnect()
            except Exception: pass
        if ok:
            print("\n[OK] full image transferred (START..CHECK..END); ring reboots into new image.")
            return
        print(f"\n[retry] session failed: {err}")
    print("\n[FAIL] could not complete a full DFU after retries — ring keeps current firmware (partial image won't activate).")
    sys.exit(1)


async def scan():
    from bleak import BleakScanner
    print("Scanning 10s …")
    for d in await BleakScanner.discover(timeout=10.0):
        name = d.name or ""
        print(f"  {name:<18} {d.address}")


def main():
    ap = argparse.ArgumentParser(description="Colmi R12 BLE DFU/OTA flasher")
    ap.add_argument("--file", help="OTA .bin (complete image)")
    ap.add_argument("--address", help="ring BLE address")
    ap.add_argument("--scan", action="store_true", help="scan for rings")
    ap.add_argument("--dry-run", action="store_true",
                    help="build and print every frame offline; do not connect")
    ap.add_argument("--chunk", type=int, default=BLE_CHUNK,
                    help=f"BLE write chunk size (default {BLE_CHUNK})")
    ap.add_argument("--yes", action="store_true", help="skip the pre-flash confirmation")
    args = ap.parse_args()

    if args.scan:
        asyncio.run(scan())
        return

    if not args.file:
        ap.error("--file is required (or use --scan)")
    with open(args.file, "rb") as f:
        file_bytes = f.read()

    if args.dry_run:
        dry_run(file_bytes)
        return

    if not args.address:
        ap.error("--address is required for a real flash (or use --dry-run)")

    print("!! REAL FLASH — bricking this ring is UNRECOVERABLE (no UART recovery). !!")
    print(f"   file: {args.file} ({len(file_bytes)} bytes)")
    print(f"   ring: {args.address}")
    if not args.yes:
        if input("   Type 'FLASH' to proceed: ").strip() != "FLASH":
            print("Aborted."); return
    asyncio.run(flash(args.address, file_bytes, args.chunk))


if __name__ == "__main__":
    main()
