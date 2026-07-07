package androidx.camera.core.impl;

/* loaded from: classes.dex */
final class AutoValue_DeviceProperties extends androidx.camera.core.impl.DeviceProperties {
    private final java.lang.String manufacturer;
    private final java.lang.String model;
    private final int sdkVersion;

    AutoValue_DeviceProperties(java.lang.String manufacturer, java.lang.String model, int sdkVersion) {
        java.util.Objects.requireNonNull(manufacturer, "Null manufacturer");
        this.manufacturer = manufacturer;
        java.util.Objects.requireNonNull(model, "Null model");
        this.model = model;
        this.sdkVersion = sdkVersion;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public java.lang.String manufacturer() {
        return this.manufacturer;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public java.lang.String model() {
        return this.model;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public int sdkVersion() {
        return this.sdkVersion;
    }

    public java.lang.String toString() {
        return "DeviceProperties{manufacturer=" + this.manufacturer + ", model=" + this.model + ", sdkVersion=" + this.sdkVersion + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.core.impl.DeviceProperties)) {
            return false;
        }
        androidx.camera.core.impl.DeviceProperties deviceProperties = (androidx.camera.core.impl.DeviceProperties) o;
        return this.manufacturer.equals(deviceProperties.manufacturer()) && this.model.equals(deviceProperties.model()) && this.sdkVersion == deviceProperties.sdkVersion();
    }

    public int hashCode() {
        return ((((this.manufacturer.hashCode() ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.sdkVersion;
    }
}
