package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
class KeyframeSet {
    com.nineoldandroids.animation.TypeEvaluator mEvaluator;
    com.nineoldandroids.animation.Keyframe mFirstKeyframe;
    android.view.animation.Interpolator mInterpolator;
    java.util.ArrayList<com.nineoldandroids.animation.Keyframe> mKeyframes;
    com.nineoldandroids.animation.Keyframe mLastKeyframe;
    int mNumKeyframes;

    public KeyframeSet(com.nineoldandroids.animation.Keyframe... keyframeArr) {
        this.mNumKeyframes = keyframeArr.length;
        java.util.ArrayList<com.nineoldandroids.animation.Keyframe> arrayList = new java.util.ArrayList<>();
        this.mKeyframes = arrayList;
        arrayList.addAll(java.util.Arrays.asList(keyframeArr));
        this.mFirstKeyframe = this.mKeyframes.get(0);
        com.nineoldandroids.animation.Keyframe keyframe = this.mKeyframes.get(this.mNumKeyframes - 1);
        this.mLastKeyframe = keyframe;
        this.mInterpolator = keyframe.getInterpolator();
    }

    public static com.nineoldandroids.animation.KeyframeSet ofInt(int... iArr) {
        int length = iArr.length;
        com.nineoldandroids.animation.Keyframe.IntKeyframe[] intKeyframeArr = new com.nineoldandroids.animation.Keyframe.IntKeyframe[java.lang.Math.max(length, 2)];
        if (length == 1) {
            intKeyframeArr[0] = (com.nineoldandroids.animation.Keyframe.IntKeyframe) com.nineoldandroids.animation.Keyframe.ofInt(0.0f);
            intKeyframeArr[1] = (com.nineoldandroids.animation.Keyframe.IntKeyframe) com.nineoldandroids.animation.Keyframe.ofInt(1.0f, iArr[0]);
        } else {
            intKeyframeArr[0] = (com.nineoldandroids.animation.Keyframe.IntKeyframe) com.nineoldandroids.animation.Keyframe.ofInt(0.0f, iArr[0]);
            for (int i = 1; i < length; i++) {
                intKeyframeArr[i] = (com.nineoldandroids.animation.Keyframe.IntKeyframe) com.nineoldandroids.animation.Keyframe.ofInt(i / (length - 1), iArr[i]);
            }
        }
        return new com.nineoldandroids.animation.IntKeyframeSet(intKeyframeArr);
    }

