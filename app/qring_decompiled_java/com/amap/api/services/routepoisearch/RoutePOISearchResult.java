package com.amap.api.services.routepoisearch;

/* loaded from: classes.dex */
public class RoutePOISearchResult {
    private java.util.List<com.amap.api.services.routepoisearch.RoutePOIItem> a;
    private com.amap.api.services.routepoisearch.RoutePOISearchQuery b;

    public RoutePOISearchResult(java.util.ArrayList<com.amap.api.services.routepoisearch.RoutePOIItem> arrayList, com.amap.api.services.routepoisearch.RoutePOISearchQuery routePOISearchQuery) {
        this.a = new java.util.ArrayList();
        this.a = arrayList;
        this.b = routePOISearchQuery;
    }

    public java.util.List<com.amap.api.services.routepoisearch.RoutePOIItem> getRoutePois() {
        return this.a;
    }

    public com.amap.api.services.routepoisearch.RoutePOISearchQuery getQuery() {
        return this.b;
    }
}
