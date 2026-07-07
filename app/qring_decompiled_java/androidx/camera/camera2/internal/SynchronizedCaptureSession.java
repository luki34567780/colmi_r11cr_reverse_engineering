package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
interface SynchronizedCaptureSession {

    public static abstract class StateCallback {
        void onActive(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        }

        void onCaptureQueueEmpty(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        }

        void onClosed(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        }

        void onConfigureFailed(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        }

        void onConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        }

        void onReady(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        }

        void onSessionFinished(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        }

        void onSurfacePrepared(androidx.camera.camera2.internal.SynchronizedCaptureSession session, android.view.Surface surface) {
        }
    }

    void abortCaptures() throws android.hardware.camera2.CameraAccessException;

    int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

    int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

    int captureSingleRequest(android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

    int captureSingleRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

    void close();

    void finishClose();

    android.hardware.camera2.CameraDevice getDevice();

    androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback getStateCallback();

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getSynchronizedBlocker(java.lang.String feature);

    int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

    int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

    int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

    int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

    void stopRepeating() throws android.hardware.camera2.CameraAccessException;

    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat();
}
