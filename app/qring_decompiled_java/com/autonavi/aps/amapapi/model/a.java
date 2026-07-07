package com.autonavi.aps.amapapi.model;

/* compiled from: AMapLocationServer.java */
/* loaded from: classes.dex */
public final class a extends com.amap.api.location.AMapLocation {
    protected java.lang.String d;
    boolean e;
    java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private int i;
    private java.lang.String j;
    private int k;
    private java.lang.String l;
    private org.json.JSONObject m;
    private java.lang.String n;
    private java.lang.String o;
    private java.lang.String p;

    public a(java.lang.String str) {
        super(str);
        this.d = "";
        this.g = null;
        this.h = "";
        this.j = "";
        this.k = 0;
        this.l = "new";
        this.m = null;
        this.n = "";
        this.e = true;
        this.f = java.lang.String.valueOf(com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT);
        this.o = "";
        this.p = null;
    }

    public final java.lang.String a() {
        return this.g;
    }

    public final void a(java.lang.String str) {
        this.g = str;
    }

    public final java.lang.String b() {
        return this.h;
    }

    public final void b(java.lang.String str) {
        this.h = str;
    }

    public final int c() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "0"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            r2 = 0
            r1.i = r2
            goto L21
        L12:
            java.lang.String r0 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1e
            r2 = 1
            r1.i = r2
            goto L21
        L1e:
            r2 = -1
            r1.i = r2
        L21:
            int r2 = r1.i
            if (r2 != 0) goto L2b
            java.lang.String r2 = "WGS84"
            super.setCoordType(r2)
            return
        L2b:
            java.lang.String r2 = "GCJ02"
            super.setCoordType(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.autonavi.aps.amapapi.model.a.c(java.lang.String):void");
    }

    public final java.lang.String d() {
        return this.j;
    }

    public final void d(java.lang.String str) {
        this.j = str;
    }

    public final java.lang.String e() {
        return this.l;
    }

    public final void e(java.lang.String str) {
        this.l = str;
    }

    public final org.json.JSONObject f() {
        return this.m;
    }

    public final void a(org.json.JSONObject jSONObject) {
        this.m = jSONObject;
    }

    public final java.lang.String g() {
        return this.n;
    }

    private void i(java.lang.String str) {
        this.n = str;
    }

    public final com.autonavi.aps.amapapi.model.a h() {
        java.lang.String g = g();
        if (android.text.TextUtils.isEmpty(g)) {
            return null;
        }
        java.lang.String[] split = g.split(",");
        if (split.length != 3) {
            return null;
        }
        com.autonavi.aps.amapapi.model.a aVar = new com.autonavi.aps.amapapi.model.a("");
        aVar.setProvider(getProvider());
        aVar.setLongitude(com.autonavi.aps.amapapi.utils.j.c(split[0]));
        aVar.setLatitude(com.autonavi.aps.amapapi.utils.j.c(split[1]));
        aVar.setAccuracy(com.autonavi.aps.amapapi.utils.j.d(split[2]));
        aVar.setCityCode(getCityCode());
        aVar.setAdCode(getAdCode());
        aVar.setCountry(getCountry());
        aVar.setProvince(getProvince());
        aVar.setCity(getCity());
        aVar.setTime(getTime());
        aVar.e(e());
        aVar.c(java.lang.String.valueOf(c()));
        if (com.autonavi.aps.amapapi.utils.j.a(aVar)) {
            return aVar;
        }
        return null;
    }

    public final boolean i() {
        return this.e;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final java.lang.String j() {
        return this.f;
    }

    public final void f(java.lang.String str) {
        this.f = str;
    }

    private void j(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.String[] split = str.split("\\*");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            java.lang.String str2 = split[i];
            if (!android.text.TextUtils.isEmpty(str2)) {
                java.lang.String[] split2 = str2.split(",");
                setLongitude(com.autonavi.aps.amapapi.utils.j.c(split2[0]));
                setLatitude(com.autonavi.aps.amapapi.utils.j.c(split2[1]));
                setAccuracy(com.autonavi.aps.amapapi.utils.j.e(split2[2]));
                break;
            }
            i++;
        }
        this.o = str;
    }

    @Override // com.amap.api.location.AMapLocation
    public final org.json.JSONObject toJson(int i) {
        try {
            org.json.JSONObject json = super.toJson(i);
            if (i == 1) {
                json.put("retype", this.j);
                json.put("cens", this.o);
                json.put("coord", this.i);
                json.put("mcell", this.n);
                json.put("desc", this.d);
                json.put("address", getAddress());
                if (this.m != null && com.autonavi.aps.amapapi.utils.j.a(json, "offpct")) {
                    json.put("offpct", this.m.getString("offpct"));
                }
            } else if (i != 2 && i != 3) {
                return json;
            }
            json.put("type", this.l);
            json.put("isReversegeo", this.e);
            json.put("geoLanguage", this.f);
            return json;
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    public final void b(org.json.JSONObject jSONObject) {
        try {
            com.autonavi.aps.amapapi.utils.b.a(this, jSONObject);
            e(jSONObject.optString("type", this.l));
            d(jSONObject.optString("retype", this.j));
            j(jSONObject.optString("cens", this.o));
            g(jSONObject.optString("desc", this.d));
            c(jSONObject.optString("coord", java.lang.String.valueOf(this.i)));
            i(jSONObject.optString("mcell", this.n));
            a(jSONObject.optBoolean("isReversegeo", this.e));
            f(jSONObject.optString("geoLanguage", this.f));
            if (com.autonavi.aps.amapapi.utils.j.a(jSONObject, "poiid")) {
                setBuildingId(jSONObject.optString("poiid"));
            }
            if (com.autonavi.aps.amapapi.utils.j.a(jSONObject, "pid")) {
                setBuildingId(jSONObject.optString("pid"));
            }
            if (com.autonavi.aps.amapapi.utils.j.a(jSONObject, "floor")) {
                setFloor(jSONObject.optString("floor"));
            }
            if (com.autonavi.aps.amapapi.utils.j.a(jSONObject, "flr")) {
                setFloor(jSONObject.optString("flr"));
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AmapLoc", "AmapLoc");
        }
    }

    public final void g(java.lang.String str) {
        this.d = str;
    }

    public final java.lang.String k() {
        return this.p;
    }

    public final void h(java.lang.String str) {
        this.p = str;
    }

    public final int l() {
        return this.k;
    }

    public final void a(int i) {
        this.k = i;
    }

    @Override // com.amap.api.location.AMapLocation
    public final java.lang.String toStr() {
        return toStr(1);
    }

    @Override // com.amap.api.location.AMapLocation
    public final java.lang.String toStr(int i) {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = toJson(i);
            jSONObject.put("nb", this.p);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "AMapLocation", "toStr part2");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
