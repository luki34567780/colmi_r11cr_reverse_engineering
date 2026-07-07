package com.realsil.sdk.core.bluetooth.utils;

/* loaded from: classes3.dex */
public final class BluetoothUuid {
    public static final android.os.ParcelUuid[] A2DP_SINK_PROFILE_UUIDS;
    public static final android.os.ParcelUuid[] A2DP_SRC_PROFILE_UUIDS;
    public static final android.os.ParcelUuid ADV_AUDIO_DIST;
    public static final android.os.ParcelUuid AUDIO_SINK;
    public static final android.os.ParcelUuid AUDIO_SOURCE;
    public static final android.os.ParcelUuid AVRCP_CONTROLLER;
    public static final android.os.ParcelUuid AVRCP_TARGET;
    public static final android.os.ParcelUuid BASE_UUID;
    public static final android.os.ParcelUuid BNEP;
    public static final android.os.ParcelUuid HANDSFREE;
    public static final android.os.ParcelUuid HANDSFREE_AG;
    public static final android.os.ParcelUuid[] HEADSET_PROFILE_UUIDS;
    public static final android.os.ParcelUuid HID;
    public static final android.os.ParcelUuid[] HID_PROFILE_UUIDS;
    public static final android.os.ParcelUuid HOGP;
    public static final android.os.ParcelUuid HSP;
    public static final android.os.ParcelUuid HSP_AG;
    public static final android.os.ParcelUuid MAP;
    public static final android.os.ParcelUuid MAS;
    public static final android.os.ParcelUuid MNS;
    public static final android.os.ParcelUuid NAP;
    public static final android.os.ParcelUuid[] NAP_PROFILE_UUIDS;
    public static final android.os.ParcelUuid OBEX_OBJECT_PUSH;
    public static final android.os.ParcelUuid[] OPP_PROFILE_UUIDS;
    public static final android.os.ParcelUuid PANU;
    public static final android.os.ParcelUuid[] PANU_PROFILE_UUIDS;
    public static final android.os.ParcelUuid PBAP_PCE;
    public static final android.os.ParcelUuid PBAP_PSE;
    public static final android.os.ParcelUuid[] RESERVED_UUIDS;
    public static final int UUID_BYTES_128_BIT = 16;
    public static final int UUID_BYTES_16_BIT = 2;
    public static final int UUID_BYTES_32_BIT = 4;

