package com.bumptech.glide.util;

/* loaded from: /tmp/dex/classes2.dex */
public final class LogTime {
    private static final double MILLIS_MULTIPLIER;

    static {
        MILLIS_MULTIPLIER = android.os.Build.VERSION.SDK_INT >= 17 ? 1.0d / java.lang.Math.pow(10.0d, 6.0d) : 1.0d;
    }

    private LogTime() {
    }

    public static long getLogTime() {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return android.os.SystemClock.elapsedRealtimeNanos();
        }
        return android.os.SystemClock.uptimeMillis();
    }

    public static double getElapsedMillis(long j) {
        return (getLogTime() - j) * MILLIS_MULTIPLIER;
    }
}
