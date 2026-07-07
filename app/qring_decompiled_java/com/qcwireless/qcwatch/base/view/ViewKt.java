package com.qcwireless.qcwatch.base.view;

/* compiled from: View.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\f\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\f\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0016\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\n"}, d2 = {"gone", "", "Landroid/view/View;", "goneAlphaAnimation", "duration", "", "invisible", "invisibleAlphaAnimation", "visible", "visibleAlphaAnimation", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ViewKt {
    public static final void visible(android.view.View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public static /* synthetic */ void visibleAlphaAnimation$default(android.view.View view, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        visibleAlphaAnimation(view, j);
    }

    public static final void visibleAlphaAnimation(android.view.View view, long j) {
        if (view != null) {
            view.setVisibility(0);
        }
        if (view != null) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(j);
            alphaAnimation.setFillAfter(true);
            view.startAnimation(alphaAnimation);
        }
    }

    public static final void gone(android.view.View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public static /* synthetic */ void goneAlphaAnimation$default(android.view.View view, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        goneAlphaAnimation(view, j);
    }

    public static final void goneAlphaAnimation(android.view.View view, long j) {
        if (view != null) {
            view.setVisibility(8);
        }
        if (view != null) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(j);
            alphaAnimation.setFillAfter(true);
            view.startAnimation(alphaAnimation);
        }
    }

    public static final void invisible(android.view.View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    public static /* synthetic */ void invisibleAlphaAnimation$default(android.view.View view, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        invisibleAlphaAnimation(view, j);
    }

    public static final void invisibleAlphaAnimation(android.view.View view, long j) {
        if (view != null) {
            view.setVisibility(4);
        }
        if (view != null) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(j);
            alphaAnimation.setFillAfter(true);
            view.startAnimation(alphaAnimation);
        }
    }
}
