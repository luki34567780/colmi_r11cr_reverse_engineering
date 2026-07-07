package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class TextKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<com.airbnb.lottie.model.DocumentData> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return getValue((com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.DocumentData>) keyframe, f);
    }

    public TextKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.DocumentData>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    com.airbnb.lottie.model.DocumentData getValue(com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.DocumentData> keyframe, float f) {
        if (f != 1.0f || keyframe.endValue == null) {
            return keyframe.startValue;
        }
        return keyframe.endValue;
    }
}
