package com.autonavi.aps.amapapi.restruct;

/* compiled from: WifiAgeEstimator.java */
/* loaded from: classes.dex */
public final class h extends com.autonavi.aps.amapapi.restruct.a<com.amap.api.col.p0003sl.no> {
    @Override // com.autonavi.aps.amapapi.restruct.a
    final /* bridge */ /* synthetic */ void a(com.amap.api.col.p0003sl.no noVar, long j) {
        a2(noVar, j);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* synthetic */ java.lang.String b(com.amap.api.col.p0003sl.no noVar) {
        return a(noVar);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    final /* synthetic */ int c(com.amap.api.col.p0003sl.no noVar) {
        return b2(noVar);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    final /* synthetic */ long d(com.amap.api.col.p0003sl.no noVar) {
        return c2(noVar);
    }

    public h(android.content.Context context, java.lang.String str, android.os.Handler handler) {
        super(context, str, handler);
    }

    private static java.lang.String a(com.amap.api.col.p0003sl.no noVar) {
        return noVar == null ? "" : noVar.a();
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private static int b2(com.amap.api.col.p0003sl.no noVar) {
        if (noVar == null) {
            return -113;
        }
        return noVar.c;
    }

    /* renamed from: c, reason: avoid collision after fix types in other method */
    private static long c2(com.amap.api.col.p0003sl.no noVar) {
        if (noVar == null) {
            return 0L;
        }
        return noVar.f;
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    final long b() {
        return com.autonavi.aps.amapapi.config.a.e;
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    final long c() {
        return com.autonavi.aps.amapapi.config.a.f;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static void a2(com.amap.api.col.p0003sl.no noVar, long j) {
        if (noVar != null) {
            noVar.f = j;
        }
    }
}
