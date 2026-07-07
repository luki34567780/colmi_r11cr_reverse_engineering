package com.realsil.sdk.core.bluetooth.scanner;

/* loaded from: classes3.dex */
public final class SpecScanRecord {
    public final int a;
    public final java.util.List<android.os.ParcelUuid> b;
    public final android.util.SparseArray<byte[]> c;
    public final java.util.Map<android.os.ParcelUuid, byte[]> d;
    public final int e;
    public final java.lang.String f;
    public final byte[] g;

    public SpecScanRecord(java.util.List<android.os.ParcelUuid> list, android.util.SparseArray<byte[]> sparseArray, java.util.Map<android.os.ParcelUuid, byte[]> map, int i, int i2, java.lang.String str, byte[] bArr) {
        this.b = list;
        this.c = sparseArray;
        this.d = map;
        this.f = str;
        this.a = i;
        this.e = i2;
        this.g = bArr;
    }

    public static int a(byte[] bArr, int i, int i2, int i3, java.util.List<android.os.ParcelUuid> list) {
        while (i2 > 0) {
            list.add(com.realsil.sdk.core.bluetooth.utils.BluetoothUuid.parseUuidFrom(a(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord parseFromBytes(byte[] r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord.parseFromBytes(byte[]):com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord");
    }

    public int getAdvertiseFlags() {
        return this.a;
    }

    public byte[] getBytes() {
        return this.g;
    }

    public java.lang.String getDeviceName() {
        return this.f;
    }

    public android.util.SparseArray<byte[]> getManufacturerSpecificData() {
        return this.c;
    }

    public java.util.Map<android.os.ParcelUuid, byte[]> getServiceData() {
        return this.d;
    }

    public java.util.List<android.os.ParcelUuid> getServiceUuids() {
        return this.b;
    }

    public int getTxPowerLevel() {
        return this.e;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("ScanRecord [mAdvertiseFlags=");
        a.append(this.a);
        a.append(", mServiceUuids=");
        a.append(this.b);
        a.append("\n, mManufacturerSpecificData=");
        a.append(com.realsil.sdk.core.f.b.a(this.c));
        a.append(", mServiceData=");
        a.append(com.realsil.sdk.core.f.b.a(this.d));
        a.append(", mTxPowerLevel=");
        a.append(this.e);
        a.append(", mDeviceName=");
        a.append(this.f);
        a.append("]");
        return a.toString();
    }

    public byte[] getManufacturerSpecificData(int i) {
        android.util.SparseArray<byte[]> sparseArray = this.c;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    public byte[] getServiceData(android.os.ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            return null;
        }
        return this.d.get(parcelUuid);
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
