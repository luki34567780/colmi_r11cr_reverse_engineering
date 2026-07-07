package com.realsil.sdk.bbpro.llapt;

/* loaded from: /tmp/dex/classes2.dex */
public class LlAptBrightnessStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus> CREATOR = new com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus.a();
    public static final byte INVALID_MAIN_LEVEL = -1;
    public static final short INVALID_SUB_VOLUME = -1;
    public byte a;
    public byte b;
    public short c;
    public short d;
    public boolean e;

    public class a implements android.os.Parcelable.Creator<com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus[] newArray(int i) {
            return new com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus[i];
        }
    }

    public LlAptBrightnessStatus(byte b, byte b2, short s, short s2, boolean z) {
        this.a = b;
        this.b = b2;
        this.c = s;
        this.d = s2;
        this.e = z;
    }

    public static com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus builder(byte[] bArr) {
        if (bArr == null || bArr.length < 6) {
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus(wrap.get(), wrap.get(), wrap.getShort(), wrap.getShort(), bArr.length >= 7 && (wrap.get() & 1) == 1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte getMainLchLevel() {
        return this.a;
    }

    public byte getMainRchLevel() {
        return this.b;
    }

    public short getSubLchLevel() {
        return this.c;
    }

    public short getSubRchLevel() {
        return this.d;
    }

    public boolean isRwsSyncEnabled() {
        return this.e;
    }

    public java.lang.String toString() {
        return "LlAptBrightnessStatus{" + java.lang.String.format(java.util.Locale.US, "\n\nL=%d(%d), R=%d(%d), rwsSyncEnabled=%b", java.lang.Byte.valueOf(this.a), java.lang.Short.valueOf(this.c), java.lang.Byte.valueOf(this.b), java.lang.Short.valueOf(this.d), java.lang.Boolean.valueOf(this.e)) + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.a);
        parcel.writeByte(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public LlAptBrightnessStatus(android.os.Parcel parcel) {
        this.e = false;
        this.a = parcel.readByte();
        this.b = parcel.readByte();
        this.c = (short) parcel.readInt();
        this.d = (short) parcel.readInt();
        this.e = parcel.readByte() != 0;
    }
}
