package com.amap.api.col.p0003sl;

/* compiled from: AmapCellCdma.java */
/* loaded from: classes.dex */
public final class ni extends com.amap.api.col.p0003sl.nh implements java.io.Serializable {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public ni() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
    }

    public ni(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = 0;
    }

    @Override // com.amap.api.col.p0003sl.nh
    /* renamed from: a */
    public final com.amap.api.col.p0003sl.nh clone() {
        com.amap.api.col.p0003sl.ni niVar = new com.amap.api.col.p0003sl.ni(this.h, this.i);
        niVar.a(this);
        niVar.j = this.j;
        niVar.k = this.k;
        niVar.l = this.l;
        niVar.m = this.m;
        niVar.n = this.n;
        return niVar;
    }

    @Override // com.amap.api.col.p0003sl.nh
    public final java.lang.String toString() {
        return "AmapCellCdma{sid=" + this.j + ", nid=" + this.k + ", bid=" + this.l + ", latitude=" + this.m + ", longitude=" + this.n + ", mcc='" + this.a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }
}
