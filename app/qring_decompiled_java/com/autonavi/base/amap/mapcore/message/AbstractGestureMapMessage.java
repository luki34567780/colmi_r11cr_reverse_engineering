package com.autonavi.base.amap.mapcore.message;

/* loaded from: classes.dex */
public abstract class AbstractGestureMapMessage extends com.autonavi.base.ae.gmap.AbstractMapMessage {
    public int anchorX;
    public int anchorY;
    private int state;
    public int width = 0;
    public int height = 0;
    public boolean isGestureScaleByMapCenter = false;
    public boolean isUseAnchor = false;

    @Override // com.autonavi.base.ae.gmap.AbstractMapMessage
    public abstract int getType();

    public abstract void runCameraUpdate(com.autonavi.base.ae.gmap.GLMapState gLMapState);

    public AbstractGestureMapMessage(int i) {
        this.state = 0;
        this.state = i;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void reset() {
        this.width = 0;
        this.height = 0;
        this.state = 0;
        this.isGestureScaleByMapCenter = false;
        this.isUseAnchor = false;
        this.anchorX = 0;
        this.anchorY = 0;
    }

    protected void win2geo(com.autonavi.base.ae.gmap.GLMapState gLMapState, int i, int i2, com.autonavi.amap.mapcore.IPoint iPoint) {
        gLMapState.screenToP20Point(i, i2, iPoint);
    }

    protected com.autonavi.amap.mapcore.IPoint getAnchorGeoPoint(com.autonavi.base.ae.gmap.GLMapState gLMapState, int i, int i2) {
        com.autonavi.amap.mapcore.IPoint obtain = com.autonavi.amap.mapcore.IPoint.obtain();
        gLMapState.screenToP20Point(i, i2, obtain);
        return obtain;
    }

    public int getMapGestureState() {
        return this.state;
    }
}
