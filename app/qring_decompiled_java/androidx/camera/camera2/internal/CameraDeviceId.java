package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
abstract class CameraDeviceId {
    public abstract java.lang.String getBrand();

    public abstract java.lang.String getCameraId();

    public abstract java.lang.String getDevice();

    public abstract java.lang.String getModel();

    CameraDeviceId() {
    }

    public static androidx.camera.camera2.internal.CameraDeviceId create(java.lang.String brand, java.lang.String device, java.lang.String model, java.lang.String cameraId) {
        return new androidx.camera.camera2.internal.AutoValue_CameraDeviceId(brand.toLowerCase(), device.toLowerCase(), model.toLowerCase(), cameraId.toLowerCase());
    }
}
