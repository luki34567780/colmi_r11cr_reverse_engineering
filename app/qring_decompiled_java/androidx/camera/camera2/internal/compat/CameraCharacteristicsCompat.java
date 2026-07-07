package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
public class CameraCharacteristicsCompat {
    private final android.hardware.camera2.CameraCharacteristics mCameraCharacteristics;
    private final java.util.Map<android.hardware.camera2.CameraCharacteristics.Key<?>, java.lang.Object> mValuesCache = new java.util.HashMap();

    private CameraCharacteristicsCompat(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        this.mCameraCharacteristics = cameraCharacteristics;
    }

    public static androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat toCameraCharacteristicsCompat(android.hardware.camera2.CameraCharacteristics characteristics) {
        return new androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat(characteristics);
    }

    public <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        synchronized (this) {
            T t = (T) this.mValuesCache.get(key);
            if (t != null) {
                return t;
            }
            T t2 = (T) this.mCameraCharacteristics.get(key);
            if (t2 != null) {
                this.mValuesCache.put(key, t2);
            }
            return t2;
        }
    }

    public android.hardware.camera2.CameraCharacteristics toCameraCharacteristics() {
        return this.mCameraCharacteristics;
    }
}
