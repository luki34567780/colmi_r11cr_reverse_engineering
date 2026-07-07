package androidx.camera.camera2.impl;

/* loaded from: classes.dex */
public final class Camera2CameraCaptureResultConverter {
    public static android.hardware.camera2.CaptureResult getCaptureResult(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        if (cameraCaptureResult instanceof androidx.camera.camera2.internal.Camera2CameraCaptureResult) {
            return ((androidx.camera.camera2.internal.Camera2CameraCaptureResult) cameraCaptureResult).getCaptureResult();
        }
        return null;
    }

    private Camera2CameraCaptureResultConverter() {
    }
}
