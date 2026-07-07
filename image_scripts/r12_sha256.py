#!/usr/bin/env python3
"""
r12_sha256.py — Compute / verify / patch the SHA256 hash in RTL8762C (Colmi R12) OTA firmware.

The OTA file layout:
  [0x000 .. 0x04F]  Colmi header (0x50 bytes)
  [0x050 .. 0x44F]  Realtek image header (0x400 bytes)
  [0x450 .. EOF  ]  Firmware payload

The SHA256 is computed over three non-contiguous regions of the Realtek header + payload,
with the crc16 field (Realtek +0x06, 2 bytes) and the sha256 field itself (Realtek +0x174,
32 bytes) zeroed before hashing.

Derived from decompilation of Realtek's update_bee2_code_image_header().

The Colmi outer header carries an additive byte-sum at +0x0C over file[0x50:] (i.e. the
whole Realtek header + payload). Because that region CONTAINS the SHA256 field, the outer
byte-sum MUST be recomputed AFTER the SHA256 is written, or it goes stale. `patch` therefore
finalizes BOTH: it writes the SHA256 first, then recomputes the outer byte-sum last. `verify`
checks both and fails if either is wrong.
"""

import hashlib
import struct
import sys

COLMI_HDR_SIZE = 0x50
RTK_HDR_SIZE   = 0x400
RTK_HDR_OFFSET = COLMI_HDR_SIZE  # 0x50

# Offsets within the Realtek header
CRC16_OFF      = 0x06   # 2 bytes — zeroed before hashing
PAYLOAD_LEN_OFF = 0x08  # 4 bytes — LE uint32
SHA256_OFF     = 0x174  # 32 bytes — zeroed before hashing (also the output location)
SHA256_SIZE    = 0x20

# Colmi outer header: additive byte-sum over file[0x50:], stored little-endian at file+0x0C
OUTER_BYTE_SUM_OFF = 0x0C

# The three hash regions (offsets relative to start of Realtek header)
REGION1_START  = 0x0C
REGION1_LEN    = 0x168   # 0x0C .. 0x174 (stops right before sha256 field)

REGION2_START  = 0x194   # right after sha256 field
REGION2_LEN    = 0x15C   # 0x194 .. 0x2F0

REGION3_START  = 0x3F0   # length = payload_len + 0x10


def compute_sha256(data: bytearray) -> bytes:
    """
    Compute the Realtek image SHA256 over the Realtek header + payload.

    `data` must be the OTA file contents starting from the Realtek header
    (i.e., file[0x50:]), or equivalently the full file with Colmi header stripped.
    """
    buf = bytearray(data)  # work on a copy

    # Zero mutable fields before hashing
    buf[CRC16_OFF : CRC16_OFF + 2] = b'\x00\x00'
    buf[SHA256_OFF : SHA256_OFF + SHA256_SIZE] = b'\x00' * SHA256_SIZE

    # Read payload_len from header
    payload_len = struct.unpack_from('<I', buf, PAYLOAD_LEN_OFF)[0]

    region3_len = payload_len + 0x10

    # Sanity checks
    region3_end = REGION3_START + region3_len
    if region3_end > len(buf):
        print(f"WARNING: region 3 extends beyond data "
              f"(0x{REGION3_START:X} + 0x{region3_len:X} = 0x{region3_end:X}, "
              f"data size = 0x{len(buf):X})")
        print(f"         Truncating region 3 to available data.")
        region3_len = len(buf) - REGION3_START

    h = hashlib.sha256()
    h.update(buf[REGION1_START : REGION1_START + REGION1_LEN])
    h.update(buf[REGION2_START : REGION2_START + REGION2_LEN])
    h.update(buf[REGION3_START : REGION3_START + region3_len])

    return h.digest()


def compute_outer_byte_sum(filedata: bytes) -> int:
    """Additive byte-sum over file[0x50:] — the Colmi outer checksum at file+0x0C."""
    return sum(filedata[COLMI_HDR_SIZE:]) & 0xFFFFFFFF


