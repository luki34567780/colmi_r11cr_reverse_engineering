package androidx.camera.lifecycle;

/* loaded from: classes.dex */
final class AutoValue_LifecycleCameraRepository_Key extends androidx.camera.lifecycle.LifecycleCameraRepository.Key {
    private final androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner;

    AutoValue_LifecycleCameraRepository_Key(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId) {
        java.util.Objects.requireNonNull(lifecycleOwner, "Null lifecycleOwner");
        this.lifecycleOwner = lifecycleOwner;
        java.util.Objects.requireNonNull(cameraId, "Null cameraId");
        this.cameraId = cameraId;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public androidx.camera.core.internal.CameraUseCaseAdapter.CameraId getCameraId() {
        return this.cameraId;
    }

    public java.lang.String toString() {
        return "Key{lifecycleOwner=" + this.lifecycleOwner + ", cameraId=" + this.cameraId + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.lifecycle.LifecycleCameraRepository.Key)) {
            return false;
        }
        androidx.camera.lifecycle.LifecycleCameraRepository.Key key = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) o;
        return this.lifecycleOwner.equals(key.getLifecycleOwner()) && this.cameraId.equals(key.getCameraId());
    }

    public int hashCode() {
        return ((this.lifecycleOwner.hashCode() ^ 1000003) * 1000003) ^ this.cameraId.hashCode();
    }
}
