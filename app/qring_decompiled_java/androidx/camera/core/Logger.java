package androidx.camera.core;

/* loaded from: classes.dex */
public final class Logger {
    static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    private Logger() {
    }

    static void setMinLogLevel(int logLevel) {
        sMinLogLevel = logLevel;
    }

    static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    public static boolean isDebugEnabled(java.lang.String tag) {
        return sMinLogLevel <= 3 || android.util.Log.isLoggable(truncateTag(tag), 3);
    }

    public static boolean isInfoEnabled(java.lang.String tag) {
        return sMinLogLevel <= 4 || android.util.Log.isLoggable(truncateTag(tag), 4);
    }

    public static boolean isWarnEnabled(java.lang.String tag) {
        return sMinLogLevel <= 5 || android.util.Log.isLoggable(truncateTag(tag), 5);
    }

    public static boolean isErrorEnabled(java.lang.String tag) {
        return sMinLogLevel <= 6 || android.util.Log.isLoggable(truncateTag(tag), 6);
    }

    public static void d(java.lang.String tag, java.lang.String message) {
        d(tag, message, null);
    }

    public static void d(java.lang.String tag, java.lang.String message, final java.lang.Throwable throwable) {
        if (isDebugEnabled(tag)) {
            android.util.Log.d(truncateTag(tag), message, throwable);
        }
    }

    public static void i(java.lang.String tag, java.lang.String message) {
        i(tag, message, null);
    }

    public static void i(java.lang.String tag, java.lang.String message, final java.lang.Throwable throwable) {
        if (isInfoEnabled(tag)) {
            android.util.Log.i(truncateTag(tag), message, throwable);
        }
    }

    public static void w(java.lang.String tag, java.lang.String message) {
        w(tag, message, null);
    }

    public static void w(java.lang.String tag, java.lang.String message, final java.lang.Throwable throwable) {
        if (isWarnEnabled(tag)) {
            android.util.Log.w(truncateTag(tag), message, throwable);
        }
    }

    public static void e(java.lang.String tag, java.lang.String message) {
        e(tag, message, null);
    }

    public static void e(java.lang.String tag, java.lang.String message, final java.lang.Throwable throwable) {
        if (isErrorEnabled(tag)) {
            android.util.Log.e(truncateTag(tag), message, throwable);
        }
    }

    private static java.lang.String truncateTag(java.lang.String tag) {
        return (23 >= tag.length() || android.os.Build.VERSION.SDK_INT >= 24) ? tag : tag.substring(0, 23);
    }
}
