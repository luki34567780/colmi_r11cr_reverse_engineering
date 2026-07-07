package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface ImageProxyBundle {
    java.util.List<java.lang.Integer> getCaptureIds();

    com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.ImageProxy> getImageProxy(int captureId);
}
