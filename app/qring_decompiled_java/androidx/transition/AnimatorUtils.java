package androidx.transition;

/* loaded from: classes.dex */
class AnimatorUtils {

    interface AnimatorPauseListenerCompat {
        void onAnimationPause(android.animation.Animator animator);

        void onAnimationResume(android.animation.Animator animator);
    }

    static void addPauseListener(android.animation.Animator animator, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }

    static void pause(android.animation.Animator animator) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        java.util.ArrayList<android.animation.Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                android.animation.Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat) {
                    ((androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    static void resume(android.animation.Animator animator) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        java.util.ArrayList<android.animation.Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                android.animation.Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat) {
                    ((androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }

    private AnimatorUtils() {
    }
}
