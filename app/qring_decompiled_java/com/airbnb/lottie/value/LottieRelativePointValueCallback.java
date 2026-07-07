package com.airbnb.lottie.value;

/* loaded from: classes.dex */
public class LottieRelativePointValueCallback extends com.airbnb.lottie.value.LottieValueCallback<android.graphics.PointF> {
    private final android.graphics.PointF point;

    public LottieRelativePointValueCallback() {
        this.point = new android.graphics.PointF();
    }

    public LottieRelativePointValueCallback(android.graphics.PointF pointF) {
        super(pointF);
        this.point = new android.graphics.PointF();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final android.graphics.PointF getValue(com.airbnb.lottie.value.LottieFrameInfo<android.graphics.PointF> lottieFrameInfo) {
        this.point.set(com.airbnb.lottie.utils.MiscUtils.lerp(lottieFrameInfo.getStartValue().x, lottieFrameInfo.getEndValue().x, lottieFrameInfo.getInterpolatedKeyframeProgress()), com.airbnb.lottie.utils.MiscUtils.lerp(lottieFrameInfo.getStartValue().y, lottieFrameInfo.getEndValue().y, lottieFrameInfo.getInterpolatedKeyframeProgress()));
        android.graphics.PointF offset = getOffset(lottieFrameInfo);
        this.point.offset(offset.x, offset.y);
        return this.point;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.graphics.PointF getOffset(com.airbnb.lottie.value.LottieFrameInfo<android.graphics.PointF> lottieFrameInfo) {
        if (this.value == 0) {
            throw new java.lang.IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
        }
        return (android.graphics.PointF) this.value;
    }
}
