package com.amap.api.col.p0003sl;

/* compiled from: AbstractBasicLbsRestHandler.java */
/* loaded from: classes.dex */
public abstract class hx<T, V> extends com.amap.api.col.p0003sl.hw<T, V> {
    @Override // com.amap.api.col.p0003sl.hw
    protected abstract V a(java.lang.String str) throws com.amap.api.col.p0003sl.hv;

    @Override // com.amap.api.col.p0003sl.hw
    protected abstract java.lang.String c();

    @Override // com.amap.api.col.p0003sl.db, com.amap.api.col.p0003sl.kz
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
        return null;
    }

    public hx(android.content.Context context, T t) {
        super(context, t);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public byte[] getEntityBytes() {
        try {
            return c().getBytes("utf-8");
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.hw, com.amap.api.col.p0003sl.kz
    public java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        java.util.HashMap hashMap = new java.util.HashMap(16);
        hashMap.put("Content-Type", " application/json");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android Trace 9.8.2");
        hashMap.put("x-INFO", com.amap.api.col.p0003sl.ih.b(this.c));
        hashMap.put("platinfo", java.lang.String.format(java.util.Locale.US, "platform=Android&sdkversion=%s&product=%s", "9.8.2", "trace"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }
}
