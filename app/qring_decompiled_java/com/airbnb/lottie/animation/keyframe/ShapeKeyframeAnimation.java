package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class ShapeKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.ShapeData, android.graphics.Path> {
    private final android.graphics.Path tempPath;
    private final com.airbnb.lottie.model.content.ShapeData tempShapeData;

    public ShapeKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.ShapeData>> list) {
        super(list);
        this.tempShapeData = new com.airbnb.lottie.model.content.ShapeData();
        this.tempPath = new android.graphics.Path();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public android.graphics.Path getValue(com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.ShapeData> keyframe, float f) {
        this.tempShapeData.interpolateBetween(keyframe.startValue, keyframe.endValue, f);
        com.airbnb.lottie.utils.MiscUtils.getPathFromData(this.tempShapeData, this.tempPath);
        return this.tempPath;
    }
}
