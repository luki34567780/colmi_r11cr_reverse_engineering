package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements androidx.camera.core.impl.Quirk {
    static boolean load() {
        return (isPixel2() || isPixel3()) && android.os.Build.VERSION.SDK_INT >= 26;
    }

    private static boolean isPixel2() {
        return "Google".equals(android.os.Build.MANUFACTURER) && "Pixel 2".equals(android.os.Build.MODEL);
    }

    private static boolean isPixel3() {
        return "Google".equals(android.os.Build.MANUFACTURER) && "Pixel 3".equals(android.os.Build.MODEL);
    }
}
