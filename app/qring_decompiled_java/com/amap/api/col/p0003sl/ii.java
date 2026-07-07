package com.amap.api.col.p0003sl;

/* compiled from: DeviceInfo.java */
/* loaded from: classes.dex */
public final class ii {
    private static java.lang.String A = "";
    private static boolean B = false;
    private static java.lang.String C = "";
    private static java.lang.String D = "";
    private static java.lang.String E = "";
    private static boolean F = false;
    private static boolean G = false;
    private static java.lang.String H = "";
    private static boolean I = false;
    private static boolean J = false;
    private static long K = 0;
    private static int L = 0;
    private static java.lang.String M = null;
    private static java.lang.String N = "";
    private static boolean O = true;
    private static boolean P = false;
    private static java.lang.String Q = "";
    private static boolean R = false;
    private static int S = -1;
    private static boolean T = false;
    private static java.lang.Object U = null;
    private static int V = -1;
    private static boolean W = false;
    private static volatile com.amap.api.col.3sl.ii.b X = null;
    static java.lang.String a = "";
    static java.lang.String b = "";
    static volatile boolean c = true;
    public static boolean d = false;
    static java.lang.String e = "";
    static boolean f = false;
    public static com.amap.api.col.3sl.ii.a g = null;
    static int h = -1;
    static java.lang.String i = "";
    static java.lang.String j = "";
    private static java.lang.String k = null;
    private static boolean l = false;
    private static java.lang.String m = "";
    private static volatile boolean n = false;
    private static java.lang.String o = "";
    private static boolean p = false;
    private static java.lang.String q = null;
    private static android.os.IBinder r = null;
    private static boolean s = false;
    private static boolean t = false;
    private static java.lang.String u = "";
    private static java.lang.String v = "";
    private static boolean w = false;
    private static boolean x = false;
    private static java.lang.String y = "";
    private static boolean z;

    /* compiled from: DeviceInfo.java */
    public interface a {
        com.amap.api.col.p0003sl.kz a(byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map);

        java.lang.String a();

        java.lang.String a(android.content.Context context, java.lang.String str);

        java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

        java.util.Map<java.lang.String, java.lang.String> b();
    }

    public static java.lang.String e() {
        return "";
    }

    public static java.lang.String f() {
        return "";
    }

    public static java.lang.String g() {
        return "";
    }

    public static java.lang.String m() {
        return "";
    }

    public static java.lang.String n() {
        return "";
    }

    static /* synthetic */ boolean r() {
        s = true;
        return true;
    }

    public static void a(java.lang.String str) {
        k = str;
    }

    public static java.lang.String a() {
        return k;
    }

