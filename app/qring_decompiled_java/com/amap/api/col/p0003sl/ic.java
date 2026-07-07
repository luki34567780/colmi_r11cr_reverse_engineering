package com.amap.api.col.p0003sl;

/* compiled from: AESMD5Util.java */
/* loaded from: classes.dex */
public final class ic {
    private static int a = 6;

    private static byte[] a() {
        try {
            return a("16,99,86,77,511,98,86,97,511,99,86,77,511,18,48,97,511,99,86,77,511,58,601,77,511,58,48,77,511,58,86,87,511,18,48,97,511,58,86,87,511,18,48,97,511,98,48,87,511,98,48,97,511,99,86,77,511,58,221,77,511,98,601,87");
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "AMU", "grk");
            return null;
        }
    }

    private static byte[] b() {
        try {
            return a("16,18,86,97,511,18,48,97,511,18,86,97,511,58,86,77,511,18,86,97,511,58,48,77,511,18,86,97,511,58,601,77,511,18,86,97,511,58,221,77,511,18,86,97,511,58,86,87,511,18,86,97,511,58,48,87,511,18,86,97,511,58,601,87");
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "AMU", "giv");
            return null;
        }
    }

    private static byte[] a(java.lang.String str) {
        try {
            java.lang.String[] split = new java.lang.StringBuffer(str).reverse().toString().split(",");
            int length = split.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = java.lang.Byte.parseByte(split[i]);
            }
            java.lang.String[] split2 = new java.lang.StringBuffer(new java.lang.String(com.amap.api.col.p0003sl.ji.a(new java.lang.String(bArr)), com.bumptech.glide.load.Key.STRING_CHARSET_NAME)).reverse().toString().split(",");
            byte[] bArr2 = new byte[split2.length];
            for (int i2 = 0; i2 < split2.length; i2++) {
                bArr2[i2] = java.lang.Byte.parseByte(split2[i2]);
            }
            return bArr2;
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "AMU", "rcs");
            return null;
        }
    }

    public static byte[] a(byte[] bArr) {
        try {
            return com.amap.api.col.p0003sl.ij.b(a(), bArr, b());
        } catch (java.lang.Throwable unused) {
            return new byte[0];
        }
    }

    public static byte[] b(byte[] bArr) {
        try {
            return com.amap.api.col.p0003sl.ij.a(a(), bArr, b());
        } catch (java.lang.Exception unused) {
            return new byte[0];
        }
    }
}
