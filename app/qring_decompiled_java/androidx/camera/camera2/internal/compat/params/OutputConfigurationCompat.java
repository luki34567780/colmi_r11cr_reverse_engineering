package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes.dex */
public final class OutputConfigurationCompat {
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private final androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl mImpl;

    interface OutputConfigurationCompatImpl {
        void addSurface(android.view.Surface surface);

        void enableSurfaceSharing();

        int getMaxSharedSurfaceCount();

        java.lang.Object getOutputConfiguration();

        java.lang.String getPhysicalCameraId();

        android.view.Surface getSurface();

        int getSurfaceGroupId();

        java.util.List<android.view.Surface> getSurfaces();

        void removeSurface(android.view.Surface surface);

        void setPhysicalCameraId(java.lang.String physicalCameraId);
    }

    public OutputConfigurationCompat(android.view.Surface surface) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl(surface);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl(surface);
        } else if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl(surface);
        } else {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl(surface);
        }
    }

    public <T> OutputConfigurationCompat(android.util.Size surfaceSize, java.lang.Class<T> klass) {
        android.hardware.camera2.params.OutputConfiguration outputConfiguration = new android.hardware.camera2.params.OutputConfiguration(surfaceSize, klass);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.wrap(outputConfiguration);
        } else {
            this.mImpl = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.wrap(outputConfiguration);
        }
    }

    private OutputConfigurationCompat(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl impl) {
        this.mImpl = impl;
    }

    public static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat wrap(java.lang.Object outputConfiguration) {
        androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl wrap;
        if (outputConfiguration == null) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            wrap = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.wrap((android.hardware.camera2.params.OutputConfiguration) outputConfiguration);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            wrap = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.wrap((android.hardware.camera2.params.OutputConfiguration) outputConfiguration);
        } else {
            wrap = android.os.Build.VERSION.SDK_INT >= 24 ? androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.wrap((android.hardware.camera2.params.OutputConfiguration) outputConfiguration) : null;
        }
        if (wrap == null) {
            return null;
        }
        return new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat(wrap);
    }

    public void enableSurfaceSharing() {
        this.mImpl.enableSurfaceSharing();
    }

    public java.lang.String getPhysicalCameraId() {
        return this.mImpl.getPhysicalCameraId();
    }

    public void setPhysicalCameraId(java.lang.String physicalCameraId) {
        this.mImpl.setPhysicalCameraId(physicalCameraId);
    }

    public void addSurface(android.view.Surface surface) {
        this.mImpl.addSurface(surface);
    }

    public void removeSurface(android.view.Surface surface) {
        this.mImpl.removeSurface(surface);
    }

    public int getMaxSharedSurfaceCount() {
        return this.mImpl.getMaxSharedSurfaceCount();
    }

    public android.view.Surface getSurface() {
        return this.mImpl.getSurface();
    }

    public java.util.List<android.view.Surface> getSurfaces() {
        return this.mImpl.getSurfaces();
    }

    public int getSurfaceGroupId() {
        return this.mImpl.getSurfaceGroupId();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) {
            return this.mImpl.equals(((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public java.lang.Object unwrap() {
        return this.mImpl.getOutputConfiguration();
    }
}
