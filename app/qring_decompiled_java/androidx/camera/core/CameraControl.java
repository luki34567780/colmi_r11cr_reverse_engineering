package androidx.camera.core;

/* loaded from: classes.dex */
public interface CameraControl {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering();

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean torch);

    com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int value);

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float linearZoom);

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float ratio);

    com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(androidx.camera.core.FocusMeteringAction action);

    public static final class OperationCanceledException extends java.lang.Exception {
        public OperationCanceledException(java.lang.String message) {
            super(message);
        }

        public OperationCanceledException(java.lang.String message, java.lang.Throwable cause) {
            super(message, cause);
        }
    }
}
