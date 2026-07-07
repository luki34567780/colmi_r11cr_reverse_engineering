package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
public final class CameraUnavailableExceptionHelper {
    private CameraUnavailableExceptionHelper() {
    }

    public static androidx.camera.core.CameraUnavailableException createFrom(androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e) {
        int reason = e.getReason();
        int i = 5;
        if (reason == 1) {
            i = 1;
        } else if (reason == 2) {
            i = 2;
        } else if (reason == 3) {
            i = 3;
        } else if (reason == 4) {
            i = 4;
        } else if (reason != 5) {
            i = reason != 10001 ? 0 : 6;
        }
        return new androidx.camera.core.CameraUnavailableException(i, e);
    }
}
