package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
final class CaptureCallbackAdapter extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
    private final androidx.camera.core.impl.CameraCaptureCallback mCameraCaptureCallback;

    CaptureCallbackAdapter(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        java.util.Objects.requireNonNull(cameraCaptureCallback, "cameraCaptureCallback is null");
        this.mCameraCaptureCallback = cameraCaptureCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
        androidx.camera.core.impl.TagBundle emptyBundle;
        super.onCaptureCompleted(session, request, result);
        java.lang.Object tag = request.getTag();
        if (tag != null) {
            androidx.core.util.Preconditions.checkArgument(tag instanceof androidx.camera.core.impl.TagBundle, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            emptyBundle = (androidx.camera.core.impl.TagBundle) tag;
        } else {
            emptyBundle = androidx.camera.core.impl.TagBundle.emptyBundle();
        }
        this.mCameraCaptureCallback.onCaptureCompleted(new androidx.camera.camera2.internal.Camera2CameraCaptureResult(emptyBundle, result));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureFailure failure) {
        super.onCaptureFailed(session, request, failure);
        this.mCameraCaptureCallback.onCaptureFailed(new androidx.camera.core.impl.CameraCaptureFailure(androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR));
    }
}
