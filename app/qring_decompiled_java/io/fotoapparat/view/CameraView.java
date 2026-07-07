package io.fotoapparat.view;

/* compiled from: CameraView.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0014J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010$\u001a\u0004\u0018\u00010\u000f*\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lio/fotoapparat/view/CameraView;", "Landroid/widget/FrameLayout;", "Lio/fotoapparat/view/CameraRenderer;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "previewResolution", "Lio/fotoapparat/parameter/Resolution;", "scaleType", "Lio/fotoapparat/parameter/ScaleType;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "textureLatch", "Ljava/util/concurrent/CountDownLatch;", "textureView", "Landroid/view/TextureView;", "getPreview", "Lio/fotoapparat/view/Preview;", "getPreviewAfterLatch", "Lio/fotoapparat/view/Preview$Texture;", "onDetachedFromWindow", "", "onLayout", "changed", "", "left", "top", "right", "bottom", "setPreviewResolution", "resolution", "setScaleType", "tryInitialize", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class CameraView extends android.widget.FrameLayout implements io.fotoapparat.view.CameraRenderer {
    private io.fotoapparat.parameter.Resolution previewResolution;
    private io.fotoapparat.parameter.ScaleType scaleType;
    private android.graphics.SurfaceTexture surfaceTexture;
    private final java.util.concurrent.CountDownLatch textureLatch;
    private final android.view.TextureView textureView;

    public CameraView(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    public CameraView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static final /* synthetic */ io.fotoapparat.parameter.Resolution access$getPreviewResolution$p(io.fotoapparat.view.CameraView cameraView) {
        io.fotoapparat.parameter.Resolution resolution = cameraView.previewResolution;
        if (resolution == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("previewResolution");
        }
        return resolution;
    }

    public static final /* synthetic */ io.fotoapparat.parameter.ScaleType access$getScaleType$p(io.fotoapparat.view.CameraView cameraView) {
        io.fotoapparat.parameter.ScaleType scaleType = cameraView.scaleType;
        if (scaleType == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scaleType");
        }
        return scaleType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CameraView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.view.CameraView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        this.textureLatch = new java.util.concurrent.CountDownLatch(1);
        android.view.TextureView textureView = new android.view.TextureView(context);
        this.textureView = textureView;
        this.surfaceTexture = tryInitialize(textureView);
        addView(textureView);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.textureLatch.countDown();
    }

    @Override // io.fotoapparat.view.CameraRenderer
    public void setScaleType(io.fotoapparat.parameter.ScaleType scaleType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scaleType, "scaleType");
        this.scaleType = scaleType;
    }

    @Override // io.fotoapparat.view.CameraRenderer
    public void setPreviewResolution(final io.fotoapparat.parameter.Resolution resolution) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resolution, "resolution");
        post(new java.lang.Runnable() { // from class: io.fotoapparat.view.CameraView$setPreviewResolution$1
            @Override // java.lang.Runnable
            public final void run() {
                io.fotoapparat.view.CameraView.this.previewResolution = resolution;
                io.fotoapparat.view.CameraView.this.requestLayout();
            }
        });
    }

    @Override // io.fotoapparat.view.CameraRenderer
    public io.fotoapparat.view.Preview getPreview() {
        io.fotoapparat.view.Preview.Texture previewAfterLatch;
        android.graphics.SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null || (previewAfterLatch = io.fotoapparat.view.PreviewKt.toPreview(surfaceTexture)) == null) {
            previewAfterLatch = getPreviewAfterLatch();
        }
        return previewAfterLatch;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        if (isInEditMode() || this.previewResolution == null || this.scaleType == null) {
            super.onLayout(changed, left, top2, right, bottom);
            return;
        }
        io.fotoapparat.parameter.Resolution resolution = this.previewResolution;
        if (resolution == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("previewResolution");
        }
        io.fotoapparat.parameter.ScaleType scaleType = this.scaleType;
        if (scaleType == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scaleType");
        }
        io.fotoapparat.view.CameraViewKt.layoutTextureView(this, resolution, scaleType);
    }

    private final io.fotoapparat.view.Preview.Texture getPreviewAfterLatch() {
        io.fotoapparat.view.Preview.Texture preview;
        this.textureLatch.await();
        android.graphics.SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null || (preview = io.fotoapparat.view.PreviewKt.toPreview(surfaceTexture)) == null) {
            throw new io.fotoapparat.exception.camera.UnavailableSurfaceException();
        }
        return preview;
    }

    private final android.graphics.SurfaceTexture tryInitialize(final android.view.TextureView textureView) {
        android.graphics.SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        textureView.setSurfaceTextureListener(new io.fotoapparat.view.TextureAvailabilityListener(new kotlin.jvm.functions.Function1<android.graphics.SurfaceTexture, kotlin.Unit>() { // from class: io.fotoapparat.view.CameraView$tryInitialize$$inlined$also$lambda$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.graphics.SurfaceTexture surfaceTexture2) {
                invoke2(surfaceTexture2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(android.graphics.SurfaceTexture receiver$0) {
                java.util.concurrent.CountDownLatch countDownLatch;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
                io.fotoapparat.view.CameraView.this.surfaceTexture = receiver$0;
                countDownLatch = io.fotoapparat.view.CameraView.this.textureLatch;
                countDownLatch.countDown();
            }
        }));
        return null;
    }
}
