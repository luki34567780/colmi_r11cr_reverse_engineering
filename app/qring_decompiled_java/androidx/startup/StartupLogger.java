package androidx.startup;

/* loaded from: classes.dex */
public final class StartupLogger {
    static final boolean DEBUG = false;
    private static final java.lang.String TAG = "StartupLogger";

    private StartupLogger() {
    }

    public static void i(java.lang.String str) {
        android.util.Log.i(TAG, str);
    }

    public static void e(java.lang.String str, java.lang.Throwable th) {
        android.util.Log.e(TAG, str, th);
    }
}
