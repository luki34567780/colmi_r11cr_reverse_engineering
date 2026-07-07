package com.yalantis.ucrop.statusbar;

/* loaded from: classes3.dex */
public class ImmersiveManager {
    private static final java.lang.String TAG_FAKE_STATUS_BAR_VIEW = "TAG_FAKE_STATUS_BAR_VIEW";
    private static final java.lang.String TAG_MARGIN_ADDED = "TAG_MARGIN_ADDED";

    public static void immersiveAboveAPI23(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i, int i2, boolean z) {
        immersiveAboveAPI23(appCompatActivity, false, false, i, i2, z);
    }

    public static void immersiveAboveAPI23(androidx.appcompat.app.AppCompatActivity appCompatActivity, boolean z, boolean z2, int i, int i2, boolean z3) {
        try {
            android.view.Window window = appCompatActivity.getWindow();
            if (android.os.Build.VERSION.SDK_INT < 21) {
                if (z3) {
                    initBarBelowLOLLIPOP(appCompatActivity);
                    return;
                } else {
                    window.setFlags(67108864, 67108864);
                    return;
                }
            }
            boolean z4 = true;
            if (z && z2) {
                window.clearFlags(201326592);
                com.yalantis.ucrop.statusbar.LightStatusBarUtils.setLightStatusBar(appCompatActivity, true, true, i == 0, z3);
                window.addFlags(Integer.MIN_VALUE);
            } else if (z || z2) {
                if (z) {
                    return;
                }
                window.requestFeature(1);
                window.clearFlags(201326592);
                com.yalantis.ucrop.statusbar.LightStatusBarUtils.setLightStatusBar(appCompatActivity, false, true, i == 0, z3);
                window.addFlags(Integer.MIN_VALUE);
            } else if (android.os.Build.VERSION.SDK_INT < 23 && z3) {
                initBarBelowLOLLIPOP(appCompatActivity);
            } else {
                window.requestFeature(1);
                window.clearFlags(201326592);
                if (i != 0) {
                    z4 = false;
                }
                com.yalantis.ucrop.statusbar.LightStatusBarUtils.setLightStatusBar(appCompatActivity, false, false, z4, z3);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(i);
            window.setNavigationBarColor(i2);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private static void initBarBelowLOLLIPOP(android.app.Activity activity) {
        activity.getWindow().addFlags(67108864);
        setupStatusBarView(activity);
    }

    private static void setupStatusBarView(android.app.Activity activity) {
        android.view.Window window = activity.getWindow();
        android.view.View findViewWithTag = window.getDecorView().findViewWithTag(TAG_FAKE_STATUS_BAR_VIEW);
        if (findViewWithTag == null) {
            findViewWithTag = new android.view.View(activity);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, com.yalantis.ucrop.util.DensityUtil.getStatusBarHeight(activity));
            layoutParams.gravity = 48;
            findViewWithTag.setLayoutParams(layoutParams);
            findViewWithTag.setVisibility(0);
            findViewWithTag.setTag(TAG_MARGIN_ADDED);
            ((android.view.ViewGroup) window.getDecorView()).addView(findViewWithTag);
        }
        findViewWithTag.setBackgroundColor(0);
    }
}
