package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
class CaptureSessionRepository {
    final java.util.concurrent.Executor mExecutor;
    final java.lang.Object mLock = new java.lang.Object();
    final java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> mCaptureSessions = new java.util.LinkedHashSet();
    final java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> mClosingCaptureSession = new java.util.LinkedHashSet();
    final java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> mCreatingCaptureSessions = new java.util.LinkedHashSet();
    private final android.hardware.camera2.CameraDevice.StateCallback mCameraStateCallback = new androidx.camera.camera2.internal.CaptureSessionRepository.AnonymousClass1();

    CaptureSessionRepository(java.util.concurrent.Executor executor) {
        this.mExecutor = executor;
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSessionRepository$1, reason: invalid class name */
    class AnonymousClass1 extends android.hardware.camera2.CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice camera) {
        }

        AnonymousClass1() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice camera, int error) {
            forceOnClosedCaptureSessions();
            cameraClosed();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice camera) {
            cameraClosed();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice camera) {
            forceOnClosedCaptureSessions();
            cameraClosed();
        }

        private void forceOnClosedCaptureSessions() {
            final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            synchronized (androidx.camera.camera2.internal.CaptureSessionRepository.this.mLock) {
                linkedHashSet.addAll(androidx.camera.camera2.internal.CaptureSessionRepository.this.mCreatingCaptureSessions);
                linkedHashSet.addAll(androidx.camera.camera2.internal.CaptureSessionRepository.this.mCaptureSessions);
            }
            androidx.camera.camera2.internal.CaptureSessionRepository.this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.CaptureSessionRepository$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.CaptureSessionRepository.forceOnClosed(linkedHashSet);
                }
            });
        }

        private void cameraClosed() {
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> sessionsInOrder;
            synchronized (androidx.camera.camera2.internal.CaptureSessionRepository.this.mLock) {
                sessionsInOrder = androidx.camera.camera2.internal.CaptureSessionRepository.this.getSessionsInOrder();
                androidx.camera.camera2.internal.CaptureSessionRepository.this.mCreatingCaptureSessions.clear();
                androidx.camera.camera2.internal.CaptureSessionRepository.this.mCaptureSessions.clear();
                androidx.camera.camera2.internal.CaptureSessionRepository.this.mClosingCaptureSession.clear();
            }
            java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession> it = sessionsInOrder.iterator();
            while (it.hasNext()) {
                it.next().finishClose();
            }
        }
    }

    android.hardware.camera2.CameraDevice.StateCallback getCameraStateCallback() {
        return this.mCameraStateCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void forceOnClosed(java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> sessions) {
        for (androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession : sessions) {
            synchronizedCaptureSession.getStateCallback().onClosed(synchronizedCaptureSession);
        }
    }

    private void forceFinishCloseStaleSessions(androidx.camera.camera2.internal.SynchronizedCaptureSession session) {
        androidx.camera.camera2.internal.SynchronizedCaptureSession next;
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession> it = getSessionsInOrder().iterator();
        while (it.hasNext() && (next = it.next()) != session) {
            next.finishClose();
        }
    }

    java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getCaptureSessions() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList(this.mCaptureSessions);
        }
        return arrayList;
    }

    java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getClosingCaptureSession() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList(this.mClosingCaptureSession);
        }
        return arrayList;
    }

    java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getCreatingCaptureSessions() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList(this.mCreatingCaptureSessions);
        }
        return arrayList;
    }

    java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getSessionsInOrder() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(getCaptureSessions());
            arrayList.addAll(getCreatingCaptureSessions());
        }
        return arrayList;
    }

    void onCreateCaptureSession(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mCreatingCaptureSessions.add(synchronizedCaptureSession);
        }
    }

    void onCaptureSessionConfigureFail(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        forceFinishCloseStaleSessions(synchronizedCaptureSession);
        synchronized (this.mLock) {
            this.mCreatingCaptureSessions.remove(synchronizedCaptureSession);
        }
    }

    void onCaptureSessionCreated(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mCaptureSessions.add(synchronizedCaptureSession);
            this.mCreatingCaptureSessions.remove(synchronizedCaptureSession);
        }
        forceFinishCloseStaleSessions(synchronizedCaptureSession);
    }

    void onCaptureSessionClosed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mCaptureSessions.remove(synchronizedCaptureSession);
            this.mClosingCaptureSession.remove(synchronizedCaptureSession);
        }
    }

    void onCaptureSessionClosing(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mClosingCaptureSession.add(synchronizedCaptureSession);
        }
    }
}
