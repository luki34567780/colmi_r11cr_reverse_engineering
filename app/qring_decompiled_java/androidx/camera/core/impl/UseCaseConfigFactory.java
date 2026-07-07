package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface UseCaseConfigFactory {

    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    public interface Provider {
        androidx.camera.core.impl.UseCaseConfigFactory newInstance(android.content.Context context) throws androidx.camera.core.InitializationException;
    }

    androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType);
}
