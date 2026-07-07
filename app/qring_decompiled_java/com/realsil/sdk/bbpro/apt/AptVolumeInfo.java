package com.realsil.sdk.bbpro.apt;

/* loaded from: /tmp/dex/classes2.dex */
public final class AptVolumeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.apt.AptVolumeInfo> CREATOR = new com.realsil.sdk.bbpro.apt.AptVolumeInfo.a();
    public static final byte INVALID_MAIN_VOLUME = -1;
    public static final short INVALID_SUB_VOLUME = -1;
    public static final int RWS_SYNC_APT_VOLME_ENABLED = 1;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public class a implements android.os.Parcelable.Creator<com.realsil.sdk.bbpro.apt.AptVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.apt.AptVolumeInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.apt.AptVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.apt.AptVolumeInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.apt.AptVolumeInfo[i];
        }
    }

    public AptVolumeInfo(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this.a = i;
        this.b = i3;
        this.c = i5;
        this.d = i2;
        this.e = i4;
        this.f = i6;
        this.g = z;
        this.h = z2;
    }

    public static com.realsil.sdk.bbpro.apt.AptVolumeInfo builder(byte[] bArr) {
        boolean z;
        boolean z2;
        if (bArr.length < 9) {
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int i = wrap.get() & 255;
        int i2 = wrap.getShort() & 65535;
        byte b = wrap.get();
        short s = wrap.getShort();
        byte b2 = wrap.get();
        short s2 = wrap.getShort();
        if (b == -1) {
            b = 0;
        }
        short s3 = s == -1 ? (short) 0 : s;
        byte b3 = b2 == -1 ? (byte) 0 : b2;
        short s4 = s2 == -1 ? (short) 0 : s2;
        if (bArr.length < 10) {
            z = false;
        } else {
            if ((wrap.get() & 255) == 1) {
                z = true;
                z2 = true;
                return new com.realsil.sdk.bbpro.apt.AptVolumeInfo(i, i2, b, s3, b3, s4, z, z2);
            }
            z = true;
        }
        z2 = false;
        return new com.realsil.sdk.bbpro.apt.AptVolumeInfo(i, i2, b, s3, b3, s4, z, z2);
    }

    public static com.realsil.sdk.bbpro.apt.AptVolumeInfo builderV1(byte[] bArr) {
        if (bArr.length < 3) {
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int i = wrap.get(1) & 255;
        int i2 = wrap.get(2) & 255;
        return new com.realsil.sdk.bbpro.apt.AptVolumeInfo(i2, i2, i, i, i, i, false, false);
    }

    public static com.realsil.sdk.bbpro.apt.AptVolumeInfo builderV2(byte[] bArr) {
        if (bArr.length < 1) {
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int i = wrap.get() & 15;
        return new com.realsil.sdk.bbpro.apt.AptVolumeInfo(15, 15, i, i, i, i, false, false);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getMainLchVolumeLevel() {
        return this.b;
    }

    public int getMainMaxVolumeLevel() {
        return this.a;
    }

    public int getMainRchVolumeLevel() {
        return this.c;
    }

    public int getMainVolumeLevel() {
        return this.b;
    }

    public int getSubLchVolumeLevel() {
        return this.e;
    }

    public int getSubMaxVolumeLevel() {
        return this.d;
    }

    public int getSubRchVolumeLevel() {
        return this.f;
    }

    public boolean isRwsSyncEnabled() {
        return this.h;
    }

    public boolean isRwsSyncSupported() {
        return this.g;
    }

    public void setRwsSyncEnabled(boolean z) {
        this.h = z;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AptVolumeInfo {");
        boolean z = this.g;
        if (z) {
            sb.append(java.lang.String.format(java.util.Locale.US, "\n\trwsSyncSupported=%b", java.lang.Boolean.valueOf(z)));
        } else {
            sb.append(java.lang.String.format(java.util.Locale.US, "\n\trwsSyncSupported=%b, enabled:%b", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(this.h)));
        }
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\n\tLevel (L:%d,R:%d)/%d,", java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.a)));
        sb.append(java.lang.String.format(locale, "\n\tStep (L:%d,R:%d)/%d,", java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(this.d)));
        sb.append("\n}");
        return sb.toString();
    }

    public void updateAptVolumeStatus(com.realsil.sdk.bbpro.apt.AptVolumeStatus aptVolumeStatus) {
        this.b = aptVolumeStatus.getMainLchVolumeLevel();
        this.c = aptVolumeStatus.getMainRchVolumeLevel();
        this.e = aptVolumeStatus.getSubLchVolumeLevel();
        this.f = aptVolumeStatus.getSubRchVolumeLevel();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
    }

    public AptVolumeInfo(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readByte() != 0;
        this.h = parcel.readByte() != 0;
    }
}
