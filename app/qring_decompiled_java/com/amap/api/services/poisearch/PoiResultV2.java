package com.amap.api.services.poisearch;

/* loaded from: classes.dex */
public class PoiResultV2 {
    private int a;
    private java.util.ArrayList<com.amap.api.services.core.PoiItemV2> b;
    private com.amap.api.services.poisearch.PoiSearchV2.Query c;
    private com.amap.api.services.poisearch.PoiSearchV2.SearchBound d;

    public static com.amap.api.services.poisearch.PoiResultV2 createPagedResult(com.amap.api.services.poisearch.PoiSearchV2.Query query, com.amap.api.services.poisearch.PoiSearchV2.SearchBound searchBound, int i, java.util.ArrayList<com.amap.api.services.core.PoiItemV2> arrayList) {
        return new com.amap.api.services.poisearch.PoiResultV2(query, searchBound, i, arrayList);
    }

    private PoiResultV2(com.amap.api.services.poisearch.PoiSearchV2.Query query, com.amap.api.services.poisearch.PoiSearchV2.SearchBound searchBound, int i, java.util.ArrayList<com.amap.api.services.core.PoiItemV2> arrayList) {
        this.b = new java.util.ArrayList<>();
        this.c = query;
        this.d = searchBound;
        this.a = i;
        this.b = arrayList;
    }

    public int getCount() {
        return this.a;
    }

    public com.amap.api.services.poisearch.PoiSearchV2.Query getQuery() {
        return this.c;
    }

    public com.amap.api.services.poisearch.PoiSearchV2.SearchBound getBound() {
        return this.d;
    }

    public java.util.ArrayList<com.amap.api.services.core.PoiItemV2> getPois() {
        return this.b;
    }
}
