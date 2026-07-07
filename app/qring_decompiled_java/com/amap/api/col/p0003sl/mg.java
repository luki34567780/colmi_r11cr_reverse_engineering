package com.amap.api.col.p0003sl;

/* compiled from: UploadBufferBuilder.java */
/* loaded from: classes.dex */
public final class mg extends com.amap.api.col.p0003sl.md {
    private static com.amap.api.col.p0003sl.mg b = new com.amap.api.col.p0003sl.mg();

    private static java.lang.String a(java.lang.String str) {
        return str == null ? "" : str;
    }

    public static com.amap.api.col.p0003sl.mg b() {
        return b;
    }

    private mg() {
        super(5120);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, java.util.List<? extends com.amap.api.col.p0003sl.mk> list) {
        if (list == null) {
            return null;
        }
        try {
            int size = list.size();
            if (size <= 0 || bArr == null) {
                return null;
            }
            a();
            int a = com.amap.api.col.p0003sl.mn.a((com.amap.api.col.p0003sl.ny) this.a, bArr);
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                com.amap.api.col.p0003sl.mk mkVar = list.get(i);
                iArr[i] = com.amap.api.col.p0003sl.ms.a(this.a, (byte) mkVar.a(), com.amap.api.col.p0003sl.ms.a(this.a, mkVar.b()));
            }
            this.a.c(com.amap.api.col.p0003sl.mn.a(this.a, a, bArr2 != null ? com.amap.api.col.p0003sl.mn.b(this.a, bArr2) : 0, com.amap.api.col.p0003sl.mn.a(this.a, iArr)));
            return this.a.c();
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.nr.a(th);
            return null;
        }
    }

    public final byte[] c() {
        super.a();
        try {
            this.a.c(com.amap.api.col.p0003sl.nq.a(this.a, com.amap.api.col.p0003sl.np.a(), this.a.a(com.amap.api.col.p0003sl.np.f()), this.a.a(com.amap.api.col.p0003sl.np.c()), (byte) com.amap.api.col.p0003sl.np.m(), this.a.a(com.amap.api.col.p0003sl.np.i()), this.a.a(com.amap.api.col.p0003sl.np.h()), this.a.a(a(com.amap.api.col.p0003sl.np.g())), this.a.a(a(com.amap.api.col.p0003sl.np.j())), com.amap.api.col.p0003sl.no.a(com.amap.api.col.p0003sl.np.n()), this.a.a(com.amap.api.col.p0003sl.np.l()), this.a.a(com.amap.api.col.p0003sl.np.k()), this.a.a(com.amap.api.col.p0003sl.np.d()), this.a.a(com.amap.api.col.p0003sl.np.e())));
            return this.a.c();
        } catch (java.lang.Exception e) {
            com.amap.api.col.p0003sl.nr.a(e);
            return null;
        }
    }
}
