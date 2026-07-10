#!/usr/bin/env python3
"""
Colmi R12 address-space prober — sweeps a configurable address range/granularity
over BLE via the firmware mem-read hook, looking for undocumented/interesting
regions (extra peripherals, unmapped-but-populated RAM, stray data).

Built for long unattended runs (hours to days): every probed address is logged
immediately (one JSON object per line, flushed each write) so progress always
survives a crash/restart, and the script is resumable via --resume (auto-detects
the last logged address in --out and continues after it).

CRASH HANDLING: reading a bad address on this firmware doesn't just fail the one
request — it hangs the whole BLE command dispatcher (confirmed in [[mem-rw-hook]]),
though the LE link itself can stay nominally connected for a while before dropping.
So every timeout is disambiguated with a "sanity read" of a known-good address
(the hook's own bytes): if the sanity read ALSO fails, the ring is considered
crashed and the prober enters an unbounded reconnect loop with backoff — the
RTL8762C has a watchdog (see "Wdg ISR!" ROM string) that should eventually
reset the ring on its own, at which point the prober reconnects and resumes.
If the sanity read succeeds, the probed address is just logged "silent" (no
reply, but the ring is fine) and the sweep continues immediately.

Log line shapes (JSONL, one per probed address):
    {"addr": "0x...", "status": "ok",     "value": "0x...", "ts": <unix time>}
    {"addr": "0x...", "status": "silent",                   "ts": <unix time>}
    {"addr": "0x...", "status": "crash",                    "ts": <unix time>}
    {"event": "reconnect_wait", "attempt": N,                "ts": <unix time>}
    {"event": "reconnected",                                 "ts": <unix time>}

Usage:
    # coarse sweep of the documented APB peripheral range + the undocumented
    # tail up to where we found the SPI flash controller (0x40080000)
    python colmi_probe.py --address <mac> --start 0x40000000 --end 0x40100000 \\
        --step 0x100 --out probes/mmio_sweep.jsonl

    # resume an interrupted sweep
    python colmi_probe.py --address <mac> --start 0x40000000 --end 0x40100000 \\
        --step 0x100 --out probes/mmio_sweep.jsonl --resume

Suggested ranges worth probing (see [[rtl8762c-official-memory-map]] /
[[rom-flash-driver-stack]] for context on why):
    0x40025000-0x40100000  step 0x100   undocumented MMIO past the known APB block;
                                         the SPIC (SPI flash controller) alone was
                                         found at 0x40080000, outside the documented
                                         0x40000000-0x40024fff range - there may be more
    0x00220000-0x00280000  step 0x1000  the 384KB gap between cache-shared RAM and
                                         Buffer RAM - undocumented, unknown if mapped
    0x00288000-0x002A0000  step 0x1000  just past the end of Buffer RAM
    0xE0000000-0xE0100000  step 0x100   Cortex-M system control space (NVIC/SCB/debug) -
                                         only VTOR (0xE000ED08) confirmed so far
    DO NOT probe 0x00044004-0x00060000 (confirmed dead silicon, see
    [[rtl8762c-official-memory-map]] - instant crash, already tested)
    DO NOT probe 0x0021c000-0x00220000 (confirmed SPI flash cache, instant crash)
"""

import argparse
import asyncio
import json
import subprocess
import sys
import time
from pathlib import Path

SERVICE_UUID = "6e40fff0-b5a3-f393-e0a9-e50e24dcca9e"
WRITE_CHAR   = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR  = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

CMD     = 0x37   # hooked command (BLE-reachable stress-for-day handler)
MAGIC   = 0xFE
OP_READ = 1

# Known-good address/value used to sanity-check "is the hook still alive" after
# any timeout, and to confirm the hook right after a reconnect. Runtime address
# (see colmi_mem.py KNOWN dict) - payload vector table, always present.
SANITY_ADDR = 0x00826400
SANITY_VALUE = 0x47004800


def make_packet(cmd: int, payload: bytes) -> bytes:
    pkt = bytearray(16)
    pkt[0] = cmd
    pkt[1:1 + len(payload[:14])] = payload[:14]
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)


def read_packet(addr: int) -> bytes:
    return make_packet(CMD, bytes([MAGIC, OP_READ]) + addr.to_bytes(4, "big"))


