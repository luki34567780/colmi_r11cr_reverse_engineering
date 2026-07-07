#!/usr/bin/env python3
"""
COLMI R12 (RTL8762C) OTA Image Patcher / Generator

OTA file layout:
  [0x50 outer header][0x400 image descriptor][firmware code]

Flash layout (what ROM sees, what prepend_header operates on):
  [0x400 image header][firmware code]

The image descriptor in OTA = image header in flash.

Subcommands:
  info           Show OTA file details
  extract-flash  Extract flash image (0x400 header + firmware) for prepend_header
  extract-fw     Extract raw firmware code only
  build          Reassemble OTA from outer header + flash image
  patch          Quick patch: apply hex patches to donor OTA (no hash update)
"""

import struct
import argparse
import sys

OUTER_HDR_SIZE = 0x50
IMG_DESC_SIZE = 0x400
FULL_HDR_SIZE = OUTER_HDR_SIZE + IMG_DESC_SIZE  # 0x450


def compute_byte_sum(data: bytes) -> int:
    return sum(data) & 0xFFFFFFFF


def read_file(path: str) -> bytes:
    with open(path, 'rb') as f:
        return f.read()


def write_file(path: str, data: bytes):
    with open(path, 'wb') as f:
        f.write(data)


def parse_ota(ota: bytes) -> dict:
    if len(ota) < FULL_HDR_SIZE + 16:
        raise ValueError(f"OTA too small: {len(ota)} bytes")

    flash_image = ota[OUTER_HDR_SIZE:]
    firmware = ota[FULL_HDR_SIZE:]
    byte_sum = compute_byte_sum(flash_image)

    return {
        'outer_header': bytearray(ota[:OUTER_HDR_SIZE]),
        'img_desc': bytearray(ota[OUTER_HDR_SIZE:FULL_HDR_SIZE]),
        'firmware': firmware,
        'flash_image': flash_image,
        'magic': struct.unpack_from('<I', ota, 0x00)[0],
        'payload_size': struct.unpack_from('<I', ota, 0x04)[0],
        'byte_sum_stored': struct.unpack_from('<I', ota, 0x0C)[0],
        'byte_sum_computed': byte_sum,
        'byte_sum_ok': struct.unpack_from('<I', ota, 0x0C)[0] == byte_sum,
        'fw_size': struct.unpack_from('<I', ota, 0x58)[0],
        'fw_size_ok': struct.unpack_from('<I', ota, 0x58)[0] == len(firmware),
        'version_str': ota[0x10:0x30].split(b'\x00')[0].decode('ascii', errors='replace'),
        'platform_str': ota[0x30:0x50].split(b'\x00')[0].decode('ascii', errors='replace'),
        'load_addr': struct.unpack_from('<I', ota, 0x6C)[0],
        'exe_addr': struct.unpack_from('<I', ota, 0x78)[0],
        'flags': ota[0x52],
    }


def build_ota(outer_header: bytearray, flash_image: bytes) -> bytes:
    hdr = bytearray(outer_header)
    struct.pack_into('<I', hdr, 0x04, len(flash_image))
    struct.pack_into('<I', hdr, 0x08, len(flash_image))
    byte_sum = compute_byte_sum(flash_image)
    struct.pack_into('<I', hdr, 0x0C, byte_sum)
    return bytes(hdr) + flash_image


def cmd_info(args):
    ota = read_file(args.ota_file)
    info = parse_ota(ota)
    print(f"File:           {args.ota_file}")
    print(f"Total size:     {len(ota)} bytes (0x{len(ota):x})")
    print(f"Outer header:   {OUTER_HDR_SIZE} bytes")
    print(f"Image desc:     {IMG_DESC_SIZE} bytes")
    print(f"Firmware:       {len(info['firmware'])} bytes")
    print(f"Flash image:    {len(info['flash_image'])} bytes")
    print(f"")
    print(f"Magic:          0x{info['magic']:08x}")
    print(f"Version:        {info['version_str']}")
    print(f"Platform:       {info['platform_str']}")
    print(f"Payload size:   0x{info['payload_size']:08x}  {'✓' if info['payload_size'] == len(info['flash_image']) else '✗'}")
    print(f"FW size field:  0x{info['fw_size']:08x}  {'✓' if info['fw_size_ok'] else '✗'}")
    print(f"Byte sum:       0x{info['byte_sum_stored']:08x}  {'✓' if info['byte_sum_ok'] else '✗ (computed: 0x' + format(info['byte_sum_computed'], '08x') + ')'}")
    print(f"Flags:          0x{info['flags']:02x} ({info['flags']:08b})")
    print(f"Load addr:      0x{info['load_addr']:08x}")
    print(f"Exe addr:       0x{info['exe_addr']:08x}")
    print(f"")
    print(f"SHA256 (+0x1C4): {info['img_desc'][0x174:0x194].hex()}")
    print(f"CRC16  (+0x056): {info['img_desc'][0x06:0x08].hex()}")
    print(f"Auth   (+0x228): {info['img_desc'][0x1D8:0x1E0].hex()}")


