package androidx.core.database;

/* loaded from: classes.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    public static android.database.CursorWindow create(java.lang.String str, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return new android.database.CursorWindow(str, j);
        }
        if (android.os.Build.VERSION.SDK_INT >= 15) {
            return new android.database.CursorWindow(str);
        }
        return new android.database.CursorWindow(false);
    }
}
