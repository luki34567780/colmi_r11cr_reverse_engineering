package com.qcwireless.qcwatch.base.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class AndroidVersion {
    static final int ANDROID_10 = 29;
    static final int ANDROID_11 = 30;
    static final int ANDROID_12 = 31;
    static final int ANDROID_4_0 = 14;
    static final int ANDROID_4_1 = 16;
    static final int ANDROID_4_2 = 17;
    static final int ANDROID_4_3 = 18;
    static final int ANDROID_4_4 = 19;
    static final int ANDROID_5 = 21;
    static final int ANDROID_5_1 = 22;
    static final int ANDROID_6 = 23;
    static final int ANDROID_7 = 24;
    static final int ANDROID_7_1 = 25;
    static final int ANDROID_8 = 26;
    static final int ANDROID_8_1 = 27;
    static final int ANDROID_9 = 28;

    public static boolean isAndroid12() {
        return android.os.Build.VERSION.SDK_INT >= 31;
    }

    public static boolean isAndroid11() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    public static boolean isAndroid10() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    static boolean isAndroid9() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    static boolean isAndroid8() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isAndroid6() {
        return android.os.Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isAndroid5_1() {
        return android.os.Build.VERSION.SDK_INT >= 22;
    }
}
