package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class SingleImageProxyBundle implements androidx.camera.core.impl.ImageProxyBundle {
    private final int mCaptureId;
    private final androidx.camera.core.ImageProxy mImageProxy;

    public SingleImageProxyBundle(androidx.camera.core.ImageProxy imageProxy, java.lang.String tagBundleKey) {
        androidx.camera.core.ImageInfo imageInfo = imageProxy.getImageInfo();
        if (imageInfo == null) {
            throw new java.lang.IllegalArgumentException("ImageProxy has no associated ImageInfo");
        }
        java.lang.Integer tag = imageInfo.getTagBundle().getTag(tagBundleKey);
        if (tag == null) {
            throw new java.lang.IllegalArgumentException("ImageProxy has no associated tag");
        }
        this.mCaptureId = tag.intValue();
        this.mImageProxy = imageProxy;
    }

    SingleImageProxyBundle(androidx.camera.core.ImageProxy imageProxy, int captureId) {
        this.mCaptureId = captureId;
        this.mImageProxy = imageProxy;
    }

    public void close() {
        this.mImageProxy.close();
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.ImageProxy> getImageProxy(int captureId) {
        if (captureId != this.mCaptureId) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(this.mImageProxy);
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public java.util.List<java.lang.Integer> getCaptureIds() {
        return java.util.Collections.singletonList(java.lang.Integer.valueOf(this.mCaptureId));
    }
}
