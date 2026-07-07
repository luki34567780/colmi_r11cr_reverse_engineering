package com.amap.api.col.p0003sl;

/* compiled from: RequestConfig.java */
/* loaded from: classes.dex */
public class gp {
    private static volatile com.amap.api.col.p0003sl.gp r;
    boolean a = true;
    boolean b = true;
    boolean c = true;
    boolean d = true;
    boolean e = true;
    boolean f = true;
    boolean g = true;
    int h = 25;
    int i = 100;
    int j = 100;
    int k = 100;
    int l = 6;
    int m = 100;
    int n = 5000;
    int o = com.amap.api.services.core.AMapException.CODE_AMAP_SERVICE_INVALID_PARAMS;
    int p = 100000000;
    int q = 16;

    public static com.amap.api.col.p0003sl.gp a() {
        if (r == null) {
            synchronized (com.amap.api.col.p0003sl.gp.class) {
                if (r == null) {
                    r = new com.amap.api.col.p0003sl.gp();
                }
            }
        }
        return r;
    }

    public final void a(boolean z) {
        this.a = z;
    }

    public final void b(boolean z) {
        this.c = z;
    }

    public final void c(boolean z) {
        this.d = z;
    }

    public final void d(boolean z) {
        this.e = z;
    }

    public final void e(boolean z) {
        this.f = z;
    }

    public final void f(boolean z) {
        this.g = z;
    }

    public final void g(boolean z) {
        this.b = z;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void c(int i) {
        this.j = i;
    }

    public final void d(int i) {
        this.k = i;
    }

    public final void e(int i) {
        this.l = i;
    }

    public final void f(int i) {
        this.m = i;
    }

    public final void g(int i) {
        this.n = i;
    }

    public final void h(int i) {
        this.o = i;
    }

    public final void i(int i) {
        this.p = i;
    }

    public final void j(int i) {
        this.q = i;
    }

    public final void a(com.amap.api.services.route.RouteSearch.FromAndTo fromAndTo, java.util.List<com.amap.api.services.core.LatLonPoint> list) throws com.amap.api.services.core.AMapException {
        double a;
        if (!this.c || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        double d = 0.0d;
        if (list != null && list.size() != 0) {
            com.amap.api.services.core.LatLonPoint from = fromAndTo.getFrom();
            com.amap.api.services.core.LatLonPoint to = fromAndTo.getTo();
            java.util.Iterator<com.amap.api.services.core.LatLonPoint> it = list.iterator();
            while (it.hasNext()) {
                d += com.amap.api.col.p0003sl.fn.a(from, r3);
                from = it.next();
            }
            a = d + com.amap.api.col.p0003sl.fn.a(from, to);
        } else {
            a = com.amap.api.col.p0003sl.fn.a(fromAndTo.getFrom(), fromAndTo.getTo());
        }
        if (this.n < a / 1000.0d) {
            throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final int k(int i) {
        int i2;
        return (this.d && (i2 = this.m) < i) ? i2 : i;
    }

    public final int l(int i) {
        int i2;
        return (this.d && (i2 = this.h) < i) ? i2 : i;
    }

    public final void a(com.amap.api.services.route.RouteSearch.FromAndTo fromAndTo) throws com.amap.api.services.core.AMapException {
        if (!this.e || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        if (this.o < com.amap.api.col.p0003sl.fn.a(fromAndTo.getFrom(), fromAndTo.getTo()) / 1000.0d) {
            throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final void a(com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo) throws com.amap.api.services.core.AMapException {
        if (!this.e || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        if (this.o < com.amap.api.col.p0003sl.fn.a(fromAndTo.getFrom(), fromAndTo.getTo()) / 1000.0d) {
            throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final void b(com.amap.api.services.route.RouteSearch.FromAndTo fromAndTo) throws com.amap.api.services.core.AMapException {
        if (!this.f || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        if (this.k < com.amap.api.col.p0003sl.fn.a(fromAndTo.getFrom(), fromAndTo.getTo()) / 1000.0d) {
            throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final void b(com.amap.api.services.route.RouteSearchV2.FromAndTo fromAndTo) throws com.amap.api.services.core.AMapException {
        if (!this.f || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        if (this.k < com.amap.api.col.p0003sl.fn.a(fromAndTo.getFrom(), fromAndTo.getTo()) / 1000.0d) {
            throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final void a(java.util.List<com.amap.api.services.core.LatLonPoint> list) throws com.amap.api.services.core.AMapException {
        if (this.g && list != null) {
            if (this.l < list.size()) {
                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_OVER_PASSBY_MAX_COUNT_EXCEPTION);
            }
        }
    }

    public static void b(java.util.List<com.amap.api.services.core.LatLonPoint> list) throws com.amap.api.services.core.AMapException {
        if (list != null && 16 < list.size()) {
            throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_OVER_PASSBY_MAX_COUNT_EXCEPTION);
        }
    }

    public final void c(java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> list) throws com.amap.api.services.core.AMapException {
        if (this.a && list != null) {
            if (this.j < list.size()) {
                throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_OVER_PASSAREA_MAX_COUNT_EXCEPTION);
            }
            for (java.util.List<com.amap.api.services.core.LatLonPoint> list2 : list) {
                double b = com.amap.api.col.p0003sl.fn.b(list2);
                if (this.q < list2.size()) {
                    throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_OVER_PASSAREA_ITEM_POINT_COUNT_EXCEPTION);
                }
                if (this.p < b) {
                    throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_OVER_PASSAREA_MAX_AREA_EXCEPTION);
                }
            }
        }
    }

    public final void a(java.lang.String str) throws com.amap.api.services.core.AMapException {
        if (str != null && this.b && str.length() > this.i) {
            throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_OVER_KEYWORD_LEN_MAX_COUNT_EXCEPTION);
        }
    }
}
