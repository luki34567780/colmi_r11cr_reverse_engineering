package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class UseCaseAttachState {
    private static final java.lang.String TAG = "UseCaseAttachState";
    private final java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> mAttachedUseCasesToInfoMap = new java.util.HashMap();
    private final java.lang.String mCameraId;

    /* JADX INFO: Access modifiers changed from: private */
    interface AttachStateFilter {
        boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo attachInfo);
    }

    public UseCaseAttachState(java.lang.String cameraId) {
        this.mCameraId = cameraId;
    }

    public void setUseCaseActive(java.lang.String useCaseName, androidx.camera.core.impl.SessionConfig sessionConfig) {
        getOrCreateUseCaseAttachInfo(useCaseName, sessionConfig).setActive(true);
    }

    public void setUseCaseInactive(java.lang.String useCaseName) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(useCaseName)) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(useCaseName);
            useCaseAttachInfo.setActive(false);
            if (useCaseAttachInfo.getAttached()) {
                return;
            }
            this.mAttachedUseCasesToInfoMap.remove(useCaseName);
        }
    }

    public void setUseCaseAttached(java.lang.String useCaseName, androidx.camera.core.impl.SessionConfig sessionConfig) {
        getOrCreateUseCaseAttachInfo(useCaseName, sessionConfig).setAttached(true);
    }

    public void setUseCaseDetached(java.lang.String useCaseName) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(useCaseName)) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(useCaseName);
            useCaseAttachInfo.setAttached(false);
            if (useCaseAttachInfo.getActive()) {
                return;
            }
            this.mAttachedUseCasesToInfoMap.remove(useCaseName);
        }
    }

    public boolean isUseCaseAttached(java.lang.String useCaseName) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(useCaseName)) {
            return this.mAttachedUseCasesToInfoMap.get(useCaseName).getAttached();
        }
        return false;
    }

    public java.util.Collection<androidx.camera.core.impl.SessionConfig> getAttachedSessionConfigs() {
        return java.util.Collections.unmodifiableCollection(getSessionConfigs(new androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter() { // from class: androidx.camera.core.impl.UseCaseAttachState$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
            public final boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
                boolean attached;
                attached = useCaseAttachInfo.getAttached();
                return attached;
            }
        }));
    }

    public java.util.Collection<androidx.camera.core.impl.SessionConfig> getActiveAndAttachedSessionConfigs() {
        return java.util.Collections.unmodifiableCollection(getSessionConfigs(new androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter() { // from class: androidx.camera.core.impl.UseCaseAttachState$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
            public final boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
                return androidx.camera.core.impl.UseCaseAttachState.lambda$getActiveAndAttachedSessionConfigs$1(useCaseAttachInfo);
            }
        }));
    }

    static /* synthetic */ boolean lambda$getActiveAndAttachedSessionConfigs$1(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
        return useCaseAttachInfo.getActive() && useCaseAttachInfo.getAttached();
    }

    public void updateUseCase(java.lang.String useCaseName, androidx.camera.core.impl.SessionConfig sessionConfig) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(useCaseName)) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = new androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo(sessionConfig);
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo2 = this.mAttachedUseCasesToInfoMap.get(useCaseName);
            useCaseAttachInfo.setAttached(useCaseAttachInfo2.getAttached());
            useCaseAttachInfo.setActive(useCaseAttachInfo2.getActive());
            this.mAttachedUseCasesToInfoMap.put(useCaseName, useCaseAttachInfo);
        }
    }

    public void removeUseCase(java.lang.String useCaseName) {
        this.mAttachedUseCasesToInfoMap.remove(useCaseName);
    }

    public androidx.camera.core.impl.SessionConfig.ValidatingBuilder getActiveAndAttachedBuilder() {
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo value = entry.getValue();
            if (value.getActive() && value.getAttached()) {
                java.lang.String key = entry.getKey();
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(key);
            }
        }
        androidx.camera.core.Logger.d(TAG, "Active and attached use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    public androidx.camera.core.impl.SessionConfig.ValidatingBuilder getAttachedBuilder() {
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo value = entry.getValue();
            if (value.getAttached()) {
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(entry.getKey());
            }
        }
        androidx.camera.core.Logger.d(TAG, "All use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    private androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo getOrCreateUseCaseAttachInfo(java.lang.String useCaseName, androidx.camera.core.impl.SessionConfig sessionConfig) {
        androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(useCaseName);
        if (useCaseAttachInfo != null) {
            return useCaseAttachInfo;
        }
        androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo2 = new androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo(sessionConfig);
        this.mAttachedUseCasesToInfoMap.put(useCaseName, useCaseAttachInfo2);
        return useCaseAttachInfo2;
    }

    private java.util.Collection<androidx.camera.core.impl.SessionConfig> getSessionConfigs(androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter attachStateFilter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue().getSessionConfig());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class UseCaseAttachInfo {
        private final androidx.camera.core.impl.SessionConfig mSessionConfig;
        private boolean mAttached = false;
        private boolean mActive = false;

        UseCaseAttachInfo(androidx.camera.core.impl.SessionConfig sessionConfig) {
            this.mSessionConfig = sessionConfig;
        }

        androidx.camera.core.impl.SessionConfig getSessionConfig() {
            return this.mSessionConfig;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean getAttached() {
            return this.mAttached;
        }

        void setAttached(boolean attached) {
            this.mAttached = attached;
        }

        boolean getActive() {
            return this.mActive;
        }

        void setActive(boolean active) {
            this.mActive = active;
        }
    }
}
