package com.amap.api.maps.model.animation;

/* loaded from: classes.dex */
public class TranslateAnimation extends com.amap.api.maps.model.animation.Animation {
    private double x;
    private double y;

    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
        return "TranslateAnimation";
    }

    public TranslateAnimation(com.amap.api.maps.model.LatLng latLng) {
        this.glAnimation = new com.autonavi.amap.mapcore.animation.GLTranslateAnimation(latLng);
        this.x = latLng.latitude;
        this.y = latLng.longitude;
    }
}
