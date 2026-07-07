package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface ImageOutputConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final int INVALID_ROTATION = -1;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_TARGET_ASPECT_RATIO = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.targetAspectRatio", androidx.camera.core.AspectRatio.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_TARGET_ROTATION = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.targetRotation", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<android.util.Size> OPTION_TARGET_RESOLUTION = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.targetResolution", android.util.Size.class);
    public static final androidx.camera.core.impl.Config.Option<android.util.Size> OPTION_DEFAULT_RESOLUTION = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.defaultResolution", android.util.Size.class);
    public static final androidx.camera.core.impl.Config.Option<android.util.Size> OPTION_MAX_RESOLUTION = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.maxResolution", android.util.Size.class);
    public static final androidx.camera.core.impl.Config.Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> OPTION_SUPPORTED_RESOLUTIONS = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.supportedResolutions", java.util.List.class);

    public interface Builder<B> {
        B setDefaultResolution(android.util.Size resolution);

        B setMaxResolution(android.util.Size resolution);

        B setSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> resolutionsList);

        B setTargetAspectRatio(int aspectRatio);

        B setTargetResolution(android.util.Size resolution);

        B setTargetRotation(int rotation);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RotationDegreesValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RotationValue {
    }

    android.util.Size getDefaultResolution();

    android.util.Size getDefaultResolution(android.util.Size valueIfMissing);

    android.util.Size getMaxResolution();

    android.util.Size getMaxResolution(android.util.Size valueIfMissing);

    java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedResolutions();

    java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> valueIfMissing);

    int getTargetAspectRatio();

    android.util.Size getTargetResolution();

    android.util.Size getTargetResolution(android.util.Size valueIfMissing);

    int getTargetRotation();

    int getTargetRotation(int valueIfMissing);

    boolean hasTargetAspectRatio();

    /* renamed from: androidx.camera.core.impl.ImageOutputConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static android.util.Size $default$getTargetResolution(androidx.camera.core.impl.ImageOutputConfig _this, android.util.Size valueIfMissing) {
            return (android.util.Size) _this.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION, valueIfMissing);
        }

        public static android.util.Size $default$getTargetResolution(androidx.camera.core.impl.ImageOutputConfig _this) {
            return (android.util.Size) _this.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION);
        }

        public static android.util.Size $default$getDefaultResolution(androidx.camera.core.impl.ImageOutputConfig _this, android.util.Size valueIfMissing) {
            return (android.util.Size) _this.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, valueIfMissing);
        }

        public static android.util.Size $default$getDefaultResolution(androidx.camera.core.impl.ImageOutputConfig _this) {
            return (android.util.Size) _this.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_DEFAULT_RESOLUTION);
        }

        public static android.util.Size $default$getMaxResolution(androidx.camera.core.impl.ImageOutputConfig _this, android.util.Size valueIfMissing) {
            return (android.util.Size) _this.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION, valueIfMissing);
        }

        public static android.util.Size $default$getMaxResolution(androidx.camera.core.impl.ImageOutputConfig _this) {
            return (android.util.Size) _this.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION);
        }

        public static java.util.List $default$getSupportedResolutions(androidx.camera.core.impl.ImageOutputConfig _this, java.util.List valueIfMissing) {
            return (java.util.List) _this.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, valueIfMissing);
        }

        public static java.util.List $default$getSupportedResolutions(androidx.camera.core.impl.ImageOutputConfig _this) {
            return (java.util.List) _this.retrieveOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS);
        }
    }
}
