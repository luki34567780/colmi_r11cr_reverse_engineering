package androidx.core.view.animation;

/* loaded from: classes.dex */
public final class PathInterpolatorCompat {
    private PathInterpolatorCompat() {
    }

    public static android.view.animation.Interpolator create(android.graphics.Path path) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return new android.view.animation.PathInterpolator(path);
        }
        return new androidx.core.view.animation.PathInterpolatorApi14(path);
    }

    public static android.view.animation.Interpolator create(float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return new android.view.animation.PathInterpolator(f, f2);
        }
        return new androidx.core.view.animation.PathInterpolatorApi14(f, f2);
    }

    public static android.view.animation.Interpolator create(float f, float f2, float f3, float f4) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return new android.view.animation.PathInterpolator(f, f2, f3, f4);
        }
        return new androidx.core.view.animation.PathInterpolatorApi14(f, f2, f3, f4);
    }
}
