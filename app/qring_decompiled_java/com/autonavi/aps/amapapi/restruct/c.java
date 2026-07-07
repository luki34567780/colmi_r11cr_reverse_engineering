package com.autonavi.aps.amapapi.restruct;

/* compiled from: CellAgeEstimator.java */
/* loaded from: classes.dex */
public final class c extends com.autonavi.aps.amapapi.restruct.a<com.autonavi.aps.amapapi.restruct.d> {
    @Override // com.autonavi.aps.amapapi.restruct.a
    final /* bridge */ /* synthetic */ void a(com.autonavi.aps.amapapi.restruct.d dVar, long j) {
        a2(dVar, j);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* synthetic */ java.lang.String b(com.autonavi.aps.amapapi.restruct.d dVar) {
        return a(dVar);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    final /* synthetic */ int c(com.autonavi.aps.amapapi.restruct.d dVar) {
        return b2(dVar);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    final /* synthetic */ long d(com.autonavi.aps.amapapi.restruct.d dVar) {
        return c2(dVar);
    }

    public c(android.content.Context context, java.lang.String str, android.os.Handler handler) {
        super(context, str, handler);
    }

    private static java.lang.String a(com.autonavi.aps.amapapi.restruct.d dVar) {
        return dVar == null ? "" : dVar.b();
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private static int b2(com.autonavi.aps.amapapi.restruct.d dVar) {
        if (dVar == null) {
            return 99;
        }
        return dVar.s;
    }

    /* renamed from: c, reason: avoid collision after fix types in other method */
    private static long c2(com.autonavi.aps.amapapi.restruct.d dVar) {
        if (dVar == null) {
            return 0L;
        }
        return dVar.t;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static void a2(com.autonavi.aps.amapapi.restruct.d dVar, long j) {
        if (dVar != null) {
            dVar.t = j;
        }
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    final long b() {
        return com.autonavi.aps.amapapi.config.a.g;
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    final long c() {
        return com.autonavi.aps.amapapi.config.a.h;
    }
}
