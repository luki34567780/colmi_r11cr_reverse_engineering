package androidx.camera.core;

/* loaded from: classes.dex */
class MetadataImageReader implements androidx.camera.core.impl.ImageReaderProxy, androidx.camera.core.ForwardingImageProxy.OnImageCloseListener {
    private static final java.lang.String TAG = "MetadataImageReader";
    private final java.util.List<androidx.camera.core.ImageProxy> mAcquiredImageProxies;
    private androidx.camera.core.impl.CameraCaptureCallback mCameraCaptureCallback;
    private boolean mClosed;
    private java.util.concurrent.Executor mExecutor;
    private int mImageProxiesIndex;
    private final androidx.camera.core.impl.ImageReaderProxy mImageReaderProxy;
    androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener mListener;
    private final java.lang.Object mLock;
    private final java.util.List<androidx.camera.core.ImageProxy> mMatchedImageProxies;
    private final android.util.LongSparseArray<androidx.camera.core.ImageInfo> mPendingImageInfos;
    private final android.util.LongSparseArray<androidx.camera.core.ImageProxy> mPendingImages;
    private androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener mTransformedListener;

    MetadataImageReader(int width, int height, int format, int maxImages) {
        this(createImageReaderProxy(width, height, format, maxImages));
    }

    private static androidx.camera.core.impl.ImageReaderProxy createImageReaderProxy(int width, int height, int format, int maxImages) {
        return new androidx.camera.core.AndroidImageReaderProxy(android.media.ImageReader.newInstance(width, height, format, maxImages));
    }

