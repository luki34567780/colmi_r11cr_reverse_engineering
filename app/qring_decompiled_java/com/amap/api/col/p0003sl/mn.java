package com.amap.api.col.p0003sl;

/* compiled from: RootTUploadData.java */
/* loaded from: classes.dex */
public final class mn extends com.amap.api.col.p0003sl.nz {
    public static int a(com.amap.api.col.p0003sl.ny nyVar, int i, int i2, int i3) {
        nyVar.b(3);
        c(nyVar, i3);
        b(nyVar, i2);
        a(nyVar, i);
        return a(nyVar);
    }

    private static void a(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.b(0, i);
    }

    public static int a(com.amap.api.col.p0003sl.ny nyVar, byte[] bArr) {
        nyVar.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            nyVar.a(bArr[length]);
        }
        return nyVar.a();
    }

    private static void b(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.b(1, i);
    }

    public static int b(com.amap.api.col.p0003sl.ny nyVar, byte[] bArr) {
        nyVar.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            nyVar.a(bArr[length]);
        }
        return nyVar.a();
    }

    private static void c(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.b(2, i);
    }

    public static int a(com.amap.api.col.p0003sl.ny nyVar, int[] iArr) {
        nyVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            nyVar.a(iArr[length]);
        }
        return nyVar.a();
    }

    private static int a(com.amap.api.col.p0003sl.ny nyVar) {
        return nyVar.b();
    }
}
