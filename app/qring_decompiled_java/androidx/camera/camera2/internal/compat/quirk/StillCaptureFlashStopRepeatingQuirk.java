package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class StillCaptureFlashStopRepeatingQuirk implements androidx.camera.core.impl.Quirk {
    static boolean load() {
        return "SAMSUNG".equals(android.os.Build.MANUFACTURER.toUpperCase(java.util.Locale.US)) && android.os.Build.MODEL.toUpperCase(java.util.Locale.US).startsWith("SM-A716");
    }
}
