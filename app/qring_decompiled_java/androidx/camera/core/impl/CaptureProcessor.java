package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface CaptureProcessor {
    void onOutputSurface(android.view.Surface surface, int imageFormat);

    void onResolutionUpdate(android.util.Size size);

    void process(androidx.camera.core.impl.ImageProxyBundle bundle);
}