class ProbeLog:
    """Append-only JSONL log, flushed on every write so nothing is lost to a crash."""

    def __init__(self, path: Path):
        self.path = path
        self.path.parent.mkdir(parents=True, exist_ok=True)
        self.f = open(path, "a", buffering=1)

    def write(self, obj: dict):
        obj.setdefault("ts", time.time())
        self.f.write(json.dumps(obj) + "\n")
        self.f.flush()

    def close(self):
        self.f.close()

    @staticmethod
    def last_addr(path: Path):
        """Scan an existing log for the highest successfully-logged probe address.
        Tolerates a truncated/corrupt last line (script killed mid-write)."""
        if not path.exists():
            return None
        last = None
        with open(path) as f:
            for line in f:
                line = line.strip()
                if not line:
                    continue
                try:
                    obj = json.loads(line)
                except json.JSONDecodeError:
                    continue  # truncated last line - ignore, resume before it
                if "addr" in obj:
                    a = int(obj["addr"], 0)
                    if last is None or a > last:
                        last = a
        return last


def _request_fast_connection_interval(address, min_units=6, max_units=6, latency=0, timeout_units=500):
    """Ask the controller for a short LE connection interval (see colmi_mem.py for
    the full explanation) - needs `sudo setcap cap_net_admin,cap_net_raw+eip /usr/bin/hcitool`."""
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
            print(f"  [interval] lecup failed - run: sudo setcap 'cap_net_admin,cap_net_raw+eip' /usr/bin/hcitool")
    except Exception as e:
        print(f"  [interval] hcitool lecup failed: {e}")


class Prober:
    def __init__(self):
        self.resp = asyncio.Queue()
        self.client = None

    def on_notify(self, _char, data: bytearray):
        d = bytes(data)
        if len(d) == 16 and (d[0] & 0x7F) == CMD:
            self.resp.put_nowait(d)

    async def _read_once(self, addr, timeout):
        while not self.resp.empty():
            self.resp.get_nowait()
        try:
            await self.client.write_gatt_char(WRITE_CHAR, read_packet(addr), response=False)
            r = await asyncio.wait_for(self.resp.get(), timeout=timeout)
            return int.from_bytes(r[3:7], "big")
        except (asyncio.TimeoutError, Exception):
            return None

    async def read_with_retry(self, addr, timeout, quick_retries):
        """A handful of fast internal retries for pure transient BLE hiccups
        (NOT for actual crashes - those need the caller's sanity check + reconnect)."""
        for _ in range(quick_retries):
            if not self.client.is_connected:
                return None
            val = await self._read_once(addr, timeout)
            if val is not None:
                return val
        return None

    async def sanity_ok(self, timeout):
        if not self.client or not self.client.is_connected:
            return False
        val = await self._read_once(SANITY_ADDR, timeout)
        return val == SANITY_VALUE

    async def connect(self, address, attempts, base_wait=1.5):
        """attempts=None means retry forever (used for post-crash watchdog-reset wait)."""
        from bleak import BleakClient
        n = 0
        while attempts is None or n < attempts:
            n += 1
            subprocess.run(["bluetoothctl", "disconnect", address], capture_output=True, timeout=10)
            await asyncio.sleep(base_wait)
            c = BleakClient(address, timeout=15.0)
            try:
                await c.connect()
                self.client = c
                await c.start_notify(NOTIFY_CHAR, self.on_notify)
                await asyncio.sleep(0.5)
                _request_fast_connection_interval(address)
                return True
            except Exception as e:
                print(f"  connect attempt {n}{'' if attempts is None else '/'+str(attempts)} "
                      f"failed ({type(e).__name__}); retrying…")
        return False


async def reconnect_after_crash(prober: Prober, address, log: ProbeLog,
                                 wait_min=15.0, wait_max=90.0):
    """Unbounded reconnect loop with backoff, for after a confirmed crash. Relies
    on the ring's own watchdog to reset it - we just keep knocking until it answers
    and the hook is confirmed live again (sanity check), which can take anywhere
    from seconds to (per the user) potentially a very long time."""
    try:
        if prober.client:
            await prober.client.disconnect()
    except Exception:
        pass
    wait = wait_min
    attempt = 0
    while True:
        attempt += 1
        log.write({"event": "reconnect_wait", "attempt": attempt, "wait_s": wait})
        print(f"\n[crash recovery] attempt {attempt}: waiting {wait:.0f}s for the ring "
              f"to come back (watchdog reset expected)…", flush=True)
        await asyncio.sleep(wait)
        ok = await prober.connect(address, attempts=1, base_wait=1.0)
        if ok and await prober.sanity_ok(timeout=6.0):
            log.write({"event": "reconnected", "attempt": attempt})
            print("[crash recovery] hook is live again - resuming sweep.", flush=True)
            return
        wait = min(wait * 1.5, wait_max)


