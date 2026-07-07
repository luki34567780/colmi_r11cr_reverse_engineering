package androidx.camera.camera2.interop;

/* loaded from: classes.dex */
public final class Camera2CameraInfo {
    private final androidx.camera.camera2.internal.Camera2CameraInfoImpl mCamera2CameraInfoImpl;

    public Camera2CameraInfo(androidx.camera.camera2.internal.Camera2CameraInfoImpl camera2CameraInfoImpl) {
        this.mCamera2CameraInfoImpl = camera2CameraInfoImpl;
    }

    public static androidx.camera.camera2.interop.Camera2CameraInfo from(androidx.camera.core.CameraInfo cameraInfo) {
        androidx.core.util.Preconditions.checkArgument(cameraInfo instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl, "CameraInfo doesn't contain Camera2 implementation.");
        return ((androidx.camera.camera2.internal.Camera2CameraInfoImpl) cameraInfo).getCamera2CameraInfo();
    }

    public java.lang.String getCameraId() {
        return this.mCamera2CameraInfoImpl.getCameraId();
    }

    public <T> T getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        return (T) this.mCamera2CameraInfoImpl.getCameraCharacteristicsCompat().get(key);
    }

    public static android.hardware.camera2.CameraCharacteristics extractCameraCharacteristics(androidx.camera.core.CameraInfo cameraInfo) {
        androidx.core.util.Preconditions.checkState(cameraInfo instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl, "CameraInfo does not contain any Camera2 information.");
        return ((androidx.camera.camera2.internal.Camera2CameraInfoImpl) cameraInfo).getCameraCharacteristicsCompat().toCameraCharacteristics();
    }
}
