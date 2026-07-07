package com.luck.picture.lib.photoview;

/* loaded from: /tmp/dex/classes2.dex */
class Compat {
    Compat() {
    }

    public static void postOnAnimation(android.view.View view, java.lang.Runnable runnable) {
        postOnAnimationJellyBean(view, runnable);
    }

    private static void postOnAnimationJellyBean(android.view.View view, java.lang.Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
