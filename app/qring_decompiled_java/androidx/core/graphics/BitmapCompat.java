package androidx.core.graphics;

/* loaded from: classes.dex */
public final class BitmapCompat {
    public static boolean hasMipMap(android.graphics.Bitmap bitmap) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return bitmap.hasMipMap();
        }
        return false;
    }

    public static void setHasMipMap(android.graphics.Bitmap bitmap, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            bitmap.setHasMipMap(z);
        }
    }

    public static int getAllocationByteCount(android.graphics.Bitmap bitmap) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
    }

    private BitmapCompat() {
    }
}
