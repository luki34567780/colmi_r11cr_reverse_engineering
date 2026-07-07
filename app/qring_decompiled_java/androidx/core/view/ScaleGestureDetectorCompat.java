package androidx.core.view;

/* loaded from: classes.dex */
public final class ScaleGestureDetectorCompat {
    private ScaleGestureDetectorCompat() {
    }

    @java.lang.Deprecated
    public static void setQuickScaleEnabled(java.lang.Object obj, boolean z) {
        setQuickScaleEnabled((android.view.ScaleGestureDetector) obj, z);
    }

    public static void setQuickScaleEnabled(android.view.ScaleGestureDetector scaleGestureDetector, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }

    @java.lang.Deprecated
    public static boolean isQuickScaleEnabled(java.lang.Object obj) {
        return isQuickScaleEnabled((android.view.ScaleGestureDetector) obj);
    }

    public static boolean isQuickScaleEnabled(android.view.ScaleGestureDetector scaleGestureDetector) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }
        return false;
    }
}
