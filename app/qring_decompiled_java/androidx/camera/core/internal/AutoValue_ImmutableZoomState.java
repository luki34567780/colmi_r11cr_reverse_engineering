package androidx.camera.core.internal;

/* loaded from: classes.dex */
final class AutoValue_ImmutableZoomState extends androidx.camera.core.internal.ImmutableZoomState {
    private final float linearZoom;
    private final float maxZoomRatio;
    private final float minZoomRatio;
    private final float zoomRatio;

    AutoValue_ImmutableZoomState(float zoomRatio, float maxZoomRatio, float minZoomRatio, float linearZoom) {
        this.zoomRatio = zoomRatio;
        this.maxZoomRatio = maxZoomRatio;
        this.minZoomRatio = minZoomRatio;
        this.linearZoom = linearZoom;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.zoomRatio;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.linearZoom;
    }

    public java.lang.String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.zoomRatio + ", maxZoomRatio=" + this.maxZoomRatio + ", minZoomRatio=" + this.minZoomRatio + ", linearZoom=" + this.linearZoom + "}";
    }

    public boolean equals(java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof androidx.camera.core.internal.ImmutableZoomState)) {
            return false;
        }
        androidx.camera.core.internal.ImmutableZoomState immutableZoomState = (androidx.camera.core.internal.ImmutableZoomState) o;
        return java.lang.Float.floatToIntBits(this.zoomRatio) == java.lang.Float.floatToIntBits(immutableZoomState.getZoomRatio()) && java.lang.Float.floatToIntBits(this.maxZoomRatio) == java.lang.Float.floatToIntBits(immutableZoomState.getMaxZoomRatio()) && java.lang.Float.floatToIntBits(this.minZoomRatio) == java.lang.Float.floatToIntBits(immutableZoomState.getMinZoomRatio()) && java.lang.Float.floatToIntBits(this.linearZoom) == java.lang.Float.floatToIntBits(immutableZoomState.getLinearZoom());
    }

    public int hashCode() {
        return ((((((java.lang.Float.floatToIntBits(this.zoomRatio) ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.maxZoomRatio)) * 1000003) ^ java.lang.Float.floatToIntBits(this.minZoomRatio)) * 1000003) ^ java.lang.Float.floatToIntBits(this.linearZoom);
    }
}
