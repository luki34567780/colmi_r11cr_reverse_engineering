package com.realsil.sdk.bbpro.apt;

/* loaded from: /tmp/dex/classes2.dex */
public final class AptVolumeStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.apt.AptVolumeStatus> CREATOR = new com.realsil.sdk.bbpro.apt.AptVolumeStatus.a();
    public static final byte INVALID_MAIN_VOLUME = -1;
    public static final short INVALID_SUB_VOLUME = -1;
    public int a;
    public int b;
    public int c;
    public int d;

    public class a implements android.os.Parcelable.Creator<com.realsil.sdk.bbpro.apt.AptVolumeStatus> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.apt.AptVolumeStatus createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.apt.AptVolumeStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.apt.AptVolumeStatus[] newArray(int i) {
            return new com.realsil.sdk.bbpro.apt.AptVolumeStatus[i];
        }
    }

    public AptVolumeStatus(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static com.realsil.sdk.bbpro.apt.AptVolumeStatus builder(byte[] bArr) {
        if (bArr.length < 6) {
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byte b = wrap.get();
        short s = wrap.getShort();
        byte b2 = wrap.get();
        short s2 = wrap.getShort();
        if (b == -1) {
            b = 0;
        }
        if (s == -1) {
            s = 0;
        }
        if (b2 == -1) {
            b2 = 0;
        }
        if (s2 == -1) {
            s2 = 0;
        }
        return new com.realsil.sdk.bbpro.apt.AptVolumeStatus(b, s, b2, s2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getMainLchVolumeLevel() {
        return this.a;
    }

    public int getMainRchVolumeLevel() {
        return this.c;
    }

    public int getSubLchVolumeLevel() {
        return this.b;
    }

    public int getSubRchVolumeLevel() {
        return this.d;
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "Volume:  L=%d(%d), R=%d(%d)", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public AptVolumeStatus(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
