package androidx.camera.core;

/* loaded from: classes.dex */
public interface ImageReaderProxyProvider {
    androidx.camera.core.impl.ImageReaderProxy newInstance(int width, int height, int format, int queueDepth, long usage);
}
