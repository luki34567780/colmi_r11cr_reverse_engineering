package androidx.camera.core;

/* loaded from: classes.dex */
public interface ImageProxy extends java.lang.AutoCloseable {

    public interface PlaneProxy {
        java.nio.ByteBuffer getBuffer();

        int getPixelStride();

        int getRowStride();
    }

    @Override // java.lang.AutoCloseable
    void close();

    android.graphics.Rect getCropRect();

    int getFormat();

    int getHeight();

    android.media.Image getImage();

    androidx.camera.core.ImageInfo getImageInfo();

    androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes();

    int getWidth();

    void setCropRect(android.graphics.Rect rect);
}
