package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface CameraInternal extends androidx.camera.core.Camera, androidx.camera.core.UseCase.StateChangeCallback {
    void attachUseCases(java.util.Collection<androidx.camera.core.UseCase> useCases);

    void close();

    void detachUseCases(java.util.Collection<androidx.camera.core.UseCase> useCases);

    @Override // androidx.camera.core.Camera
    androidx.camera.core.CameraControl getCameraControl();

    androidx.camera.core.impl.CameraControlInternal getCameraControlInternal();

    @Override // androidx.camera.core.Camera
    androidx.camera.core.CameraInfo getCameraInfo();

    androidx.camera.core.impl.CameraInfoInternal getCameraInfoInternal();

    @Override // androidx.camera.core.Camera
    java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameraInternals();

    androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState();

    @Override // androidx.camera.core.Camera
    androidx.camera.core.impl.CameraConfig getExtendedConfig();

    void open();

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release();

    @Override // androidx.camera.core.Camera
    void setExtendedConfig(androidx.camera.core.impl.CameraConfig cameraConfig) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException;

    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);

        private final boolean mHoldsCameraSlot;

        State(boolean holdsCameraSlot) {
            this.mHoldsCameraSlot = holdsCameraSlot;
        }

        boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraInternal$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$setExtendedConfig(androidx.camera.core.impl.CameraInternal _this, androidx.camera.core.impl.CameraConfig cameraConfig) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        }

        public static java.util.LinkedHashSet $default$getCameraInternals(androidx.camera.core.impl.CameraInternal _this) {
            return new java.util.LinkedHashSet(java.util.Collections.singleton(_this));
        }
    }
}
