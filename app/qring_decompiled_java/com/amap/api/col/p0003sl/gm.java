package com.amap.api.col.p0003sl;

/* compiled from: RequestCacheControl.java */
/* loaded from: classes.dex */
public class gm {
    private static volatile com.amap.api.col.p0003sl.gm a;
    private java.util.HashMap<java.lang.String, com.amap.api.col.p0003sl.gn> b = new java.util.HashMap<>();

    public static com.amap.api.col.p0003sl.gm a() {
        if (a == null) {
            synchronized (com.amap.api.col.p0003sl.gm.class) {
                if (a == null) {
                    a = new com.amap.api.col.p0003sl.gm();
                }
            }
        }
        return a;
    }

    public final synchronized com.amap.api.col.p0003sl.gn a(java.lang.String str) {
        return this.b.get(str);
    }

    public final synchronized void a(java.lang.String str, com.amap.api.col.p0003sl.gn gnVar) {
        this.b.put(str, gnVar);
    }

    public final com.amap.api.col.3sl.gm.c a(com.amap.api.col.3sl.gm.b bVar) {
        com.amap.api.col.3sl.gm.c a2;
        if (bVar == null) {
            return null;
        }
        for (com.amap.api.col.p0003sl.gn gnVar : this.b.values()) {
            if (gnVar != null && (a2 = gnVar.a(bVar)) != null) {
                return a2;
            }
        }
        return null;
    }

    public final void a(com.amap.api.col.3sl.gm.b bVar, java.lang.Object obj) {
        for (com.amap.api.col.p0003sl.gn gnVar : this.b.values()) {
            if (gnVar != null) {
                gnVar.a(bVar, obj);
            }
        }
    }

    public final boolean b(com.amap.api.col.3sl.gm.b bVar) {
        if (bVar == null) {
            return false;
        }
        for (com.amap.api.col.p0003sl.gn gnVar : this.b.values()) {
            if (gnVar != null && gnVar.b(bVar)) {
                return true;
            }
        }
        return false;
    }

    public final void a(com.amap.api.col.3sl.gm.a aVar) {
        if (aVar == null) {
            return;
        }
        for (com.amap.api.col.p0003sl.gn gnVar : this.b.values()) {
            if (gnVar != null) {
                gnVar.a(aVar);
            }
        }
    }

    public final void a(java.lang.String str, com.amap.api.col.3sl.gm.a aVar) {
        com.amap.api.col.p0003sl.gn gnVar;
        if (str == null || aVar == null || (gnVar = this.b.get(str)) == null) {
            return;
        }
        gnVar.a(aVar);
    }

    /* compiled from: RequestCacheControl.java */
    static class c {
        java.lang.Object a;
        boolean b;

        public c(java.lang.Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }
    }

    /* compiled from: RequestCacheControl.java */
    static class b {
        java.lang.String a;
        java.lang.Object b;

        b() {
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                com.amap.api.col.3sl.gm.b bVar = (com.amap.api.col.3sl.gm.b) obj;
                java.lang.String str = this.a;
                if (str == null) {
                    return bVar.a == null && this.b == bVar.b;
                }
                if (str.equals(bVar.a) && this.b == bVar.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            java.lang.Object obj = this.b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* compiled from: RequestCacheControl.java */
    static class a {
        private boolean a = true;
        private long b = 86400;
        private int c = 10;
        private double d = 0.0d;

        a() {
        }

        public final boolean a() {
            return this.a;
        }

        public final void a(boolean z) {
            this.a = z;
        }

        public final long b() {
            return this.b;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final int c() {
            return this.c;
        }

        public final void a(int i) {
            this.c = i;
        }

        public final double d() {
            return this.d;
        }

        public final void a(double d) {
            this.d = d;
        }
    }
}
