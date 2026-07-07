package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
public final class Camera2CaptureCallbacks {
    private Camera2CaptureCallbacks() {
    }

    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback createNoOpCallback() {
        return new androidx.camera.camera2.internal.Camera2CaptureCallbacks.NoOpSessionCaptureCallback();
    }

    static android.hardware.camera2.CameraCaptureSession.CaptureCallback createComboCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> callbacks) {
        return new androidx.camera.camera2.internal.Camera2CaptureCallbacks.ComboSessionCaptureCallback(callbacks);
    }

    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback createComboCallback(android.hardware.camera2.CameraCaptureSession.CaptureCallback... callbacks) {
        return createComboCallback((java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>) java.util.Arrays.asList(callbacks));
    }

    static final class NoOpSessionCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.view.Surface surface, long frame) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureFailure failure) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureResult partialResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession session, int sequenceId) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession session, int sequenceId, long frame) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, long timestamp, long frame) {
        }

        NoOpSessionCaptureCallback() {
        }
    }

    private static final class ComboSessionCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> mCallbacks = new java.util.ArrayList();

        ComboSessionCaptureCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> callbacks) {
            for (android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback : callbacks) {
                if (!(captureCallback instanceof androidx.camera.camera2.internal.Camera2CaptureCallbacks.NoOpSessionCaptureCallback)) {
                    this.mCallbacks.add(captureCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.view.Surface surface, long frame) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureBufferLost(session, request, surface, frame);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(session, request, result);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureFailure failure) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(session, request, failure);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureResult partialResult) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProgressed(session, request, partialResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession session, int sequenceId) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceAborted(session, sequenceId);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession session, int sequenceId, long frame) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceCompleted(session, sequenceId, frame);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, long timestamp, long frame) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.CaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(session, request, timestamp, frame);
            }
        }
    }
}
