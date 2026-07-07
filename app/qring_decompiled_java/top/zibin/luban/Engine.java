package top.zibin.luban;

/* loaded from: classes3.dex */
class Engine {
    private boolean focusAlpha;
    private int srcHeight;
    private top.zibin.luban.InputStreamProvider srcImg;
    private int srcWidth;
    private java.io.File tagImg;

    Engine(top.zibin.luban.InputStreamProvider inputStreamProvider, java.io.File file, boolean z) throws java.io.IOException {
        this.tagImg = file;
        this.srcImg = inputStreamProvider;
        this.focusAlpha = z;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        android.graphics.BitmapFactory.decodeStream(inputStreamProvider.open(), null, options);
        this.srcWidth = options.outWidth;
        this.srcHeight = options.outHeight;
    }

    private int computeSize() {
        int i = this.srcWidth;
        if (i % 2 == 1) {
            i++;
        }
        this.srcWidth = i;
        int i2 = this.srcHeight;
        if (i2 % 2 == 1) {
            i2++;
        }
        this.srcHeight = i2;
        int max = java.lang.Math.max(i, i2);
        float min = java.lang.Math.min(this.srcWidth, this.srcHeight) / max;
        if (min > 1.0f || min <= 0.5625d) {
            double d = min;
            if (d <= 0.5625d && d > 0.5d) {
                int i3 = max / com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.Device.PERIPHERAL_NON_KEYBOARD_NON_POINTING;
                if (i3 == 0) {
                    return 1;
                }
                return i3;
            }
            return (int) java.lang.Math.ceil(max / (1280.0d / d));
        }
        if (max < 1664) {
            return 1;
        }
        if (max < 4990) {
            return 2;
        }
        if (max <= 4990 || max >= 10240) {
            return max / com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.Device.PERIPHERAL_NON_KEYBOARD_NON_POINTING;
        }
        return 4;
    }

    private android.graphics.Bitmap rotatingImage(android.graphics.Bitmap bitmap, int i) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(i);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    java.io.File compress() throws java.io.IOException {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = computeSize();
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(this.srcImg.open(), null, options);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        if (top.zibin.luban.Checker.SINGLE.isJPG(this.srcImg.open())) {
            decodeStream = rotatingImage(decodeStream, top.zibin.luban.Checker.SINGLE.getOrientation(this.srcImg.open()));
        }
        decodeStream.compress((this.focusAlpha || decodeStream.hasAlpha()) ? android.graphics.Bitmap.CompressFormat.PNG : android.graphics.Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        decodeStream.recycle();
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.tagImg);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return this.tagImg;
    }
}
