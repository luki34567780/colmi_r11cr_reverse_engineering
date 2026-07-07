package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
final class CaptureCallbackContainer extends androidx.camera.core.impl.CameraCaptureCallback {
    private final android.hardware.camera2.CameraCaptureSession.CaptureCallback mCaptureCallback;

    private CaptureCallbackContainer(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        java.util.Objects.requireNonNull(captureCallback, "captureCallback is null");
        this.mCaptureCallback = captureCallback;
    }

    static androidx.camera.camera2.internal.CaptureCallbackContainer create(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return new androidx.camera.camera2.internal.CaptureCallbackContainer(captureCallback);
    }

    android.hardware.camera2.CameraCaptureSession.CaptureCallback getCaptureCallback() {
        return this.mCaptureCallback;
    }
}
