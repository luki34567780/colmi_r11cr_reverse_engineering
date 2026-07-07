package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class CameraStateRegistry {
    private static final java.lang.String TAG = "CameraStateRegistry";
    private int mAvailableCameras;
    private final int mMaxAllowedOpenedCameras;
    private final java.lang.StringBuilder mDebugString = new java.lang.StringBuilder();
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry.CameraRegistration> mCameraStates = new java.util.HashMap();

    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    public CameraStateRegistry(int maxAllowedOpenedCameras) {
        this.mMaxAllowedOpenedCameras = maxAllowedOpenedCameras;
        synchronized ("mLock") {
            this.mAvailableCameras = maxAllowedOpenedCameras;
        }
    }

    public void registerCamera(androidx.camera.core.Camera camera, java.util.concurrent.Executor notifyExecutor, androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener cameraAvailableListener) {
        synchronized (this.mLock) {
            androidx.core.util.Preconditions.checkState(!this.mCameraStates.containsKey(camera), "Camera is already registered: " + camera);
            this.mCameraStates.put(camera, new androidx.camera.core.impl.CameraStateRegistry.CameraRegistration(null, notifyExecutor, cameraAvailableListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0063), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0063), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean tryOpenCamera(androidx.camera.core.Camera r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.mLock
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r1 = r9.mCameraStates     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r1 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.Logger.isDebugEnabled(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L52
            java.lang.StringBuilder r2 = r9.mDebugString     // Catch: java.lang.Throwable -> L9b
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = r9.mDebugString     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9b
            r7[r4] = r10     // Catch: java.lang.Throwable -> L9b
            int r10 = r9.mAvailableCameras     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r7[r3] = r10     // Catch: java.lang.Throwable -> L9b
            r10 = 2
            androidx.camera.core.impl.CameraInternal$State r8 = r1.getState()     // Catch: java.lang.Throwable -> L9b
            boolean r8 = isOpen(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            r10 = 3
            androidx.camera.core.impl.CameraInternal$State r8 = r1.getState()     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            r2.append(r10)     // Catch: java.lang.Throwable -> L9b
        L52:
            int r10 = r9.mAvailableCameras     // Catch: java.lang.Throwable -> L9b
            if (r10 > 0) goto L63
            androidx.camera.core.impl.CameraInternal$State r10 = r1.getState()     // Catch: java.lang.Throwable -> L9b
            boolean r10 = isOpen(r10)     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L61
            goto L63
        L61:
            r10 = 0
            goto L69
        L63:
            androidx.camera.core.impl.CameraInternal$State r10 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch: java.lang.Throwable -> L9b
            r1.setState(r10)     // Catch: java.lang.Throwable -> L9b
            r10 = 1
        L69:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.Logger.isDebugEnabled(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = r9.mDebugString     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L7e
            java.lang.String r6 = "SUCCESS"
            goto L80
        L7e:
            java.lang.String r6 = "FAIL"
        L80:
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: java.lang.Throwable -> L9b
            r1.append(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.mDebugString     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L9b
        L94:
            if (r10 == 0) goto L99
            r9.recalculateAvailableCameras()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r10
        L9b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.tryOpenCamera(androidx.camera.core.Camera):boolean");
    }

    public void markCameraState(androidx.camera.core.Camera camera, androidx.camera.core.impl.CameraInternal.State state) {
        androidx.camera.core.impl.CameraInternal.State updateAndVerifyState;
        java.util.List singletonList;
        synchronized (this.mLock) {
            int i = this.mAvailableCameras;
            if (state == androidx.camera.core.impl.CameraInternal.State.RELEASED) {
                updateAndVerifyState = unregisterCamera(camera);
            } else {
                updateAndVerifyState = updateAndVerifyState(camera, state);
            }
            if (updateAndVerifyState == state) {
                return;
            }
            if (i < 1 && this.mAvailableCameras > 0) {
                singletonList = new java.util.ArrayList();
                for (java.util.Map.Entry<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry.CameraRegistration> entry : this.mCameraStates.entrySet()) {
                    if (entry.getValue().getState() == androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN) {
                        singletonList.add(entry.getValue());
                    }
                }
            } else {
                singletonList = (state != androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN || this.mAvailableCameras <= 0) ? null : java.util.Collections.singletonList(this.mCameraStates.get(camera));
            }
            if (singletonList != null) {
                java.util.Iterator it = singletonList.iterator();
                while (it.hasNext()) {
                    ((androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) it.next()).notifyListener();
                }
            }
        }
    }

    private androidx.camera.core.impl.CameraInternal.State unregisterCamera(androidx.camera.core.Camera camera) {
        androidx.camera.core.impl.CameraStateRegistry.CameraRegistration remove = this.mCameraStates.remove(camera);
        if (remove == null) {
            return null;
        }
        recalculateAvailableCameras();
        return remove.getState();
    }

    private androidx.camera.core.impl.CameraInternal.State updateAndVerifyState(androidx.camera.core.Camera camera, androidx.camera.core.impl.CameraInternal.State state) {
        androidx.camera.core.impl.CameraInternal.State state2 = ((androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) androidx.core.util.Preconditions.checkNotNull(this.mCameraStates.get(camera), "Cannot update state of camera which has not yet been registered. Register with CameraAvailabilityRegistry.registerCamera()")).setState(state);
        if (state == androidx.camera.core.impl.CameraInternal.State.OPENING) {
            androidx.core.util.Preconditions.checkState(isOpen(state) || state2 == androidx.camera.core.impl.CameraInternal.State.OPENING, "Cannot mark camera as opening until camera was successful at calling CameraAvailabilityRegistry.tryOpen()");
        }
        if (state2 != state) {
            recalculateAvailableCameras();
        }
        return state2;
    }

    private static boolean isOpen(androidx.camera.core.impl.CameraInternal.State state) {
        return state != null && state.holdsCameraSlot();
    }

    private void recalculateAvailableCameras() {
        if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
            this.mDebugString.setLength(0);
            this.mDebugString.append("Recalculating open cameras:\n");
            this.mDebugString.append(java.lang.String.format(java.util.Locale.US, "%-45s%-22s\n", com.luck.picture.lib.config.PictureMimeType.CAMERA, "State"));
            this.mDebugString.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (java.util.Map.Entry<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry.CameraRegistration> entry : this.mCameraStates.entrySet()) {
            if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
                this.mDebugString.append(java.lang.String.format(java.util.Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().getState() != null ? entry.getValue().getState().toString() : "UNKNOWN"));
            }
            if (isOpen(entry.getValue().getState())) {
                i++;
            }
        }
        if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
            this.mDebugString.append("-------------------------------------------------------------------\n");
            this.mDebugString.append(java.lang.String.format(java.util.Locale.US, "Open count: %d (Max allowed: %d)", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.mMaxAllowedOpenedCameras)));
            androidx.camera.core.Logger.d(TAG, this.mDebugString.toString());
        }
        this.mAvailableCameras = java.lang.Math.max(this.mMaxAllowedOpenedCameras - i, 0);
    }

    private static class CameraRegistration {
        private final androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener mCameraAvailableListener;
        private final java.util.concurrent.Executor mNotifyExecutor;
        private androidx.camera.core.impl.CameraInternal.State mState;

        CameraRegistration(androidx.camera.core.impl.CameraInternal.State initialState, java.util.concurrent.Executor notifyExecutor, androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener cameraAvailableListener) {
            this.mState = initialState;
            this.mNotifyExecutor = notifyExecutor;
            this.mCameraAvailableListener = cameraAvailableListener;
        }

        androidx.camera.core.impl.CameraInternal.State setState(androidx.camera.core.impl.CameraInternal.State state) {
            androidx.camera.core.impl.CameraInternal.State state2 = this.mState;
            this.mState = state;
            return state2;
        }

        androidx.camera.core.impl.CameraInternal.State getState() {
            return this.mState;
        }

        void notifyListener() {
            try {
                java.util.concurrent.Executor executor = this.mNotifyExecutor;
                final androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener onOpenAvailableListener = this.mCameraAvailableListener;
                java.util.Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener.this.onOpenAvailable();
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e) {
                androidx.camera.core.Logger.e(androidx.camera.core.impl.CameraStateRegistry.TAG, "Unable to notify camera.", e);
            }
        }
    }
}
