package com.amap.api.col.p0003sl;

/* compiled from: AbstractCameraScrollMessage.java */
/* loaded from: classes.dex */
public final class aj extends com.autonavi.amap.mapcore.AbstractCameraUpdateMessage {
    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void mergeCameraUpdateDelegate(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage abstractCameraUpdateMessage) {
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void runCameraUpdate(com.autonavi.amap.api.mapcore.IGLMapState iGLMapState) {
        float f = this.xPixel;
        float f2 = (this.width / 2.0f) + f;
        float f3 = (this.height / 2.0f) + this.yPixel;
        a(iGLMapState, (int) f2, (int) f3, new android.graphics.Point());
        iGLMapState.setMapGeoCenter(r1.x, r1.y);
    }

    private static void a(com.autonavi.amap.api.mapcore.IGLMapState iGLMapState, int i, int i2, android.graphics.Point point) {
        iGLMapState.screenToP20Point(i, i2, point);
    }
}
