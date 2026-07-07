package com.qcwireless.qcwatch.ui.device.camera;

/* loaded from: /tmp/dex/classes2.dex */
class PermissionsDelegate {
    private static final int REQUEST_CODE = 10;
    private final android.app.Activity activity;

    PermissionsDelegate(android.app.Activity activity) {
        this.activity = activity;
    }

    boolean hasCameraPermission() {
        return androidx.core.content.ContextCompat.checkSelfPermission(this.activity, com.hjq.permissions.Permission.CAMERA) == 0;
    }

    void requestCameraPermission() {
        androidx.core.app.ActivityCompat.requestPermissions(this.activity, new java.lang.String[]{com.hjq.permissions.Permission.CAMERA}, 10);
    }

    boolean resultGranted(int requestCode, java.lang.String[] permissions, int[] grantResults) {
        if (requestCode != 10 || grantResults.length < 1 || !permissions[0].equals(com.hjq.permissions.Permission.CAMERA)) {
            return false;
        }
        if (grantResults[0] == 0) {
            return true;
        }
        requestCameraPermission();
        return false;
    }
}
