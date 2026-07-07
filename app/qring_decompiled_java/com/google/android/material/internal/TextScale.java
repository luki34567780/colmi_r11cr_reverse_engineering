package com.google.android.material.internal;

/* loaded from: /tmp/dex/classes2.dex */
public class TextScale extends androidx.transition.Transition {
    private static final java.lang.String PROPNAME_SCALE = "android:textscale:scale";

    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    private void captureValues(androidx.transition.TransitionValues transitionValues) {
        if (transitionValues.view instanceof android.widget.TextView) {
            transitionValues.values.put(PROPNAME_SCALE, java.lang.Float.valueOf(((android.widget.TextView) transitionValues.view).getScaleX()));
        }
    }

    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof android.widget.TextView) || !(transitionValues2.view instanceof android.widget.TextView)) {
            return null;
        }
        final android.widget.TextView textView = (android.widget.TextView) transitionValues2.view;
        java.util.Map map = transitionValues.values;
        java.util.Map map2 = transitionValues2.values;
        float floatValue = map.get(PROPNAME_SCALE) != null ? ((java.lang.Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float floatValue2 = map2.get(PROPNAME_SCALE) != null ? ((java.lang.Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float floatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
            }
        });
        return ofFloat;
    }
}
