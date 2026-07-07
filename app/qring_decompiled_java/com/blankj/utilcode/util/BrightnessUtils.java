package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class BrightnessUtils {
    private BrightnessUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isAutoBrightnessEnabled() {
        try {
            return android.provider.Settings.System.getInt(com.blankj.utilcode.util.Utils.getApp().getContentResolver(), "screen_brightness_mode") == 1;
        } catch (android.provider.Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean setAutoBrightnessEnabled(boolean z) {
        return android.provider.Settings.System.putInt(com.blankj.utilcode.util.Utils.getApp().getContentResolver(), "screen_brightness_mode", z ? 1 : 0);
    }

    public static int getBrightness() {
        try {
            return android.provider.Settings.System.getInt(com.blankj.utilcode.util.Utils.getApp().getContentResolver(), "screen_brightness");
        } catch (android.provider.Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean setBrightness(int i) {
        android.content.ContentResolver contentResolver = com.blankj.utilcode.util.Utils.getApp().getContentResolver();
        boolean putInt = android.provider.Settings.System.putInt(contentResolver, "screen_brightness", i);
        contentResolver.notifyChange(android.provider.Settings.System.getUriFor("screen_brightness"), null);
        return putInt;
    }

    public static void setWindowBrightness(android.view.Window window, int i) {
        java.util.Objects.requireNonNull(window, "Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = i / 255.0f;
        window.setAttributes(attributes);
    }

    public static int getWindowBrightness(android.view.Window window) {
        java.util.Objects.requireNonNull(window, "Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        float f = window.getAttributes().screenBrightness;
        return f < 0.0f ? getBrightness() : (int) (f * 255.0f);
    }
}
