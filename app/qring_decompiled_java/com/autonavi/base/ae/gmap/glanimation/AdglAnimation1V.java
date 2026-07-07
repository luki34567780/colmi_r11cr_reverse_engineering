package com.autonavi.base.ae.gmap.glanimation;

/* loaded from: classes.dex */
public class AdglAnimation1V extends com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation {
    private float curValue;
    private com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V v1Param = null;

    public void reset() {
        this.isOver = false;
        this.duration = 0;
        com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V abstractAdglAnimationParam1V = this.v1Param;
        if (abstractAdglAnimationParam1V != null) {
            abstractAdglAnimationParam1V.reset();
        }
    }

    public AdglAnimation1V(int i) {
        reset();
        this.duration = i;
        this.curValue = 0.0f;
    }

    public void setAnimationValue(float f, float f2, int i) {
        if (this.v1Param == null) {
            this.v1Param = new com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V();
        }
        this.v1Param.reset();
        this.v1Param.setInterpolatorType(i, 1.0f);
        this.v1Param.setFromValue(f);
        this.v1Param.setToValue(f2);
        this.startTime = android.os.SystemClock.uptimeMillis();
        this.isOver = false;
    }

    public float getCurValue() {
        return this.curValue;
    }

    public float getStartValue() {
        com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V abstractAdglAnimationParam1V = this.v1Param;
        if (abstractAdglAnimationParam1V != null) {
            return abstractAdglAnimationParam1V.getFromValue();
        }
        return 0.0f;
    }

    public float getEndValue() {
        com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V abstractAdglAnimationParam1V = this.v1Param;
        if (abstractAdglAnimationParam1V != null) {
            return abstractAdglAnimationParam1V.getToValue();
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimation
    public void doAnimation(java.lang.Object obj) {
        if (this.isOver) {
            return;
        }
        this.offsetTime = android.os.SystemClock.uptimeMillis() - this.startTime;
        float f = this.offsetTime / this.duration;
        if (f > 1.0f) {
            this.isOver = true;
            f = 1.0f;
        } else if (f < 0.0f) {
            this.isOver = true;
            return;
        }
        com.autonavi.base.ae.gmap.glanimation.AbstractAdglAnimationParam1V abstractAdglAnimationParam1V = this.v1Param;
        if (abstractAdglAnimationParam1V != null) {
            abstractAdglAnimationParam1V.setNormalizedTime(f);
            this.curValue = this.v1Param.getCurValue();
        }
    }
}
