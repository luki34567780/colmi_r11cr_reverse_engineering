package com.autonavi.aps.amapapi.trans;

/* compiled from: LocationRequest.java */
/* loaded from: classes.dex */
public final class d extends com.amap.api.col.p0003sl.kt {
    java.util.Map<java.lang.String, java.lang.String> d;
    java.lang.String e;
    java.lang.String f;
    byte[] g;
    byte[] h;
    boolean i;
    java.lang.String j;
    java.util.Map<java.lang.String, java.lang.String> k;
    boolean p;
    private java.lang.String q;

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getSDKName() {
        return "loc";
    }

    public final void b(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
            if (bArr != null) {
                try {
                    byteArrayOutputStream2.write(a(bArr));
                    byteArrayOutputStream2.write(bArr);
                } catch (java.lang.Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        th.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                                return;
                            } catch (java.io.IOException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (java.io.IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                }
            }
            this.h = byteArrayOutputStream2.toByteArray();
            try {
                byteArrayOutputStream2.close();
            } catch (java.io.IOException e3) {
                e3.printStackTrace();
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    @Override // com.amap.api.col.p0003sl.kt, com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return this.k;
    }

    public final void a(java.util.Map<java.lang.String, java.lang.String> map) {
        this.k = map;
    }

    public final void a(java.lang.String str) {
        this.j = str;
    }

    @Override // com.amap.api.col.p0003sl.kt
    public final boolean f() {
        return this.i;
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final void c(byte[] bArr) {
        this.g = bArr;
    }

    public final void b(java.lang.String str) {
        this.e = str;
    }

    public final void c(java.lang.String str) {
        this.f = str;
    }

    public final void b(java.util.Map<java.lang.String, java.lang.String> map) {
        this.d = map;
    }

    public d(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar) {
        super(context, iqVar);
        this.d = null;
        this.q = "";
        this.e = "";
        this.f = "";
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = null;
        this.k = null;
        this.p = false;
    }

    @Override // com.amap.api.col.p0003sl.kt
    public final byte[] c() {
        return this.g;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        return this.d;
    }

    @Override // com.amap.api.col.p0003sl.kt
    public final byte[] d() {
        return this.h;
    }

    @Override // com.amap.api.col.p0003sl.kt
    public final java.lang.String g() {
        return this.j;
    }

    public final void b(boolean z) {
        this.p = z;
    }

    @Override // com.amap.api.col.p0003sl.kt
    protected final boolean h() {
        return this.p;
    }

    public final void d(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.q = str;
        } else {
            this.q = "";
        }
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getIPDNSName() {
        return this.q;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getURL() {
        return this.e;
    }

    @Override // com.amap.api.col.p0003sl.il, com.amap.api.col.p0003sl.kz
    public final java.lang.String getIPV6URL() {
        return this.f;
    }
}
