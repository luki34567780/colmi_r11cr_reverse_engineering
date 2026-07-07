package com.amap.api.col.p0003sl;

/* compiled from: ThreadUtil.java */
/* loaded from: classes.dex */
public class dv {
    private static volatile com.amap.api.col.p0003sl.dv b;
    private com.amap.api.col.p0003sl.lz a;

    public static com.amap.api.col.p0003sl.dv a() {
        if (b == null) {
            synchronized (com.amap.api.col.p0003sl.dv.class) {
                if (b == null) {
                    b = new com.amap.api.col.p0003sl.dv();
                }
            }
        }
        return b;
    }

    public static void b() {
        if (b != null) {
            try {
                if (b.a != null) {
                    b.a.e();
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            b.a = null;
            b = null;
        }
    }

    private dv() {
        this.a = null;
        this.a = com.amap.api.col.p0003sl.dw.a("AMapThreadUtil");
    }

    public final void a(com.amap.api.col.p0003sl.ma maVar) {
        try {
            this.a.a(maVar);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(com.amap.api.col.p0003sl.ma maVar) {
        if (maVar != null) {
            try {
                maVar.cancelTask();
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
