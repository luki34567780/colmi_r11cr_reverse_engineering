package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes.dex */
class OutputConfigurationCompatApi26Impl extends androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl {
    private static final java.lang.String MAX_SHARED_SURFACES_COUNT_FIELD = "MAX_SURFACES_COUNT";
    private static final java.lang.String SURFACES_FIELD = "mSurfaces";

    OutputConfigurationCompatApi26Impl(android.view.Surface surface) {
        this(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26(new android.hardware.camera2.params.OutputConfiguration(surface)));
    }

    OutputConfigurationCompatApi26Impl(java.lang.Object outputConfiguration) {
        super(outputConfiguration);
    }

    static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl wrap(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        return new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl(new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26(outputConfiguration));
    }

    private static int getMaxSharedSurfaceCountApi26() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        java.lang.reflect.Field declaredField = android.hardware.camera2.params.OutputConfiguration.class.getDeclaredField(MAX_SHARED_SURFACES_COUNT_FIELD);
        declaredField.setAccessible(true);
        return declaredField.getInt(null);
    }

    private static java.util.List<android.view.Surface> getMutableSurfaceListApi26(android.hardware.camera2.params.OutputConfiguration outputConfiguration) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        java.lang.reflect.Field declaredField = android.hardware.camera2.params.OutputConfiguration.class.getDeclaredField(SURFACES_FIELD);
        declaredField.setAccessible(true);
        return (java.util.List) declaredField.get(outputConfiguration);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).enableSurfaceSharing();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    final boolean isSurfaceSharingEnabled() {
        throw new java.lang.AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void addSurface(android.view.Surface surface) {
        ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).addSurface(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(java.lang.String physicalCameraId) {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) this.mObject).mPhysicalCameraId = physicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.String getPhysicalCameraId() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) this.mObject).mPhysicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(android.view.Surface surface) {
        if (getSurface() == surface) {
            throw new java.lang.IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
        try {
            if (getMutableSurfaceListApi26((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).remove(surface)) {
            } else {
                throw new java.lang.IllegalArgumentException("Surface is not part of this output configuration");
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException e) {
            androidx.camera.core.Logger.e("OutputConfigCompat", "Unable to remove surface from this output configuration.", e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        try {
            return getMaxSharedSurfaceCountApi26();
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException e) {
            androidx.camera.core.Logger.e("OutputConfigCompat", "Unable to retrieve max shared surface count.", e);
            return super.getMaxSharedSurfaceCount();
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.util.List<android.view.Surface> getSurfaces() {
        return ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).getSurfaces();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.Object getOutputConfiguration() {
        androidx.core.util.Preconditions.checkArgument(this.mObject instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26);
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) this.mObject).mOutputConfiguration;
    }

    private static final class OutputConfigurationParamsApi26 {
        final android.hardware.camera2.params.OutputConfiguration mOutputConfiguration;
        java.lang.String mPhysicalCameraId;

        OutputConfigurationParamsApi26(android.hardware.camera2.params.OutputConfiguration configuration) {
            this.mOutputConfiguration = configuration;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26)) {
                return false;
            }
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26 outputConfigurationParamsApi26 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.OutputConfigurationParamsApi26) obj;
            return java.util.Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi26.mOutputConfiguration) && java.util.Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi26.mPhysicalCameraId);
        }

        public int hashCode() {
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            java.lang.String str = this.mPhysicalCameraId;
            return (str == null ? 0 : str.hashCode()) ^ i;
        }
    }
}
