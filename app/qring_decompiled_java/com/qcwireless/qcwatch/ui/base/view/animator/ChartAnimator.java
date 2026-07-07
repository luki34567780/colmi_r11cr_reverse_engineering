package com.qcwireless.qcwatch.ui.base.view.animator;

/* loaded from: /tmp/dex/classes2.dex */
public class ChartAnimator {
    private android.animation.ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseY = 1.0f;
    protected float mPhaseX = 1.0f;

    public ChartAnimator(android.animation.ValueAnimator.AnimatorUpdateListener listener) {
        this.mListener = listener;
    }

    public void animateY(int durationMillis) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        ofFloat.setDuration(durationMillis);
        ofFloat.addUpdateListener(this.mListener);
        ofFloat.start();
    }

    public void animateX(int durationMillis) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        ofFloat.setDuration(durationMillis);
        ofFloat.addUpdateListener(this.mListener);
        ofFloat.start();
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    public void setPhaseY(float phase) {
        this.mPhaseY = phase;
    }

    public void setPhaseX(float phase) {
        this.mPhaseX = phase;
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }
}
