package com.amap.api.services.interfaces;

/* loaded from: classes.dex */
public interface IPoiSearchV2 {
    com.amap.api.services.poisearch.PoiSearchV2.SearchBound getBound();

    java.lang.String getLanguage();

    com.amap.api.services.poisearch.PoiSearchV2.Query getQuery();

    com.amap.api.services.poisearch.PoiResultV2 searchPOI() throws com.amap.api.services.core.AMapException;

    void searchPOIAsyn();

    com.amap.api.services.core.PoiItemV2 searchPOIId(java.lang.String str) throws com.amap.api.services.core.AMapException;

    void searchPOIIdAsyn(java.lang.String str);

    void setBound(com.amap.api.services.poisearch.PoiSearchV2.SearchBound searchBound);

    void setLanguage(java.lang.String str);

    void setOnPoiSearchListener(com.amap.api.services.poisearch.PoiSearchV2.OnPoiSearchListener onPoiSearchListener);

    void setQuery(com.amap.api.services.poisearch.PoiSearchV2.Query query);
}
