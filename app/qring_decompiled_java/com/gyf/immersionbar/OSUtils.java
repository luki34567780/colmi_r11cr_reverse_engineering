package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
public class OSUtils {
    private static final java.lang.String KEY_DISPLAY = "ro.build.display.id";
    private static final java.lang.String KEY_EMUI_VERSION_NAME = "ro.build.version.emui";
    private static final java.lang.String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";

    public static boolean isMIUI() {
        return !android.text.TextUtils.isEmpty(getSystemProperty(KEY_MIUI_VERSION_NAME, ""));
    }

    public static boolean isMIUI6Later() {
        java.lang.String mIUIVersion = getMIUIVersion();
        if (mIUIVersion.isEmpty()) {
            return false;
        }
        try {
            return java.lang.Integer.valueOf(mIUIVersion.substring(1)).intValue() >= 6;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public static java.lang.String getMIUIVersion() {
        return isMIUI() ? getSystemProperty(KEY_MIUI_VERSION_NAME, "") : "";
    }

    public static boolean isEMUI() {
        return !android.text.TextUtils.isEmpty(getSystemProperty(KEY_EMUI_VERSION_NAME, ""));
    }

    public static java.lang.String getEMUIVersion() {
        return isEMUI() ? getSystemProperty(KEY_EMUI_VERSION_NAME, "") : "";
    }

    public static boolean isEMUI3_1() {
        java.lang.String eMUIVersion = getEMUIVersion();
        return "EmotionUI 3".equals(eMUIVersion) || eMUIVersion.contains("EmotionUI_3.1");
    }

    public static boolean isEMUI3_0() {
        return getEMUIVersion().contains("EmotionUI_3.0");
    }

    public static boolean isEMUI3_x() {
        return isEMUI3_0() || isEMUI3_1();
    }

    public static boolean isFlymeOS() {
        return getFlymeOSFlag().toLowerCase().contains("flyme");
    }

    public static boolean isFlymeOS4Later() {
        int intValue;
        java.lang.String flymeOSVersion = getFlymeOSVersion();
        if (flymeOSVersion.isEmpty()) {
            return false;
        }
        try {
            if (flymeOSVersion.toLowerCase().contains("os")) {
                intValue = java.lang.Integer.valueOf(flymeOSVersion.substring(9, 10)).intValue();
            } else {
                intValue = java.lang.Integer.valueOf(flymeOSVersion.substring(6, 7)).intValue();
            }
            return intValue >= 4;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isFlymeOS5() {
        int intValue;
        java.lang.String flymeOSVersion = getFlymeOSVersion();
        if (flymeOSVersion.isEmpty()) {
            return false;
        }
        try {
            if (flymeOSVersion.toLowerCase().contains("os")) {
                intValue = java.lang.Integer.valueOf(flymeOSVersion.substring(9, 10)).intValue();
            } else {
                intValue = java.lang.Integer.valueOf(flymeOSVersion.substring(6, 7)).intValue();
            }
            return intValue == 5;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public static java.lang.String getFlymeOSVersion() {
        return isFlymeOS() ? getSystemProperty(KEY_DISPLAY, "") : "";
    }

    private static java.lang.String getFlymeOSFlag() {
        return getSystemProperty(KEY_DISPLAY, "");
    }

    private static java.lang.String getSystemProperty(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, str, str2);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return str2;
        }
    }
}