    static {
        android.os.ParcelUuid fromString = android.os.ParcelUuid.fromString("0000110B-0000-1000-8000-00805F9B34FB");
        AUDIO_SINK = fromString;
        android.os.ParcelUuid fromString2 = android.os.ParcelUuid.fromString("0000110A-0000-1000-8000-00805F9B34FB");
        AUDIO_SOURCE = fromString2;
        android.os.ParcelUuid fromString3 = android.os.ParcelUuid.fromString("0000110D-0000-1000-8000-00805F9B34FB");
        ADV_AUDIO_DIST = fromString3;
        android.os.ParcelUuid fromString4 = android.os.ParcelUuid.fromString("00001108-0000-1000-8000-00805F9B34FB");
        HSP = fromString4;
        HSP_AG = android.os.ParcelUuid.fromString("00001112-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid fromString5 = android.os.ParcelUuid.fromString("0000111E-0000-1000-8000-00805F9B34FB");
        HANDSFREE = fromString5;
        HANDSFREE_AG = android.os.ParcelUuid.fromString("0000111F-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid fromString6 = android.os.ParcelUuid.fromString("0000110E-0000-1000-8000-00805F9B34FB");
        AVRCP_CONTROLLER = fromString6;
        android.os.ParcelUuid fromString7 = android.os.ParcelUuid.fromString("0000110C-0000-1000-8000-00805F9B34FB");
        AVRCP_TARGET = fromString7;
        android.os.ParcelUuid fromString8 = android.os.ParcelUuid.fromString("00001105-0000-1000-8000-00805f9b34fb");
        OBEX_OBJECT_PUSH = fromString8;
        android.os.ParcelUuid fromString9 = android.os.ParcelUuid.fromString("00001124-0000-1000-8000-00805f9b34fb");
        HID = fromString9;
        HOGP = android.os.ParcelUuid.fromString("00001812-0000-1000-8000-00805f9b34fb");
        android.os.ParcelUuid fromString10 = android.os.ParcelUuid.fromString("00001115-0000-1000-8000-00805F9B34FB");
        PANU = fromString10;
        android.os.ParcelUuid fromString11 = android.os.ParcelUuid.fromString("00001116-0000-1000-8000-00805F9B34FB");
        NAP = fromString11;
        BNEP = android.os.ParcelUuid.fromString("0000000f-0000-1000-8000-00805F9B34FB");
        PBAP_PCE = android.os.ParcelUuid.fromString("0000112e-0000-1000-8000-00805F9B34FB");
        PBAP_PSE = android.os.ParcelUuid.fromString("0000112f-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid fromString12 = android.os.ParcelUuid.fromString("00001134-0000-1000-8000-00805F9B34FB");
        MAP = fromString12;
        android.os.ParcelUuid fromString13 = android.os.ParcelUuid.fromString("00001133-0000-1000-8000-00805F9B34FB");
        MNS = fromString13;
        android.os.ParcelUuid fromString14 = android.os.ParcelUuid.fromString("00001132-0000-1000-8000-00805F9B34FB");
        MAS = fromString14;
        BASE_UUID = android.os.ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
        HEADSET_PROFILE_UUIDS = new android.os.ParcelUuid[]{fromString4, fromString5};
        A2DP_SINK_PROFILE_UUIDS = new android.os.ParcelUuid[]{fromString, fromString3};
        A2DP_SRC_PROFILE_UUIDS = new android.os.ParcelUuid[]{fromString2};
        OPP_PROFILE_UUIDS = new android.os.ParcelUuid[]{fromString8};
        HID_PROFILE_UUIDS = new android.os.ParcelUuid[]{fromString9};
        PANU_PROFILE_UUIDS = new android.os.ParcelUuid[]{fromString10};
        NAP_PROFILE_UUIDS = new android.os.ParcelUuid[]{fromString11};
        RESERVED_UUIDS = new android.os.ParcelUuid[]{fromString, fromString2, fromString3, fromString4, fromString5, fromString6, fromString7, fromString8, fromString10, fromString11, fromString12, fromString13, fromString14};
    }

    public static boolean a(java.util.UUID uuid) {
        return (uuid.getMostSignificantBits() & (-281470681743361L)) == 0 && uuid.getLeastSignificantBits() == 0;
    }

    public static boolean containsAllUuids(android.os.ParcelUuid[] parcelUuidArr, android.os.ParcelUuid[] parcelUuidArr2) {
        if (parcelUuidArr == null && parcelUuidArr2 == null) {
            return true;
        }
        if (parcelUuidArr == null) {
            return parcelUuidArr2.length == 0;
        }
        if (parcelUuidArr2 == null) {
            return true;
        }
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(parcelUuidArr));
        for (android.os.ParcelUuid parcelUuid : parcelUuidArr2) {
            if (!hashSet.contains(parcelUuid)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsAnyUuid(android.os.ParcelUuid[] parcelUuidArr, android.os.ParcelUuid[] parcelUuidArr2) {
        if (parcelUuidArr == null && parcelUuidArr2 == null) {
            return true;
        }
        if (parcelUuidArr == null) {
            return parcelUuidArr2.length == 0;
        }
        if (parcelUuidArr2 == null) {
            return parcelUuidArr.length == 0;
        }
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(parcelUuidArr));
        for (android.os.ParcelUuid parcelUuid : parcelUuidArr2) {
            if (hashSet.contains(parcelUuid)) {
                return true;
            }
        }
        return false;
    }

    public static java.util.UUID fromShortValue(int i) {
        java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("0000");
        a.append(java.lang.String.format("%04X", java.lang.Integer.valueOf(i & 65535)));
        a.append("-0000-1000-8000-00805F9B34FB");
        return java.util.UUID.fromString(a.toString());
    }

    public static java.util.UUID fromString(java.lang.String str) {
        try {
            return java.util.UUID.fromString(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return java.util.UUID.fromString("0000" + str + "-0000-1000-8000-00805F9B34FB");
        }
    }

    public static int getServiceIdentifierFromParcelUuid(android.os.ParcelUuid parcelUuid) {
        return (int) ((parcelUuid.getUuid().getMostSignificantBits() & 281470681743360L) >>> 32);
    }

    public static boolean is16BitUuid(android.os.ParcelUuid parcelUuid) {
        java.util.UUID uuid = parcelUuid.getUuid();
        return uuid.getLeastSignificantBits() == BASE_UUID.getUuid().getLeastSignificantBits() && (uuid.getMostSignificantBits() & (-281470681743361L)) == android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
    }

    public static boolean is32BitUuid(android.os.ParcelUuid parcelUuid) {
        java.util.UUID uuid = parcelUuid.getUuid();
        return uuid.getLeastSignificantBits() == BASE_UUID.getUuid().getLeastSignificantBits() && !is16BitUuid(parcelUuid) && (uuid.getMostSignificantBits() & 4294967295L) == android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
    }

    public static boolean isAdvAudioDist(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(ADV_AUDIO_DIST);
    }

    public static boolean isAudioSink(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(AUDIO_SINK);
    }

    public static boolean isAudioSource(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(AUDIO_SOURCE);
    }

    public static boolean isAvrcpController(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(AVRCP_CONTROLLER);
    }

    public static boolean isAvrcpTarget(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(AVRCP_TARGET);
    }

    public static boolean isBnep(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(BNEP);
    }

    public static boolean isHandsfree(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(HANDSFREE);
    }

    public static boolean isHeadset(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(HSP);
    }

    public static boolean isInputDevice(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(HID);
    }

    public static boolean isMap(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(MAP);
    }

    public static boolean isMas(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(MAS);
    }

    public static boolean isMns(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(MNS);
    }

    public static boolean isNap(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(NAP);
    }

    public static boolean isPanu(android.os.ParcelUuid parcelUuid) {
        return parcelUuid.equals(PANU);
    }

    public static boolean isUuidPresent(android.os.ParcelUuid[] parcelUuidArr, android.os.ParcelUuid parcelUuid) {
        if ((parcelUuidArr == null || parcelUuidArr.length == 0) && parcelUuid == null) {
            return true;
        }
        if (parcelUuidArr == null) {
            return false;
        }
        for (android.os.ParcelUuid parcelUuid2 : parcelUuidArr) {
            if (parcelUuid2.equals(parcelUuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean matches(java.util.UUID uuid, java.util.UUID uuid2) {
        return (a(uuid) || a(uuid2)) ? (uuid.getMostSignificantBits() & 281470681743360L) == (uuid2.getMostSignificantBits() & 281470681743360L) : uuid.equals(uuid2);
    }

    public static android.os.ParcelUuid parcelFromShortValue(int i) {
        java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("0000");
        a.append(java.lang.String.format("%04X", java.lang.Integer.valueOf(i & 65535)));
        a.append("-0000-1000-8000-00805F9B34FB");
        return android.os.ParcelUuid.fromString(a.toString());
    }

    public static android.os.ParcelUuid parseUuidFrom(byte[] bArr) {
        long j;
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("uuidBytes cannot be null");
        }
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new java.lang.IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 16) {
            java.nio.ByteBuffer order = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            return new android.os.ParcelUuid(new java.util.UUID(order.getLong(8), order.getLong(0)));
        }
        if (length == 2) {
            j = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
        } else {
            j = ((bArr[3] & 255) << 24) + (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16);
        }
        android.os.ParcelUuid parcelUuid = BASE_UUID;
        return new android.os.ParcelUuid(new java.util.UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    public static android.os.ParcelUuid parseUuidReverse(byte[] bArr) {
        long j;
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("uuidBytes cannot be null");
        }
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new java.lang.IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 16) {
            java.nio.ByteBuffer order = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            return new android.os.ParcelUuid(new java.util.UUID(order.getLong(8), order.getLong(0)));
        }
        if (length == 2) {
            j = (bArr[1] & 255) + ((bArr[0] & 255) << 8);
        } else {
            j = ((bArr[0] & 255) << 24) + (bArr[3] & 255) + ((bArr[2] & 255) << 8) + ((bArr[1] & 255) << 16);
        }
        android.os.ParcelUuid parcelUuid = BASE_UUID;
        return new android.os.ParcelUuid(new java.util.UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    public static int toShortValue(java.util.UUID uuid) {
        return (int) ((uuid.getMostSignificantBits() >> 32) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }
}
