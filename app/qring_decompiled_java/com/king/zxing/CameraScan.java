package com.king.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class CameraScan implements com.king.zxing.ICamera, com.king.zxing.ICameraControl {
    public static int LENS_FACING_BACK = 1;
    public static int LENS_FACING_FRONT = 0;
    public static java.lang.String SCAN_RESULT = "SCAN_RESULT";
    private boolean isNeedAutoZoom = false;
    private boolean isNeedTouchZoom = true;

    public interface OnScanResultCallback {

        /* renamed from: com.king.zxing.CameraScan$OnScanResultCallback$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onScanResultFailure(com.king.zxing.CameraScan.OnScanResultCallback _this) {
            }
        }

        boolean onScanResultCallback(com.google.zxing.Result result);

        void onScanResultFailure();
    }

    public abstract com.king.zxing.CameraScan bindFlashlightView(android.view.View view);

    public abstract com.king.zxing.CameraScan setAnalyzeImage(boolean z);

    public abstract com.king.zxing.CameraScan setAnalyzer(com.king.zxing.analyze.Analyzer analyzer);

    public abstract com.king.zxing.CameraScan setBrightLightLux(float f);

    public abstract com.king.zxing.CameraScan setCameraConfig(com.king.zxing.config.CameraConfig cameraConfig);

    public abstract com.king.zxing.CameraScan setDarkLightLux(float f);

    public abstract com.king.zxing.CameraScan setOnScanResultCallback(com.king.zxing.CameraScan.OnScanResultCallback onScanResultCallback);

    public abstract com.king.zxing.CameraScan setPlayBeep(boolean z);

    public abstract com.king.zxing.CameraScan setVibrate(boolean z);

    protected boolean isNeedTouchZoom() {
        return this.isNeedTouchZoom;
    }

    public com.king.zxing.CameraScan setNeedTouchZoom(boolean z) {
        this.isNeedTouchZoom = z;
        return this;
    }

    protected boolean isNeedAutoZoom() {
        return this.isNeedAutoZoom;
    }

    public com.king.zxing.CameraScan setNeedAutoZoom(boolean z) {
        this.isNeedAutoZoom = z;
        return this;
    }

    public static java.lang.String parseScanResult(android.content.Intent intent) {
        if (intent != null) {
            return intent.getStringExtra(SCAN_RESULT);
        }
        return null;
    }
}
