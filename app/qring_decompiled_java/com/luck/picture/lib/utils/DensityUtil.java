package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class DensityUtil {
    public static int getRealScreenWidth(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getApplicationContext().getSystemService("window");
        android.graphics.Point point = new android.graphics.Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static int getRealScreenHeight(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getApplicationContext().getSystemService("window");
        android.graphics.Point point = new android.graphics.Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int getScreenHeight(android.content.Context context) {
        return getRealScreenHeight(context) - getStatusNavigationBarHeight(context);
    }

    private static int getStatusNavigationBarHeight(android.content.Context context) {
        if (isNavBarVisible(context)) {
            return getStatusBarHeight(context) + getNavigationBarHeight(context);
        }
        return getStatusBarHeight(context);
    }

    public static int getStatusBarHeight(android.content.Context context) {
        int statusBarHeight;
        int dimensionPixelSize;
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            try {
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(identifier);
                dimensionPixelSize = system.getDimensionPixelSize(identifier);
                if (dimensionPixelSize < dimensionPixelSize2) {
                    float f = (dimensionPixelSize2 * system.getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                    dimensionPixelSize = (int) (f >= 0.0f ? f + 0.5f : f - 0.5f);
                }
            } catch (java.lang.Exception unused) {
                statusBarHeight = getStatusBarHeight();
            }
        } else {
            dimensionPixelSize = 0;
        }
        statusBarHeight = dimensionPixelSize;
        return statusBarHeight == 0 ? dip2px(context, 26.0f) : statusBarHeight;
    }

    public static int getStatusBarHeight() {
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static boolean isNavBarVisible(android.content.Context context) {
        boolean z;
        if (!(context instanceof android.app.Activity)) {
            return false;
        }
        android.app.Activity activity = (android.app.Activity) context;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            android.view.View childAt = viewGroup.getChildAt(i);
            int id = childAt.getId();
            if (id != -1 && "navigationBarBackground".equals(getResNameById(activity, id)) && childAt.getVisibility() == 0) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return z;
        }
        if (com.luck.picture.lib.immersive.RomUtils.isSamsung() && android.os.Build.VERSION.SDK_INT >= 17 && android.os.Build.VERSION.SDK_INT < 29) {
            try {
                return android.provider.Settings.Global.getInt(activity.getContentResolver(), "navigationbar_hide_bar_enabled") == 0;
            } catch (java.lang.Exception unused) {
            }
        }
        return (viewGroup.getSystemUiVisibility() & 2) == 0;
    }

    private static java.lang.String getResNameById(android.content.Context context, int i) {
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static int getNavigationBarWidth(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 14 || !isNavBarVisible(context)) {
            return 0;
        }
        return getInternalDimensionSize(context, "navigation_bar_width");
    }

    public static int getNavigationBarHeight(android.content.Context context) {
        boolean z = context.getResources().getConfiguration().orientation == 1;
        if (isNavBarVisible(context)) {
            return getInternalDimensionSize(context, z ? "navigation_bar_height" : "navigation_bar_height_landscape");
        }
        return 0;
    }

    private static int getInternalDimensionSize(android.content.Context context, java.lang.String str) {
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

    private static float getSmallestWidthDp(android.app.Activity activity) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        return java.lang.Math.min(displayMetrics.widthPixels / displayMetrics.density, displayMetrics.heightPixels / displayMetrics.density);
    }

    public static boolean isNavigationAtBottom(android.app.Activity activity) {
        return getSmallestWidthDp(activity) >= 600.0f || (activity.getResources().getConfiguration().orientation == 1);
    }

    public static int dip2px(android.content.Context context, float f) {
        return (int) ((f * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
