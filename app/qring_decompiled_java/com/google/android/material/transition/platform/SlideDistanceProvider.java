package com.google.android.material.transition.platform;

/* loaded from: /tmp/dex/classes2.dex */
public final class SlideDistanceProvider implements com.google.android.material.transition.platform.VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    private int slideDistance = -1;
    private int slideEdge;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i) {
        this.slideEdge = i;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideEdge(int i) {
        this.slideEdge = i;
    }

    public int getSlideDistance() {
        return this.slideDistance;
    }

    public void setSlideDistance(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.slideDistance = i;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public android.animation.Animator createAppear(android.view.ViewGroup viewGroup, android.view.View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public android.animation.Animator createDisappear(android.view.ViewGroup viewGroup, android.view.View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    private int getSlideDistanceOrDefault(android.content.Context context) {
        int i = this.slideDistance;
        return i != -1 ? i : context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static android.animation.Animator createTranslationAppearAnimator(android.view.View view, android.view.View view2, int i, int i2) {
        if (i == 3) {
            return createTranslationXAnimator(view2, i2, 0.0f);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, -i2, 0.0f);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, -i2, 0.0f);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, i2, 0.0f);
        }
        if (i == 8388611) {
            return createTranslationXAnimator(view2, isRtl(view) ? i2 : -i2, 0.0f);
        }
        if (i == 8388613) {
            return createTranslationXAnimator(view2, isRtl(view) ? -i2 : i2, 0.0f);
        }
        throw new java.lang.IllegalArgumentException("Invalid slide direction: " + i);
    }

    private static android.animation.Animator createTranslationDisappearAnimator(android.view.View view, android.view.View view2, int i, int i2) {
        if (i == 3) {
            return createTranslationXAnimator(view2, 0.0f, -i2);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, 0.0f, i2);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, 0.0f, i2);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, 0.0f, -i2);
        }
        if (i == 8388611) {
            return createTranslationXAnimator(view2, 0.0f, isRtl(view) ? -i2 : i2);
        }
        if (i == 8388613) {
            return createTranslationXAnimator(view2, 0.0f, isRtl(view) ? i2 : -i2);
        }
        throw new java.lang.IllegalArgumentException("Invalid slide direction: " + i);
    }

    private static android.animation.Animator createTranslationXAnimator(android.view.View view, float f, float f2) {
        return android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_X, f, f2));
    }

    private static android.animation.Animator createTranslationYAnimator(android.view.View view, float f, float f2) {
        return android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, f, f2));
    }

    private static boolean isRtl(android.view.View view) {
        return androidx.core.view.ViewCompat.getLayoutDirection(view) == 1;
    }
}
