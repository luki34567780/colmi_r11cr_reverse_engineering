package com.luck.picture.lib.immersive;

/* loaded from: /tmp/dex/classes2.dex */
public class ImmersiveManager {
    private static final java.lang.String TAG_FAKE_STATUS_BAR_VIEW = "TAG_FAKE_STATUS_BAR_VIEW";
    private static final java.lang.String TAG_MARGIN_ADDED = "TAG_MARGIN_ADDED";
    private static final java.lang.String TAG_NAVIGATION_BAR_VIEW = "TAG_NAVIGATION_BAR_VIEW";

    public static void immersiveAboveAPI23(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i, int i2, boolean z) {
        immersiveAboveAPI23(appCompatActivity, false, false, i, i2, z);
    }

    public static void immersiveAboveAPI23(androidx.appcompat.app.AppCompatActivity appCompatActivity, boolean z, boolean z2, int i, int i2, boolean z3) {
        try {
            android.view.Window window = appCompatActivity.getWindow();
            if (android.os.Build.VERSION.SDK_INT >= 19 && android.os.Build.VERSION.SDK_INT < 21) {
                if (z3) {
                    initBarBelowLOLLIPOP(appCompatActivity);
                    return;
                } else {
                    window.setFlags(67108864, 67108864);
                    return;
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                boolean z4 = true;
                if (z && z2) {
                    window.clearFlags(201326592);
                    com.luck.picture.lib.immersive.LightStatusBarUtils.setLightStatusBar(appCompatActivity, true, true, i == 0, z3);
                    window.addFlags(com.bumptech.glide.request.target.Target.SIZE_ORIGINAL);
                } else if (z || z2) {
                    if (z) {
                        return;
                    }
                    window.requestFeature(1);
                    window.clearFlags(201326592);
                    com.luck.picture.lib.immersive.LightStatusBarUtils.setLightStatusBar(appCompatActivity, false, true, i == 0, z3);
                    window.addFlags(com.bumptech.glide.request.target.Target.SIZE_ORIGINAL);
                } else if (android.os.Build.VERSION.SDK_INT < 23 && z3) {
                    initBarBelowLOLLIPOP(appCompatActivity);
                } else {
                    window.requestFeature(1);
                    window.clearFlags(201326592);
                    if (i != 0) {
                        z4 = false;
                    }
                    com.luck.picture.lib.immersive.LightStatusBarUtils.setLightStatusBar(appCompatActivity, false, false, z4, z3);
                    window.addFlags(com.bumptech.glide.request.target.Target.SIZE_ORIGINAL);
                }
                window.setStatusBarColor(i);
                window.setNavigationBarColor(i2);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void translucentStatusBar(android.app.Activity activity, boolean z) {
        android.view.Window window = activity.getWindow();
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            window.addFlags(com.bumptech.glide.request.target.Target.SIZE_ORIGINAL);
        }
        window.clearFlags(67108864);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(0);
        }
        android.view.View decorView = window.getDecorView();
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            if (z) {
                decorView.setSystemUiVisibility(9472);
            } else {
                window.getDecorView().setSystemUiVisibility(1280);
            }
        } else if (z) {
            initBarBelowLOLLIPOP(activity);
        } else {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        android.view.View childAt = ((android.view.ViewGroup) window.findViewById(android.R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            androidx.core.view.ViewCompat.requestApplyInsets(childAt);
        }
    }

    private static void initBarBelowLOLLIPOP(android.app.Activity activity) {
        android.view.Window window = activity.getWindow();
        window.addFlags(67108864);
        setupStatusBarView(activity);
        if (com.luck.picture.lib.utils.DensityUtil.isNavBarVisible(activity)) {
            window.addFlags(134217728);
            setupNavBarView(activity);
        }
    }

    private static void setupStatusBarView(android.app.Activity activity) {
        android.view.Window window = activity.getWindow();
        android.view.View findViewWithTag = window.getDecorView().findViewWithTag(TAG_FAKE_STATUS_BAR_VIEW);
        if (findViewWithTag == null) {
            findViewWithTag = new android.view.View(activity);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, com.luck.picture.lib.utils.DensityUtil.getStatusBarHeight(activity));
            layoutParams.gravity = 48;
            findViewWithTag.setLayoutParams(layoutParams);
            findViewWithTag.setVisibility(0);
            findViewWithTag.setTag(TAG_MARGIN_ADDED);
            ((android.view.ViewGroup) window.getDecorView()).addView(findViewWithTag);
        }
        findViewWithTag.setBackgroundColor(0);
    }

    private static void setupNavBarView(android.app.Activity activity) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.view.Window window = activity.getWindow();
        android.view.View findViewWithTag = window.getDecorView().findViewWithTag(TAG_NAVIGATION_BAR_VIEW);
        if (findViewWithTag == null) {
            findViewWithTag = new android.view.View(activity);
            findViewWithTag.setTag(TAG_NAVIGATION_BAR_VIEW);
            ((android.view.ViewGroup) window.getDecorView()).addView(findViewWithTag);
        }
        if (com.luck.picture.lib.utils.DensityUtil.isNavigationAtBottom(activity)) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, com.luck.picture.lib.utils.DensityUtil.getNavigationBarHeight(activity));
            layoutParams.gravity = 80;
        } else {
            layoutParams = new android.widget.FrameLayout.LayoutParams(com.luck.picture.lib.utils.DensityUtil.getNavigationBarWidth(activity), -1);
            layoutParams.gravity = 8388613;
        }
        findViewWithTag.setLayoutParams(layoutParams);
        findViewWithTag.setBackgroundColor(0);
        findViewWithTag.setVisibility(0);
    }
}
