package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class ScaleKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<com.airbnb.lottie.value.ScaleXY> {
    private final com.airbnb.lottie.value.ScaleXY scaleXY;

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return getValue((com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.value.ScaleXY>) keyframe, f);
    }

    public ScaleKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.value.ScaleXY>> list) {
        super(list);
        this.scaleXY = new com.airbnb.lottie.value.ScaleXY();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public com.airbnb.lottie.value.ScaleXY getValue(com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.value.ScaleXY> keyframe, float f) {
        com.airbnb.lottie.value.ScaleXY scaleXY;
        if (keyframe.startValue == null || keyframe.endValue == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.ScaleXY scaleXY2 = keyframe.startValue;
        com.airbnb.lottie.value.ScaleXY scaleXY3 = keyframe.endValue;
        if (this.valueCallback != null && (scaleXY = (com.airbnb.lottie.value.ScaleXY) this.valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), scaleXY2, scaleXY3, f, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return scaleXY;
        }
        this.scaleXY.set(com.airbnb.lottie.utils.MiscUtils.lerp(scaleXY2.getScaleX(), scaleXY3.getScaleX(), f), com.airbnb.lottie.utils.MiscUtils.lerp(scaleXY2.getScaleY(), scaleXY3.getScaleY(), f));
        return this.scaleXY;
    }
}
