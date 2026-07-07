package com.amap.api.col.p0003sl;

/* compiled from: TData.java */
/* loaded from: classes.dex */
public final class ms extends com.amap.api.col.p0003sl.nz {
    public static int a(com.amap.api.col.p0003sl.ny nyVar, byte b, int i) {
        nyVar.b(2);
        a(nyVar, i);
        a(nyVar, b);
        return a(nyVar);
    }

    private static void a(com.amap.api.col.p0003sl.ny nyVar, byte b) {
        nyVar.a(0, b);
    }

    private static void a(com.amap.api.col.p0003sl.ny nyVar, int i) {
        nyVar.b(1, i);
    }

    public static int a(com.amap.api.col.p0003sl.ny nyVar, byte[] bArr) {
        nyVar.a(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            nyVar.a(bArr[length]);
        }
        return nyVar.a();
    }

    private static int a(com.amap.api.col.p0003sl.ny nyVar) {
        return nyVar.b();
    }
}
