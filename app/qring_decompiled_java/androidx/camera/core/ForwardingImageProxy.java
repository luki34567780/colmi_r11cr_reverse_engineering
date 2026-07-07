package androidx.camera.core;

/* loaded from: classes.dex */
abstract class ForwardingImageProxy implements androidx.camera.core.ImageProxy {
    protected final androidx.camera.core.ImageProxy mImage;
    private final java.util.Set<androidx.camera.core.ForwardingImageProxy.OnImageCloseListener> mOnImageCloseListeners = new java.util.HashSet();

    interface OnImageCloseListener {
        void onImageClose(androidx.camera.core.ImageProxy image);
    }

    protected ForwardingImageProxy(androidx.camera.core.ImageProxy image) {
        this.mImage = image;
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.mImage.close();
        }
        notifyOnImageCloseListeners();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized android.graphics.Rect getCropRect() {
        return this.mImage.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized void setCropRect(android.graphics.Rect rect) {
        this.mImage.setCropRect(rect);
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getFormat() {
        return this.mImage.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getHeight() {
        return this.mImage.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized int getWidth() {
        return this.mImage.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
        return this.mImage.getPlanes();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized androidx.camera.core.ImageInfo getImageInfo() {
        return this.mImage.getImageInfo();
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized android.media.Image getImage() {
        return this.mImage.getImage();
    }

    synchronized void addOnImageCloseListener(androidx.camera.core.ForwardingImageProxy.OnImageCloseListener listener) {
        this.mOnImageCloseListeners.add(listener);
    }

    protected void notifyOnImageCloseListeners() {
        java.util.HashSet hashSet;
        synchronized (this) {
            hashSet = new java.util.HashSet(this.mOnImageCloseListeners);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((androidx.camera.core.ForwardingImageProxy.OnImageCloseListener) it.next()).onImageClose(this);
        }
    }
}
