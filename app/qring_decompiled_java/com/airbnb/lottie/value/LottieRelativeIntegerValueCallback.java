package com.airbnb.lottie.value;

/* loaded from: classes.dex */
public class LottieRelativeIntegerValueCallback extends com.airbnb.lottie.value.LottieValueCallback<java.lang.Integer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public java.lang.Integer getValue(com.airbnb.lottie.value.LottieFrameInfo<java.lang.Integer> lottieFrameInfo) {
        return java.lang.Integer.valueOf(com.airbnb.lottie.utils.MiscUtils.lerp(lottieFrameInfo.getStartValue().intValue(), lottieFrameInfo.getEndValue().intValue(), lottieFrameInfo.getInterpolatedKeyframeProgress()) + getOffset(lottieFrameInfo).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.Integer getOffset(com.airbnb.lottie.value.LottieFrameInfo<java.lang.Integer> lottieFrameInfo) {
        if (this.value == 0) {
            throw new java.lang.IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
        }
        return (java.lang.Integer) this.value;
    }
}
