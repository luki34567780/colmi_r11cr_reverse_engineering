package com.amap.api.col.p0003sl;

/* compiled from: AbstractBuilder.java */
/* loaded from: classes.dex */
public abstract class md {
    com.amap.api.col.p0003sl.mf a;
    private java.nio.ByteBuffer b;

    md(int i) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i);
        this.b = allocate;
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.a = new com.amap.api.col.p0003sl.mf(this.b);
    }

    public final com.amap.api.col.p0003sl.md a() {
        this.a.a(this.b);
        return this;
    }
}
