# QRing / Colmi Smart Ring — Detailed BLE Protocol Breakdown

Reverse-engineered from the QRing Android APK (`com.oudmon.ble.base`), cross-referenced against firmware disassembly (BlueX RF03 ROM and RTL8762C), and validated against real packet captures. Applies to the whole family: **R02, R03, R06 (Gen 1 / RF03)** and **R09, R12 and later (Gen 2 / RTL8762C)** — the protocol is identical across generations; only the silicon differs.

> **Ground-truth policy:** where the decompiled APK and firmware/packet-capture evidence disagree, the empirical evidence wins. Sections tagged **⚠ CAPTURE-VERIFIED** document places where observed behavior diverges from what the app-side Java implies.

---

## 1. GATT Service Map

Three services are used. The first carries all command/response traffic; the second carries bulk data; the third is the standard BLE SIG device-info service.

### 1.1 Primary Command Channel (Nordic UART-style)

| Role | UUID |
|------|------|
| Service | `6e40fff0-b5a3-f393-e0a9-e50e24dcca9e` |
| **Write** (phone → ring) | `6e400002-b5a3-f393-e0a9-e50e24dcca9e` |
| **Notify** (ring → phone) | `6e400003-b5a3-f393-e0a9-e50e24dcca9e` |

Fixed-length **16-byte** packets with an additive checksum. This is the channel you use for nearly everything.

### 1.2 Secondary "Serial Port" Channel (bulk data)

| Role | UUID |
|------|------|
| Service | `de5bf728-d711-4e47-af26-65e3012a5dc7` |
| **Write** (phone → ring) | `de5bf72a-d711-4e47-af26-65e3012a5dc7` |
| **Notify** (ring → phone) | `de5bf729-d711-4e47-af26-65e3012a5dc7` |

Variable-length packets with a 6-byte header + CRC-16/MODBUS. Used for SpO2 history, sleep data, contacts, watch faces, GPS navigation.

### 1.3 Device Information Service (standard BLE SIG)

| Characteristic | UUID |
|----------------|------|
| Service | `0000180a-0000-1000-8000-00805f9b34fb` |
| Firmware Revision | `00002a26-0000-1000-8000-00805f9b34fb` |
| Hardware Revision | `00002a27-0000-1000-8000-00805f9b34fb` |
| Software Revision | `00002a28-0000-1000-8000-00805f9b34fb` |

### 1.4 CCCD

`00002902-0000-1000-8000-00805f9b34fb` — write `01 00` to a TX characteristic's CCCD to enable notifications.

---

## 2. Primary Channel Packet Format

Every packet is exactly **16 bytes** (`CMD_DATA_LENGTH = 16`):

```
Byte:  [  0  ] [  1  ] [  2  ] ........... [ 14 ] [ 15  ]
Field:  CMD     <──────── 14-byte payload ──────>  CSUM
```

| Field | Size | Description |
|-------|------|-------------|
| CMD | 1 byte | Command key. In **responses**, high bit `0x80` = error flag. |
| Payload | 14 bytes | Command-specific; zero-padded when unused. |
| Checksum | 1 byte | `sum(bytes[0..14]) & 0xFF` |

### 2.1 Checksum

Simple additive sum of the first 15 bytes, masked to 8 bits. The app verifies this on **every** incoming notification (`QCDataParser.checkCrc()`) before processing.

```python
def checksum(data: bytes) -> int:      # data is the 16-byte packet or first 15 bytes
    return sum(data[0:15]) & 0xFF
```

### 2.2 Building a packet

```python
def make_packet(cmd: int, payload: bytes = b"") -> bytes:
    pkt = bytearray(16)
    pkt[0] = cmd
    pkt[1:1 + len(payload)] = payload[:14]
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)
```

### 2.3 Parsing a response

```python
def parse_response(data: bytes):
    assert len(data) == 16
    assert data[15] == sum(data[:15]) & 0xFF   # verify checksum
    cmd     = data[0] & 0x7F                    # strip error flag
    error   = bool(data[0] & 0x80)             # 0x80 = FLAG_MASK_ERROR
    payload = data[1:15]                        # 14 bytes
    return cmd, payload, error
```

### 2.4 Response dispatch (two-phase)

When a notification arrives, byte 0 identifies the command (mask off `0x80`). The app dispatches in two phases:

1. **Request-response matching** — if a pending write request exists for `cmd & 0x7F`, the parser's `acceptData()` is called with the 14-byte payload. Return value:
   - `true` → more packets expected (multi-packet response, keep buffering).
   - `false` → response complete, deliver to callback.
