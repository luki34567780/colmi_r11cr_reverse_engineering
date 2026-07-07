package com.amap.api.col.p0003sl;

/* compiled from: CrashManager.java */
/* loaded from: classes.dex */
public final class jw {
    private com.amap.api.col.p0003sl.iq a;

    /* compiled from: CrashManager.java */
    static class a {
        public static java.util.Map<java.lang.String, com.amap.api.col.p0003sl.jw> a = new java.util.HashMap();
    }

    private jw(com.amap.api.col.p0003sl.iq iqVar) {
        this.a = iqVar;
    }

    public static com.amap.api.col.p0003sl.jw a(com.amap.api.col.p0003sl.iq iqVar) {
        if (com.amap.api.col.3sl.jw.a.a.get(iqVar.a()) == null) {
            com.amap.api.col.3sl.jw.a.a.put(iqVar.a(), new com.amap.api.col.p0003sl.jw(iqVar));
        }
        return com.amap.api.col.3sl.jw.a.a.get(iqVar.a());
    }

    public final void a(android.content.Context context, boolean z, boolean z2) {
        com.amap.api.col.p0003sl.jz.a(context, this.a, "sckey", java.lang.String.valueOf(z));
        if (z) {
            com.amap.api.col.p0003sl.jz.a(context, this.a, "scisf", java.lang.String.valueOf(z2));
        }
    }

    public final boolean a(android.content.Context context) {
        try {
            return java.lang.Boolean.parseBoolean(com.amap.api.col.p0003sl.jz.a(context, this.a, "sckey"));
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public final boolean b(android.content.Context context) {
        try {
            return java.lang.Boolean.parseBoolean(com.amap.api.col.p0003sl.jz.a(context, this.a, "scisf"));
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }
}
