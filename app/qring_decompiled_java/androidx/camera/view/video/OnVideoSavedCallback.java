package androidx.camera.view.video;

/* loaded from: classes.dex */
public interface OnVideoSavedCallback {
    public static final int ERROR_ENCODER = 1;
    public static final int ERROR_FILE_IO = 4;
    public static final int ERROR_INVALID_CAMERA = 5;
    public static final int ERROR_MUXER = 2;
    public static final int ERROR_RECORDING_IN_PROGRESS = 3;
    public static final int ERROR_UNKNOWN = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VideoCaptureError {
    }

    void onError(int videoCaptureError, java.lang.String message, java.lang.Throwable cause);

    void onVideoSaved(androidx.camera.view.video.OutputFileResults outputFileResults);
}
