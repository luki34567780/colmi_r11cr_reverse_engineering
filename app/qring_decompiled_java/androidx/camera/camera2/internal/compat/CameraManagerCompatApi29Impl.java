package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
class CameraManagerCompatApi29Impl extends androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl {
    CameraManagerCompatApi29Impl(android.content.Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl, androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void openCamera(java.lang.String cameraId, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback callback) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        try {
            this.mCameraManager.openCamera(cameraId, executor, callback);
        } catch (android.hardware.camera2.CameraAccessException e) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl, androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String cameraId) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        try {
            return this.mCameraManager.getCameraCharacteristics(cameraId);
        } catch (android.hardware.camera2.CameraAccessException e) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
