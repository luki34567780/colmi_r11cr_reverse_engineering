package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface UseCaseConfig<T extends androidx.camera.core.UseCase> extends androidx.camera.core.internal.TargetConfig<T>, androidx.camera.core.internal.UseCaseEventConfig, androidx.camera.core.impl.ImageInputConfig {
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.defaultSessionConfig", androidx.camera.core.impl.SessionConfig.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.defaultCaptureConfig", androidx.camera.core.impl.CaptureConfig.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.sessionConfigUnpacker", androidx.camera.core.impl.SessionConfig.OptionUnpacker.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.captureConfigUnpacker", androidx.camera.core.impl.CaptureConfig.OptionUnpacker.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.surfaceOccupancyPriority", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.CameraSelector> OPTION_CAMERA_SELECTOR = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.cameraSelector", androidx.camera.core.CameraSelector.class);

    public interface Builder<T extends androidx.camera.core.UseCase, C extends androidx.camera.core.impl.UseCaseConfig<T>, B> extends androidx.camera.core.internal.TargetConfig.Builder<T, B>, androidx.camera.core.ExtendableBuilder<T>, androidx.camera.core.internal.UseCaseEventConfig.Builder<B> {
        C getUseCaseConfig();

        B setCameraSelector(androidx.camera.core.CameraSelector cameraSelector);

        B setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker);

        B setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig);

        B setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig);

        B setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker);

        B setSurfaceOccupancyPriority(int priority);
    }

    androidx.camera.core.CameraSelector getCameraSelector();

    androidx.camera.core.CameraSelector getCameraSelector(androidx.camera.core.CameraSelector valueIfMissing);

    androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker();

    androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker valueIfMissing);

    androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig();

    androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig valueIfMissing);

    androidx.camera.core.impl.SessionConfig getDefaultSessionConfig();

    androidx.camera.core.impl.SessionConfig getDefaultSessionConfig(androidx.camera.core.impl.SessionConfig valueIfMissing);

    androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker();

    androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker valueIfMissing);

    int getSurfaceOccupancyPriority();

    int getSurfaceOccupancyPriority(int valueIfMissing);

    @com.android.tools.r8.annotations.SynthesizedClass(kind = "$-CC")
    /* renamed from: androidx.camera.core.impl.UseCaseConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<T extends androidx.camera.core.UseCase> {
        public static androidx.camera.core.impl.SessionConfig $default$getDefaultSessionConfig(androidx.camera.core.impl.UseCaseConfig _this, androidx.camera.core.impl.SessionConfig valueIfMissing) {
            return (androidx.camera.core.impl.SessionConfig) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, valueIfMissing);
        }

        public static androidx.camera.core.impl.SessionConfig $default$getDefaultSessionConfig(androidx.camera.core.impl.UseCaseConfig _this) {
            return (androidx.camera.core.impl.SessionConfig) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG);
        }

        public static androidx.camera.core.impl.CaptureConfig $default$getDefaultCaptureConfig(androidx.camera.core.impl.UseCaseConfig _this, androidx.camera.core.impl.CaptureConfig valueIfMissing) {
            return (androidx.camera.core.impl.CaptureConfig) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, valueIfMissing);
        }

        public static androidx.camera.core.impl.CaptureConfig $default$getDefaultCaptureConfig(androidx.camera.core.impl.UseCaseConfig _this) {
            return (androidx.camera.core.impl.CaptureConfig) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG);
        }

        public static androidx.camera.core.impl.SessionConfig.OptionUnpacker $default$getSessionOptionUnpacker(androidx.camera.core.impl.UseCaseConfig _this, androidx.camera.core.impl.SessionConfig.OptionUnpacker valueIfMissing) {
            return (androidx.camera.core.impl.SessionConfig.OptionUnpacker) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, valueIfMissing);
        }

        public static androidx.camera.core.impl.SessionConfig.OptionUnpacker $default$getSessionOptionUnpacker(androidx.camera.core.impl.UseCaseConfig _this) {
            return (androidx.camera.core.impl.SessionConfig.OptionUnpacker) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER);
        }

        public static androidx.camera.core.impl.CaptureConfig.OptionUnpacker $default$getCaptureOptionUnpacker(androidx.camera.core.impl.UseCaseConfig _this, androidx.camera.core.impl.CaptureConfig.OptionUnpacker valueIfMissing) {
            return (androidx.camera.core.impl.CaptureConfig.OptionUnpacker) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, valueIfMissing);
        }

        public static androidx.camera.core.impl.CaptureConfig.OptionUnpacker $default$getCaptureOptionUnpacker(androidx.camera.core.impl.UseCaseConfig _this) {
            return (androidx.camera.core.impl.CaptureConfig.OptionUnpacker) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER);
        }

        public static androidx.camera.core.CameraSelector $default$getCameraSelector(androidx.camera.core.impl.UseCaseConfig _this, androidx.camera.core.CameraSelector valueIfMissing) {
            return (androidx.camera.core.CameraSelector) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAMERA_SELECTOR, valueIfMissing);
        }

        public static androidx.camera.core.CameraSelector $default$getCameraSelector(androidx.camera.core.impl.UseCaseConfig _this) {
            return (androidx.camera.core.CameraSelector) _this.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAMERA_SELECTOR);
        }
    }
}
