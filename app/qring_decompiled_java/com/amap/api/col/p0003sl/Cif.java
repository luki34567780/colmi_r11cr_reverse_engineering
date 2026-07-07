package com.amap.api.col.p0003sl;

/* compiled from: AuthConfigManager.java */
/* renamed from: com.amap.api.col.3sl.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif {
    private static volatile boolean D = false;
    public static int a = -1;
    public static java.lang.String b = "";
    public static android.content.Context c = null;
    private static java.lang.String k = "6";
    private static java.lang.String l = "4";
    private static java.lang.String m = "9";
    private static java.lang.String n = "8";
    private static volatile boolean o = true;
    private static java.util.Vector<com.amap.api.col.p0003sl.Cif.e> p = new java.util.Vector<>();
    private static java.util.Map<java.lang.String, java.lang.Integer> q = new java.util.HashMap();
    private static java.lang.String r = null;
    private static long s = 0;
    public static volatile boolean d = false;
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.p0003sl.Cif.g> t = new java.util.concurrent.ConcurrentHashMap<>(8);
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> u = new java.util.concurrent.ConcurrentHashMap<>(8);
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, com.amap.api.col.p0003sl.Cif.d> v = new java.util.concurrent.ConcurrentHashMap<>(8);
    private static boolean w = false;
    private static boolean x = false;
    public static int e = 5000;
    public static boolean f = true;
    public static boolean g = false;
    private static int y = 3;
    public static boolean h = true;
    public static boolean i = false;
    private static int z = 3;
    public static boolean j = false;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> A = new java.util.concurrent.ConcurrentHashMap<>();
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> B = new java.util.concurrent.ConcurrentHashMap<>();
    private static java.util.ArrayList<com.amap.api.col.3sl.kw.a> C = new java.util.ArrayList<>();
    private static java.util.Queue<com.amap.api.col.3sl.kw.c> E = new java.util.LinkedList();

    /* compiled from: AuthConfigManager.java */
    /* renamed from: com.amap.api.col.3sl.if$a */
    public interface a {
        void a(com.amap.api.col.p0003sl.Cif.b bVar);
    }

    /* compiled from: AuthConfigManager.java */
    /* renamed from: com.amap.api.col.3sl.if$f */
    public static class f {
        public static boolean a = true;
        public static boolean b = false;
        public static boolean c = true;
        public static int d;
        public static boolean e;
        public static int f;
    }

    /* compiled from: AuthConfigManager.java */
    /* renamed from: com.amap.api.col.3sl.if$g */
    public static class g {
        public long a;
        public java.lang.String b;

        g(java.lang.Long l, java.lang.String str) {
            this.a = 0L;
            this.b = "";
            this.a = l.longValue();
            this.b = str;
        }
    }

    public static void a(android.content.Context context, java.lang.String str) {
        com.amap.api.col.p0003sl.ie.a(context, str);
    }

    /* compiled from: AuthConfigManager.java */
    /* renamed from: com.amap.api.col.3sl.if$b */
    public static class b {

        @java.lang.Deprecated
        public org.json.JSONObject a;

        @java.lang.Deprecated
        public org.json.JSONObject b;
        public java.lang.String c;
        public int d = -1;
        public long e = 0;
        public org.json.JSONObject f;
        public com.amap.api.col.p0003sl.Cif.b.a g;
        public com.amap.api.col.p0003sl.Cif.b.C0015b h;
        private boolean i;

        /* compiled from: AuthConfigManager.java */
        /* renamed from: com.amap.api.col.3sl.if$b$a */
        public static class a {
            public boolean a;
            public boolean b;
            public org.json.JSONObject c;
        }

        /* compiled from: AuthConfigManager.java */
        /* renamed from: com.amap.api.col.3sl.if$b$b, reason: collision with other inner class name */
        public static class C0015b {
            public boolean a;
        }
    }

    public static boolean a(java.lang.String str, boolean z2) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return z2;
            }
            java.lang.String[] split = java.net.URLDecoder.decode(str).split("/");
            return split[split.length - 1].charAt(4) % 2 == 1;
        } catch (java.lang.Throwable unused) {
            return z2;
        }
    }

    public static com.amap.api.col.p0003sl.Cif.b a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        return b(context, iqVar, str, map);
    }

    private static com.amap.api.col.p0003sl.Cif.b b(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        return a(context, iqVar, str, map, null, null, null);
    }

    public static com.amap.api.col.p0003sl.Cif.b a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return a(context, iqVar, str, null, str2, str3, str4);
    }

    public static void a(android.content.Context context) {
        if (context != null) {
            c = context.getApplicationContext();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0197  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14, types: [com.amap.api.col.3sl.if$b] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.amap.api.col.3sl.if$b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.amap.api.col.p0003sl.Cif.b a(android.content.Context r23, com.amap.api.col.p0003sl.iq r24, java.lang.String r25, java.util.Map<java.lang.String, java.lang.String> r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.Cif.a(android.content.Context, com.amap.api.col.3sl.iq, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String):com.amap.api.col.3sl.if$b");
    }

    private static java.lang.String b(java.util.List<java.lang.String> list) {
        if (list == null) {
            return "";
        }
        try {
            if (list.size() <= 0) {
                return "";
            }
            java.lang.String str = list.get(0);
            return !android.text.TextUtils.isEmpty(str) ? str : "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static long a(java.util.List<java.lang.String> list) {
        if (list == null) {
            return 0L;
        }
        try {
            if (list.size() <= 0) {
                return 0L;
            }
            java.lang.String str = list.get(0);
            if (android.text.TextUtils.isEmpty(str)) {
                return 0L;
            }
            return java.lang.Long.valueOf(str).longValue();
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0299 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r18, com.amap.api.col.p0003sl.iq r19, java.lang.String r20, com.amap.api.col.p0003sl.Cif.b r21, org.json.JSONObject r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.Cif.a(android.content.Context, com.amap.api.col.3sl.iq, java.lang.String, com.amap.api.col.3sl.if$b, org.json.JSONObject):void");
    }

    private static void a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.Throwable th) {
        a(context, iqVar, th.getMessage());
    }

    public static void a(java.lang.String str, boolean z2, boolean z3, boolean z4) {
        if (android.text.TextUtils.isEmpty(str) || c == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        hashMap.put("downLevel", java.lang.String.valueOf(z2));
        hashMap.put("ant", com.amap.api.col.p0003sl.ii.j(c) == 0 ? "0" : coil.disk.DiskLruCache.VERSION);
        if (z4) {
            hashMap.put("type", z2 ? m : n);
        } else {
            hashMap.put("type", z2 ? k : l);
        }
        hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_STATUS, z3 ? "0" : coil.disk.DiskLruCache.VERSION);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        if (android.text.TextUtils.isEmpty(jSONObject)) {
            return;
        }
        try {
            com.amap.api.col.p0003sl.lh lhVar = new com.amap.api.col.p0003sl.lh(c, "core", me.zhouzhuo.zzhorizontalprogressbar.BuildConfig.VERSION_NAME, "O002");
            lhVar.a(jSONObject);
            com.amap.api.col.p0003sl.li.a(lhVar, c);
        } catch (com.amap.api.col.p0003sl.id unused) {
        }
    }

    public static void a(com.amap.api.col.3sl.kw.c cVar) {
        if (cVar == null || c == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverip", cVar.c);
        hashMap.put("hostname", cVar.e);
        hashMap.put("path", cVar.d);
        hashMap.put("csid", cVar.a);
        hashMap.put("degrade", java.lang.String.valueOf(cVar.b.a()));
        hashMap.put("errorcode", java.lang.String.valueOf(cVar.m));
        hashMap.put("errorsubcode", java.lang.String.valueOf(cVar.n));
        hashMap.put("connecttime", java.lang.String.valueOf(cVar.h));
        hashMap.put("writetime", java.lang.String.valueOf(cVar.i));
        hashMap.put("readtime", java.lang.String.valueOf(cVar.j));
        hashMap.put("datasize", java.lang.String.valueOf(cVar.l));
        hashMap.put("totaltime", java.lang.String.valueOf(cVar.f));
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        "--埋点--".concat(java.lang.String.valueOf(jSONObject));
        com.amap.api.col.p0003sl.kw.b();
        if (android.text.TextUtils.isEmpty(jSONObject)) {
            return;
        }
        try {
            com.amap.api.col.p0003sl.lh lhVar = new com.amap.api.col.p0003sl.lh(c, "core", me.zhouzhuo.zzhorizontalprogressbar.BuildConfig.VERSION_NAME, "O008");
            lhVar.a(jSONObject);
            com.amap.api.col.p0003sl.li.a(lhVar, c);
        } catch (com.amap.api.col.p0003sl.id unused) {
        }
    }

    private static void a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("amap_sdk_auth_fail", coil.disk.DiskLruCache.VERSION);
        hashMap.put("amap_sdk_auth_fail_type", str);
        hashMap.put("amap_sdk_name", iqVar.a());
        hashMap.put("amap_sdk_version", iqVar.c());
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        if (android.text.TextUtils.isEmpty(jSONObject)) {
            return;
        }
        try {
            com.amap.api.col.p0003sl.lh lhVar = new com.amap.api.col.p0003sl.lh(context, "core", me.zhouzhuo.zzhorizontalprogressbar.BuildConfig.VERSION_NAME, "O001");
            lhVar.a(jSONObject);
            com.amap.api.col.p0003sl.li.a(lhVar, context);
        } catch (com.amap.api.col.p0003sl.id unused) {
        }
    }

    /* compiled from: AuthConfigManager.java */
    /* renamed from: com.amap.api.col.3sl.if$c */
    static class c extends com.amap.api.col.p0003sl.kt {
        private java.lang.String d;
        private java.util.Map<java.lang.String, java.lang.String> e;
        private java.lang.String f;
        private java.lang.String g;
        private java.lang.String h;

        @Override // com.amap.api.col.p0003sl.kt
        public final byte[] c() {
            return null;
        }

        @Override // com.amap.api.col.p0003sl.kt
        protected final java.lang.String e() {
            return "3.0";
        }

        c(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(context, iqVar);
            this.d = str;
            this.e = map;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            setHttpProtocol(com.amap.api.col.3sl.kz.c.HTTPS);
            setDegradeAbility(com.amap.api.col.3sl.kz.a.FIX);
        }

        @Override // com.amap.api.col.p0003sl.kz
        public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            if (android.text.TextUtils.isEmpty(this.h)) {
                return null;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("host", this.h);
            return hashMap;
        }

        @Override // com.amap.api.col.p0003sl.kz
        public final java.lang.String getURL() {
            return a("https://restsdk.amap.com/v3/iasdkauth", this.f);
        }

        @Override // com.amap.api.col.p0003sl.il, com.amap.api.col.p0003sl.kz
        public final java.lang.String getIPV6URL() {
            return a("https://dualstack-arestapi.amap.com/v3/iasdkauth", this.g);
        }

        private static java.lang.String a(java.lang.String str, java.lang.String str2) {
            try {
                return !android.text.TextUtils.isEmpty(str2) ? android.net.Uri.parse(str).buildUpon().encodedAuthority(str2).build().toString() : str;
            } catch (java.lang.Throwable unused) {
                return str;
            }
        }

        @Override // com.amap.api.col.p0003sl.kz
        protected final java.lang.String getIPDNSName() {
            if (!android.text.TextUtils.isEmpty(this.h)) {
                return this.h;
            }
            return super.getIPDNSName();
        }

        @Override // com.amap.api.col.p0003sl.kt
        public final byte[] d() {
            java.lang.String p = com.amap.api.col.p0003sl.ii.p(this.a);
            if (!android.text.TextUtils.isEmpty(p)) {
                p = com.amap.api.col.p0003sl.im.b(new java.lang.StringBuilder(p).reverse().toString());
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("authkey", android.text.TextUtils.isEmpty(this.d) ? "" : this.d);
            hashMap.put("plattype", "android");
            hashMap.put("ccver", coil.disk.DiskLruCache.VERSION);
            hashMap.put("product", this.b.a());
            hashMap.put("version", this.b.b());
            hashMap.put("output", "json");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(android.os.Build.VERSION.SDK_INT);
            hashMap.put("androidversion", sb.toString());
            hashMap.put("deviceId", p);
            hashMap.put("manufacture", android.os.Build.MANUFACTURER);
            java.util.Map<java.lang.String, java.lang.String> map = this.e;
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(this.e);
            }
            hashMap.put("abitype", com.amap.api.col.p0003sl.ir.a(this.a));
            hashMap.put("ext", this.b.d());
            return com.amap.api.col.p0003sl.ir.a(com.amap.api.col.p0003sl.ir.a(hashMap));
        }
    }

    public static boolean a() {
        com.amap.api.col.p0003sl.Cif.e a2;
        if (c != null) {
            i();
            if (!c()) {
                return false;
            }
            if (b()) {
                return true;
            }
        }
        return o && (a2 = a(c, "IPV6_CONFIG_NAME", "open_common")) != null && a2.a() < 5;
    }

    private static boolean a(java.net.InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }

    private static void i() {
        try {
            android.content.Context context = c;
            if (context != null) {
                java.lang.String o2 = com.amap.api.col.p0003sl.ii.o(context);
                if (!android.text.TextUtils.isEmpty(r) && !android.text.TextUtils.isEmpty(o2) && r.equals(o2) && java.lang.System.currentTimeMillis() - s < 60000) {
                    return;
                }
                if (!android.text.TextUtils.isEmpty(o2)) {
                    r = o2;
                }
            } else if (java.lang.System.currentTimeMillis() - s < androidx.work.WorkRequest.MIN_BACKOFF_MILLIS) {
                return;
            }
            s = java.lang.System.currentTimeMillis();
            q.clear();
            java.util.Iterator it = java.util.Collections.list(java.net.NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                java.net.NetworkInterface networkInterface = (java.net.NetworkInterface) it.next();
                if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                    java.lang.String displayName = networkInterface.getDisplayName();
                    int i2 = 0;
                    java.util.Iterator<java.net.InterfaceAddress> it2 = networkInterface.getInterfaceAddresses().iterator();
                    while (it2.hasNext()) {
                        java.net.InetAddress address = it2.next().getAddress();
                        if (address instanceof java.net.Inet6Address) {
                            if (!a((java.net.Inet6Address) address)) {
                                i2 |= 2;
                            }
                        } else if (address instanceof java.net.Inet4Address) {
                            java.net.Inet4Address inet4Address = (java.net.Inet4Address) address;
                            if (!a(inet4Address) && !inet4Address.getHostAddress().startsWith(com.amap.api.col.p0003sl.ir.c("FMTkyLjE2OC40My4"))) {
                                i2 |= 1;
                            }
                        }
                    }
                    if (i2 != 0) {
                        if (displayName != null && displayName.startsWith("wlan")) {
                            q.put("WIFI", java.lang.Integer.valueOf(i2));
                        } else if (displayName != null && displayName.startsWith("rmnet")) {
                            q.put("MOBILE", java.lang.Integer.valueOf(i2));
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "at", "ipstack");
        }
    }

    public static boolean b() {
        java.lang.Integer num;
        android.content.Context context = c;
        if (context == null) {
            return false;
        }
        java.lang.String o2 = com.amap.api.col.p0003sl.ii.o(context);
        return (android.text.TextUtils.isEmpty(o2) || (num = q.get(o2.toUpperCase())) == null || num.intValue() != 2) ? false : true;
    }

    public static boolean c() {
        java.lang.Integer num;
        android.content.Context context = c;
        if (context == null) {
            return false;
        }
        java.lang.String o2 = com.amap.api.col.p0003sl.ii.o(context);
        return (android.text.TextUtils.isEmpty(o2) || (num = q.get(o2.toUpperCase())) == null || num.intValue() < 2) ? false : true;
    }

    public static void b(android.content.Context context) {
        if (context == null) {
            return;
        }
        o = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a2", true);
    }

    private static void c(android.content.Context context) {
        if (context == null) {
            return;
        }
        f = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a13", true);
        h = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a6", true);
        g = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a7", false);
        e = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a8", 5000);
        y = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a9", 3);
        i = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a10", false);
        z = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a11", 3);
        j = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a12", false);
    }

    private static void a(android.content.Context context, java.lang.String str, java.lang.String str2, com.amap.api.col.p0003sl.Cif.e eVar) {
        if (eVar == null || android.text.TextUtils.isEmpty(eVar.a)) {
            return;
        }
        java.lang.String b2 = eVar.b();
        if (android.text.TextUtils.isEmpty(b2) || context == null) {
            return;
        }
        android.content.SharedPreferences.Editor a2 = com.amap.api.col.p0003sl.kh.a(context, str2);
        a2.putString(str, b2);
        com.amap.api.col.p0003sl.kh.a(a2);
    }

    /* compiled from: AuthConfigManager.java */
    /* renamed from: com.amap.api.col.3sl.if$e */
    public static class e {
        private java.lang.String a;
        private java.lang.String b;
        private java.util.concurrent.atomic.AtomicInteger c;

        public e(java.lang.String str, java.lang.String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = new java.util.concurrent.atomic.AtomicInteger(i);
        }

        public final void a(java.lang.String str) {
            this.b = str;
        }

        public final int a() {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.c;
            if (atomicInteger == null) {
                return 0;
            }
            return atomicInteger.get();
        }

        public final java.lang.String b() {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("a", this.a);
                jSONObject.put(com.amap.api.col.p0003sl.js.i, this.b);
                jSONObject.put(com.amap.api.col.p0003sl.js.g, this.c.get());
                return jSONObject.toString();
            } catch (java.lang.Throwable unused) {
                return "";
            }
        }

        public static com.amap.api.col.p0003sl.Cif.e b(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                return new com.amap.api.col.p0003sl.Cif.e(jSONObject.optString("a"), jSONObject.optString(com.amap.api.col.p0003sl.js.i), jSONObject.optInt(com.amap.api.col.p0003sl.js.g));
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }
    }

    public static void e() {
        if (d) {
            return;
        }
        try {
            android.content.Context context = c;
            if (context == null) {
                return;
            }
            d = true;
            com.amap.api.col.p0003sl.ik.a().a(context);
            b(context);
            c(context);
            com.amap.api.col.p0003sl.Cif.f.a = com.amap.api.col.p0003sl.kh.a(context, "open_common", "ucf", com.amap.api.col.p0003sl.Cif.f.a);
            com.amap.api.col.p0003sl.Cif.f.b = com.amap.api.col.p0003sl.kh.a(context, "open_common", "fsv2", com.amap.api.col.p0003sl.Cif.f.b);
            com.amap.api.col.p0003sl.Cif.f.c = com.amap.api.col.p0003sl.kh.a(context, "open_common", "usc", com.amap.api.col.p0003sl.Cif.f.c);
            com.amap.api.col.p0003sl.Cif.f.d = com.amap.api.col.p0003sl.kh.a(context, "open_common", "umv", com.amap.api.col.p0003sl.Cif.f.d);
            com.amap.api.col.p0003sl.Cif.f.e = com.amap.api.col.p0003sl.kh.a(context, "open_common", "ust", com.amap.api.col.p0003sl.Cif.f.e);
            com.amap.api.col.p0003sl.Cif.f.f = com.amap.api.col.p0003sl.kh.a(context, "open_common", "ustv", com.amap.api.col.p0003sl.Cif.f.f);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* compiled from: AuthConfigManager.java */
    /* renamed from: com.amap.api.col.3sl.if$d */
    private static class d {
        com.amap.api.col.p0003sl.iq a;
        java.lang.String b;
        com.amap.api.col.p0003sl.Cif.a c;

        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    public static java.lang.String a(java.lang.String str) {
        com.amap.api.col.p0003sl.Cif.d dVar;
        if (!v.containsKey(str) || (dVar = v.get(str)) == null) {
            return null;
        }
        return dVar.b;
    }

    public static com.amap.api.col.p0003sl.iq b(java.lang.String str) {
        com.amap.api.col.p0003sl.Cif.d dVar = v.get(str);
        if (dVar != null) {
            return dVar.a;
        }
        return null;
    }

    public static java.lang.String c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ";15K;16H;17I;1A4;17S;183";
    }

    public static synchronized void a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, com.amap.api.col.p0003sl.Cif.a aVar) {
        synchronized (com.amap.api.col.p0003sl.Cif.class) {
            if (context == null || iqVar == null) {
                return;
            }
            try {
                if (c == null) {
                    c = context.getApplicationContext();
                }
                java.lang.String a2 = iqVar.a();
                if (android.text.TextUtils.isEmpty(a2)) {
                    return;
                }
                a(iqVar);
                if (v == null) {
                    v = new java.util.concurrent.ConcurrentHashMap<>(8);
                }
                if (u == null) {
                    u = new java.util.concurrent.ConcurrentHashMap<>(8);
                }
                if (t == null) {
                    t = new java.util.concurrent.ConcurrentHashMap<>(8);
                }
                if (!v.containsKey(a2)) {
                    com.amap.api.col.p0003sl.Cif.d dVar = new com.amap.api.col.p0003sl.Cif.d((byte) 0);
                    dVar.a = iqVar;
                    dVar.b = str;
                    dVar.c = aVar;
                    v.put(a2, dVar);
                    t.put(a2, new com.amap.api.col.p0003sl.Cif.g(java.lang.Long.valueOf(com.amap.api.col.p0003sl.kh.a(c, "open_common", a2, 0L)), com.amap.api.col.p0003sl.kh.b(c, "open_common", a2 + "lct-info", "")));
                    d(c);
                    e(c);
                }
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.jr.a(th, "at", "rglc");
            }
        }
    }

    public static synchronized boolean a(java.lang.String str, long j2) {
        synchronized (com.amap.api.col.p0003sl.Cif.class) {
            boolean z2 = false;
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            com.amap.api.col.p0003sl.Cif.g f2 = f(str);
            long j3 = 0;
            if (j2 != (f2 != null ? f2.a : 0L)) {
                if (u != null && u.containsKey(str)) {
                    j3 = u.get(str).longValue();
                }
                if (android.os.SystemClock.elapsedRealtime() - j3 > androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    public static synchronized void b(java.lang.String str, boolean z2) {
        synchronized (com.amap.api.col.p0003sl.Cif.class) {
            a(str, z2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
        }
    }

    public static synchronized void a(final java.lang.String str, boolean z2, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        synchronized (com.amap.api.col.p0003sl.Cif.class) {
            try {
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                if (u == null) {
                    u = new java.util.concurrent.ConcurrentHashMap<>(8);
                }
                u.put(str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                if (v == null) {
                    return;
                }
                if (v.containsKey(str)) {
                    if (android.text.TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (z2) {
                        com.amap.api.col.p0003sl.kv.a(true, str);
                    }
                    com.amap.api.col.p0003sl.lz.a().a(new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.col.3sl.if.1
                        @Override // com.amap.api.col.p0003sl.ma
                        public final void runTask() {
                            com.amap.api.col.p0003sl.Cif.d dVar = (com.amap.api.col.p0003sl.Cif.d) com.amap.api.col.p0003sl.Cif.v.get(str);
                            if (dVar == null) {
                                return;
                            }
                            com.amap.api.col.p0003sl.Cif.a aVar = dVar.c;
                            com.amap.api.col.p0003sl.Cif.b a2 = com.amap.api.col.p0003sl.Cif.a(com.amap.api.col.p0003sl.Cif.c, dVar.a, dVar.b, str2, str3, str4);
                            if (a2 == null || aVar == null) {
                                return;
                            }
                            aVar.a(a2);
                        }
                    });
                }
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.jr.a(th, "at", "lca");
            }
        }
    }

    public static synchronized boolean d(java.lang.String str) {
        synchronized (com.amap.api.col.p0003sl.Cif.class) {
            try {
            } finally {
                return false;
            }
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            if (v == null) {
                return false;
            }
            if (u == null) {
                u = new java.util.concurrent.ConcurrentHashMap<>(8);
            }
            if (v.containsKey(str) && !u.containsKey(str)) {
                u.put(str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                return true;
            }
            return false;
        }
    }

    public static synchronized void e(java.lang.String str) {
        synchronized (com.amap.api.col.p0003sl.Cif.class) {
            if (u == null) {
                return;
            }
            if (u.containsKey(str)) {
                u.remove(str);
            }
        }
    }

    public static synchronized com.amap.api.col.p0003sl.Cif.g f(java.lang.String str) {
        synchronized (com.amap.api.col.p0003sl.Cif.class) {
            try {
                if (t == null) {
                    t = new java.util.concurrent.ConcurrentHashMap<>(8);
                }
                if (t.containsKey(str)) {
                    return t.get(str);
                }
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.jr.a(th, "at", "glcut");
            }
            return new com.amap.api.col.p0003sl.Cif.g(0L, "");
        }
    }

    private static synchronized void a(java.lang.String str, long j2, java.lang.String str2) {
        synchronized (com.amap.api.col.p0003sl.Cif.class) {
            try {
                if (v != null && v.containsKey(str)) {
                    if (t == null) {
                        t = new java.util.concurrent.ConcurrentHashMap<>(8);
                    }
                    t.put(str, new com.amap.api.col.p0003sl.Cif.g(java.lang.Long.valueOf(j2), str2));
                    android.content.Context context = c;
                    if (context != null) {
                        android.content.SharedPreferences.Editor a2 = com.amap.api.col.p0003sl.kh.a(context, "open_common");
                        com.amap.api.col.p0003sl.kh.a(a2, str, j2);
                        com.amap.api.col.p0003sl.kh.a(a2, str + "lct-info", str2);
                        com.amap.api.col.p0003sl.kh.a(a2);
                    }
                }
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.jr.a(th, "at", "ucut");
            }
        }
    }

    private static void a(com.amap.api.col.p0003sl.iq iqVar) {
        if (iqVar != null) {
            try {
                if (android.text.TextUtils.isEmpty(iqVar.a())) {
                    return;
                }
                java.lang.String c2 = iqVar.c();
                if (android.text.TextUtils.isEmpty(c2)) {
                    c2 = iqVar.b();
                }
                if (android.text.TextUtils.isEmpty(c2)) {
                    return;
                }
                com.amap.api.col.p0003sl.jf.a(iqVar.a(), c2);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private static void d(android.content.Context context) {
        try {
            if (w) {
                return;
            }
            com.amap.api.col.p0003sl.jf.d = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a4", true);
            com.amap.api.col.p0003sl.jf.e = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a5", true);
            w = true;
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void e(android.content.Context context) {
        try {
            if (x) {
                return;
            }
            com.amap.api.col.p0003sl.it.d = a(com.amap.api.col.p0003sl.kh.b(context, "open_common", "a16", ""), true);
            com.amap.api.col.p0003sl.it.b = com.amap.api.col.p0003sl.kh.a(context, "open_common", "a17", com.amap.api.col.p0003sl.it.a);
            x = true;
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a(boolean z2, java.lang.String str) {
        try {
            "--markHostNameFailed---hostname=".concat(java.lang.String.valueOf(str));
            com.amap.api.col.p0003sl.kw.b();
            if (f || z2) {
                if ((i || !z2) && !android.text.TextUtils.isEmpty(str)) {
                    if (!z2) {
                        if (A.get(str) != null) {
                            return;
                        }
                        A.put(str, java.lang.Boolean.TRUE);
                        a(b(str, "a14"), "open_common");
                        return;
                    }
                    if (B.get(str) != null) {
                        return;
                    }
                    B.put(str, java.lang.Boolean.TRUE);
                    a(b(str, "a15"), "open_common");
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void a(java.lang.String str, java.lang.String str2) {
        com.amap.api.col.p0003sl.Cif.e a2 = a(c, str, str2);
        java.lang.String a3 = com.amap.api.col.p0003sl.ir.a(java.lang.System.currentTimeMillis(), "yyyyMMdd");
        if (!a3.equals(a2.b)) {
            a2.a(a3);
            a2.c.set(0);
        }
        a2.c.incrementAndGet();
        a(c, str, str2, a2);
    }

    public static boolean g(java.lang.String str) {
        com.amap.api.col.p0003sl.Cif.e a2;
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return true;
            }
            if (!f) {
                return false;
            }
            if (!(A.get(str) == null)) {
                return false;
            }
            android.content.Context context = c;
            if (context == null || (a2 = a(context, b(str, "a14"), "open_common")) == null) {
                return true;
            }
            return a2.a() < y;
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    public static boolean h(java.lang.String str) {
        com.amap.api.col.p0003sl.Cif.e a2;
        if (android.text.TextUtils.isEmpty(str) || !i) {
            return false;
        }
        if (!(B.get(str) == null)) {
            return false;
        }
        android.content.Context context = c;
        if (context == null || (a2 = a(context, b(str, "a15"), "open_common")) == null) {
            return true;
        }
        return a2.a() < z;
    }

    private static java.lang.String b(java.lang.String str, java.lang.String str2) {
        return str2 + "_" + com.amap.api.col.p0003sl.im.a(str.getBytes());
    }

    public static void b(com.amap.api.col.3sl.kw.c cVar) {
        synchronized (C) {
            boolean z2 = false;
            for (int i2 = 0; i2 < C.size(); i2++) {
                com.amap.api.col.3sl.kw.a aVar = C.get(i2);
                if (cVar.c.equals(aVar.b) && cVar.d.equals(aVar.e) && cVar.m == aVar.f) {
                    if (aVar.f == 1) {
                        aVar.i = ((aVar.j.get() * aVar.i) + cVar.f) / (aVar.j.get() + 1);
                    }
                    aVar.j.getAndIncrement();
                    z2 = true;
                }
            }
            if (!z2) {
                C.add(new com.amap.api.col.3sl.kw.a(cVar));
            }
            com.amap.api.col.p0003sl.kw.b();
        }
    }

    public static com.amap.api.col.3sl.kw.a f() {
        if (D) {
            return null;
        }
        synchronized (C) {
            if (D) {
                return null;
            }
            java.util.Collections.sort(C);
            if (C.size() <= 0) {
                return null;
            }
            com.amap.api.col.3sl.kw.a clone = C.get(0).clone();
            D = true;
            return clone;
        }
    }

    public static void a(boolean z2, com.amap.api.col.3sl.kw.a aVar) {
        if (!D || aVar == null) {
            return;
        }
        synchronized (C) {
            if (z2) {
                java.util.Iterator<com.amap.api.col.3sl.kw.a> it = C.iterator();
                while (it.hasNext()) {
                    com.amap.api.col.3sl.kw.a next = it.next();
                    if (next.b.equals(aVar.b) && next.e.equals(aVar.e) && next.f == aVar.f) {
                        if (next.j == aVar.j) {
                            it.remove();
                            com.amap.api.col.p0003sl.kw.b();
                        } else {
                            next.j.set(next.j.get() - aVar.j.get());
                            com.amap.api.col.p0003sl.kw.b();
                        }
                    }
                }
            }
            D = false;
            java.util.Iterator<com.amap.api.col.3sl.kw.a> it2 = C.iterator();
            com.amap.api.col.p0003sl.kw.b();
            while (it2.hasNext()) {
                com.amap.api.col.3sl.kw.a next2 = it2.next();
                java.lang.String str = next2.e;
                java.util.Objects.toString(next2.j);
                int i2 = next2.f;
                com.amap.api.col.p0003sl.kw.b();
            }
            com.amap.api.col.p0003sl.kw.b();
        }
    }

    public static void c(com.amap.api.col.3sl.kw.c cVar) {
        if (cVar != null && j) {
            synchronized (E) {
                E.offer(cVar);
                com.amap.api.col.p0003sl.kw.b();
            }
        }
    }

    public static com.amap.api.col.3sl.kw.c g() {
        synchronized (E) {
            com.amap.api.col.3sl.kw.c poll = E.poll();
            if (poll != null) {
                return poll;
            }
            return null;
        }
    }

    public static void d() {
        try {
            com.amap.api.col.p0003sl.Cif.e a2 = a(c, "IPV6_CONFIG_NAME", "open_common");
            java.lang.String a3 = com.amap.api.col.p0003sl.ir.a(java.lang.System.currentTimeMillis(), "yyyyMMdd");
            if (!a3.equals(a2.b)) {
                a2.a(a3);
                a2.c.set(0);
            }
            a2.c.incrementAndGet();
            a(c, "IPV6_CONFIG_NAME", "open_common", a2);
        } catch (java.lang.Throwable unused) {
        }
    }

    private static synchronized com.amap.api.col.p0003sl.Cif.e a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.amap.api.col.p0003sl.Cif.e eVar;
        synchronized (com.amap.api.col.p0003sl.Cif.class) {
            if (!android.text.TextUtils.isEmpty(str)) {
                for (int i2 = 0; i2 < p.size(); i2++) {
                    eVar = p.get(i2);
                    if (eVar != null && str.equals(eVar.a)) {
                        break;
                    }
                }
            }
            eVar = null;
            if (eVar != null) {
                return eVar;
            }
            if (context == null) {
                return null;
            }
            com.amap.api.col.p0003sl.Cif.e b2 = com.amap.api.col.p0003sl.Cif.e.b(com.amap.api.col.p0003sl.kh.b(context, str2, str, ""));
            java.lang.String a2 = com.amap.api.col.p0003sl.ir.a(java.lang.System.currentTimeMillis(), "yyyyMMdd");
            if (b2 == null) {
                b2 = new com.amap.api.col.p0003sl.Cif.e(str, a2, 0);
            }
            if (!a2.equals(b2.b)) {
                b2.a(a2);
                b2.c.set(0);
            }
            p.add(b2);
            return b2;
        }
    }
}
