package com.amap.api.col.p0003sl;

/* compiled from: WiFiUplateStrategy.java */
/* loaded from: classes.dex */
public final class lx extends com.amap.api.col.p0003sl.lw {
    private android.content.Context a;
    private boolean b;

    public lx(android.content.Context context, boolean z) {
        this.b = false;
        this.a = context;
        this.b = z;
    }

    @Override // com.amap.api.col.p0003sl.lw
    protected final boolean c() {
        return com.amap.api.col.p0003sl.ii.j(this.a) == 1 || this.b;
    }
}
