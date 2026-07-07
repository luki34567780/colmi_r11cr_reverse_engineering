package com.airbnb.lottie.value;

/* loaded from: classes.dex */
public class LottieValueCallback<T> {
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, ?> animation;
    private final com.airbnb.lottie.value.LottieFrameInfo<T> frameInfo;
    protected T value;

    public LottieValueCallback() {
        this.frameInfo = new com.airbnb.lottie.value.LottieFrameInfo<>();
        this.value = null;
    }

    public LottieValueCallback(T t) {
        this.frameInfo = new com.airbnb.lottie.value.LottieFrameInfo<>();
        this.value = null;
        this.value = t;
    }

    public T getValue(com.airbnb.lottie.value.LottieFrameInfo<T> lottieFrameInfo) {
        return this.value;
    }

    public final void setValue(T t) {
        this.value = t;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.animation;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.notifyListeners();
        }
    }

    public final T getValueInternal(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return getValue(this.frameInfo.set(f, f2, t, t2, f3, f4, f5));
    }

    public final void setAnimation(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.animation = baseKeyframeAnimation;
    }
}
