package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
final class CropRegionZoomImpl implements androidx.camera.camera2.internal.ZoomControl.ZoomImpl {
    public static final float MIN_DIGITAL_ZOOM = 1.0f;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private android.graphics.Rect mCurrentCropRect = null;
    private android.graphics.Rect mPendingZoomCropRegion = null;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mPendingZoomRatioCompleter;

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMinZoom() {
        return 1.0f;
    }

    CropRegionZoomImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristics) {
        this.mCameraCharacteristics = cameraCharacteristics;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMaxZoom() {
        java.lang.Float f = (java.lang.Float) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        if (f.floatValue() < getMinZoom()) {
            return getMinZoom();
        }
        return f.floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void addRequestOption(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        if (this.mCurrentCropRect != null) {
            builder.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, this.mCurrentCropRect);
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void resetZoom() {
        this.mPendingZoomCropRegion = null;
        this.mCurrentCropRect = null;
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer = this.mPendingZoomRatioCompleter;
        if (completer != null) {
            completer.setException(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }

    private android.graphics.Rect getSensorRect() {
        return (android.graphics.Rect) androidx.core.util.Preconditions.checkNotNull((android.graphics.Rect) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    private static android.graphics.Rect getCropRectByRatio(android.graphics.Rect sensorRect, float ratio) {
        float width = sensorRect.width() / ratio;
        float height = sensorRect.height() / ratio;
        float width2 = (sensorRect.width() - width) / 2.0f;
        float height2 = (sensorRect.height() - height) / 2.0f;
        return new android.graphics.Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void setZoomRatio(float zoomRatio, androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer) {
        this.mCurrentCropRect = getCropRectByRatio(getSensorRect(), zoomRatio);
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer2 = this.mPendingZoomRatioCompleter;
        if (completer2 != null) {
            completer2.setException(new androidx.camera.core.CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.mPendingZoomCropRegion = this.mCurrentCropRect;
        this.mPendingZoomRatioCompleter = completer;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void onCaptureResult(android.hardware.camera2.TotalCaptureResult captureResult) {
        if (this.mPendingZoomRatioCompleter != null) {
            android.hardware.camera2.CaptureRequest request = captureResult.getRequest();
            android.graphics.Rect rect = request == null ? null : (android.graphics.Rect) request.get(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION);
            android.graphics.Rect rect2 = this.mPendingZoomCropRegion;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.mPendingZoomRatioCompleter.set(null);
            this.mPendingZoomRatioCompleter = null;
            this.mPendingZoomCropRegion = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public android.graphics.Rect getCropSensorRegion() {
        android.graphics.Rect rect = this.mCurrentCropRect;
        return rect != null ? rect : getSensorRect();
    }
}
