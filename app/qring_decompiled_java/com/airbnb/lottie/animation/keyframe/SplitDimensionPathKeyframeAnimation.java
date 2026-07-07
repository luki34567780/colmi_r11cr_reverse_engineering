package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class SplitDimensionPathKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> {
    private final android.graphics.PointF point;
    private final android.graphics.PointF pointWithCallbackValues;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> xAnimation;
    protected com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> xValueCallback;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> yAnimation;
    protected com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> yValueCallback;

    public SplitDimensionPathKeyframeAnimation(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation2) {
        super(java.util.Collections.emptyList());
        this.point = new android.graphics.PointF();
        this.pointWithCallbackValues = new android.graphics.PointF();
        this.xAnimation = baseKeyframeAnimation;
        this.yAnimation = baseKeyframeAnimation2;
        setProgress(getProgress());
    }

    public void setXValueCallback(com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback) {
        com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback2 = this.xValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.xValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public void setYValueCallback(com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback) {
        com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback2 = this.yValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.yValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f) {
        this.xAnimation.setProgress(f);
        this.yAnimation.setProgress(f);
        this.point.set(this.xAnimation.getValue().floatValue(), this.yAnimation.getValue().floatValue());
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onValueChanged();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public android.graphics.PointF getValue() {
        return getValue((com.airbnb.lottie.value.Keyframe<android.graphics.PointF>) null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public android.graphics.PointF getValue(com.airbnb.lottie.value.Keyframe<android.graphics.PointF> keyframe, float f) {
        java.lang.Float f2;
        com.airbnb.lottie.value.Keyframe<java.lang.Float> currentKeyframe;
        com.airbnb.lottie.value.Keyframe<java.lang.Float> currentKeyframe2;
        java.lang.Float f3 = null;
        if (this.xValueCallback == null || (currentKeyframe2 = this.xAnimation.getCurrentKeyframe()) == null) {
            f2 = null;
        } else {
            float interpolatedCurrentKeyframeProgress = this.xAnimation.getInterpolatedCurrentKeyframeProgress();
            java.lang.Float f4 = currentKeyframe2.endFrame;
            f2 = this.xValueCallback.getValueInternal(currentKeyframe2.startFrame, f4 == null ? currentKeyframe2.startFrame : f4.floatValue(), currentKeyframe2.startValue, currentKeyframe2.endValue, f, f, interpolatedCurrentKeyframeProgress);
        }
        if (this.yValueCallback != null && (currentKeyframe = this.yAnimation.getCurrentKeyframe()) != null) {
            float interpolatedCurrentKeyframeProgress2 = this.yAnimation.getInterpolatedCurrentKeyframeProgress();
            java.lang.Float f5 = currentKeyframe.endFrame;
            f3 = this.yValueCallback.getValueInternal(currentKeyframe.startFrame, f5 == null ? currentKeyframe.startFrame : f5.floatValue(), currentKeyframe.startValue, currentKeyframe.endValue, f, f, interpolatedCurrentKeyframeProgress2);
        }
        if (f2 == null) {
            this.pointWithCallbackValues.set(this.point.x, 0.0f);
        } else {
            this.pointWithCallbackValues.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            android.graphics.PointF pointF = this.pointWithCallbackValues;
            pointF.set(pointF.x, this.point.y);
        } else {
            android.graphics.PointF pointF2 = this.pointWithCallbackValues;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.pointWithCallbackValues;
    }
}
