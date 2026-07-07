package androidx.camera.core.internal;

/* loaded from: classes.dex */
public final class CameraUseCaseAdapter implements androidx.camera.core.Camera {
    private static final java.lang.String TAG = "CameraUseCaseAdapter";
    private final androidx.camera.core.impl.CameraDeviceSurfaceManager mCameraDeviceSurfaceManager;
    private androidx.camera.core.impl.CameraInternal mCameraInternal;
    private final java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> mCameraInternals;
    private final androidx.camera.core.internal.CameraUseCaseAdapter.CameraId mId;
    private final androidx.camera.core.impl.UseCaseConfigFactory mUseCaseConfigFactory;
    private androidx.camera.core.ViewPort mViewPort;
    private final java.util.List<androidx.camera.core.UseCase> mUseCases = new java.util.ArrayList();
    private androidx.camera.core.impl.CameraConfig mCameraConfig = androidx.camera.core.impl.CameraConfigs.emptyConfig();
    private final java.lang.Object mLock = new java.lang.Object();
    private boolean mAttached = true;
    private androidx.camera.core.impl.Config mInteropConfig = null;

    public CameraUseCaseAdapter(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameras, androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
        this.mCameraInternal = cameras.iterator().next();
        java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet = new java.util.LinkedHashSet<>(cameras);
        this.mCameraInternals = linkedHashSet;
        this.mId = new androidx.camera.core.internal.CameraUseCaseAdapter.CameraId(linkedHashSet);
        this.mCameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
    }

    public static androidx.camera.core.internal.CameraUseCaseAdapter.CameraId generateCameraId(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameras) {
        return new androidx.camera.core.internal.CameraUseCaseAdapter.CameraId(cameras);
    }

    public androidx.camera.core.internal.CameraUseCaseAdapter.CameraId getCameraId() {
        return this.mId;
    }

    public boolean isEquivalent(androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter) {
        return this.mId.equals(cameraUseCaseAdapter.getCameraId());
    }

    public void setViewPort(androidx.camera.core.ViewPort viewPort) {
        synchronized (this.mLock) {
            this.mViewPort = viewPort;
        }
    }

    public void checkAttachUseCases(java.util.List<androidx.camera.core.UseCase> useCases) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        synchronized (this.mLock) {
            try {
                try {
                    calculateSuggestedResolutions(this.mCameraInternal.getCameraInfoInternal(), useCases, java.util.Collections.emptyList(), getConfigs(useCases, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory));
                } catch (java.lang.IllegalArgumentException e) {
                    throw new androidx.camera.core.internal.CameraUseCaseAdapter.CameraException(e.getMessage());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void addUseCases(java.util.Collection<androidx.camera.core.UseCase> useCases) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        synchronized (this.mLock) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.camera.core.UseCase useCase : useCases) {
                if (this.mUseCases.contains(useCase)) {
                    androidx.camera.core.Logger.d(TAG, "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(useCase);
                }
            }
            java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> configs = getConfigs(arrayList, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory);
            try {
                java.util.Map<androidx.camera.core.UseCase, android.util.Size> calculateSuggestedResolutions = calculateSuggestedResolutions(this.mCameraInternal.getCameraInfoInternal(), arrayList, this.mUseCases, configs);
                updateViewPort(calculateSuggestedResolutions, useCases);
                for (androidx.camera.core.UseCase useCase2 : arrayList) {
                    androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair configPair = configs.get(useCase2);
                    useCase2.onAttach(this.mCameraInternal, configPair.mExtendedConfig, configPair.mCameraConfig);
                    useCase2.updateSuggestedResolution((android.util.Size) androidx.core.util.Preconditions.checkNotNull(calculateSuggestedResolutions.get(useCase2)));
                }
                this.mUseCases.addAll(arrayList);
                if (this.mAttached) {
                    this.mCameraInternal.attachUseCases(arrayList);
                }
                java.util.Iterator<androidx.camera.core.UseCase> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().notifyState();
                }
            } catch (java.lang.IllegalArgumentException e) {
                throw new androidx.camera.core.internal.CameraUseCaseAdapter.CameraException(e.getMessage());
            }
        }
    }

    public void removeUseCases(java.util.Collection<androidx.camera.core.UseCase> useCases) {
        synchronized (this.mLock) {
            this.mCameraInternal.detachUseCases(useCases);
            for (androidx.camera.core.UseCase useCase : useCases) {
                if (this.mUseCases.contains(useCase)) {
                    useCase.onDetach(this.mCameraInternal);
                } else {
                    androidx.camera.core.Logger.e(TAG, "Attempting to detach non-attached UseCase: " + useCase);
                }
            }
            this.mUseCases.removeAll(useCases);
        }
    }