async def run(address, start, end, step, out_path, resume, read_timeout,
              quick_retries, read_delay, stats_every):
    log = ProbeLog(Path(out_path))
    if resume:
        last = ProbeLog.last_addr(Path(out_path))
        if last is not None:
            start = last + step
            print(f"[resume] continuing from 0x{start:08X} (last logged: 0x{last:08X})")

    if start > end:
        print(f"Nothing to do - start 0x{start:08X} is already past end 0x{end:08X} "
              f"(sweep already complete?)")
        return

    prober = Prober()
    print(f"Connecting to {address} …")
    if not await prober.connect(address, attempts=12):
        print("[FAIL] could not connect (BlueZ auto-connect race)")
        sys.exit(1)
    print(f"Connected: {prober.client.is_connected}")

    counts = {"ok": 0, "silent": 0, "crash": 0}
    addr = start
    total = (end - start) // step + 1
    t0 = time.time()
    n = 0
    try:
        while addr <= end:
            val = await prober.read_with_retry(addr, read_timeout, quick_retries)
            if val is not None:
                log.write({"addr": f"0x{addr:08X}", "status": "ok", "value": f"0x{val:08X}"})
                counts["ok"] += 1
            else:
                # disambiguate: transient/silent vs a real crash
                alive = await prober.sanity_ok(read_timeout)
                if alive:
                    log.write({"addr": f"0x{addr:08X}", "status": "silent"})
                    counts["silent"] += 1
                else:
                    log.write({"addr": f"0x{addr:08X}", "status": "crash"})
                    counts["crash"] += 1
                    print(f"\n[CRASH] 0x{addr:08X} took the ring down.")
                    await reconnect_after_crash(prober, address, log)

            n += 1
            if n % stats_every == 0 or addr >= end:
                rate = n / max(time.time() - t0, 1e-6)
                eta_s = (total - n) / max(rate, 1e-6)
                print(f"\r  0x{addr:08X}  {n}/{total} ({100*n/total:5.1f}%)  "
                      f"{rate:5.2f} addr/s  ETA {eta_s/3600:5.1f}h  "
                      f"ok={counts['ok']} silent={counts['silent']} crash={counts['crash']}   ",
                      end="", flush=True)

            if read_delay:
                await asyncio.sleep(read_delay)
            addr += step
    except KeyboardInterrupt:
        print("\n\nInterrupted by user - progress is saved, re-run with --resume to continue.")
    finally:
        log.close()
        try:
            if prober.client:
                await prober.client.disconnect()
        except Exception:
            pass

    print(f"\n\nDone. ok={counts['ok']} silent={counts['silent']} crash={counts['crash']}")
    print(f"Log: {out_path}")


def auto_int(s):
    return int(s, 0)


def main():
    ap = argparse.ArgumentParser(
        description="Sweep a Colmi R12 address range over BLE, logging every probe result",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog=__doc__)
    ap.add_argument("--address", required=True, help="ring BLE address")
    ap.add_argument("--start", type=auto_int, required=True, help="start address")
    ap.add_argument("--end", type=auto_int, required=True, help="end address (inclusive)")
    ap.add_argument("--step", type=auto_int, default=4,
                     help="bytes between probes (default 4 = every word; use a larger "
                          "value like 0x100 or 0x1000 for a fast coarse sweep)")
    ap.add_argument("--out", required=True, help="JSONL output log path")
    ap.add_argument("--resume", action="store_true",
                     help="continue from the last address found in --out")
    ap.add_argument("--read-timeout", type=float, default=4.0,
                     help="seconds to wait for a single read response")
    ap.add_argument("--quick-retries", type=int, default=2,
                     help="fast internal retries per address before treating it as a "
                          "non-response (transient BLE hiccups, not crashes)")
    ap.add_argument("--read-delay", type=float, default=0.0,
                     help="extra seconds to sleep between probes (rate limiting)")
    ap.add_argument("--stats-every", type=int, default=20,
                     help="print a progress line every N probes")
    args = ap.parse_args()

    if args.start & 3 or args.step & 3:
        print("[FAIL] --start and --step must be 4-byte aligned (word reads only)")
        sys.exit(1)

    asyncio.run(run(args.address, args.start, args.end, args.step, args.out,
                     args.resume, args.read_timeout, args.quick_retries,
                     args.read_delay, args.stats_every))


if __name__ == "__main__":
    main()
