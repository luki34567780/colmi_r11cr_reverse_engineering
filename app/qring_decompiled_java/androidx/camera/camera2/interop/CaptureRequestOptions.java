package androidx.camera.camera2.interop;

/* loaded from: classes.dex */
public class CaptureRequestOptions implements androidx.camera.core.impl.ReadableConfig {
    private final androidx.camera.core.impl.Config mConfig;

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

    public CaptureRequestOptions(androidx.camera.core.impl.Config config) {
        this.mConfig = config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> ValueT getCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key) {
        return (ValueT) this.mConfig.retrieveOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> ValueT getCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
        return (ValueT) this.mConfig.retrieveOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), valuet);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public androidx.camera.core.impl.Config getConfig() {
        return this.mConfig;
    }

    public static final class Builder implements androidx.camera.core.ExtendableBuilder<androidx.camera.camera2.interop.CaptureRequestOptions> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableOptionsBundle = androidx.camera.core.impl.MutableOptionsBundle.create();

        public static androidx.camera.camera2.interop.CaptureRequestOptions.Builder from(final androidx.camera.core.impl.Config config) {
            final androidx.camera.camera2.interop.CaptureRequestOptions.Builder builder = new androidx.camera.camera2.interop.CaptureRequestOptions.Builder();
            config.findOptions(androidx.camera.camera2.impl.Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM, new androidx.camera.core.impl.Config.OptionMatcher() { // from class: androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.Config.OptionMatcher
                public final boolean onOptionMatched(androidx.camera.core.impl.Config.Option option) {
                    return androidx.camera.camera2.interop.CaptureRequestOptions.Builder.lambda$from$0(androidx.camera.camera2.interop.CaptureRequestOptions.Builder.this, config, option);
                }
            });
            return builder;
        }

        static /* synthetic */ boolean lambda$from$0(androidx.camera.camera2.interop.CaptureRequestOptions.Builder builder, androidx.camera.core.impl.Config config, androidx.camera.core.impl.Config.Option option) {
            builder.getMutableConfig().insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
            return true;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.camera2.interop.CaptureRequestOptions.Builder setCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT value) {
            this.mMutableOptionsBundle.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), value);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.camera2.interop.CaptureRequestOptions.Builder clearCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key) {
            this.mMutableOptionsBundle.removeOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.camera2.interop.CaptureRequestOptions build() {
            return new androidx.camera.camera2.interop.CaptureRequestOptions(androidx.camera.core.impl.OptionsBundle.from(this.mMutableOptionsBundle));
        }
    }
}
