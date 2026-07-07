package com.amap.api.col.p0003sl;

/* compiled from: AdiuStorageModel.java */
/* loaded from: classes.dex */
public final class jh {
    public static final java.lang.String a = com.amap.api.col.p0003sl.ir.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU");
    private static com.amap.api.col.p0003sl.jh f;
    private java.util.List<java.lang.String> b;
    private java.lang.String c;
    private final android.content.Context d;
    private final android.os.Handler e;

    public static com.amap.api.col.p0003sl.jh a(android.content.Context context) {
        if (f == null) {
            synchronized (com.amap.api.col.p0003sl.jh.class) {
                if (f == null) {
                    f = new com.amap.api.col.p0003sl.jh(context);
                }
            }
        }
        return f;
    }

    private jh(android.content.Context context) {
        this.d = context.getApplicationContext();
        if (android.os.Looper.myLooper() == null) {
            this.e = new com.amap.api.col.3sl.jh.a(android.os.Looper.getMainLooper(), this);
        } else {
            this.e = new com.amap.api.col.3sl.jh.a(this);
        }
    }

    public final void a(java.lang.String str) {
        this.c = str;
    }

    public final void b(java.lang.String str) {
        java.util.List<java.lang.String> list = this.b;
        if (list != null) {
            list.clear();
            this.b.add(str);
        }
        a(str, 273);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.amap.api.col.3sl.jh$1] */
    public synchronized void a(final java.lang.String str, final int i) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            new java.lang.Thread() { // from class: com.amap.api.col.3sl.jh.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    java.lang.String b = com.amap.api.col.p0003sl.jn.b(str);
                    if (android.text.TextUtils.isEmpty(b)) {
                        return;
                    }
                    if ((i & 1) > 0) {
                        try {
                            if (android.os.Build.VERSION.SDK_INT >= 23) {
                                if (android.provider.Settings.System.canWrite(com.amap.api.col.p0003sl.jh.this.d)) {
                                    android.provider.Settings.System.putString(com.amap.api.col.p0003sl.jh.this.d.getContentResolver(), com.amap.api.col.p0003sl.jh.this.c, b);
                                }
                            } else {
                                android.provider.Settings.System.putString(com.amap.api.col.p0003sl.jh.this.d.getContentResolver(), com.amap.api.col.p0003sl.jh.this.c, b);
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if ((i & 16) > 0) {
                        com.amap.api.col.p0003sl.jj.a(com.amap.api.col.p0003sl.jh.this.d, com.amap.api.col.p0003sl.jh.this.c, b);
                    }
                    if ((i & 256) > 0) {
                        android.content.SharedPreferences.Editor edit = com.amap.api.col.p0003sl.jh.this.d.getSharedPreferences(com.amap.api.col.p0003sl.jh.a, 0).edit();
                        edit.putString(com.amap.api.col.p0003sl.jh.this.c, b);
                        if (android.os.Build.VERSION.SDK_INT >= 9) {
                            edit.apply();
                        } else {
                            edit.commit();
                        }
                    }
                }
            }.start();
            return;
        }
        java.lang.String b = com.amap.api.col.p0003sl.jn.b(str);
        if (!android.text.TextUtils.isEmpty(b)) {
            if ((i & 1) > 0) {
                try {
                    if (android.os.Build.VERSION.SDK_INT >= 23) {
                        android.provider.Settings.System.putString(this.d.getContentResolver(), this.c, b);
                    } else {
                        android.provider.Settings.System.putString(this.d.getContentResolver(), this.c, b);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            if ((i & 16) > 0) {
                com.amap.api.col.p0003sl.jj.a(this.d, this.c, b);
            }
            if ((i & 256) > 0) {
                android.content.SharedPreferences.Editor edit = this.d.getSharedPreferences(a, 0).edit();
                edit.putString(this.c, b);
                if (android.os.Build.VERSION.SDK_INT >= 9) {
                    edit.apply();
                    return;
                }
                edit.commit();
            }
        }
    }

    /* compiled from: AdiuStorageModel.java */
    private static final class a extends android.os.Handler {
        private final java.lang.ref.WeakReference<com.amap.api.col.p0003sl.jh> a;

        a(com.amap.api.col.p0003sl.jh jhVar) {
            this.a = new java.lang.ref.WeakReference<>(jhVar);
        }

        a(android.os.Looper looper, com.amap.api.col.p0003sl.jh jhVar) {
            super(looper);
            this.a = new java.lang.ref.WeakReference<>(jhVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            com.amap.api.col.p0003sl.jh jhVar = this.a.get();
            if (jhVar == null || message == null || message.obj == null) {
                return;
            }
            jhVar.a((java.lang.String) message.obj, message.what);
        }
    }
}
