package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class CaptureConfig {
    final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCameraCaptureCallbacks;
    final androidx.camera.core.impl.Config mImplementationOptions;
    final java.util.List<androidx.camera.core.impl.DeferrableSurface> mSurfaces;
    private final androidx.camera.core.impl.TagBundle mTagBundle;
    final int mTemplateType;
    private final boolean mUseRepeatingSurface;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_ROTATION = androidx.camera.core.impl.Config.Option.create("camerax.core.captureConfig.rotation", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_JPEG_QUALITY = androidx.camera.core.impl.Config.Option.create("camerax.core.captureConfig.jpegQuality", java.lang.Integer.class);

    public interface OptionUnpacker {
        void unpack(androidx.camera.core.impl.UseCaseConfig<?> config, androidx.camera.core.impl.CaptureConfig.Builder builder);
    }

    CaptureConfig(java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces, androidx.camera.core.impl.Config implementationOptions, int templateType, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> cameraCaptureCallbacks, boolean useRepeatingSurface, androidx.camera.core.impl.TagBundle tagBundle) {
        this.mSurfaces = surfaces;
        this.mImplementationOptions = implementationOptions;
        this.mTemplateType = templateType;
        this.mCameraCaptureCallbacks = java.util.Collections.unmodifiableList(cameraCaptureCallbacks);
        this.mUseRepeatingSurface = useRepeatingSurface;
        this.mTagBundle = tagBundle;
    }

    public static androidx.camera.core.impl.CaptureConfig defaultEmptyCaptureConfig() {
        return new androidx.camera.core.impl.CaptureConfig.Builder().build();
    }

    public java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
        return java.util.Collections.unmodifiableList(this.mSurfaces);
    }

    public androidx.camera.core.impl.Config getImplementationOptions() {
        return this.mImplementationOptions;
    }

    public int getTemplateType() {
        return this.mTemplateType;
    }

    public boolean isUseRepeatingSurface() {
        return this.mUseRepeatingSurface;
    }

    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getCameraCaptureCallbacks() {
        return this.mCameraCaptureCallbacks;
    }

    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.mTagBundle;
    }

    public static final class Builder {
        private java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCameraCaptureCallbacks;
        private androidx.camera.core.impl.MutableConfig mImplementationOptions;
        private androidx.camera.core.impl.MutableTagBundle mMutableTagBundle;
        private final java.util.Set<androidx.camera.core.impl.DeferrableSurface> mSurfaces;
        private int mTemplateType;
        private boolean mUseRepeatingSurface;

        public Builder() {
            this.mSurfaces = new java.util.HashSet();
            this.mImplementationOptions = androidx.camera.core.impl.MutableOptionsBundle.create();
            this.mTemplateType = -1;
            this.mCameraCaptureCallbacks = new java.util.ArrayList();
            this.mUseRepeatingSurface = false;
            this.mMutableTagBundle = androidx.camera.core.impl.MutableTagBundle.create();
        }

        private Builder(androidx.camera.core.impl.CaptureConfig base) {
            java.util.HashSet hashSet = new java.util.HashSet();
            this.mSurfaces = hashSet;
            this.mImplementationOptions = androidx.camera.core.impl.MutableOptionsBundle.create();
            this.mTemplateType = -1;
            this.mCameraCaptureCallbacks = new java.util.ArrayList();
            this.mUseRepeatingSurface = false;
            this.mMutableTagBundle = androidx.camera.core.impl.MutableTagBundle.create();
            hashSet.addAll(base.mSurfaces);
            this.mImplementationOptions = androidx.camera.core.impl.MutableOptionsBundle.from(base.mImplementationOptions);
            this.mTemplateType = base.mTemplateType;
            this.mCameraCaptureCallbacks.addAll(base.getCameraCaptureCallbacks());
            this.mUseRepeatingSurface = base.isUseRepeatingSurface();
            this.mMutableTagBundle = androidx.camera.core.impl.MutableTagBundle.from(base.getTagBundle());
        }

        public static androidx.camera.core.impl.CaptureConfig.Builder createFrom(androidx.camera.core.impl.UseCaseConfig<?> config) {
            androidx.camera.core.impl.CaptureConfig.OptionUnpacker captureOptionUnpacker = config.getCaptureOptionUnpacker(null);
            if (captureOptionUnpacker == null) {
                throw new java.lang.IllegalStateException("Implementation is missing option unpacker for " + config.getTargetName(config.toString()));
            }
            androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
            captureOptionUnpacker.unpack(config, builder);
            return builder;
        }

        public static androidx.camera.core.impl.CaptureConfig.Builder from(androidx.camera.core.impl.CaptureConfig base) {
            return new androidx.camera.core.impl.CaptureConfig.Builder(base);
        }

        public int getTemplateType() {
            return this.mTemplateType;
        }

        public void setTemplateType(int templateType) {
            this.mTemplateType = templateType;
        }

        public void addCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            if (this.mCameraCaptureCallbacks.contains(cameraCaptureCallback)) {
                throw new java.lang.IllegalArgumentException("duplicate camera capture callback");
            }
            this.mCameraCaptureCallbacks.add(cameraCaptureCallback);
        }

        public void addAllCameraCaptureCallbacks(java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> cameraCaptureCallbacks) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = cameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                addCameraCaptureCallback(it.next());
            }
        }

        public void addSurface(androidx.camera.core.impl.DeferrableSurface surface) {
            this.mSurfaces.add(surface);
        }

        public void removeSurface(androidx.camera.core.impl.DeferrableSurface surface) {
            this.mSurfaces.remove(surface);
        }

        public void clearSurfaces() {
            this.mSurfaces.clear();
        }

        public java.util.Set<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
            return this.mSurfaces;
        }

        public void setImplementationOptions(androidx.camera.core.impl.Config config) {
            this.mImplementationOptions = androidx.camera.core.impl.MutableOptionsBundle.from(config);
        }

        public void addImplementationOptions(androidx.camera.core.impl.Config config) {
            for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
                java.lang.Object retrieveOption = this.mImplementationOptions.retrieveOption(option, null);
                java.lang.Object retrieveOption2 = config.retrieveOption(option);
                if (retrieveOption instanceof androidx.camera.core.impl.MultiValueSet) {
                    ((androidx.camera.core.impl.MultiValueSet) retrieveOption).addAll(((androidx.camera.core.impl.MultiValueSet) retrieveOption2).getAllItems());
                } else {
                    if (retrieveOption2 instanceof androidx.camera.core.impl.MultiValueSet) {
                        retrieveOption2 = ((androidx.camera.core.impl.MultiValueSet) retrieveOption2).mo2clone();
                    }
                    this.mImplementationOptions.insertOption(option, config.getOptionPriority(option), retrieveOption2);
                }
            }
        }

        public <T> void addImplementationOption(androidx.camera.core.impl.Config.Option<T> option, T value) {
            this.mImplementationOptions.insertOption(option, value);
        }

        public androidx.camera.core.impl.Config getImplementationOptions() {
            return this.mImplementationOptions;
        }

        boolean isUseRepeatingSurface() {
            return this.mUseRepeatingSurface;
        }

        public void setUseRepeatingSurface(boolean useRepeatingSurface) {
            this.mUseRepeatingSurface = useRepeatingSurface;
        }

        public java.lang.Integer getTag(java.lang.String key) {
            return this.mMutableTagBundle.getTag(key);
        }

        public void addTag(java.lang.String key, java.lang.Integer tag) {
            this.mMutableTagBundle.putTag(key, tag);
        }

        public void addAllTags(androidx.camera.core.impl.TagBundle bundle) {
            this.mMutableTagBundle.addTagBundle(bundle);
        }

        public androidx.camera.core.impl.CaptureConfig build() {
            return new androidx.camera.core.impl.CaptureConfig(new java.util.ArrayList(this.mSurfaces), androidx.camera.core.impl.OptionsBundle.from(this.mImplementationOptions), this.mTemplateType, this.mCameraCaptureCallbacks, this.mUseRepeatingSurface, androidx.camera.core.impl.TagBundle.from(this.mMutableTagBundle));
        }
    }
}
