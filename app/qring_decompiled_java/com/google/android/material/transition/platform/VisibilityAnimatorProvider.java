package com.google.android.material.transition.platform;

/* loaded from: /tmp/dex/classes2.dex */
public interface VisibilityAnimatorProvider {
    android.animation.Animator createAppear(android.view.ViewGroup viewGroup, android.view.View view);

    android.animation.Animator createDisappear(android.view.ViewGroup viewGroup, android.view.View view);
}
