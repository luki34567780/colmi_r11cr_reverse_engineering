package com.realsil.sdk.core.bluetooth.scanner;

/* loaded from: classes3.dex */
public final class ScannerParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.core.bluetooth.scanner.ScannerParams> CREATOR = new com.realsil.sdk.core.bluetooth.scanner.ScannerParams.a();
    public static final int SCAN_MECHANISM_ALL = 0;
    public static final int SCAN_MECHANISM_FILTER_ONE = 1;
    public static final int SCAN_MODE_DUAL = 0;
    public static final int SCAN_MODE_GATT = 17;
    public static final int SCAN_MODE_GATT_STRICT = 18;
    public static final int SCAN_MODE_SPP = 32;
    public static final int SCAN_MODE_SPP_STRICT = 33;
    public int a;
    public int b;
    public java.lang.String c;
    public boolean d;
    public boolean e;
    public java.lang.String f;
    public int g;
    public long h;
    public boolean i;
    public long j;
    public boolean k;
    public int l;
    public boolean m;
    public int n;
    public android.os.ParcelUuid[] o;
    public java.util.List<com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter> p;

    public class a implements android.os.Parcelable.Creator<com.realsil.sdk.core.bluetooth.scanner.ScannerParams> {
        @Override // android.os.Parcelable.Creator
        public final com.realsil.sdk.core.bluetooth.scanner.ScannerParams createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.core.bluetooth.scanner.ScannerParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final com.realsil.sdk.core.bluetooth.scanner.ScannerParams[] newArray(int i) {
            return new com.realsil.sdk.core.bluetooth.scanner.ScannerParams[i];
        }
    }

    public ScannerParams() {
        this(0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getAddressFilter() {
        return this.f;
    }

    public long getAutoScanDelay() {
        return this.j;
    }

    public int getFilterProfile() {
        return this.n;
    }

    public android.os.ParcelUuid[] getFilterUuids() {
        return this.o;
    }

    public java.lang.String getNameFilter() {
        return this.c;
    }

    public int getPhy() {
        return this.l;
    }

    public int getRssiFilter() {
        return this.g;
    }

    public java.util.List<com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter> getScanFilters() {
        return this.p;
    }

    public int getScanMechanism() {
        return this.b;
    }

    public int getScanMode() {
        return this.a;
    }

    public long getScanPeriod() {
        return this.h;
    }

    public boolean isAutoDiscovery() {
        return this.i;
    }

    public boolean isConnectable() {
        return this.m;
    }

    public boolean isNameFuzzyMatchEnable() {
        return this.d;
    }

    public boolean isNameNullable() {
        return this.e;
    }

    public boolean isReusePairedDeviceEnabled() {
        return this.k;
    }

    public void setAddressFilter(java.lang.String str) {
        this.f = str;
    }

    public void setAutoDiscovery(boolean z) {
        this.i = z;
    }

    public void setAutoScanDelay(long j) {
        this.j = j;
    }

    public void setConnectable(boolean z) {
        this.m = z;
    }

    public void setFilterProfile(int i) {
        this.n = i;
    }

    public void setFilterUuids(android.os.ParcelUuid[] parcelUuidArr) {
        this.o = parcelUuidArr;
    }

    public void setNameFilter(java.lang.String str) {
        this.c = str;
    }

    public void setNameFuzzyMatchEnable(boolean z) {
        this.d = z;
    }

    public void setNameNullable(boolean z) {
        this.e = z;
    }

    public void setPhy(int i) {
        this.l = i;
    }

    public void setReusePairedDeviceEnabled(boolean z) {
        this.k = z;
    }

    public void setRssiFilter(int i) {
        this.g = i;
    }

    public void setScanFilters(java.util.List<com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter> list) {
        this.p = list;
    }

    public void setScanMechanism(int i) {
        this.b = i;
    }

    public void setScanMode(int i) {
        this.a = i;
    }

    public void setScanPeriod(long j) {
        this.h = j;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScannerParams{");
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\n\tscanMode:%d,scanMechanism:%d,scanPeriod=%d", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Long.valueOf(this.h)));
        sb.append(java.lang.String.format(locale, "\n\tfilterProfile=%d", java.lang.Integer.valueOf(this.n)));
        sb.append(java.lang.String.format(locale, "\n\tnameFilter:%s,nameFuzzyMatchEnable=%b,nameNullable=%b", this.c, java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(this.e)));
        sb.append(java.lang.String.format(locale, "\n\tautoDiscovery:%b,autoScanDelay=%d", java.lang.Boolean.valueOf(this.i), java.lang.Long.valueOf(this.j)));
        sb.append("\n}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.j);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.n);
        parcel.writeTypedArray(this.o, i);
        parcel.writeTypedList(this.p);
    }

    public ScannerParams(int i) {
        this.a = 0;
        this.b = 0;
        this.d = false;
        this.e = true;
        this.g = -1000;
        this.h = androidx.work.WorkRequest.MIN_BACKOFF_MILLIS;
        this.j = 6000L;
        this.k = true;
        this.l = 255;
        this.m = true;
        this.p = new java.util.ArrayList();
        this.a = i;
        this.i = false;
        this.b = 0;
    }

    public ScannerParams(android.os.Parcel parcel) {
        this.a = 0;
        this.b = 0;
        this.d = false;
        this.e = true;
        this.g = -1000;
        this.h = androidx.work.WorkRequest.MIN_BACKOFF_MILLIS;
        this.j = 6000L;
        this.k = true;
        this.l = 255;
        this.m = true;
        this.p = new java.util.ArrayList();
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readLong();
        this.i = parcel.readByte() != 0;
        this.j = parcel.readLong();
        this.k = parcel.readByte() != 0;
        this.l = parcel.readInt();
        this.m = parcel.readByte() != 0;
        this.n = parcel.readInt();
        this.o = (android.os.ParcelUuid[]) parcel.createTypedArray(android.os.ParcelUuid.CREATOR);
        this.p = parcel.createTypedArrayList(com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.CREATOR);
    }
}
