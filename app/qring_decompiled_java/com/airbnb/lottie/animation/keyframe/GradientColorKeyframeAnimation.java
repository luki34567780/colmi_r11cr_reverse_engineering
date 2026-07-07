package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class GradientColorKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<com.airbnb.lottie.model.content.GradientColor> {
    private final com.airbnb.lottie.model.content.GradientColor gradientColor;

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return getValue((com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.GradientColor>) keyframe, f);
    }

    public GradientColorKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.GradientColor>> list) {
        super(list);
        com.airbnb.lottie.model.content.GradientColor gradientColor = list.get(0).startValue;
        int size = gradientColor != null ? gradientColor.getSize() : 0;
        this.gradientColor = new com.airbnb.lottie.model.content.GradientColor(new float[size], new int[size]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    com.airbnb.lottie.model.content.GradientColor getValue(com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.GradientColor> keyframe, float f) {
        this.gradientColor.lerp(keyframe.startValue, keyframe.endValue, f);
        return this.gradientColor;
    }
}
