package com.amap.api.col.p0003sl;

/* compiled from: TCellInfo.java */
/* loaded from: classes.dex */
public final class mr extends com.amap.api.col.p0003sl.nz {
    public static int a(com.amap.api.col.p0003sl.ny nyVar, byte b, byte b2, short s, byte b3, int i) {
        nyVar.b(5);
        a(nyVar, i);
        a(nyVar, s);
        c(nyVar, b3);
        b(nyVar, b2);
        a(nyVar, b);
        return a(nyVar);
    }

    private static void a(com.amap.api.col.p0003sl.ny nyVar, byte b) {
        nyVar.a(0, b);
    }

    private static void b(com.amap.api.col.p0003sl.ny nyVar, byte b) {
        nyVar.a(1, b);
    }

    private static void a(com.amap.api.col.p0003sl.ny nyVar, short s) {
        nyVar.a(2, s);
    }

    private static void c(com.amap.api.col.p0003sl.ny nyVar, byte b) {
        nyVar.a(3, b);
    }

    private static void a(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.b(4, i);
    }

    private static int a(com.amap.api.col.p0003sl.ny nyVar) {
        return nyVar.b();
    }
}
