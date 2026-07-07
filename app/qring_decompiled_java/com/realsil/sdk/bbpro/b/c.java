package com.realsil.sdk.bbpro.b;

/* loaded from: /tmp/dex/classes2.dex */
public final class c {
    public byte a;
    public int b;
    public int c;
    public int d;
    public int e;

    public c(byte b, int i, int i2, int i3, int i4) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static com.realsil.sdk.bbpro.b.c a(byte[] bArr) {
        if (bArr == null || bArr.length < 7) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byte b = wrap.get();
        byte b2 = wrap.get();
        short s = wrap.getShort();
        byte b3 = wrap.get();
        short s2 = wrap.getShort();
        if (b2 == -1) {
            b2 = 0;
        }
        short s3 = s == -1 ? (short) 0 : s;
        byte b4 = b3 == -1 ? (byte) 0 : b3;
        if (s2 == -1) {
            s2 = 0;
        }
        return new com.realsil.sdk.bbpro.b.c(b, b2, s3, b4, s2);
    }

    public boolean b() {
        return this.a == 0;
    }

    public java.lang.String toString() {
        return "SetAptVolumeRsp {" + java.lang.String.format(java.util.Locale.US, "\n\tresult=0x%02X, L=(%d/%d), R=(%d/%d)", java.lang.Byte.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e)) + "\n}";
    }

    public com.realsil.sdk.bbpro.apt.AptVolumeStatus a() {
        return new com.realsil.sdk.bbpro.apt.AptVolumeStatus(this.b, this.c, this.d, this.e);
    }
}
