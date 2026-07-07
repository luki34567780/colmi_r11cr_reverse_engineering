package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class SamsungPreviewTargetAspectRatioQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> DEVICE_MODELS = java.util.Arrays.asList("SM-J710MN", "SM-T580");

    static boolean load() {
        return "SAMSUNG".equals(android.os.Build.BRAND.toUpperCase()) && DEVICE_MODELS.contains(android.os.Build.MODEL.toUpperCase());
    }

    public boolean require16_9(androidx.camera.core.impl.Config config) {
        return config instanceof androidx.camera.core.impl.PreviewConfig;
    }
}