def cmd_extract_flash(args):
    ota = read_file(args.ota_file)
    info = parse_ota(ota)
    flash_img = bytearray(info['flash_image'])
    if args.clear_hash:
        flash_img[0x08:0x0C] = b'\x00\x00\x00\x00'
        flash_img[0x174:0x194] = b'\x00' * 32
        print(f"Cleared payload_len and SHA256 for prepend_header")
    write_file(args.output, bytes(flash_img))
    print(f"Extracted flash image: {len(flash_img)} bytes to {args.output}")


def cmd_extract_fw(args):
    ota = read_file(args.ota_file)
    info = parse_ota(ota)
    write_file(args.output, info['firmware'])
    print(f"Extracted firmware: {len(info['firmware'])} bytes to {args.output}")


def cmd_build(args):
    donor_ota = read_file(args.donor)
    donor_info = parse_ota(donor_ota)
    flash_image = read_file(args.flash_image)
    if len(flash_image) < IMG_DESC_SIZE + 16:
        raise ValueError(f"Flash image too small: {len(flash_image)} bytes")
    ota = build_ota(donor_info['outer_header'], flash_image)
    result = parse_ota(ota)
    assert result['byte_sum_ok'], "Byte sum verification failed!"
    write_file(args.output, ota)
    print(f"Built OTA: {len(ota)} bytes, byte sum: 0x{result['byte_sum_stored']:08x}")


def cmd_patch(args):
    donor_ota = read_file(args.donor)
    donor_info = parse_ota(donor_ota)
    firmware = bytearray(donor_info['firmware'])
    if args.hex_patch:
        for spec in args.hex_patch:
            addr_str, hex_str = spec.split(':', 1)
            addr = int(addr_str, 16)
            data = bytes.fromhex(hex_str.replace(' ', ''))
            firmware[addr:addr + len(data)] = data
            print(f"Patched {len(data)} bytes at fw+0x{addr:05x}")
    if args.patch_file:
        with open(args.patch_file, 'r') as f:
            for line in f:
                line = line.strip()
                if not line or line.startswith('#'):
                    continue
                addr_str, hex_str = line.split(':', 1)
                addr = int(addr_str, 16)
                data = bytes.fromhex(hex_str.replace(' ', ''))
                firmware[addr:addr + len(data)] = data
                print(f"Patched {len(data)} bytes at fw+0x{addr:05x}")
    flash_image = bytes(donor_info['img_desc']) + bytes(firmware)
    ota = build_ota(donor_info['outer_header'], flash_image)
    write_file(args.output, ota)
    result = parse_ota(ota)
    print(f"Output: {args.output} ({len(ota)} bytes), byte sum: 0x{result['byte_sum_stored']:08x}")
    print(f"WARNING: Image hashes NOT updated! Use extract-flash + prepend_header + build for valid hashes.")


def main():
    parser = argparse.ArgumentParser(
        description='COLMI R12 (RTL8762C) OTA image tool',
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Workflow for OTA with valid hashes:
  %(prog)s extract-flash donor.bin -o flash.bin --clear-hash
  # apply patches to flash.bin at offsets >= 0x400
  ./prepend_header -t app_code -b 5 -c sha256 -p flash.bin
  %(prog)s build donor.bin -f flash.bin -o patched.bin
""")

    sub = parser.add_subparsers(dest='command', required=True)

    p = sub.add_parser('info', help='Show OTA file details')
    p.add_argument('ota_file')

    p = sub.add_parser('extract-flash', help='Extract flash image for prepend_header')
    p.add_argument('ota_file')
    p.add_argument('-o', '--output', required=True)
    p.add_argument('--clear-hash', action='store_true',
                   help='Zero hash fields so prepend_header recomputes them')

    p = sub.add_parser('extract-fw', help='Extract raw firmware only')
    p.add_argument('ota_file')
    p.add_argument('-o', '--output', required=True)

    p = sub.add_parser('build', help='Build OTA from donor + flash image')
    p.add_argument('donor', help='Donor OTA (provides outer header)')
    p.add_argument('-f', '--flash-image', required=True)
    p.add_argument('-o', '--output', required=True)

    p = sub.add_parser('patch', help='Quick patch (no hash update)')
    p.add_argument('donor')
    p.add_argument('-o', '--output', required=True)
    p.add_argument('-x', '--hex-patch', action='append', metavar='OFF:HEX')
    p.add_argument('-p', '--patch-file')

    args = parser.parse_args()
    {'info': cmd_info, 'extract-flash': cmd_extract_flash,
     'extract-fw': cmd_extract_fw, 'build': cmd_build,
     'patch': cmd_patch}[args.command](args)


if __name__ == '__main__':
    main()