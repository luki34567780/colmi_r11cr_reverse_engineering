package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class VibrateUtils {
    private static android.os.Vibrator vibrator;

    private VibrateUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static void vibrate(long j) {
        android.os.Vibrator vibrator2 = getVibrator();
        if (vibrator2 == null) {
            return;
        }
        vibrator2.vibrate(j);
    }

    public static void vibrate(long[] jArr, int i) {
        android.os.Vibrator vibrator2 = getVibrator();
        if (vibrator2 == null) {
            return;
        }
        vibrator2.vibrate(jArr, i);
    }

    public static void cancel() {
        android.os.Vibrator vibrator2 = getVibrator();
        if (vibrator2 == null) {
            return;
        }
        vibrator2.cancel();
    }

    private static android.os.Vibrator getVibrator() {
        if (vibrator == null) {
            vibrator = (android.os.Vibrator) com.blankj.utilcode.util.Utils.getApp().getSystemService("vibrator");
        }
        return vibrator;
    }
}
