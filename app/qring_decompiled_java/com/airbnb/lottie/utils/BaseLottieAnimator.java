package com.airbnb.lottie.utils;

/* loaded from: classes.dex */
public abstract class BaseLottieAnimator extends android.animation.ValueAnimator {
    private final java.util.Set<android.animation.ValueAnimator.AnimatorUpdateListener> updateListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<android.animation.Animator.AnimatorListener> listeners = new java.util.concurrent.CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public android.animation.ValueAnimator setDuration(long j) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.updateListeners.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.updateListeners.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.updateListeners.clear();
    }

    @Override // android.animation.Animator
    public void addListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.listeners.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.listeners.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.listeners.clear();
    }

    void notifyStart(boolean z) {
        for (android.animation.Animator.AnimatorListener animatorListener : this.listeners) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    void notifyRepeat() {
        java.util.Iterator<android.animation.Animator.AnimatorListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void notifyEnd(boolean z) {
        for (android.animation.Animator.AnimatorListener animatorListener : this.listeners) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void notifyCancel() {
        java.util.Iterator<android.animation.Animator.AnimatorListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void notifyUpdate() {
        java.util.Iterator<android.animation.ValueAnimator.AnimatorUpdateListener> it = this.updateListeners.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }
}
