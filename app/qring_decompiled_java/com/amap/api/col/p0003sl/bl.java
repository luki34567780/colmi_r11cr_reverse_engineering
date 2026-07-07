package com.amap.api.col.p0003sl;

/* compiled from: DTInfo.java */
@com.amap.api.col.p0003sl.ke(a = "update_item")
/* loaded from: classes.dex */
public class bl {

    @com.amap.api.col.p0003sl.kf(a = "localPath", b = 6)
    protected java.lang.String h;

    @com.amap.api.col.p0003sl.kf(a = "mCompleteCode", b = 2)
    protected int j;

    @com.amap.api.col.p0003sl.kf(a = "mState", b = 2)
    public int l;

    @com.amap.api.col.p0003sl.kf(a = "title", b = 6)
    protected java.lang.String a = null;

    @com.amap.api.col.p0003sl.kf(a = "url", b = 6)
    protected java.lang.String b = null;

    @com.amap.api.col.p0003sl.kf(a = "mAdcode", b = 6)
    protected java.lang.String c = null;

    @com.amap.api.col.p0003sl.kf(a = "fileName", b = 6)
    protected java.lang.String d = null;

    @com.amap.api.col.p0003sl.kf(a = "version", b = 6)
    protected java.lang.String e = "";

    @com.amap.api.col.p0003sl.kf(a = "lLocalLength", b = 5)
    protected long f = 0;

    @com.amap.api.col.p0003sl.kf(a = "lRemoteLength", b = 5)
    protected long g = 0;

    @com.amap.api.col.p0003sl.kf(a = "isProvince", b = 2)
    protected int i = 0;

    @com.amap.api.col.p0003sl.kf(a = "mCityCode", b = 6)
    protected java.lang.String k = "";

    @com.amap.api.col.p0003sl.kf(a = "mPinyin", b = 6)
    public java.lang.String m = "";

    public final java.lang.String c() {
        return this.a;
    }

    public final java.lang.String d() {
        return this.e;
    }

    public final java.lang.String e() {
        return this.c;
    }

    public final void c(java.lang.String str) {
        this.c = str;
    }

    public final java.lang.String f() {
        return this.b;
    }

    public final int g() {
        return this.j;
    }

    public final void d(java.lang.String str) {
        this.k = str;
    }

    public final java.lang.String h() {
        return this.m;
    }

    public static java.lang.String e(java.lang.String str) {
        return "mAdcode='" + str + "'";
    }

    public static java.lang.String f(java.lang.String str) {
        return "mPinyin='" + str + "'";
    }
}