    public static java.lang.String b() {
        try {
            if (!android.text.TextUtils.isEmpty(e)) {
                return e;
            }
            com.amap.api.col.3sl.ii.a aVar = g;
            return aVar == null ? "" : aVar.a();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static void a(com.amap.api.col.3sl.ii.a aVar) {
        if (g == null) {
            g = aVar;
        }
    }

    public static com.amap.api.col.3sl.ii.a c() {
        return g;
    }

    public static java.lang.String a(final android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(b)) {
            return b;
        }
        if (context == null) {
            return "";
        }
        java.lang.String H2 = H(context);
        b = H2;
        if (!android.text.TextUtils.isEmpty(H2)) {
            return b;
        }
        if (c() == null || n) {
            return "";
        }
        n = true;
        com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.col.3sl.ii.1
            @Override // com.amap.api.col.p0003sl.ma
            public final void runTask() {
                try {
                    java.util.Map<java.lang.String, java.lang.String> b2 = com.amap.api.col.p0003sl.ii.g.b();
                    java.lang.String a2 = com.amap.api.col.p0003sl.ii.g.a(com.amap.api.col.p0003sl.ii.f(context), "", "", com.amap.api.col.p0003sl.ii.n());
                    if (android.text.TextUtils.isEmpty(a2)) {
                        return;
                    }
                    com.amap.api.col.p0003sl.ks.a();
                    java.lang.String a3 = com.amap.api.col.p0003sl.ii.g.a(context, new java.lang.String(com.amap.api.col.p0003sl.ks.a(com.amap.api.col.p0003sl.ii.g.a(a2.getBytes(), b2)).a));
                    if (android.text.TextUtils.isEmpty(a3)) {
                        return;
                    }
                    com.amap.api.col.p0003sl.ii.b = a3;
                } catch (java.lang.Throwable unused) {
                }
            }
        });
        return "";
    }

    public static java.lang.String b(android.content.Context context) {
        try {
            return C(context);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static java.lang.String d() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            java.lang.String n2 = n();
            return n2.length() < 5 ? "" : n2.substring(3, 5);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static int c(android.content.Context context) {
        try {
            return F(context);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static int d(android.content.Context context) {
        try {
            return D(context);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    private static java.lang.String v(android.content.Context context) {
        try {
            java.lang.String b2 = com.amap.api.col.p0003sl.kh.b(context, "Alvin2", "UTDID2", "");
            return android.text.TextUtils.isEmpty(b2) ? com.amap.api.col.p0003sl.kh.b(context, "Alvin2", "UTDID", "") : b2;
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    private static java.lang.String w(android.content.Context context) {
        java.io.FileInputStream fileInputStream = null;
        try {
            if (com.amap.api.col.p0003sl.ir.a(context, "android.permission.READ_EXTERNAL_STORAGE") && "mounted".equals(android.os.Environment.getExternalStorageState())) {
                java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + "/.UTSystemConfig/Global/Alvin2.xml");
                org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
                try {
                    newPullParser.setInput(fileInputStream2, "utf-8");
                    boolean z2 = false;
                    for (int eventType = newPullParser.getEventType(); 1 != eventType; eventType = newPullParser.next()) {
                        if (eventType != 2) {
                            if (eventType == 3) {
                                z2 = false;
                            } else if (eventType == 4 && z2) {
                                java.lang.String text = newPullParser.getText();
                                try {
                                    fileInputStream2.close();
                                } catch (java.lang.Throwable unused) {
                                }
                                return text;
                            }
                        } else if (newPullParser.getAttributeCount() > 0) {
                            int attributeCount = newPullParser.getAttributeCount();
                            for (int i2 = 0; i2 < attributeCount; i2++) {
                                java.lang.String attributeValue = newPullParser.getAttributeValue(i2);
                                if ("UTDID2".equals(attributeValue) || "UTDID".equals(attributeValue)) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    fileInputStream = fileInputStream2;
                } catch (java.lang.Throwable unused2) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream == null) {
                        return "";
                    }
                    fileInputStream.close();
                    return "";
                }
            }
            if (fileInputStream == null) {
                return "";
            }
        } catch (java.lang.Throwable unused3) {
        }
        try {
            fileInputStream.close();
            return "";
        } catch (java.lang.Throwable unused4) {
            return "";
        }
    }

    /* compiled from: DeviceInfo.java */
    static class c implements android.content.ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
        }

        c() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            android.os.IBinder unused = com.amap.api.col.p0003sl.ii.r = iBinder;
        }
    }

    private static java.lang.String x(android.content.Context context) {
        try {
            if (!android.text.TextUtils.isEmpty(q)) {
                return q;
            }
            byte[] digest = java.security.MessageDigest.getInstance(com.amap.api.col.p0003sl.ir.c("IU0hBMQ")).digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(java.lang.Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            java.lang.String stringBuffer2 = stringBuffer.toString();
            if (!android.text.TextUtils.isEmpty(stringBuffer2)) {
                q = stringBuffer2;
            }
            return stringBuffer2;
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r12, int r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.ii.a(android.content.Context, int):java.lang.String");
    }

    private static java.lang.String y(android.content.Context context) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(com.amap.api.col.p0003sl.ir.c("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
            java.lang.Object invoke = cls.getMethod(com.amap.api.col.p0003sl.ir.c("MZ2V0T0FJRA"), android.content.Context.class).invoke(cls.newInstance(), context);
            if (invoke != null) {
                java.lang.String str = (java.lang.String) invoke;
                o = str;
                return str;
            }
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "oa", "xm");
            p = true;
        }
        return o;
    }

    private static java.lang.String z(android.content.Context context) {
        try {
            android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse(com.amap.api.col.p0003sl.ir.c("QY29udGVudDovL2NvbS52aXZvLnZtcy5JZFByb3ZpZGVyL0lkZW50aWZpZXJJZC9PQUlE")), null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    int columnCount = query.getColumnCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= columnCount) {
                            break;
                        }
                        if (com.amap.api.col.p0003sl.ir.c("IdmFsdWU").equals(query.getColumnName(i2))) {
                            o = query.getString(i2);
                            break;
                        }
                        i2++;
                    }
                }
                query.close();
            }
        } catch (java.lang.Throwable th) {
            p = true;
            com.amap.api.col.p0003sl.jr.a(th, "oa", "vivo");
        }
        return o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String A(android.content.Context context) {
        if (com.amap.api.col.p0003sl.ir.c("IeGlhb21p").equalsIgnoreCase(android.os.Build.MANUFACTURER) || com.amap.api.col.p0003sl.ir.c("IeGlhb21p").equalsIgnoreCase(android.os.Build.BRAND) || com.amap.api.col.p0003sl.ir.c("IUkVETUk=").equalsIgnoreCase(android.os.Build.MANUFACTURER) || com.amap.api.col.p0003sl.ir.c("IUkVETUk=").equalsIgnoreCase(android.os.Build.BRAND)) {
            return y(context);
        }
        if (com.amap.api.col.p0003sl.ir.c("Idml2bw").equalsIgnoreCase(android.os.Build.MANUFACTURER) || com.amap.api.col.p0003sl.ir.c("Idml2bw").equalsIgnoreCase(android.os.Build.BRAND)) {
            return z(context);
        }
        if (com.amap.api.col.p0003sl.ir.c("IaHVhd2Vp").equalsIgnoreCase(android.os.Build.MANUFACTURER) || com.amap.api.col.p0003sl.ir.c("IaHVhd2Vp").equalsIgnoreCase(android.os.Build.BRAND) || com.amap.api.col.p0003sl.ir.c("ISE9OT1I=").equalsIgnoreCase(android.os.Build.MANUFACTURER)) {
            return a(context, 2);
        }
        if (com.amap.api.col.p0003sl.ir.c("Mc2Ftc3VuZw").equalsIgnoreCase(android.os.Build.MANUFACTURER) || com.amap.api.col.p0003sl.ir.c("Mc2Ftc3VuZw").equalsIgnoreCase(android.os.Build.BRAND)) {
            return a(context, 4);
        }
        if (com.amap.api.col.p0003sl.ir.c("IT1BQTw").equalsIgnoreCase(android.os.Build.MANUFACTURER) || com.amap.api.col.p0003sl.ir.c("IT1BQTw").equalsIgnoreCase(android.os.Build.BRAND) || com.amap.api.col.p0003sl.ir.c("MT25lUGx1cw").equalsIgnoreCase(android.os.Build.MANUFACTURER) || com.amap.api.col.p0003sl.ir.c("MT25lUGx1cw").equalsIgnoreCase(android.os.Build.BRAND) || com.amap.api.col.p0003sl.ir.c("IUkVBTE1F").equalsIgnoreCase(android.os.Build.BRAND)) {
            return a(context, 5);
        }
        p = true;
        return o;
    }

    public static java.lang.String e(final android.content.Context context) {
        if (p) {
            return "";
        }
        if (!android.text.TextUtils.isEmpty(o)) {
            return o;
        }
        if (s) {
            return o;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.col.3sl.ii.2
                @Override // com.amap.api.col.p0003sl.ma
                public final void runTask() {
                    com.amap.api.col.p0003sl.ii.A(context);
                    com.amap.api.col.p0003sl.ii.r();
                }
            });
            return o;
        }
        s = true;
        return A(context);
    }

    public static java.lang.String f(android.content.Context context) {
        java.lang.String str;
        if (t) {
            java.lang.String str2 = a;
            return str2 == null ? "" : str2;
        }
        try {
            str = a;
        } catch (java.lang.Throwable unused) {
        }
        if (str != null && !"".equals(str)) {
            return a;
        }
        if (b(context, com.amap.api.col.p0003sl.ir.c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
            a = android.provider.Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
        }
        if (!android.text.TextUtils.isEmpty(a)) {
            t = true;
            return a;
        }
        try {
            java.lang.String v2 = v(context);
            a = v2;
            if (!android.text.TextUtils.isEmpty(v2)) {
                t = true;
                return a;
            }
        } catch (java.lang.Throwable unused2) {
        }
        try {
            a = w(context);
            t = true;
        } catch (java.lang.Throwable unused3) {
        }
        java.lang.String str3 = a;
        return str3 == null ? "" : str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(android.content.Context context, java.lang.String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static java.lang.String h() {
        return y;
    }

    static java.lang.String[] i() {
        return new java.lang.String[]{"", ""};
    }

    static java.lang.String g(android.content.Context context) {
        try {
            android.telephony.TelephonyManager G2 = G(context);
            if (G2 == null) {
                return "";
            }
            java.lang.String networkOperator = G2.getNetworkOperator();
            if (!android.text.TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                return networkOperator.substring(0, 3);
            }
            return "";
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    static java.lang.String h(android.content.Context context) {
        android.telephony.TelephonyManager G2;
        if (B) {
            return A;
        }
        try {
            L(context);
            G2 = G(context);
        } catch (java.lang.Throwable unused) {
        }
        if (G2 == null) {
            return A;
        }
        java.lang.String networkOperator = G2.getNetworkOperator();
        if (!android.text.TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
            A = networkOperator.substring(3);
            B = true;
            return A;
        }
        B = true;
        return A;
    }

    public static int i(android.content.Context context) {
        try {
            return F(context);
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public static int j(android.content.Context context) {
        try {
            return D(context);
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public static android.net.NetworkInfo k(android.content.Context context) {
        android.net.ConnectivityManager E2;
        if (b(context, com.amap.api.col.p0003sl.ir.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (E2 = E(context)) != null) {
            return E2.getActiveNetworkInfo();
        }
        return null;
    }

    static java.lang.String l(android.content.Context context) {
        try {
            android.net.NetworkInfo k2 = k(context);
            if (k2 == null) {
                return null;
            }
            return k2.getExtraInfo();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static java.lang.String m(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        try {
            str = C;
        } catch (java.lang.Throwable unused) {
        }
        if (str != null && !"".equals(str)) {
            return C;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return "";
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (i3 > i2) {
            str2 = i2 + "*" + i3;
        } else {
            str2 = i3 + "*" + i2;
        }
        C = str2;
        return C;
    }

    public static java.lang.String n(android.content.Context context) {
        try {
            if (!b(context, com.amap.api.col.p0003sl.ir.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return N;
            }
            android.telephony.TelephonyManager G2 = G(context);
            return G2 == null ? "" : G2.getNetworkOperatorName();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static java.lang.String j() {
        return i;
    }

    public static java.lang.String p(android.content.Context context) {
        try {
            java.lang.String k2 = k();
            try {
                if (android.text.TextUtils.isEmpty(k2)) {
                    k2 = a(context);
                }
                if (android.text.TextUtils.isEmpty(k2)) {
                    k2 = f(context);
                }
                if (android.text.TextUtils.isEmpty(k2)) {
                    k2 = e(context);
                }
                if (android.text.TextUtils.isEmpty(k2)) {
                    k2 = g();
                }
                return android.text.TextUtils.isEmpty(k2) ? B(context) : k2;
            } catch (java.lang.Throwable unused) {
                return k2;
            }
        } catch (java.lang.Throwable unused2) {
            return "";
        }
    }

    private static java.lang.String B(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(H)) {
            return H;
        }
        try {
            java.lang.String b2 = com.amap.api.col.p0003sl.kh.b(context, "open_common", "a1", "");
            if (android.text.TextUtils.isEmpty(b2)) {
                H = "amap" + java.util.UUID.randomUUID().toString().replace("_", "").toLowerCase();
                android.content.SharedPreferences.Editor a2 = com.amap.api.col.p0003sl.kh.a(context, "open_common");
                com.amap.api.col.p0003sl.kh.a(a2, "a1", com.amap.api.col.p0003sl.ir.b(H));
                com.amap.api.col.p0003sl.kh.a(a2);
            } else {
                H = com.amap.api.col.p0003sl.ir.c(b2);
            }
            return H;
        } catch (java.lang.Throwable unused) {
            return H;
        }
    }

    public static java.lang.String k() {
        return D;
    }

    public static void l() {
        try {
            com.amap.api.col.p0003sl.jq.a();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static java.lang.String q(android.content.Context context) {
        return k() + "#" + a(context) + "#" + p(context);
    }

    public static long o() {
        long blockCount;
        long blockCount2;
        long j2 = K;
        if (j2 != 0) {
            return j2;
        }
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getRootDirectory().getAbsolutePath());
            android.os.StatFs statFs2 = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getAbsolutePath());
            if (android.os.Build.VERSION.SDK_INT >= 18) {
                blockCount = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
                blockCount2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576;
            } else {
                blockCount = (statFs.getBlockCount() * statFs.getBlockSize()) / 1048576;
                blockCount2 = (statFs2.getBlockCount() * statFs2.getBlockSize()) / 1048576;
            }
            K = blockCount + blockCount2;
        } catch (java.lang.Throwable unused) {
        }
        return K;
    }

    public static int r(android.content.Context context) {
        java.io.BufferedReader bufferedReader;
        int i2 = L;
        if (i2 != 0) {
            return i2;
        }
        int i3 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return 0;
            }
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            i3 = (int) (memoryInfo.totalMem / 1024);
        } else {
            java.io.BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File("/proc/meminfo")));
                } catch (java.io.IOException unused) {
                }
                try {
                    i3 = java.lang.Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue();
                    bufferedReader.close();
                } catch (java.lang.Throwable unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    int i4 = i3 / 1024;
                    L = i4;
                    return i4;
                }
            } catch (java.lang.Throwable unused3) {
            }
        }
        int i42 = i3 / 1024;
        L = i42;
        return i42;
    }

    public static java.lang.String p() {
        if (!android.text.TextUtils.isEmpty(M)) {
            return M;
        }
        java.lang.String property = java.lang.System.getProperty("os.arch");
        M = property;
        return property;
    }

    static java.lang.String s(android.content.Context context) {
        try {
            return C(context);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    private static java.lang.String C(android.content.Context context) {
        if (R) {
            return Q;
        }
        L(context);
        android.telephony.TelephonyManager G2 = G(context);
        if (G2 == null) {
            return Q;
        }
        java.lang.String simOperatorName = G2.getSimOperatorName();
        Q = simOperatorName;
        if (android.text.TextUtils.isEmpty(simOperatorName)) {
            Q = G2.getNetworkOperatorName();
        }
        R = true;
        return Q;
    }

    private static int D(android.content.Context context) {
        if (T) {
            return S;
        }
        L(context);
        if (context == null || !b(context, com.amap.api.col.p0003sl.ir.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return S;
        }
        android.net.ConnectivityManager E2 = E(context);
        if (E2 == null) {
            return S;
        }
        android.net.NetworkInfo activeNetworkInfo = E2.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            T = true;
            return S;
        }
        int type = activeNetworkInfo.getType();
        S = type;
        T = true;
        return type;
    }

    private static android.net.ConnectivityManager E(android.content.Context context) {
        return (android.net.ConnectivityManager) context.getSystemService("connectivity");
    }

    private static int F(android.content.Context context) {
        if (W) {
            return V;
        }
        L(context);
        if (!b(context, com.amap.api.col.p0003sl.ir.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return V;
        }
        android.net.ConnectivityManager E2 = E(context);
        if (E2 == null) {
            return V;
        }
        android.net.NetworkInfo activeNetworkInfo = E2.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            V = activeNetworkInfo.getSubtype();
            W = true;
        }
        return V;
    }

    private static android.telephony.TelephonyManager G(android.content.Context context) {
        return (android.telephony.TelephonyManager) context.getSystemService("phone");
    }

    private static java.lang.String H(android.content.Context context) {
        if (!c) {
            return "";
        }
        java.lang.String str = null;
        try {
            str = I(context);
        } catch (java.lang.Throwable unused) {
        }
        if (android.text.TextUtils.isEmpty(str)) {
            c = false;
            return "";
        }
        try {
            byte[] bytes = com.amap.api.col.p0003sl.ir.c("MAAAAAAAAAAAAAAAAAAAAAA").getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
            return new java.lang.String(com.amap.api.col.p0003sl.ij.a(com.amap.api.col.p0003sl.ir.c("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU").getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME), com.amap.api.col.p0003sl.ij.b(str), bytes), com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
        } catch (java.lang.Throwable unused2) {
            c = false;
            return "";
        }
    }

    private static java.lang.String I(android.content.Context context) {
        java.lang.String str;
        try {
            str = J(context);
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        return !android.text.TextUtils.isEmpty(str) ? str : context == null ? "" : context.getSharedPreferences(com.amap.api.col.p0003sl.ir.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(com.amap.api.col.p0003sl.im.b(com.amap.api.col.p0003sl.ir.c("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
    }

    private static java.lang.String J(android.content.Context context) {
        java.io.RandomAccessFile randomAccessFile;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.lang.String str;
        java.lang.String[] split;
        if (android.os.Build.VERSION.SDK_INT >= 19 && !b(context, com.amap.api.col.p0003sl.ir.c("EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfRVhURVJOQUxfU1RPUkFHRQ=="))) {
            return "";
        }
        java.lang.String b2 = com.amap.api.col.p0003sl.im.b(com.amap.api.col.p0003sl.ir.c("LYW1hcF9kZXZpY2VfYWRpdQ"));
        java.lang.String K2 = K(context);
        if (android.text.TextUtils.isEmpty(K2)) {
            return "";
        }
        java.io.File file = new java.io.File(K2 + java.io.File.separator + com.amap.api.col.p0003sl.ir.c("KYmFja3Vwcw"), com.amap.api.col.p0003sl.ir.c("MLmFkaXU"));
        if (file.exists() && file.canRead()) {
            if (file.length() == 0) {
                file.delete();
                return "";
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                randomAccessFile = new java.io.RandomAccessFile(file, "r");
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = randomAccessFile.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (java.lang.Throwable unused) {
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            a(byteArrayOutputStream2);
                            a(randomAccessFile);
                            return "";
                        }
                    }
                    str = new java.lang.String(byteArrayOutputStream.toByteArray(), com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
                } catch (java.lang.Throwable unused2) {
                }
            } catch (java.lang.Throwable unused3) {
                randomAccessFile = null;
            }
            if (!android.text.TextUtils.isEmpty(str) && str.contains(com.amap.api.col.p0003sl.ir.c("SIw")) && (split = str.split(com.amap.api.col.p0003sl.ir.c("SIw"))) != null && split.length == 2 && android.text.TextUtils.equals(b2, split[0])) {
                java.lang.String str2 = split[1];
                a(byteArrayOutputStream);
                a(randomAccessFile);
                return str2;
            }
            a(byteArrayOutputStream);
            a(randomAccessFile);
        }
        return "";
    }

    private static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private static java.lang.String K(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 9) {
            return null;
        }
        try {
            android.os.storage.StorageManager storageManager = (android.os.storage.StorageManager) context.getSystemService("storage");
            java.lang.Class<?> cls = java.lang.Class.forName(com.amap.api.col.p0003sl.ir.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
            java.lang.reflect.Method method = storageManager.getClass().getMethod(com.amap.api.col.p0003sl.ir.c("MZ2V0Vm9sdW1lTGlzdA"), new java.lang.Class[0]);
            java.lang.reflect.Method method2 = cls.getMethod(com.amap.api.col.p0003sl.ir.c("FZ2V0UGF0aA"), new java.lang.Class[0]);
            java.lang.reflect.Method method3 = cls.getMethod(com.amap.api.col.p0003sl.ir.c("DaXNSZW1vdmFibGU"), new java.lang.Class[0]);
            java.lang.Object invoke = method.invoke(storageManager, new java.lang.Object[0]);
            int length = java.lang.reflect.Array.getLength(invoke);
            for (int i2 = 0; i2 < length; i2++) {
                java.lang.Object obj = java.lang.reflect.Array.get(invoke, i2);
                java.lang.String str = (java.lang.String) method2.invoke(obj, new java.lang.Object[0]);
                if (!((java.lang.Boolean) method3.invoke(obj, new java.lang.Object[0])).booleanValue()) {
                    return str;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public static void q() {
        S = -1;
        T = false;
        V = -1;
        W = false;
        Q = "";
        R = false;
        A = "";
        B = false;
    }

    /* compiled from: DeviceInfo.java */
    public static class b {
        private static android.content.Context a;
        private static android.content.BroadcastReceiver b;
        private static android.net.ConnectivityManager c;
        private static android.net.NetworkRequest d;
        private static android.net.ConnectivityManager.NetworkCallback e;

        public final void a(android.content.Context context) {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                if (com.amap.api.col.p0003sl.ii.b(context, com.amap.api.col.p0003sl.ir.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && context != null && c == null) {
                    android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                    c = connectivityManager;
                    if (connectivityManager != null) {
                        d = new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
                        android.net.ConnectivityManager.NetworkCallback networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.amap.api.col.3sl.ii.b.2
                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public final void onLost(android.net.Network network) {
                                super.onLost(network);
                                com.amap.api.col.p0003sl.ii.q();
                            }

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public final void onAvailable(android.net.Network network) {
                                super.onAvailable(network);
                                com.amap.api.col.p0003sl.ii.q();
                            }
                        };
                        e = networkCallback;
                        c.registerNetworkCallback(d, networkCallback);
                        a = context;
                        return;
                    }
                    return;
                }
                return;
            }
            if (context == null || b != null) {
                return;
            }
            b = new android.content.BroadcastReceiver() { // from class: com.amap.api.col.3sl.ii.b.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(android.content.Context context2, android.content.Intent intent) {
                    if (com.amap.api.col.p0003sl.ir.c("WYW5kcm9pZC5uZXQuY29ubi5DT05ORUNUSVZJVFlfQ0hBTkdF").equals(intent.getAction())) {
                        com.amap.api.col.p0003sl.ii.q();
                    }
                }
            };
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction(com.amap.api.col.p0003sl.ir.c("WYW5kcm9pZC5uZXQuY29ubi5DT05ORUNUSVZJVFlfQ0hBTkdF"));
            context.registerReceiver(b, intentFilter);
        }
    }

    private static synchronized com.amap.api.col.3sl.ii.b L(android.content.Context context) {
        synchronized (com.amap.api.col.p0003sl.ii.class) {
            if (X == null) {
                if (context == null) {
                    return null;
                }
                com.amap.api.col.3sl.ii.b bVar = new com.amap.api.col.3sl.ii.b();
                X = bVar;
                bVar.a(context.getApplicationContext());
            }
            return X;
        }
    }

    public static java.lang.String t(android.content.Context context) {
        try {
            if (android.text.TextUtils.isEmpty(m)) {
                m = com.amap.api.col.p0003sl.iy.a(context);
            }
        } catch (java.lang.Throwable unused) {
        }
        return m;
    }

    public static java.lang.String o(android.content.Context context) {
        android.net.ConnectivityManager E2;
        android.net.NetworkInfo activeNetworkInfo;
        try {
            return (!b(context, com.amap.api.col.p0003sl.ir.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (E2 = E(context)) == null || (activeNetworkInfo = E2.getActiveNetworkInfo()) == null) ? "" : activeNetworkInfo.getTypeName();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }
}
