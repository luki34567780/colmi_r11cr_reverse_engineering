package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public class PathKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<android.graphics.PointF> {
    private final android.graphics.PathMeasure pathMeasure;
    private com.airbnb.lottie.animation.keyframe.PathKeyframe pathMeasureKeyframe;
    private final android.graphics.PointF point;
    private final float[] pos;

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return getValue((com.airbnb.lottie.value.Keyframe<android.graphics.PointF>) keyframe, f);
    }

    public PathKeyframeAnimation(java.util.List<? extends com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> list) {
        super(list);
        this.point = new android.graphics.PointF();
        this.pos = new float[2];
        this.pathMeasure = new android.graphics.PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public android.graphics.PointF getValue(com.airbnb.lottie.value.Keyframe<android.graphics.PointF> keyframe, float f) {
        android.graphics.PointF pointF;
        com.airbnb.lottie.animation.keyframe.PathKeyframe pathKeyframe = (com.airbnb.lottie.animation.keyframe.PathKeyframe) keyframe;
        android.graphics.Path path = pathKeyframe.getPath();
        if (path == null) {
            return keyframe.startValue;
        }
        if (this.valueCallback != null && (pointF = (android.graphics.PointF) this.valueCallback.getValueInternal(pathKeyframe.startFrame, pathKeyframe.endFrame.floatValue(), pathKeyframe.startValue, pathKeyframe.endValue, getLinearCurrentKeyframeProgress(), f, getProgress())) != null) {
            return pointF;
        }
        if (this.pathMeasureKeyframe != pathKeyframe) {
            this.pathMeasure.setPath(path, false);
            this.pathMeasureKeyframe = pathKeyframe;
        }
        android.graphics.PathMeasure pathMeasure = this.pathMeasure;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.pos, null);
        android.graphics.PointF pointF2 = this.point;
        float[] fArr = this.pos;
        pointF2.set(fArr[0], fArr[1]);
        return this.point;
    }
}
