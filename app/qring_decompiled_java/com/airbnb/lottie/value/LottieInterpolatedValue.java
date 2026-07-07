package com.airbnb.lottie.value;

/* loaded from: classes.dex */
abstract class LottieInterpolatedValue<T> extends com.airbnb.lottie.value.LottieValueCallback<T> {
    private final T endValue;
    private final android.view.animation.Interpolator interpolator;
    private final T startValue;

    abstract T interpolateValue(T t, T t2, float f);

    LottieInterpolatedValue(T t, T t2) {
        this(t, t2, new android.view.animation.LinearInterpolator());
    }

    LottieInterpolatedValue(T t, T t2, android.view.animation.Interpolator interpolator) {
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = interpolator;
    }

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public T getValue(com.airbnb.lottie.value.LottieFrameInfo<T> lottieFrameInfo) {
        return interpolateValue(this.startValue, this.endValue, this.interpolator.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }
}
