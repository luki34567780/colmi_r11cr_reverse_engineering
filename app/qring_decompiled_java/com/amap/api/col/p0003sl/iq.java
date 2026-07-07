package com.amap.api.col.p0003sl;

/* compiled from: SDKInfo.java */
@com.amap.api.col.p0003sl.ke(a = "a")
/* loaded from: classes.dex */
public final class iq {

    @com.amap.api.col.p0003sl.kf(a = "a1", b = 6)
    private java.lang.String a;

    @com.amap.api.col.p0003sl.kf(a = "a2", b = 6)
    private java.lang.String b;

    @com.amap.api.col.p0003sl.kf(a = "a6", b = 2)
    private int c;

    @com.amap.api.col.p0003sl.kf(a = "a3", b = 6)
    private java.lang.String d;

    @com.amap.api.col.p0003sl.kf(a = "a4", b = 6)
    private java.lang.String e;

    @com.amap.api.col.p0003sl.kf(a = "a5", b = 6)
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;
    private java.lang.String j;
    private java.lang.String k;
    private java.lang.String[] l;

    /* synthetic */ iq(com.amap.api.col.3sl.iq.a aVar, byte b) {
        this(aVar);
    }

    private iq() {
        this.c = 1;
        this.l = null;
    }

    private iq(com.amap.api.col.3sl.iq.a aVar) {
        this.c = 1;
        this.l = null;
        this.g = aVar.a;
        this.h = aVar.b;
        this.j = aVar.c;
        this.i = aVar.d;
        this.c = aVar.e ? 1 : 0;
        this.k = aVar.f;
        this.l = aVar.g;
        this.b = com.amap.api.col.p0003sl.ir.b(this.h);
        this.a = com.amap.api.col.p0003sl.ir.b(this.j);
        this.d = com.amap.api.col.p0003sl.ir.b(this.i);
        this.e = com.amap.api.col.p0003sl.ir.b(a(this.l));
        this.f = com.amap.api.col.p0003sl.ir.b(this.k);
    }

    /* compiled from: SDKInfo.java */
    public static class a {
        private java.lang.String a;
        private java.lang.String b;
        private java.lang.String c;
        private java.lang.String d;
        private boolean e = true;
        private java.lang.String f = "standard";
        private java.lang.String[] g = null;

        public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.a = str2;
            this.b = str2;
            this.d = str3;
            this.c = str;
        }

        public final com.amap.api.col.3sl.iq.a a(boolean z) {
            this.e = z;
            return this;
        }

        public final com.amap.api.col.3sl.iq.a a(java.lang.String[] strArr) {
            if (strArr != null) {
                this.g = (java.lang.String[]) strArr.clone();
            }
            return this;
        }

        public final com.amap.api.col.3sl.iq.a a(java.lang.String str) {
            this.b = str;
            return this;
        }

        public final com.amap.api.col.p0003sl.iq a() throws com.amap.api.col.p0003sl.id {
            if (this.g == null) {
                throw new com.amap.api.col.p0003sl.id("sdk packages is null");
            }
            return new com.amap.api.col.p0003sl.iq(this, (byte) 0);
        }
    }

    public final void a(boolean z) {
        this.c = z ? 1 : 0;
    }

    public final java.lang.String a() {
        if (android.text.TextUtils.isEmpty(this.j) && !android.text.TextUtils.isEmpty(this.a)) {
            this.j = com.amap.api.col.p0003sl.ir.c(this.a);
        }
        return this.j;
    }

    public final java.lang.String b() {
        return this.g;
    }

    public final java.lang.String c() {
        if (android.text.TextUtils.isEmpty(this.h) && !android.text.TextUtils.isEmpty(this.b)) {
            this.h = com.amap.api.col.p0003sl.ir.c(this.b);
        }
        return this.h;
    }

    public final java.lang.String d() {
        if (android.text.TextUtils.isEmpty(this.k) && !android.text.TextUtils.isEmpty(this.f)) {
            this.k = com.amap.api.col.p0003sl.ir.c(this.f);
        }
        if (android.text.TextUtils.isEmpty(this.k)) {
            this.k = "standard";
        }
        return this.k;
    }

    public final boolean e() {
        return this.c == 1;
    }

    public final java.lang.String[] f() {
        java.lang.String[] strArr = this.l;
        if ((strArr == null || strArr.length == 0) && !android.text.TextUtils.isEmpty(this.e)) {
            this.l = a(com.amap.api.col.p0003sl.ir.c(this.e));
        }
        return (java.lang.String[]) this.l.clone();
    }

    private static java.lang.String[] a(java.lang.String str) {
        try {
            return str.split(";");
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static java.lang.String a(java.lang.String[] strArr) {
        if (strArr == null) {
            return null;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.lang.String str : strArr) {
                sb.append(str);
                sb.append(";");
            }
            return sb.toString();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        try {
            if (this.j.equals(((com.amap.api.col.p0003sl.iq) obj).j) && this.g.equals(((com.amap.api.col.p0003sl.iq) obj).g)) {
                if (this.h.equals(((com.amap.api.col.p0003sl.iq) obj).h)) {
                    return true;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }
}
