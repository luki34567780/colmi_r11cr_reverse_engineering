package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class Keyframe implements java.lang.Cloneable {
    float mFraction;
    java.lang.Class mValueType;
    private android.view.animation.Interpolator mInterpolator = null;
    boolean mHasValue = false;

    @Override // 
    /* renamed from: clone */
    public abstract com.nineoldandroids.animation.Keyframe mo109clone();

    public abstract java.lang.Object getValue();

    public abstract void setValue(java.lang.Object obj);

    public static com.nineoldandroids.animation.Keyframe ofInt(float f, int i) {
        return new com.nineoldandroids.animation.Keyframe.IntKeyframe(f, i);
    }

    public static com.nineoldandroids.animation.Keyframe ofInt(float f) {
        return new com.nineoldandroids.animation.Keyframe.IntKeyframe(f);
    }

    public static com.nineoldandroids.animation.Keyframe ofFloat(float f, float f2) {
        return new com.nineoldandroids.animation.Keyframe.FloatKeyframe(f, f2);
    }

    public static com.nineoldandroids.animation.Keyframe ofFloat(float f) {
        return new com.nineoldandroids.animation.Keyframe.FloatKeyframe(f);
    }

    public static com.nineoldandroids.animation.Keyframe ofObject(float f, java.lang.Object obj) {
        return new com.nineoldandroids.animation.Keyframe.ObjectKeyframe(f, obj);
    }

    public static com.nineoldandroids.animation.Keyframe ofObject(float f) {
        return new com.nineoldandroids.animation.Keyframe.ObjectKeyframe(f, null);
    }

    public boolean hasValue() {
        return this.mHasValue;
    }

    public float getFraction() {
        return this.mFraction;
    }

    public void setFraction(float f) {
        this.mFraction = f;
    }

    public android.view.animation.Interpolator getInterpolator() {
        return this.mInterpolator;
    }

    public void setInterpolator(android.view.animation.Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public java.lang.Class getType() {
        return this.mValueType;
    }

    static class ObjectKeyframe extends com.nineoldandroids.animation.Keyframe {
        java.lang.Object mValue;

        ObjectKeyframe(float f, java.lang.Object obj) {
            this.mFraction = f;
            this.mValue = obj;
            this.mHasValue = obj != null;
            this.mValueType = this.mHasValue ? obj.getClass() : java.lang.Object.class;
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public java.lang.Object getValue() {
            return this.mValue;
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public void setValue(java.lang.Object obj) {
            this.mValue = obj;
            this.mHasValue = obj != null;
        }

        @Override // com.nineoldandroids.animation.Keyframe
        /* renamed from: clone */
        public com.nineoldandroids.animation.Keyframe.ObjectKeyframe mo109clone() {
            com.nineoldandroids.animation.Keyframe.ObjectKeyframe objectKeyframe = new com.nineoldandroids.animation.Keyframe.ObjectKeyframe(getFraction(), this.mValue);
            objectKeyframe.setInterpolator(getInterpolator());
            return objectKeyframe;
        }
    }

    static class IntKeyframe extends com.nineoldandroids.animation.Keyframe {
        int mValue;

        IntKeyframe(float f, int i) {
            this.mFraction = f;
            this.mValue = i;
            this.mValueType = java.lang.Integer.TYPE;
            this.mHasValue = true;
        }

        IntKeyframe(float f) {
            this.mFraction = f;
            this.mValueType = java.lang.Integer.TYPE;
        }

        public int getIntValue() {
            return this.mValue;
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public java.lang.Object getValue() {
            return java.lang.Integer.valueOf(this.mValue);
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public void setValue(java.lang.Object obj) {
            if (obj == null || obj.getClass() != java.lang.Integer.class) {
                return;
            }
            this.mValue = ((java.lang.Integer) obj).intValue();
            this.mHasValue = true;
        }

        @Override // com.nineoldandroids.animation.Keyframe
        /* renamed from: clone */
        public com.nineoldandroids.animation.Keyframe.IntKeyframe mo109clone() {
            com.nineoldandroids.animation.Keyframe.IntKeyframe intKeyframe = new com.nineoldandroids.animation.Keyframe.IntKeyframe(getFraction(), this.mValue);
            intKeyframe.setInterpolator(getInterpolator());
            return intKeyframe;
        }
    }

    static class FloatKeyframe extends com.nineoldandroids.animation.Keyframe {
        float mValue;

        FloatKeyframe(float f, float f2) {
            this.mFraction = f;
            this.mValue = f2;
            this.mValueType = java.lang.Float.TYPE;
            this.mHasValue = true;
        }

        FloatKeyframe(float f) {
            this.mFraction = f;
            this.mValueType = java.lang.Float.TYPE;
        }

        public float getFloatValue() {
            return this.mValue;
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public java.lang.Object getValue() {
            return java.lang.Float.valueOf(this.mValue);
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public void setValue(java.lang.Object obj) {
            if (obj == null || obj.getClass() != java.lang.Float.class) {
                return;
            }
            this.mValue = ((java.lang.Float) obj).floatValue();
            this.mHasValue = true;
        }

        @Override // com.nineoldandroids.animation.Keyframe
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.nineoldandroids.animation.Keyframe.FloatKeyframe mo109clone() {
            com.nineoldandroids.animation.Keyframe.FloatKeyframe floatKeyframe = new com.nineoldandroids.animation.Keyframe.FloatKeyframe(getFraction(), this.mValue);
            floatKeyframe.setInterpolator(getInterpolator());
            return floatKeyframe;
        }
    }
}
