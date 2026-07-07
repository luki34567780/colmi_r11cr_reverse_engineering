package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class IntegerKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<java.lang.Integer> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return getValue((com.airbnb.lottie.value.Keyframe<java.lang.Integer>) keyframe, f);
    }

    public IntegerKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<java.lang.Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    java.lang.Integer getValue(com.airbnb.lottie.value.Keyframe<java.lang.Integer> keyframe, float f) {
        return java.lang.Integer.valueOf(getIntValue(keyframe, f));
    }

    int getIntValue(com.airbnb.lottie.value.Keyframe<java.lang.Integer> keyframe, float f) {
        java.lang.Integer num;
        if (keyframe.startValue == null || keyframe.endValue == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        if (this.valueCallback != null && (num = (java.lang.Integer) this.valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, keyframe.endValue, f, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return num.intValue();
        }
        return com.airbnb.lottie.utils.MiscUtils.lerp(keyframe.getStartValueInt(), keyframe.getEndValueInt(), f);
    }

    public int getIntValue() {
        return getIntValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
