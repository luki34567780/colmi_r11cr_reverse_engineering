package com.airbnb.lottie.model.animatable;

/* loaded from: classes.dex */
public class AnimatablePathValue implements com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> {
    private final java.util.List<com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> keyframes;

    public AnimatablePathValue() {
        this.keyframes = java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(new android.graphics.PointF(0.0f, 0.0f)));
    }

    public AnimatablePathValue(java.util.List<com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> list) {
        this.keyframes = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public java.util.List<com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> getKeyframes() {
        return this.keyframes;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.keyframes.size() == 1 && this.keyframes.get(0).isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation() {
        if (this.keyframes.get(0).isStatic()) {
            return new com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation(this.keyframes);
        }
        return new com.airbnb.lottie.animation.keyframe.PathKeyframeAnimation(this.keyframes);
    }
}
