package com.amap.api.col.p0003sl;

/* compiled from: RssiInfoManager.java */
/* loaded from: classes.dex */
public final class nc {
    private static volatile com.amap.api.col.p0003sl.nc g;
    private static java.lang.Object h = new java.lang.Object();
    private java.lang.Object e = new java.lang.Object();
    private java.lang.Object f = new java.lang.Object();
    private android.util.LongSparseArray<com.amap.api.col.3sl.nc.a> a = new android.util.LongSparseArray<>();
    private android.util.LongSparseArray<com.amap.api.col.3sl.nc.a> b = new android.util.LongSparseArray<>();
    private android.util.LongSparseArray<com.amap.api.col.3sl.nc.a> c = new android.util.LongSparseArray<>();
    private android.util.LongSparseArray<com.amap.api.col.3sl.nc.a> d = new android.util.LongSparseArray<>();

    public static com.amap.api.col.p0003sl.nc a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new com.amap.api.col.p0003sl.nc();
                }
            }
        }
        return g;
    }

    private nc() {
    }

    final void a(java.util.List<com.amap.api.col.p0003sl.nb> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.e) {
            a(list, this.a, this.b);
            android.util.LongSparseArray<com.amap.api.col.3sl.nc.a> longSparseArray = this.a;
            this.a = this.b;
            this.b = longSparseArray;
            longSparseArray.clear();
        }
    }

    final short a(long j) {
        return a(this.a, j);
    }

    final void b(java.util.List<com.amap.api.col.p0003sl.nb> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f) {
            a(list, this.c, this.d);
            android.util.LongSparseArray<com.amap.api.col.3sl.nc.a> longSparseArray = this.c;
            this.c = this.d;
            this.d = longSparseArray;
            longSparseArray.clear();
        }
    }

    final short b(long j) {
        return a(this.c, j);
    }

    private static void a(java.util.List<com.amap.api.col.p0003sl.nb> list, android.util.LongSparseArray<com.amap.api.col.3sl.nc.a> longSparseArray, android.util.LongSparseArray<com.amap.api.col.3sl.nc.a> longSparseArray2) {
        long b = b();
        byte b2 = 0;
        if (longSparseArray.size() == 0) {
            for (com.amap.api.col.p0003sl.nb nbVar : list) {
                com.amap.api.col.3sl.nc.a aVar = new com.amap.api.col.3sl.nc.a(b2);
                aVar.a = nbVar.b();
                aVar.b = b;
                aVar.c = false;
                longSparseArray2.put(nbVar.a(), aVar);
            }
            return;
        }
        for (com.amap.api.col.p0003sl.nb nbVar2 : list) {
            long a2 = nbVar2.a();
            com.amap.api.col.3sl.nc.a aVar2 = longSparseArray.get(a2);
            if (aVar2 == null) {
                aVar2 = new com.amap.api.col.3sl.nc.a(b2);
                aVar2.a = nbVar2.b();
                aVar2.b = b;
                aVar2.c = true;
            } else if (aVar2.a != nbVar2.b()) {
                aVar2.a = nbVar2.b();
                aVar2.b = b;
                aVar2.c = true;
            }
            longSparseArray2.put(a2, aVar2);
        }
    }

    private static short a(android.util.LongSparseArray<com.amap.api.col.3sl.nc.a> longSparseArray, long j) {
        synchronized (longSparseArray) {
            com.amap.api.col.3sl.nc.a aVar = longSparseArray.get(j);
            if (aVar == null) {
                return (short) 0;
            }
            short max = (short) java.lang.Math.max(1L, java.lang.Math.min(32767L, (b() - aVar.b) / 1000));
            if (!aVar.c) {
                max = (short) (-max);
            }
            return max;
        }
    }

    private static long b() {
        return android.os.SystemClock.elapsedRealtime();
    }

    /* compiled from: RssiInfoManager.java */
    private static class a {
        int a;
        long b;
        boolean c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }
}
