package io.fotoapparat.view;

/* compiled from: TextureAvailabilityListener.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001e\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J \u0010\u0002\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0004H\u0016J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u001f\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/fotoapparat/view/TextureAvailabilityListener;", "Landroid/view/TextureView$SurfaceTextureListener;", "onSurfaceTextureAvailable", "Lkotlin/Function1;", "Landroid/graphics/SurfaceTexture;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "surface", "width", "", "height", "onSurfaceTextureDestroyed", "", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class TextureAvailabilityListener implements android.view.TextureView.SurfaceTextureListener {
    private final kotlin.jvm.functions.Function1<android.graphics.SurfaceTexture, kotlin.Unit> onSurfaceTextureAvailable;

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(surface, "surface");
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int width, int height) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(surface, "surface");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextureAvailabilityListener(kotlin.jvm.functions.Function1<? super android.graphics.SurfaceTexture, kotlin.Unit> onSurfaceTextureAvailable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onSurfaceTextureAvailable, "onSurfaceTextureAvailable");
        this.onSurfaceTextureAvailable = onSurfaceTextureAvailable;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int width, int height) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(surface, "surface");
        this.onSurfaceTextureAvailable.invoke(surface);
    }
}
