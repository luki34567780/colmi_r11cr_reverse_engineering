package com.amap.api.col.p0003sl;

/* compiled from: CellCollector.java */
/* loaded from: classes.dex */
public final class mh {
    private com.amap.api.col.p0003sl.nh a;
    private com.amap.api.col.p0003sl.nh b;
    private com.amap.api.col.p0003sl.nn c;
    private com.amap.api.col.3sl.mh.a d = new com.amap.api.col.3sl.mh.a();
    private final java.util.List<com.amap.api.col.p0003sl.nh> e = new java.util.ArrayList(3);

    final com.amap.api.col.3sl.mh.a a(com.amap.api.col.p0003sl.nn nnVar, boolean z, byte b, java.lang.String str, java.util.List<com.amap.api.col.p0003sl.nh> list) {
        if (z) {
            this.d.a();
            return null;
        }
        this.d.a(b, str, list);
        if (this.d.c == null) {
            return null;
        }
        if (!(this.c == null || a(nnVar) || !com.amap.api.col.3sl.mh.a.a(this.d.d, this.a) || !com.amap.api.col.3sl.mh.a.a(this.d.e, this.b))) {
            return null;
        }
        this.a = this.d.d;
        this.b = this.d.e;
        this.c = nnVar;
        com.amap.api.col.p0003sl.nd.a(this.d.f);
        a(this.d);
        return this.d;
    }

    private boolean a(com.amap.api.col.p0003sl.nn nnVar) {
        return nnVar.a(this.c) > ((double) ((nnVar.g > 10.0f ? 1 : (nnVar.g == 10.0f ? 0 : -1)) > 0 ? 2000.0f : (nnVar.g > 2.0f ? 1 : (nnVar.g == 2.0f ? 0 : -1)) > 0 ? 500.0f : 100.0f));
    }

    private void a(com.amap.api.col.3sl.mh.a aVar) {
        synchronized (this.e) {
            for (com.amap.api.col.p0003sl.nh nhVar : aVar.f) {
                if (nhVar != null && nhVar.h) {
                    com.amap.api.col.p0003sl.nh clone = nhVar.clone();
                    clone.e = android.os.SystemClock.elapsedRealtime();
                    a(clone);
                }
            }
            this.d.g.clear();
            this.d.g.addAll(this.e);
        }
    }

    private void a(com.amap.api.col.p0003sl.nh nhVar) {
        if (nhVar == null) {
            return;
        }
        int size = this.e.size();
        if (size == 0) {
            this.e.add(nhVar);
            return;
        }
        long j = Long.MAX_VALUE;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (i >= size) {
                i2 = i3;
                break;
            }
            com.amap.api.col.p0003sl.nh nhVar2 = this.e.get(i);
            if (nhVar.equals(nhVar2)) {
                if (nhVar.c != nhVar2.c) {
                    nhVar2.e = nhVar.c;
                    nhVar2.c = nhVar.c;
                }
            } else {
                j = java.lang.Math.min(j, nhVar2.e);
                if (j == nhVar2.e) {
                    i3 = i;
                }
                i++;
            }
        }
        if (i2 >= 0) {
            if (size < 3) {
                this.e.add(nhVar);
            } else {
                if (nhVar.e <= j || i2 >= size) {
                    return;
                }
                this.e.remove(i2);
                this.e.add(nhVar);
            }
        }
    }

    /* compiled from: CellCollector.java */
    public static class a {
        public byte a;
        public java.lang.String b;
        public com.amap.api.col.p0003sl.nh c;
        public com.amap.api.col.p0003sl.nh d;
        public com.amap.api.col.p0003sl.nh e;
        public java.util.List<com.amap.api.col.p0003sl.nh> f = new java.util.ArrayList();
        public java.util.List<com.amap.api.col.p0003sl.nh> g = new java.util.ArrayList();

        public final void a() {
            this.a = (byte) 0;
            this.b = "";
            this.c = null;
            this.d = null;
            this.e = null;
            this.f.clear();
            this.g.clear();
        }

        public final void a(byte b, java.lang.String str, java.util.List<com.amap.api.col.p0003sl.nh> list) {
            a();
            this.a = b;
            this.b = str;
            if (list != null) {
                this.f.addAll(list);
                for (com.amap.api.col.p0003sl.nh nhVar : this.f) {
                    if (!nhVar.i && nhVar.h) {
                        this.d = nhVar;
                    } else if (nhVar.i && nhVar.h) {
                        this.e = nhVar;
                    }
                }
            }
            com.amap.api.col.p0003sl.nh nhVar2 = this.d;
            if (nhVar2 == null) {
                nhVar2 = this.e;
            }
            this.c = nhVar2;
        }

        public static boolean a(com.amap.api.col.p0003sl.nh nhVar, com.amap.api.col.p0003sl.nh nhVar2) {
            if (nhVar == null || nhVar2 == null) {
                return (nhVar == null) == (nhVar2 == null);
            }
            if ((nhVar instanceof com.amap.api.col.p0003sl.nj) && (nhVar2 instanceof com.amap.api.col.p0003sl.nj)) {
                com.amap.api.col.p0003sl.nj njVar = (com.amap.api.col.p0003sl.nj) nhVar;
                com.amap.api.col.p0003sl.nj njVar2 = (com.amap.api.col.p0003sl.nj) nhVar2;
                return njVar.j == njVar2.j && njVar.k == njVar2.k;
            }
            if ((nhVar instanceof com.amap.api.col.p0003sl.ni) && (nhVar2 instanceof com.amap.api.col.p0003sl.ni)) {
                com.amap.api.col.p0003sl.ni niVar = (com.amap.api.col.p0003sl.ni) nhVar;
                com.amap.api.col.p0003sl.ni niVar2 = (com.amap.api.col.p0003sl.ni) nhVar2;
                return niVar.l == niVar2.l && niVar.k == niVar2.k && niVar.j == niVar2.j;
            }
            if ((nhVar instanceof com.amap.api.col.p0003sl.nk) && (nhVar2 instanceof com.amap.api.col.p0003sl.nk)) {
                com.amap.api.col.p0003sl.nk nkVar = (com.amap.api.col.p0003sl.nk) nhVar;
                com.amap.api.col.p0003sl.nk nkVar2 = (com.amap.api.col.p0003sl.nk) nhVar2;
                return nkVar.j == nkVar2.j && nkVar.k == nkVar2.k;
            }
            if ((nhVar instanceof com.amap.api.col.p0003sl.nl) && (nhVar2 instanceof com.amap.api.col.p0003sl.nl)) {
                com.amap.api.col.p0003sl.nl nlVar = (com.amap.api.col.p0003sl.nl) nhVar;
                com.amap.api.col.p0003sl.nl nlVar2 = (com.amap.api.col.p0003sl.nl) nhVar2;
                if (nlVar.j == nlVar2.j && nlVar.k == nlVar2.k) {
                    return true;
                }
            }
            return false;
        }

        public final java.lang.String toString() {
            return "CellInfo{radio=" + ((int) this.a) + ", operator='" + this.b + "', mainCell=" + this.c + ", mainOldInterCell=" + this.d + ", mainNewInterCell=" + this.e + ", cells=" + this.f + ", historyMainCellList=" + this.g + '}';
        }
    }
}
