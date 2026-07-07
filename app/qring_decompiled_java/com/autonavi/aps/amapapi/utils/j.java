package com.autonavi.aps.amapapi.utils;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class j {
    static android.net.wifi.WifiManager a;
    private static int b;
    private static java.lang.String[] c;
    private static java.lang.String d;

    public static float a(float f) {
        return (float) (((long) (f * 100.0d)) / 100.0d);
    }

    public static java.lang.String a(int i) {
        if (i == 33) {
            return "补偿定位失败，未命中缓存";
        }
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            default:
                switch (i) {
                }
        }
        return "其他错误";
    }

    public static double b(double d2) {
        return ((long) (d2 * 1000000.0d)) / 1000000.0d;
    }

    public static double c(double d2) {
        return ((long) (d2 * 100.0d)) / 100.0d;
    }

    public static boolean a(com.autonavi.aps.amapapi.model.a aVar) {
        if (aVar == null || "8".equals(aVar.d()) || "5".equals(aVar.d()) || "6".equals(aVar.d())) {
            return false;
        }
        return b(aVar);
    }

    public static boolean a(com.amap.api.location.AMapLocation aMapLocation) {
        if (aMapLocation != null && aMapLocation.getErrorCode() == 0) {
            return b(aMapLocation);
        }
        return false;
    }

    public static boolean b(com.amap.api.location.AMapLocation aMapLocation) {
        double longitude = aMapLocation.getLongitude();
        double latitude = aMapLocation.getLatitude();
        return !(longitude == 0.0d && latitude == 0.0d) && longitude <= 180.0d && latitude <= 90.0d && longitude >= -180.0d && latitude >= -90.0d;
    }

    public static java.lang.String[] a(android.telephony.TelephonyManager telephonyManager) {
        int i;
        java.lang.String[] strArr;
        java.lang.String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        java.lang.String[] strArr2 = {"0", "0"};
        if (!android.text.TextUtils.isEmpty(networkOperator) && android.text.TextUtils.isDigitsOnly(networkOperator) && networkOperator.length() > 4) {
            strArr2[0] = networkOperator.substring(0, 3);
            char[] charArray = networkOperator.substring(3).toCharArray();
            int i2 = 0;
            while (i2 < charArray.length && java.lang.Character.isDigit(charArray[i2])) {
                i2++;
            }
            strArr2[1] = networkOperator.substring(3, i2 + 3);
        }
        try {
            i = java.lang.Integer.parseInt(strArr2[0]);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "Utils", "getMccMnc");
            i = 0;
        }
        if (i == 0) {
            strArr2[0] = "0";
        }
        if ("0".equals(strArr2[0]) || "0".equals(strArr2[1])) {
            return ("0".equals(strArr2[0]) && "0".equals(strArr2[1]) && (strArr = c) != null) ? strArr : strArr2;
        }
        c = strArr2;
        return strArr2;
    }

    public static long a() {
        return java.lang.System.currentTimeMillis();
    }

    public static long b() {
        return android.os.SystemClock.elapsedRealtime();
    }

    public static boolean a(android.content.Context context) {
        if (context == null) {
            return false;
        }
        try {
            if (c() < 17) {
                return d(context, "android.provider.Settings$System");
            }
            return d(context, "android.provider.Settings$Global");
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static boolean d(android.content.Context context, java.lang.String str) throws java.lang.Throwable {
        return ((java.lang.Integer) com.autonavi.aps.amapapi.utils.f.a(str, "getInt", new java.lang.Object[]{context.getContentResolver(), ((java.lang.String) com.autonavi.aps.amapapi.utils.f.a(str, "AIRPLANE_MODE_ON")).toString()}, (java.lang.Class<?>[]) new java.lang.Class[]{android.content.ContentResolver.class, java.lang.String.class})).intValue() == 1;
    }

    public static float a(double[] dArr) {
        float[] fArr = new float[1];
        android.location.Location.distanceBetween(dArr[0], dArr[1], dArr[2], dArr[3], fArr);
        return fArr[0];
    }

    public static float a(com.amap.api.location.AMapLocation aMapLocation, com.amap.api.location.AMapLocation aMapLocation2) {
        return a(new double[]{aMapLocation.getLatitude(), aMapLocation.getLongitude(), aMapLocation2.getLatitude(), aMapLocation2.getLongitude()});
    }

    public static float a(com.amap.api.location.DPoint dPoint, com.amap.api.location.DPoint dPoint2) {
        return a(new double[]{dPoint.getLatitude(), dPoint.getLongitude(), dPoint2.getLatitude(), dPoint2.getLongitude()});
    }

    public static java.lang.Object a(android.content.Context context, java.lang.String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getApplicationContext().getSystemService(str);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "Utils", "getServ");
            return null;
        }
    }

    public static int c() {
        int i = b;
        if (i > 0) {
            return i;
        }
        try {
            try {
                return com.autonavi.aps.amapapi.utils.f.b("android.os.Build$VERSION", "SDK_INT");
            } catch (java.lang.Throwable unused) {
                return 0;
            }
        } catch (java.lang.Throwable unused2) {
            return java.lang.Integer.parseInt(com.autonavi.aps.amapapi.utils.f.a("android.os.Build$VERSION", "SDK").toString());
        }
    }

    public static byte[] a(byte[] bArr) {
        return com.amap.api.col.p0003sl.ir.b(bArr);
    }

    public static java.lang.String b(android.content.Context context) {
        android.content.pm.PackageInfo packageInfo;
        if (!android.text.TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.b.j)) {
            return com.autonavi.aps.amapapi.utils.b.j;
        }
        if (context == null) {
            return null;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(com.amap.api.col.p0003sl.ie.c(context), 64);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "Utils", "getAppName part");
            packageInfo = null;
        }
        try {
            if (android.text.TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.b.k)) {
                com.autonavi.aps.amapapi.utils.b.k = null;
            }
        } catch (java.lang.Throwable th2) {
            com.autonavi.aps.amapapi.utils.b.a(th2, "Utils", "getAppName");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (packageInfo != null) {
            java.lang.CharSequence loadLabel = packageInfo.applicationInfo != null ? packageInfo.applicationInfo.loadLabel(context.getPackageManager()) : null;
            if (loadLabel != null) {
                sb.append(loadLabel.toString());
            }
            if (!android.text.TextUtils.isEmpty(packageInfo.versionName)) {
                sb.append(packageInfo.versionName);
            }
        }
        java.lang.String c2 = com.amap.api.col.p0003sl.ie.c(context);
        if (!android.text.TextUtils.isEmpty(c2)) {
            sb.append(",");
            sb.append(c2);
        }
        if (!android.text.TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.b.k)) {
            sb.append(",");
            sb.append(com.autonavi.aps.amapapi.utils.b.k);
        }
        java.lang.String sb2 = sb.toString();
        com.autonavi.aps.amapapi.utils.b.j = sb2;
        return sb2;
    }

    public static android.net.NetworkInfo c(android.content.Context context) {
        try {
            return com.amap.api.col.p0003sl.ii.k(context);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "Utils", "getNetWorkInfo");
            return null;
        }
    }

    public static int d() {
        return new java.util.Random().nextInt(65536) - 32768;
    }

    public static boolean a(org.json.JSONObject jSONObject, java.lang.String str) {
        return com.amap.api.col.p0003sl.ir.a(jSONObject, str);
    }

    public static boolean a(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || "00:00:00:00:00:00".equals(str) || "02:00:00:00:00:00".equals(str) || str.contains(" :")) ? false : true;
    }

    public static java.lang.String e() {
        try {
            return com.amap.api.col.p0003sl.ij.b("S128DF1572465B890OE3F7A13167KLEI".getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME)).substring(20);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static int a(android.net.NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) {
            return networkInfo.getType();
        }
        return -1;
    }

    public static boolean d(android.content.Context context) {
        try {
            android.net.NetworkInfo c2 = c(context);
            if (c2 != null) {
                if (c2.isConnectedOrConnecting()) {
                    return true;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static java.lang.String a(android.net.ConnectivityManager connectivityManager) {
        int i = 0;
        if (connectivityManager != null) {
            try {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    i = activeNetworkInfo.getSubtype();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            case 13:
                return "LTE";
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            default:
                return "UNKWN";
        }
    }

    public static byte[] a(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((j >> (i * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] a(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            bArr = new byte[2];
        }
        bArr[0] = (byte) (i & 255);
        bArr[1] = (byte) ((i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(long r4, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L8
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
        L8:
            r0 = 0
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L17
            java.util.Locale r2 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L17
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L17
            r1.applyPattern(r6)     // Catch: java.lang.Throwable -> L14
            goto L20
        L14:
            r6 = move-exception
            r0 = r1
            goto L18
        L17:
            r6 = move-exception
        L18:
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "formatUTC"
            com.autonavi.aps.amapapi.utils.b.a(r6, r1, r2)
            r1 = r0
        L20:
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L2a
            long r4 = a()
        L2a:
            if (r1 != 0) goto L2f
            java.lang.String r4 = "NULL"
            return r4
        L2f:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = r1.format(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.autonavi.aps.amapapi.utils.j.a(long, java.lang.String):java.lang.String");
    }

    public static byte[] b(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            bArr = new byte[4];
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    public static double a(double d2) {
        return b(d2);
    }

    public static int b(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i |= (bArr[i2] & 255) << ((1 - i2) * 8);
        }
        return i;
    }

    public static boolean e(android.content.Context context) {
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 23 && context.getApplicationInfo().targetSdkVersion >= 23) {
            android.app.Application application = (android.app.Application) context;
            for (java.lang.String str : com.autonavi.aps.amapapi.b.F) {
                try {
                    i = com.autonavi.aps.amapapi.utils.f.b(application.getBaseContext(), "checkSelfPermission", str);
                } catch (java.lang.Throwable unused) {
                    i = 0;
                }
                if (i == 0) {
                }
            }
            return true;
        }
        for (java.lang.String str2 : com.autonavi.aps.amapapi.b.F) {
            if (context.checkCallingOrSelfPermission(str2) == 0) {
            }
        }
        return true;
        return false;
    }

    public static boolean f(android.content.Context context) {
        int i;
        if (context.getApplicationInfo().targetSdkVersion < 29 || android.os.Build.VERSION.SDK_INT < 29) {
            return true;
        }
        try {
            i = com.autonavi.aps.amapapi.utils.f.b(((android.app.Application) context).getBaseContext(), "checkSelfPermission", com.autonavi.aps.amapapi.b.G);
        } catch (java.lang.Throwable unused) {
            i = 0;
        }
        return i == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:11:0x0011, B:13:0x0017, B:17:0x0024, B:19:0x002e, B:21:0x0037), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.location.Location r7, int r8) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L40
            r2 = 18
            if (r1 < r2) goto Lc
            boolean r1 = r7.isFromMockProvider()     // Catch: java.lang.Throwable -> Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r2 = 1
            if (r1 == 0) goto L11
            return r2
        L11:
            android.os.Bundle r1 = r7.getExtras()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L1e
            java.lang.String r3 = "satellites"
            int r1 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L40
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 > 0) goto L22
            return r2
        L22:
            if (r8 != 0) goto L40
            double r3 = r7.getAltitude()     // Catch: java.lang.Throwable -> L40
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L40
            float r8 = r7.getBearing()     // Catch: java.lang.Throwable -> L40
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 != 0) goto L40
            float r7 = r7.getSpeed()     // Catch: java.lang.Throwable -> L40
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto L40
            return r2
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.autonavi.aps.amapapi.utils.j.a(android.location.Location, int):boolean");
    }

    public static boolean a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        boolean z = false;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.lang.String replace = "2.0.201501131131".replace(".", "");
        android.database.Cursor cursor = null;
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen()) {
                    cursor = sQLiteDatabase.query("sqlite_master", new java.lang.String[]{"count(*) as c"}, "type = 'table' AND name = '" + str.trim() + replace + "'", null, null, null, null);
                    if (cursor != null && cursor.moveToFirst()) {
                        if (cursor.getInt(0) > 0) {
                            z = true;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return z;
                }
            } catch (java.lang.Throwable unused) {
                if (cursor == null) {
                    return true;
                }
                cursor.close();
                return true;
            }
        }
        return false;
    }

    public static boolean a(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            java.util.ArrayList<java.lang.String> b2 = b(str);
            java.lang.String[] split = str2.toString().split("#");
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < split.length; i3++) {
                if (split[i3].contains(",nb") || split[i3].contains(",access")) {
                    i++;
                    if (b2.contains(split[i3])) {
                        i2++;
                    }
                }
            }
            if (i2 * 2 >= (b2.size() + i) * 0.618d) {
                return true;
            }
        }
        return false;
    }

    public static java.util.ArrayList<java.lang.String> b(java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.String[] split = str.split("#");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains(",nb") || split[i].contains(",access")) {
                    arrayList.add(split[i]);
                }
            }
        }
        return arrayList;
    }

    public static boolean g(android.content.Context context) {
        boolean z;
        if (context == null) {
            return true;
        }
        if (a == null) {
            a = (android.net.wifi.WifiManager) a(context, "wifi");
        }
        try {
            if (c(context, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                z = a.isWifiEnabled();
            } else {
                com.autonavi.aps.amapapi.utils.b.a(new java.lang.Exception("n_aws"), "OPENSDK_UTS", "iwfal_n_aws");
                z = false;
            }
        } catch (java.lang.Throwable unused) {
            z = false;
        }
        try {
            com.autonavi.aps.amapapi.utils.d.b();
        } catch (java.lang.Throwable unused2) {
            com.autonavi.aps.amapapi.utils.d.c();
            return z ? z : z;
        }
        if (z && c() > 17) {
            try {
                return "true".equals(java.lang.String.valueOf(com.autonavi.aps.amapapi.utils.f.a(a, "isScanAlwaysAvailable", new java.lang.Object[0])));
            } catch (java.lang.Throwable unused3) {
                return z;
            }
        }
    }

    public static java.lang.String h(android.content.Context context) {
        android.net.NetworkInfo c2 = c(context);
        if (c2 == null || !c2.isConnectedOrConnecting()) {
            return "DISCONNECTED";
        }
        int type = c2.getType();
        if (type == 1) {
            return "WIFI";
        }
        if (type != 0) {
            return "UNKNOWN";
        }
        java.lang.String subtypeName = c2.getSubtypeName();
        switch (c2.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
                return "4G";
            default:
                if (!"GSM".equalsIgnoreCase(subtypeName)) {
                    return ("TD-SCDMA".equalsIgnoreCase(subtypeName) || "WCDMA".equalsIgnoreCase(subtypeName) || "CDMA2000".equalsIgnoreCase(subtypeName)) ? "3G" : subtypeName;
                }
                break;
        }
        return "2G";
    }

    public static java.lang.String i(android.content.Context context) {
        java.lang.String h = com.amap.api.col.p0003sl.ii.h();
        if (android.text.TextUtils.isEmpty(h) || h.equals("00:00:00:00:00:00")) {
            h = com.autonavi.aps.amapapi.utils.i.a(context);
        }
        return android.text.TextUtils.isEmpty(h) ? "00:00:00:00:00:00" : h;
    }

    public static double c(java.lang.String str) throws java.lang.NumberFormatException {
        return java.lang.Double.parseDouble(str);
    }

    public static float d(java.lang.String str) throws java.lang.NumberFormatException {
        return java.lang.Float.parseFloat(str);
    }

    public static int e(java.lang.String str) throws java.lang.NumberFormatException {
        return java.lang.Integer.parseInt(str);
    }

    public static int f(java.lang.String str) throws java.lang.NumberFormatException {
        return java.lang.Integer.parseInt(str, 16);
    }

    public static byte g(java.lang.String str) throws java.lang.NumberFormatException {
        return java.lang.Byte.parseByte(str);
    }

    public static boolean j(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 28 && context.getApplicationInfo().targetSdkVersion >= 28;
    }

    public static boolean k(android.content.Context context) {
        android.content.pm.ServiceInfo serviceInfo;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, "com.amap.api.location.APSService"), 128);
        } catch (java.lang.Throwable unused) {
            serviceInfo = null;
        }
        return serviceInfo != null;
    }

    public static boolean b(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        try {
            packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(str, 256);
        } catch (java.lang.Throwable unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static java.util.List<java.lang.String> a(java.io.File file) {
        java.io.FileInputStream fileInputStream;
        java.io.InputStreamReader inputStreamReader;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.BufferedReader bufferedReader = null;
        try {
            try {
                fileInputStream = b(file);
                try {
                    inputStreamReader = new java.io.InputStreamReader(fileInputStream, java.nio.charset.Charset.defaultCharset());
                    try {
                        java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                java.lang.String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                arrayList.add(readLine);
                            } catch (java.lang.Throwable unused) {
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return arrayList;
                            }
                        }
                        bufferedReader2.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                    } catch (java.lang.Throwable unused2) {
                    }
                } catch (java.lang.Throwable unused3) {
                    inputStreamReader = null;
                }
            } catch (java.lang.Throwable unused4) {
                fileInputStream = null;
                inputStreamReader = null;
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private static java.io.FileInputStream b(java.io.File file) throws java.io.IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new java.io.IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canRead()) {
                throw new java.io.IOException("File '" + file + "' cannot be read");
            }
            return new java.io.FileInputStream(file);
        }
        throw new java.io.FileNotFoundException("File '" + file + "' does not exist");
    }

    public static void a(java.io.File file, java.lang.String str) {
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = c(file);
                if (str != null) {
                    fileOutputStream.write(str.getBytes());
                }
                try {
                    fileOutputStream.close();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            } catch (java.io.IOException e2) {
                e2.printStackTrace();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (java.io.IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static java.io.FileOutputStream c(java.io.File file) throws java.io.IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new java.io.IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new java.io.IOException("File '" + file + "' cannot be written to");
            }
        } else {
            java.io.File parentFile = file.getParentFile();
            if (parentFile != null) {
                if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    throw new java.io.IOException("Directory '" + parentFile + "' could not be created");
                }
                file.createNewFile();
            }
        }
        return new java.io.FileOutputStream(file, false);
    }

    public static java.lang.String l(android.content.Context context) {
        if (d == null) {
            d = com.autonavi.aps.amapapi.security.a.a("MD5", com.amap.api.col.p0003sl.ie.c(context));
        }
        return d;
    }

    public static boolean m(android.content.Context context) {
        try {
            if (!p(context) && !o(context)) {
                if (!n(context)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable unused) {
            com.autonavi.aps.amapapi.utils.d.b();
            return false;
        }
    }

    private static boolean n(android.content.Context context) {
        return h("huawei") && q(context) && s(context);
    }

    private static boolean o(android.content.Context context) {
        return h("vivo") && q(context) && r(context);
    }

    private static boolean p(android.content.Context context) {
        try {
            if (android.os.Build.VERSION.SDK_INT < 31 || context == null || context.checkSelfPermission(com.hjq.permissions.Permission.ACCESS_FINE_LOCATION) == 0) {
                return false;
            }
            return context.checkSelfPermission(com.hjq.permissions.Permission.ACCESS_COARSE_LOCATION) == 0;
        } catch (java.lang.Throwable unused) {
            com.autonavi.aps.amapapi.utils.d.b();
            return false;
        }
    }

    public static boolean c(android.content.Context context, java.lang.String str) {
        boolean z = false;
        try {
            if (android.os.Build.VERSION.SDK_INT < 23 ? !(context == null || context.checkCallingOrSelfPermission(com.amap.api.col.p0003sl.ir.c(str)) != 0) : !(context == null || context.checkSelfPermission(com.amap.api.col.p0003sl.ir.c(str)) != 0)) {
                z = true;
            }
        } catch (java.lang.Throwable unused) {
            com.autonavi.aps.amapapi.utils.d.b();
        }
        return z;
    }

    private static boolean q(android.content.Context context) {
        try {
            int i = android.os.Build.VERSION.SDK_INT;
            int i2 = context.getApplicationInfo().targetSdkVersion;
            return ((i == 30) && (i2 >= 23)) || ((i == 31) && (i2 <= 30 && i2 >= 23));
        } catch (java.lang.Throwable unused) {
            com.autonavi.aps.amapapi.utils.d.b();
            return false;
        }
    }

    private static boolean h(java.lang.String str) {
        try {
            java.lang.String str2 = android.os.Build.MANUFACTURER;
            java.lang.String str3 = android.os.Build.BRAND;
            if (!str2.equalsIgnoreCase(str)) {
                if (!str3.toLowerCase().contains(str)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable unused) {
            com.autonavi.aps.amapapi.utils.d.b();
            return false;
        }
    }

    private static boolean r(android.content.Context context) {
        android.database.Cursor cursor;
        boolean z = false;
        try {
            cursor = context.getContentResolver().query(android.net.Uri.parse("content://com.vivo.permissionmanager.provider.permission/fuzzy_location_apps"), new java.lang.String[]{"package_name", "selected_fuzzy"}, "package_name=?", new java.lang.String[]{context.getPackageName()}, null);
            boolean z2 = false;
            while (cursor != null) {
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    if (cursor.getString(0) != null && cursor.getInt(1) == 1) {
                        z2 = true;
                    }
                } catch (java.lang.Throwable unused) {
                    z = z2;
                    try {
                        com.autonavi.aps.amapapi.utils.d.b();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return z;
                    } catch (java.lang.Throwable unused2) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return z;
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return z2;
        } catch (java.lang.Throwable unused3) {
            cursor = null;
        }
    }

    private static boolean s(android.content.Context context) {
        try {
            try {
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    if (context == null || context.checkSelfPermission("com.huawei.permission.ACCESS_APPROXIMATELY_LOCATION") != 0) {
                        return false;
                    }
                } else if (context == null || context.checkCallingOrSelfPermission("com.huawei.permission.ACCESS_APPROXIMATELY_LOCATION") != 0) {
                    return false;
                }
                return true;
            } catch (java.lang.Throwable unused) {
                return false;
            }
        } catch (java.lang.Throwable unused2) {
            com.autonavi.aps.amapapi.utils.d.b();
            return false;
        }
    }
}
