package com.autonavi.base.amap.mapcore.interfaces;

/* loaded from: classes.dex */
public interface IAMapListener {
    void afterAnimation();

    void afterDrawFrame(int i, com.autonavi.base.ae.gmap.GLMapState gLMapState);

    void afterDrawLabel(int i, com.autonavi.base.ae.gmap.GLMapState gLMapState);

    void afterRendererOver(int i, com.autonavi.base.ae.gmap.GLMapState gLMapState);

    void beforeDrawLabel(int i, com.autonavi.base.ae.gmap.GLMapState gLMapState);

    void onMapBlankClick(double d, double d2);

    void onMapPOIClick(com.autonavi.base.ae.gmap.MapPoi mapPoi);
}
