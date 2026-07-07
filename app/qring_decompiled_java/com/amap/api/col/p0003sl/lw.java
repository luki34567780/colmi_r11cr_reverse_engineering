package com.amap.api.col.p0003sl;

/* compiled from: UpdateStrategy.java */
/* loaded from: classes.dex */
public abstract class lw {
    com.amap.api.col.p0003sl.lw c;

    protected abstract boolean c();

    public lw() {
    }

    public lw(com.amap.api.col.p0003sl.lw lwVar) {
        this.c = lwVar;
    }

    public void a_(boolean z) {
        com.amap.api.col.p0003sl.lw lwVar = this.c;
        if (lwVar != null) {
            lwVar.a_(z);
        }
    }

    public int a() {
        com.amap.api.col.p0003sl.lw lwVar = this.c;
        return java.lang.Math.min(Integer.MAX_VALUE, lwVar != null ? lwVar.a() : Integer.MAX_VALUE);
    }

    public void a_(int i) {
        com.amap.api.col.p0003sl.lw lwVar = this.c;
        if (lwVar != null) {
            lwVar.a_(i);
        }
    }

    public final boolean d() {
        com.amap.api.col.p0003sl.lw lwVar = this.c;
        if (lwVar != null ? lwVar.d() : true) {
            return c();
        }
        return false;
    }
}
