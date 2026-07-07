package com.amap.api.col.p0003sl;

/* compiled from: LogMemCacher.java */
/* loaded from: classes.dex */
public final class jd {
    private static int b = 100;
    private static int d = 10000;
    private java.util.Vector<com.amap.api.col.p0003sl.ja> a;
    private int c;
    private int e;

    public jd() {
        this.c = b;
        this.e = 0;
        this.c = 10;
        this.a = new java.util.Vector<>();
    }

    public jd(byte b2) {
        this.c = b;
        this.e = 0;
        this.a = new java.util.Vector<>();
    }

    public final synchronized boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        if (this.a.size() >= this.c) {
            return true;
        }
        return this.e + str.getBytes().length > d;
    }

    public final java.util.Vector<com.amap.api.col.p0003sl.ja> a() {
        return this.a;
    }

    public final synchronized void b() {
        this.a.clear();
        this.e = 0;
    }

    public final synchronized void a(com.amap.api.col.p0003sl.ja jaVar) {
        if (jaVar != null) {
            if (!android.text.TextUtils.isEmpty(jaVar.b())) {
                this.a.add(jaVar);
                this.e += jaVar.b().getBytes().length;
            }
        }
    }
}
