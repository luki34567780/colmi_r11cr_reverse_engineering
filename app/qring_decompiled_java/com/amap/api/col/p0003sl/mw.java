package com.amap.api.col.p0003sl;

/* compiled from: TMainCellCDMAHistory.java */
/* loaded from: classes.dex */
public final class mw extends com.amap.api.col.p0003sl.nz {
    public static int a(com.amap.api.col.p0003sl.ny nyVar, int i, int i2, int i3, short s) {
        nyVar.b(5);
        c(nyVar, i3);
        b(nyVar, i2);
        a(nyVar, i);
        a(nyVar, s);
        a(nyVar);
        return b(nyVar);
    }

    private static void a(com.amap.api.col.p0003sl.ny nyVar) {
        nyVar.a(0, (byte) 2);
    }

    private static void a(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.a(1, i);
    }

    private static void b(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.a(2, i);
    }

    private static void c(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.a(3, i);
    }

    private static void a(com.amap.api.col.p0003sl.ny nyVar, short s) {
        nyVar.a(4, s);
    }

    private static int b(com.amap.api.col.p0003sl.ny nyVar) {
        return nyVar.b();
    }
}
