package com.autonavi.base.amap.mapcore;

/* loaded from: classes.dex */
public interface IAMapEngineCallback {
    void OnIndoorBuildingActivity(int i, byte[] bArr);

    void cancelRequireMapData(java.lang.Object obj);

    int generateRequestId();

    com.amap.api.maps.model.BitmapDescriptor getDefaultTerrainImage();

    java.util.List<com.amap.api.maps.model.BitmapDescriptor> getSkyBoxImages();

    com.autonavi.base.ae.gmap.bean.InitStorageParam getStorageInitParam();

    com.autonavi.base.ae.gmap.bean.TileProviderInner getTerrainTileProvider();

    void onAMapAppResourceRequest(com.autonavi.base.ae.gmap.AMapAppRequestParam aMapAppRequestParam);

    void onMapBlandClick(double d, double d2);

    void onMapPOIClick(com.autonavi.base.ae.gmap.MapPoi mapPoi);

    void onMapRender(int i, int i2);

    void reloadMapResource(int i, java.lang.String str, int i2);

    byte[] requireCharBitmap(int i, int i2, int i3);

    byte[] requireCharsWidths(int i, int[] iArr, int i2, int i3);

    int requireMapDataAsyn(int i, byte[] bArr);

    void requireMapRender(int i, int i2, int i3);

    byte[] requireMapResource(int i, java.lang.String str);
}