2. **Notification dispatch** — if no pending request matches, route to registered notify listeners (unsolicited events: find-phone, music control, camera, device status, etc.).

> **Implementation note (from our Python client):** unsolicited notifications are handled cleanly by keying a `_pending` dict on the command byte, so solicited responses and spontaneous events don't collide.

### 2.5 Multi-packet responses

Some responses span several 16-byte packets. Byte 1 is typically a **packet index**. `acceptData()` returns `true` until the last packet. An index of `0xFF` commonly signals end-of-data.

---

## 3. Data Encoding Conventions

### 3.1 BCD (Binary-Coded Decimal) — all date/time fields

```python
def to_bcd(n: int) -> int:
    return ((n // 10) << 4) | (n % 10)

def from_bcd(b: int) -> int:
    return ((b >> 4) & 0x0F) * 10 + (b & 0x0F)
```

### 3.2 Multi-byte integers — big-endian

```python
def bytes2_to_int(b): return (b[0] << 8) | b[1]
def bytes3_to_int(b): return (b[0] << 16) | (b[1] << 8) | b[2]
```

Used for steps, calories, distance (3-byte) and durations, goals (2-byte).

---

## 4. Connection & Initialization Sequence

1. **Scan** for the ring (name prefixes `R02`, `R03`, `R06`, `R09`, `R12`, `COLMI`, …) or by MAC.
2. **Connect** via GATT (transport LE).
3. **Discover services** — wait for `onServicesDiscovered()`.
4. **Enable notifications** — write `01 00` to the CCCD of the primary notify characteristic (`6e400003`).
5. **Negotiate packet length** — the ring may send an unsolicited `CMD_PACKAGE_LENGTH (0x2F)`; parse via `PackageLengthRsp` and call `JPackageManager.setLength()`. Default/minimum 20 bytes.
6. **Read device info** — HW (`2A27`) and FW (`2A26`) revision characteristics.
7. **Enable large-data notify** — write `01 00` to the CCCD of the serial-port notify characteristic (`de5bf729`).
8. **Sync time** — send `CMD_SET_DEVICE_TIME (0x01)`.
9. **Normal operation** — send commands, handle responses and notifications.

---

## 5. Command Reference (Primary Channel)

Direction: **App→Ring** = phone-initiated; **Ring→App** = unsolicited notification; **App↔Ring** = read/write setting.

### 5.1 System

#### Set Time — `0x01` (App→Ring)
```
Byte 0 : 0x01
Byte 1 : BCD(year % 100)     e.g. 0x26 for 2026
Byte 2 : BCD(month)
Byte 3 : BCD(day)
Byte 4 : BCD(hour)           24-hour
Byte 5 : BCD(minute)
Byte 6 : BCD(second)
Byte 7 : language_code       (see table)
Byte 8-14 : 0x00
```
**Response:** byte 0 = `0x01`, byte 1 = status (0 = OK).

**Language codes:** 0 zh-CN · 1 en · 2 zh-TW · 3 el · 4 fr · 5 de · 6 it · 7 es · 8 nl · 9 pt · 10 ru · 11 tr · 12 ja · 13 ko · 14 pl · 16 ar · 17 th · 18 vi · 19 id · 20 hi.

#### Read Battery — `0x03` (App→Ring)
**Request:** `make_packet(0x03)` → **Response:** byte 1 = battery level (0–100).

#### Set Phone OS — `0x04`
Byte 1 = os_type (1 = Android, 2 = iOS).

#### Reboot — `0x08` · Ring reboots and disconnects.

#### Get Time Format — `0x0A` → byte 1 = format (0 = 24h, 1 = 12h).

#### Enter OTA/DFU — `0x0F` (`TO_OTA`) · Ring enters firmware-update mode.

#### Bind Confirmation — `0x10` · Sent after initial setup.

#### Package Length — `0x2F` (Ring→App, unsolicited) · byte 1 = proposed length.

#### Factory Reset — `0xFF` (`CMD_RE_STORE`).

#### Test Mode — `0xC9` enter / `0xCA` exit (factory test).

### 5.2 Health Monitoring

#### Start Real-Time Measurement — `0x69` (App→Ring)
```
Byte 0 : 0x69
Byte 1 : action        1=start, 2=pause, 3=continue, 4=stop
Byte 2 : reading_type  1=HR, 2=BP, 3=SpO2, 4=Fatigue, 5=HealthCheck,
                       7=ECG, 8=Stress, 9=BloodSugar, 10=HRV
```

