package com.amap.api.col.p0003sl;

/* compiled from: ThreadPool.java */
/* loaded from: classes.dex */
public final class lz extends com.amap.api.col.p0003sl.mb {
    private static com.amap.api.col.p0003sl.lz c = new com.amap.api.col.p0003sl.lz(new com.amap.api.col.3sl.ly.a().a("amap-global-threadPool").b());

    public static com.amap.api.col.p0003sl.lz a() {
        return c;
    }

    public static com.amap.api.col.p0003sl.lz a(com.amap.api.col.p0003sl.ly lyVar) {
        return new com.amap.api.col.p0003sl.lz(lyVar);
    }

    private lz(com.amap.api.col.p0003sl.ly lyVar) {
        try {
            this.a = new java.util.concurrent.ThreadPoolExecutor(lyVar.a(), lyVar.b(), lyVar.d(), java.util.concurrent.TimeUnit.SECONDS, lyVar.c(), lyVar);
            this.a.allowCoreThreadTimeOut(true);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "TPool", "ThreadPool");
            th.printStackTrace();
        }
    }

    @java.lang.Deprecated
    public static synchronized com.amap.api.col.p0003sl.lz b() {
        com.amap.api.col.p0003sl.lz lzVar;
        synchronized (com.amap.api.col.p0003sl.lz.class) {
            if (c == null) {
                c = new com.amap.api.col.p0003sl.lz(new com.amap.api.col.3sl.ly.a().b());
            }
            lzVar = c;
        }
        return lzVar;
    }

    @java.lang.Deprecated
    public static com.amap.api.col.p0003sl.lz c() {
        return new com.amap.api.col.p0003sl.lz(new com.amap.api.col.3sl.ly.a().b());
    }
}
