package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class CrashWhenTakingPhotoWithAutoFlashAEModeQuirk implements androidx.camera.core.impl.Quirk {
    static boolean load() {
        return "SAMSUNG".equals(android.os.Build.MANUFACTURER.toUpperCase()) && android.os.Build.MODEL.toUpperCase().startsWith("SM-A300");
    }
}
