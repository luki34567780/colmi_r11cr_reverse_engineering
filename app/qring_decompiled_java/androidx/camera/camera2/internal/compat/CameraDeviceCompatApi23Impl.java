package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
class CameraDeviceCompatApi23Impl extends androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl {
    CameraDeviceCompatApi23Impl(android.hardware.camera2.CameraDevice cameraDevice, java.lang.Object implParams) {
        super(cameraDevice, implParams);
    }

    static androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl create(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler compatHandler) {
        return new androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl(cameraDevice, new androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21(compatHandler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat config) throws android.hardware.camera2.CameraAccessException {
        checkPreconditions(this.mCameraDevice, config);
        androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper(config.getExecutor(), config.getStateCallback());
        java.util.List<android.view.Surface> unpackSurfaces = unpackSurfaces(config.getOutputConfigurations());
        android.os.Handler handler = ((androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) androidx.core.util.Preconditions.checkNotNull((androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) this.mImplParams)).mCompatHandler;
        androidx.camera.camera2.internal.compat.params.InputConfigurationCompat inputConfiguration = config.getInputConfiguration();
        if (inputConfiguration != null) {
            android.hardware.camera2.params.InputConfiguration inputConfiguration2 = (android.hardware.camera2.params.InputConfiguration) inputConfiguration.unwrap();
            androidx.core.util.Preconditions.checkNotNull(inputConfiguration2);
            this.mCameraDevice.createReprocessableCaptureSession(inputConfiguration2, unpackSurfaces, stateCallbackExecutorWrapper, handler);
        } else if (config.getSessionType() == 1) {
            this.mCameraDevice.createConstrainedHighSpeedCaptureSession(unpackSurfaces, stateCallbackExecutorWrapper, handler);
        } else {
            createBaseCaptureSession(this.mCameraDevice, unpackSurfaces, stateCallbackExecutorWrapper, handler);
        }
    }
}
