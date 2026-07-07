package com.amap.api.col.p0003sl;

/* compiled from: MobileUpdateStrategy.java */
/* loaded from: classes.dex */
public final class lt extends com.amap.api.col.p0003sl.lw {
    private android.content.Context b;
    private boolean d;
    private int e;
    private int f;
    private java.lang.String a = "iKey";
    private int g = 0;

    public lt(android.content.Context context, boolean z, int i, int i2, java.lang.String str) {
        a(context, z, i, i2, str, 0);
    }

    public lt(android.content.Context context, boolean z, int i, int i2, java.lang.String str, int i3) {
        a(context, z, i, i2, str, i3);
    }

    private void a(android.content.Context context, boolean z, int i, int i2, java.lang.String str, int i3) {
        this.b = context;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.a = str;
        this.g = i3;
    }

    @Override // com.amap.api.col.p0003sl.lw
    protected final boolean c() {
        if (com.amap.api.col.p0003sl.ii.j(this.b) == 1) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        java.lang.String a = com.amap.api.col.p0003sl.js.a(this.b, this.a);
        if (android.text.TextUtils.isEmpty(a)) {
            return true;
        }
        java.lang.String[] split = a.split("\\|");
        if (split != null && split.length >= 2) {
            return !com.amap.api.col.p0003sl.ir.a(java.lang.System.currentTimeMillis(), "yyyyMMdd").equals(split[0]) || java.lang.Integer.parseInt(split[1]) < this.f;
        }
        com.amap.api.col.p0003sl.js.b(this.b, this.a);
        return true;
    }

    @Override // com.amap.api.col.p0003sl.lw
    public final int a() {
        int i;
        int i2 = Integer.MAX_VALUE;
        if ((com.amap.api.col.p0003sl.ii.j(this.b) != 1 && (i = this.e) > 0) || ((i = this.g) > 0 && i < Integer.MAX_VALUE)) {
            i2 = i;
        }
        return this.c != null ? java.lang.Math.max(i2, this.c.a()) : i2;
    }

    @Override // com.amap.api.col.p0003sl.lw
    public final void a_(int i) {
        if (com.amap.api.col.p0003sl.ii.j(this.b) == 1) {
            return;
        }
        java.lang.String a = com.amap.api.col.p0003sl.ir.a(java.lang.System.currentTimeMillis(), "yyyyMMdd");
        java.lang.String a2 = com.amap.api.col.p0003sl.js.a(this.b, this.a);
        if (!android.text.TextUtils.isEmpty(a2)) {
            java.lang.String[] split = a2.split("\\|");
            if (split == null || split.length < 2) {
                com.amap.api.col.p0003sl.js.b(this.b, this.a);
            } else if (a.equals(split[0])) {
                i += java.lang.Integer.parseInt(split[1]);
            }
        }
        com.amap.api.col.p0003sl.js.a(this.b, this.a, a + com.king.zxing.util.LogUtils.VERTICAL + i);
    }
}
