package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public class c {
    public int a;
    public int b;
    public boolean c;
    public byte d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    public c(int i, boolean z, int i2, int i3) {
        this.r = 0;
        this.g = i;
        this.c = z;
        this.a = i2;
        this.b = i3;
    }

    public static com.realsil.sdk.bbpro.equalizer.c a(int i, byte[] bArr) {
        return i >= 512 ? b(bArr) : a(bArr);
    }

    public static com.realsil.sdk.bbpro.equalizer.c b(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byte b = wrap.get();
        int i = wrap.get() & 255;
        int i2 = wrap.get() & 255;
        short s = wrap.getShort();
        short s2 = wrap.getShort();
        short s3 = wrap.getShort();
        short s4 = wrap.getShort();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            if (((s >> i7) & 1) == 1) {
                i3++;
            }
            if (((s2 >> i7) & 1) == 1) {
                i4++;
            }
            if (((s3 >> i7) & 1) == 1) {
                i6++;
            }
            if (((s4 >> i7) & 1) == 1) {
                i5++;
            }
        }
        return new com.realsil.sdk.bbpro.equalizer.c(b == 1, wrap.get(), wrap.getShort(), i, wrap.get() & 255, i3, s, wrap.get() & 255, i4, s2, wrap.get() & 255, i5, s4, wrap.get() & 255, i2, wrap.get() & 255, i6, s3, wrap.get() & 255);
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "EqBasicInfo{spkActiveMode=%d, state=%b, entryNumber=%d, activeIndex=%d}", java.lang.Integer.valueOf(this.g), java.lang.Boolean.valueOf(this.c), java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b));
    }

    public static com.realsil.sdk.bbpro.equalizer.c a(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            int i = bArr[0] & 255;
            byte b = bArr[1];
            return new com.realsil.sdk.bbpro.equalizer.c(i, b == 1, bArr[2] & 255, bArr[3] & 255);
        }
        com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
        return null;
    }

    public c(boolean z, byte b, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.c = z;
        this.d = b;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = i11;
        this.p = i12;
        this.q = i13;
        this.r = i14;
        this.s = i15;
        this.t = i16;
        this.u = i17;
    }
}
