package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes.dex */
public class ExifRotationAvailability {
    public boolean isRotationOptionSupported() {
        androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class);
        if (imageCaptureRotationOptionQuirk != null) {
            return imageCaptureRotationOptionQuirk.isSupported(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION);
        }
        return true;
    }

    public boolean shouldUseExifOrientation(androidx.camera.core.ImageProxy image) {
        androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class);
        return (imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.isSupported(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION)) && image.getFormat() == 256;
    }
}
