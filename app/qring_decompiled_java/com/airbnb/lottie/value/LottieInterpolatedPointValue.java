package com.airbnb.lottie.value;

/* loaded from: classes.dex */
public class LottieInterpolatedPointValue extends com.airbnb.lottie.value.LottieInterpolatedValue<android.graphics.PointF> {
    private final android.graphics.PointF point;

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    public LottieInterpolatedPointValue(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        super(pointF, pointF2);
        this.point = new android.graphics.PointF();
    }

    public LottieInterpolatedPointValue(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.view.animation.Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.point = new android.graphics.PointF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.LottieInterpolatedValue
    public android.graphics.PointF interpolateValue(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f) {
        this.point.set(com.airbnb.lottie.utils.MiscUtils.lerp(pointF.x, pointF2.x, f), com.airbnb.lottie.utils.MiscUtils.lerp(pointF.y, pointF2.y, f));
        return this.point;
    }
}
