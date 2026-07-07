package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
class FloatKeyframeSet extends com.nineoldandroids.animation.KeyframeSet {
    private float deltaValue;
    private boolean firstTime;
    private float firstValue;
    private float lastValue;

    public FloatKeyframeSet(com.nineoldandroids.animation.Keyframe.FloatKeyframe... floatKeyframeArr) {
        super(floatKeyframeArr);
        this.firstTime = true;
    }

    @Override // com.nineoldandroids.animation.KeyframeSet
    public java.lang.Object getValue(float f) {
        return java.lang.Float.valueOf(getFloatValue(f));
    }

    @Override // com.nineoldandroids.animation.KeyframeSet
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.nineoldandroids.animation.FloatKeyframeSet mo108clone() {
        java.util.ArrayList<com.nineoldandroids.animation.Keyframe> arrayList = this.mKeyframes;
        int size = this.mKeyframes.size();
        com.nineoldandroids.animation.Keyframe.FloatKeyframe[] floatKeyframeArr = new com.nineoldandroids.animation.Keyframe.FloatKeyframe[size];
        for (int i = 0; i < size; i++) {
            floatKeyframeArr[i] = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) arrayList.get(i).mo109clone();
        }
        return new com.nineoldandroids.animation.FloatKeyframeSet(floatKeyframeArr);
    }

    public float getFloatValue(float f) {
        if (this.mNumKeyframes == 2) {
            if (this.firstTime) {
                this.firstTime = false;
                this.firstValue = ((com.nineoldandroids.animation.Keyframe.FloatKeyframe) this.mKeyframes.get(0)).getFloatValue();
                float floatValue = ((com.nineoldandroids.animation.Keyframe.FloatKeyframe) this.mKeyframes.get(1)).getFloatValue();
                this.lastValue = floatValue;
                this.deltaValue = floatValue - this.firstValue;
            }
            if (this.mInterpolator != null) {
                f = this.mInterpolator.getInterpolation(f);
            }
            if (this.mEvaluator == null) {
                return this.firstValue + (f * this.deltaValue);
            }
            return ((java.lang.Number) this.mEvaluator.evaluate(f, java.lang.Float.valueOf(this.firstValue), java.lang.Float.valueOf(this.lastValue))).floatValue();
        }
        if (f <= 0.0f) {
            com.nineoldandroids.animation.Keyframe.FloatKeyframe floatKeyframe = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) this.mKeyframes.get(0);
            com.nineoldandroids.animation.Keyframe.FloatKeyframe floatKeyframe2 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) this.mKeyframes.get(1);
            float floatValue2 = floatKeyframe.getFloatValue();
            float floatValue3 = floatKeyframe2.getFloatValue();
            float fraction = floatKeyframe.getFraction();
            float fraction2 = floatKeyframe2.getFraction();
            android.view.animation.Interpolator interpolator = floatKeyframe2.getInterpolator();
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            float f2 = (f - fraction) / (fraction2 - fraction);
            return this.mEvaluator == null ? floatValue2 + (f2 * (floatValue3 - floatValue2)) : ((java.lang.Number) this.mEvaluator.evaluate(f2, java.lang.Float.valueOf(floatValue2), java.lang.Float.valueOf(floatValue3))).floatValue();
        }
        if (f >= 1.0f) {
            com.nineoldandroids.animation.Keyframe.FloatKeyframe floatKeyframe3 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) this.mKeyframes.get(this.mNumKeyframes - 2);
            com.nineoldandroids.animation.Keyframe.FloatKeyframe floatKeyframe4 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) this.mKeyframes.get(this.mNumKeyframes - 1);
            float floatValue4 = floatKeyframe3.getFloatValue();
            float floatValue5 = floatKeyframe4.getFloatValue();
            float fraction3 = floatKeyframe3.getFraction();
            float fraction4 = floatKeyframe4.getFraction();
            android.view.animation.Interpolator interpolator2 = floatKeyframe4.getInterpolator();
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            float f3 = (f - fraction3) / (fraction4 - fraction3);
            return this.mEvaluator == null ? floatValue4 + (f3 * (floatValue5 - floatValue4)) : ((java.lang.Number) this.mEvaluator.evaluate(f3, java.lang.Float.valueOf(floatValue4), java.lang.Float.valueOf(floatValue5))).floatValue();
        }
        com.nineoldandroids.animation.Keyframe.FloatKeyframe floatKeyframe5 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) this.mKeyframes.get(0);
        int i = 1;
        while (i < this.mNumKeyframes) {
            com.nineoldandroids.animation.Keyframe.FloatKeyframe floatKeyframe6 = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) this.mKeyframes.get(i);
            if (f < floatKeyframe6.getFraction()) {
                android.view.animation.Interpolator interpolator3 = floatKeyframe6.getInterpolator();
                if (interpolator3 != null) {
                    f = interpolator3.getInterpolation(f);
                }
                float fraction5 = (f - floatKeyframe5.getFraction()) / (floatKeyframe6.getFraction() - floatKeyframe5.getFraction());
                float floatValue6 = floatKeyframe5.getFloatValue();
                float floatValue7 = floatKeyframe6.getFloatValue();
                return this.mEvaluator == null ? floatValue6 + (fraction5 * (floatValue7 - floatValue6)) : ((java.lang.Number) this.mEvaluator.evaluate(fraction5, java.lang.Float.valueOf(floatValue6), java.lang.Float.valueOf(floatValue7))).floatValue();
            }
            i++;
            floatKeyframe5 = floatKeyframe6;
        }
        return ((java.lang.Number) this.mKeyframes.get(this.mNumKeyframes - 1).getValue()).floatValue();
    }
}
