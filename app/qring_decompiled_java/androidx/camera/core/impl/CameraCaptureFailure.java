package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class CameraCaptureFailure {
    private final androidx.camera.core.impl.CameraCaptureFailure.Reason mReason;

    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(androidx.camera.core.impl.CameraCaptureFailure.Reason reason) {
        this.mReason = reason;
    }

    public androidx.camera.core.impl.CameraCaptureFailure.Reason getReason() {
        return this.mReason;
    }
}
