package com.amap.api.col.p0003sl;

/* compiled from: AmapCellLte.java */
/* loaded from: classes.dex */
public final class nk extends com.amap.api.col.p0003sl.nh implements java.io.Serializable {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public nk() {
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
    }

    public nk(boolean z) {
        super(z, true);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.col.p0003sl.nh
    /* renamed from: a */
    public final com.amap.api.col.p0003sl.nh clone() {
        com.amap.api.col.p0003sl.nk nkVar = new com.amap.api.col.p0003sl.nk(this.h);
        nkVar.a(this);
        nkVar.j = this.j;
        nkVar.k = this.k;
        nkVar.l = this.l;
        nkVar.m = this.m;
        nkVar.n = this.n;
        return nkVar;
    }

    @Override // com.amap.api.col.p0003sl.nh
    public final java.lang.String toString() {
        return "AmapCellLte{tac=" + this.j + ", ci=" + this.k + ", pci=" + this.l + ", earfcn=" + this.m + ", timingAdvance=" + this.n + ", mcc='" + this.a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }
}
