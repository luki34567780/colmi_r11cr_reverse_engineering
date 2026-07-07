package com.amap.api.col.p0003sl;

/* compiled from: StatisticsManager.java */
/* loaded from: classes.dex */
public class li {
    static boolean a = false;
    static int b = 20;
    private static int c = 20;
    private static java.lang.ref.WeakReference<com.amap.api.col.p0003sl.lc> d;
    private static int e;

    public static synchronized void a(boolean z, int i) {
        synchronized (com.amap.api.col.p0003sl.li.class) {
            a = z;
            e = java.lang.Math.max(0, i);
        }
    }

    /* compiled from: StatisticsManager.java */
    static class a extends com.amap.api.col.p0003sl.ma {
        static int a = 1;
        static int b = 2;
        static int c = 3;
        private android.content.Context d;
        private com.amap.api.col.p0003sl.lh e;
        private int g;
        private java.util.List<com.amap.api.col.p0003sl.lh> h;

        a(android.content.Context context, int i) {
            this.d = context;
            this.g = i;
        }

        a(android.content.Context context, int i, java.util.List<com.amap.api.col.p0003sl.lh> list) {
            this(context, i);
            this.h = list;
        }

        a(android.content.Context context, int i, com.amap.api.col.p0003sl.lh lhVar) {
            this(context, i);
            this.e = lhVar;
        }

        @Override // com.amap.api.col.p0003sl.ma
        public final void runTask() {
            com.amap.api.col.p0003sl.lh lhVar;
            java.lang.Throwable th;
            int i = this.g;
            if (i == 1) {
                try {
                    if (this.d != null && this.e != null) {
                        synchronized (com.amap.api.col.p0003sl.li.class) {
                            android.content.Context context = this.d;
                            if (context != null && (lhVar = this.e) != null) {
                                com.amap.api.col.p0003sl.li.a(context, lhVar.a());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (java.lang.Throwable th2) {
                    com.amap.api.col.p0003sl.ju.c(th2, "stm", "as");
                    return;
                }
            }
            if (i != 2) {
                if (i == 3) {
                    try {
                        if (this.d == null) {
                            return;
                        }
                        com.amap.api.col.p0003sl.lc a2 = com.amap.api.col.p0003sl.lj.a(com.amap.api.col.p0003sl.li.d);
                        com.amap.api.col.p0003sl.lj.a(this.d, a2, com.amap.api.col.p0003sl.js.h, 1000, 307200, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
                        if (a2.g == null) {
                            a2.g = new com.amap.api.col.p0003sl.lk(new com.amap.api.col.p0003sl.lo(this.d, new com.amap.api.col.p0003sl.ll(new com.amap.api.col.p0003sl.lp(new com.amap.api.col.p0003sl.lr()))));
                        }
                        a2.h = com.blankj.utilcode.constant.TimeConstants.HOUR;
                        if (android.text.TextUtils.isEmpty(a2.i)) {
                            a2.i = "cKey";
                        }
                        if (a2.f == null) {
                            a2.f = new com.amap.api.col.p0003sl.lv(this.d, a2.h, a2.i, new com.amap.api.col.p0003sl.ls(a2.a, new com.amap.api.col.p0003sl.lt(this.d, com.amap.api.col.p0003sl.li.a, com.amap.api.col.p0003sl.li.c * 1024, com.amap.api.col.p0003sl.li.b * 1024, "staticUpdate", com.amap.api.col.p0003sl.li.e * 1024)));
                        }
                        com.amap.api.col.p0003sl.ld.a(a2);
                        return;
                    } catch (java.lang.Throwable th3) {
                        com.amap.api.col.p0003sl.ju.c(th3, "stm", "usd");
                        return;
                    }
                }
                return;
            }
            try {
                synchronized (com.amap.api.col.p0003sl.li.class) {
                    if (this.h != null && this.d != null) {
                        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
                        byte[] bArr = new byte[0];
                        try {
                            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                            try {
                                for (com.amap.api.col.p0003sl.lh lhVar2 : this.h) {
                                    if (lhVar2 != null) {
                                        byteArrayOutputStream2.write(lhVar2.a());
                                    }
                                }
                                bArr = byteArrayOutputStream2.toByteArray();
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    th.printStackTrace();
                                    com.amap.api.col.p0003sl.li.a(this.d, bArr);
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                try {
                                    com.amap.api.col.p0003sl.ju.c(th, "stm", "aStB");
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (java.lang.Throwable th6) {
                                            th = th6;
                                            th.printStackTrace();
                                            com.amap.api.col.p0003sl.li.a(this.d, bArr);
                                        }
                                    }
                                    com.amap.api.col.p0003sl.li.a(this.d, bArr);
                                } finally {
                                }
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                        }
                        com.amap.api.col.p0003sl.li.a(this.d, bArr);
                    }
                }
            } catch (java.lang.Throwable th8) {
                com.amap.api.col.p0003sl.ju.c(th8, "stm", "apb");
            }
        }
    }

    public static synchronized void a(com.amap.api.col.p0003sl.lh lhVar, android.content.Context context) {
        synchronized (com.amap.api.col.p0003sl.li.class) {
            com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.3sl.li.a(context, com.amap.api.col.3sl.li.a.a, lhVar));
        }
    }

    public static synchronized void a(java.util.List<com.amap.api.col.p0003sl.lh> list, android.content.Context context) {
        synchronized (com.amap.api.col.p0003sl.li.class) {
            if (list != null) {
                try {
                    if (list.size() != 0) {
                        com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.3sl.li.a(context, com.amap.api.col.3sl.li.a.b, list));
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }

    public static synchronized void b(java.util.List<com.amap.api.col.p0003sl.lh> list, android.content.Context context) {
        synchronized (com.amap.api.col.p0003sl.li.class) {
            try {
                java.util.List<com.amap.api.col.p0003sl.lh> b2 = com.amap.api.col.p0003sl.kv.b();
                if (b2 != null && b2.size() > 0) {
                    list.addAll(b2);
                }
            } catch (java.lang.Throwable unused) {
            }
            a(list, context);
        }
    }

    public static void a(android.content.Context context) {
        com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.3sl.li.a(context, com.amap.api.col.3sl.li.a.c));
    }

    static /* synthetic */ void a(android.content.Context context, byte[] bArr) throws java.io.IOException {
        com.amap.api.col.p0003sl.lc a2 = com.amap.api.col.p0003sl.lj.a(d);
        com.amap.api.col.p0003sl.lj.a(context, a2, com.amap.api.col.p0003sl.js.h, 1000, 307200, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        if (a2.e == null) {
            a2.e = new com.amap.api.col.p0003sl.ki();
        }
        try {
            com.amap.api.col.p0003sl.ld.a(java.lang.Integer.toString(new java.util.Random().nextInt(100)) + java.lang.Long.toString(java.lang.System.nanoTime()), bArr, a2);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "stm", "wts");
        }
    }
}
