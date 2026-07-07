package com.yalantis.ucrop.util;

/* loaded from: classes3.dex */
public class DensityUtil {
    public static int dip2px(android.content.Context context, float f) {
        return (int) ((f * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getStatusBarHeight(android.content.Context context) {
        int identifier = android.content.res.Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? dip2px(context, 26.0f) : dimensionPixelSize;
    }
}
