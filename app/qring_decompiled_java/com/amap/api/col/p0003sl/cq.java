package com.amap.api.col.p0003sl;

/* compiled from: GlShaderManager.java */
/* loaded from: classes.dex */
public final class cq {
    private com.amap.api.col.3sl.cq.a a;
    private com.amap.api.col.3sl.cq.b b;
    private com.amap.api.col.3sl.cq.b c;

    /* compiled from: GlShaderManager.java */
    public static class a extends com.amap.api.col.p0003sl.cp {
    }

    /* compiled from: GlShaderManager.java */
    public static class b extends com.amap.api.col.p0003sl.cp {
    }

    public final synchronized void a() {
        com.amap.api.col.3sl.cq.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
            this.a = null;
        }
        com.amap.api.col.3sl.cq.b bVar = this.b;
        if (bVar != null) {
            bVar.a();
            this.b = null;
        }
        com.amap.api.col.3sl.cq.b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.a();
            this.c = null;
        }
    }
}
