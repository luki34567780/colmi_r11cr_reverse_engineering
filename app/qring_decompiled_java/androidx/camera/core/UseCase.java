package androidx.camera.core;

/* loaded from: classes.dex */
public abstract class UseCase {
    private android.util.Size mAttachedResolution;
    private androidx.camera.core.impl.CameraInternal mCamera;
    private androidx.camera.core.impl.UseCaseConfig<?> mCameraConfig;
    private androidx.camera.core.impl.UseCaseConfig<?> mCurrentConfig;
    private androidx.camera.core.impl.UseCaseConfig<?> mExtendedConfig;
    private androidx.camera.core.impl.UseCaseConfig<?> mUseCaseConfig;
    private android.graphics.Rect mViewPortCropRect;
    private final java.util.Set<androidx.camera.core.UseCase.StateChangeCallback> mStateChangeCallbacks = new java.util.HashSet();
    private final java.lang.Object mCameraLock = new java.lang.Object();
    private androidx.camera.core.UseCase.State mState = androidx.camera.core.UseCase.State.INACTIVE;
    private androidx.camera.core.impl.SessionConfig mAttachedSessionConfig = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig();

    public interface EventCallback {
        void onAttach(androidx.camera.core.CameraInfo cameraInfo);

        void onDetach();
    }

    enum State {
        ACTIVE,
        INACTIVE
    }

    public interface StateChangeCallback {
        void onUseCaseActive(androidx.camera.core.UseCase useCase);

        void onUseCaseInactive(androidx.camera.core.UseCase useCase);

        void onUseCaseReset(androidx.camera.core.UseCase useCase);

        void onUseCaseUpdated(androidx.camera.core.UseCase useCase);
    }

    public abstract androidx.camera.core.impl.UseCaseConfig<?> getDefaultConfig(boolean applyDefaultConfig, androidx.camera.core.impl.UseCaseConfigFactory factory);

    public abstract androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(androidx.camera.core.impl.Config config);

    public void onAttached() {
    }

    protected void onCameraControlReady() {
    }

    public void onDetached() {
    }

    public void onStateDetached() {
    }

    protected abstract android.util.Size onSuggestedResolutionUpdated(android.util.Size suggestedResolution);

    protected UseCase(androidx.camera.core.impl.UseCaseConfig<?> currentConfig) {
        this.mUseCaseConfig = currentConfig;
        this.mCurrentConfig = currentConfig;
    }

