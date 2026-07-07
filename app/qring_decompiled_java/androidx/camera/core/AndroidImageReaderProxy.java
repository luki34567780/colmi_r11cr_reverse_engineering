package androidx.camera.core;

/* loaded from: classes.dex */
final class AndroidImageReaderProxy implements androidx.camera.core.impl.ImageReaderProxy {
    private final android.media.ImageReader mImageReader;

    AndroidImageReaderProxy(android.media.ImageReader imageReader) {
        this.mImageReader = imageReader;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized androidx.camera.core.ImageProxy acquireLatestImage() {
        android.media.Image image;
        try {
            image = this.mImageReader.acquireLatestImage();
        } catch (java.lang.RuntimeException e) {
            if (!isImageReaderContextNotInitializedException(e)) {
                throw e;
            }
            image = null;
        }
        if (image == null) {
            return null;
        }
        return new androidx.camera.core.AndroidImageProxy(image);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized androidx.camera.core.ImageProxy acquireNextImage() {
        android.media.Image image;
        try {
            image = this.mImageReader.acquireNextImage();
        } catch (java.lang.RuntimeException e) {
            if (!isImageReaderContextNotInitializedException(e)) {
                throw e;
            }
            image = null;
        }
        if (image == null) {
            return null;
        }
        return new androidx.camera.core.AndroidImageProxy(image);
    }

    private boolean isImageReaderContextNotInitializedException(java.lang.RuntimeException e) {
        return "ImageReaderContext is not initialized".equals(e.getMessage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized void close() {
        this.mImageReader.close();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized int getHeight() {
        return this.mImageReader.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized int getWidth() {
        return this.mImageReader.getWidth();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized int getImageFormat() {
        return this.mImageReader.getImageFormat();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized int getMaxImages() {
        return this.mImageReader.getMaxImages();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized android.view.Surface getSurface() {
        return this.mImageReader.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized void setOnImageAvailableListener(final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener listener, final java.util.concurrent.Executor executor) {
        this.mImageReader.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.AndroidImageReaderProxy$$ExternalSyntheticLambda0
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(android.media.ImageReader imageReader) {
                androidx.camera.core.AndroidImageReaderProxy.this.m63x2fd48a6(executor, listener, imageReader);
            }
        }, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
    }

    /* renamed from: lambda$setOnImageAvailableListener$0$androidx-camera-core-AndroidImageReaderProxy, reason: not valid java name */
    public /* synthetic */ void m62x4985bb07(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    /* renamed from: lambda$setOnImageAvailableListener$1$androidx-camera-core-AndroidImageReaderProxy, reason: not valid java name */
    public /* synthetic */ void m63x2fd48a6(java.util.concurrent.Executor executor, final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, android.media.ImageReader imageReader) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.AndroidImageReaderProxy$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.AndroidImageReaderProxy.this.m62x4985bb07(onImageAvailableListener);
            }
        });
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public synchronized void clearOnImageAvailableListener() {
        this.mImageReader.setOnImageAvailableListener(null, null);
    }
}
