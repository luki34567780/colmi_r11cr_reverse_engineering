package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
final class SynchronizedCaptureSessionStateCallbacks extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback {
    private final java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> mCallbacks;

    static androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback createComboCallback(androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback... callbacks) {
        return new androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks(java.util.Arrays.asList(callbacks));
    }

    SynchronizedCaptureSessionStateCallbacks(java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> callbacks) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.mCallbacks = arrayList;
        arrayList.addAll(callbacks);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onSurfacePrepared(androidx.camera.camera2.internal.SynchronizedCaptureSession session, android.view.Surface surface) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onSurfacePrepared(session, surface);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onReady(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onReady(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onActive(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onActive(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onCaptureQueueEmpty(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCaptureQueueEmpty(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onConfigured(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onConfigureFailed(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onClosed(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    void onSessionFinished(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onSessionFinished(session);
        }
    }

    static class Adapter extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback {
        private final android.hardware.camera2.CameraCaptureSession.StateCallback mCameraCaptureSessionStateCallback;

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        void onSessionFinished(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        }

        Adapter(android.hardware.camera2.CameraCaptureSession.StateCallback cameraCaptureSessionStateCallback) {
            this.mCameraCaptureSessionStateCallback = cameraCaptureSessionStateCallback;
        }

        Adapter(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> callbackList) {
            this(androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.createComboCallback(callbackList));
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onSurfacePrepared(androidx.camera.camera2.internal.SynchronizedCaptureSession session, android.view.Surface surface) {
            this.mCameraCaptureSessionStateCallback.onSurfacePrepared(session.toCameraCaptureSessionCompat().toCameraCaptureSession(), surface);
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onReady(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onActive(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onActive(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onCaptureQueueEmpty(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onCaptureQueueEmpty(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onConfigured(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onConfigureFailed(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onClosed(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onClosed(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }
    }
}
