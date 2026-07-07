package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface CameraInfoInternal extends androidx.camera.core.CameraInfo {
    void addSessionCaptureCallback(java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraCaptureCallback callback);

    java.lang.String getCameraId();

    androidx.camera.core.impl.Quirks getCameraQuirks();

    java.lang.Integer getLensFacing();

    void removeSessionCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback callback);
}
