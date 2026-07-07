package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class DoubleUtils {
    private static final long TIME = 600;
    private static long lastClickTime;

    public static boolean isFastDoubleClick() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime - lastClickTime < TIME) {
            return true;
        }
        lastClickTime = elapsedRealtime;
        return false;
    }
}
