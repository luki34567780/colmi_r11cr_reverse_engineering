package androidx.camera.camera2.internal.compat;

/* loaded from: classes.dex */
public final class CameraCaptureSessionCompat {
    private final androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl mImpl;

    interface CameraCaptureSessionCompatImpl {
        int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

        int captureSingleRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

        int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

        int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException;

        android.hardware.camera2.CameraCaptureSession unwrap();
    }

    private CameraCaptureSessionCompat(android.hardware.camera2.CameraCaptureSession captureSession, android.os.Handler compatHandler) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatApi28Impl(captureSession);
        } else {
            this.mImpl = androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl.create(captureSession, compatHandler);
        }
    }

    public static androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat(android.hardware.camera2.CameraCaptureSession captureSession) {
        return toCameraCaptureSessionCompat(captureSession, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
    }

    public static androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat toCameraCaptureSessionCompat(android.hardware.camera2.CameraCaptureSession captureSession, android.os.Handler compatHandler) {
        return new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat(captureSession, compatHandler);
    }

    public android.hardware.camera2.CameraCaptureSession toCameraCaptureSession() {
        return this.mImpl.unwrap();
    }

    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mImpl.captureBurstRequests(requests, executor, listener);
    }

    public int captureSingleRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mImpl.captureSingleRequest(request, executor, listener);
    }

    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> requests, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mImpl.setRepeatingBurstRequests(requests, executor, listener);
    }

    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest request, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener) throws android.hardware.camera2.CameraAccessException {
        return this.mImpl.setSingleRepeatingRequest(request, executor, listener);
    }

    static final class CaptureCallbackExecutorWrapper extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraCaptureSession.CaptureCallback mWrappedCallback;

        CaptureCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.CaptureCallback wrappedCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = wrappedCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final android.hardware.camera2.CameraCaptureSession session, final android.hardware.camera2.CaptureRequest request, final long timestamp, final long frameNumber) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureStarted(session, request, timestamp, frameNumber);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final android.hardware.camera2.CameraCaptureSession session, final android.hardware.camera2.CaptureRequest request, final android.hardware.camera2.CaptureResult partialResult) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureProgressed(session, request, partialResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final android.hardware.camera2.CameraCaptureSession session, final android.hardware.camera2.CaptureRequest request, final android.hardware.camera2.TotalCaptureResult result) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureCompleted(session, request, result);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final android.hardware.camera2.CameraCaptureSession session, final android.hardware.camera2.CaptureRequest request, final android.hardware.camera2.CaptureFailure failure) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureFailed(session, request, failure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final android.hardware.camera2.CameraCaptureSession session, final int sequenceId, final long frameNumber) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.5
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureSequenceCompleted(session, sequenceId, frameNumber);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final android.hardware.camera2.CameraCaptureSession session, final int sequenceId) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.6
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureSequenceAborted(session, sequenceId);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final android.hardware.camera2.CameraCaptureSession session, final android.hardware.camera2.CaptureRequest request, final android.view.Surface target, final long frameNumber) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.7
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureBufferLost(session, request, target, frameNumber);
                }
            });
        }
    }

    static final class StateCallbackExecutorWrapper extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraCaptureSession.StateCallback mWrappedCallback;

        StateCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback wrappedCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = wrappedCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final android.hardware.camera2.CameraCaptureSession session) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onConfigured(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final android.hardware.camera2.CameraCaptureSession session) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onConfigureFailed(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final android.hardware.camera2.CameraCaptureSession session) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onReady(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final android.hardware.camera2.CameraCaptureSession session) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onActive(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final android.hardware.camera2.CameraCaptureSession session) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.5
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onCaptureQueueEmpty(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final android.hardware.camera2.CameraCaptureSession session) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.6
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onClosed(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final android.hardware.camera2.CameraCaptureSession session, final android.view.Surface surface) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.7
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.this.mWrappedCallback.onSurfacePrepared(session, surface);
                }
            });
        }
    }
}
