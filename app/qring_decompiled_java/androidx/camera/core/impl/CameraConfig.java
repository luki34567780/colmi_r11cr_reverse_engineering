package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface CameraConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.CameraFilter> OPTION_CAMERA_FILTER = androidx.camera.core.impl.Config.Option.create("camerax.core.camera.cameraFilter", androidx.camera.core.CameraFilter.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.UseCaseConfigFactory> OPTION_USECASE_CONFIG_FACTORY = androidx.camera.core.impl.Config.Option.create("camerax.core.camera.useCaseConfigFactory", androidx.camera.core.impl.UseCaseConfigFactory.class);

    public interface Builder<B> {
        B setCameraFilter(androidx.camera.core.CameraFilter cameraFilter);

        B setUseCaseConfigFactory(androidx.camera.core.impl.UseCaseConfigFactory factory);
    }

    androidx.camera.core.CameraFilter getCameraFilter();

    androidx.camera.core.impl.UseCaseConfigFactory getUseCaseConfigFactory();

    /* renamed from: androidx.camera.core.impl.CameraConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static androidx.camera.core.CameraFilter $default$getCameraFilter(androidx.camera.core.impl.CameraConfig _this) {
            return (androidx.camera.core.CameraFilter) _this.retrieveOption(androidx.camera.core.impl.CameraConfig.OPTION_CAMERA_FILTER, androidx.camera.core.impl.CameraFilters.ANY);
        }
    }
}
