package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes.dex */
public class TargetAspectRatio {
    public static final int RATIO_16_9 = 1;
    public static final int RATIO_4_3 = 0;
    public static final int RATIO_MAX_JPEG = 2;
    public static final int RATIO_ORIGINAL = 3;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Ratio {
    }

    public int get(androidx.camera.core.impl.ImageOutputConfig imageOutputConfig, java.lang.String cameraId, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        androidx.camera.camera2.internal.compat.quirk.SamsungPreviewTargetAspectRatioQuirk samsungPreviewTargetAspectRatioQuirk = (androidx.camera.camera2.internal.compat.quirk.SamsungPreviewTargetAspectRatioQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.SamsungPreviewTargetAspectRatioQuirk.class);
        if (samsungPreviewTargetAspectRatioQuirk != null && samsungPreviewTargetAspectRatioQuirk.require16_9(imageOutputConfig)) {
            return 1;
        }
        androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk nexus4AndroidLTargetAspectRatioQuirk = (androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class);
        if (nexus4AndroidLTargetAspectRatioQuirk != null) {
            return nexus4AndroidLTargetAspectRatioQuirk.getCorrectedAspectRatio();
        }
        androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk aspectRatioLegacyApi21Quirk = (androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk) androidx.camera.camera2.internal.compat.quirk.CameraQuirks.get(cameraId, cameraCharacteristicsCompat).get(androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class);
        if (aspectRatioLegacyApi21Quirk != null) {
            return aspectRatioLegacyApi21Quirk.getCorrectedAspectRatio();
        }
        return 3;
    }
}
