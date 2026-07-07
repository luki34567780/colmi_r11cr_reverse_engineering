package com.amap.api.col.p0003sl;

/* compiled from: ProxyUtil.java */
/* loaded from: classes.dex */
public final class ip {
    public static java.net.Proxy a(android.content.Context context) {
        java.net.Proxy b;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 11) {
                b = a(context, new java.net.URI("http://restsdk.amap.com"));
            } else {
                b = b(context);
            }
            return b;
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "pu", "gp");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0074, code lost:
    
        if (r10 == (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        r18 = 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a6, code lost:
    
        if (r10 == (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0119, code lost:
    
        if (r12 == (-1)) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x015c A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #10 {all -> 0x0158, blocks: (B:20:0x014d, B:12:0x015c), top: B:19:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef A[Catch: all -> 0x0171, TryCatch #8 {all -> 0x0171, blocks: (B:102:0x00ca, B:68:0x00e4, B:70:0x00ef, B:72:0x0103, B:74:0x0109, B:78:0x0115, B:89:0x011e, B:91:0x0124, B:93:0x012a, B:97:0x0136), top: B:4:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013e  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.ContentResolver, android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.Proxy b(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.ip.b(android.content.Context):java.net.Proxy");
    }

    private static java.lang.String a(java.lang.String str) {
        return com.amap.api.col.p0003sl.ir.c(str);
    }

    private static java.lang.String a() {
        java.lang.String str;
        try {
            str = android.net.Proxy.getDefaultHost();
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "pu", "gdh");
            str = null;
        }
        return str == null ? "null" : str;
    }

    private static java.net.Proxy a(android.content.Context context, java.net.URI uri) {
        java.net.Proxy proxy;
        if (c(context)) {
            try {
                java.util.List<java.net.Proxy> select = java.net.ProxySelector.getDefault().select(uri);
                if (select == null || select.isEmpty() || (proxy = select.get(0)) == null) {
                    return null;
                }
                if (proxy.type() == java.net.Proxy.Type.DIRECT) {
                    return null;
                }
                return proxy;
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.ju.c(th, "pu", "gpsc");
            }
        }
        return null;
    }

    private static boolean c(android.content.Context context) {
        return com.amap.api.col.p0003sl.ii.j(context) == 0;
    }

    private static int b() {
        try {
            return android.net.Proxy.getDefaultPort();
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "pu", "gdp");
            return -1;
        }
    }
}
