package com.amap.api.col.p0003sl;

/* compiled from: Rom.java */
/* loaded from: classes.dex */
public enum jp {
    MIUI(com.amap.api.col.p0003sl.ir.c("IeGlhb21p")),
    Flyme(com.amap.api.col.p0003sl.ir.c("IbWVpenU")),
    RH(com.amap.api.col.p0003sl.ir.c("IaHVhd2Vp")),
    ColorOS(com.amap.api.col.p0003sl.ir.c("Ib3Bwbw")),
    FuntouchOS(com.amap.api.col.p0003sl.ir.c("Idml2bw")),
    SmartisanOS(com.amap.api.col.p0003sl.ir.c("Mc21hcnRpc2Fu")),
    AmigoOS(com.amap.api.col.p0003sl.ir.c("IYW1pZ28")),
    EUI(com.amap.api.col.p0003sl.ir.c("IbGV0dg")),
    Sense(com.amap.api.col.p0003sl.ir.c("EaHRj")),
    LG(com.amap.api.col.p0003sl.ir.c("EbGdl")),
    Google(com.amap.api.col.p0003sl.ir.c("IZ29vZ2xl")),
    NubiaUI(com.amap.api.col.p0003sl.ir.c("IbnViaWE")),
    Other("");

    private java.lang.String n;
    private int o;
    private java.lang.String p;
    private java.lang.String q;
    private java.lang.String r = android.os.Build.MANUFACTURER;

    jp(java.lang.String str) {
        this.n = str;
    }

    public final java.lang.String a() {
        return this.n;
    }

    public final void a(int i) {
        this.o = i;
    }

    public final java.lang.String b() {
        return this.p;
    }

    public final void a(java.lang.String str) {
        this.p = str;
    }

    public final void b(java.lang.String str) {
        this.q = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "ROM{name='" + name() + "',versionCode=" + this.o + ", versionName='" + this.q + "',ma=" + this.n + "',manufacturer=" + this.r + "'}";
    }
}
