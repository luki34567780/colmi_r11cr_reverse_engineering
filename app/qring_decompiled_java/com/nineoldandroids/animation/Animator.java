package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class Animator implements java.lang.Cloneable {
    java.util.ArrayList<com.nineoldandroids.animation.Animator.AnimatorListener> mListeners = null;

    public interface AnimatorListener {
        void onAnimationCancel(com.nineoldandroids.animation.Animator animator);

        void onAnimationEnd(com.nineoldandroids.animation.Animator animator);

        void onAnimationRepeat(com.nineoldandroids.animation.Animator animator);

        void onAnimationStart(com.nineoldandroids.animation.Animator animator);
    }

    public void cancel() {
    }

    public void end() {
    }

    public abstract long getDuration();

    public abstract long getStartDelay();

    public abstract boolean isRunning();

    public abstract com.nineoldandroids.animation.Animator setDuration(long j);

    public abstract void setInterpolator(android.view.animation.Interpolator interpolator);

    public abstract void setStartDelay(long j);

    public void setTarget(java.lang.Object obj) {
    }

    public void setupEndValues() {
    }

    public void setupStartValues() {
    }

    public void start() {
    }

    public boolean isStarted() {
        return isRunning();
    }

    public void addListener(com.nineoldandroids.animation.Animator.AnimatorListener animatorListener) {
        if (this.mListeners == null) {
            this.mListeners = new java.util.ArrayList<>();
        }
        this.mListeners.add(animatorListener);
    }

    public void removeListener(com.nineoldandroids.animation.Animator.AnimatorListener animatorListener) {
        java.util.ArrayList<com.nineoldandroids.animation.Animator.AnimatorListener> arrayList = this.mListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
    }

    public java.util.ArrayList<com.nineoldandroids.animation.Animator.AnimatorListener> getListeners() {
        return this.mListeners;
    }

    public void removeAllListeners() {
        java.util.ArrayList<com.nineoldandroids.animation.Animator.AnimatorListener> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.clear();
            this.mListeners = null;
        }
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.nineoldandroids.animation.Animator mo106clone() {
        try {
            com.nineoldandroids.animation.Animator animator = (com.nineoldandroids.animation.Animator) super.clone();
            java.util.ArrayList<com.nineoldandroids.animation.Animator.AnimatorListener> arrayList = this.mListeners;
            if (arrayList != null) {
                animator.mListeners = new java.util.ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    animator.mListeners.add(arrayList.get(i));
                }
            }
            return animator;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.AssertionError();
        }
    }
}
