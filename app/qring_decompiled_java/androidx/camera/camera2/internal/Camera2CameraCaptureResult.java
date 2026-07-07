package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
public class Camera2CameraCaptureResult implements androidx.camera.core.impl.CameraCaptureResult {
    private static final java.lang.String TAG = "C2CameraCaptureResult";
    private final android.hardware.camera2.CaptureResult mCaptureResult;
    private final androidx.camera.core.impl.TagBundle mTagBundle;

    public Camera2CameraCaptureResult(androidx.camera.core.impl.TagBundle tagBundle, android.hardware.camera2.CaptureResult captureResult) {
        this.mTagBundle = tagBundle;
        this.mCaptureResult = captureResult;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode() {
        java.lang.Integer num = (java.lang.Integer) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                androidx.camera.core.Logger.e(TAG, "Undefined af mode: " + num);
                return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.OFF;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState() {
        java.lang.Integer num = (java.lang.Integer) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
            case 6:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                androidx.camera.core.Logger.e(TAG, "Undefined af state: " + num);
                break;
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState() {
        java.lang.Integer num = (java.lang.Integer) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED;
            }
            if (intValue == 3) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AeState.LOCKED;
            }
            if (intValue == 4) {
                return androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                androidx.camera.core.Logger.e(TAG, "Undefined ae state: " + num);
                return androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AeState.SEARCHING;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState() {
        java.lang.Integer num = (java.lang.Integer) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.INACTIVE;
        }
        if (intValue == 1) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.METERING;
        }
        if (intValue == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED;
        }
        if (intValue == 3) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.LOCKED;
        }
        androidx.camera.core.Logger.e(TAG, "Undefined awb state: " + num);
        return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState() {
        java.lang.Integer num = (java.lang.Integer) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.FLASH_STATE);
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE;
        }
        if (intValue == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED;
        }
        androidx.camera.core.Logger.e(TAG, "Undefined flash state: " + num);
        return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        java.lang.Long l = (java.lang.Long) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.mTagBundle;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder exifData) {
        java.lang.Integer num;
        androidx.camera.core.impl.CameraCaptureResult.CC.$default$populateExifData(this, exifData);
        android.graphics.Rect rect = (android.graphics.Rect) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            exifData.setImageWidth(rect.width()).setImageHeight(rect.height());
        }
        java.lang.Integer num2 = (java.lang.Integer) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.JPEG_ORIENTATION);
        if (num2 != null) {
            exifData.setOrientationDegrees(num2.intValue());
        }
        java.lang.Long l = (java.lang.Long) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            exifData.setExposureTimeNanos(l.longValue());
        }
        java.lang.Float f = (java.lang.Float) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.LENS_APERTURE);
        if (f != null) {
            exifData.setLensFNumber(f.floatValue());
        }
        java.lang.Integer num3 = (java.lang.Integer) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (android.os.Build.VERSION.SDK_INT >= 24 && (num = (java.lang.Integer) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = java.lang.Integer.valueOf(num3.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            exifData.setIso(num3.intValue());
        }
        java.lang.Float f2 = (java.lang.Float) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            exifData.setFocalLength(f2.floatValue());
        }
        java.lang.Integer num4 = (java.lang.Integer) this.mCaptureResult.get(android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode whiteBalanceMode = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO;
            if (num4.intValue() == 0) {
                whiteBalanceMode = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL;
            }
            exifData.setWhiteBalanceMode(whiteBalanceMode);
        }
    }

    public android.hardware.camera2.CaptureResult getCaptureResult() {
        return this.mCaptureResult;
    }
}
