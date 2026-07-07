package com.nineoldandroids.view;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class ViewPropertyAnimator {
    private static final java.util.WeakHashMap<android.view.View, com.nineoldandroids.view.ViewPropertyAnimator> ANIMATORS = new java.util.WeakHashMap<>(0);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator alpha(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator alphaBy(float f);

    public abstract void cancel();

    public abstract long getDuration();

    public abstract long getStartDelay();

    public abstract com.nineoldandroids.view.ViewPropertyAnimator rotation(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator rotationBy(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator rotationX(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator rotationXBy(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator rotationY(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator rotationYBy(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator scaleX(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator scaleXBy(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator scaleY(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator scaleYBy(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator setDuration(long j);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator setInterpolator(android.view.animation.Interpolator interpolator);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator setListener(com.nineoldandroids.animation.Animator.AnimatorListener animatorListener);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator setStartDelay(long j);

    public abstract void start();

    public abstract com.nineoldandroids.view.ViewPropertyAnimator translationX(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator translationXBy(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator translationY(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator translationYBy(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator x(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator xBy(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator y(float f);

    public abstract com.nineoldandroids.view.ViewPropertyAnimator yBy(float f);

    public static com.nineoldandroids.view.ViewPropertyAnimator animate(android.view.View view) {
        java.util.WeakHashMap<android.view.View, com.nineoldandroids.view.ViewPropertyAnimator> weakHashMap = ANIMATORS;
        com.nineoldandroids.view.ViewPropertyAnimator viewPropertyAnimator = weakHashMap.get(view);
        if (viewPropertyAnimator == null) {
            int intValue = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK).intValue();
            if (intValue >= 14) {
                viewPropertyAnimator = new com.nineoldandroids.view.ViewPropertyAnimatorICS(view);
            } else if (intValue >= 11) {
                viewPropertyAnimator = new com.nineoldandroids.view.ViewPropertyAnimatorHC(view);
            } else {
                viewPropertyAnimator = new com.nineoldandroids.view.ViewPropertyAnimatorPreHC(view);
            }
            weakHashMap.put(view, viewPropertyAnimator);
        }
        return viewPropertyAnimator;
    }
}
