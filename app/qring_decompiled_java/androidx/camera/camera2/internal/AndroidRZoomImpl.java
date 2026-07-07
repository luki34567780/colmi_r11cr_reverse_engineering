package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
final class AndroidRZoomImpl implements androidx.camera.camera2.internal.ZoomControl.ZoomImpl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private float mCurrentZoomRatio = 1.0f;
    private float mPendingZoomRatio = 1.0f;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mPendingZoomRatioCompleter;
    private final android.util.Range<java.lang.Float> mZoomRatioRange;

    AndroidRZoomImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristics) {
        this.mCameraCharacteristics = cameraCharacteristics;
        this.mZoomRatioRange = (android.util.Range) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMinZoom() {
        return this.mZoomRatioRange.getLower().floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMaxZoom() {
        return this.mZoomRatioRange.getUpper().floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void addRequestOption(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        builder.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO, java.lang.Float.valueOf(this.mCurrentZoomRatio));
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void resetZoom() {
        this.mCurrentZoomRatio = 1.0f;
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer = this.mPendingZoomRatioCompleter;
        if (completer != null) {
            completer.setException(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void setZoomRatio(float zoomRatio, androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer) {
        this.mCurrentZoomRatio = zoomRatio;
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer2 = this.mPendingZoomRatioCompleter;
        if (completer2 != null) {
            completer2.setException(new androidx.camera.core.CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.mPendingZoomRatio = this.mCurrentZoomRatio;
        this.mPendingZoomRatioCompleter = completer;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void onCaptureResult(android.hardware.camera2.TotalCaptureResult captureResult) {
        if (this.mPendingZoomRatioCompleter != null) {
            android.hardware.camera2.CaptureRequest request = captureResult.getRequest();
            java.lang.Float f = request == null ? null : (java.lang.Float) request.get(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.mPendingZoomRatio == f.floatValue()) {
                this.mPendingZoomRatioCompleter.set(null);
                this.mPendingZoomRatioCompleter = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public android.graphics.Rect getCropSensorRegion() {
        return (android.graphics.Rect) androidx.core.util.Preconditions.checkNotNull((android.graphics.Rect) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
