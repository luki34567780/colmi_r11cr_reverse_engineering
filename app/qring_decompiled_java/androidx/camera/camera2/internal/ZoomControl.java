package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
final class ZoomControl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private static final java.lang.String TAG = "ZoomControl";
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final androidx.camera.camera2.internal.ZoomStateImpl mCurrentZoomState;
    private final java.util.concurrent.Executor mExecutor;
    final androidx.camera.camera2.internal.ZoomControl.ZoomImpl mZoomImpl;
    private final androidx.lifecycle.MutableLiveData<androidx.camera.core.ZoomState> mZoomStateLiveData;
    private boolean mIsActive = false;
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener = new androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ZoomControl.1
        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult captureResult) {
            androidx.camera.camera2.internal.ZoomControl.this.mZoomImpl.onCaptureResult(captureResult);
            return false;
        }
    };

    interface ZoomImpl {
        void addRequestOption(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder);

        android.graphics.Rect getCropSensorRegion();

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(android.hardware.camera2.TotalCaptureResult captureResult);

        void resetZoom();

        void setZoomRatio(float zoomRatio, androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer);
    }

    ZoomControl(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristics, java.util.concurrent.Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        androidx.camera.camera2.internal.ZoomControl.ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristics);
        this.mZoomImpl = createZoomImpl;
        androidx.camera.camera2.internal.ZoomStateImpl zoomStateImpl = new androidx.camera.camera2.internal.ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        this.mCurrentZoomState = zoomStateImpl;
        zoomStateImpl.setZoomRatio(1.0f);
        this.mZoomStateLiveData = new androidx.lifecycle.MutableLiveData<>(androidx.camera.core.internal.ImmutableZoomState.create(zoomStateImpl));
        camera2CameraControlImpl.addCaptureResultListener(this.mCaptureResultListener);
    }

    static androidx.camera.core.ZoomState getDefaultZoomState(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristics) {
        androidx.camera.camera2.internal.ZoomControl.ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristics);
        androidx.camera.camera2.internal.ZoomStateImpl zoomStateImpl = new androidx.camera.camera2.internal.ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        zoomStateImpl.setZoomRatio(1.0f);
        return androidx.camera.core.internal.ImmutableZoomState.create(zoomStateImpl);
    }

    private static androidx.camera.camera2.internal.ZoomControl.ZoomImpl createZoomImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristics) {
        if (isAndroidRZoomSupported(cameraCharacteristics)) {
            return new androidx.camera.camera2.internal.AndroidRZoomImpl(cameraCharacteristics);
        }
        return new androidx.camera.camera2.internal.CropRegionZoomImpl(cameraCharacteristics);
    }

    private static boolean isAndroidRZoomSupported(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristics) {
        return android.os.Build.VERSION.SDK_INT >= 30 && cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null;
    }

    void addZoomOption(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        this.mZoomImpl.addRequestOption(builder);
    }

    android.graphics.Rect getCropSensorRegion() {
        return this.mZoomImpl.getCropSensorRegion();
    }

    void setActive(boolean isActive) {
        androidx.camera.core.ZoomState create;
        if (this.mIsActive == isActive) {
            return;
        }
        this.mIsActive = isActive;
        if (isActive) {
            return;
        }
        synchronized (this.mCurrentZoomState) {
            this.mCurrentZoomState.setZoomRatio(1.0f);
            create = androidx.camera.core.internal.ImmutableZoomState.create(this.mCurrentZoomState);
        }
        updateLiveData(create);
        this.mZoomImpl.resetZoom();
        this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
    }

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float ratio) {
        final androidx.camera.core.ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setZoomRatio(ratio);
                create = androidx.camera.core.internal.ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (java.lang.IllegalArgumentException e) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e);
            }
        }
        updateLiveData(create);
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.camera2.internal.ZoomControl.this.m53xc6d8bfa2(create, completer);
            }
        });
    }

    /* renamed from: lambda$setZoomRatio$1$androidx-camera-camera2-internal-ZoomControl, reason: not valid java name */
    public /* synthetic */ java.lang.Object m53xc6d8bfa2(final androidx.camera.core.ZoomState zoomState, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.ZoomControl.this.m52xd613203(completer, zoomState);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitCameraZoomRatio, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m52xd613203(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer, androidx.camera.core.ZoomState zoomState) {
        androidx.camera.core.ZoomState create;
        if (!this.mIsActive) {
            synchronized (this.mCurrentZoomState) {
                this.mCurrentZoomState.setZoomRatio(1.0f);
                create = androidx.camera.core.internal.ImmutableZoomState.create(this.mCurrentZoomState);
            }
            updateLiveData(create);
            completer.setException(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        updateLiveData(zoomState);
        this.mZoomImpl.setZoomRatio(zoomState.getZoomRatio(), completer);
        this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
    }

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float linearZoom) {
        final androidx.camera.core.ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setLinearZoom(linearZoom);
                create = androidx.camera.core.internal.ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (java.lang.IllegalArgumentException e) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e);
            }
        }
        updateLiveData(create);
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.camera2.internal.ZoomControl.this.m51x9f268096(create, completer);
            }
        });
    }

    /* renamed from: lambda$setLinearZoom$3$androidx-camera-camera2-internal-ZoomControl, reason: not valid java name */
    public /* synthetic */ java.lang.Object m51x9f268096(final androidx.camera.core.ZoomState zoomState, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.ZoomControl.this.m50xe5aef2f7(completer, zoomState);
            }
        });
        return "setLinearZoom";
    }

    private void updateLiveData(androidx.camera.core.ZoomState zoomState) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            this.mZoomStateLiveData.setValue(zoomState);
        } else {
            this.mZoomStateLiveData.postValue(zoomState);
        }
    }

    androidx.lifecycle.LiveData<androidx.camera.core.ZoomState> getZoomState() {
        return this.mZoomStateLiveData;
    }
}
