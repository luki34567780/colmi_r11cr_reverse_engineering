package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes.dex */
class OutputConfigurationCompatApi28Impl extends androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl {
    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.String getPhysicalCameraId() {
        return null;
    }

    OutputConfigurationCompatApi28Impl(android.view.Surface surface) {
        super(new android.hardware.camera2.params.OutputConfiguration(surface));
    }

    OutputConfigurationCompatApi28Impl(java.lang.Object outputConfiguration) {
        super(outputConfiguration);
    }

    static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl wrap(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        return new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl(outputConfiguration);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(android.view.Surface surface) {
        ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        return ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(java.lang.String physicalCameraId) {
        ((android.hardware.camera2.params.OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(physicalCameraId);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.Object getOutputConfiguration() {
        androidx.core.util.Preconditions.checkArgument(this.mObject instanceof android.hardware.camera2.params.OutputConfiguration);
        return this.mObject;
    }
}
