package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
class CameraDeviceCompatApi28Impl extends androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl {
    CameraDeviceCompatApi28Impl(android.hardware.camera2.CameraDevice cameraDevice) {
        super((android.hardware.camera2.CameraDevice) androidx.core.util.Preconditions.checkNotNull(cameraDevice), null);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat config) throws android.hardware.camera2.CameraAccessException {
        android.hardware.camera2.params.SessionConfiguration sessionConfiguration = (android.hardware.camera2.params.SessionConfiguration) config.unwrap();
        androidx.core.util.Preconditions.checkNotNull(sessionConfiguration);
        this.mCameraDevice.createCaptureSession(sessionConfiguration);
    }
}
