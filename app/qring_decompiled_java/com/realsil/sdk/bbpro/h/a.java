package com.realsil.sdk.bbpro.h;

/* loaded from: /tmp/dex/classes2.dex */
public final class a {
    public int a;

    public a(int i) {
        this.a = i;
    }

    public static com.realsil.sdk.bbpro.h.a a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new com.realsil.sdk.bbpro.h.a(wrap.get() & 255);
    }

    public java.lang.String toString() {
        return "GetMultilinkConnNumRsp {" + java.lang.String.format(java.util.Locale.US, "\n\tconnNum=%d", java.lang.Integer.valueOf(this.a)) + "\n}";
    }
}
