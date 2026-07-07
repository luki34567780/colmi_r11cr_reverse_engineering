package com.amap.api.col.p0003sl;

/* compiled from: AMapRecallLogUpdateStrategy.java */
/* loaded from: classes.dex */
public final class jc extends com.amap.api.col.p0003sl.lw {
    private static int g = 10000000;
    protected int a;
    protected long b;
    private boolean d;
    private boolean e;
    private int f;
    private long h;

    @Override // com.amap.api.col.p0003sl.lw
    public final int a() {
        return 320000;
    }

    public jc(boolean z, com.amap.api.col.p0003sl.lw lwVar, long j, int i) {
        super(lwVar);
        this.d = false;
        this.e = false;
        this.f = g;
        this.h = 0L;
        this.d = z;
        this.a = 600000;
        this.h = j;
        this.f = i;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void a(int i) {
        if (i <= 0) {
            return;
        }
        this.h += i;
    }

    public final long b() {
        return this.h;
    }

    @Override // com.amap.api.col.p0003sl.lw
    protected final boolean c() {
        if (this.e && this.h <= this.f) {
            return true;
        }
        if (!this.d || this.h >= this.f) {
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.b < this.a) {
            return false;
        }
        this.b = currentTimeMillis;
        return true;
    }
}
