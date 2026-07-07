package com.realsil.sdk.bbpro.llapt;

/* loaded from: /tmp/dex/classes2.dex */
public final class LlAptBrightnessInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo> CREATOR = new com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo.a();
    public static final byte INVALID_BRIGHTNESS_LEVEL = -1;
    public static final byte INVALID_BRIGHTNESS_MAIN = -1;
    public static final short INVALID_BRIGHTNESS_SUB = -1;
    public static final short INVALID_BRIGHTNESS_WEIGHT = -1;
    public int a;
    public byte b;
    public byte c;
    public int d;
    public short e;
    public short f;
    public boolean g;
    public boolean h;

    public class a implements android.os.Parcelable.Creator<com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo[i];
        }
    }

    public LlAptBrightnessInfo(int i, int i2, byte b, short s, byte b2, short s2, boolean z, boolean z2) {
        this.a = i;
        this.b = b;
        this.c = b2;
        this.d = i2;
        this.e = s;
        this.f = s2;
        this.g = z;
        this.h = z2;
    }

    public static com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo builder(byte[] bArr) {
        boolean z;
        if (bArr == null || bArr.length < 9) {
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
        boolean z2 = true;
        if (bArr.length < 10) {
            z2 = false;
        } else if ((wrap.get() & 1) == 1) {
            z = true;
            return new com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo(i, i2, b, s, b2, s2, z2, z);
        }
        z = false;
        return new com.realsil.sdk.bbpro.llapt.LlAptBrightnessInfo(i, i2, b, s, b2, s2, z2, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getLchMinLevel() {
        return 0;
    }

    public int getLchMinWeight() {
        return 0;
    }

    public int getMainLchLevel() {
        byte b = this.b;
        if (b == -1) {
            return 0;
        }
        return b & (-1);
    }

    public int getMainMaxLevel() {
        return this.a;
    }

    public int getMainRchLevel() {
        byte b = this.c;
        if (b == -1) {
            return 0;
        }
        return b & (-1);
    }

    public int getSubLchLevel() {
        short s = this.e;
        if (s == -1) {
            return 0;
        }
        return s & (-1);
    }

    public int getSubMaxLevel() {
        return this.d;
    }

    public int getSubRchLevel() {
        short s = this.f;
        if (s == -1) {
            return 0;
        }
        return s & (-1);
    }

    public boolean isRwsSyncEnabled() {
        return this.h;
    }

    public boolean isRwsSyncSupported() {
        return this.g;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LlAptBrightnessInfo {");
        if (this.g) {
            sb.append(java.lang.String.format("\n\trwsSyncEnabled=%b", java.lang.Boolean.valueOf(this.h)));
        } else {
            sb.append(java.lang.String.format("\n\trwsSyncSupported=%b", java.lang.Boolean.FALSE));
        }
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\n\tMain (L:%d,R:%d)/%d,", java.lang.Byte.valueOf(this.b), java.lang.Byte.valueOf(this.c), java.lang.Integer.valueOf(this.a)));
        sb.append(java.lang.String.format(locale, "\n\tSub (L:%d,R:%d)/%d,", java.lang.Short.valueOf(this.e), java.lang.Short.valueOf(this.f), java.lang.Integer.valueOf(this.d)));
        sb.append("\n}");
        return sb.toString();
    }

    public void updateLlAptBrighenessStatus(com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus llAptBrightnessStatus) {
        boolean isRwsSyncEnabled = llAptBrightnessStatus.isRwsSyncEnabled();
        this.h = isRwsSyncEnabled;
        if (!isRwsSyncEnabled) {
            if (llAptBrightnessStatus.getMainLchLevel() != -1) {
                this.b = llAptBrightnessStatus.getMainLchLevel();
            }
            if (llAptBrightnessStatus.getMainRchLevel() != -1) {
                this.c = llAptBrightnessStatus.getMainRchLevel();
            }
            if (llAptBrightnessStatus.getSubLchLevel() != -1) {
                this.e = llAptBrightnessStatus.getSubLchLevel();
            }
            if (llAptBrightnessStatus.getSubRchLevel() != -1) {
                this.f = llAptBrightnessStatus.getSubRchLevel();
                return;
            }
            return;
        }
        if (llAptBrightnessStatus.getMainLchLevel() != -1) {
            this.b = llAptBrightnessStatus.getMainLchLevel();
            this.c = llAptBrightnessStatus.getMainLchLevel();
        } else {
            this.b = llAptBrightnessStatus.getMainRchLevel();
            this.c = llAptBrightnessStatus.getMainRchLevel();
        }
        if (llAptBrightnessStatus.getMainLchLevel() != -1) {
            this.e = llAptBrightnessStatus.getSubLchLevel();
            this.f = llAptBrightnessStatus.getSubLchLevel();
        } else {
            this.e = llAptBrightnessStatus.getSubRchLevel();
            this.f = llAptBrightnessStatus.getSubRchLevel();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByte(this.b);
        parcel.writeByte(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
    }

    public LlAptBrightnessInfo(android.os.Parcel parcel) {
        this.g = false;
        this.h = false;
        this.a = parcel.readInt();
        this.b = parcel.readByte();
        this.c = parcel.readByte();
        this.d = parcel.readInt();
        this.e = (short) parcel.readInt();
        this.f = (short) parcel.readInt();
        this.g = parcel.readByte() != 0;
        this.h = parcel.readByte() != 0;
    }
}
