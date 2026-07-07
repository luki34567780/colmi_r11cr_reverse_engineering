package com.amap.api.col.p0003sl;

/* compiled from: TWifi.java */
/* loaded from: classes.dex */
public final class mz extends com.amap.api.col.p0003sl.nz {
    public static int a(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.b(1);
        b(nyVar, i);
        return a(nyVar);
    }

    private static void b(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.b(0, i);
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
