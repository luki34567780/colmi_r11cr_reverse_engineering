package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
class IntKeyframeSet extends com.nineoldandroids.animation.KeyframeSet {
    private int deltaValue;
    private boolean firstTime;
    private int firstValue;
    private int lastValue;

    public IntKeyframeSet(com.nineoldandroids.animation.Keyframe.IntKeyframe... intKeyframeArr) {
        super(intKeyframeArr);
        this.firstTime = true;
    }

    @Override // com.nineoldandroids.animation.KeyframeSet
    public java.lang.Object getValue(float f) {
        return java.lang.Integer.valueOf(getIntValue(f));
    }

    @Override // com.nineoldandroids.animation.KeyframeSet
    /* renamed from: clone */
    public com.nineoldandroids.animation.IntKeyframeSet mo108clone() {
        java.util.ArrayList<com.nineoldandroids.animation.Keyframe> arrayList = this.mKeyframes;
        int size = this.mKeyframes.size();
        com.nineoldandroids.animation.Keyframe.IntKeyframe[] intKeyframeArr = new com.nineoldandroids.animation.Keyframe.IntKeyframe[size];
        for (int i = 0; i < size; i++) {
            intKeyframeArr[i] = (com.nineoldandroids.animation.Keyframe.IntKeyframe) arrayList.get(i).mo109clone();
        }
        return new com.nineoldandroids.animation.IntKeyframeSet(intKeyframeArr);
    }

    public int getIntValue(float f) {
        if (this.mNumKeyframes == 2) {
            if (this.firstTime) {
                this.firstTime = false;
                this.firstValue = ((com.nineoldandroids.animation.Keyframe.IntKeyframe) this.mKeyframes.get(0)).getIntValue();
                int intValue = ((com.nineoldandroids.animation.Keyframe.IntKeyframe) this.mKeyframes.get(1)).getIntValue();
                this.lastValue = intValue;
                this.deltaValue = intValue - this.firstValue;
            }
            if (this.mInterpolator != null) {
                f = this.mInterpolator.getInterpolation(f);
            }
            if (this.mEvaluator == null) {
                return this.firstValue + ((int) (f * this.deltaValue));
            }
            return ((java.lang.Number) this.mEvaluator.evaluate(f, java.lang.Integer.valueOf(this.firstValue), java.lang.Integer.valueOf(this.lastValue))).intValue();
        }
        if (f <= 0.0f) {
            com.nineoldandroids.animation.Keyframe.IntKeyframe intKeyframe = (com.nineoldandroids.animation.Keyframe.IntKeyframe) this.mKeyframes.get(0);
            com.nineoldandroids.animation.Keyframe.IntKeyframe intKeyframe2 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) this.mKeyframes.get(1);
            int intValue2 = intKeyframe.getIntValue();
            int intValue3 = intKeyframe2.getIntValue();
            float fraction = intKeyframe.getFraction();
            float fraction2 = intKeyframe2.getFraction();
            android.view.animation.Interpolator interpolator = intKeyframe2.getInterpolator();
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            float f2 = (f - fraction) / (fraction2 - fraction);
            return this.mEvaluator == null ? intValue2 + ((int) (f2 * (intValue3 - intValue2))) : ((java.lang.Number) this.mEvaluator.evaluate(f2, java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(intValue3))).intValue();
        }
        if (f >= 1.0f) {
            com.nineoldandroids.animation.Keyframe.IntKeyframe intKeyframe3 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) this.mKeyframes.get(this.mNumKeyframes - 2);
            com.nineoldandroids.animation.Keyframe.IntKeyframe intKeyframe4 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) this.mKeyframes.get(this.mNumKeyframes - 1);
            int intValue4 = intKeyframe3.getIntValue();
            int intValue5 = intKeyframe4.getIntValue();
            float fraction3 = intKeyframe3.getFraction();
            float fraction4 = intKeyframe4.getFraction();
            android.view.animation.Interpolator interpolator2 = intKeyframe4.getInterpolator();
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            float f3 = (f - fraction3) / (fraction4 - fraction3);
            return this.mEvaluator == null ? intValue4 + ((int) (f3 * (intValue5 - intValue4))) : ((java.lang.Number) this.mEvaluator.evaluate(f3, java.lang.Integer.valueOf(intValue4), java.lang.Integer.valueOf(intValue5))).intValue();
        }
        com.nineoldandroids.animation.Keyframe.IntKeyframe intKeyframe5 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) this.mKeyframes.get(0);
        int i = 1;
        while (i < this.mNumKeyframes) {
            com.nineoldandroids.animation.Keyframe.IntKeyframe intKeyframe6 = (com.nineoldandroids.animation.Keyframe.IntKeyframe) this.mKeyframes.get(i);
            if (f < intKeyframe6.getFraction()) {
                android.view.animation.Interpolator interpolator3 = intKeyframe6.getInterpolator();
                if (interpolator3 != null) {
                    f = interpolator3.getInterpolation(f);
                }
                float fraction5 = (f - intKeyframe5.getFraction()) / (intKeyframe6.getFraction() - intKeyframe5.getFraction());
                int intValue6 = intKeyframe5.getIntValue();
                return this.mEvaluator == null ? intValue6 + ((int) (fraction5 * (r1 - intValue6))) : ((java.lang.Number) this.mEvaluator.evaluate(fraction5, java.lang.Integer.valueOf(intValue6), java.lang.Integer.valueOf(intKeyframe6.getIntValue()))).intValue();
            }
            i++;
            intKeyframe5 = intKeyframe6;
        }
        return ((java.lang.Number) this.mKeyframes.get(this.mNumKeyframes - 1).getValue()).intValue();
    }
}
