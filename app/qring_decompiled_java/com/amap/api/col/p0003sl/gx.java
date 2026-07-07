package com.amap.api.col.p0003sl;

/* compiled from: ThreadPoolExecutorUtil.java */
/* loaded from: classes.dex */
public class gx {
    private static volatile com.amap.api.col.p0003sl.gx c;
    private java.util.concurrent.BlockingQueue<java.lang.Runnable> a = new java.util.concurrent.LinkedBlockingQueue();
    private java.util.concurrent.ExecutorService b;

    public static com.amap.api.col.p0003sl.gx a() {
        if (c == null) {
            synchronized (com.amap.api.col.p0003sl.gx.class) {
                if (c == null) {
                    c = new com.amap.api.col.p0003sl.gx();
                }
            }
        }
        return c;
    }

    public static void b() {
        if (c != null) {
            synchronized (com.amap.api.col.p0003sl.gx.class) {
                if (c != null) {
                    c.b.shutdownNow();
                    c.b = null;
                    c = null;
                }
            }
        }
    }

    private gx() {
        this.b = null;
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        this.b = new java.util.concurrent.ThreadPoolExecutor(availableProcessors, availableProcessors * 2, 1L, java.util.concurrent.TimeUnit.SECONDS, this.a, new java.util.concurrent.ThreadPoolExecutor.AbortPolicy());
    }

    public final void a(java.lang.Runnable runnable) {
        java.util.concurrent.ExecutorService executorService = this.b;
        if (executorService != null) {
            executorService.execute(runnable);
        }
    }
}
