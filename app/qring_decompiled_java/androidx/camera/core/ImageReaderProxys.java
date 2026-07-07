package androidx.camera.core;

/* loaded from: classes.dex */
final class ImageReaderProxys {
    private ImageReaderProxys() {
    }

    static androidx.camera.core.impl.ImageReaderProxy createIsolatedReader(int width, int height, int format, int maxImages) {
        return new androidx.camera.core.AndroidImageReaderProxy(android.media.ImageReader.newInstance(width, height, format, maxImages));
    }
}
