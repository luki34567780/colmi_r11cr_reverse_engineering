package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class PathKeyframe extends com.airbnb.lottie.value.Keyframe<android.graphics.PointF> {
    private android.graphics.Path path;
    private final com.airbnb.lottie.value.Keyframe<android.graphics.PointF> pointKeyFrame;

    public PathKeyframe(com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.value.Keyframe<android.graphics.PointF> keyframe) {
        super(lottieComposition, keyframe.startValue, keyframe.endValue, keyframe.interpolator, keyframe.xInterpolator, keyframe.yInterpolator, keyframe.startFrame, keyframe.endFrame);
        this.pointKeyFrame = keyframe;
        createPath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void createPath() {
        boolean z = (this.endValue == 0 || this.startValue == 0 || !((android.graphics.PointF) this.startValue).equals(((android.graphics.PointF) this.endValue).x, ((android.graphics.PointF) this.endValue).y)) ? false : true;
        if (this.startValue == 0 || this.endValue == 0 || z) {
            return;
        }
        this.path = com.airbnb.lottie.utils.Utils.createPath((android.graphics.PointF) this.startValue, (android.graphics.PointF) this.endValue, this.pointKeyFrame.pathCp1, this.pointKeyFrame.pathCp2);
    }

    android.graphics.Path getPath() {
        return this.path;
    }
}
