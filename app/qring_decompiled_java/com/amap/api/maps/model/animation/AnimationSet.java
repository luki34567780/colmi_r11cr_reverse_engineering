package com.amap.api.maps.model.animation;

/* loaded from: classes.dex */
public class AnimationSet extends com.amap.api.maps.model.animation.Animation {
    private java.util.List<com.amap.api.maps.model.animation.Animation> mAnimations = new java.util.ArrayList();
    private boolean shareInterpolator;

    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
        return "AnimationSet";
    }

    public AnimationSet(boolean z) {
        this.shareInterpolator = false;
        this.glAnimation = new com.autonavi.amap.mapcore.animation.GLAnimationSet(z);
        this.shareInterpolator = z;
    }

    public void addAnimation(com.amap.api.maps.model.animation.Animation animation) {
        ((com.autonavi.amap.mapcore.animation.GLAnimationSet) this.glAnimation).addAnimation(animation);
        this.mAnimations.add(animation);
    }

    public void cleanAnimation() {
        ((com.autonavi.amap.mapcore.animation.GLAnimationSet) this.glAnimation).cleanAnimation();
        this.mAnimations.clear();
    }
}
