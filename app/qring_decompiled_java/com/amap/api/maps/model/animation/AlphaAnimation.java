package com.amap.api.maps.model.animation;

/* loaded from: classes.dex */
public class AlphaAnimation extends com.amap.api.maps.model.animation.Animation {
    private float mFromAlpha;
    private float mToAlpha;

    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
        return "AlphaAnimation";
    }

    public AlphaAnimation(float f, float f2) {
        this.mFromAlpha = 0.0f;
        this.mToAlpha = 1.0f;
        this.glAnimation = new com.autonavi.amap.mapcore.animation.GLAlphaAnimation(f, f2);
        this.mFromAlpha = f;
        this.mToAlpha = f2;
    }
}
