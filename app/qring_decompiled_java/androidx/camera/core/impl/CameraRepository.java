package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class CameraRepository {
    private static final java.lang.String TAG = "CameraRepository";
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mDeinitCompleter;
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mDeinitFuture;
    private final java.lang.Object mCamerasLock = new java.lang.Object();
    private final java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> mCameras = new java.util.LinkedHashMap();
    private final java.util.Set<androidx.camera.core.impl.CameraInternal> mReleasingCameras = new java.util.HashSet();

    public void init(androidx.camera.core.impl.CameraFactory cameraFactory) throws androidx.camera.core.InitializationException {
        synchronized (this.mCamerasLock) {
            try {
                try {
                    for (java.lang.String str : cameraFactory.getAvailableCameraIds()) {
                        androidx.camera.core.Logger.d(TAG, "Added camera: " + str);
                        this.mCameras.put(str, cameraFactory.getCamera(str));
                    }
                } catch (androidx.camera.core.CameraUnavailableException e) {
                    throw new androidx.camera.core.InitializationException(e);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> deinit() {
        synchronized (this.mCamerasLock) {
            if (this.mCameras.isEmpty()) {
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture = this.mDeinitFuture;
                if (listenableFuture == null) {
                    listenableFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
                }
                return listenableFuture;
            }
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture2 = this.mDeinitFuture;
            if (listenableFuture2 == null) {
                listenableFuture2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.CameraRepository$$ExternalSyntheticLambda0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                        return androidx.camera.core.impl.CameraRepository.this.m108lambda$deinit$0$androidxcameracoreimplCameraRepository(completer);
                    }
                });
                this.mDeinitFuture = listenableFuture2;
            }
            this.mReleasingCameras.addAll(this.mCameras.values());
            for (final androidx.camera.core.impl.CameraInternal cameraInternal : this.mCameras.values()) {
                cameraInternal.release().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraRepository$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraRepository.this.m109lambda$deinit$1$androidxcameracoreimplCameraRepository(cameraInternal);
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            }
            this.mCameras.clear();
            return listenableFuture2;
        }
    }

    /* renamed from: lambda$deinit$0$androidx-camera-core-impl-CameraRepository, reason: not valid java name */
    public /* synthetic */ java.lang.Object m108lambda$deinit$0$androidxcameracoreimplCameraRepository(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        synchronized (this.mCamerasLock) {
            this.mDeinitCompleter = completer;
        }
        return "CameraRepository-deinit";
    }

    /* renamed from: lambda$deinit$1$androidx-camera-core-impl-CameraRepository, reason: not valid java name */
    public /* synthetic */ void m109lambda$deinit$1$androidxcameracoreimplCameraRepository(androidx.camera.core.impl.CameraInternal cameraInternal) {
        synchronized (this.mCamerasLock) {
            this.mReleasingCameras.remove(cameraInternal);
            if (this.mReleasingCameras.isEmpty()) {
                androidx.core.util.Preconditions.checkNotNull(this.mDeinitCompleter);
                this.mDeinitCompleter.set(null);
                this.mDeinitCompleter = null;
                this.mDeinitFuture = null;
            }
        }
    }

    public androidx.camera.core.impl.CameraInternal getCamera(java.lang.String cameraId) {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        synchronized (this.mCamerasLock) {
            cameraInternal = this.mCameras.get(cameraId);
            if (cameraInternal == null) {
                throw new java.lang.IllegalArgumentException("Invalid camera: " + cameraId);
            }
        }
        return cameraInternal;
    }

    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameras() {
        java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new java.util.LinkedHashSet<>(this.mCameras.values());
        }
        return linkedHashSet;
    }

    java.util.Set<java.lang.String> getCameraIds() {
        java.util.LinkedHashSet linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new java.util.LinkedHashSet(this.mCameras.keySet());
        }
        return linkedHashSet;
    }
}
