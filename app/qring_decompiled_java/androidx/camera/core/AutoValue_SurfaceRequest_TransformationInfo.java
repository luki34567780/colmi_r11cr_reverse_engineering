package androidx.camera.core;

/* loaded from: classes.dex */
final class AutoValue_SurfaceRequest_TransformationInfo extends androidx.camera.core.SurfaceRequest.TransformationInfo {
    private final android.graphics.Rect cropRect;
    private final int rotationDegrees;
    private final int targetRotation;

    AutoValue_SurfaceRequest_TransformationInfo(android.graphics.Rect cropRect, int rotationDegrees, int targetRotation) {
        java.util.Objects.requireNonNull(cropRect, "Null cropRect");
        this.cropRect = cropRect;
        this.rotationDegrees = rotationDegrees;
        this.targetRotation = targetRotation;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public android.graphics.Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getTargetRotation() {
        return this.targetRotation;
    }

    public java.lang.String toString() {
        return "TransformationInfo{cropRect=" + this.cropRect + ", rotationDegrees=" + this.rotationDegrees + ", targetRotation=" + this.targetRotation + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.core.SurfaceRequest.TransformationInfo)) {
            return false;
        }
        androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo = (androidx.camera.core.SurfaceRequest.TransformationInfo) o;
        return this.cropRect.equals(transformationInfo.getCropRect()) && this.rotationDegrees == transformationInfo.getRotationDegrees() && this.targetRotation == transformationInfo.getTargetRotation();
    }

    public int hashCode() {
        return ((((this.cropRect.hashCode() ^ 1000003) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.targetRotation;
    }
}
