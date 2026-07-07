package com.amap.api.services.cloud;

/* loaded from: classes.dex */
public final class CloudResult {
    private int a;
    private java.util.ArrayList<com.amap.api.services.cloud.CloudItem> b;
    private int c;
    private int d;
    private com.amap.api.services.cloud.CloudSearch.Query e;
    private com.amap.api.services.cloud.CloudSearch.SearchBound f;

    public static com.amap.api.services.cloud.CloudResult createPagedResult(com.amap.api.services.cloud.CloudSearch.Query query, int i, com.amap.api.services.cloud.CloudSearch.SearchBound searchBound, int i2, java.util.ArrayList<com.amap.api.services.cloud.CloudItem> arrayList) {
        return new com.amap.api.services.cloud.CloudResult(query, i, searchBound, i2, arrayList);
    }

    private CloudResult(com.amap.api.services.cloud.CloudSearch.Query query, int i, com.amap.api.services.cloud.CloudSearch.SearchBound searchBound, int i2, java.util.ArrayList<com.amap.api.services.cloud.CloudItem> arrayList) {
        this.e = query;
        this.c = i;
        this.d = i2;
        this.a = a(i);
        this.b = arrayList;
        this.f = searchBound;
    }

    public final int getPageCount() {
        return this.a;
    }

    public final com.amap.api.services.cloud.CloudSearch.Query getQuery() {
        return this.e;
    }

    public final com.amap.api.services.cloud.CloudSearch.SearchBound getBound() {
        return this.f;
    }

    public final java.util.ArrayList<com.amap.api.services.cloud.CloudItem> getClouds() {
        return this.b;
    }

    public final int getTotalCount() {
        return this.c;
    }

    private int a(int i) {
        return ((i + r0) - 1) / this.d;
    }
}