    public java.util.List<androidx.camera.core.UseCase> getUseCases() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList(this.mUseCases);
        }
        return arrayList;
    }

    public void attachUseCases() {
        synchronized (this.mLock) {
            if (!this.mAttached) {
                this.mCameraInternal.attachUseCases(this.mUseCases);
                restoreInteropConfig();
                java.util.Iterator<androidx.camera.core.UseCase> it = this.mUseCases.iterator();
                while (it.hasNext()) {
                    it.next().notifyState();
                }
                this.mAttached = true;
            }
        }
    }

    public void detachUseCases() {
        synchronized (this.mLock) {
            if (this.mAttached) {
                cacheInteropConfig();
                this.mCameraInternal.detachUseCases(new java.util.ArrayList(this.mUseCases));
                this.mAttached = false;
            }
        }
    }

    private void restoreInteropConfig() {
        synchronized (this.mLock) {
            if (this.mInteropConfig != null) {
                this.mCameraInternal.getCameraControlInternal().addInteropConfig(this.mInteropConfig);
            }
        }
    }

    private void cacheInteropConfig() {
        synchronized (this.mLock) {
            androidx.camera.core.impl.CameraControlInternal cameraControlInternal = this.mCameraInternal.getCameraControlInternal();
            this.mInteropConfig = cameraControlInternal.getInteropConfig();
            cameraControlInternal.clearInteropConfig();
        }
    }

    private java.util.Map<androidx.camera.core.UseCase, android.util.Size> calculateSuggestedResolutions(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<androidx.camera.core.UseCase> newUseCases, java.util.List<androidx.camera.core.UseCase> currentUseCases, java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> configPairMap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String cameraId = cameraInfoInternal.getCameraId();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : currentUseCases) {
            arrayList.add(this.mCameraDeviceSurfaceManager.transformSurfaceConfig(cameraId, useCase.getImageFormat(), useCase.getAttachedSurfaceResolution()));
            hashMap.put(useCase, useCase.getAttachedSurfaceResolution());
        }
        if (!newUseCases.isEmpty()) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (androidx.camera.core.UseCase useCase2 : newUseCases) {
                androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair configPair = configPairMap.get(useCase2);
                hashMap2.put(useCase2.mergeConfigs(cameraInfoInternal, configPair.mExtendedConfig, configPair.mCameraConfig), useCase2);
            }
            java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, android.util.Size> suggestedResolutions = this.mCameraDeviceSurfaceManager.getSuggestedResolutions(cameraId, arrayList, new java.util.ArrayList(hashMap2.keySet()));
            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((androidx.camera.core.UseCase) entry.getValue(), suggestedResolutions.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    private void updateViewPort(java.util.Map<androidx.camera.core.UseCase, android.util.Size> suggestedResolutionsMap, java.util.Collection<androidx.camera.core.UseCase> useCases) {
        synchronized (this.mLock) {
            if (this.mViewPort != null) {
                java.util.Map<androidx.camera.core.UseCase, android.graphics.Rect> calculateViewPortRects = androidx.camera.core.internal.ViewPorts.calculateViewPortRects(this.mCameraInternal.getCameraControlInternal().getSensorRect(), this.mCameraInternal.getCameraInfoInternal().getLensFacing().intValue() == 0, this.mViewPort.getAspectRatio(), this.mCameraInternal.getCameraInfoInternal().getSensorRotationDegrees(this.mViewPort.getRotation()), this.mViewPort.getScaleType(), this.mViewPort.getLayoutDirection(), suggestedResolutionsMap);
                for (androidx.camera.core.UseCase useCase : useCases) {
                    useCase.setViewPortCropRect((android.graphics.Rect) androidx.core.util.Preconditions.checkNotNull(calculateViewPortRects.get(useCase)));
                }
            }
        }
    }

    private static class ConfigPair {
        androidx.camera.core.impl.UseCaseConfig<?> mCameraConfig;
        androidx.camera.core.impl.UseCaseConfig<?> mExtendedConfig;

        ConfigPair(androidx.camera.core.impl.UseCaseConfig<?> extendedConfig, androidx.camera.core.impl.UseCaseConfig<?> cameraConfig) {
            this.mExtendedConfig = extendedConfig;
            this.mCameraConfig = cameraConfig;
        }
    }

    private java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> getConfigs(java.util.List<androidx.camera.core.UseCase> useCases, androidx.camera.core.impl.UseCaseConfigFactory extendedFactory, androidx.camera.core.impl.UseCaseConfigFactory cameraFactory) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.UseCase useCase : useCases) {
            hashMap.put(useCase, new androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair(useCase.getDefaultConfig(false, extendedFactory), useCase.getDefaultConfig(true, cameraFactory)));
        }
        return hashMap;
    }

    public static final class CameraId {
        private final java.util.List<java.lang.String> mIds = new java.util.ArrayList();

        CameraId(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameraInternals) {
            java.util.Iterator<androidx.camera.core.impl.CameraInternal> it = cameraInternals.iterator();
            while (it.hasNext()) {
                this.mIds.add(it.next().getCameraInfoInternal().getCameraId());
            }
        }

        public boolean equals(java.lang.Object cameraId) {
            if (cameraId instanceof androidx.camera.core.internal.CameraUseCaseAdapter.CameraId) {
                return this.mIds.equals(((androidx.camera.core.internal.CameraUseCaseAdapter.CameraId) cameraId).mIds);
            }
            return false;
        }

        public int hashCode() {
            return this.mIds.hashCode() * 53;
        }
    }

    public static final class CameraException extends java.lang.Exception {
        public CameraException() {
        }

        public CameraException(java.lang.String message) {
            super(message);
        }

        public CameraException(java.lang.Throwable cause) {
            super(cause);
        }
    }

    @Override // androidx.camera.core.Camera
    public androidx.camera.core.CameraControl getCameraControl() {
        return this.mCameraInternal.getCameraControlInternal();
    }

    @Override // androidx.camera.core.Camera
    public androidx.camera.core.CameraInfo getCameraInfo() {
        return this.mCameraInternal.getCameraInfoInternal();
    }

    @Override // androidx.camera.core.Camera
    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameraInternals() {
        return this.mCameraInternals;
    }

    @Override // androidx.camera.core.Camera
    public androidx.camera.core.impl.CameraConfig getExtendedConfig() {
        androidx.camera.core.impl.CameraConfig cameraConfig;
        synchronized (this.mLock) {
            cameraConfig = this.mCameraConfig;
        }
        return cameraConfig;
    }

    @Override // androidx.camera.core.Camera
    public void setExtendedConfig(androidx.camera.core.impl.CameraConfig cameraConfig) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        synchronized (this.mLock) {
            if (cameraConfig == null) {
                try {
                    cameraConfig = androidx.camera.core.impl.CameraConfigs.emptyConfig();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            androidx.camera.core.impl.CameraInternal select = new androidx.camera.core.CameraSelector.Builder().addCameraFilter(cameraConfig.getCameraFilter()).build().select(this.mCameraInternals);
            java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> configs = getConfigs(this.mUseCases, cameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory);
            try {
                java.util.Map<androidx.camera.core.UseCase, android.util.Size> calculateSuggestedResolutions = calculateSuggestedResolutions(select.getCameraInfoInternal(), this.mUseCases, java.util.Collections.emptyList(), configs);
                updateViewPort(calculateSuggestedResolutions, this.mUseCases);
                if (this.mAttached) {
                    this.mCameraInternal.detachUseCases(this.mUseCases);
                }
                java.util.Iterator<androidx.camera.core.UseCase> it = this.mUseCases.iterator();
                while (it.hasNext()) {
                    it.next().onDetach(this.mCameraInternal);
                }
                for (androidx.camera.core.UseCase useCase : this.mUseCases) {
                    androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair configPair = configs.get(useCase);
                    useCase.onAttach(select, configPair.mExtendedConfig, configPair.mCameraConfig);
                    useCase.updateSuggestedResolution((android.util.Size) androidx.core.util.Preconditions.checkNotNull(calculateSuggestedResolutions.get(useCase)));
                }
                if (this.mAttached) {
                    select.attachUseCases(this.mUseCases);
                }
                java.util.Iterator<androidx.camera.core.UseCase> it2 = this.mUseCases.iterator();
                while (it2.hasNext()) {
                    it2.next().notifyState();
                }
                this.mCameraInternal = select;
                this.mCameraConfig = cameraConfig;
            } catch (java.lang.IllegalArgumentException e) {
                throw new androidx.camera.core.internal.CameraUseCaseAdapter.CameraException(e.getMessage());
            }
        }
    }
}
