package com.realsil.sdk.bbpro.hearing;

/* loaded from: /tmp/dex/classes2.dex */
public final class a {
    public byte a;
    public int b;

    public a(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public static com.realsil.sdk.bbpro.hearing.a a(byte[] bArr) {
        if ((bArr != null ? bArr.length : 0) < 2) {
            return null;
        }
        return new com.realsil.sdk.bbpro.hearing.a(bArr[0], bArr[1] & 255);
    }

    public java.lang.String toString() {
        return "ListeningModeStateReport{" + java.lang.String.format(java.util.Locale.US, "\n\tmode=%02X, activeGroupIndex=%d }", java.lang.Byte.valueOf(this.a), java.lang.Integer.valueOf(this.b)) + "\n}";
    }
}
