package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class PointKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<android.graphics.PointF> {
    private final android.graphics.PointF point;

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return getValue((com.airbnb.lottie.value.Keyframe<android.graphics.PointF>) keyframe, f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    protected /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f, float f2, float f3) {
        return getValue((com.airbnb.lottie.value.Keyframe<android.graphics.PointF>) keyframe, f, f2, f3);
    }

    public PointKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> list) {
        super(list);
        this.point = new android.graphics.PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public android.graphics.PointF getValue(com.airbnb.lottie.value.Keyframe<android.graphics.PointF> keyframe, float f) {
        return getValue(keyframe, f, f, f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    protected android.graphics.PointF getValue(com.airbnb.lottie.value.Keyframe<android.graphics.PointF> keyframe, float f, float f2, float f3) {
        android.graphics.PointF pointF;
        if (keyframe.startValue == null || keyframe.endValue == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        android.graphics.PointF pointF2 = keyframe.startValue;
        android.graphics.PointF pointF3 = keyframe.endValue;
        if (this.valueCallback != null && (pointF = (android.graphics.PointF) this.valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), pointF2, pointF3, f, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return pointF;
        }
        this.point.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return this.point;
    }
}
