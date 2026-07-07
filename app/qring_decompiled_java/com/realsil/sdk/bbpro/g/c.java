package com.realsil.sdk.bbpro.g;

/* loaded from: /tmp/dex/classes2.dex */
public final class c {
    public byte a;
    public byte b;
    public short c;
    public byte d;
    public short e;
    public boolean f;

    public c(byte b, byte b2, short s, byte b3, short s2, boolean z) {
        this.a = b;
        this.b = b2;
        this.c = s;
        this.d = b3;
        this.e = s2;
        this.f = z;
    }

    public static com.realsil.sdk.bbpro.g.c a(byte[] bArr) {
        if (bArr == null || bArr.length < 7) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new com.realsil.sdk.bbpro.g.c(wrap.get(), wrap.get(), wrap.getShort(), wrap.get(), wrap.getShort(), bArr.length >= 8 && (wrap.get() & 1) == 1);
    }

    public boolean b() {
        return this.a == 0;
    }

    public java.lang.String toString() {
        return "SetLlAptBrightnessRsp {" + java.lang.String.format(java.util.Locale.US, "\n\tresult=0x%02X, L=(%d/%d), R=(%d/%d), rwsSyncEnabled=%b", java.lang.Byte.valueOf(this.a), java.lang.Byte.valueOf(this.b), java.lang.Short.valueOf(this.c), java.lang.Byte.valueOf(this.d), java.lang.Short.valueOf(this.e), java.lang.Boolean.valueOf(this.f)) + "\n}";
    }

    public com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus a() {
        return new com.realsil.sdk.bbpro.llapt.LlAptBrightnessStatus(this.b, this.d, this.c, this.e, this.f);
    }
}
