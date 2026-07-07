package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwichMR1() {
        return android.os.Build.VERSION.SDK_INT >= 15;
    }

    public static boolean isAtLeastJellyBean() {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean isAtLeastJellyBeanMR1() {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }

    public static boolean isAtLeastJellyBeanMR2() {
        return android.os.Build.VERSION.SDK_INT >= 18;
    }

    public static boolean isAtLeastKitKat() {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public static boolean isAtLeastKitKatWatch() {
        return android.os.Build.VERSION.SDK_INT >= 20;
    }

    public static boolean isAtLeastLollipop() {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public static boolean isAtLeastLollipopMR1() {
        return android.os.Build.VERSION.SDK_INT >= 22;
    }

    public static boolean isAtLeastM() {
        return android.os.Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isAtLeastN() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    public static boolean isAtLeastO() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isAtLeastP() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    public static boolean isAtLeastQ() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    public static boolean isAtLeastR() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    public static boolean isAtLeastS() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return isAtLeastR() && android.os.Build.VERSION.CODENAME.length() == 1 && android.os.Build.VERSION.CODENAME.charAt(0) >= 'S' && android.os.Build.VERSION.CODENAME.charAt(0) <= 'Z';
    }

    public static boolean isAtLeastT() {
        return isAtLeastS() && android.os.Build.VERSION.CODENAME.charAt(0) >= 'T' && android.os.Build.VERSION.CODENAME.charAt(0) <= 'Z';
    }
}
