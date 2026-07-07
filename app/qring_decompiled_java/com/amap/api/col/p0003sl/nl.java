package com.amap.api.col.p0003sl;

/* compiled from: AmapCellWcdma.java */
/* loaded from: classes.dex */
public final class nl extends com.amap.api.col.p0003sl.nh implements java.io.Serializable {
    public int j;
    public int k;
    public int l;
    public int m;

    public nl() {
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }

    public nl(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.col.p0003sl.nh
    /* renamed from: a */
    public final com.amap.api.col.p0003sl.nh clone() {
        com.amap.api.col.p0003sl.nl nlVar = new com.amap.api.col.p0003sl.nl(this.h, this.i);
        nlVar.a(this);
        nlVar.j = this.j;
        nlVar.k = this.k;
        nlVar.l = this.l;
        nlVar.m = this.m;
        return nlVar;
    }

    @Override // com.amap.api.col.p0003sl.nh
    public final java.lang.String toString() {
        return "AmapCellWcdma{lac=" + this.j + ", cid=" + this.k + ", psc=" + this.l + ", uarfcn=" + this.m + ", mcc='" + this.a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }
}
