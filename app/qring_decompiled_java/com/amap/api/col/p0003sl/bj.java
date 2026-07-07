package com.amap.api.col.p0003sl;

/* compiled from: DTDownloadInfo.java */
@com.amap.api.col.p0003sl.ke(a = "update_item_download_info")
/* loaded from: classes.dex */
class bj {

    @com.amap.api.col.p0003sl.kf(a = "mAdcode", b = 6)
    private java.lang.String a;

    @com.amap.api.col.p0003sl.kf(a = "fileLength", b = 5)
    private long b;

    @com.amap.api.col.p0003sl.kf(a = "splitter", b = 2)
    private int c;

    @com.amap.api.col.p0003sl.kf(a = "startPos", b = 5)
    private long d;

    @com.amap.api.col.p0003sl.kf(a = "endPos", b = 5)
    private long e;

    public bj() {
        this.a = "";
        this.b = 0L;
        this.c = 0;
        this.d = 0L;
        this.e = 0L;
    }

    public bj(java.lang.String str, long j, int i, long j2, long j3) {
        this.a = "";
        this.b = 0L;
        this.c = 0;
        this.d = 0L;
        this.e = 0L;
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = j3;
    }

    public static java.lang.String a(java.lang.String str) {
        return "mAdcode='" + str + "'";
    }
}
