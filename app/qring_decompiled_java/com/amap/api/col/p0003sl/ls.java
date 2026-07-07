package com.amap.api.col.p0003sl;

/* compiled from: FileNumUpdateStrategy.java */
/* loaded from: classes.dex */
public final class ls extends com.amap.api.col.p0003sl.lw {
    private int a;
    private java.lang.String b;

    public ls(java.lang.String str, com.amap.api.col.p0003sl.lw lwVar) {
        super(lwVar);
        this.a = 30;
        this.b = str;
    }

    @Override // com.amap.api.col.p0003sl.lw
    protected final boolean c() {
        return a(this.b) >= this.a;
    }

    private static int a(java.lang.String str) {
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists()) {
                return file.list().length;
            }
            return 0;
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "fus", "gfn");
            return 0;
        }
    }
}
