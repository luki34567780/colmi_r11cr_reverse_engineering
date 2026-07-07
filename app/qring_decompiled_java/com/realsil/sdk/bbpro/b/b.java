package com.realsil.sdk.bbpro.b;

/* loaded from: /tmp/dex/classes2.dex */
public final class b {
    public int a;

    public b(int i) {
        this.a = i;
    }

    public static com.realsil.sdk.bbpro.b.b a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new com.realsil.sdk.bbpro.b.b(wrap.get());
    }

    public java.lang.String toString() {
        return "AptPowerOnDelayTimeEvent {" + java.lang.String.format(java.util.Locale.US, "\n\ttime=0x%02X(%d)", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.a)) + "\n}";
    }

    public int a() {
        return this.a;
    }
}
