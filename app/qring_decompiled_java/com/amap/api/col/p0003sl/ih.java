package com.amap.api.col.p0003sl;

/* compiled from: ClientInfo.java */
/* loaded from: classes.dex */
public final class ih {
    public static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            return com.amap.api.col.p0003sl.im.b(com.amap.api.col.p0003sl.ie.e(context) + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "CI", "Sco");
            return null;
        }
    }

    public static java.lang.String a() {
        try {
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            java.lang.String str = coil.disk.DiskLruCache.VERSION;
            if (!com.amap.api.col.p0003sl.ie.a()) {
                str = "0";
            }
            int length = valueOf.length();
            return valueOf.substring(0, length - 2) + str + valueOf.substring(length - 1);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "CI", "TS");
            return null;
        }
    }

    public static java.lang.String a(android.content.Context context) {
        try {
            com.amap.api.col.3sl.ih.a aVar = new com.amap.api.col.3sl.ih.a((byte) 0);
            aVar.d = com.amap.api.col.p0003sl.ie.c(context);
            aVar.i = com.amap.api.col.p0003sl.ie.d(context);
            return a(aVar);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "CI", "IX");
            return null;
        }
    }

    public static byte[] a(byte[] bArr) throws java.security.cert.CertificateException, java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.NullPointerException, java.io.IOException, java.security.InvalidKeyException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        return com.amap.api.col.p0003sl.ij.a(bArr);
    }

    public static byte[] a(android.content.Context context, boolean z, boolean z2) {
        try {
            return b(b(context, z, z2));
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "CI", "gz");
            return null;
        }
    }

    public static java.lang.String b(android.content.Context context) {
        return c(context);
    }

    private static java.lang.String c(android.content.Context context) {
        try {
            return a(b(context, false, false));
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "CI", "gCXi");
            return null;
        }
    }

    private static byte[] b(byte[] bArr) throws java.security.cert.CertificateException, java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.NullPointerException, java.io.IOException, java.security.InvalidKeyException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        java.security.PublicKey d = com.amap.api.col.p0003sl.ir.d();
        if (bArr.length > 117) {
            byte[] bArr2 = new byte[117];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 117);
            byte[] a2 = com.amap.api.col.p0003sl.ij.a(bArr2, d);
            byte[] bArr3 = new byte[(bArr.length + 128) - 117];
            java.lang.System.arraycopy(a2, 0, bArr3, 0, 128);
            java.lang.System.arraycopy(bArr, 117, bArr3, 128, bArr.length - 117);
            return bArr3;
        }
        return com.amap.api.col.p0003sl.ij.a(bArr, d);
    }

    private static java.lang.String a(com.amap.api.col.3sl.ih.a aVar) {
        return com.amap.api.col.p0003sl.ij.b(b(aVar));
    }

    private static byte[] b(com.amap.api.col.3sl.ih.a aVar) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                a(byteArrayOutputStream, aVar.a);
                a(byteArrayOutputStream, aVar.b);
                a(byteArrayOutputStream, aVar.c);
                a(byteArrayOutputStream, aVar.d);
                a(byteArrayOutputStream, aVar.e);
                a(byteArrayOutputStream, aVar.f);
                a(byteArrayOutputStream, aVar.g);
                a(byteArrayOutputStream, aVar.h);
                a(byteArrayOutputStream, aVar.i);
                a(byteArrayOutputStream, aVar.j);
                a(byteArrayOutputStream, aVar.k);
                a(byteArrayOutputStream, aVar.l);
                a(byteArrayOutputStream, aVar.m);
                a(byteArrayOutputStream, aVar.n);
                a(byteArrayOutputStream, aVar.o);
                a(byteArrayOutputStream, aVar.p);
                a(byteArrayOutputStream, aVar.q);
                a(byteArrayOutputStream, aVar.r);
                a(byteArrayOutputStream, aVar.s);
                a(byteArrayOutputStream, aVar.t);
                a(byteArrayOutputStream, aVar.u);
                a(byteArrayOutputStream, aVar.v);
                a(byteArrayOutputStream, aVar.w);
                a(byteArrayOutputStream, aVar.x);
                a(byteArrayOutputStream, aVar.y);
                a(byteArrayOutputStream, aVar.z);
                a(byteArrayOutputStream, aVar.A);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                new java.lang.String(byteArray);
                byte[] b = b(com.amap.api.col.p0003sl.ir.b(byteArray));
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                }
                return b;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    com.amap.api.col.p0003sl.jr.a(th, "CI", "gzx");
                    return null;
                } finally {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (java.lang.Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    private static void a(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.amap.api.col.p0003sl.ir.a(byteArrayOutputStream, str.getBytes().length > 255 ? (byte) -1 : (byte) str.getBytes().length, com.amap.api.col.p0003sl.ir.a(str));
        } else {
            com.amap.api.col.p0003sl.ir.a(byteArrayOutputStream, (byte) 0, new byte[0]);
        }
    }

    private static com.amap.api.col.3sl.ih.a b(android.content.Context context, boolean z, boolean z2) {
        com.amap.api.col.3sl.ih.a aVar = new com.amap.api.col.3sl.ih.a((byte) 0);
        aVar.a = com.amap.api.col.p0003sl.ii.k();
        aVar.b = com.amap.api.col.p0003sl.ii.h();
        java.lang.String f = com.amap.api.col.p0003sl.ii.f(context);
        if (f == null) {
            f = "";
        }
        aVar.c = f;
        aVar.d = com.amap.api.col.p0003sl.ie.c(context);
        aVar.e = android.os.Build.MODEL;
        aVar.f = android.os.Build.MANUFACTURER;
        aVar.g = android.os.Build.DEVICE;
        aVar.h = com.amap.api.col.p0003sl.ie.b(context);
        aVar.i = com.amap.api.col.p0003sl.ie.d(context);
        aVar.j = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
        aVar.k = com.amap.api.col.p0003sl.ii.n();
        aVar.l = com.amap.api.col.p0003sl.ii.m(context);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.amap.api.col.p0003sl.ii.j(context));
        aVar.m = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(com.amap.api.col.p0003sl.ii.i(context));
        aVar.n = sb2.toString();
        aVar.o = com.amap.api.col.p0003sl.ii.s(context);
        aVar.p = com.amap.api.col.p0003sl.ii.h(context);
        aVar.q = "";
        aVar.r = "";
        if (z) {
            aVar.s = "";
            aVar.t = "";
        } else {
            java.lang.String[] i = com.amap.api.col.p0003sl.ii.i();
            aVar.s = i[0];
            aVar.t = i[1];
        }
        aVar.w = com.amap.api.col.p0003sl.ii.a();
        java.lang.String a2 = com.amap.api.col.p0003sl.ii.a(context);
        if (!android.text.TextUtils.isEmpty(a2)) {
            aVar.x = a2;
        } else {
            aVar.x = "";
        }
        aVar.y = "aid=" + com.amap.api.col.p0003sl.ii.g();
        if ((z2 && com.amap.api.col.p0003sl.jf.d) || com.amap.api.col.p0003sl.jf.e) {
            java.lang.String e = com.amap.api.col.p0003sl.ii.e(context);
            if (!android.text.TextUtils.isEmpty(e)) {
                aVar.y += "|oaid=" + e;
            }
        }
        java.lang.String j = com.amap.api.col.p0003sl.ii.j();
        if (!android.text.TextUtils.isEmpty(j)) {
            aVar.y += "|multiImeis=" + j;
        }
        java.lang.String m = com.amap.api.col.p0003sl.ii.m();
        if (!android.text.TextUtils.isEmpty(m)) {
            aVar.y += "|meid=" + m;
        }
        aVar.y += "|serial=" + com.amap.api.col.p0003sl.ii.f();
        java.lang.String b = com.amap.api.col.p0003sl.ii.b();
        if (!android.text.TextUtils.isEmpty(b)) {
            aVar.y += "|adiuExtras=" + b;
        }
        aVar.y += "|storage=" + com.amap.api.col.p0003sl.ii.o() + "|ram=" + com.amap.api.col.p0003sl.ii.r(context) + "|arch=" + com.amap.api.col.p0003sl.ii.p();
        java.lang.String b2 = com.amap.api.col.p0003sl.jq.a().b();
        if (!android.text.TextUtils.isEmpty(b2)) {
            aVar.z = b2;
        } else {
            aVar.z = "";
        }
        if (z) {
            java.lang.String a3 = com.amap.api.col.p0003sl.iw.a(context).a();
            if (!android.text.TextUtils.isEmpty(a3)) {
                aVar.A = a3;
            }
        }
        return aVar;
    }

    /* compiled from: ClientInfo.java */
    private static class a {
        java.lang.String A;
        java.lang.String a;
        java.lang.String b;
        java.lang.String c;
        java.lang.String d;
        java.lang.String e;
        java.lang.String f;
        java.lang.String g;
        java.lang.String h;
        java.lang.String i;
        java.lang.String j;
        java.lang.String k;
        java.lang.String l;
        java.lang.String m;
        java.lang.String n;
        java.lang.String o;
        java.lang.String p;
        java.lang.String q;
        java.lang.String r;
        java.lang.String s;
        java.lang.String t;
        java.lang.String u;
        java.lang.String v;
        java.lang.String w;
        java.lang.String x;
        java.lang.String y;
        java.lang.String z;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }
}
