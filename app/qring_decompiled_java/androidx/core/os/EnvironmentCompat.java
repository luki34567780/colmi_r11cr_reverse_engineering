package androidx.core.os;

/* loaded from: classes.dex */
public final class EnvironmentCompat {
    public static final java.lang.String MEDIA_UNKNOWN = "unknown";
    private static final java.lang.String TAG = "EnvironmentCompat";

    public static java.lang.String getStorageState(java.io.File file) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return android.os.Environment.getExternalStorageState(file);
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return android.os.Environment.getStorageState(file);
        }
        try {
            return file.getCanonicalPath().startsWith(android.os.Environment.getExternalStorageDirectory().getCanonicalPath()) ? android.os.Environment.getExternalStorageState() : "unknown";
        } catch (java.io.IOException e) {
            android.util.Log.w(TAG, "Failed to resolve canonical path: " + e);
            return "unknown";
        }
    }

    private EnvironmentCompat() {
    }
}
