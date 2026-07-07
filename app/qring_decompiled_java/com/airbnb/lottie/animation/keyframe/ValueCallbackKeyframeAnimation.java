package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class ValueCallbackKeyframeAnimation<K, A> extends com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<K, A> {
    private final com.airbnb.lottie.value.LottieFrameInfo<A> frameInfo;
    private final A valueCallbackValue;

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    float getEndProgress() {
        return 1.0f;
    }

    public ValueCallbackKeyframeAnimation(com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback) {
        this(lottieValueCallback, null);
    }

    public ValueCallbackKeyframeAnimation(com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback, A a) {
        super(java.util.Collections.emptyList());
        this.frameInfo = new com.airbnb.lottie.value.LottieFrameInfo<>();
        setValueCallback(lottieValueCallback);
        this.valueCallbackValue = a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f) {
        this.progress = f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void notifyListeners() {
        if (this.valueCallback != null) {
            super.notifyListeners();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public A getValue() {
        com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        A a = this.valueCallbackValue;
        return lottieValueCallback.getValueInternal(0.0f, 0.0f, a, a, getProgress(), getProgress(), getProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    A getValue(com.airbnb.lottie.value.Keyframe<K> keyframe, float f) {
        return getValue();
    }
}
