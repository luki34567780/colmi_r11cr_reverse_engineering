package com.amap.api.col.p0003sl;

/* compiled from: AdiuManager.java */
/* loaded from: classes.dex */
public class jg {
    private static com.amap.api.col.p0003sl.jg a;
    private final android.content.Context b;
    private final java.lang.String c = com.amap.api.col.p0003sl.jn.a(com.amap.api.col.p0003sl.ir.c("RYW1hcF9kZXZpY2VfYWRpdQ"));

    private jg(android.content.Context context) {
        this.b = context.getApplicationContext();
    }

    public static com.amap.api.col.p0003sl.jg a(android.content.Context context) {
        if (a == null) {
            synchronized (com.amap.api.col.p0003sl.jg.class) {
                if (a == null) {
                    a = new com.amap.api.col.p0003sl.jg(context);
                }
            }
        }
        return a;
    }

    public final synchronized void a() {
        try {
            if (com.amap.api.col.p0003sl.ii.c() == null) {
                com.amap.api.col.p0003sl.ii.a(com.amap.api.col.p0003sl.jk.a());
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void a(java.lang.String str) {
        com.amap.api.col.p0003sl.jh.a(this.b).a(this.c);
        com.amap.api.col.p0003sl.jh.a(this.b).b(str);
    }
}
