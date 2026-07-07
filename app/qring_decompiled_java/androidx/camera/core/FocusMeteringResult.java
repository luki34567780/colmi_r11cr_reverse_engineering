package androidx.camera.core;

/* loaded from: classes.dex */
public final class FocusMeteringResult {
    private boolean mIsFocusSuccessful;

    public static androidx.camera.core.FocusMeteringResult emptyInstance() {
        return new androidx.camera.core.FocusMeteringResult(false);
    }

    public static androidx.camera.core.FocusMeteringResult create(boolean isFocusSuccess) {
        return new androidx.camera.core.FocusMeteringResult(isFocusSuccess);
    }

    private FocusMeteringResult(boolean isFocusSuccess) {
        this.mIsFocusSuccessful = isFocusSuccess;
    }

    public boolean isFocusSuccessful() {
        return this.mIsFocusSuccessful;
    }
}
