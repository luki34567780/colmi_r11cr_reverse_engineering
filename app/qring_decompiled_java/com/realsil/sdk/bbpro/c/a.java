package com.realsil.sdk.bbpro.c;

/* loaded from: /tmp/dex/classes2.dex */
public class a {
    public int a;
    public byte b;
    public byte c;
    public byte[] d;
    public int e;

    public byte a() {
        return this.b;
    }

    public boolean b(byte[] bArr) {
        if (bArr == null || bArr.length < 3) {
            com.realsil.sdk.core.logger.ZLogger.w("invalid AudioEq:" + com.realsil.sdk.core.utility.DataConverter.bytes2Hex(bArr));
            return false;
        }
        this.a = bArr[0] & 255;
        this.b = bArr[1];
        this.c = bArr[2];
        int length = bArr.length - 3;
        this.e = length;
        if (length > 0) {
            byte[] bArr2 = new byte[length];
            this.d = bArr2;
            java.lang.System.arraycopy(bArr, 3, bArr2, 0, length);
        }
        return true;
    }

    public byte[] c() {
        return this.d;
    }

    public static com.realsil.sdk.bbpro.c.a a(byte[] bArr) {
        com.realsil.sdk.bbpro.c.a aVar = new com.realsil.sdk.bbpro.c.a();
        if (aVar.b(bArr)) {
            return aVar;
        }
        return null;
    }

    public byte[] c(byte[] bArr) {
        if (bArr == null) {
            return this.d;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[this.e + length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        java.lang.System.arraycopy(this.d, 0, bArr2, length, this.e);
        return bArr2;
    }

    public byte b() {
        return this.c;
    }
}
