package com.google.android.material.floatingactionbutton;

/* loaded from: /tmp/dex/classes2.dex */
class AnimatorTracker {
    private android.animation.Animator currentAnimator;

    AnimatorTracker() {
    }

    public void onNextAnimationStart(android.animation.Animator animator) {
        cancelCurrent();
        this.currentAnimator = animator;
    }

    public void cancelCurrent() {
        android.animation.Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void clear() {
        this.currentAnimator = null;
    }
}
