package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class ColorKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<java.lang.Integer> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return getValue((com.airbnb.lottie.value.Keyframe<java.lang.Integer>) keyframe, f);
    }

    public ColorKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<java.lang.Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    java.lang.Integer getValue(com.airbnb.lottie.value.Keyframe<java.lang.Integer> keyframe, float f) {
        return java.lang.Integer.valueOf(getIntValue(keyframe, f));
    }

    public int getIntValue(com.airbnb.lottie.value.Keyframe<java.lang.Integer> keyframe, float f) {
        java.lang.Integer num;
        if (keyframe.startValue == null || keyframe.endValue == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        int intValue = keyframe.startValue.intValue();
        int intValue2 = keyframe.endValue.intValue();
        if (this.valueCallback != null && (num = (java.lang.Integer) this.valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), f, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return num.intValue();
        }
        return com.airbnb.lottie.utils.GammaEvaluator.evaluate(com.airbnb.lottie.utils.MiscUtils.clamp(f, 0.0f, 1.0f), intValue, intValue2);
    }

    public int getIntValue() {
        return getIntValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
