package com.amap.api.col.p0003sl;

/* compiled from: FeatureManager.java */
/* loaded from: classes.dex */
public final class x {
    private java.util.Map<java.lang.String, java.lang.Boolean> a;
    private java.util.concurrent.atomic.AtomicBoolean b;

    /* synthetic */ x(byte b) {
        this();
    }

    /* compiled from: FeatureManager.java */
    private static class a {
        private static com.amap.api.col.p0003sl.x a = new com.amap.api.col.p0003sl.x(0);
    }

    private x() {
        this.a = new java.util.concurrent.ConcurrentHashMap();
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
        c();
    }

    public static com.amap.api.col.p0003sl.x a() {
        return com.amap.api.col.3sl.x.a.a;
    }

    private void c() {
        this.a.put("feature_mvt", java.lang.Boolean.TRUE);
        this.a.put("feature_gltf", java.lang.Boolean.FALSE);
        this.a.put("feature_terrain", java.lang.Boolean.FALSE);
    }

    public final void a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("mvt_able");
        com.amap.api.col.p0003sl.Cif.a(optString, true);
        this.a.put("feature_mvt", java.lang.Boolean.valueOf(com.amap.api.col.p0003sl.Cif.a(optString, true)));
        this.a.put("feature_gltf", java.lang.Boolean.valueOf(com.amap.api.col.p0003sl.Cif.a(jSONObject.optString("gltf_able"), false)));
        this.a.put("feature_terrain", java.lang.Boolean.valueOf(com.amap.api.col.p0003sl.Cif.a(jSONObject.optString("terrain_able"), false)));
        this.b.set(true);
    }

    public final boolean a(java.lang.String str) {
        if (this.a.containsKey(str)) {
            return this.a.get(str).booleanValue();
        }
        return false;
    }

    public final boolean b() {
        return this.b.get();
    }
}
