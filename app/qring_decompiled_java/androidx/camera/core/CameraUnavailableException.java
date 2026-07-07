package androidx.camera.core;

/* loaded from: classes.dex */
public class CameraUnavailableException extends java.lang.Exception {
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_MAX_IN_USE = 5;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 6;
    public static final int CAMERA_UNKNOWN_ERROR = 0;
    private final int mReason;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Reason {
    }

    public CameraUnavailableException(int reason) {
        this.mReason = reason;
    }

    public CameraUnavailableException(int reason, java.lang.String message) {
        super(message);
        this.mReason = reason;
    }

    public CameraUnavailableException(int reason, java.lang.String message, java.lang.Throwable cause) {
        super(message, cause);
        this.mReason = reason;
    }

    public CameraUnavailableException(int reason, java.lang.Throwable cause) {
        super(cause);
        this.mReason = reason;
    }

    public int getReason() {
        return this.mReason;
    }
}
