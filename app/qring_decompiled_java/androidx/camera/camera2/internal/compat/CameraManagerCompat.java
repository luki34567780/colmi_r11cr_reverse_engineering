package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
public final class CameraManagerCompat {
    private final java.util.Map<java.lang.String, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat> mCameraCharacteristicsMap = new android.util.ArrayMap(4);
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl mImpl;

    private CameraManagerCompat(androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl impl) {
        this.mImpl = impl;
    }

    public static androidx.camera.camera2.internal.compat.CameraManagerCompat from(android.content.Context context) {
        return from(context, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
    }

    public static androidx.camera.camera2.internal.compat.CameraManagerCompat from(android.content.Context context, android.os.Handler compatHandler) {
        return new androidx.camera.camera2.internal.compat.CameraManagerCompat(androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl.CC.from(context, compatHandler));
    }

    public static androidx.camera.camera2.internal.compat.CameraManagerCompat from(final androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl impl) {
        return new androidx.camera.camera2.internal.compat.CameraManagerCompat(impl);
    }

    public java.lang.String[] getCameraIdList() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        return this.mImpl.getCameraIdList();
    }

    public void registerAvailabilityCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback callback) {
        this.mImpl.registerAvailabilityCallback(executor, callback);
    }

    public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback callback) {
        this.mImpl.unregisterAvailabilityCallback(callback);
    }

    public androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat getCameraCharacteristicsCompat(java.lang.String cameraId) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.mCameraCharacteristicsMap) {
            cameraCharacteristicsCompat = this.mCameraCharacteristicsMap.get(cameraId);
            if (cameraCharacteristicsCompat == null) {
                cameraCharacteristicsCompat = androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.toCameraCharacteristicsCompat(this.mImpl.getCameraCharacteristics(cameraId));
                this.mCameraCharacteristicsMap.put(cameraId, cameraCharacteristicsCompat);
            }
        }
        return cameraCharacteristicsCompat;
    }

    public void openCamera(java.lang.String cameraId, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback callback) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        this.mImpl.openCamera(cameraId, executor, callback);
    }

    public android.hardware.camera2.CameraManager unwrap() {
        return this.mImpl.getCameraManager();
    }

    public interface CameraManagerCompatImpl {
        android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String cameraId) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

        java.lang.String[] getCameraIdList() throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

        android.hardware.camera2.CameraManager getCameraManager();

        void openCamera(java.lang.String cameraId, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback callback) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

        void registerAvailabilityCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback callback);

        void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback callback);

        /* renamed from: androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl from(android.content.Context context, android.os.Handler compatHandler) {
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    return new androidx.camera.camera2.internal.compat.CameraManagerCompatApi29Impl(context);
                }
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    return androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl.create(context);
                }
                return androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.create(context, compatHandler);
            }
        }
    }

    static final class AvailabilityCallbackExecutorWrapper extends android.hardware.camera2.CameraManager.AvailabilityCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraManager.AvailabilityCallback mWrappedCallback;
        private final java.lang.Object mLock = new java.lang.Object();
        private boolean mDisabled = false;

        AvailabilityCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback wrappedCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = wrappedCallback;
        }

        void setDisabled() {
            synchronized (this.mLock) {
                this.mDisabled = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper.1
                        @Override // java.lang.Runnable
                        public void run() {
                            androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.mWrappedCallback.onCameraAccessPrioritiesChanged();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final java.lang.String cameraId) {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.mWrappedCallback.onCameraAvailable(cameraId);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final java.lang.String cameraId) {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper.3
                        @Override // java.lang.Runnable
                        public void run() {
                            androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.mWrappedCallback.onCameraUnavailable(cameraId);
                        }
                    });
                }
            }
        }
    }
}
