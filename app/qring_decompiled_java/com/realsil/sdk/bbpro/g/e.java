package com.realsil.sdk.bbpro.g;

/* loaded from: /tmp/dex/classes2.dex */
public final class e {
    public byte a;

    public e(byte b) {
        this.a = b;
    }

    public static com.realsil.sdk.bbpro.g.e a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return new com.realsil.sdk.bbpro.g.e(wrap.get());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetLlAptScenarioChooseTryRsp {");
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.a == 0);
        sb.append(java.lang.String.format(locale, "\n\tsuccess=%b", objArr));
        sb.append("\n}");
        return sb.toString();
    }

    public boolean a() {
        return this.a == 0;
    }
}
