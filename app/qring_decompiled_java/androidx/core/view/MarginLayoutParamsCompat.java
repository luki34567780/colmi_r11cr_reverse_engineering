package androidx.core.view;

/* loaded from: classes.dex */
public final class MarginLayoutParamsCompat {
    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }

    public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.isMarginRelative();
        }
        return false;
    }

    public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = android.os.Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getLayoutDirection() : 0;
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setLayoutDirection(i);
        }
    }

    public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.resolveLayoutDirection(i);
        }
    }

    private MarginLayoutParamsCompat() {
    }
}
