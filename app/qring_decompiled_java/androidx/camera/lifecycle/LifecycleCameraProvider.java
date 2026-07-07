package androidx.camera.lifecycle;

/* loaded from: classes.dex */
interface LifecycleCameraProvider {
    boolean hasCamera(androidx.camera.core.CameraSelector cameraSelector) throws androidx.camera.core.CameraInfoUnavailableException;

    boolean isBound(androidx.camera.core.UseCase useCase);

    void unbind(androidx.camera.core.UseCase... useCases);

    void unbindAll();
}
