package com.realsil.sdk.bbpro.vp;

/* loaded from: classes3.dex */
public class VpVolumeInfo implements android.os.Parcelable {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean rwsSyncEnabled;
    public boolean rwsSyncSupported;
    public static final com.realsil.sdk.bbpro.vp.VpVolumeInfo DEFAULT = new com.realsil.sdk.bbpro.vp.VpVolumeInfo();
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.vp.VpVolumeInfo> CREATOR = new com.realsil.sdk.bbpro.vp.VpVolumeInfo.a();

    public class a implements android.os.Parcelable.Creator<com.realsil.sdk.bbpro.vp.VpVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.vp.VpVolumeInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.vp.VpVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.vp.VpVolumeInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.vp.VpVolumeInfo[i];
        }
    }

    public VpVolumeInfo() {
        this.rwsSyncSupported = false;
        this.rwsSyncEnabled = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getLeftCurVolumeLevel() {
        return this.c;
    }

    public int getLeftMaxVolumeLevel() {
        return this.b;
    }

    public int getLeftMinVolumeLevel() {
        return this.a;
    }

    public int getRightCurVolumeLevel() {
        return this.f;
    }

    public int getRightMaxVolumeLevel() {
        return this.e;
    }

    public int getRightMinVolumeLevel() {
        return this.d;
    }

    public int getSyncMaxVolumeLevel() {
        return this.h;
    }

    public int getSyncMinVolumeLevel() {
        return this.g;
    }

    public boolean isRwsSyncEnabled() {
        return this.rwsSyncEnabled;
    }

    public boolean isRwsSyncSupported() {
        return this.rwsSyncSupported;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VpVolumeInfo {");
        sb.append(java.lang.String.format("\n\trwsSyncSupported=%b", java.lang.Boolean.valueOf(this.rwsSyncSupported)));
        if (this.rwsSyncSupported) {
            sb.append(java.lang.String.format(java.util.Locale.US, "\n\t\trwsSyncEnabled=%b, min=%d, max=%d", java.lang.Boolean.valueOf(this.rwsSyncEnabled), java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.h)));
        }
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\n\tLCH: min=%d, max=%d, cur=%d", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c)));
        sb.append(java.lang.String.format(locale, "\n\tRCH: min=%d, max=%d, cur=%d", java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f)));
        sb.append("\n}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeByte(this.rwsSyncSupported ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.rwsSyncEnabled ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }

    public VpVolumeInfo(int i, int i2, byte b, int i3, int i4, byte b2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.e = i4;
        this.rwsSyncSupported = z;
        this.rwsSyncEnabled = z2;
        if (!z || !z2) {
            b = b == -1 ? (byte) 0 : b;
            b2 = b2 == -1 ? (byte) 0 : b2;
            this.c = b & 255;
            this.f = b2 & 255;
        } else if (b != -1) {
            int i5 = b & 255;
            this.c = i5;
            this.f = i5;
        } else {
            int i6 = b2 & 255;
            this.c = i6;
            this.f = i6;
        }
        this.h = java.lang.Math.min(i2, i4);
        this.g = java.lang.Math.max(i, i3);
    }

    public VpVolumeInfo(android.os.Parcel parcel) {
        this.rwsSyncSupported = false;
        this.rwsSyncEnabled = false;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.rwsSyncSupported = parcel.readByte() != 0;
        this.rwsSyncEnabled = parcel.readByte() != 0;
        this.g = parcel.readInt();
        this.h = parcel.readInt();
    }
}
