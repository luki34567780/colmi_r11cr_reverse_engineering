package com.amap.api.maps.model;

/* compiled from: PointQuadTree.java */
/* loaded from: classes.dex */
final class a {
    private final com.amap.api.col.p0003sl.dg a;
    private final int b;
    private java.util.List<com.amap.api.maps.model.WeightedLatLng> c;
    private java.util.List<com.amap.api.maps.model.a> d;

    protected a(com.amap.api.col.p0003sl.dg dgVar) {
        this(dgVar, 0);
    }

    private a(double d, double d2, double d3, double d4, int i) {
        this(new com.amap.api.col.p0003sl.dg(d, d2, d3, d4), i);
    }

    private a(com.amap.api.col.p0003sl.dg dgVar, int i) {
        this.d = null;
        this.a = dgVar;
        this.b = i;
    }

    protected final void a(com.amap.api.maps.model.WeightedLatLng weightedLatLng) {
        com.autonavi.amap.mapcore.DPoint point = weightedLatLng.getPoint();
        if (this.a.a(point.x, point.y)) {
            a(point.x, point.y, weightedLatLng);
        }
    }

    private void a(double d, double d2, com.amap.api.maps.model.WeightedLatLng weightedLatLng) {
        if (this.d == null) {
            if (this.c == null) {
                this.c = new java.util.ArrayList();
            }
            this.c.add(weightedLatLng);
            if (this.c.size() <= 50 || this.b >= 40) {
                return;
            }
            a();
            return;
        }
        if (d2 < this.a.f) {
            if (d < this.a.e) {
                this.d.get(0).a(d, d2, weightedLatLng);
                return;
            } else {
                this.d.get(1).a(d, d2, weightedLatLng);
                return;
            }
        }
        if (d < this.a.e) {
            this.d.get(2).a(d, d2, weightedLatLng);
        } else {
            this.d.get(3).a(d, d2, weightedLatLng);
        }
    }

    private void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        this.d = arrayList;
        arrayList.add(new com.amap.api.maps.model.a(this.a.a, this.a.e, this.a.b, this.a.f, this.b + 1));
        this.d.add(new com.amap.api.maps.model.a(this.a.e, this.a.c, this.a.b, this.a.f, this.b + 1));
        this.d.add(new com.amap.api.maps.model.a(this.a.a, this.a.e, this.a.f, this.a.d, this.b + 1));
        this.d.add(new com.amap.api.maps.model.a(this.a.e, this.a.c, this.a.f, this.a.d, this.b + 1));
        java.util.List<com.amap.api.maps.model.WeightedLatLng> list = this.c;
        this.c = null;
        for (com.amap.api.maps.model.WeightedLatLng weightedLatLng : list) {
            a(weightedLatLng.getPoint().x, weightedLatLng.getPoint().y, weightedLatLng);
        }
    }

    protected final java.util.Collection<com.amap.api.maps.model.WeightedLatLng> a(com.amap.api.col.p0003sl.dg dgVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(dgVar, arrayList);
        return arrayList;
    }

    private void a(com.amap.api.col.p0003sl.dg dgVar, java.util.Collection<com.amap.api.maps.model.WeightedLatLng> collection) {
        if (this.a.a(dgVar)) {
            java.util.List<com.amap.api.maps.model.a> list = this.d;
            if (list != null) {
                java.util.Iterator<com.amap.api.maps.model.a> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(dgVar, collection);
                }
            } else if (this.c != null) {
                if (dgVar.b(this.a)) {
                    collection.addAll(this.c);
                    return;
                }
                for (com.amap.api.maps.model.WeightedLatLng weightedLatLng : this.c) {
                    if (dgVar.a(weightedLatLng.getPoint())) {
                        collection.add(weightedLatLng);
                    }
                }
            }
        }
    }
}