    public static com.nineoldandroids.animation.KeyframeSet ofFloat(float... fArr) {
        int length = fArr.length;
        com.nineoldandroids.animation.Keyframe.FloatKeyframe[] floatKeyframeArr = new com.nineoldandroids.animation.Keyframe.FloatKeyframe[java.lang.Math.max(length, 2)];
        if (length == 1) {
            floatKeyframeArr[0] = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) com.nineoldandroids.animation.Keyframe.ofFloat(0.0f);
            floatKeyframeArr[1] = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) com.nineoldandroids.animation.Keyframe.ofFloat(1.0f, fArr[0]);
        } else {
            floatKeyframeArr[0] = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) com.nineoldandroids.animation.Keyframe.ofFloat(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                floatKeyframeArr[i] = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) com.nineoldandroids.animation.Keyframe.ofFloat(i / (length - 1), fArr[i]);
            }
        }
        return new com.nineoldandroids.animation.FloatKeyframeSet(floatKeyframeArr);
    }

    public static com.nineoldandroids.animation.KeyframeSet ofKeyframe(com.nineoldandroids.animation.Keyframe... keyframeArr) {
        int length = keyframeArr.length;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < length; i2++) {
            if (keyframeArr[i2] instanceof com.nineoldandroids.animation.Keyframe.FloatKeyframe) {
                z = true;
            } else if (keyframeArr[i2] instanceof com.nineoldandroids.animation.Keyframe.IntKeyframe) {
                z2 = true;
            } else {
                z3 = true;
            }
        }
        if (z && !z2 && !z3) {
            com.nineoldandroids.animation.Keyframe.FloatKeyframe[] floatKeyframeArr = new com.nineoldandroids.animation.Keyframe.FloatKeyframe[length];
            while (i < length) {
                floatKeyframeArr[i] = (com.nineoldandroids.animation.Keyframe.FloatKeyframe) keyframeArr[i];
                i++;
            }
            return new com.nineoldandroids.animation.FloatKeyframeSet(floatKeyframeArr);
        }
        if (z2 && !z && !z3) {
            com.nineoldandroids.animation.Keyframe.IntKeyframe[] intKeyframeArr = new com.nineoldandroids.animation.Keyframe.IntKeyframe[length];
            while (i < length) {
                intKeyframeArr[i] = (com.nineoldandroids.animation.Keyframe.IntKeyframe) keyframeArr[i];
                i++;
            }
            return new com.nineoldandroids.animation.IntKeyframeSet(intKeyframeArr);
        }
        return new com.nineoldandroids.animation.KeyframeSet(keyframeArr);
    }

    public static com.nineoldandroids.animation.KeyframeSet ofObject(java.lang.Object... objArr) {
        int length = objArr.length;
        com.nineoldandroids.animation.Keyframe.ObjectKeyframe[] objectKeyframeArr = new com.nineoldandroids.animation.Keyframe.ObjectKeyframe[java.lang.Math.max(length, 2)];
        if (length == 1) {
            objectKeyframeArr[0] = (com.nineoldandroids.animation.Keyframe.ObjectKeyframe) com.nineoldandroids.animation.Keyframe.ofObject(0.0f);
            objectKeyframeArr[1] = (com.nineoldandroids.animation.Keyframe.ObjectKeyframe) com.nineoldandroids.animation.Keyframe.ofObject(1.0f, objArr[0]);
        } else {
            objectKeyframeArr[0] = (com.nineoldandroids.animation.Keyframe.ObjectKeyframe) com.nineoldandroids.animation.Keyframe.ofObject(0.0f, objArr[0]);
            for (int i = 1; i < length; i++) {
                objectKeyframeArr[i] = (com.nineoldandroids.animation.Keyframe.ObjectKeyframe) com.nineoldandroids.animation.Keyframe.ofObject(i / (length - 1), objArr[i]);
            }
        }
        return new com.nineoldandroids.animation.KeyframeSet(objectKeyframeArr);
    }

    public void setEvaluator(com.nineoldandroids.animation.TypeEvaluator typeEvaluator) {
        this.mEvaluator = typeEvaluator;
    }

    @Override // 
    /* renamed from: clone */
    public com.nineoldandroids.animation.KeyframeSet mo108clone() {
        java.util.ArrayList<com.nineoldandroids.animation.Keyframe> arrayList = this.mKeyframes;
        int size = arrayList.size();
        com.nineoldandroids.animation.Keyframe[] keyframeArr = new com.nineoldandroids.animation.Keyframe[size];
        for (int i = 0; i < size; i++) {
            keyframeArr[i] = arrayList.get(i).mo109clone();
        }
        return new com.nineoldandroids.animation.KeyframeSet(keyframeArr);
    }

    public java.lang.Object getValue(float f) {
        int i = this.mNumKeyframes;
        if (i == 2) {
            android.view.animation.Interpolator interpolator = this.mInterpolator;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            return this.mEvaluator.evaluate(f, this.mFirstKeyframe.getValue(), this.mLastKeyframe.getValue());
        }
        int i2 = 1;
        if (f <= 0.0f) {
            com.nineoldandroids.animation.Keyframe keyframe = this.mKeyframes.get(1);
            android.view.animation.Interpolator interpolator2 = keyframe.getInterpolator();
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            float fraction = this.mFirstKeyframe.getFraction();
            return this.mEvaluator.evaluate((f - fraction) / (keyframe.getFraction() - fraction), this.mFirstKeyframe.getValue(), keyframe.getValue());
        }
        if (f >= 1.0f) {
            com.nineoldandroids.animation.Keyframe keyframe2 = this.mKeyframes.get(i - 2);
            android.view.animation.Interpolator interpolator3 = this.mLastKeyframe.getInterpolator();
            if (interpolator3 != null) {
                f = interpolator3.getInterpolation(f);
            }
            float fraction2 = keyframe2.getFraction();
            return this.mEvaluator.evaluate((f - fraction2) / (this.mLastKeyframe.getFraction() - fraction2), keyframe2.getValue(), this.mLastKeyframe.getValue());
        }
        com.nineoldandroids.animation.Keyframe keyframe3 = this.mFirstKeyframe;
        while (i2 < this.mNumKeyframes) {
            com.nineoldandroids.animation.Keyframe keyframe4 = this.mKeyframes.get(i2);
            if (f < keyframe4.getFraction()) {
                android.view.animation.Interpolator interpolator4 = keyframe4.getInterpolator();
                if (interpolator4 != null) {
                    f = interpolator4.getInterpolation(f);
                }
                float fraction3 = keyframe3.getFraction();
                return this.mEvaluator.evaluate((f - fraction3) / (keyframe4.getFraction() - fraction3), keyframe3.getValue(), keyframe4.getValue());
            }
            i2++;
            keyframe3 = keyframe4;
        }
        return this.mLastKeyframe.getValue();
    }

    public java.lang.String toString() {
        java.lang.String str = " ";
        for (int i = 0; i < this.mNumKeyframes; i++) {
            str = str + this.mKeyframes.get(i).getValue() + "  ";
        }
        return str;
    }
}
