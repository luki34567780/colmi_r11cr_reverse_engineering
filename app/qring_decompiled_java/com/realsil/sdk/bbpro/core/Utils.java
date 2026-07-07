package com.realsil.sdk.bbpro.core;

/* loaded from: /tmp/dex/classes2.dex */
public class Utils {
    public static android.os.ParcelUuid byteArrayToUuid(byte[] bArr) {
        if (bArr == null || bArr.length < 16) {
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.BIG_ENDIAN);
        return new android.os.ParcelUuid(new java.util.UUID(wrap.getLong(0), wrap.getLong(8)));
    }

    public static android.os.ParcelUuid[] byteArrayToUuids(byte[] bArr) {
        int length = bArr.length / 16;
        android.os.ParcelUuid[] parcelUuidArr = new android.os.ParcelUuid[length];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.BIG_ENDIAN);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            parcelUuidArr[i2] = new android.os.ParcelUuid(new java.util.UUID(wrap.getLong(i), wrap.getLong(i + 8)));
            i += 16;
        }
        return parcelUuidArr;
    }

    public static boolean checkUuid(android.os.ParcelUuid[] parcelUuidArr, java.util.UUID uuid, boolean z) {
        android.os.ParcelUuid byteArrayToUuid;
        if (uuid != null && parcelUuidArr != null && parcelUuidArr.length > 0) {
            for (android.os.ParcelUuid parcelUuid : parcelUuidArr) {
                if (parcelUuid != null) {
                    if (uuid.equals(parcelUuid.getUuid())) {
                        return true;
                    }
                    if (!com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.is16BitUuid(parcelUuid) && !com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.is32BitUuid(parcelUuid) && z && (byteArrayToUuid = byteArrayToUuid(com.realsil.sdk.core.utility.DataConverter.reverse(uuidToByteArray(parcelUuid)))) != null && uuid.equals(byteArrayToUuid.getUuid())) {
                        com.realsil.sdk.core.logger.ZLogger.v("match reverse uuid:" + parcelUuid.toString());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static android.os.ParcelUuid getUuid(android.os.ParcelUuid[] parcelUuidArr, java.util.UUID uuid, boolean z) {
        android.os.ParcelUuid byteArrayToUuid;
        if (uuid != null && parcelUuidArr != null && parcelUuidArr.length > 0) {
            for (android.os.ParcelUuid parcelUuid : parcelUuidArr) {
                if (parcelUuid != null) {
                    if (uuid.equals(parcelUuid.getUuid())) {
                        return parcelUuid;
                    }
                    if (!com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.is16BitUuid(parcelUuid) && !com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.is32BitUuid(parcelUuid) && z && (byteArrayToUuid = byteArrayToUuid(com.realsil.sdk.core.utility.DataConverter.reverse(uuidToByteArray(parcelUuid)))) != null && uuid.equals(byteArrayToUuid.getUuid())) {
                        com.realsil.sdk.core.logger.ZLogger.v("match reverse uuid:" + byteArrayToUuid.toString());
                        return byteArrayToUuid;
                    }
                }
            }
        }
        return null;
    }

    public static byte[] uuidToByteArray(android.os.ParcelUuid parcelUuid) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16);
        allocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        java.util.UUID uuid = parcelUuid.getUuid();
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        allocate.putLong(mostSignificantBits);
        allocate.putLong(8, leastSignificantBits);
        return allocate.array();
    }
}
