package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
final class AutoValue_CameraDeviceId extends androidx.camera.camera2.internal.CameraDeviceId {
    private final java.lang.String brand;
    private final java.lang.String cameraId;
    private final java.lang.String device;
    private final java.lang.String model;

    AutoValue_CameraDeviceId(java.lang.String brand, java.lang.String device, java.lang.String model, java.lang.String cameraId) {
        java.util.Objects.requireNonNull(brand, "Null brand");
        this.brand = brand;
        java.util.Objects.requireNonNull(device, "Null device");
        this.device = device;
        java.util.Objects.requireNonNull(model, "Null model");
        this.model = model;
        java.util.Objects.requireNonNull(cameraId, "Null cameraId");
        this.cameraId = cameraId;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public java.lang.String getBrand() {
        return this.brand;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public java.lang.String getDevice() {
        return this.device;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public java.lang.String getModel() {
        return this.model;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public java.lang.String getCameraId() {
        return this.cameraId;
    }

    public java.lang.String toString() {
        return "CameraDeviceId{brand=" + this.brand + ", device=" + this.device + ", model=" + this.model + ", cameraId=" + this.cameraId + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.camera2.internal.CameraDeviceId)) {
            return false;
        }
        androidx.camera.camera2.internal.CameraDeviceId cameraDeviceId = (androidx.camera.camera2.internal.CameraDeviceId) o;
        return this.brand.equals(cameraDeviceId.getBrand()) && this.device.equals(cameraDeviceId.getDevice()) && this.model.equals(cameraDeviceId.getModel()) && this.cameraId.equals(cameraDeviceId.getCameraId());
    }

    public int hashCode() {
        return ((((((this.brand.hashCode() ^ 1000003) * 1000003) ^ this.device.hashCode()) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.cameraId.hashCode();
    }
}
