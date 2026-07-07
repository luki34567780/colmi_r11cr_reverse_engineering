package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class CameraCaptureResults {
    public static androidx.camera.core.impl.CameraCaptureResult retrieveCameraCaptureResult(androidx.camera.core.ImageInfo imageInfo) {
        if (imageInfo instanceof androidx.camera.core.internal.CameraCaptureResultImageInfo) {
            return ((androidx.camera.core.internal.CameraCaptureResultImageInfo) imageInfo).getCameraCaptureResult();
        }
        return null;
    }

    private CameraCaptureResults() {
    }
}
