package androidx.camera.core;

/* loaded from: classes.dex */
public interface Camera {
    androidx.camera.core.CameraControl getCameraControl();

    androidx.camera.core.CameraInfo getCameraInfo();

    java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameraInternals();

    androidx.camera.core.impl.CameraConfig getExtendedConfig();

    void setExtendedConfig(androidx.camera.core.impl.CameraConfig cameraConfig) throws androidx.camera.core.internal.CameraUseCaseAdapter.CameraException;
}
