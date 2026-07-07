# COLMI R12 (RT11CR) — Complete Reference

Everything established so far on the **R12**, whose firmware self-identifies as **RT11CR**, built on the **Realtek RTL8762C** (Gen 2, Cortex-M4F). Confirmed facts and open hypotheses are marked explicitly throughout — do not treat a hypothesis as ground truth without the noted verification step.

---

## 1. Identity & Classification

| Attribute | Value |
|-----------|-------|
| Marketing name | Colmi R12 |
| Firmware identity string | `RT11CR` |
| Generation | Gen 2 |
| SoC | Realtek RTL8762C |
| Core | ARM Cortex-M4F (Thumb-2, has FPU) |
| BLE | Bluetooth 5.x (Realtek/Bee2 stack) |
| Peer models (same SoC/branch) | R09 and later; RY02 / RY02R variants share the RTL8762C SoC |
| Shared SoC magic | `e5c3bd81` (also seen on RY02R) |

**Contrast with Gen 1 (RF03):** The R02/R06 family runs on the BlueX RF03 / BX2400 (Cortex-M0, ARMv6-M only). The R12 is a fundamentally different chip — Thumb-2 is legal here, whereas on RF03 it is not. Ghidra must be configured for the correct Cortex-M4 variant.

---

## 2. Memory Map (RTL8762C)

| Region | Base | Size / Notes |
|--------|------|--------------|
| ROM | `0x00000000` | On-chip mask ROM |
| RAM1 | `0x00200000` | 112 KB |
| RAM2 | `0x0021C000` | 8 KB |
| RAM3 | `0x0021E000` | 8 KB |
| RAM4 | `0x00280000` | 32 KB |
| Flash XIP | `0x00800000` | 8 MB address space |
| Peripherals | `0x40000000+` | See peripheral table |

### Application banking

- **Active app bank maps to `0x00826000`** via ROM remap.
- **No rebasing is required between bank0 and bank1** — the ROM remap handles it, so a payload assembled for the active-bank virtual address works regardless of which physical bank is live. *(Confirmed.)*

### Code cave

- **`0x00848052`** — a **203-byte verified-zero gap** usable for injected code. *(Confirmed by inspection.)*

### Peripheral map

| Peripheral | Base | Peripheral | Base |
|------------|------|------------|------|
| SYS_CTRL | `0x40000000` | AUXADC | `0x40010000` |
| GPIO | `0x40001000` | UART1 | `0x40011000` |
| Timers | `0x40002000` | UART0 | `0x40012000` |
| IR | `0x40003000` | SPI0 | `0x40013000` |
| QDEC | `0x40004000` | SPI1 | `0x40013400` |
| KeyScan | `0x40005000` | AES | `0x40014000` |
| I2C0 | `0x40015000` | I2C1 | `0x40015400` |
| I2S0 | `0x40020000` | I2S1 | `0x40021000` |
| UART2 | `0x40024000` | I8080 | `0x40024800` |

---

## 3. OTA / Firmware Image Format

The RTL8762C OTA image is a **two-layer** container. *(Confirmed against a validated round-trip.)*

```
┌─────────────────────────────────────────────┐
│  Outer vendor header            80 bytes     │  file[0x00:0x50]
├─────────────────────────────────────────────┤
│  Realtek / Bee2 bootloader      0x400 bytes  │  inner descriptor
│  descriptor                                  │  starts at file[0x50]
├─────────────────────────────────────────────┤
│  Payload (raw code)             payload_len  │
└─────────────────────────────────────────────┘
```

### Layer 1 — Outer vendor header (80 bytes, `0x00`–`0x4F`)

- **`+0x0C`: outer checksum** — a 32-bit **additive byte sum of `file[0x50:]`** (i.e. everything from the inner descriptor onward), masked to 32 bits. (pre-made generation implementation in r02_create_ota_header.py) *(Confirmed.)*

### Layer 2 — Inner Realtek/Bee2 descriptor (`0x400` bytes)

- **`payload_len`** field records the length of the raw payload that follows.
- **Inner SHA256** covers **three non-contiguous regions** of the buffer: *(Confirmed.)*
  - `buf[0x0C:0x174]`
  - `buf[0x194:0x2F0]`
  - `buf[0x3F0 : 0x3F0 + payload_len + 0x10]`
- **`desc+0x0C` = `0x7e6b4cf9`** — role **UNCONFIRMED**. Working hypothesis: a fixed signature/magic constant. (disassemble prepend_header for details?)

### Critical bricking note

The **ROM bootloader validates the SHA256 fields** and **rejects images with stale SHA256** values. A test ring was **permanently bricked** during an early OTA iteration precisely because stale SHA256 fields slipped through. Any rebuilt image *must* regenerate all three SHA256 regions and both checksums before flashing.

---

## 4. OTA Build Pipeline — `build_r12_ota.py`

