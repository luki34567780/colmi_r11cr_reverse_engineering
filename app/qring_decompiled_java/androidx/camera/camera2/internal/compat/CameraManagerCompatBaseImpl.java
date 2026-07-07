package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
class CameraManagerCompatBaseImpl implements androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl {
    final android.hardware.camera2.CameraManager mCameraManager;
    final java.lang.Object mObject;

    CameraManagerCompatBaseImpl(android.content.Context context, java.lang.Object cameraManagerParams) {
        this.mCameraManager = (android.hardware.camera2.CameraManager) context.getSystemService("camera");
        this.mObject = cameraManagerParams;
    }

    static androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl create(android.content.Context context, android.os.Handler compatHandler) {
        return new androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl(context, new androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21(compatHandler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public java.lang.String[] getCameraIdList() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        try {
            return this.mCameraManager.getCameraIdList();
        } catch (android.hardware.camera2.CameraAccessException e) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback callback) {
        if (executor == null) {
            throw new java.lang.IllegalArgumentException("executor was null");
        }
        androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper = null;
        androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21) this.mObject;
        if (callback != null) {
            synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.mWrapperMap.get(callback);
                if (availabilityCallbackExecutorWrapper == null) {
                    availabilityCallbackExecutorWrapper = new androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper(executor, callback);
                    cameraManagerCompatParamsApi21.mWrapperMap.put(callback, availabilityCallbackExecutorWrapper);
                }
            }
        }
        this.mCameraManager.registerAvailabilityCallback(availabilityCallbackExecutorWrapper, cameraManagerCompatParamsApi21.mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback callback) {
        androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        if (callback != null) {
            androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21) this.mObject;
            synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.mWrapperMap.remove(callback);
            }
        } else {
            availabilityCallbackExecutorWrapper = null;
        }
        if (availabilityCallbackExecutorWrapper != null) {
            availabilityCallbackExecutorWrapper.setDisabled();
        }
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallbackExecutorWrapper);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String cameraId) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        try {
            return this.mCameraManager.getCameraCharacteristics(cameraId);
        } catch (android.hardware.camera2.CameraAccessException e) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void openCamera(java.lang.String cameraId, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback callback) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        androidx.core.util.Preconditions.checkNotNull(executor);
        androidx.core.util.Preconditions.checkNotNull(callback);
        try {
            this.mCameraManager.openCamera(cameraId, new androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper(executor, callback), ((androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21) this.mObject).mCompatHandler);
        } catch (android.hardware.camera2.CameraAccessException e) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public android.hardware.camera2.CameraManager getCameraManager() {
        return this.mCameraManager;
    }

    static final class CameraManagerCompatParamsApi21 {
        final android.os.Handler mCompatHandler;
        final java.util.Map<android.hardware.camera2.CameraManager.AvailabilityCallback, androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper> mWrapperMap = new java.util.HashMap();

        CameraManagerCompatParamsApi21(android.os.Handler compatHandler) {
            this.mCompatHandler = compatHandler;
        }
    }
}
