package com.realsil.sdk.bbpro.d;

/* loaded from: /tmp/dex/classes2.dex */
public final class b {
    public int a;
    public int b;

    public b(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public static com.realsil.sdk.bbpro.d.b a(byte[] bArr) {
        if ((bArr != null ? bArr.length : 0) < 3) {
            return null;
        }
        return new com.realsil.sdk.bbpro.d.b(((bArr[1] & 255) | (bArr[2] << 8)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER, bArr[0] & 255);
    }

    public java.lang.String toString() {
        return "LowLatencyLevelReport{" + java.lang.String.format(java.util.Locale.US, "\n\tlatencyValue=%d, currentLatencyLevel=%d }", java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.a)) + "\n}";
    }
}
