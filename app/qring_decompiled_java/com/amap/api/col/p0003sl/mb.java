package com.amap.api.col.p0003sl;

/* compiled from: BasePool.java */
/* loaded from: classes.dex */
public abstract class mb {
    protected java.util.concurrent.ThreadPoolExecutor a;
    private java.util.concurrent.ConcurrentHashMap<com.amap.api.col.p0003sl.ma, java.util.concurrent.Future<?>> c = new java.util.concurrent.ConcurrentHashMap<>();
    protected com.amap.api.col.3sl.ma.a b = new com.amap.api.col.3sl.ma.a() { // from class: com.amap.api.col.3sl.mb.1
        @Override // com.amap.api.col.3sl.ma.a
        public final void a(com.amap.api.col.p0003sl.ma maVar) {
            com.amap.api.col.p0003sl.mb.this.a(maVar, false);
        }

        @Override // com.amap.api.col.3sl.ma.a
        public final void b(com.amap.api.col.p0003sl.ma maVar) {
            com.amap.api.col.p0003sl.mb.this.a(maVar, true);
        }
    };

    private synchronized boolean b(com.amap.api.col.p0003sl.ma maVar) {
        boolean z;
        try {
            z = this.c.containsKey(maVar);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "TPool", "contain");
            th.printStackTrace();
            z = false;
        }
        return z;
    }

    private synchronized void a(com.amap.api.col.p0003sl.ma maVar, java.util.concurrent.Future<?> future) {
        try {
            this.c.put(maVar, future);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "TPool", "addQueue");
            th.printStackTrace();
        }
    }

    protected final synchronized void a(com.amap.api.col.p0003sl.ma maVar, boolean z) {
        try {
            java.util.concurrent.Future<?> remove = this.c.remove(maVar);
            if (z && remove != null) {
                remove.cancel(true);
            }
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "TPool", "removeQueue");
            th.printStackTrace();
        }
    }

    public final void a(com.amap.api.col.p0003sl.ma maVar) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        if (b(maVar) || (threadPoolExecutor = this.a) == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        maVar.f = this.b;
        try {
            java.util.concurrent.Future<?> submit = this.a.submit(maVar);
            if (submit == null) {
                return;
            }
            a(maVar, submit);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            com.amap.api.col.p0003sl.ju.c(e, "TPool", "addTask");
        }
    }

    public final java.util.concurrent.Executor d() {
        return this.a;
    }

    public final void a(long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.a;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.awaitTermination(j, timeUnit);
            }
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public final void e() {
        try {
            java.util.Iterator<java.util.Map.Entry<com.amap.api.col.p0003sl.ma, java.util.concurrent.Future<?>>> it = this.c.entrySet().iterator();
            while (it.hasNext()) {
                java.util.concurrent.Future<?> future = this.c.get(it.next().getKey());
                if (future != null) {
                    try {
                        future.cancel(true);
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            this.c.clear();
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "TPool", "destroy");
            th.printStackTrace();
        }
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }
}
