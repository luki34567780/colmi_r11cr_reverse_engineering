package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
public final class CameraDeviceCompat {
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;
    private final androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl mImpl;

    interface CameraDeviceCompatImpl {
        void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat config) throws android.hardware.camera2.CameraAccessException;

        android.hardware.camera2.CameraDevice unwrap();
    }

    private CameraDeviceCompat(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler compatHandler) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new androidx.camera.camera2.internal.compat.CameraDeviceCompatApi28Impl(cameraDevice);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.mImpl = androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl.create(cameraDevice, compatHandler);
        } else if (android.os.Build.VERSION.SDK_INT >= 23) {
            this.mImpl = androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl.create(cameraDevice, compatHandler);
        } else {
            this.mImpl = androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.create(cameraDevice, compatHandler);
        }
    }

    public static androidx.camera.camera2.internal.compat.CameraDeviceCompat toCameraDeviceCompat(android.hardware.camera2.CameraDevice captureSession) {
        return toCameraDeviceCompat(captureSession, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
    }

    public static androidx.camera.camera2.internal.compat.CameraDeviceCompat toCameraDeviceCompat(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler compatHandler) {
        return new androidx.camera.camera2.internal.compat.CameraDeviceCompat(cameraDevice, compatHandler);
    }

    public android.hardware.camera2.CameraDevice toCameraDevice() {
        return this.mImpl.unwrap();
    }

    public void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat config) throws android.hardware.camera2.CameraAccessException {
        this.mImpl.createCaptureSession(config);
    }

    static final class StateCallbackExecutorWrapper extends android.hardware.camera2.CameraDevice.StateCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraDevice.StateCallback mWrappedCallback;

        StateCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback wrappedCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = wrappedCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final android.hardware.camera2.CameraDevice camera) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onOpened(camera);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final android.hardware.camera2.CameraDevice camera) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onDisconnected(camera);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final android.hardware.camera2.CameraDevice camera, final int error) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onError(camera, error);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final android.hardware.camera2.CameraDevice camera) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onClosed(camera);
                }
            });
        }
    }
}
