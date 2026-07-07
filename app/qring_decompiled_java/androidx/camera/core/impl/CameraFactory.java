package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface CameraFactory {

    public interface Provider {
        androidx.camera.core.impl.CameraFactory newInstance(android.content.Context context, androidx.camera.core.impl.CameraThreadConfig threadConfig, androidx.camera.core.CameraSelector availableCamerasLimiter) throws androidx.camera.core.InitializationException;
    }

    java.util.Set<java.lang.String> getAvailableCameraIds();

    androidx.camera.core.impl.CameraInternal getCamera(java.lang.String cameraId) throws androidx.camera.core.CameraUnavailableException;

    java.lang.Object getCameraManager();
}