> **⚠ CAPTURE-VERIFIED — heart-rate streaming.** The APK implies that starting a real-time HR measurement produces separate `0x1E` (`CMD_REAL_TIME_HEART_RATE`) notifications. In practice, on the rings we've captured, the ring streams **repeated `0x69` response packets** rather than distinct `0x1E` notifications, and the **BPM value sits at `data[3]`** of those `0x69` packets. Implement HR streaming by reading `data[3]` from the repeated `0x69` responses; treat the `0x1E`-notification model below as the app-side assumption, not observed behavior. A value of 0 = sensor still warming up.

#### Real-Time Data Notification — `0x1E` (Ring→App) *(app-side model)*
```
Byte 0 : 0x1E
Byte 1 : reading_type
Byte 2 : value (bpm / % / …)   value 0 = warming up
```

#### Stop Real-Time — `0x6A`.

#### Read Heart-Rate History — `0x15` (App→Ring, multi-packet)
Request: byte 1 = day_offset (0 = today).
```
Packet 0 (header):  byte1=0x00 index, byte2=total_packets, byte3=sample_interval_min (typ. 5)
Packet 1:           byte1=0x01, byte2-5=UTC timestamp (LE, secs since epoch), byte6-14=HR values
Packets 2+:         byte1=index, byte2-14=HR values (13 per packet)
```
HR = 0 → no measurement that slot. ~288 samples/day at 5-min spacing. Final index = `total_packets − 1`; `0xFF` index = end.

#### HR Auto-Monitor Settings — `0x16`
Read: byte 1 = 0. Write: byte 1 = 1, byte 2 = enable, byte 3 = interval_min.

#### Read Blood Pressure — `0x14` (multi-packet, byte 1 = day_offset).
#### BP Monitor Toggle — `0x0C` (byte 1 = enable).
#### Auto SpO2 — `0x2C` (byte 1 = enable).
#### Stress Read — `0x37` (byte 1 = day_offset). Stress Toggle — `0x36` (byte 1 = enable).
#### ECG Start — `0x6C`; waveform via `0x6D`; PPG waveform via `0x6E`; ECG status `0x6F`; ECG duration `0x70`.

> **Firmware-handler note (R12):** at the firmware dispatch level, per-day stress retrieval is handled by an internal `get_stress_data_for_day_handler` reached on cmd `0x39` — distinct from the app-level `0x36`/`0x37` constants above. Relevant when hooking, not when speaking the stock protocol.

### 5.3 Activity & Sleep

#### Read Total Steps for Day — `0x07` (multi-packet, 2 packets)
Request: byte 1 = day_offset.
```
Packet 0: b1=0x00 idx, b2=days_ago(BCD), b3=year(BCD +2000), b4=month(BCD), b5=day(BCD),
          b6-8 = total_steps (BE), b9-11 = running_steps (BE), b12-14 = calories (BE)
Packet 1: b1=0x01 idx, b2=days_ago(BCD), b3-5 = date(BCD),
          b6-8 = walk_distance m (BE), b9-10 = sport_duration min (BE), b11-12 = sleep_duration min (BE)
```

#### Today's Steps — `0x48`.
#### Detailed Step Data — `0x43` (multi-packet, byte 1 = day_offset).
#### Sleep Data — `0x44` (multi-packet; deep/light/awake phases).
#### Query Data Availability — `0x46` → bitmask of which day-offsets have stored data.

### 5.4 Device Settings

| Setting | Cmd | Key fields |
|---------|-----|-----------|
| Set Alarm | `0x23` | idx(0–7), enable, hour(BCD), min(BCD), repeat_mask (bit0=Mon…bit6=Sun) |
| Read Alarms | `0x24` | — |
| Step Goal | `0x21` | b1=0 read /1 write, b2-3 goal in hundreds (80 = 8000) |
| Sedentary Reminder set | `0x25` | enable, start h/m(BCD), end h/m(BCD), interval_min |
| Sedentary read | `0x26` | — |
| Drink Reminder | `0x27` / `0x28` | same shape as sedentary |
| Notification Filter | `0x60` set / `0x61` read | b1-2 bitmask of enabled types |
| Screen Brightness | `0x1B` | read |
| Display Timeout | `0x1F` | b1 = timeout_seconds |
| Watch Face | `0x12` | b1 = face_index |
| Screen Orientation | `0x29` | b1 = 0/1 |
| Temperature Unit | `0x19` | b1 = 0 °C / 1 °F |
| Wrist-Raise Wake | `0x05` | b1 = enable |
| Do Not Disturb | `0x06` | b1 = enable |

