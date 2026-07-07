package androidx.camera.core;

/* loaded from: classes.dex */
class SafeCloseImageReaderProxy implements androidx.camera.core.impl.ImageReaderProxy {
    private final androidx.camera.core.impl.ImageReaderProxy mImageReaderProxy;
    private final android.view.Surface mSurface;
    private final java.lang.Object mLock = new java.lang.Object();
    private volatile int mOutstandingImages = 0;
    private volatile boolean mIsClosed = false;
    private androidx.camera.core.ForwardingImageProxy.OnImageCloseListener mImageCloseListener = new androidx.camera.core.ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
        public final void onImageClose(androidx.camera.core.ImageProxy imageProxy) {
            androidx.camera.core.SafeCloseImageReaderProxy.this.m97lambda$new$0$androidxcameracoreSafeCloseImageReaderProxy(imageProxy);
        }
    };

    /* renamed from: lambda$new$0$androidx-camera-core-SafeCloseImageReaderProxy, reason: not valid java name */
    public /* synthetic */ void m97lambda$new$0$androidxcameracoreSafeCloseImageReaderProxy(androidx.camera.core.ImageProxy imageProxy) {
        synchronized (this.mLock) {
            this.mOutstandingImages--;
            if (this.mIsClosed && this.mOutstandingImages == 0) {
                close();
            }
        }
    }

    SafeCloseImageReaderProxy(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        this.mImageReaderProxy = imageReaderProxy;
        this.mSurface = imageReaderProxy.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        androidx.camera.core.ImageProxy wrapImageProxy;
        synchronized (this.mLock) {
            wrapImageProxy = wrapImageProxy(this.mImageReaderProxy.acquireLatestImage());
        }
        return wrapImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        androidx.camera.core.ImageProxy wrapImageProxy;
        synchronized (this.mLock) {
            wrapImageProxy = wrapImageProxy(this.mImageReaderProxy.acquireNextImage());
        }
        return wrapImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            android.view.Surface surface = this.mSurface;
            if (surface != null) {
                surface.release();
            }
            this.mImageReaderProxy.close();
        }
    }

    private androidx.camera.core.ImageProxy wrapImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        synchronized (this.mLock) {
            if (imageProxy == null) {
                return null;
            }
            this.mOutstandingImages++;
            androidx.camera.core.SingleCloseImageProxy singleCloseImageProxy = new androidx.camera.core.SingleCloseImageProxy(imageProxy);
            singleCloseImageProxy.addOnImageCloseListener(this.mImageCloseListener);
            return singleCloseImageProxy;
        }
    }

    void safeClose() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mImageReaderProxy.clearOnImageAvailableListener();
            if (this.mOutstandingImages == 0) {
                close();
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReaderProxy.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReaderProxy.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReaderProxy.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public android.view.Surface getSurface() {
        android.view.Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReaderProxy.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener listener, java.util.concurrent.Executor executor) {
        synchronized (this.mLock) {
            this.mImageReaderProxy.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                    androidx.camera.core.SafeCloseImageReaderProxy.this.m98x24b152e2(listener, imageReaderProxy);
                }
            }, executor);
        }
    }

    /* renamed from: lambda$setOnImageAvailableListener$1$androidx-camera-core-SafeCloseImageReaderProxy, reason: not valid java name */
    public /* synthetic */ void m98x24b152e2(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        onImageAvailableListener.onImageAvailable(this);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mImageReaderProxy.clearOnImageAvailableListener();
        }
    }
}
