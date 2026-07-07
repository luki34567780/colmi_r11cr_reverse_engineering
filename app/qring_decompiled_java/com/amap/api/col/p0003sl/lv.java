package com.amap.api.col.p0003sl;

/* compiled from: TimeUpdateStrategy.java */
/* loaded from: classes.dex */
public final class lv extends com.amap.api.col.p0003sl.lw {
    protected int a;
    protected long b;
    private java.lang.String d;
    private android.content.Context e;

    public lv(android.content.Context context, int i, java.lang.String str, com.amap.api.col.p0003sl.lw lwVar) {
        super(lwVar);
        this.a = i;
        this.d = str;
        this.e = context;
    }

    @Override // com.amap.api.col.p0003sl.lw
    protected final boolean c() {
        if (this.b == 0) {
            java.lang.String a = com.amap.api.col.p0003sl.js.a(this.e, this.d);
            this.b = android.text.TextUtils.isEmpty(a) ? 0L : java.lang.Long.parseLong(a);
        }
        return java.lang.System.currentTimeMillis() - this.b >= ((long) this.a);
    }

    @Override // com.amap.api.col.p0003sl.lw
    public final void a_(boolean z) {
        super.a_(z);
        if (z) {
            java.lang.String str = this.d;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.b = currentTimeMillis;
            com.amap.api.col.p0003sl.js.a(this.e, str, java.lang.String.valueOf(currentTimeMillis));
        }
    }
}
