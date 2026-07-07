package com.king.zxing.config;

/* loaded from: /tmp/dex/classes2.dex */
public class ResolutionCameraConfig extends com.king.zxing.config.CameraConfig {
    private android.util.Size mTargetSize;

    public ResolutionCameraConfig(android.content.Context context) {
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        com.king.zxing.util.LogUtils.d(java.lang.String.format("displayMetrics:%d x %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        if (i < i2) {
            int min = java.lang.Math.min(i, 1080);
            if (i / i2 > 0.7d) {
                this.mTargetSize = new android.util.Size(min, (int) ((min / 3.0f) * 4.0f));
            } else {
                this.mTargetSize = new android.util.Size(min, (int) ((min / 9.0f) * 16.0f));
            }
        } else {
            int min2 = java.lang.Math.min(i2, 1080);
            if (i2 / i > 0.7d) {
                this.mTargetSize = new android.util.Size((int) ((min2 / 3.0f) * 4.0f), min2);
            } else {
                this.mTargetSize = new android.util.Size((int) ((min2 / 9.0f) * 16.0d), min2);
            }
        }
        com.king.zxing.util.LogUtils.d("targetSize:" + this.mTargetSize);
    }

    @Override // com.king.zxing.config.CameraConfig
    public androidx.camera.core.Preview options(androidx.camera.core.Preview.Builder builder) {
        return super.options(builder);
    }

    @Override // com.king.zxing.config.CameraConfig
    public androidx.camera.core.CameraSelector options(androidx.camera.core.CameraSelector.Builder builder) {
        return super.options(builder);
    }

    @Override // com.king.zxing.config.CameraConfig
    public androidx.camera.core.ImageAnalysis options(androidx.camera.core.ImageAnalysis.Builder builder) {
        builder.setTargetResolution(this.mTargetSize);
        return super.options(builder);
    }
}
