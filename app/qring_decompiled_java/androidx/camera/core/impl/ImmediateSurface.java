package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class ImmediateSurface extends androidx.camera.core.impl.DeferrableSurface {
    private final android.view.Surface mSurface;

    public ImmediateSurface(android.view.Surface surface) {
        this.mSurface = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface() {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(this.mSurface);
    }
}
