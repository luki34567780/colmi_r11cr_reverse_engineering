package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class d {
    public int a;
    public int b;
    public int c;
    public int d;

    public d(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static com.realsil.sdk.bbpro.equalizer.d a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid params");
            return null;
        }
        return new com.realsil.sdk.bbpro.equalizer.d(1, 0, bArr[0], bArr.length >= 2 ? bArr[1] : (byte) 254);
    }

    public static com.realsil.sdk.bbpro.equalizer.d b(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid params");
            return null;
        }
        int length = bArr.length;
        return new com.realsil.sdk.bbpro.equalizer.d(0, length >= 2 ? bArr[1] : (byte) 0, bArr[0], length >= 3 ? bArr[2] : (byte) 254);
    }

    public java.lang.String toString() {
        return "EqIndexEvent {" + java.lang.String.format(java.util.Locale.US, "\n\teqType=0x%02X, eqMode=0x%02X, eqIndex=%d, scene=%d", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)) + "\n}";
    }

    public com.realsil.sdk.bbpro.equalizer.EqEntryIndex a() {
        return new com.realsil.sdk.bbpro.equalizer.EqEntryIndex(this.a, this.b, this.c, this.d);
    }
}
