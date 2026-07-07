package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes.dex */
class OutputConfigurationCompatApi24Impl extends androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl {
    OutputConfigurationCompatApi24Impl(android.view.Surface surface) {
        this(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24(new android.hardware.camera2.params.OutputConfiguration(surface)));
    }

    OutputConfigurationCompatApi24Impl(java.lang.Object outputConfiguration) {
        super(outputConfiguration);
    }

    static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl wrap(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        return new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24(outputConfiguration));
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mIsShared = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    boolean isSurfaceSharingEnabled() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mIsShared;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(java.lang.String physicalCameraId) {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mPhysicalCameraId = physicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.String getPhysicalCameraId() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mPhysicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public android.view.Surface getSurface() {
        return ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.util.List<android.view.Surface> getSurfaces() {
        return java.util.Collections.singletonList(getSurface());
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getSurfaceGroupId() {
        return ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).getSurfaceGroupId();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.Object getOutputConfiguration() {
        androidx.core.util.Preconditions.checkArgument(this.mObject instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24);
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) this.mObject).mOutputConfiguration;
    }

    private static final class OutputConfigurationParamsApi24 {
        boolean mIsShared;
        final android.hardware.camera2.params.OutputConfiguration mOutputConfiguration;
        java.lang.String mPhysicalCameraId;

        OutputConfigurationParamsApi24(android.hardware.camera2.params.OutputConfiguration configuration) {
            this.mOutputConfiguration = configuration;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24)) {
                return false;
            }
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24 outputConfigurationParamsApi24 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.OutputConfigurationParamsApi24) obj;
            return java.util.Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi24.mOutputConfiguration) && this.mIsShared == outputConfigurationParamsApi24.mIsShared && java.util.Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi24.mPhysicalCameraId);
        }

        public int hashCode() {
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            int i = (this.mIsShared ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i2 = (i << 5) - i;
            java.lang.String str = this.mPhysicalCameraId;
            return (str == null ? 0 : str.hashCode()) ^ i2;
        }
    }
}
