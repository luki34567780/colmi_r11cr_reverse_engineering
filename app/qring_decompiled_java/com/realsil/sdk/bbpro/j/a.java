package com.realsil.sdk.bbpro.j;

/* loaded from: /tmp/dex/classes2.dex */
public final class a {
    public byte a;
    public byte b;
    public byte c;
    public byte d;
    public int e;
    public int f;
    public boolean g;
    public int h;

    public a(byte b, byte b2, byte b3, byte b4, int i, int i2, boolean z, int i3) {
        this.a = b;
        this.b = b2;
        this.c = b3;
        this.d = b4;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i3;
    }

    public static com.realsil.sdk.bbpro.j.a a(byte[] bArr) {
        boolean z;
        byte b;
        int length = bArr != null ? bArr.length : 0;
        if (length < 5) {
            return null;
        }
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        byte b4 = bArr[2];
        byte b5 = (byte) ((b4 & com.realsil.sdk.bbpro.params.Mmi.AU_MMI_START_ROLESWAP) >> 4);
        byte b6 = (byte) (b4 & 15);
        byte b7 = bArr[3];
        byte b8 = bArr[4];
        if (length >= 6) {
            boolean z2 = (bArr[5] & 255) != 255;
            b = bArr[5];
            z = z2;
        } else {
            z = false;
            b = 0;
        }
        return new com.realsil.sdk.bbpro.j.a(b2, b3, b5, b6, b7, b8, z, b);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BudInfoReportEvent{");
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\n\tbudType=%02X, activeBud=%02X", java.lang.Byte.valueOf(this.a), java.lang.Byte.valueOf(this.b)));
        sb.append(java.lang.String.format(locale, "\n\tLCH: channel=%02X, battery=%d(0x%02X) }", java.lang.Byte.valueOf(this.c), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.e)));
        sb.append(java.lang.String.format(locale, "\n\tRCH: channel=%02X, battery=%d(0x%02X) }", java.lang.Byte.valueOf(this.d), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(this.f)));
        if (this.g) {
            sb.append(java.lang.String.format(locale, "\n\tCASE: battery=%d(0x%02X) }", java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(this.h)));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public com.realsil.sdk.bbpro.model.DeviceStatusInfo a() {
        return new com.realsil.sdk.bbpro.model.DeviceStatusInfo(this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.h);
    }
}
