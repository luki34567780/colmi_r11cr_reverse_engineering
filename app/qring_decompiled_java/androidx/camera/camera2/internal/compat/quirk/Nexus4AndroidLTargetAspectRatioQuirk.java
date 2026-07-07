package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> DEVICE_MODELS = java.util.Arrays.asList("NEXUS 4");

    public int getCorrectedAspectRatio() {
        return 2;
    }

    static boolean load() {
        return "GOOGLE".equals(android.os.Build.BRAND.toUpperCase()) && android.os.Build.VERSION.SDK_INT < 23 && DEVICE_MODELS.contains(android.os.Build.MODEL.toUpperCase());
    }
}
