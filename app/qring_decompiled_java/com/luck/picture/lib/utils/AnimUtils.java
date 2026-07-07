package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class AnimUtils {
    public static final int DURATION = 250;

    public static void rotateArrow(android.widget.ImageView imageView, boolean z) {
        float f = 0.0f;
        float f2 = 180.0f;
        if (!z) {
            f = 180.0f;
            f2 = 0.0f;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "rotation", f, f2);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.start();
    }

    public static void selectZoom(android.view.View view) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.05f, 1.0f), android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
        animatorSet.start();
    }
}
