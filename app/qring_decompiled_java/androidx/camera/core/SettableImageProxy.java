package androidx.camera.core;

/* loaded from: classes.dex */
final class SettableImageProxy extends androidx.camera.core.ForwardingImageProxy {
    private android.graphics.Rect mCropRect;
    private final int mHeight;
    private final androidx.camera.core.ImageInfo mImageInfo;
    private final int mWidth;

    SettableImageProxy(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageInfo imageInfo) {
        this(imageProxy, null, imageInfo);
    }

    SettableImageProxy(androidx.camera.core.ImageProxy imageProxy, android.util.Size resolution, androidx.camera.core.ImageInfo imageInfo) {
        super(imageProxy);
        if (resolution == null) {
            this.mWidth = super.getWidth();
            this.mHeight = super.getHeight();
        } else {
            this.mWidth = resolution.getWidth();
            this.mHeight = resolution.getHeight();
        }
        this.mImageInfo = imageInfo;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public synchronized android.graphics.Rect getCropRect() {
        if (this.mCropRect == null) {
            return new android.graphics.Rect(0, 0, getWidth(), getHeight());
        }
        return new android.graphics.Rect(this.mCropRect);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public synchronized void setCropRect(android.graphics.Rect cropRect) {
        if (cropRect != null) {
            android.graphics.Rect rect = new android.graphics.Rect(cropRect);
            if (!rect.intersect(0, 0, getWidth(), getHeight())) {
                rect.setEmpty();
            }
            cropRect = rect;
        }
        this.mCropRect = cropRect;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public synchronized int getWidth() {
        return this.mWidth;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public synchronized int getHeight() {
        return this.mHeight;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageInfo getImageInfo() {
        return this.mImageInfo;
    }
}
