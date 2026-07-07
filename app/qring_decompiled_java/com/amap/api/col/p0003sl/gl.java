package com.amap.api.col.p0003sl;

/* compiled from: RequestCacheConfig.java */
/* loaded from: classes.dex */
final class gl {
    private static volatile boolean a;

    public static synchronized void a() {
        synchronized (com.amap.api.col.p0003sl.gl.class) {
            if (!a) {
                com.amap.api.col.p0003sl.gm.a().a("regeo", new com.amap.api.col.p0003sl.go("/geocode/regeo"));
                com.amap.api.col.p0003sl.gm.a().a("placeAround", new com.amap.api.col.p0003sl.go("/place/around"));
                com.amap.api.col.p0003sl.gm.a().a("placeText", new com.amap.api.col.p0003sl.gn("/place/text"));
                com.amap.api.col.p0003sl.gm.a().a("geo", new com.amap.api.col.p0003sl.gn("/geocode/geo"));
                a = true;
            }
        }
    }
}
