package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class MaskKeyframeAnimation {
    private final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.ShapeData, android.graphics.Path>> maskAnimations;
    private final java.util.List<com.airbnb.lottie.model.content.Mask> masks;
    private final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer>> opacityAnimations;

    public MaskKeyframeAnimation(java.util.List<com.airbnb.lottie.model.content.Mask> list) {
        this.masks = list;
        this.maskAnimations = new java.util.ArrayList(list.size());
        this.opacityAnimations = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.maskAnimations.add(list.get(i).getMaskPath().createAnimation());
            this.opacityAnimations.add(list.get(i).getOpacity().createAnimation());
        }
    }

    public java.util.List<com.airbnb.lottie.model.content.Mask> getMasks() {
        return this.masks;
    }

    public java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.ShapeData, android.graphics.Path>> getMaskAnimations() {
        return this.maskAnimations;
    }

    public java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer>> getOpacityAnimations() {
        return this.opacityAnimations;
    }
}
