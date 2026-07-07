package androidx.camera.core;

/* loaded from: classes.dex */
final class SettableImageProxyBundle implements androidx.camera.core.impl.ImageProxyBundle {
    private final java.util.List<java.lang.Integer> mCaptureIdList;
    private java.lang.String mTagBundleKey;
    final java.lang.Object mLock = new java.lang.Object();
    final android.util.SparseArray<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.core.ImageProxy>> mCompleters = new android.util.SparseArray<>();
    private final android.util.SparseArray<com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.ImageProxy>> mFutureResults = new android.util.SparseArray<>();
    private final java.util.List<androidx.camera.core.ImageProxy> mOwnedImageProxies = new java.util.ArrayList();
    private boolean mClosed = false;

    SettableImageProxyBundle(java.util.List<java.lang.Integer> captureIds, java.lang.String tagBundleKey) {
        this.mTagBundleKey = null;
        this.mCaptureIdList = captureIds;
        this.mTagBundleKey = tagBundleKey;
        setup();
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.ImageProxy> getImageProxy(int captureId) {
        com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.ImageProxy> listenableFuture;
        synchronized (this.mLock) {
            if (this.mClosed) {
                throw new java.lang.IllegalStateException("ImageProxyBundle already closed.");
            }
            listenableFuture = this.mFutureResults.get(captureId);
            if (listenableFuture == null) {
                throw new java.lang.IllegalArgumentException("ImageProxyBundle does not contain this id: " + captureId);
            }
        }
        return listenableFuture;
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public java.util.List<java.lang.Integer> getCaptureIds() {
        return java.util.Collections.unmodifiableList(this.mCaptureIdList);
    }

    void addImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            java.lang.Integer tag = imageProxy.getImageInfo().getTagBundle().getTag(this.mTagBundleKey);
            if (tag == null) {
                throw new java.lang.IllegalArgumentException("CaptureId is null.");
            }
            androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.core.ImageProxy> completer = this.mCompleters.get(tag.intValue());
            if (completer != null) {
                this.mOwnedImageProxies.add(imageProxy);
                completer.set(imageProxy);
            } else {
                throw new java.lang.IllegalArgumentException("ImageProxyBundle does not contain this id: " + tag);
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            java.util.Iterator<androidx.camera.core.ImageProxy> it = this.mOwnedImageProxies.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mOwnedImageProxies.clear();
            this.mFutureResults.clear();
            this.mCompleters.clear();
            this.mClosed = true;
        }
    }

    void reset() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            java.util.Iterator<androidx.camera.core.ImageProxy> it = this.mOwnedImageProxies.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mOwnedImageProxies.clear();
            this.mFutureResults.clear();
            this.mCompleters.clear();
            setup();
        }
    }

    private void setup() {
        synchronized (this.mLock) {
            java.util.Iterator<java.lang.Integer> it = this.mCaptureIdList.iterator();
            while (it.hasNext()) {
                final int intValue = it.next().intValue();
                this.mFutureResults.put(intValue, androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<androidx.camera.core.ImageProxy>() { // from class: androidx.camera.core.SettableImageProxyBundle.1
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.core.ImageProxy> completer) {
                        synchronized (androidx.camera.core.SettableImageProxyBundle.this.mLock) {
                            androidx.camera.core.SettableImageProxyBundle.this.mCompleters.put(intValue, completer);
                        }
                        return "getImageProxy(id: " + intValue + ")";
                    }
                }));
            }
        }
    }
}
