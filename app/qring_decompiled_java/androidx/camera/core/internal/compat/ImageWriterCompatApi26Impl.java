package androidx.camera.core.internal.compat;

/* loaded from: classes.dex */
final class ImageWriterCompatApi26Impl {
    private static final java.lang.String TAG = "ImageWriterCompatApi26";
    private static java.lang.reflect.Method sNewInstanceMethod;

    static {
        try {
            sNewInstanceMethod = android.media.ImageWriter.class.getMethod("newInstance", android.view.Surface.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Unable to initialize via reflection.", e);
        }
    }

    static android.media.ImageWriter newInstance(android.view.Surface surface, int maxImages, int format) {
        java.lang.Throwable th = null;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            try {
                return (android.media.ImageWriter) androidx.core.util.Preconditions.checkNotNull(sNewInstanceMethod.invoke(null, surface, java.lang.Integer.valueOf(maxImages), java.lang.Integer.valueOf(format)));
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                th = e;
            }
        }
        throw new java.lang.RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th);
    }

    private ImageWriterCompatApi26Impl() {
    }
}
