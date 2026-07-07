package com.realsil.sdk.bbpro.b;

/* loaded from: /tmp/dex/classes2.dex */
public final class a {
    public byte a;
    public byte b;

    public a(byte b, byte b2) {
        this.a = b;
        this.b = b2;
    }

    public static com.realsil.sdk.bbpro.b.a a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new com.realsil.sdk.bbpro.b.a(wrap.get(), wrap.get());
    }

    public java.lang.String toString() {
        return "AptNrOnOffEvent {" + java.lang.String.format(java.util.Locale.US, "\n\tstatus=0x%02X, state=0x%02X", java.lang.Byte.valueOf(this.a), java.lang.Byte.valueOf(this.b)) + "\n}";
    }

    public boolean a() {
        return this.b == 1;
    }
}
