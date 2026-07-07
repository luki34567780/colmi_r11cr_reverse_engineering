package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
class CameraDeviceCompatBaseImpl implements androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl {
    final android.hardware.camera2.CameraDevice mCameraDevice;
    final java.lang.Object mImplParams;

    CameraDeviceCompatBaseImpl(android.hardware.camera2.CameraDevice cameraDevice, java.lang.Object implParams) {
        this.mCameraDevice = (android.hardware.camera2.CameraDevice) androidx.core.util.Preconditions.checkNotNull(cameraDevice);
        this.mImplParams = implParams;
    }

    static androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl create(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler compatHandler) {
        return new androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl(cameraDevice, new androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21(compatHandler));
    }

    static java.util.List<android.view.Surface> unpackSurfaces(java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> outputConfigs) {
        java.util.ArrayList arrayList = new java.util.ArrayList(outputConfigs.size());
        java.util.Iterator<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> it = outputConfigs.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSurface());
        }
        return arrayList;
    }

    static void checkPreconditions(android.hardware.camera2.CameraDevice device, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat config) {
        androidx.core.util.Preconditions.checkNotNull(device);
        androidx.core.util.Preconditions.checkNotNull(config);
        androidx.core.util.Preconditions.checkNotNull(config.getStateCallback());
        java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> outputConfigurations = config.getOutputConfigurations();
        if (outputConfigurations == null) {
            throw new java.lang.IllegalArgumentException("Invalid output configurations");
        }
        if (config.getExecutor() == null) {
            throw new java.lang.IllegalArgumentException("Invalid executor");
        }
        checkPhysicalCameraIdValid(device, outputConfigurations);
    }

    private static void checkPhysicalCameraIdValid(android.hardware.camera2.CameraDevice device, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> outputConfigs) {
        java.lang.String id = device.getId();
        java.util.Iterator<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> it = outputConfigs.iterator();
        while (it.hasNext()) {
            java.lang.String physicalCameraId = it.next().getPhysicalCameraId();
            if (physicalCameraId != null && !physicalCameraId.isEmpty()) {
                androidx.camera.core.Logger.w("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + physicalCameraId + ". Ignoring.");
            }
        }
    }

    void createBaseCaptureSession(android.hardware.camera2.CameraDevice device, java.util.List<android.view.Surface> surfaces, android.hardware.camera2.CameraCaptureSession.StateCallback cb, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException {
        device.createCaptureSession(surfaces, cb, handler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat config) throws android.hardware.camera2.CameraAccessException {
        checkPreconditions(this.mCameraDevice, config);
        if (config.getInputConfiguration() != null) {
            throw new java.lang.IllegalArgumentException("Reprocessing sessions not supported until API 23");
        }
        if (config.getSessionType() == 1) {
            throw new java.lang.IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper(config.getExecutor(), config.getStateCallback());
        createBaseCaptureSession(this.mCameraDevice, unpackSurfaces(config.getOutputConfigurations()), stateCallbackExecutorWrapper, ((androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) this.mImplParams).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public android.hardware.camera2.CameraDevice unwrap() {
        return this.mCameraDevice;
    }

    static class CameraDeviceCompatParamsApi21 {
        final android.os.Handler mCompatHandler;

        CameraDeviceCompatParamsApi21(android.os.Handler compatHandler) {
            this.mCompatHandler = compatHandler;
        }
    }
}
