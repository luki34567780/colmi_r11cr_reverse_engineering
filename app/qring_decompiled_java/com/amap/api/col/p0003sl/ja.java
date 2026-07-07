package com.amap.api.col.p0003sl;

/* compiled from: AMapLogEntity.java */
/* loaded from: classes.dex */
public final class ja {
    public static int a = 1;
    public static int b = 2;
    private java.lang.String c;
    private int d;
    private long e = java.lang.System.currentTimeMillis();
    private java.lang.String f;

    private ja(int i, java.lang.String str, java.lang.String str2) {
        this.c = str2;
        this.d = i;
        this.f = str;
    }

    public static com.amap.api.col.p0003sl.ja a(java.lang.String str, java.lang.String str2) {
        return new com.amap.api.col.p0003sl.ja(a, str, str2);
    }

    public static com.amap.api.col.p0003sl.ja b(java.lang.String str, java.lang.String str2) {
        return new com.amap.api.col.p0003sl.ja(b, str, str2);
    }

    public final int a() {
        return this.d;
    }

    public final java.lang.String b() {
        new org.json.JSONObject();
        return this.c;
    }

    private java.lang.String d() {
        return this.f;
    }

    public final java.lang.String c() {
        return a(this.d);
    }

    public static java.lang.String a(int i) {
        return i == b ? "error" : "info";
    }

    public static boolean a(com.amap.api.col.p0003sl.ja jaVar) {
        return (jaVar == null || android.text.TextUtils.isEmpty(jaVar.b())) ? false : true;
    }

    private static java.lang.String b(com.amap.api.col.p0003sl.ja jaVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("info", jaVar.b());
            jSONObject.put("session", jaVar.d());
            jSONObject.put("timestamp", jaVar.e);
            return jSONObject.toString();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static java.lang.String a(java.util.List<com.amap.api.col.p0003sl.ja> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator<com.amap.api.col.p0003sl.ja> it = list.iterator();
                    while (it.hasNext()) {
                        java.lang.String b2 = b(it.next());
                        if (!android.text.TextUtils.isEmpty(b2)) {
                            jSONArray.put(b2);
                        }
                    }
                    return jSONArray.toString();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return "";
    }
}
