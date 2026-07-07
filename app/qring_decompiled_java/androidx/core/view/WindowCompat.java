package androidx.core.view;

/* loaded from: classes.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    private WindowCompat() {
    }

    public static <T extends android.view.View> T requireViewById(android.view.Window window, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return (T) window.requireViewById(i);
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(android.view.Window window, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.WindowCompat.Impl30.setDecorFitsSystemWindows(window, z);
        } else if (android.os.Build.VERSION.SDK_INT >= 16) {
            androidx.core.view.WindowCompat.Impl16.setDecorFitsSystemWindows(window, z);
        }
    }

    public static androidx.core.view.WindowInsetsControllerCompat getInsetsController(android.view.Window window, android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.WindowCompat.Impl30.getInsetsController(window);
        }
        return new androidx.core.view.WindowInsetsControllerCompat(window, view);
    }

    private static class Impl16 {
        private Impl16() {
        }

        static void setDecorFitsSystemWindows(android.view.Window window, boolean z) {
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    private static class Impl30 {
        private Impl30() {
        }

        static void setDecorFitsSystemWindows(android.view.Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }

        static androidx.core.view.WindowInsetsControllerCompat getInsetsController(android.view.Window window) {
            android.view.WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                return androidx.core.view.WindowInsetsControllerCompat.toWindowInsetsControllerCompat(insetsController);
            }
            return null;
        }
    }
}
