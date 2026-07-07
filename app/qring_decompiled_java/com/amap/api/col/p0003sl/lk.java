package com.amap.api.col.p0003sl;

/* compiled from: ByteJoinDataStrategy.java */
/* loaded from: classes.dex */
public final class lk extends com.amap.api.col.p0003sl.lq {
    java.io.ByteArrayOutputStream a;

    public lk() {
        this.a = new java.io.ByteArrayOutputStream();
    }

    public lk(com.amap.api.col.p0003sl.lq lqVar) {
        super(lqVar);
        this.a = new java.io.ByteArrayOutputStream();
    }

    @Override // com.amap.api.col.p0003sl.lq
    protected final byte[] a(byte[] bArr) {
        byte[] byteArray = this.a.toByteArray();
        try {
            this.a.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        this.a = new java.io.ByteArrayOutputStream();
        return byteArray;
    }

    @Override // com.amap.api.col.p0003sl.lq
    public final void b(byte[] bArr) {
        try {
            this.a.write(bArr);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }
}
