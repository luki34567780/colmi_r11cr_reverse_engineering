package com.amap.api.col.p0003sl;

/* compiled from: DTFileInfo.java */
@com.amap.api.col.p0003sl.ke(a = "update_item_file")
/* loaded from: classes.dex */
class bk {

    @com.amap.api.col.p0003sl.kf(a = "mAdcode", b = 6)
    private java.lang.String a;

    @com.amap.api.col.p0003sl.kf(a = "file", b = 6)
    private java.lang.String b;

    public bk() {
        this.a = "";
        this.b = "";
    }

    public bk(java.lang.String str, java.lang.String str2) {
        this.a = "";
        this.b = "";
        this.a = str;
        this.b = str2;
    }

    public final java.lang.String a() {
        return this.b;
    }

    public static java.lang.String a(java.lang.String str) {
        return "mAdcode='" + str + "'";
    }
}
