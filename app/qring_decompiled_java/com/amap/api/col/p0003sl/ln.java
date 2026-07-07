package com.amap.api.col.p0003sl;

/* compiled from: LogJsonDataStrategy.java */
/* loaded from: classes.dex */
public final class ln extends com.amap.api.col.p0003sl.lq {
    private java.lang.StringBuilder a;
    private boolean b;

    public ln() {
        this.a = new java.lang.StringBuilder();
        this.b = true;
    }

    public ln(com.amap.api.col.p0003sl.lq lqVar) {
        super(lqVar);
        this.a = new java.lang.StringBuilder();
        this.b = true;
    }

    @Override // com.amap.api.col.p0003sl.lq
    protected final byte[] a(byte[] bArr) {
        byte[] a = com.amap.api.col.p0003sl.ir.a(this.a.toString());
        this.d = a;
        this.b = true;
        java.lang.StringBuilder sb = this.a;
        sb.delete(0, sb.length());
        return a;
    }

    @Override // com.amap.api.col.p0003sl.lq
    public final void b(byte[] bArr) {
        java.lang.String a = com.amap.api.col.p0003sl.ir.a(bArr);
        if (this.b) {
            this.b = false;
        } else {
            this.a.append(",");
        }
        java.lang.StringBuilder sb = this.a;
        sb.append("{\"log\":\"");
        sb.append(a);
        sb.append("\"}");
    }
}
