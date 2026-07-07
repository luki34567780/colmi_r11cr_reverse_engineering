package androidx.camera.core.impl;

/* loaded from: classes.dex */
final class AutoValue_SurfaceConfig extends androidx.camera.core.impl.SurfaceConfig {
    private final androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize;
    private final androidx.camera.core.impl.SurfaceConfig.ConfigType configType;

    AutoValue_SurfaceConfig(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize) {
        java.util.Objects.requireNonNull(configType, "Null configType");
        this.configType = configType;
        java.util.Objects.requireNonNull(configSize, "Null configSize");
        this.configSize = configSize;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType() {
        return this.configType;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    public androidx.camera.core.impl.SurfaceConfig.ConfigSize getConfigSize() {
        return this.configSize;
    }

    public java.lang.String toString() {
        return "SurfaceConfig{configType=" + this.configType + ", configSize=" + this.configSize + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.core.impl.SurfaceConfig)) {
            return false;
        }
        androidx.camera.core.impl.SurfaceConfig surfaceConfig = (androidx.camera.core.impl.SurfaceConfig) o;
        return this.configType.equals(surfaceConfig.getConfigType()) && this.configSize.equals(surfaceConfig.getConfigSize());
    }

    public int hashCode() {
        return ((this.configType.hashCode() ^ 1000003) * 1000003) ^ this.configSize.hashCode();
    }
}
