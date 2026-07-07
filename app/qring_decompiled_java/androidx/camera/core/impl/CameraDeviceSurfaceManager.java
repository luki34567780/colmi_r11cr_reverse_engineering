package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface CameraDeviceSurfaceManager {

    public interface Provider {
        androidx.camera.core.impl.CameraDeviceSurfaceManager newInstance(android.content.Context context, java.lang.Object cameraManager, java.util.Set<java.lang.String> availableCameraIds) throws androidx.camera.core.InitializationException;
    }

    boolean checkSupported(java.lang.String cameraId, java.util.List<androidx.camera.core.impl.SurfaceConfig> surfaceConfigList);

    java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, android.util.Size> getSuggestedResolutions(java.lang.String cameraId, java.util.List<androidx.camera.core.impl.SurfaceConfig> existingSurfaces, java.util.List<androidx.camera.core.impl.UseCaseConfig<?>> newUseCaseConfigs);

    androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(java.lang.String cameraId, int imageFormat, android.util.Size size);
}
