package com.amap.api.col.p0003sl;

/* compiled from: SDKLogHandler.java */
/* loaded from: classes.dex */
public final class ju extends com.amap.api.col.p0003sl.jr implements java.lang.Thread.UncaughtExceptionHandler {
    private static java.util.concurrent.ExecutorService e;
    private static java.lang.ref.WeakReference<android.content.Context> g;
    private android.content.Context d;
    private static java.util.Set<java.lang.Integer> f = java.util.Collections.synchronizedSet(new java.util.HashSet());
    private static final java.util.concurrent.ThreadFactory h = new java.util.concurrent.ThreadFactory() { // from class: com.amap.api.col.3sl.ju.2
        private final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable runnable) {
            return new java.lang.Thread(runnable, "pama#" + this.a.getAndIncrement()) { // from class: com.amap.api.col.3sl.ju.2.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        super.run();
                    } catch (java.lang.Throwable unused) {
                    }
                }
            };
        }
    };

    public static void a(android.content.Context context) {
        if (context == null) {
            return;
        }
        try {
            g = new java.lang.ref.WeakReference<>(context.getApplicationContext());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static synchronized com.amap.api.col.p0003sl.ju a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar) throws com.amap.api.col.p0003sl.id {
        synchronized (com.amap.api.col.p0003sl.ju.class) {
            try {
                if (iqVar == null) {
                    throw new com.amap.api.col.p0003sl.id("sdk info is null");
                }
                if (iqVar.a() == null || "".equals(iqVar.a())) {
                    throw new com.amap.api.col.p0003sl.id("sdk name is invalid");
                }
                try {
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                }
                if (!f.add(java.lang.Integer.valueOf(iqVar.hashCode()))) {
                    return (com.amap.api.col.p0003sl.ju) com.amap.api.col.p0003sl.jr.a;
                }
                if (com.amap.api.col.p0003sl.jr.a == null) {
                    com.amap.api.col.p0003sl.jr.a = new com.amap.api.col.p0003sl.ju(context);
                } else {
                    com.amap.api.col.p0003sl.jr.a.c = false;
                }
                com.amap.api.col.p0003sl.jr.a.a(iqVar, com.amap.api.col.p0003sl.jr.a.c);
                return (com.amap.api.col.p0003sl.ju) com.amap.api.col.p0003sl.jr.a;
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void b() {
        synchronized (com.amap.api.col.p0003sl.ju.class) {
            try {
                java.util.concurrent.ExecutorService executorService = e;
                if (executorService != null) {
                    executorService.shutdown();
                }
                com.amap.api.col.p0003sl.kp.a();
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            try {
                if (com.amap.api.col.p0003sl.jr.a != null && java.lang.Thread.getDefaultUncaughtExceptionHandler() == com.amap.api.col.p0003sl.jr.a && com.amap.api.col.p0003sl.jr.a.b != null) {
                    java.lang.Thread.setDefaultUncaughtExceptionHandler(com.amap.api.col.p0003sl.jr.a.b);
                }
                com.amap.api.col.p0003sl.jr.a = null;
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.jr
    protected final void a(com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.lang.String str2) {
        com.amap.api.col.p0003sl.jv.a(iqVar, this.d, str2, str);
    }

    @Override // com.amap.api.col.p0003sl.jr
    protected final void a(java.lang.Throwable th, int i, java.lang.String str, java.lang.String str2) {
        com.amap.api.col.p0003sl.jv.a(this.d, th, i, str, str2);
    }

    public static void a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.amap.api.col.p0003sl.jv.a(context, iqVar, str, 0, str2, str3);
    }

    public static void b(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.amap.api.col.p0003sl.jv.a(context, iqVar, str, 1, str2, str3);
    }

    @Override // com.amap.api.col.p0003sl.jr
    protected final void a() {
        com.amap.api.col.p0003sl.js.a(this.d);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        if (th == null) {
            return;
        }
        a(th, 0, null, null);
        if (this.b != null) {
            try {
                java.lang.Thread.setDefaultUncaughtExceptionHandler(this.b);
            } catch (java.lang.Throwable unused) {
            }
            this.b.uncaughtException(thread, th);
        }
    }

    @Override // com.amap.api.col.p0003sl.jr
    protected final void a(final com.amap.api.col.p0003sl.iq iqVar, final boolean z) {
        try {
            com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.col.3sl.ju.1
                @Override // com.amap.api.col.p0003sl.ma
                public final void runTask() {
                    try {
                        synchronized (android.os.Looper.getMainLooper()) {
                            com.amap.api.col.p0003sl.js.a(iqVar);
                        }
                        if (z) {
                            com.amap.api.col.p0003sl.jv.a(com.amap.api.col.p0003sl.ju.this.d);
                        }
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final void b(java.lang.Throwable th, java.lang.String str, java.lang.String str2) {
        if (th == null) {
            return;
        }
        try {
            a(th, 1, str, str2);
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    private ju(android.content.Context context) {
        this.d = context;
        try {
            this.b = java.lang.Thread.getDefaultUncaughtExceptionHandler();
            if (this.b == null) {
                java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
                this.c = true;
                return;
            }
            java.lang.String obj = this.b.toString();
            if (!obj.startsWith("com.amap.apis.utils.core.dynamiccore") && (obj.indexOf("com.amap.api") != -1 || obj.indexOf("com.loc") != -1)) {
                this.c = false;
            } else {
                java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
                this.c = true;
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = g;
        if (weakReference != null && weakReference.get() != null) {
            com.amap.api.col.p0003sl.js.a(g.get());
        } else if (com.amap.api.col.p0003sl.jr.a != null) {
            com.amap.api.col.p0003sl.jr.a.a();
        }
    }

    public static void c(java.lang.Throwable th, java.lang.String str, java.lang.String str2) {
        try {
            if (com.amap.api.col.p0003sl.jr.a != null) {
                com.amap.api.col.p0003sl.jr.a.a(th, 1, str, str2);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a(com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        a(iqVar, str, str2, str3, "", str4);
    }

    public static void a(com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        try {
            if (com.amap.api.col.p0003sl.jr.a != null) {
                com.amap.api.col.p0003sl.jr.a.a(iqVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",csid:" + str4 + ",code:" + str5, "networkError");
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void b(com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.lang.String str2) {
        try {
            if (com.amap.api.col.p0003sl.jr.a != null) {
                com.amap.api.col.p0003sl.jr.a.a(iqVar, str, str2);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a(com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, com.amap.api.col.p0003sl.id idVar) {
        if (idVar != null) {
            a(iqVar, str, idVar.c(), idVar.d(), idVar.e(), idVar.b());
        }
    }

    @java.lang.Deprecated
    public static synchronized java.util.concurrent.ExecutorService d() {
        java.util.concurrent.ExecutorService executorService;
        synchronized (com.amap.api.col.p0003sl.ju.class) {
            try {
                java.util.concurrent.ExecutorService executorService2 = e;
                if (executorService2 == null || executorService2.isShutdown()) {
                    e = new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(256), h);
                }
            } catch (java.lang.Throwable unused) {
            }
            executorService = e;
        }
        return executorService;
    }

    public static synchronized com.amap.api.col.p0003sl.ju e() {
        com.amap.api.col.p0003sl.ju juVar;
        synchronized (com.amap.api.col.p0003sl.ju.class) {
            juVar = (com.amap.api.col.p0003sl.ju) com.amap.api.col.p0003sl.jr.a;
        }
        return juVar;
    }
}
