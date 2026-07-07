package com.amap.api.maps.model.animation;

/* loaded from: classes.dex */
public class EmergeAnimation extends com.amap.api.maps.model.animation.Animation {
    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
        return "EmergeAnimation";
    }

    public EmergeAnimation(com.amap.api.maps.model.LatLng latLng) {
        this.glAnimation = new com.autonavi.amap.mapcore.animation.GLEmergeAnimation(latLng);
    }
}
