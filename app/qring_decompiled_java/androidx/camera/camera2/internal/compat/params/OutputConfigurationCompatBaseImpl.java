package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes.dex */
class OutputConfigurationCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl {
    static final java.lang.String TAG = "OutputConfigCompat";
    final java.lang.Object mObject;

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        return 1;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.Object getOutputConfiguration() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getSurfaceGroupId() {
        return -1;
    }

    OutputConfigurationCompatBaseImpl(android.view.Surface surface) {
        this.mObject = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21(surface);
    }

    OutputConfigurationCompatBaseImpl(java.lang.Object outputConfiguration) {
        this.mObject = outputConfiguration;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mIsShared = true;
    }

    boolean isSurfaceSharingEnabled() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mIsShared;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(java.lang.String physicalCameraId) {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mPhysicalCameraId = physicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.String getPhysicalCameraId() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mPhysicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void addSurface(android.view.Surface surface) {
        androidx.core.util.Preconditions.checkNotNull(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new java.lang.IllegalStateException("Surface is already added!");
        }
        if (!isSurfaceSharingEnabled()) {
            throw new java.lang.IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new java.lang.IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(android.view.Surface surface) {
        if (getSurface() == surface) {
            throw new java.lang.IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
        throw new java.lang.IllegalArgumentException("Surface is not part of this output configuration");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public android.view.Surface getSurface() {
        java.util.List<android.view.Surface> list = ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mSurfaces;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.util.List<android.view.Surface> getSurfaces() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mSurfaces;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl) {
            return java.util.Objects.equals(this.mObject, ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl) obj).mObject);
        }
        return false;
    }

    public int hashCode() {
        return this.mObject.hashCode();
    }

    private static final class OutputConfigurationParamsApi21 {
        private static final java.lang.String DETECT_SURFACE_TYPE_METHOD = "detectSurfaceType";
        private static final java.lang.String GET_GENERATION_ID_METHOD = "getGenerationId";
        private static final java.lang.String GET_SURFACE_SIZE_METHOD = "getSurfaceSize";
        private static final java.lang.String LEGACY_CAMERA_DEVICE_CLASS = "android.hardware.camera2.legacy.LegacyCameraDevice";
        static final int MAX_SURFACES_COUNT = 1;
        final int mConfiguredFormat;
        final int mConfiguredGenerationId;
        final android.util.Size mConfiguredSize;
        boolean mIsShared = false;
        java.lang.String mPhysicalCameraId;
        final java.util.List<android.view.Surface> mSurfaces;

        OutputConfigurationParamsApi21(android.view.Surface surface) {
            androidx.core.util.Preconditions.checkNotNull(surface, "Surface must not be null");
            this.mSurfaces = java.util.Collections.singletonList(surface);
            this.mConfiguredSize = getSurfaceSize(surface);
            this.mConfiguredFormat = getSurfaceFormat(surface);
            this.mConfiguredGenerationId = getSurfaceGenerationId(surface);
        }

        private static android.util.Size getSurfaceSize(android.view.Surface surface) {
            try {
                java.lang.reflect.Method declaredMethod = java.lang.Class.forName(LEGACY_CAMERA_DEVICE_CLASS).getDeclaredMethod(GET_SURFACE_SIZE_METHOD, android.view.Surface.class);
                declaredMethod.setAccessible(true);
                return (android.util.Size) declaredMethod.invoke(null, surface);
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                androidx.camera.core.Logger.e(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve surface size.", e);
                return null;
            }
        }

        private static int getSurfaceFormat(android.view.Surface surface) {
            try {
                java.lang.reflect.Method declaredMethod = java.lang.Class.forName(LEGACY_CAMERA_DEVICE_CLASS).getDeclaredMethod(DETECT_SURFACE_TYPE_METHOD, android.view.Surface.class);
                if (android.os.Build.VERSION.SDK_INT < 22) {
                    declaredMethod.setAccessible(true);
                }
                return ((java.lang.Integer) declaredMethod.invoke(null, surface)).intValue();
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                androidx.camera.core.Logger.e(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve surface format.", e);
                return 0;
            }
        }

        private static int getSurfaceGenerationId(android.view.Surface surface) {
            try {
                return ((java.lang.Integer) android.view.Surface.class.getDeclaredMethod(GET_GENERATION_ID_METHOD, new java.lang.Class[0]).invoke(surface, new java.lang.Object[0])).intValue();
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                androidx.camera.core.Logger.e(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve surface generation id.", e);
                return -1;
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21)) {
                return false;
            }
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21 outputConfigurationParamsApi21 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) obj;
            if (!this.mConfiguredSize.equals(outputConfigurationParamsApi21.mConfiguredSize) || this.mConfiguredFormat != outputConfigurationParamsApi21.mConfiguredFormat || this.mConfiguredGenerationId != outputConfigurationParamsApi21.mConfiguredGenerationId || this.mIsShared != outputConfigurationParamsApi21.mIsShared || !java.util.Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi21.mPhysicalCameraId)) {
                return false;
            }
            int min = java.lang.Math.min(this.mSurfaces.size(), outputConfigurationParamsApi21.mSurfaces.size());
            for (int i = 0; i < min; i++) {
                if (this.mSurfaces.get(i) != outputConfigurationParamsApi21.mSurfaces.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.mSurfaces.hashCode() ^ 31;
            int i = this.mConfiguredGenerationId ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.mConfiguredSize.hashCode() ^ ((i << 5) - i);
            int i2 = this.mConfiguredFormat ^ ((hashCode2 << 5) - hashCode2);
            int i3 = (this.mIsShared ? 1 : 0) ^ ((i2 << 5) - i2);
            int i4 = (i3 << 5) - i3;
            java.lang.String str = this.mPhysicalCameraId;
            return (str == null ? 0 : str.hashCode()) ^ i4;
        }
    }
}
