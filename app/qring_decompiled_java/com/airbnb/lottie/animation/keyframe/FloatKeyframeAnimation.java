package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class FloatKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<java.lang.Float> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return getValue((com.airbnb.lottie.value.Keyframe<java.lang.Float>) keyframe, f);
    }

    public FloatKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<java.lang.Float>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    java.lang.Float getValue(com.airbnb.lottie.value.Keyframe<java.lang.Float> keyframe, float f) {
        return java.lang.Float.valueOf(getFloatValue(keyframe, f));
    }

    float getFloatValue(com.airbnb.lottie.value.Keyframe<java.lang.Float> keyframe, float f) {
        java.lang.Float f2;
        if (keyframe.startValue == null || keyframe.endValue == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        if (this.valueCallback != null && (f2 = (java.lang.Float) this.valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, keyframe.endValue, f, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return f2.floatValue();
        }
        return com.airbnb.lottie.utils.MiscUtils.lerp(keyframe.getStartValueFloat(), keyframe.getEndValueFloat(), f);
    }

    public float getFloatValue() {
        return getFloatValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
