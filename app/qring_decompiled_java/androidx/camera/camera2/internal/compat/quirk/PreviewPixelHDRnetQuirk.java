package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> SUPPORTED_DEVICES = new java.util.ArrayList(java.util.Arrays.asList("sunfish", "bramble", "redfin"));

    static boolean load() {
        return "Google".equals(android.os.Build.MANUFACTURER) && SUPPORTED_DEVICES.contains(android.os.Build.DEVICE.toLowerCase(java.util.Locale.getDefault()));
    }
}