    public androidx.camera.core.impl.UseCaseConfig<?> mergeConfigs(androidx.camera.core.impl.CameraInfoInternal cameraInfo, androidx.camera.core.impl.UseCaseConfig<?> extendedConfig, androidx.camera.core.impl.UseCaseConfig<?> cameraDefaultConfig) {
        androidx.camera.core.impl.MutableOptionsBundle create;
        if (cameraDefaultConfig != null) {
            create = androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) cameraDefaultConfig);
            create.removeOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME);
        } else {
            create = androidx.camera.core.impl.MutableOptionsBundle.create();
        }
        for (androidx.camera.core.impl.Config.Option<?> option : this.mUseCaseConfig.listOptions()) {
            create.insertOption(option, this.mUseCaseConfig.getOptionPriority(option), this.mUseCaseConfig.retrieveOption(option));
        }
        if (extendedConfig != null) {
            for (androidx.camera.core.impl.Config.Option<?> option2 : extendedConfig.listOptions()) {
                if (!option2.getId().equals(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME.getId())) {
                    create.insertOption(option2, extendedConfig.getOptionPriority(option2), extendedConfig.retrieveOption(option2));
                }
            }
        }
        if (create.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_RESOLUTION) && create.containsOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO)) {
            create.removeOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO);
        }
        return onMergeConfig(cameraInfo, getUseCaseConfigBuilder(create));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal cameraInfo, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder) {
        return builder.getUseCaseConfig();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    protected boolean setTargetRotationInternal(int targetRotation) {
        int targetRotation2 = ((androidx.camera.core.impl.ImageOutputConfig) getCurrentConfig()).getTargetRotation(-1);
        if (targetRotation2 != -1 && targetRotation2 == targetRotation) {
            return false;
        }
        androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> useCaseConfigBuilder = getUseCaseConfigBuilder(this.mUseCaseConfig);
        androidx.camera.core.internal.utils.UseCaseConfigUtil.updateTargetRotationAndRelatedConfigs(useCaseConfigBuilder, targetRotation);
        this.mUseCaseConfig = useCaseConfigBuilder.getUseCaseConfig();
        androidx.camera.core.impl.CameraInternal camera = getCamera();
        if (camera == null) {
            this.mCurrentConfig = this.mUseCaseConfig;
            return true;
        }
        this.mCurrentConfig = mergeConfigs(camera.getCameraInfoInternal(), this.mExtendedConfig, this.mCameraConfig);
        return true;
    }

    protected int getTargetRotationInternal() {
        return ((androidx.camera.core.impl.ImageOutputConfig) this.mCurrentConfig).getTargetRotation(0);
    }

    protected int getRelativeRotation(androidx.camera.core.impl.CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfoInternal().getSensorRotationDegrees(getTargetRotationInternal());
    }

    protected void updateSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
        this.mAttachedSessionConfig = sessionConfig;
    }

    private void addStateChangeCallback(androidx.camera.core.UseCase.StateChangeCallback callback) {
        this.mStateChangeCallbacks.add(callback);
    }

    private void removeStateChangeCallback(androidx.camera.core.UseCase.StateChangeCallback callback) {
        this.mStateChangeCallbacks.remove(callback);
    }

    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        return this.mAttachedSessionConfig;
    }

    protected final void notifyActive() {
        this.mState = androidx.camera.core.UseCase.State.ACTIVE;
        notifyState();
    }

    protected final void notifyInactive() {
        this.mState = androidx.camera.core.UseCase.State.INACTIVE;
        notifyState();
    }

    protected final void notifyUpdated() {
        java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it = this.mStateChangeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onUseCaseUpdated(this);
        }
    }

    protected final void notifyReset() {
        java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it = this.mStateChangeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onUseCaseReset(this);
        }
    }

    /* renamed from: androidx.camera.core.UseCase$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$UseCase$State;

        static {
            int[] iArr = new int[androidx.camera.core.UseCase.State.values().length];
            $SwitchMap$androidx$camera$core$UseCase$State = iArr;
            try {
                iArr[androidx.camera.core.UseCase.State.INACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$UseCase$State[androidx.camera.core.UseCase.State.ACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public final void notifyState() {
        int i = androidx.camera.core.UseCase.AnonymousClass1.$SwitchMap$androidx$camera$core$UseCase$State[this.mState.ordinal()];
        if (i == 1) {
            java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it = this.mStateChangeCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onUseCaseInactive(this);
            }
        } else {
            if (i != 2) {
                return;
            }
            java.util.Iterator<androidx.camera.core.UseCase.StateChangeCallback> it2 = this.mStateChangeCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onUseCaseActive(this);
            }
        }
    }

    protected java.lang.String getCameraId() {
        return ((androidx.camera.core.impl.CameraInternal) androidx.core.util.Preconditions.checkNotNull(getCamera(), "No camera attached to use case: " + this)).getCameraInfoInternal().getCameraId();
    }

    protected boolean isCurrentCamera(java.lang.String cameraId) {
        if (getCamera() == null) {
            return false;
        }
        return java.util.Objects.equals(cameraId, getCameraId());
    }

    public java.lang.String getName() {
        return this.mCurrentConfig.getTargetName("<UnknownUseCase-" + hashCode() + ">");
    }

    public androidx.camera.core.impl.UseCaseConfig<?> getCurrentConfig() {
        return this.mCurrentConfig;
    }

    public androidx.camera.core.impl.CameraInternal getCamera() {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        synchronized (this.mCameraLock) {
            cameraInternal = this.mCamera;
        }
        return cameraInternal;
    }

    public android.util.Size getAttachedSurfaceResolution() {
        return this.mAttachedResolution;
    }

    public void updateSuggestedResolution(android.util.Size suggestedResolution) {
        this.mAttachedResolution = onSuggestedResolutionUpdated(suggestedResolution);
    }

    public void onAttach(androidx.camera.core.impl.CameraInternal camera, androidx.camera.core.impl.UseCaseConfig<?> extendedConfig, androidx.camera.core.impl.UseCaseConfig<?> cameraConfig) {
        synchronized (this.mCameraLock) {
            this.mCamera = camera;
            addStateChangeCallback(camera);
        }
        this.mExtendedConfig = extendedConfig;
        this.mCameraConfig = cameraConfig;
        androidx.camera.core.impl.UseCaseConfig<?> mergeConfigs = mergeConfigs(camera.getCameraInfoInternal(), this.mExtendedConfig, this.mCameraConfig);
        this.mCurrentConfig = mergeConfigs;
        androidx.camera.core.UseCase.EventCallback useCaseEventCallback = mergeConfigs.getUseCaseEventCallback(null);
        if (useCaseEventCallback != null) {
            useCaseEventCallback.onAttach(camera.getCameraInfoInternal());
        }
        onAttached();
    }

    public void onDetach(androidx.camera.core.impl.CameraInternal camera) {
        onDetached();
        androidx.camera.core.UseCase.EventCallback useCaseEventCallback = this.mCurrentConfig.getUseCaseEventCallback(null);
        if (useCaseEventCallback != null) {
            useCaseEventCallback.onDetach();
        }
        synchronized (this.mCameraLock) {
            androidx.core.util.Preconditions.checkArgument(camera == this.mCamera);
            removeStateChangeCallback(this.mCamera);
            this.mCamera = null;
        }
        this.mAttachedResolution = null;
        this.mViewPortCropRect = null;
        this.mCurrentConfig = this.mUseCaseConfig;
        this.mExtendedConfig = null;
        this.mCameraConfig = null;
    }

    public void onStateAttached() {
        onCameraControlReady();
    }

    protected androidx.camera.core.impl.CameraControlInternal getCameraControl() {
        synchronized (this.mCameraLock) {
            androidx.camera.core.impl.CameraInternal cameraInternal = this.mCamera;
            if (cameraInternal == null) {
                return androidx.camera.core.impl.CameraControlInternal.DEFAULT_EMPTY_INSTANCE;
            }
            return cameraInternal.getCameraControlInternal();
        }
    }

    public void setViewPortCropRect(android.graphics.Rect viewPortCropRect) {
        this.mViewPortCropRect = viewPortCropRect;
    }

    public android.graphics.Rect getViewPortCropRect() {
        return this.mViewPortCropRect;
    }

    public int getImageFormat() {
        return this.mCurrentConfig.getInputFormat();
    }
}
