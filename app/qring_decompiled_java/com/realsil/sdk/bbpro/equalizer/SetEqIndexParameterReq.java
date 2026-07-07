package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class SetEqIndexParameterReq {
    public int a;
    public int b;
    public int c;
    public int d;
    public byte e;
    public byte[] f;
    public com.realsil.sdk.bbpro.equalizer.AudioEq g;
    public com.realsil.sdk.bbpro.equalizer.EqParameterInfo h;
    public boolean i;

    public static class FrameType {
        public static final int ABORT = 4;
        public static final int CONTINUE = 2;
        public static final int END = 3;
        public static final int SINGLE = 0;
        public static final int START = 1;
    }

    public final byte[] a(byte b, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        byte[] bArr2 = new byte[length + 4];
        bArr2[0] = 4;
        bArr2[1] = 2;
        bArr2[2] = (byte) length;
        bArr2[3] = b;
        if (length > 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 4, length);
        }
        return bArr2;
    }

    public final byte[] b(int i, byte b, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        int i2 = length + 1;
        byte[] bArr2 = new byte[length + 8];
        bArr2[0] = 3;
        bArr2[1] = 2;
        bArr2[2] = (byte) (i & 255);
        bArr2[3] = 0;
        bArr2[4] = 0;
        bArr2[5] = (byte) (i2 & 255);
        bArr2[6] = (byte) ((i2 >> 8) & 255);
        bArr2[7] = b;
        if (length > 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 8, length);
        }
        return bArr2;
    }

    public byte[] encode(int i) {
        if (i == 1) {
            return a(this.c, this.e, this.f);
        }
        if (i == 2 || i == 3) {
            return b(this.c, this.e, this.f);
        }
        if (i == 4 || i == 5) {
            return a(this.b, this.c, this.e, this.f);
        }
        if (i == 256 || i == 257) {
            return a(this.b, this.c, this.e, this.f, getParameterData(i));
        }
        if (i == 258) {
            return a(this.d, this.a, this.b, this.c, this.e, this.f, getParameterData(i));
        }
        if (i == 512) {
            return a(this.d, this.a, this.b, this.c, this.e, this.f, getParameterData(i), this.i);
        }
        if (com.realsil.sdk.bbpro.equalizer.EqUtils.isEditable(getEqIndex())) {
            return a(getSampleRate(), getEqData());
        }
        com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format("eqIndex(0x%04X) can not be changed", java.lang.Integer.valueOf(getEqIndex())));
        return null;
    }

    public byte[] getEqData() {
        return this.f;
    }

    public int getEqIndex() {
        return this.c;
    }

    public int getEqMode() {
        return this.b;
    }

    public int getEqType() {
        return this.a;
    }

    public byte[] getParameterData(int i) {
        com.realsil.sdk.bbpro.equalizer.EqParameterInfo eqParameterInfo = this.h;
        if (eqParameterInfo == null) {
            return null;
        }
        return eqParameterInfo.encode(i);
    }

    public byte getSampleRate() {
        return this.e;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetEqIndexParameterReq {");
        sb.append(java.lang.String.format(java.util.Locale.US, "\n\teqBud=%d,eqType=%d,eqMode=%d,eqIndex=%d,sampleRate=0x%02X", java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Byte.valueOf(this.e)));
        sb.append(java.lang.String.format("\n\teqData=%s", com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.f)));
        com.realsil.sdk.bbpro.equalizer.AudioEq audioEq = this.g;
        if (audioEq != null) {
            sb.append(java.lang.String.format("\n\t%s", audioEq.toString()));
        }
        com.realsil.sdk.bbpro.equalizer.EqParameterInfo eqParameterInfo = this.h;
        if (eqParameterInfo != null) {
            sb.append(java.lang.String.format("\n]t%s", eqParameterInfo.toString()));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public SetEqIndexParameterReq(int i, int i2, int i3, int i4, byte b, byte[] bArr, com.realsil.sdk.bbpro.equalizer.AudioEq audioEq, com.realsil.sdk.bbpro.equalizer.EqParameterInfo eqParameterInfo, boolean z) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.e = b;
        this.f = bArr;
        this.g = audioEq;
        this.h = eqParameterInfo;
        this.i = z;
    }

    public static class Builder {
        public int a;
        public int b;
        public int c;
        public int d;
        public byte e;
        public byte[] f;
        public com.realsil.sdk.bbpro.equalizer.AudioEq g;
        public com.realsil.sdk.bbpro.equalizer.EqParameterInfo h;
        public boolean i;

        public Builder() {
            this.a = 0;
            this.d = 2;
        }

        public com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq.Builder audioEq(com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
            this.g = audioEq;
            return this;
        }

        public com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq.Builder bud(int i) {
            this.d = i;
            return this;
        }

        public com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq build() {
            return new com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq(this.d, this.a, this.b, this.c, this.e, this.f, this.g, this.h, this.i);
        }

        public com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq.Builder eqData(byte[] bArr) {
            this.f = bArr;
            return this;
        }

        public com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq.Builder eqIndex(int i) {
            this.c = i;
            return this;
        }

        public com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq.Builder mode(int i) {
            this.b = i;
            return this;
        }

        public com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq.Builder parameterInfo(com.realsil.sdk.bbpro.equalizer.EqParameterInfo eqParameterInfo) {
            this.h = eqParameterInfo;
            return this;
        }

        public com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq.Builder sampleRate(byte b) {
            this.e = b;
            return this;
        }

        public com.realsil.sdk.bbpro.equalizer.SetEqIndexParameterReq.Builder saveEq(boolean z) {
            this.i = z;
            return this;
        }

        public Builder(int i, int i2, byte b) {
            this.d = 2;
            this.a = i;
            this.c = i2;
            this.e = b;
        }
    }

    public final byte[] a(int i, byte b, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        byte[] bArr2 = new byte[length + 5];
        bArr2[0] = 3;
        bArr2[1] = 2;
        bArr2[2] = (byte) (i & 255);
        bArr2[3] = (byte) ((length + 1) & 255);
        bArr2[4] = b;
        if (length > 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 5, length);
        }
        return bArr2;
    }

    public final byte[] a(int i, int i2, byte b, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        int i3 = length + 5;
        byte[] bArr2 = new byte[length + 13];
        bArr2[0] = 3;
        bArr2[1] = 2;
        bArr2[2] = (byte) (i2 & 255);
        bArr2[3] = (byte) (i & 255);
        bArr2[4] = 0;
        bArr2[5] = 0;
        bArr2[6] = (byte) (i3 & 255);
        bArr2[7] = (byte) ((i3 >> 8) & 255);
        bArr2[8] = b;
        bArr2[9] = 0;
        bArr2[10] = 0;
        bArr2[11] = 0;
        bArr2[12] = 1;
        if (length > 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 13, length);
        }
        return bArr2;
    }

    public final byte[] a(int i, int i2, byte b, byte[] bArr, byte[] bArr2) {
        int length = bArr != null ? bArr.length : 0;
        int length2 = bArr2 != null ? bArr2.length : 0;
        int i3 = length + 5 + length2;
        int i4 = length + 13;
        byte[] bArr3 = new byte[i4 + length2];
        bArr3[0] = 3;
        bArr3[1] = 2;
        bArr3[2] = (byte) (i2 & 255);
        bArr3[3] = (byte) (i & 255);
        bArr3[4] = 0;
        bArr3[5] = 0;
        bArr3[6] = (byte) (i3 & 255);
        bArr3[7] = (byte) ((i3 >> 8) & 255);
        bArr3[8] = b;
        bArr3[9] = 0;
        bArr3[10] = 0;
        bArr3[11] = 0;
        bArr3[12] = 1;
        if (length > 0) {
            java.lang.System.arraycopy(bArr, 0, bArr3, 13, length);
        }
        if (length2 > 0) {
            java.lang.System.arraycopy(bArr2, 0, bArr3, i4, length2);
        }
        return bArr3;
    }

    public final byte[] a(int i, int i2, int i3, int i4, byte b, byte[] bArr, byte[] bArr2) {
        int length = bArr != null ? bArr.length : 0;
        int length2 = bArr2 != null ? bArr2.length : 0;
        int i5 = length + 5 + length2;
        int i6 = length + 15;
        byte[] bArr3 = new byte[i6 + length2];
        bArr3[0] = 3;
        bArr3[1] = 2;
        bArr3[2] = (byte) (i4 & 255);
        bArr3[3] = (byte) (i & 255);
        bArr3[4] = (byte) (i2 & 255);
        bArr3[5] = (byte) (i3 & 255);
        bArr3[6] = 0;
        bArr3[7] = 0;
        bArr3[8] = (byte) (i5 & 255);
        bArr3[9] = (byte) ((i5 >> 8) & 255);
        bArr3[10] = b;
        if (i2 == 0) {
            bArr3[11] = 0;
            bArr3[12] = 0;
            bArr3[13] = 0;
            bArr3[14] = 1;
        } else if (i2 == 1) {
            bArr3[11] = 0;
            bArr3[12] = 0;
            bArr3[13] = 0;
            bArr3[14] = 2;
        }
        if (length > 0) {
            java.lang.System.arraycopy(bArr, 0, bArr3, 15, length);
        }
        if (length2 > 0) {
            java.lang.System.arraycopy(bArr2, 0, bArr3, i6, length2);
        }
        return bArr3;
    }

    public final byte[] a(int i, int i2, int i3, int i4, byte b, byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr != null ? bArr.length : 0;
        int length2 = bArr2 != null ? bArr2.length : 0;
        int i5 = length + 5 + length2;
        int i6 = length + 16;
        byte[] bArr3 = new byte[i6 + length2];
        bArr3[0] = 3;
        bArr3[1] = 2;
        bArr3[2] = (byte) (i4 & 255);
        bArr3[3] = (byte) (i & 255);
        bArr3[4] = (byte) (i2 & 255);
        bArr3[5] = (byte) (i3 & 255);
        if (z) {
            bArr3[6] = 1;
        } else {
            bArr3[6] = 0;
        }
        bArr3[7] = 0;
        bArr3[8] = 0;
        bArr3[9] = (byte) (i5 & 255);
        bArr3[10] = (byte) ((i5 >> 8) & 255);
        bArr3[11] = b;
        if (i2 == 0) {
            bArr3[12] = 0;
            bArr3[13] = 0;
            bArr3[14] = 0;
            bArr3[15] = 1;
        } else if (i2 == 1) {
            bArr3[12] = 0;
            bArr3[13] = 0;
            bArr3[14] = 0;
            bArr3[15] = 2;
        }
        if (length > 0) {
            java.lang.System.arraycopy(bArr, 0, bArr3, 16, length);
        }
        if (length2 > 0) {
            java.lang.System.arraycopy(bArr2, 0, bArr3, i6, length2);
        }
        return bArr3;
    }
}
