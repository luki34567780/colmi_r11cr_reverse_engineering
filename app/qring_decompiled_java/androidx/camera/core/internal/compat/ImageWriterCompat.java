package androidx.camera.core.internal.compat;

/* loaded from: classes.dex */
public final class ImageWriterCompat {
    public static android.media.ImageWriter newInstance(android.view.Surface surface, int maxImages, int format) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.camera.core.internal.compat.ImageWriterCompatApi26Impl.newInstance(surface, maxImages, format);
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.camera.core.internal.compat.ImageWriterCompatApi29Impl.newInstance(surface, maxImages, format);
        }
        throw new java.lang.RuntimeException("Unable to call newInstance(Surface, int, int) on API " + android.os.Build.VERSION.SDK_INT + ". Version 26 or higher required.");
    }

    private ImageWriterCompat() {
    }
}
