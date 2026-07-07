package skin.support.utils;

/* loaded from: classes3.dex */
public class Slog {
    public static boolean DEBUG = false;
    private static final java.lang.String TAG = "skin-support";

    public static void i(java.lang.String str) {
        if (DEBUG) {
            android.util.Log.i(TAG, str);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (DEBUG) {
            android.util.Log.i(TAG, str + ": " + str2);
        }
    }

    public static void r(java.lang.String str) {
        android.util.Log.i(TAG, str);
    }

    public static void r(java.lang.String str, java.lang.String str2) {
        android.util.Log.i(TAG, str + ": " + str2);
    }
}
