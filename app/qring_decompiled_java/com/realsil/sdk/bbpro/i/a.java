package com.realsil.sdk.bbpro.i;

/* loaded from: /tmp/dex/classes2.dex */
public final class a {
    public byte a;
    public byte[] b;

    public a(byte b, byte[] bArr) {
        this.a = b;
        this.b = bArr;
    }

    public int a() {
        byte[] bArr;
        if (3 != this.a || (bArr = this.b) == null || bArr.length < 4) {
            return 0;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return wrap.getShort();
    }

    public java.lang.String b() {
        byte[] bArr;
        return (4 != this.a || (bArr = this.b) == null || bArr.length <= 0) ? "" : new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8).trim();
    }

    public java.lang.String c() {
        byte[] bArr;
        return (2 != this.a || (bArr = this.b) == null || bArr.length <= 0) ? "" : new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8).trim();
    }

    public java.lang.String d() {
        byte[] bArr;
        return (5 != this.a || (bArr = this.b) == null || bArr.length <= 0) ? "" : new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8).trim();
    }

    public java.lang.String e() {
        byte[] bArr;
        return (this.a != 0 || (bArr = this.b) == null || bArr.length <= 0) ? "" : new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8).trim();
    }

    public java.lang.String f() {
        byte[] bArr;
        return (1 != this.a || (bArr = this.b) == null || bArr.length <= 0) ? "" : new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8).trim();
    }

    public int g() {
        byte[] bArr = this.b;
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return wrap.getShort(2);
    }

    public java.lang.String h() {
        byte[] bArr;
        return (6 != this.a || (bArr = this.b) == null || bArr.length <= 0) ? "" : new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8).trim();
    }

    public byte i() {
        return this.a;
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "CfgSettingsInfo{ type=0x%04X, cfgData=%s }", java.lang.Byte.valueOf(this.a), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.b));
    }

    public static com.realsil.sdk.bbpro.i.a a(byte[] bArr) {
        byte[] b;
        if (bArr != null && bArr.length >= 1) {
            int length = bArr.length;
            byte b2 = bArr[0];
            if (b2 == 0) {
                if (length < 2) {
                    return null;
                }
                int i = bArr[1] & 255;
                if (length < i + 2) {
                    return null;
                }
                b = new byte[i];
                java.lang.System.arraycopy(bArr, 2, b, 0, i);
            } else if (1 == b2) {
                if (length < 2) {
                    return null;
                }
                int i2 = bArr[1] & 255;
                if (length < i2 + 2) {
                    return null;
                }
                b = new byte[i2];
                java.lang.System.arraycopy(bArr, 2, b, 0, i2);
            } else if (2 == b2) {
                if (length < 2) {
                    return null;
                }
                int i3 = bArr[1] & 255;
                if (length < i3 + 2) {
                    return null;
                }
                b = new byte[i3];
                java.lang.System.arraycopy(bArr, 2, b, 0, i3);
            } else if (3 == b2) {
                if (length < 5) {
                    return null;
                }
                b = new byte[4];
                java.lang.System.arraycopy(bArr, 1, b, 0, 4);
            } else if (4 == b2) {
                if (length < 2) {
                    return null;
                }
                int i4 = length - 1;
                byte[] bArr2 = new byte[i4];
                java.lang.System.arraycopy(bArr, 1, bArr2, 0, i4);
                b = b(bArr2);
            } else if (5 == b2) {
                if (length < 2) {
                    return null;
                }
                int i5 = length - 1;
                byte[] bArr3 = new byte[i5];
                java.lang.System.arraycopy(bArr, 1, bArr3, 0, i5);
                b = b(bArr3);
            } else {
                if (6 != b2 || length < 2) {
                    return null;
                }
                int i6 = length - 1;
                byte[] bArr4 = new byte[i6];
                java.lang.System.arraycopy(bArr, 1, bArr4, 0, i6);
                b = b(bArr4);
            }
            return new com.realsil.sdk.bbpro.i.a(b2, b);
        }
        return null;
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length && bArr[i2] != 0; i2++) {
            i++;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }
}
