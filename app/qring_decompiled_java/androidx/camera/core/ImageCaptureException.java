package androidx.camera.core;

/* loaded from: classes.dex */
public class ImageCaptureException extends java.lang.Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(final int imageCaptureError, final java.lang.String message, final java.lang.Throwable cause) {
        super(message, cause);
        this.mImageCaptureError = imageCaptureError;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
