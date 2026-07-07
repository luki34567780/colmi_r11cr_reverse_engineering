package com.realsil.sdk.bbpro.i;

/* loaded from: /tmp/dex/classes2.dex */
public final class c {
    public static final com.realsil.sdk.bbpro.i.c c = new com.realsil.sdk.bbpro.i.c(0, 0);
    public int a;
    public int b;

    public c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "CmdSetInfo{ cmdSetVersion=0x%04X, eqSpecVersion=0x%04X }", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b));
    }

    public static com.realsil.sdk.bbpro.i.c a(byte[] bArr) {
        int length = bArr.length;
        int i = 1;
        int i2 = 0;
        if (bArr[1] == 0) {
            int i3 = length >= 4 ? ((bArr[2] << 8) | (bArr[3] & 255)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER : 0;
            if (length >= 6) {
                i = ((bArr[5] & 255) | (bArr[4] << 8)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
            } else {
                if (i3 != 0 && i3 != 1) {
                    if (i3 != 256) {
                        if (i3 == 257) {
                            i2 = i3;
                            i = 2;
                        } else if (i3 == 258) {
                            i2 = i3;
                            i = 3;
                        } else if (i3 == 259) {
                            i2 = i3;
                            i = 4;
                        } else if (i3 == 260) {
                            i2 = i3;
                            i = 5;
                        }
                        return new com.realsil.sdk.bbpro.i.c(i2, i);
                    }
                }
                i2 = i3;
            }
            i2 = i3;
            return new com.realsil.sdk.bbpro.i.c(i2, i);
        }
        i = 0;
        return new com.realsil.sdk.bbpro.i.c(i2, i);
    }
}
