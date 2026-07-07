package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    static java.util.List<androidx.camera.core.impl.Quirk> loadQuirks() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.load()) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk());
        }
        if (androidx.camera.camera2.internal.compat.quirk.SamsungPreviewTargetAspectRatioQuirk.load()) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.SamsungPreviewTargetAspectRatioQuirk());
        }
        if (androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.load()) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.load()) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk());
        }
        if (androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.load()) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.load()) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk());
        }
        if (androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk.load()) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk());
        }
        return arrayList;
    }
}
