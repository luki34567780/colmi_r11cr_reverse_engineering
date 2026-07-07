package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
class CameraManagerCompatApi28Impl extends androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl {
    CameraManagerCompatApi28Impl(android.content.Context context) {
        super(context, null);
    }

    static androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl create(android.content.Context context) {
        return new androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl(context);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback callback) {
        this.mCameraManager.registerAvailabilityCallback(executor, callback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback callback) {
        this.mCameraManager.unregisterAvailabilityCallback(callback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void openCamera(java.lang.String cameraId, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback callback) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        try {
            this.mCameraManager.openCamera(cameraId, executor, callback);
        } catch (android.hardware.camera2.CameraAccessException e) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw e2;
        } catch (java.lang.SecurityException e3) {
        } catch (java.lang.RuntimeException e4) {
            if (isDndFailCase(e4)) {
                throwDndException(e4);
            }
            throw e4;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String cameraId) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        try {
            return super.getCameraCharacteristics(cameraId);
        } catch (java.lang.RuntimeException e) {
            if (isDndFailCase(e)) {
                throwDndException(e);
            }
            throw e;
        }
    }

    private void throwDndException(java.lang.Throwable cause) throws androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat {
        throw new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat(10001, cause);
    }

    private boolean isDndFailCase(java.lang.Throwable throwable) {
        return android.os.Build.VERSION.SDK_INT == 28 && isDndRuntimeException(throwable);
    }

    private static boolean isDndRuntimeException(java.lang.Throwable throwable) {
        java.lang.StackTraceElement[] stackTrace;
        if (!throwable.getClass().equals(java.lang.RuntimeException.class) || (stackTrace = throwable.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }
}
