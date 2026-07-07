package androidx.camera.core;

/* loaded from: classes.dex */
final class AutoValue_SurfaceRequest_Result extends androidx.camera.core.SurfaceRequest.Result {
    private final int resultCode;
    private final android.view.Surface surface;

    AutoValue_SurfaceRequest_Result(int resultCode, android.view.Surface surface) {
        this.resultCode = resultCode;
        java.util.Objects.requireNonNull(surface, "Null surface");
        this.surface = surface;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public int getResultCode() {
        return this.resultCode;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public android.view.Surface getSurface() {
        return this.surface;
    }

    public java.lang.String toString() {
        return "Result{resultCode=" + this.resultCode + ", surface=" + this.surface + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.core.SurfaceRequest.Result)) {
            return false;
        }
        androidx.camera.core.SurfaceRequest.Result result = (androidx.camera.core.SurfaceRequest.Result) o;
        return this.resultCode == result.getResultCode() && this.surface.equals(result.getSurface());
    }

    public int hashCode() {
        return ((this.resultCode ^ 1000003) * 1000003) ^ this.surface.hashCode();
    }
}