    MetadataImageReader(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        this.mLock = new java.lang.Object();
        this.mCameraCaptureCallback = new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.core.MetadataImageReader.1
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                super.onCaptureCompleted(cameraCaptureResult);
                androidx.camera.core.MetadataImageReader.this.resultIncoming(cameraCaptureResult);
            }
        };
        this.mTransformedListener = new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.MetadataImageReader$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy2) {
                androidx.camera.core.MetadataImageReader.this.m92lambda$new$0$androidxcameracoreMetadataImageReader(imageReaderProxy2);
            }
        };
        this.mClosed = false;
        this.mPendingImageInfos = new android.util.LongSparseArray<>();
        this.mPendingImages = new android.util.LongSparseArray<>();
        this.mAcquiredImageProxies = new java.util.ArrayList();
        this.mImageReaderProxy = imageReaderProxy;
        this.mImageProxiesIndex = 0;
        this.mMatchedImageProxies = new java.util.ArrayList(getMaxImages());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex >= this.mMatchedImageProxies.size()) {
                throw new java.lang.IllegalStateException("Maximum image number reached.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < this.mMatchedImageProxies.size() - 1; i++) {
                if (!this.mAcquiredImageProxies.contains(this.mMatchedImageProxies.get(i))) {
                    arrayList.add(this.mMatchedImageProxies.get(i));
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.ImageProxy) it.next()).close();
            }
            int size = this.mMatchedImageProxies.size() - 1;
            this.mImageProxiesIndex = size;
            java.util.List<androidx.camera.core.ImageProxy> list = this.mMatchedImageProxies;
            this.mImageProxiesIndex = size + 1;
            androidx.camera.core.ImageProxy imageProxy = list.get(size);
            this.mAcquiredImageProxies.add(imageProxy);
            return imageProxy;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex >= this.mMatchedImageProxies.size()) {
                throw new java.lang.IllegalStateException("Maximum image number reached.");
            }
            java.util.List<androidx.camera.core.ImageProxy> list = this.mMatchedImageProxies;
            int i = this.mImageProxiesIndex;
            this.mImageProxiesIndex = i + 1;
            androidx.camera.core.ImageProxy imageProxy = list.get(i);
            this.mAcquiredImageProxies.add(imageProxy);
            return imageProxy;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(this.mMatchedImageProxies).iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.ImageProxy) it.next()).close();
            }
            this.mMatchedImageProxies.clear();
            this.mImageReaderProxy.close();
            this.mClosed = true;
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
    public void setOnImageAvailableListener(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener listener, java.util.concurrent.Executor executor) {
        synchronized (this.mLock) {
            this.mListener = (androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener) androidx.core.util.Preconditions.checkNotNull(listener);
            this.mExecutor = (java.util.concurrent.Executor) androidx.core.util.Preconditions.checkNotNull(executor);
            this.mImageReaderProxy.setOnImageAvailableListener(this.mTransformedListener, executor);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mListener = null;
            this.mExecutor = null;
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(androidx.camera.core.ImageProxy image) {
        synchronized (this.mLock) {
            dequeImageProxy(image);
        }
    }

    private void enqueueImageProxy(androidx.camera.core.SettableImageProxy image) {
        final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
        java.util.concurrent.Executor executor;
        synchronized (this.mLock) {
            onImageAvailableListener = null;
            if (this.mMatchedImageProxies.size() < getMaxImages()) {
                image.addOnImageCloseListener(this);
                this.mMatchedImageProxies.add(image);
                onImageAvailableListener = this.mListener;
                executor = this.mExecutor;
            } else {
                androidx.camera.core.Logger.d("TAG", "Maximum image number reached.");
                image.close();
                executor = null;
            }
        }
        if (onImageAvailableListener != null) {
            if (executor != null) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.MetadataImageReader$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.MetadataImageReader.this.m91xfaac2cde(onImageAvailableListener);
                    }
                });
            } else {
                onImageAvailableListener.onImageAvailable(this);
            }
        }
    }

    /* renamed from: lambda$enqueueImageProxy$1$androidx-camera-core-MetadataImageReader, reason: not valid java name */
    public /* synthetic */ void m91xfaac2cde(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    private void dequeImageProxy(androidx.camera.core.ImageProxy image) {
        synchronized (this.mLock) {
            int indexOf = this.mMatchedImageProxies.indexOf(image);
            if (indexOf >= 0) {
                this.mMatchedImageProxies.remove(indexOf);
                int i = this.mImageProxiesIndex;
                if (indexOf <= i) {
                    this.mImageProxiesIndex = i - 1;
                }
            }
            this.mAcquiredImageProxies.remove(image);
        }
    }

    androidx.camera.core.impl.CameraCaptureCallback getCameraCaptureCallback() {
        return this.mCameraCaptureCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: imageIncoming, reason: merged with bridge method [inline-methods] */
    public void m92lambda$new$0$androidxcameracoreMetadataImageReader(androidx.camera.core.impl.ImageReaderProxy imageReader) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            int i = 0;
            do {
                androidx.camera.core.ImageProxy imageProxy = null;
                try {
                    imageProxy = imageReader.acquireNextImage();
                    if (imageProxy != null) {
                        i++;
                        this.mPendingImages.put(imageProxy.getImageInfo().getTimestamp(), imageProxy);
                        matchImages();
                    }
                } catch (java.lang.IllegalStateException e) {
                    androidx.camera.core.Logger.d(TAG, "Failed to acquire next image.", e);
                }
                if (imageProxy == null) {
                    break;
                }
            } while (i < imageReader.getMaxImages());
        }
    }

    void resultIncoming(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            this.mPendingImageInfos.put(cameraCaptureResult.getTimestamp(), new androidx.camera.core.internal.CameraCaptureResultImageInfo(cameraCaptureResult));
            matchImages();
        }
    }

    private void removeStaleData() {
        synchronized (this.mLock) {
            if (this.mPendingImages.size() != 0 && this.mPendingImageInfos.size() != 0) {
                java.lang.Long valueOf = java.lang.Long.valueOf(this.mPendingImages.keyAt(0));
                java.lang.Long valueOf2 = java.lang.Long.valueOf(this.mPendingImageInfos.keyAt(0));
                androidx.core.util.Preconditions.checkArgument(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.mPendingImages.size() - 1; size >= 0; size--) {
                        if (this.mPendingImages.keyAt(size) < valueOf2.longValue()) {
                            this.mPendingImages.valueAt(size).close();
                            this.mPendingImages.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.mPendingImageInfos.size() - 1; size2 >= 0; size2--) {
                        if (this.mPendingImageInfos.keyAt(size2) < valueOf.longValue()) {
                            this.mPendingImageInfos.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    private void matchImages() {
        synchronized (this.mLock) {
            for (int size = this.mPendingImageInfos.size() - 1; size >= 0; size--) {
                androidx.camera.core.ImageInfo valueAt = this.mPendingImageInfos.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                androidx.camera.core.ImageProxy imageProxy = this.mPendingImages.get(timestamp);
                if (imageProxy != null) {
                    this.mPendingImages.remove(timestamp);
                    this.mPendingImageInfos.removeAt(size);
                    enqueueImageProxy(new androidx.camera.core.SettableImageProxy(imageProxy, valueAt));
                }
            }
            removeStaleData();
        }
    }
}
