package com.amap.api.col.p0003sl;

/* compiled from: MarkInfoManager.java */
/* loaded from: classes.dex */
public class le {
    static java.lang.ref.WeakReference<com.amap.api.col.p0003sl.lc> a;

    public static void a(final java.lang.String str, final android.content.Context context) {
        com.amap.api.col.p0003sl.ju.d().submit(new java.lang.Runnable() { // from class: com.amap.api.col.3sl.le.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (com.amap.api.col.p0003sl.le.class) {
                    try {
                        java.lang.String a2 = com.amap.api.col.p0003sl.im.a(com.amap.api.col.p0003sl.ir.a(str));
                        com.amap.api.col.p0003sl.lc a3 = com.amap.api.col.p0003sl.lj.a(com.amap.api.col.p0003sl.le.a);
                        com.amap.api.col.p0003sl.lj.a(context, a3, com.amap.api.col.p0003sl.js.j, 50, 102400, "10");
                        if (a3.e == null) {
                            a3.e = new com.amap.api.col.p0003sl.kk(new com.amap.api.col.p0003sl.kn(new com.amap.api.col.p0003sl.km()));
                        }
                        com.amap.api.col.p0003sl.ld.a(a2, com.amap.api.col.p0003sl.ir.a(" \"timestamp\":\"" + com.amap.api.col.p0003sl.ir.a(java.lang.System.currentTimeMillis(), "yyyyMMdd HH:mm:ss") + "\",\"details\":" + str), a3);
                    } finally {
                    }
                }
            }
        });
    }
}
