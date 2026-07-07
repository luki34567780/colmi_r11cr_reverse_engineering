package com.autonavi.aps.amapapi.storage;

/* compiled from: LastLocationInfo.java */
@com.amap.api.col.p0003sl.ke(a = "c")
/* loaded from: classes.dex */
public class b {

    @com.amap.api.col.p0003sl.kf(a = "a2", b = 6)
    private java.lang.String a;

    @com.amap.api.col.p0003sl.kf(a = "a3", b = 5)
    private long b;

    @com.amap.api.col.p0003sl.kf(a = "a4", b = 6)
    private java.lang.String c;
    private com.amap.api.location.AMapLocation d;

    public final com.amap.api.location.AMapLocation a() {
        return this.d;
    }

    public final void a(com.amap.api.location.AMapLocation aMapLocation) {
        this.d = aMapLocation;
    }

    public final java.lang.String b() {
        return this.c;
    }

    public final void a(java.lang.String str) {
        this.c = str;
    }

    public final java.lang.String c() {
        return this.a;
    }

    public final void b(java.lang.String str) {
        this.a = str;
    }

    public final long d() {
        return this.b;
    }

    public final void a(long j) {
        this.b = j;
    }
}
