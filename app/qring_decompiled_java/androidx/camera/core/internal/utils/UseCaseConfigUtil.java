package androidx.camera.core.internal.utils;

/* loaded from: classes.dex */
public final class UseCaseConfigUtil {
    private UseCaseConfigUtil() {
    }

    public static void updateTargetRotationAndRelatedConfigs(androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> builder, int newRotation) {
        android.util.Size targetResolution;
        androidx.camera.core.impl.ImageOutputConfig imageOutputConfig = (androidx.camera.core.impl.ImageOutputConfig) builder.getUseCaseConfig();
        int targetRotation = imageOutputConfig.getTargetRotation(-1);
        if (targetRotation == -1 || targetRotation != newRotation) {
            ((androidx.camera.core.impl.ImageOutputConfig.Builder) builder).setTargetRotation(newRotation);
        }
        if (targetRotation == -1 || newRotation == -1 || targetRotation == newRotation) {
            return;
        }
        if (java.lang.Math.abs(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(newRotation) - androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)) % 180 != 90 || (targetResolution = imageOutputConfig.getTargetResolution(null)) == null) {
            return;
        }
        ((androidx.camera.core.impl.ImageOutputConfig.Builder) builder).setTargetResolution(new android.util.Size(targetResolution.getHeight(), targetResolution.getWidth()));
    }
}
