package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
class CameraCaptureSessionCompatBaseImpl implements androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl {
    final android.hardware.camera2.CameraCaptureSession mCameraCaptureSession;
    final java.lang.Object mObject;

    CameraCaptureSessionCompatBaseImpl(android.hardware.camera2.CameraCaptureSession captureSession, java.lang.Object implParams) {
        this.mCameraCaptureSession = (android.hardware.camera2.CameraCaptureSession) androidx.core.util.Preconditions.checkNotNull(captureSession);
        this.mObject = implParams;
    }

    static androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl create(android.hardware.camera2.CameraCaptureSession captureSession, android.os.Handler compatHandler) {
        return new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl(captureSession, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21(compatHandler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mCameraCaptureSession.captureBurst(requests, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, listener), ((androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mCameraCaptureSession.capture(request, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, listener), ((androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mCameraCaptureSession.setRepeatingBurst(requests, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, listener), ((androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mCameraCaptureSession.setRepeatingRequest(request, new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, listener), ((androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public android.hardware.camera2.CameraCaptureSession unwrap() {
        return this.mCameraCaptureSession;
    }

    private static class CameraCaptureSessionCompatParamsApi21 {
        final android.os.Handler mCompatHandler;

        CameraCaptureSessionCompatParamsApi21(android.os.Handler compatHandler) {
            this.mCompatHandler = compatHandler;
        }
    }
}
