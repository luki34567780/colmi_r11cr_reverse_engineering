package com.amap.api.col.p0003sl;

/* compiled from: RequestCacheWorkerCheckDistance.java */
/* loaded from: classes.dex */
final class go extends com.amap.api.col.p0003sl.gn {
    private double a;

    public go(java.lang.String... strArr) {
        super(strArr);
        this.a = 0.0d;
        this.a = 0.0d;
    }

    @Override // com.amap.api.col.p0003sl.gn
    protected final boolean a(java.util.LinkedHashMap<com.amap.api.col.3sl.gm.b, java.lang.Object> linkedHashMap, com.amap.api.col.3sl.gm.b bVar) {
        if (linkedHashMap != null && bVar != null) {
            if (bVar.b == null) {
                return super.a(linkedHashMap, bVar);
            }
            for (com.amap.api.col.3sl.gm.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && bVar2.a != null && bVar2.a.equals(bVar.a) && (bVar2.b instanceof com.amap.api.col.3sl.go.a) && ((com.amap.api.col.3sl.go.a) bVar2.b).a(bVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amap.api.col.p0003sl.gn
    protected final java.lang.Object b(java.util.LinkedHashMap<com.amap.api.col.3sl.gm.b, java.lang.Object> linkedHashMap, com.amap.api.col.3sl.gm.b bVar) {
        if (linkedHashMap != null && bVar != null) {
            if (bVar.b == null) {
                return super.b(linkedHashMap, bVar);
            }
            for (com.amap.api.col.3sl.gm.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && bVar2.a != null && bVar2.a.equals(bVar.a) && (bVar2.b instanceof com.amap.api.col.3sl.go.a) && ((com.amap.api.col.3sl.go.a) bVar2.b).a(bVar.b)) {
                    return linkedHashMap.get(bVar2);
                }
            }
        }
        return null;
    }

    @Override // com.amap.api.col.p0003sl.gn
    protected final java.lang.Object c(java.util.LinkedHashMap<com.amap.api.col.3sl.gm.b, java.lang.Object> linkedHashMap, com.amap.api.col.3sl.gm.b bVar) {
        com.amap.api.col.3sl.gm.b bVar2;
        if (linkedHashMap != null && bVar != null) {
            if (bVar.b == null) {
                return super.c(linkedHashMap, bVar);
            }
            java.util.Iterator<com.amap.api.col.3sl.gm.b> it = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar2 = null;
                    break;
                }
                bVar2 = it.next();
                if (bVar2 != null && bVar2.a != null && bVar2.a.equals(bVar.a) && (bVar2.b instanceof com.amap.api.col.3sl.go.a) && ((com.amap.api.col.3sl.go.a) bVar2.b).a(bVar.b)) {
                    break;
                }
            }
            if (bVar2 != null) {
                return linkedHashMap.remove(bVar2);
            }
        }
        return null;
    }

    public final double a() {
        return this.a;
    }

    @Override // com.amap.api.col.p0003sl.gn
    public final void a(com.amap.api.col.3sl.gm.a aVar) {
        super.a(aVar);
        if (aVar != null) {
            this.a = aVar.d();
        }
    }

    /* compiled from: RequestCacheWorkerCheckDistance.java */
    static class a {
        com.amap.api.services.core.LatLonPoint a;
        double b;

        public a(double d, double d2, double d3) {
            this.a = null;
            this.b = 0.0d;
            this.a = new com.amap.api.services.core.LatLonPoint(d, d2);
            this.b = d3;
        }

        public final boolean a(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                com.amap.api.services.core.LatLonPoint latLonPoint = this.a;
                com.amap.api.col.3sl.go.a aVar = (com.amap.api.col.3sl.go.a) obj;
                if (latLonPoint == aVar.a) {
                    return true;
                }
                if (latLonPoint != null && com.amap.api.col.p0003sl.fn.a(latLonPoint, r3) <= aVar.b) {
                    return true;
                }
            }
            return false;
        }
    }
}
