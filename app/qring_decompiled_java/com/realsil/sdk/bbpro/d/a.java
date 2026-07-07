package com.realsil.sdk.bbpro.d;

/* loaded from: /tmp/dex/classes2.dex */
public final class a {
    public boolean a;
    public int b;
    public int c;
    public int d;

    public a(boolean z, int i, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static com.realsil.sdk.bbpro.d.a a(byte[] bArr) {
        int i;
        int length = bArr != null ? bArr.length : 0;
        if (length < 1) {
            return null;
        }
        boolean z = bArr[0] == 1;
        int i2 = length >= 3 ? ((bArr[2] << 8) | (bArr[1] & 255)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER : 0;
        int i3 = -1;
        if (length >= 5) {
            i3 = bArr[3] & 255;
            i = bArr[4] & 255;
        } else {
            i = -1;
        }
        return new com.realsil.sdk.bbpro.d.a(z, i2, i3, i);
    }

    public java.lang.String toString() {
        return "LowLatencyInfo{" + java.lang.String.format(java.util.Locale.US, "\n\tenabled=%b, latencyValue=%d, maxLatencyLevel=%d, currentLatencyLevel=%d }", java.lang.Boolean.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)) + "\n}";
    }
}
