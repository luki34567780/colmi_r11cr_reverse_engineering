package androidx.core.view;

/* loaded from: classes.dex */
public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    private ViewGroupCompat() {
    }

    @java.lang.Deprecated
    public static boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @java.lang.Deprecated
    public static void setMotionEventSplittingEnabled(android.view.ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static int getLayoutMode(android.view.ViewGroup viewGroup) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return viewGroup.getLayoutMode();
        }
        return 0;
    }

    public static void setLayoutMode(android.view.ViewGroup viewGroup, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            viewGroup.setLayoutMode(i);
        }
    }

    public static void setTransitionGroup(android.view.ViewGroup viewGroup, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            viewGroup.setTransitionGroup(z);
        } else {
            viewGroup.setTag(androidx.core.R.id.tag_transition_group, java.lang.Boolean.valueOf(z));
        }
    }

    public static boolean isTransitionGroup(android.view.ViewGroup viewGroup) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        java.lang.Boolean bool = (java.lang.Boolean) viewGroup.getTag(androidx.core.R.id.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && androidx.core.view.ViewCompat.getTransitionName(viewGroup) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getNestedScrollAxes(android.view.ViewGroup viewGroup) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return viewGroup.getNestedScrollAxes();
        }
        if (viewGroup instanceof androidx.core.view.NestedScrollingParent) {
            return ((androidx.core.view.NestedScrollingParent) viewGroup).getNestedScrollAxes();
        }
        return 0;
    }
}
