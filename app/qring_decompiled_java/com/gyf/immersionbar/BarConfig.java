package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
class BarConfig {
    private final int mActionBarHeight;
    private final boolean mHasNavigationBar;
    private final boolean mInPortrait;
    private final int mNavigationBarHeight;
    private final int mNavigationBarWidth;
    private final float mSmallestWidthDp;
    private final int mStatusBarHeight;

    BarConfig(android.app.Activity activity) {
        this.mInPortrait = activity.getResources().getConfiguration().orientation == 1;
        this.mSmallestWidthDp = getSmallestWidthDp(activity);
        this.mStatusBarHeight = getInternalDimensionSize(activity, "status_bar_height");
        this.mActionBarHeight = getActionBarHeight(activity);
        int navigationBarHeight = getNavigationBarHeight(activity);
        this.mNavigationBarHeight = navigationBarHeight;
        this.mNavigationBarWidth = getNavigationBarWidth(activity);
        this.mHasNavigationBar = navigationBarHeight > 0;
    }

    private int getActionBarHeight(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT < 14) {
            return 0;
        }
        android.view.View findViewById = activity.getWindow().findViewById(com.gyf.immersionbar.R.id.action_bar_container);
        int measuredHeight = findViewById != null ? findViewById.getMeasuredHeight() : 0;
        if (measuredHeight != 0) {
            return measuredHeight;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        activity.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true);
        return android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
    }

    private int getNavigationBarHeight(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 14 || !hasNavBar((android.app.Activity) context)) {
            return 0;
        }
        return getInternalDimensionSize(context, this.mInPortrait ? "navigation_bar_height" : "navigation_bar_height_landscape");
    }

    private int getNavigationBarWidth(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 14 || !hasNavBar((android.app.Activity) context)) {
            return 0;
        }
        return getInternalDimensionSize(context, "navigation_bar_width");
    }

    private boolean hasNavBar(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            if (android.provider.Settings.Global.getInt(activity.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
                return false;
            }
            if (com.gyf.immersionbar.OSUtils.isEMUI()) {
                if (com.gyf.immersionbar.OSUtils.isEMUI3_x() || android.os.Build.VERSION.SDK_INT < 21) {
                    if (android.provider.Settings.System.getInt(activity.getContentResolver(), "navigationbar_is_min", 0) != 0) {
                        return false;
                    }
                } else if (android.provider.Settings.Global.getInt(activity.getContentResolver(), "navigationbar_is_min", 0) != 0) {
                    return false;
                }
            }
        }
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        return i2 - displayMetrics2.widthPixels > 0 || i - displayMetrics2.heightPixels > 0;
    }

    private int getInternalDimensionSize(android.content.Context context, java.lang.String str) {
        try {
            int identifier = android.content.res.Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                float f = (dimensionPixelSize * android.content.res.Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                return (int) (f >= 0.0f ? f + 0.5f : f - 0.5f);
            }
        } catch (android.content.res.Resources.NotFoundException unused) {
        }
        return 0;
    }

    private float getSmallestWidthDp(android.app.Activity activity) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        return java.lang.Math.min(displayMetrics.widthPixels / displayMetrics.density, displayMetrics.heightPixels / displayMetrics.density);
    }

    boolean isNavigationAtBottom() {
        return this.mSmallestWidthDp >= 600.0f || this.mInPortrait;
    }

    int getStatusBarHeight() {
        return this.mStatusBarHeight;
    }

    int getActionBarHeight() {
        return this.mActionBarHeight;
    }

    boolean hasNavigationBar() {
        return this.mHasNavigationBar;
    }

    int getNavigationBarHeight() {
        return this.mNavigationBarHeight;
    }

    int getNavigationBarWidth() {
        return this.mNavigationBarWidth;
    }
}
