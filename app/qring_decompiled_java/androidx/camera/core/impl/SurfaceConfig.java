package androidx.camera.core.impl;

/* loaded from: classes.dex */
public abstract class SurfaceConfig {

    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public abstract androidx.camera.core.impl.SurfaceConfig.ConfigSize getConfigSize();

    public abstract androidx.camera.core.impl.SurfaceConfig.ConfigType getConfigType();

    SurfaceConfig() {
    }

    public static androidx.camera.core.impl.SurfaceConfig create(androidx.camera.core.impl.SurfaceConfig.ConfigType type, androidx.camera.core.impl.SurfaceConfig.ConfigSize size) {
        return new androidx.camera.core.impl.AutoValue_SurfaceConfig(type, size);
    }

    public final boolean isSupported(androidx.camera.core.impl.SurfaceConfig surfaceConfig) {
        return surfaceConfig.getConfigSize().getId() <= getConfigSize().getId() && surfaceConfig.getConfigType() == getConfigType();
    }

    public enum ConfigSize {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);

        final int mId;

        ConfigSize(int id) {
            this.mId = id;
        }

        int getId() {
            return this.mId;
        }
    }
}
