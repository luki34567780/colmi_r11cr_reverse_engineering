package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
public final class CameraCaptureSessionStateCallbacks {
    private CameraCaptureSessionStateCallbacks() {
    }

    public static android.hardware.camera2.CameraCaptureSession.StateCallback createNoOpCallback() {
        return new androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.NoOpSessionStateCallback();
    }

    public static android.hardware.camera2.CameraCaptureSession.StateCallback createComboCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> callbacks) {
        if (callbacks.isEmpty()) {
            return createNoOpCallback();
        }
        if (callbacks.size() == 1) {
            return callbacks.get(0);
        }
        return new androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.ComboSessionStateCallback(callbacks);
    }

    public static android.hardware.camera2.CameraCaptureSession.StateCallback createComboCallback(android.hardware.camera2.CameraCaptureSession.StateCallback... callbacks) {
        return createComboCallback((java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback>) java.util.Arrays.asList(callbacks));
    }

    static final class NoOpSessionStateCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(android.hardware.camera2.CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(android.hardware.camera2.CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(android.hardware.camera2.CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession session, android.view.Surface surface) {
        }

        NoOpSessionStateCallback() {
        }
    }

    static final class ComboSessionStateCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> mCallbacks = new java.util.ArrayList();

        ComboSessionStateCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> callbacks) {
            for (android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback : callbacks) {
                if (!(stateCallback instanceof androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.NoOpSessionStateCallback)) {
                    this.mCallbacks.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onConfigured(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(android.hardware.camera2.CameraCaptureSession session) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onActive(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(android.hardware.camera2.CameraCaptureSession session) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onClosed(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(android.hardware.camera2.CameraCaptureSession session) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onReady(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession session) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureQueueEmpty(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession session, android.view.Surface surface) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onSurfacePrepared(session, surface);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession session) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onConfigureFailed(session);
            }
        }
    }
}
