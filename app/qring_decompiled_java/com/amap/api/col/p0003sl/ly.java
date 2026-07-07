package com.amap.api.col.p0003sl;

/* compiled from: BasicThreadFactory.java */
/* loaded from: classes.dex */
public final class ly implements java.util.concurrent.ThreadFactory {
    private static final int k;
    private static final int l;
    private static final int m;
    private final java.util.concurrent.atomic.AtomicLong a;
    private final java.util.concurrent.ThreadFactory b;
    private final java.lang.Thread.UncaughtExceptionHandler c;
    private final java.lang.String d;
    private final java.lang.Integer e;
    private final java.lang.Boolean f;
    private final int g;
    private final int h;
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> i;
    private final int j;

    /* synthetic */ ly(com.amap.api.col.3sl.ly.a aVar, byte b) {
        this(aVar);
    }

    private ly(com.amap.api.col.3sl.ly.a aVar) {
        if (aVar.a == null) {
            this.b = java.util.concurrent.Executors.defaultThreadFactory();
        } else {
            this.b = aVar.a;
        }
        int i = aVar.f;
        this.g = i;
        int i2 = m;
        this.h = i2;
        if (i2 < i) {
            throw new java.lang.NullPointerException("maxPoolSize must > corePoolSize!");
        }
        this.j = aVar.h;
        if (aVar.i == null) {
            this.i = new java.util.concurrent.LinkedBlockingQueue(256);
        } else {
            this.i = aVar.i;
        }
        if (android.text.TextUtils.isEmpty(aVar.c)) {
            this.d = "amap-threadpool";
        } else {
            this.d = aVar.c;
        }
        this.e = aVar.d;
        this.f = aVar.e;
        this.c = aVar.b;
        this.a = new java.util.concurrent.atomic.AtomicLong();
    }

    private java.util.concurrent.ThreadFactory g() {
        return this.b;
    }

    private java.lang.String h() {
        return this.d;
    }

    private java.lang.Boolean i() {
        return this.f;
    }

    private java.lang.Integer j() {
        return this.e;
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.h;
    }

    public final java.util.concurrent.BlockingQueue<java.lang.Runnable> c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    private java.lang.Thread.UncaughtExceptionHandler k() {
        return this.c;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(final java.lang.Runnable runnable) {
        new java.lang.Runnable() { // from class: com.amap.api.col.3sl.ly.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } catch (java.lang.Throwable unused) {
                }
            }
        };
        java.lang.Thread newThread = g().newThread(runnable);
        if (h() != null) {
            newThread.setName(java.lang.String.format(h() + "-%d", java.lang.Long.valueOf(this.a.incrementAndGet())));
        }
        if (k() != null) {
            newThread.setUncaughtExceptionHandler(k());
        }
        if (j() != null) {
            newThread.setPriority(j().intValue());
        }
        if (i() != null) {
            newThread.setDaemon(i().booleanValue());
        }
        return newThread;
    }

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        k = availableProcessors;
        l = java.lang.Math.max(2, java.lang.Math.min(availableProcessors - 1, 4));
        m = (availableProcessors * 2) + 1;
    }

    /* compiled from: BasicThreadFactory.java */
    public static class a {
        private java.util.concurrent.ThreadFactory a;
        private java.lang.Thread.UncaughtExceptionHandler b;
        private java.lang.String c;
        private java.lang.Integer d;
        private java.lang.Boolean e;
        private int f = com.amap.api.col.p0003sl.ly.l;
        private int g = com.amap.api.col.p0003sl.ly.m;
        private int h = 30;
        private java.util.concurrent.BlockingQueue<java.lang.Runnable> i;

        public final com.amap.api.col.3sl.ly.a a(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "Naming pattern must not be null!");
            this.c = str;
            return this;
        }

        public final com.amap.api.col.3sl.ly.a a() {
            this.f = 1;
            return this;
        }

        public final com.amap.api.col.3sl.ly.a a(int i) {
            if (this.f <= 0) {
                throw new java.lang.NullPointerException("corePoolSize  must > 0!");
            }
            this.g = i;
            return this;
        }

        public final com.amap.api.col.3sl.ly.a a(java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue) {
            this.i = blockingQueue;
            return this;
        }

        private void c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public final com.amap.api.col.p0003sl.ly b() {
            com.amap.api.col.p0003sl.ly lyVar = new com.amap.api.col.p0003sl.ly(this, (byte) 0);
            c();
            return lyVar;
        }
    }
}
