package com.google.android.material.transition.platform;

/* loaded from: /tmp/dex/classes2.dex */
abstract class MaterialVisibility<P extends com.google.android.material.transition.platform.VisibilityAnimatorProvider> extends android.transition.Visibility {
    private final P primaryAnimatorProvider;
    private com.google.android.material.transition.platform.VisibilityAnimatorProvider secondaryAnimatorProvider;

    protected MaterialVisibility(P p, com.google.android.material.transition.platform.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.primaryAnimatorProvider = p;
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
        setInterpolator(com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }

    public P getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    public com.google.android.material.transition.platform.VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    public void setSecondaryAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, false);
    }

    private android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, android.view.View view, boolean z) {
        android.animation.Animator createDisappear;
        android.animation.Animator createDisappear2;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z) {
            createDisappear = this.primaryAnimatorProvider.createAppear(viewGroup, view);
        } else {
            createDisappear = this.primaryAnimatorProvider.createDisappear(viewGroup, view);
        }
        if (createDisappear != null) {
            arrayList.add(createDisappear);
        }
        com.google.android.material.transition.platform.VisibilityAnimatorProvider visibilityAnimatorProvider = this.secondaryAnimatorProvider;
        if (visibilityAnimatorProvider != null) {
            if (z) {
                createDisappear2 = visibilityAnimatorProvider.createAppear(viewGroup, view);
            } else {
                createDisappear2 = visibilityAnimatorProvider.createDisappear(viewGroup, view);
            }
            if (createDisappear2 != null) {
                arrayList.add(createDisappear2);
            }
        }
        com.google.android.material.animation.AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }
}
