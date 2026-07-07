package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class FlashlightUtils {
    private static android.hardware.Camera mCamera;
    private static android.graphics.SurfaceTexture mSurfaceTexture;

    private FlashlightUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isFlashlightEnable() {
        return com.blankj.utilcode.util.Utils.getApp().getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    public static boolean isFlashlightOn() {
        if (init()) {
            return "torch".equals(mCamera.getParameters().getFlashMode());
        }
        return false;
    }

    public static void setFlashlightStatus(boolean z) {
        if (init()) {
            android.hardware.Camera.Parameters parameters = mCamera.getParameters();
            if (z) {
                if ("torch".equals(parameters.getFlashMode())) {
                    return;
                }
                try {
                    mCamera.setPreviewTexture(mSurfaceTexture);
                    mCamera.startPreview();
                    parameters.setFlashMode("torch");
                    mCamera.setParameters(parameters);
                    return;
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF.equals(parameters.getFlashMode())) {
                return;
            }
            parameters.setFlashMode(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            mCamera.setParameters(parameters);
        }
    }

    public static void destroy() {
        android.hardware.Camera camera = mCamera;
        if (camera == null) {
            return;
        }
        camera.release();
        mSurfaceTexture = null;
        mCamera = null;
    }

    private static boolean init() {
        if (mCamera == null) {
            try {
                mCamera = android.hardware.Camera.open(0);
                mSurfaceTexture = new android.graphics.SurfaceTexture(0);
            } catch (java.lang.Throwable th) {
                android.util.Log.e("FlashlightUtils", "init failed: ", th);
                return false;
            }
        }
        if (mCamera != null) {
            return true;
        }
        android.util.Log.e("FlashlightUtils", "init failed.");
        return false;
    }
}
