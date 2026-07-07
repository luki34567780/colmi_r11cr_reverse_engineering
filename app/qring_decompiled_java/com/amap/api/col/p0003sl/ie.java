package com.amap.api.col.p0003sl;

/* compiled from: AppInfo.java */
/* loaded from: classes.dex */
public final class ie {
    static java.lang.String a = null;
    static boolean b = false;
    private static java.lang.String c = "";
    private static java.lang.String d = "";
    private static java.lang.String e = "";
    private static java.lang.String f = "";

    private static boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c2 : str.toCharArray()) {
            if (('A' > c2 || c2 > 'z') && (('0' > c2 || c2 > ':') && c2 != '.')) {
                try {
                    com.amap.api.col.p0003sl.ju.b(com.amap.api.col.p0003sl.ir.a(), str, "errorPackage");
                } catch (java.lang.Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    static boolean a() {
        if (b) {
            return true;
        }
        if (c(a)) {
            b = true;
            return true;
        }
        if (!android.text.TextUtils.isEmpty(a)) {
            b = false;
            a = null;
            return false;
        }
        if (c(d)) {
            b = true;
            return true;
        }
        if (!android.text.TextUtils.isEmpty(d)) {
            b = false;
            d = null;
            return false;
        }
        return true;
    }

    public static java.lang.String a(android.content.Context context) {
        try {
            return h(context);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return f;
        }
    }

    public static java.lang.String b(android.content.Context context) {
        try {
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "AI", "gAN");
        }
        if (!"".equals(c)) {
            return c;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        c = (java.lang.String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
        return c;
    }

    public static void a(java.lang.String str) {
        d = str;
    }

    public static java.lang.String c(android.content.Context context) {
        java.lang.String str;
        try {
            str = d;
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "AI", "gpck");
        }
        if (str != null && !"".equals(str)) {
            return d;
        }
        java.lang.String packageName = context.getPackageName();
        d = packageName;
        if (!c(packageName)) {
            d = context.getPackageName();
        }
        return d;
    }

    public static java.lang.String d(android.content.Context context) {
        try {
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "AI", "gAV");
        }
        if (!"".equals(e)) {
            return e;
        }
        e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        java.lang.String str = e;
        return str == null ? "" : str;
    }

    public static java.lang.String e(android.content.Context context) {
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] digest = java.security.MessageDigest.getInstance(com.amap.api.col.p0003sl.ir.c("IU0hBMQ")).digest(packageInfo.signatures[0].toByteArray());
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (byte b2 : digest) {
                java.lang.String upperCase = java.lang.Integer.toHexString(b2 & 255).toUpperCase(java.util.Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            java.lang.String str = packageInfo.packageName;
            if (c(str)) {
                str = packageInfo.packageName;
            }
            if (!android.text.TextUtils.isEmpty(d)) {
                str = c(context);
            }
            stringBuffer.append(str);
            java.lang.String stringBuffer2 = stringBuffer.toString();
            a = stringBuffer2;
            return stringBuffer2;
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "AI", "gsp");
            return a;
        }
    }

    static void b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f = str;
    }

    static void a(final android.content.Context context, final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f = str;
        if (context != null) {
            com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.col.3sl.ie.1
                @Override // com.amap.api.col.p0003sl.ma
                public final void runTask() {
                    java.io.FileOutputStream fileOutputStream = null;
                    try {
                        java.io.File file = new java.io.File(com.amap.api.col.p0003sl.js.c(context, "k.store"));
                        if (!file.getParentFile().exists()) {
                            file.getParentFile().mkdirs();
                        }
                        java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                        try {
                            fileOutputStream2.write(com.amap.api.col.p0003sl.ir.a(str));
                            try {
                                fileOutputStream2.close();
                            } catch (java.lang.Throwable th) {
                                th.printStackTrace();
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            try {
                                com.amap.api.col.p0003sl.jr.a(th, "AI", "stf");
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (java.lang.Throwable th3) {
                                        th3.printStackTrace();
                                    }
                                }
                            } catch (java.lang.Throwable th4) {
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (java.lang.Throwable th5) {
                                        th5.printStackTrace();
                                    }
                                }
                                throw th4;
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                    }
                }
            });
        }
    }

    public static java.lang.String f(android.content.Context context) {
        try {
            com.amap.api.col.p0003sl.Cif.a(context);
        } catch (java.lang.Throwable unused) {
        }
        try {
            return h(context);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "AI", "gKy");
            return f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String g(android.content.Context r6) {
        /*
            java.lang.String r0 = "k.store"
            java.lang.String r6 = com.amap.api.col.p0003sl.js.c(r6, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r6 = r0.exists()
            java.lang.String r1 = ""
            if (r6 != 0) goto L14
            return r1
        L14:
            r6 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            int r6 = r2.available()     // Catch: java.lang.Throwable -> L39
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L39
            r2.read(r6)     // Catch: java.lang.Throwable -> L39
            java.lang.String r6 = com.amap.api.col.p0003sl.ir.a(r6)     // Catch: java.lang.Throwable -> L39
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L39
            r3 = 32
            if (r0 != r3) goto L30
            r1 = r6
        L30:
            r2.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r6 = move-exception
            r6.printStackTrace()
        L38:
            return r1
        L39:
            r6 = move-exception
            goto L3f
        L3b:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L3f:
            java.lang.String r3 = "AI"
            java.lang.String r4 = "gKe"
            com.amap.api.col.p0003sl.jr.a(r6, r3, r4)     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r0.exists()     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L54
            r0.delete()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L5f
        L54:
            if (r2 == 0) goto L5e
            r2.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r6 = move-exception
            r6.printStackTrace()
        L5e:
            return r1
        L5f:
            r6 = move-exception
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.ie.g(android.content.Context):java.lang.String");
    }

    private static java.lang.String h(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String str = f;
        if (str == null || str.equals("")) {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return f;
            }
            java.lang.String string = applicationInfo.metaData.getString("com.amap.api.v2.apikey");
            f = string;
            if (string == null) {
                f = g(context);
            }
        }
        return f;
    }
}