def main():
    if len(sys.argv) < 2:
        print(f"Usage: {sys.argv[0]} <command> <firmware.bin>")
        print()
        print("Commands:")
        print("  verify  — check if the SHA256 in the header matches")
        print("  show    — display current and computed SHA256")
        print("  patch   — update the SHA256 in-place (also zeros crc16)")
        sys.exit(1)

    cmd = sys.argv[1]
    if cmd not in ('verify', 'show', 'patch'):
        print(f"Unknown command: {cmd}")
        sys.exit(1)

    if len(sys.argv) < 3:
        print("Error: no firmware file specified")
        sys.exit(1)

    fname = sys.argv[2]

    with open(fname, 'rb') as f:
        filedata = bytearray(f.read())

    if len(filedata) < COLMI_HDR_SIZE + RTK_HDR_SIZE:
        print(f"Error: file too small ({len(filedata)} bytes, need at least "
              f"{COLMI_HDR_SIZE + RTK_HDR_SIZE})")
        sys.exit(1)

    # Extract Realtek header + payload (everything after the Colmi header)
    rtk_data = filedata[RTK_HDR_OFFSET:]

    # Read existing SHA256 from header
    existing_sha = bytes(rtk_data[SHA256_OFF : SHA256_OFF + SHA256_SIZE])

    # Read payload_len for display
    payload_len = struct.unpack_from('<I', rtk_data, PAYLOAD_LEN_OFF)[0]

    # Compute
    computed_sha = compute_sha256(rtk_data)

    match = existing_sha == computed_sha

    # Outer byte-sum (over file[0x50:]) as currently stored vs. as it should be
    stored_outer_sum = struct.unpack_from('<I', filedata, OUTER_BYTE_SUM_OFF)[0]
    computed_outer_sum = compute_outer_byte_sum(filedata)
    outer_ok = stored_outer_sum == computed_outer_sum

    if cmd == 'show' or cmd == 'verify':
        print(f"File:          {fname}")
        print(f"File size:     0x{len(filedata):X} ({len(filedata)} bytes)")
        print(f"Payload len:   0x{payload_len:X} ({payload_len} bytes)")
        print(f"Region 1:      RTK+0x{REGION1_START:03X} .. RTK+0x{REGION1_START+REGION1_LEN:03X}  ({REGION1_LEN} bytes)")
        print(f"Region 2:      RTK+0x{REGION2_START:03X} .. RTK+0x{REGION2_START+REGION2_LEN:03X}  ({REGION2_LEN} bytes)")
        r3_len = payload_len + 0x10
        print(f"Region 3:      RTK+0x{REGION3_START:03X} .. RTK+0x{REGION3_START+r3_len:03X}  ({r3_len} bytes)")
        print()
        print(f"Existing SHA256: {existing_sha.hex()}")
        print(f"Computed SHA256: {computed_sha.hex()}")
        print(f"SHA256 match:    {'YES' if match else 'NO'}")
        print(f"Outer byte-sum:  stored 0x{stored_outer_sum:08X}  computed 0x{computed_outer_sum:08X}  {'OK' if outer_ok else 'STALE'}")

        if cmd == 'verify':
            sys.exit(0 if (match and outer_ok) else 1)

    elif cmd == 'patch':
        if match and outer_ok:
            print("SHA256 and outer byte-sum already correct, nothing to patch.")
            sys.exit(0)

        # 1) Write the SHA256 first (and zero crc16, as the Realtek tool does in SHA256 mode).
        if not match:
            print(f"Old SHA256: {existing_sha.hex()}")
            print(f"New SHA256: {computed_sha.hex()}")
            sha_file_offset = RTK_HDR_OFFSET + SHA256_OFF
            filedata[sha_file_offset : sha_file_offset + SHA256_SIZE] = computed_sha
            crc16_file_offset = RTK_HDR_OFFSET + CRC16_OFF
            filedata[crc16_file_offset : crc16_file_offset + 2] = b'\x00\x00'

        # 2) Recompute the outer byte-sum LAST — it covers the SHA256 field we just wrote.
        final_outer_sum = compute_outer_byte_sum(filedata)
        if final_outer_sum != stored_outer_sum:
            print(f"Outer byte-sum: 0x{stored_outer_sum:08X} -> 0x{final_outer_sum:08X}")
        struct.pack_into('<I', filedata, OUTER_BYTE_SUM_OFF, final_outer_sum)

        with open(fname, 'wb') as f:
            f.write(filedata)

        print(f"Patched {fname}")


if __name__ == '__main__':
    main()