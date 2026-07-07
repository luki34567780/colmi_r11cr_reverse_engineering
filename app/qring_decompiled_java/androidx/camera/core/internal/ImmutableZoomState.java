package androidx.camera.core.internal;

/* loaded from: classes.dex */
public abstract class ImmutableZoomState implements androidx.camera.core.ZoomState {
    @Override // androidx.camera.core.ZoomState
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getZoomRatio();

    public static androidx.camera.core.ZoomState create(float zoomRatio, float maxZoomRatio, float minZoomRatio, float linearZoom) {
        return new androidx.camera.core.internal.AutoValue_ImmutableZoomState(zoomRatio, maxZoomRatio, minZoomRatio, linearZoom);
    }

    public static androidx.camera.core.ZoomState create(androidx.camera.core.ZoomState zoomState) {
        return new androidx.camera.core.internal.AutoValue_ImmutableZoomState(zoomState.getZoomRatio(), zoomState.getMaxZoomRatio(), zoomState.getMinZoomRatio(), zoomState.getLinearZoom());
    }
}
