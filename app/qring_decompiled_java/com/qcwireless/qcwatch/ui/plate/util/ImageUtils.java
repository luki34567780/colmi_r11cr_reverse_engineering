package com.qcwireless.qcwatch.ui.plate.util;

/* loaded from: /tmp/dex/classes2.dex */
public class ImageUtils {
    private static final java.lang.String TAG = "Jxr35";

    private static int clamp(int rgb) {
        if (rgb > 255) {
            return 255;
        }
        if (rgb < 0) {
            return 0;
        }
        return rgb;
    }

    public static void saveImage(java.lang.String path, android.graphics.Bitmap bitmap) {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new java.io.FileOutputStream(path);
                } catch (java.lang.Exception e) {
                    e = e;
                }
            } catch (java.lang.Throwable th) {
                th = th;
            }
            try {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (java.lang.Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (java.lang.Exception e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception e4) {
            e4.printStackTrace();
        }
    }

    public static byte[] getRgb565ByteArray(android.graphics.Bitmap bitmap, int width, int height) {
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        android.util.Log.i(TAG, "图片大小 -> width: " + width2 + ", height: " + height2);
        if (width2 != width || height2 != height) {
            bitmap = scaleBitmap(bitmap, width, height);
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int i = 4;
        byte[] bArr = new byte[(array.length / 2) + 4];
        java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) width), 0, bArr, 0, 2);
        java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) height), 0, bArr, 2, 2);
        int length = array.length;
        for (int i2 = 0; i2 < length; i2 += 4) {
            int i3 = (((array[i2] & 255) >>> 3) << 11) | (((array[i2 + 1] & 255) >>> 2) << 5) | ((array[i2 + 2] & 255) >>> 3);
            int i4 = i + 1;
            bArr[i] = (byte) (i3 & 255);
            i = i4 + 1;
            bArr[i4] = (byte) ((i3 >> 8) & 255);
        }
        return bArr;
    }

    public static byte[] getRgb565ByteArrayAlbum(android.graphics.Bitmap bitmap, int width, int height) {
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        android.util.Log.i(TAG, "图片大小 -> width: " + width2 + ", height: " + height2);
        if (width2 != width || height2 != height) {
            float f = (width * 1.0f) / width2;
            float f2 = (height * 1.0f) / height2;
            if (f < f2) {
                bitmap = scaleBitmap(bitmap, f);
            } else {
                bitmap = scaleBitmap(bitmap, f2);
            }
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int i = 4;
        byte[] bArr = new byte[(array.length / 2) + 4];
        java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) width), 0, bArr, 0, 2);
        java.lang.System.arraycopy(com.qcwireless.qc_utils.bytes.DataTransferUtils.shortToBytes((short) height), 0, bArr, 2, 2);
        int length = array.length;
        for (int i2 = 0; i2 < length; i2 += 4) {
            int i3 = (((array[i2] & 255) >>> 3) << 11) | (((array[i2 + 1] & 255) >>> 2) << 5) | ((array[i2 + 2] & 255) >>> 3);
            int i4 = i + 1;
            bArr[i] = (byte) ((i3 >> 8) & 255);
            i = i4 + 1;
            bArr[i4] = (byte) (i3 & 255);
        }
        return bArr;
    }

    public static android.graphics.Bitmap scaleBitmap(android.graphics.Bitmap bitmap, int width, int height) {
        if (bitmap == null) {
            return null;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(width / width2, height / height2);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true);
        android.util.Log.i(TAG, "放大后图片大小-> width: " + createBitmap.getWidth() + ", height: " + createBitmap.getHeight());
        return createBitmap;
    }

    public static android.graphics.Bitmap scaleAndCropImage(java.lang.String imagePath, int targetWidth, int targetHeight) {
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile(imagePath);
        float width = decodeFile.getWidth();
        float height = decodeFile.getHeight();
        float max = java.lang.Math.max(targetWidth / width, targetHeight / height);
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeFile, (int) (width * max), (int) (height * max), true);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(targetWidth, targetHeight, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        int width2 = (createScaledBitmap.getWidth() - targetWidth) / 2;
        int height2 = (createScaledBitmap.getHeight() - targetHeight) / 2;
        canvas.drawBitmap(createScaledBitmap, new android.graphics.Rect(width2, height2, width2 + targetWidth, height2 + targetHeight), new android.graphics.Rect(0, 0, targetWidth, targetHeight), (android.graphics.Paint) null);
        return createBitmap;
    }

    public static int calculateInSampleSize(int bitmapWidth, int bitmapHeight, int reqWidth, int reqHeight) {
        if (bitmapWidth <= reqHeight && bitmapHeight <= reqWidth) {
            return 1;
        }
        int round = java.lang.Math.round(bitmapWidth / reqHeight);
        int round2 = java.lang.Math.round(bitmapHeight / reqWidth);
        return round < round2 ? round : round2;
    }

    public static android.graphics.Bitmap scaleBitmap(android.graphics.Bitmap origin, float ratio) {
        if (origin == null) {
            return null;
        }
        int width = origin.getWidth();
        int height = origin.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preScale(ratio, ratio);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(origin, 0, 0, width, height, matrix, false);
        android.util.Log.i(TAG, "处理后图片大小-> width: " + createBitmap.getWidth() + ", height: " + createBitmap.getHeight());
        if (createBitmap.equals(origin)) {
            return createBitmap;
        }
        origin.recycle();
        return createBitmap;
    }

    public static android.graphics.Bitmap getTransparentBitmap(android.graphics.Bitmap sourceImg, int number) {
        int width = sourceImg.getWidth() * sourceImg.getHeight();
        int[] iArr = new int[width];
        if (number > 90) {
            number = 90;
        }
        sourceImg.getPixels(iArr, 0, sourceImg.getWidth(), 0, 0, sourceImg.getWidth(), sourceImg.getHeight());
        for (int i = 0; i < width; i++) {
            iArr[i] = (((iArr[i] & 255) * number) / 100) | (iArr[i] & (-16777216)) | (((((iArr[i] >> 8) & 255) * number) / 100) << 8) | (((((iArr[i] >> 16) & 255) * number) / 100) << 16);
        }
        return android.graphics.Bitmap.createBitmap(iArr, sourceImg.getWidth(), sourceImg.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
    }
}
