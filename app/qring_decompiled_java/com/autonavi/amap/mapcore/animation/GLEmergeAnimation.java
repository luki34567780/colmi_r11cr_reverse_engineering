package com.autonavi.amap.mapcore.animation;

/* loaded from: classes.dex */
public class GLEmergeAnimation extends com.autonavi.amap.mapcore.animation.GLAnimation {
    public com.amap.api.maps.model.LatLng mStartPoint;

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    protected void applyTransformation(float f, com.autonavi.amap.mapcore.animation.GLTransformation gLTransformation) {
    }

    public GLEmergeAnimation(com.amap.api.maps.model.LatLng latLng) {
        this.mStartPoint = latLng;
    }
}
