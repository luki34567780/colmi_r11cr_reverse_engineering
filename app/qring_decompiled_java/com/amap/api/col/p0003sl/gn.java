package com.amap.api.col.p0003sl;

/* compiled from: RequestCacheWorker.java */
/* loaded from: classes.dex */
class gn {
    private boolean a = true;
    private long b = 86400;
    private int c = 10;
    private long d = 0;
    private final java.util.LinkedHashMap<com.amap.api.col.3sl.gm.b, java.lang.Object> e = new java.util.LinkedHashMap<>();
    private final java.lang.Object f = new java.lang.Object();
    private final java.util.LinkedHashMap<com.amap.api.col.3sl.gm.b, java.lang.Object> g = new java.util.LinkedHashMap<>();
    private final java.lang.Object h = new java.lang.Object();
    private java.util.ArrayList<java.lang.String> i = new java.util.ArrayList<>();

    public gn(java.lang.String... strArr) {
        a(strArr);
    }

    private void a(java.lang.String... strArr) {
        this.d = java.lang.System.currentTimeMillis();
        this.e.clear();
        this.i.clear();
        for (java.lang.String str : strArr) {
            if (str != null) {
                this.i.add(str);
            }
        }
    }

    protected boolean a(java.util.LinkedHashMap<com.amap.api.col.3sl.gm.b, java.lang.Object> linkedHashMap, com.amap.api.col.3sl.gm.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return false;
        }
        return linkedHashMap.containsKey(bVar);
    }

    protected java.lang.Object b(java.util.LinkedHashMap<com.amap.api.col.3sl.gm.b, java.lang.Object> linkedHashMap, com.amap.api.col.3sl.gm.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        return linkedHashMap.get(bVar);
    }

    protected java.lang.Object c(java.util.LinkedHashMap<com.amap.api.col.3sl.gm.b, java.lang.Object> linkedHashMap, com.amap.api.col.3sl.gm.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        return linkedHashMap.remove(bVar);
    }

    public final com.amap.api.col.3sl.gm.c a(com.amap.api.col.3sl.gm.b bVar) {
        if (!this.a || bVar == null || !b(bVar)) {
            return null;
        }
        b();
        synchronized (this.f) {
            if (a(this.e, bVar)) {
                return new com.amap.api.col.3sl.gm.c(b(this.e, bVar), true);
            }
            synchronized (this.h) {
                if (a(this.g, bVar)) {
                    while (!a(this.e, bVar) && a(this.g, bVar)) {
                        try {
                            this.h.wait(1000L);
                        } catch (java.lang.InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    this.g.put(bVar, null);
                }
            }
            return new com.amap.api.col.3sl.gm.c(b(this.e, bVar), false);
        }
    }

    public final void a(com.amap.api.col.3sl.gm.b bVar, java.lang.Object obj) {
        if (this.a && bVar != null && b(bVar)) {
            b(bVar, obj);
            synchronized (this.h) {
                c(this.g, bVar);
                this.h.notify();
            }
        }
    }

    private void b(com.amap.api.col.3sl.gm.b bVar, java.lang.Object obj) {
        synchronized (this.f) {
            a();
            b();
            this.e.put(bVar, obj);
        }
    }

    private void a() {
        int size = this.e.size();
        if (size <= 0 || size < this.c) {
            return;
        }
        com.amap.api.col.3sl.gm.b bVar = null;
        java.util.Iterator<com.amap.api.col.3sl.gm.b> it = this.e.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.amap.api.col.3sl.gm.b next = it.next();
            if (next != null) {
                bVar = next;
                break;
            }
        }
        c(this.e, bVar);
    }

    private void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if ((currentTimeMillis - this.d) / 1000 > this.b) {
            this.e.clear();
            this.d = currentTimeMillis;
        }
    }

    public final boolean b(com.amap.api.col.3sl.gm.b bVar) {
        if (bVar != null && bVar.a != null) {
            java.util.Iterator<java.lang.String> it = this.i.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next != null && bVar.a.contains(next)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(com.amap.api.col.3sl.gm.a aVar) {
        if (aVar != null) {
            this.a = aVar.a();
            this.b = aVar.b();
            this.c = aVar.c();
        }
    }
}
