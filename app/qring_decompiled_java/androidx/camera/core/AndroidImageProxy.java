package androidx.camera.core;

/* loaded from: classes.dex */
final class AndroidImageProxy implements androidx.camera.core.ImageProxy {
    private final android.media.Image mImage;
    private final androidx.camera.core.ImageInfo mImageInfo;
    private final androidx.camera.core.AndroidImageProxy.PlaneProxy[] mPlanes;

    AndroidImageProxy(android.media.Image image) {
        this.mImage = image;
        android.media.Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.mPlanes = new androidx.camera.core.AndroidImageProxy.PlaneProxy[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.mPlanes[i] = new androidx.camera.core.AndroidImageProxy.PlaneProxy(planes[i]);
            }
        } else {
            this.mPlanes = new androidx.camera.core.AndroidImageProxy.PlaneProxy[0];
        }
        this.mImageInfo = androidx.camera.core.ImmutableImageInfo.create(androidx.camera.core.impl.TagBundle.emptyBundle(), image.getTimestamp(), 0);
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public synchronized void close() {
        this.mImage.close();
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
        return this.mPlanes;
    }

    private static final class PlaneProxy implements androidx.camera.core.ImageProxy.PlaneProxy {
        private final android.media.Image.Plane mPlane;

        PlaneProxy(android.media.Image.Plane plane) {
            this.mPlane = plane;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public synchronized int getRowStride() {
            return this.mPlane.getRowStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public synchronized int getPixelStride() {
            return this.mPlane.getPixelStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public synchronized java.nio.ByteBuffer getBuffer() {
            return this.mPlane.getBuffer();
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageInfo getImageInfo() {
        return this.mImageInfo;
    }

    @Override // androidx.camera.core.ImageProxy
    public synchronized android.media.Image getImage() {
        return this.mImage;
    }
}
