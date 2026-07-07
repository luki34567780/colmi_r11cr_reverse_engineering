package com.amap.api.col.p0003sl;

/* compiled from: AmapCellGsm.java */
/* loaded from: classes.dex */
public final class nj extends com.amap.api.col.p0003sl.nh implements java.io.Serializable {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public nj() {
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
    }

    public nj(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.col.p0003sl.nh
    /* renamed from: a */
    public final com.amap.api.col.p0003sl.nh clone() {
        com.amap.api.col.p0003sl.nj njVar = new com.amap.api.col.p0003sl.nj(this.h, this.i);
        njVar.a(this);
        njVar.j = this.j;
        njVar.k = this.k;
        njVar.l = this.l;
        njVar.m = this.m;
        njVar.n = this.n;
        njVar.o = this.o;
        return njVar;
    }

    @Override // com.amap.api.col.p0003sl.nh
    public final java.lang.String toString() {
        return "AmapCellGsm{lac=" + this.j + ", cid=" + this.k + ", psc=" + this.l + ", arfcn=" + this.m + ", bsic=" + this.n + ", timingAdvance=" + this.o + ", mcc='" + this.a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }
}
