package androidx.camera.view;

/* loaded from: classes.dex */
abstract class PreviewViewImplementation {
    android.widget.FrameLayout mParent;
    private final androidx.camera.view.PreviewTransformation mPreviewTransform;
    android.util.Size mResolution;
    private boolean mWasSurfaceProvided = false;

    interface OnSurfaceNotInUseListener {
        void onSurfaceNotInUse();
    }

    abstract android.view.View getPreview();

    abstract android.graphics.Bitmap getPreviewBitmap();

    abstract void initializePreview();

    abstract void onAttachedToWindow();

    abstract void onDetachedFromWindow();

    abstract void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener);

    abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> waitForNextFrame();

    PreviewViewImplementation(android.widget.FrameLayout parent, androidx.camera.view.PreviewTransformation previewTransform) {
        this.mParent = parent;
        this.mPreviewTransform = previewTransform;
    }

    void redrawPreview() {
        android.view.View preview = getPreview();
        if (preview == null || !this.mWasSurfaceProvided) {
            return;
        }
        this.mPreviewTransform.transformView(new android.util.Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection(), preview);
    }

    void onSurfaceProvided() {
        this.mWasSurfaceProvided = true;
        redrawPreview();
    }

    android.graphics.Bitmap getBitmap() {
        android.graphics.Bitmap previewBitmap = getPreviewBitmap();
        if (previewBitmap == null) {
            return null;
        }
        return this.mPreviewTransform.createTransformedBitmap(previewBitmap, new android.util.Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection());
    }
}
