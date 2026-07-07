package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class CameraConfigs {
    private static final androidx.camera.core.impl.CameraConfig EMPTY_CONFIG = new androidx.camera.core.impl.CameraConfigs.EmptyCameraConfig();

    public static androidx.camera.core.impl.CameraConfig emptyConfig() {
        return EMPTY_CONFIG;
    }

    static final class EmptyCameraConfig implements androidx.camera.core.impl.CameraConfig {
        private final androidx.camera.core.impl.UseCaseConfigFactory mUseCaseConfigFactory = new androidx.camera.core.impl.UseCaseConfigFactory() { // from class: androidx.camera.core.impl.CameraConfigs.EmptyCameraConfig.1
            @Override // androidx.camera.core.impl.UseCaseConfigFactory
            public androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
                return null;
            }
        };

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ boolean containsOption(androidx.camera.core.impl.Config.Option option) {
            boolean containsOption;
            containsOption = getConfig().containsOption(option);
            return containsOption;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ void findOptions(java.lang.String str, androidx.camera.core.impl.Config.OptionMatcher optionMatcher) {
            getConfig().findOptions(str, optionMatcher);
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ androidx.camera.core.CameraFilter getCameraFilter() {
            return androidx.camera.core.impl.CameraConfig.CC.$default$getCameraFilter(this);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option option) {
            androidx.camera.core.impl.Config.OptionPriority optionPriority;
            optionPriority = getConfig().getOptionPriority(option);
            return optionPriority;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ java.util.Set getPriorities(androidx.camera.core.impl.Config.Option option) {
            java.util.Set priorities;
            priorities = getConfig().getPriorities(option);
            return priorities;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ java.util.Set listOptions() {
            java.util.Set listOptions;
            listOptions = getConfig().listOptions();
            return listOptions;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ java.lang.Object retrieveOption(androidx.camera.core.impl.Config.Option option) {
            java.lang.Object retrieveOption;
            retrieveOption = getConfig().retrieveOption(option);
            return retrieveOption;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ java.lang.Object retrieveOption(androidx.camera.core.impl.Config.Option option, java.lang.Object obj) {
            java.lang.Object retrieveOption;
            retrieveOption = getConfig().retrieveOption(option, obj);
            return retrieveOption;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ java.lang.Object retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option option, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
            java.lang.Object retrieveOptionWithPriority;
            retrieveOptionWithPriority = getConfig().retrieveOptionWithPriority(option, optionPriority);
            return retrieveOptionWithPriority;
        }

        EmptyCameraConfig() {
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public androidx.camera.core.impl.UseCaseConfigFactory getUseCaseConfigFactory() {
            return this.mUseCaseConfigFactory;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public androidx.camera.core.impl.Config getConfig() {
            return androidx.camera.core.impl.OptionsBundle.emptyBundle();
        }
    }

    private CameraConfigs() {
    }
}
