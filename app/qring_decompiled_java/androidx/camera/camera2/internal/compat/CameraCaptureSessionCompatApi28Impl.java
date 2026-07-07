package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
class CameraCaptureSessionCompatApi28Impl extends androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl {
    CameraCaptureSessionCompatApi28Impl(android.hardware.camera2.CameraCaptureSession captureSession) {
        super(captureSession, null);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mCameraCaptureSession.captureBurstRequests(requests, executor, listener);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mCameraCaptureSession.captureSingleRequest(request, executor, listener);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mCameraCaptureSession.setRepeatingBurstRequests(requests, executor, listener);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mCameraCaptureSession.setSingleRepeatingRequest(request, executor, listener);
    }
}
