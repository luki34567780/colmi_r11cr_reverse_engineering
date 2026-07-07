package com.amap.api.col.p0003sl;

/* compiled from: RssiManager.java */
/* loaded from: classes.dex */
public final class nd {
    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | ((i & 4294967295L) << 32);
    }

    public static synchronized void a(java.util.List<com.amap.api.col.p0003sl.nh> list) {
        synchronized (com.amap.api.col.p0003sl.nd.class) {
            if (list != null) {
                if (!list.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                    for (com.amap.api.col.p0003sl.nh nhVar : list) {
                        if (nhVar instanceof com.amap.api.col.p0003sl.nj) {
                            com.amap.api.col.p0003sl.nj njVar = (com.amap.api.col.p0003sl.nj) nhVar;
                            arrayList.add(new com.amap.api.col.3sl.nd.a(njVar.j, njVar.k, njVar.c));
                        } else if (nhVar instanceof com.amap.api.col.p0003sl.nk) {
                            com.amap.api.col.p0003sl.nk nkVar = (com.amap.api.col.p0003sl.nk) nhVar;
                            arrayList.add(new com.amap.api.col.3sl.nd.a(nkVar.j, nkVar.k, nkVar.c));
                        } else if (nhVar instanceof com.amap.api.col.p0003sl.nl) {
                            com.amap.api.col.p0003sl.nl nlVar = (com.amap.api.col.p0003sl.nl) nhVar;
                            arrayList.add(new com.amap.api.col.3sl.nd.a(nlVar.j, nlVar.k, nlVar.c));
                        } else if (nhVar instanceof com.amap.api.col.p0003sl.ni) {
                            com.amap.api.col.p0003sl.ni niVar = (com.amap.api.col.p0003sl.ni) nhVar;
                            arrayList.add(new com.amap.api.col.3sl.nd.a(niVar.k, niVar.l, niVar.c));
                        }
                    }
                    com.amap.api.col.p0003sl.nc.a().a(arrayList);
                }
            }
        }
    }

    public static synchronized void b(java.util.List<com.amap.api.col.p0003sl.no> list) {
        synchronized (com.amap.api.col.p0003sl.nd.class) {
            if (list != null) {
                if (!list.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                    for (com.amap.api.col.p0003sl.no noVar : list) {
                        arrayList.add(new com.amap.api.col.3sl.nd.b(noVar.a, noVar.c));
                    }
                    com.amap.api.col.p0003sl.nc.a().b(arrayList);
                }
            }
        }
    }

    public static synchronized short a(long j) {
        short a2;
        synchronized (com.amap.api.col.p0003sl.nd.class) {
            a2 = com.amap.api.col.p0003sl.nc.a().a(j);
        }
        return a2;
    }

    public static synchronized short b(long j) {
        short b2;
        synchronized (com.amap.api.col.p0003sl.nd.class) {
            b2 = com.amap.api.col.p0003sl.nc.a().b(j);
        }
        return b2;
    }

    /* compiled from: RssiManager.java */
    public static class a implements com.amap.api.col.p0003sl.nb {
        private int a;
        private int b;
        private int c;

        a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // com.amap.api.col.p0003sl.nb
        public final long a() {
            return com.amap.api.col.p0003sl.nd.a(this.a, this.b);
        }

        @Override // com.amap.api.col.p0003sl.nb
        public final int b() {
            return this.c;
        }
    }

    /* compiled from: RssiManager.java */
    public static class b implements com.amap.api.col.p0003sl.nb {
        private long a;
        private int b;

        b(long j, int i) {
            this.a = j;
            this.b = i;
        }

        @Override // com.amap.api.col.p0003sl.nb
        public final long a() {
            return this.a;
        }

        @Override // com.amap.api.col.p0003sl.nb
        public final int b() {
            return this.b;
        }
    }
}
