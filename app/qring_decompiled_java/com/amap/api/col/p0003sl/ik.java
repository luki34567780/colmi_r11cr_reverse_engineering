package com.amap.api.col.p0003sl;

/* compiled from: HttpsDecisionUtil.java */
/* loaded from: classes.dex */
public final class ik {
    private volatile com.amap.api.col.3sl.ik.b a = new com.amap.api.col.3sl.ik.b(0);
    private com.amap.api.col.p0003sl.kh b = new com.amap.api.col.p0003sl.kh("HttpsDecisionUtil");

    /* compiled from: HttpsDecisionUtil.java */
    private static class a {
        static com.amap.api.col.p0003sl.ik a = new com.amap.api.col.p0003sl.ik();
    }

    public static com.amap.api.col.p0003sl.ik a() {
        return com.amap.api.col.3sl.ik.a.a;
    }

    public final void a(android.content.Context context) {
        if (this.a == null) {
            this.a = new com.amap.api.col.3sl.ik.b((byte) 0);
        }
        this.a.a(com.amap.api.col.p0003sl.kh.a(context, "open_common", "a3", true));
        this.a.a(context);
        com.amap.api.col.p0003sl.jg.a(context).a();
    }

    public final void a(boolean z) {
        if (this.a == null) {
            this.a = new com.amap.api.col.3sl.ik.b((byte) 0);
        }
        this.a.b(z);
    }

    final void a(android.content.Context context, boolean z) {
        if (this.a == null) {
            this.a = new com.amap.api.col.3sl.ik.b((byte) 0);
        }
        b(context, z);
        this.a.a(z);
    }

    public final boolean b() {
        if (this.a == null) {
            this.a = new com.amap.api.col.3sl.ik.b((byte) 0);
        }
        return this.a.a();
    }

    private static void b(android.content.Context context, boolean z) {
        android.content.SharedPreferences.Editor a2 = com.amap.api.col.p0003sl.kh.a(context, "open_common");
        com.amap.api.col.p0003sl.kh.a(a2, "a3", z);
        com.amap.api.col.p0003sl.kh.a(a2);
    }

    /* compiled from: HttpsDecisionUtil.java */
    private static class b {
        protected boolean a;
        private int b;
        private final boolean c;
        private boolean d;

        private b() {
            this.b = 0;
            this.a = true;
            this.c = true;
            this.d = false;
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final void a(android.content.Context context) {
            if (context != null && this.b <= 0 && android.os.Build.VERSION.SDK_INT >= 4) {
                this.b = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
            }
        }

        public final void a(boolean z) {
            this.a = z;
        }

        public final void b(boolean z) {
            this.d = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a() {
            /*
                r5 = this;
                boolean r0 = r5.d
                r1 = 1
                if (r0 != 0) goto L2f
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 28
                r3 = 0
                if (r0 < r2) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                boolean r4 = r5.a
                if (r4 == 0) goto L23
                int r4 = r5.b
                if (r4 > 0) goto L19
                r4 = 28
            L19:
                if (r4 < r2) goto L1d
                r2 = 1
                goto L1e
            L1d:
                r2 = 0
            L1e:
                if (r2 == 0) goto L21
                goto L23
            L21:
                r2 = 0
                goto L24
            L23:
                r2 = 1
            L24:
                if (r0 == 0) goto L2a
                if (r2 == 0) goto L2a
                r0 = 1
                goto L2b
            L2a:
                r0 = 0
            L2b:
                if (r0 == 0) goto L2e
                goto L2f
            L2e:
                return r3
            L2f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.3sl.ik.b.a():boolean");
        }
    }

    public static java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || str.startsWith("https")) {
            return str;
        }
        try {
            android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
            buildUpon.scheme("https");
            return buildUpon.build().toString();
        } catch (java.lang.Throwable unused) {
            return str;
        }
    }

    private static boolean c() {
        return android.os.Build.VERSION.SDK_INT == 19;
    }

    public final boolean b(boolean z) {
        if (c()) {
            return false;
        }
        return z || b();
    }

    public static void b(android.content.Context context) {
        b(context, true);
    }
}
