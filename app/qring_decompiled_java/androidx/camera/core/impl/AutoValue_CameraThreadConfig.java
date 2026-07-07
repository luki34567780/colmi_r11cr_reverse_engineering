package androidx.camera.core.impl;

/* loaded from: classes.dex */
final class AutoValue_CameraThreadConfig extends androidx.camera.core.impl.CameraThreadConfig {
    private final java.util.concurrent.Executor cameraExecutor;
    private final android.os.Handler schedulerHandler;

    AutoValue_CameraThreadConfig(java.util.concurrent.Executor cameraExecutor, android.os.Handler schedulerHandler) {
        java.util.Objects.requireNonNull(cameraExecutor, "Null cameraExecutor");
        this.cameraExecutor = cameraExecutor;
        java.util.Objects.requireNonNull(schedulerHandler, "Null schedulerHandler");
        this.schedulerHandler = schedulerHandler;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public java.util.concurrent.Executor getCameraExecutor() {
        return this.cameraExecutor;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public android.os.Handler getSchedulerHandler() {
        return this.schedulerHandler;
    }

    public java.lang.String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.cameraExecutor + ", schedulerHandler=" + this.schedulerHandler + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.core.impl.CameraThreadConfig)) {
            return false;
        }
        androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig = (androidx.camera.core.impl.CameraThreadConfig) o;
        return this.cameraExecutor.equals(cameraThreadConfig.getCameraExecutor()) && this.schedulerHandler.equals(cameraThreadConfig.getSchedulerHandler());
    }

    public int hashCode() {
        return ((this.cameraExecutor.hashCode() ^ 1000003) * 1000003) ^ this.schedulerHandler.hashCode();
    }
}
