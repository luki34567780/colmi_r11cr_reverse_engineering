package com.king.zxing.config;

/* loaded from: /tmp/dex/classes2.dex */
public final class AspectRatioCameraConfig extends com.king.zxing.config.CameraConfig {
    private int mAspectRatio;

    public AspectRatioCameraConfig(android.content.Context context) {
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.mAspectRatio = aspectRatio(displayMetrics.widthPixels, displayMetrics.heightPixels);
        com.king.zxing.util.LogUtils.d("aspectRatio:" + this.mAspectRatio);
    }

    private int aspectRatio(float f, float f2) {
        float max = java.lang.Math.max(f, f2) / java.lang.Math.min(f, f2);
        return java.lang.Math.abs(max - 1.3333334f) < java.lang.Math.abs(max - 1.7777778f) ? 0 : 1;
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
        builder.setTargetAspectRatio(this.mAspectRatio);
        return super.options(builder);
    }
}
