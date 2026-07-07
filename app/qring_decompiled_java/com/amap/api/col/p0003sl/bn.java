package com.amap.api.col.p0003sl;

/* compiled from: OfflineDBOperation.java */
/* loaded from: classes.dex */
public class bn {
    private static volatile com.amap.api.col.p0003sl.bn a;
    private static com.amap.api.col.p0003sl.kd b;
    private android.content.Context c;

    public static com.amap.api.col.p0003sl.bn a(android.content.Context context) {
        if (a == null) {
            synchronized (com.amap.api.col.p0003sl.bn.class) {
                if (a == null) {
                    a = new com.amap.api.col.p0003sl.bn(context);
                }
            }
        }
        return a;
    }

    private bn(android.content.Context context) {
        this.c = context;
        b = b(context);
    }

    private static com.amap.api.col.p0003sl.kd b(android.content.Context context) {
        try {
            return new com.amap.api.col.p0003sl.kd(context, com.amap.api.col.p0003sl.bm.a());
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "OfflineDB", "getDB");
            th.printStackTrace();
            return null;
        }
    }

    private boolean b() {
        if (b == null) {
            b = b(this.c);
        }
        return b != null;
    }

    public final java.util.ArrayList<com.amap.api.col.p0003sl.bi> a() {
        java.util.ArrayList<com.amap.api.col.p0003sl.bi> arrayList = new java.util.ArrayList<>();
        if (!b()) {
            return arrayList;
        }
        java.util.Iterator it = b.b("", com.amap.api.col.p0003sl.bi.class).iterator();
        while (it.hasNext()) {
            arrayList.add((com.amap.api.col.p0003sl.bi) it.next());
        }
        return arrayList;
    }

    public final synchronized com.amap.api.col.p0003sl.bi a(java.lang.String str) {
        if (!b()) {
            return null;
        }
        java.util.List b2 = b.b(com.amap.api.col.p0003sl.bi.e(str), com.amap.api.col.p0003sl.bi.class);
        if (b2.size() <= 0) {
            return null;
        }
        return (com.amap.api.col.p0003sl.bi) b2.get(0);
    }

    public final synchronized void a(com.amap.api.col.p0003sl.bi biVar) {
        if (b()) {
            b.a(biVar, com.amap.api.col.p0003sl.bi.f(biVar.h()));
            a(biVar.e(), biVar.a());
        }
    }

    private static void a(java.lang.String str, java.lang.String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        java.lang.String a2 = com.amap.api.col.p0003sl.bk.a(str);
        if (b.b(a2, com.amap.api.col.p0003sl.bk.class).size() > 0) {
            b.a(a2, com.amap.api.col.p0003sl.bk.class);
        }
        java.lang.String[] split = str2.split(";");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str3 : split) {
            arrayList.add(new com.amap.api.col.p0003sl.bk(str, str3));
        }
        b.a((java.util.List) arrayList);
    }

    public final synchronized java.util.List<java.lang.String> b(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!b()) {
            return arrayList;
        }
        arrayList.addAll(a((java.util.List<com.amap.api.col.p0003sl.bk>) b.b(com.amap.api.col.p0003sl.bk.a(str), com.amap.api.col.p0003sl.bk.class)));
        return arrayList;
    }

    private static java.util.List<java.lang.String> a(java.util.List<com.amap.api.col.p0003sl.bk> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list.size() > 0) {
            java.util.Iterator<com.amap.api.col.p0003sl.bk> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
        }
        return arrayList;
    }

    public final synchronized void c(java.lang.String str) {
        if (b()) {
            b.a(com.amap.api.col.p0003sl.bl.e(str), com.amap.api.col.p0003sl.bl.class);
            b.a(com.amap.api.col.p0003sl.bk.a(str), com.amap.api.col.p0003sl.bk.class);
            b.a(com.amap.api.col.p0003sl.bj.a(str), com.amap.api.col.p0003sl.bj.class);
        }
    }

    public final synchronized void b(com.amap.api.col.p0003sl.bi biVar) {
        if (b()) {
            b.a(com.amap.api.col.p0003sl.bl.f(biVar.h()), com.amap.api.col.p0003sl.bl.class);
            b.a(com.amap.api.col.p0003sl.bk.a(biVar.e()), com.amap.api.col.p0003sl.bk.class);
            b.a(com.amap.api.col.p0003sl.bj.a(biVar.e()), com.amap.api.col.p0003sl.bj.class);
        }
    }

    public final void a(java.lang.String str, int i, long j, long j2, long j3) {
        if (b()) {
            a(str, i, j, new long[]{j2, 0, 0, 0, 0}, new long[]{j3, 0, 0, 0, 0});
        }
    }

    private synchronized void a(java.lang.String str, int i, long j, long[] jArr, long[] jArr2) {
        if (b()) {
            b.a(new com.amap.api.col.p0003sl.bj(str, j, i, jArr[0], jArr2[0]), com.amap.api.col.p0003sl.bj.a(str));
        }
    }

    public final synchronized java.lang.String d(java.lang.String str) {
        if (!b()) {
            return null;
        }
        java.util.List b2 = b.b(com.amap.api.col.p0003sl.bl.f(str), com.amap.api.col.p0003sl.bl.class);
        return b2.size() > 0 ? ((com.amap.api.col.p0003sl.bl) b2.get(0)).d() : null;
    }
}
