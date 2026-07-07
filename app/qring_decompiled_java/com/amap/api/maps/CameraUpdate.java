package com.amap.api.maps;

/* loaded from: classes.dex */
public final class CameraUpdate {
    com.autonavi.amap.mapcore.AbstractCameraUpdateMessage a;

    CameraUpdate(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage abstractCameraUpdateMessage) {
        this.a = abstractCameraUpdateMessage;
    }

    public final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage getCameraUpdateFactoryDelegate() {
        return this.a;
    }
}