> **Note:** `0x06` = `CMD_MUTE` (Do-Not-Disturb) in the **stock** protocol. On our **modified RF03 firmware**, `0x06` is repurposed as the custom memory-access primitive — see §7. Don't conflate the two.

### 5.5 Phone Interaction

#### Push Notification — `0x72` (multi-packet for long text)
```
Byte 0 : 0x72
Byte 1 : notification_type   0=SMS,1=QQ,2=WeChat,3=WhatsApp,4=Facebook,5=Twitter,6=Skype,7=Line,8=Instagram…
Byte 2 : text_length
Byte 3-14 : UTF-8 text (up to 12 bytes/packet)
```
Max text 64 bytes (`STRING_LIMITE`).

#### Phone Call — `0x11` (b1: 1=incoming, 2=hangup, then caller name/number).
#### Find Phone — `0x22` (Ring→App; play sound/vibrate).
#### Find Ring / Anti-Lost — `0x50` (makes ring vibrate).
#### Camera Shutter — `0x02` (Ring→App; b1=1 take photo).
#### Music Control — `0x1D` (Ring→App; 1=play/pause, 2=next, 3=prev, 4=vol+, 5=vol−).
#### Music Control Enable — `0x1C` (b1 = enable).

### 5.6 Weather — `0x1A`
```
Byte 1 : current_temp (signed int8 °C)
Byte 2 : weather_type (0=sunny,1=cloudy,2=rain,…)
Byte 3 : low_temp
Byte 4 : high_temp
```

### 5.7 Device Notifications — `0x73` (Ring→App, unsolicited)
`b1 = sub_type`, then data. Dispatched to a `DeviceNotifyListener`; sub-types include charging status, wear detection, other state changes.

### 5.8 Sport Sessions
Phone sport data `0x77`; ring session notifications `0x78`.

---

## 6. Large Data Channel Protocol

Variable-length packets on the serial-port service. **6-byte header:**

```
Byte:  [ 0 ] [ 1 ] [ 2-3 ] [ 4-5 ] [ 6 ] … [ N ]
Field: MAGIC ACTION LENGTH  CRC16   ...payload...
```

| Field | Size | Description |
|-------|------|-------------|
| Magic | 1 | Always `0xBC` (188; signed −68) |
| Action | 1 | Data-type ID |
| Length | 2 | Payload length, big-endian |
| CRC-16 | 2 | CRC-16/MODBUS of payload, big-endian. `0xFF 0xFF` if no payload. |
| Payload | N | Data |

### 6.1 CRC-16/MODBUS (poly `0xA001`, init `0xFFFF`)

```python
def crc16_modbus(data: bytes) -> int:
    crc = 0xFFFF
    for byte in data:
        crc ^= byte
        for _ in range(8):
            crc = (crc >> 1) ^ 0xA001 if (crc & 1) else (crc >> 1)
    return crc & 0xFFFF
```

### 6.2 Building a packet

```python
def make_large_packet(action: int, payload: bytes = b"") -> bytes:
    h = bytearray(6)
    h[0], h[1] = 0xBC, action
    if payload:
        h[2] = (len(payload) >> 8) & 0xFF
        h[3] = len(payload) & 0xFF
        crc = crc16_modbus(payload)
        h[4] = (crc >> 8) & 0xFF
        h[5] = crc & 0xFF
        return bytes(h) + payload
    h[4] = h[5] = 0xFF
    return bytes(h)
```

### 6.3 Reassembly

Packets split across BLE notifications (MTU, default 20 bytes, negotiable via `0x2F`). Receiver: (1) detect new frame when `byte[0] == 0xBC` and length ≥ 6; (2) read payload length from bytes 2–3; (3) if it all arrived in one notification, parse; (4) else buffer and concatenate until `total_received − 6 == payload_length`.

### 6.4 Action IDs

| ID | Hex | Constant | Description |
|----|-----|----------|-------------|
| 32 | 0x20 | ACTION_Location | Location data |
| 39 | 0x27 | ACTION_New_Sleep | Sleep (new format) |
| 40 | 0x28 | ACTION_ManualHeartRate | Manual HR readings |
| 41 | 0x29 | ACTION_Contacts_New | Contact sync |
| 42 | 0x2A | ACTION_Blood_Oxygen | SpO2 history |
| 44 | 0x2C | ACTION_Alarm | Alarm (new format) |
| 45 | 0x2D | ACTION_Contact | Contact (old format) |
| 46 | 0x2E | ACTION_BT_MAC | Classic BT MAC query |
| 47 | 0x2F | ACTION_E_CARD | E-Card / QR code |
| 58 | 0x3A | ACTION_Custom_WatchFace | Custom watch face |
| 71 | 0x47 | ACTION_Blood_Sugar | Blood sugar |
| 72 | 0x48 | ACTION_GPS_Navigation | GPS navigation |
| 74 | 0x4A | ACTION_AVATAR_Device | Device nickname/avatar |

