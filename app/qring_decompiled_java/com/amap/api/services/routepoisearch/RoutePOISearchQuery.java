package com.amap.api.services.routepoisearch;

/* loaded from: classes.dex */
public class RoutePOISearchQuery implements java.lang.Cloneable {
    private com.amap.api.services.core.LatLonPoint a;
    private com.amap.api.services.core.LatLonPoint b;
    private int c;
    private com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType d;
    private int e;
    private java.util.List<com.amap.api.services.core.LatLonPoint> f;
    private java.lang.String g;

    public RoutePOISearchQuery(com.amap.api.services.core.LatLonPoint latLonPoint, com.amap.api.services.core.LatLonPoint latLonPoint2, int i, com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType routePOISearchType, int i2) {
        this.e = 250;
        this.a = latLonPoint;
        this.b = latLonPoint2;
        this.c = i;
        this.d = routePOISearchType;
        this.e = i2;
    }

    public RoutePOISearchQuery(java.util.List<com.amap.api.services.core.LatLonPoint> list, com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType routePOISearchType, int i) {
        this.e = 250;
        this.f = list;
        this.d = routePOISearchType;
        this.e = i;
    }

    public com.amap.api.services.core.LatLonPoint getFrom() {
        return this.a;
    }

    public com.amap.api.services.core.LatLonPoint getTo() {
        return this.b;
    }

    public int getMode() {
        return this.c;
    }

    public com.amap.api.services.routepoisearch.RoutePOISearch.RoutePOISearchType getSearchType() {
        return this.d;
    }

    public int getRange() {
        return this.e;
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolylines() {
        return this.f;
    }

    public void setChannel(java.lang.String str) {
        this.g = str;
    }

    public java.lang.String getChannel() {
        return this.g;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.amap.api.services.routepoisearch.RoutePOISearchQuery m219clone() {
        try {
            super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            com.amap.api.col.p0003sl.fn.a(e, "RoutePOISearchQuery", "RoutePOISearchQueryclone");
        }
        java.util.List<com.amap.api.services.core.LatLonPoint> list = this.f;
        if (list != null && list.size() > 0) {
            com.amap.api.services.routepoisearch.RoutePOISearchQuery routePOISearchQuery = new com.amap.api.services.routepoisearch.RoutePOISearchQuery(this.f, this.d, this.e);
            routePOISearchQuery.setChannel(this.g);
            return routePOISearchQuery;
        }
        com.amap.api.services.routepoisearch.RoutePOISearchQuery routePOISearchQuery2 = new com.amap.api.services.routepoisearch.RoutePOISearchQuery(this.a, this.b, this.c, this.d, this.e);
        routePOISearchQuery2.setChannel(this.g);
        return routePOISearchQuery2;
    }
}
