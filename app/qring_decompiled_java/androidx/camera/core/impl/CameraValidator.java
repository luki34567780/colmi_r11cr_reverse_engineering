package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class CameraValidator {
    private static final java.lang.String TAG = "CameraValidator";

    private CameraValidator() {
    }

    public static void validateCameras(android.content.Context context, androidx.camera.core.impl.CameraRepository cameraRepository, androidx.camera.core.CameraSelector availableCamerasSelector) throws androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException {
        java.lang.Integer lensFacing;
        if (availableCamerasSelector != null) {
            try {
                lensFacing = availableCamerasSelector.getLensFacing();
                if (lensFacing == null) {
                    androidx.camera.core.Logger.w(TAG, "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (java.lang.IllegalStateException e) {
                androidx.camera.core.Logger.e(TAG, "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            lensFacing = null;
        }
        androidx.camera.core.Logger.d(TAG, "Verifying camera lens facing on " + android.os.Build.DEVICE + ", lensFacingInteger: " + lensFacing);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (availableCamerasSelector == null || lensFacing.intValue() == 1)) {
                androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (availableCamerasSelector == null || lensFacing.intValue() == 0) {
                    androidx.camera.core.CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras());
                }
            }
        } catch (java.lang.IllegalArgumentException e2) {
            androidx.camera.core.Logger.e(TAG, "Camera LensFacing verification failed, existing cameras: " + cameraRepository.getCameras());
            throw new androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException("Expected camera missing from device.", e2);
        }
    }

    public static class CameraIdListIncorrectException extends java.lang.Exception {
        public CameraIdListIncorrectException(java.lang.String message, java.lang.Throwable cause) {
            super(message, cause);
        }
    }
}
