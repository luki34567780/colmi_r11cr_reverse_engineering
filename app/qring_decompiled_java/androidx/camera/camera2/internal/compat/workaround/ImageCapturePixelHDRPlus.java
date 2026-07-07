package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes.dex */
public class ImageCapturePixelHDRPlus {
    public void toggleHDRPlus(int captureMode, androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        if (((androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (captureMode == 0) {
            builder.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL, true);
        } else {
            if (captureMode != 1) {
                return;
            }
            builder.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL, false);
        }
    }
}
