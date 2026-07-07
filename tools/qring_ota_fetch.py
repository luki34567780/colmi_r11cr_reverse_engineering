#!/usr/bin/env python3
"""
QRing / Colmi Ring firmware OTA fetcher.
Reverse-engineered from com.qcwireless.qcwatch (QRing APK).

Usage:
    python qring_ota_fetch.py --hw R12 --fw 1.2.3 --mac AA:BB:CC:DD:EE:FF
    python qring_ota_fetch.py --hw R12 --fw 0.0.0          # use dummy fw to get latest
    python qring_ota_fetch.py --hw R12 --fw 0.0.0 --download firmware.bin
"""

import argparse
import json
import locale
import sys
import urllib.request
import urllib.error

BASE_URL      = "https://api1.qcwxkjvip.com/qcwx/"
BASE_URL_CN   = "https://api2.qcwxkjvip.com/qcwx/"   # China mirror

HARDCODED_TOKEN = "15ef6eb5403406c1da0dc4a4defa2ea1"   # baked into APK (UserConfig.kt)
TOKEN_KEY       = "qcwx_android"                        # QcService.Android_Token_Key


def get_token(base_url: str = BASE_URL) -> str:
    """
    Fetch a fresh app-level token without any account credentials.
    Mirrors HealthyRepository.getTokenNotLogin() → GET token/getToken?key=qcwx_android
    Falls back to the hardcoded APK token if the request fails.
    """
    url = f"{base_url}token/getToken?key={TOKEN_KEY}"
    print(f"[*] Fetching token from {url}")
    try:
        req = urllib.request.Request(url, headers={"token": HARDCODED_TOKEN})
        with urllib.request.urlopen(req, timeout=10) as resp:
            data = json.loads(resp.read())
        token = data.get("data") or data.get("token")
        if token:
            print(f"[+] Got fresh token: {token}")
            return token
        print(f"[!] Unexpected token response: {data}")
    except Exception as e:
        print(f"[!] Token fetch failed: {e}")
    print(f"[~] Falling back to hardcoded APK token")
    return HARDCODED_TOKEN


def check_ota(hw_version: str,
              fw_version: str,
              mac: str = "AA:BB:CC:DD:EE:FF",
              country: str | None = None,
              token: str | None = None,
              china: bool = False) -> dict:
    """
    POST app-update/last-ota — mirrors AboutActivity.checkOta() / OTARepository.
    Returns the parsed JSON response dict.

    LastOtaRequest fields (from LastOtaRequest.kt):
        appId          : int   — hardcoded 1 in the app
        uid            : long  — hardcoded 1L in the app (not a real user id)
        hardwareVersion: str   — e.g. "R12"
        romVersion     : str   — current firmware version on the ring
        os             : int   — 1=Android, 2=iOS  (hardcoded 1 in checkOta)
        mac            : str   — ring BLE MAC address
        country        : str   — ISO 3166-1 alpha-2, from Locale.getDefault().getCountry()
        dev            : int   — hardcoded 2 in the app
    """
    base = BASE_URL_CN if china else BASE_URL
    url  = f"{base}app-update/last-ota{'china' if china else ''}"
    # The China endpoint path is "app-update/last-ota/china" per QcService.kt
    url  = f"{base}app-update/last-ota{'/china' if china else ''}"

    if country is None:
        country = locale.getdefaultlocale()[0]  # e.g. "de_DE" → split below
        country = country.split("_")[-1] if country else "US"

    if token is None:
        token = get_token(base)

    payload = {
        "appId":           1,
        "uid":             1,
        "hardwareVersion": hw_version,
        "romVersion":      fw_version,
        "os":              1,
        "mac":             mac,
        "country":         country,
        "dev":             2,
    }

    body = json.dumps(payload).encode()
    headers = {
        "Content-Type": "application/json",
        "token":        token,
    }

    print(f"[*] POST {url}")
    print(f"    payload: {json.dumps(payload, indent=4)}")

    req = urllib.request.Request(url, data=body, headers=headers, method="POST")
    try:
        with urllib.request.urlopen(req, timeout=15) as resp:
            result = json.loads(resp.read())
    except urllib.error.HTTPError as e:
        result = json.loads(e.read())

    return result


def download_firmware(url: str, dest: str) -> None:
    print(f"[*] Downloading firmware from {url}")
    with urllib.request.urlopen(url, timeout=60) as resp:
        total = int(resp.headers.get("Content-Length", 0))
        received = 0
        with open(dest, "wb") as f:
            while chunk := resp.read(65536):
                f.write(chunk)
                received += len(chunk)
                if total:
                    pct = received * 100 // total
                    print(f"\r    {pct:3d}%  {received}/{total} bytes", end="", flush=True)
    print(f"\n[+] Saved to {dest}")


def main():
    parser = argparse.ArgumentParser(description="Fetch QRing / Colmi firmware OTA info")
    parser.add_argument("--hw",       required=True, help="Hardware version, e.g. R12")
    parser.add_argument("--fw",       required=True, help="Current firmware version, e.g. 1.2.3 (use 0.0.0 to force latest)")
    parser.add_argument("--mac",      default="AA:BB:CC:DD:EE:FF", help="Ring BLE MAC address")
    parser.add_argument("--country",  default=None,  help="ISO country code, e.g. DE (default: system locale)")
    parser.add_argument("--china",    action="store_true", help="Use China mirror server")
    parser.add_argument("--download", metavar="FILE", help="Download firmware binary to FILE if an update is found")
    args = parser.parse_args()

    result = check_ota(
        hw_version=args.hw,
        fw_version=args.fw,
        mac=args.mac,
        country=args.country,
        china=args.china,
    )

    print("\n[*] Server response:")
    print(json.dumps(result, indent=4))

    ret_code = result.get("retCode", -1)
    if ret_code != 0:
        print(f"\n[-] Request failed (retCode={ret_code}): {result.get('message', '?')}")
        sys.exit(1)

    data = result.get("data") or {}
    open_or_not = data.get("openOrNot", 0)
    download_url = data.get("downloadUrl", "")

    if not open_or_not or not download_url:
        print("\n[=] No firmware update available for this hardware/version.")
        sys.exit(0)

    print(f"\n[+] Firmware update available!")
    print(f"    Hardware : {data.get('hardwareVersion')}")
    print(f"    Version  : {data.get('version')}")
    print(f"    Uploaded : {data.get('uploadDate')}")
    print(f"    URL      : {download_url}")
    if data.get("updateDesc"):
        print(f"    Notes    : {data.get('updateDesc')}")

    if args.download:
        download_firmware(download_url, args.download)
    else:
        print(f"\n[~] Run with --download firmware.bin to save the binary.")


if __name__ == "__main__":
    main()