**Status: complete and validated.** *(Round-trip byte-for-byte match against the original OTA confirmed.)*

```
build_r12_ota.py  <donor_ota.bin>  <payload.bin>  <out.bin>
```

Behavior:
1. **Preserves** the outer header and inner descriptor from the **donor** OTA.
2. **Updates `payload_len`** in the inner descriptor to match the new payload.
3. **Regenerates the inner SHA256** across the three regions above — done in **pure Python**, so no external `prepend_header` tool is needed.
4. **Recomputes the outer additive byte sum** at `+0x0C` over `file[0x50:]`.

Validation standard met: rebuilding the *original* payload through the pipeline reproduces the original OTA **byte-for-byte**. This is the gate every patched image must pass before it goes anywhere near hardware.

---

## 5. Upstream Firmware File

| File | Size | Contents |
|------|------|----------|
| `rt11cr_firmware.bin` | 140,164 bytes | **Raw code payload only** — no outer header, no inner descriptor. *(Confirmed.)* |

Implication: `rt11cr_firmware.bin` is the *payload* argument, not a flashable OTA. To produce a flashable image, it must be wrapped via `build_r12_ota.py` using a real donor OTA for the header + descriptor.

---

## 6. Hook Target & Trampoline

**Goal:** implement a code-cave hook to gain runtime control (ultimately, BLE-accessible memory read/write and custom command handling).

| Element | Value |
|---------|-------|
| Hooked command | `0x39` — `get_stress_data_for_day_handler` |
| Code cave | `0x00848052` (203-byte zero gap) |
| Prologue to replay | `PUSH {R4, LR}` **and** `SUB SP, #0x48` |

The trampoline **replays both prologue instructions** (`PUSH {R4, LR}` then `SUB SP, #0x48`) before branching back into the original handler, so the displaced instructions are not lost. Thumb assembly (Keystone).

> Note on cmd numbering: `0x39` here is the **firmware-internal handler** for per-day stress retrieval. Don't confuse it with the app-level protocol constants `CMD_PRESSURE` (`0x37`) / `CMD_PRESSURE_SETTING` (`0x36`) in the BLE docs — the hook is chosen at the firmware dispatch level.

---

## 7. Shared BLE Protocol (applies to R12)

The R12 speaks the **same 16-byte primary-channel protocol** as the rest of the QRing/Colmi family. Nothing R12-specific diverges at the protocol layer that we've found.

- **Service:** `6e40fff0-b5a3-f393-e0a9-e50e24dcca9e`
- **Write (phone→ring):** `6e400002-...`
- **Notify (ring→phone):** `6e400003-...`
- **Packet:** fixed 16 bytes — `[cmd][14-byte payload][checksum]`, checksum = `sum(bytes[0:15]) & 0xFF`.
- **Response dispatch:** byte 0 echoes command with `0x80` error flag; match on `cmd & 0x7F`.
- Secondary "serial port" channel (`de5bf728-...`) for bulk data, 6-byte header + CRC-16/MODBUS.

This means the RF03-side Python API patterns (`battery()`, real-time HR via `0x69`, etc.) transfer directly; what's *not* yet in place on R12 is the **custom** `read_mem`/`write_mem` primitive, which depends on landing the code-cave hook first.

---

## 8. Hardware Recovery Constraints

- **UART recovery is NOT feasible** on this hardware — **no accessible test points** for the UART. *(Confirmed.)*
- Combined with the ROM bootloader's strict SHA256 validation, this makes bricking effectively **unrecoverable**. Hence the standing rule: **validate on one dedicated test ring before touching any others**, and never flash an image that hasn't passed byte-for-byte round-trip validation.

---

## 9. Confirmed vs. Open

### Confirmed
- Two-layer OTA structure; SHA256 over three non-contiguous regions; outer additive checksum at `+0x0C` over `file[0x50:]`.
- `build_r12_ota.py` produces byte-for-byte round-trip-correct images.
- `rt11cr_firmware.bin` (140,164 B) is raw payload only.
- Active app bank at `0x00826000` via ROM remap; no bank rebasing needed.
- Code cave at `0x00848052`, 203 verified-zero bytes.
- ROM bootloader rejects stale SHA256; no UART test points → no recovery path.
- Shared 16-byte BLE protocol.

### Open / to verify
- **`desc+0x0C = 0x7e6b4cf9`** — is it a fixed signature constant? Check against a **third** R12 image.
- **`rt11cr_patched_ota.bin`** — current state of the raw image is unknown. Check if code cave is already in place.
- **Runtime data access over BLE via the hook** — the end goal (custom read/write primitive) is still downstream of landing the hook.

---

## 10. Next Actions (R12)

1. Toolchain roundtrip (can we reproduce a image byte-by-byte from only it's flash + a reference image)
2. Validation (and if required creation) of a code cave
3. Uploading and validation on the ring