import os
import sys
from zlib import crc32
import struct

with open(sys.argv[-1], "rb") as f:
    data = f.read()
data = data[0x3000:0x3000 + 0x20000-256]
while len(data) < (0x20000-256):
    data = data + bytes([0])

#R02_3_LUKI_v0.01
#R02_V3.0
packed = struct.pack("<III16sHxxxxxxxxxxxxxx9s", crc32(data), len(data), len(data), b"R02_3.00.06_2405", 13106, b"R02_V3.0")


HEADER = bytes([
    # magic bytes
    0x78, 0x56, 0x34, 0x12
    ]) + packed + (bytes([0]*(256-len(packed)-4)))

print(len(HEADER))

with open("ota.modded.bin", "wb") as f:
    f.write(HEADER + data)