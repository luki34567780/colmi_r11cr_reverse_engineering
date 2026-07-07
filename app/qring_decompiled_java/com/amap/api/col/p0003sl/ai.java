package com.amap.api.col.p0003sl;

/* compiled from: AbstractCameraPositionMessage.java */
/* loaded from: classes.dex */
public final class ai extends com.autonavi.amap.mapcore.AbstractCameraUpdateMessage {
    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void runCameraUpdate(com.autonavi.amap.api.mapcore.IGLMapState iGLMapState) {
        normalChange(iGLMapState);
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public final void mergeCameraUpdateDelegate(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage abstractCameraUpdateMessage) {
        abstractCameraUpdateMessage.geoPoint = this.geoPoint == null ? abstractCameraUpdateMessage.geoPoint : this.geoPoint;
        abstractCameraUpdateMessage.zoom = java.lang.Float.isNaN(this.zoom) ? abstractCameraUpdateMessage.zoom : this.zoom;
        abstractCameraUpdateMessage.bearing = java.lang.Float.isNaN(this.bearing) ? abstractCameraUpdateMessage.bearing : this.bearing;
        abstractCameraUpdateMessage.tilt = java.lang.Float.isNaN(this.tilt) ? abstractCameraUpdateMessage.tilt : this.tilt;
    }
}
