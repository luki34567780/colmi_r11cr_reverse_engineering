package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class CrossOverlayOptions {
    com.autonavi.ae.gmap.gloverlay.AVectorCrossAttr a = null;
    private android.graphics.Bitmap bitmapDescriptor = null;

    public com.autonavi.ae.gmap.gloverlay.AVectorCrossAttr getAttribute() {
        return this.a;
    }

    public com.amap.api.maps.model.CrossOverlayOptions setAttribute(com.autonavi.ae.gmap.gloverlay.AVectorCrossAttr aVectorCrossAttr) {
        this.a = aVectorCrossAttr;
        return this;
    }

    public com.amap.api.maps.model.CrossOverlayOptions setRes(android.graphics.Bitmap bitmap) {
        this.bitmapDescriptor = bitmap;
        return this;
    }

    public android.graphics.Bitmap getRes() {
        return this.bitmapDescriptor;
    }
}
