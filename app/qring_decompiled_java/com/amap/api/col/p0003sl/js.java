package com.amap.api.col.p0003sl;

/* compiled from: Log.java */
/* loaded from: classes.dex */
public final class js {
    public static final java.lang.String a = "/a/";
    static final java.lang.String b = "b";
    static final java.lang.String c = "c";
    static final java.lang.String d = "d";
    public static java.lang.String e = "s";
    public static final java.lang.String f = "g";
    public static final java.lang.String g = "h";
    public static final java.lang.String h = "e";
    public static final java.lang.String i = "f";
    public static final java.lang.String j = "j";
    public static final java.lang.String k = "k";
    private static long l;
    private static java.util.Vector<com.amap.api.col.p0003sl.iq> m = new java.util.Vector<>();

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        return context.getSharedPreferences("AMSKLG_CFG", 0).getString(str, "");
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void b(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    public static java.lang.String c(android.content.Context context, java.lang.String str) {
        return context.getFilesDir().getAbsolutePath() + a + str;
    }

    public static void a(final android.content.Context context) {
        try {
            if (java.lang.System.currentTimeMillis() - l < 60000) {
                return;
            }
            l = java.lang.System.currentTimeMillis();
            com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.col.3sl.js.1
                @Override // com.amap.api.col.p0003sl.ma
                public final void runTask() {
                    try {
                        com.amap.api.col.p0003sl.jv.b(context);
                        com.amap.api.col.p0003sl.jv.d(context);
                        com.amap.api.col.p0003sl.jv.c(context);
                        com.amap.api.col.p0003sl.li.a(context);
                        com.amap.api.col.p0003sl.lg.a(context);
                    } catch (java.util.concurrent.RejectedExecutionException unused) {
                    } catch (java.lang.Throwable th) {
                        com.amap.api.col.p0003sl.ju.c(th, "Lg", "proL");
                    }
                }
            });
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "Lg", "proL");
        }
    }

    public static void a(com.amap.api.col.p0003sl.iq iqVar) {
        try {
            synchronized (android.os.Looper.getMainLooper()) {
                if (iqVar == null) {
                    return;
                }
                if (m.contains(iqVar)) {
                    return;
                }
                m.add(iqVar);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    static java.util.List<com.amap.api.col.p0003sl.iq> a() {
        java.util.Vector<com.amap.api.col.p0003sl.iq> vector;
        try {
            synchronized (android.os.Looper.getMainLooper()) {
                vector = m;
            }
            return vector;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return m;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        r1 = r7.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (r2 >= r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (b(r6, r7[r2].trim()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean a(java.lang.String[] r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L4d
            if (r7 != 0) goto L6
            goto L4d
        L6:
            java.lang.String r1 = "\n"
            java.lang.String[] r7 = r7.split(r1)     // Catch: java.lang.Throwable -> L49
            int r1 = r7.length     // Catch: java.lang.Throwable -> L49
            r2 = 0
        Le:
            r3 = 1
            if (r2 >= r1) goto L35
            r4 = r7[r2]     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L49
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L2e
            java.lang.String r5 = "at "
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L2e
            java.lang.String r5 = "uncaughtException"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L2e
            goto L2f
        L2e:
            r3 = 0
        L2f:
            if (r3 == 0) goto L32
            return r0
        L32:
            int r2 = r2 + 1
            goto Le
        L35:
            int r1 = r7.length     // Catch: java.lang.Throwable -> L49
            r2 = 0
        L37:
            if (r2 >= r1) goto L4d
            r4 = r7[r2]     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L49
            boolean r4 = b(r6, r4)     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L46
            return r3
        L46:
            int r2 = r2 + 1
            goto L37
        L49:
            r6 = move-exception
            r6.printStackTrace()
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.js.a(java.lang.String[], java.lang.String):boolean");
    }

    static boolean b(java.lang.String[] strArr, java.lang.String str) {
        if (strArr != null && str != null) {
            try {
                for (java.lang.String str2 : strArr) {
                    str = str.trim();
                    if (str.startsWith("at ")) {
                        if (str.contains(str2 + ".") && str.endsWith(")") && !str.contains("uncaughtException")) {
                            return true;
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }
}
