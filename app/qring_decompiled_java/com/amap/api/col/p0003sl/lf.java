package com.amap.api.col.p0003sl;

/* compiled from: OfflineLocEntity.java */
/* loaded from: classes.dex */
public final class lf {
    private android.content.Context a;
    private com.amap.api.col.p0003sl.iq b;
    private java.lang.String c;

    public lf(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str) {
        this.a = context.getApplicationContext();
        this.b = iqVar;
        this.c = str;
    }

    final byte[] a() {
        return com.amap.api.col.p0003sl.ir.a(a(this.a, this.b, this.c));
    }

    private static java.lang.String a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(iqVar.c());
            sb.append("\",\"product\":\"");
            sb.append(iqVar.a());
            sb.append("\",\"nt\":\"");
            sb.append(com.amap.api.col.p0003sl.ii.c(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }
}