---

## 7. Custom Firmware Extension — Memory Primitive (RF03) 🛠

**Not part of the stock protocol.** This is a primitive added by our modified RF03 firmware, repurposing command **`0x06`** (stock `CMD_MUTE`) as a BLE-accessible memory read/write/echo interface. Handler at `0x0081FA10`; dispatch table at `0x0081F058`, slot 6 (`0x0081F070`).

Subcommands: **read / write / echo**. Usable read payload per response is **12 bytes** (payload bytes 3–14, *not* 13 — verified). Python client exposes `read_mem()`, `read_mem_large()`, `write_mem()`, `write_mem_large()` alongside `battery()`.

> **Portability:** the equivalent primitive does **not** yet exist on the RTL8762C (R12) — it depends on landing the code-cave hook first. Until then, only stock commands work on R12.

---

## 8. Security Model

There is effectively **no security**:

- **No pairing/bonding** — any device may connect.
- **No encryption** — all BLE traffic is plaintext.
- **No authentication** — any connected peer can issue commands.
- **No firmware signing on RF03** — unsigned OTA images are accepted. *(RTL8762C differs: its ROM bootloader validates SHA256 fields and rejects stale/invalid images.)*

The only practical protection is short BLE range.

---

## 9. Minimal Working Example (bleak)

```python
import asyncio
from bleak import BleakClient

SERVICE     = "6e40fff0-b5a3-f393-e0a9-e50e24dcca9e"
WRITE_CHAR  = "6e400002-b5a3-f393-e0a9-e50e24dcca9e"
NOTIFY_CHAR = "6e400003-b5a3-f393-e0a9-e50e24dcca9e"

def make_packet(cmd, payload=b""):
    pkt = bytearray(16)
    pkt[0] = cmd
    pkt[1:1+len(payload)] = payload[:14]
    pkt[15] = sum(pkt[:15]) & 0xFF
    return bytes(pkt)

def on_notify(_sender, data):
    cmd = data[0] & 0x7F
    if cmd == 0x69:                       # HR stream: BPM at data[3] (capture-verified)
        print("HR bpm:", data[3])
    else:
        print(f"cmd=0x{cmd:02x} data={data.hex()}")

async def main():
    async with BleakClient("XX:XX:XX:XX:XX:XX") as client:
        await client.start_notify(NOTIFY_CHAR, on_notify)
        await client.write_gatt_char(WRITE_CHAR, make_packet(0x03))              # battery
        await asyncio.sleep(2)
        await client.write_gatt_char(WRITE_CHAR, make_packet(0x69, b"\x01\x01")) # start HR
        await asyncio.sleep(30)
        await client.write_gatt_char(WRITE_CHAR, make_packet(0x6A))              # stop

asyncio.run(main())
```

---

## 10. Quick Command Index

`0x01` set time · `0x02` camera↑ · `0x03` battery · `0x04` phone OS · `0x05` wrist-raise · `0x06` DND *(custom: mem)* · `0x07` day steps · `0x08` reboot · `0x0A` time format · `0x0C` BP toggle · `0x0F` OTA · `0x10` bind · `0x11` call · `0x12` watch face · `0x14` BP data · `0x15` HR history · `0x16` HR auto · `0x19` temp unit · `0x1A` weather · `0x1B` brightness · `0x1C` music enable · `0x1D` music↑ · `0x1E` realtime data↑ · `0x1F` display timeout · `0x21` goal · `0x22` find phone↑ · `0x23/0x24` alarm · `0x25/0x26` sedentary · `0x27/0x28` drink · `0x29` orientation · `0x2C` auto SpO2 · `0x2F` pkt length↑ · `0x36/0x37` stress · `0x43` step detail · `0x44` sleep · `0x46` data avail · `0x48` today steps · `0x50` find ring · `0x60/0x61` notif filter · `0x69` start realtime · `0x6A` stop realtime · `0x6C` ECG start · `0x6D` ECG↑ · `0x6E` PPG↑ · `0x72` push notif · `0x73` device notif↑ · `0x77/0x78` sport · `0xC9/0xCA` test mode · `0xFF` factory reset.
(↑ = unsolicited ring→app)
