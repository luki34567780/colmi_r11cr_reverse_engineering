package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class GetEqIndexParameterReq {
    public int a;
    public int b;
    public int c;
    public int d;

    public static class Builder {
        public int a = 2;
        public int b;
        public int c;
        public int d;

        public Builder(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public com.realsil.sdk.bbpro.equalizer.GetEqIndexParameterReq build() {
            return new com.realsil.sdk.bbpro.equalizer.GetEqIndexParameterReq(this.a, this.b, this.c, this.d);
        }

        public com.realsil.sdk.bbpro.equalizer.GetEqIndexParameterReq.Builder eqBud(int i) {
            this.a = i;
            return this;
        }
    }

    public final byte[] a(int i) {
        return new byte[]{4, 2, (byte) (i & 255)};
    }

    public final byte[] a(int i, int i2) {
        return new byte[]{4, 2, (byte) (i2 & 255), (byte) (i & 255)};
    }

    public final byte[] a(int i, int i2, int i3) {
        return new byte[]{4, 2, (byte) (i3 & 255), (byte) (i & 255), (byte) (i2 & 255)};
    }

    public final byte[] a(int i, int i2, int i3, int i4) {
        return new byte[]{4, 2, (byte) (i4 & 255), (byte) (i & 255), (byte) (i2 & 255), (byte) (i3 & 255)};
    }

    public byte[] encode(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return a(this.d);
        }
        if (i == 4 || i == 5 || i == 256 || i == 257) {
            return a(this.c, this.d);
        }
        if (i == 258) {
            return a(this.b, this.c, this.d);
        }
        if (i >= 512) {
            return a(this.a, this.b, this.c, this.d);
        }
        com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format("invalid specVersion:0x%04X", java.lang.Integer.valueOf(i)));
        return null;
    }

    public int getEqIndex() {
        return this.d;
    }

    public int getEqMode() {
        return this.c;
    }

    public int getEqType() {
        return this.b;
    }

    public java.lang.String toString() {
        return "GetEqIndexParameterReq {" + java.lang.String.format(java.util.Locale.US, "\neqType=%d,eqMode=%d,eqIndex=%d", java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)) + "\n}";
    }

    public GetEqIndexParameterReq(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
