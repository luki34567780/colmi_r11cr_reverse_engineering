package com.yalantis.ucrop.util;

/* loaded from: classes3.dex */
public class BitmapLoadUtils {
    private static final java.lang.String CONTENT_SCHEME = "content";
    private static final int MAX_BITMAP_SIZE = 104857600;
    private static final java.lang.String TAG = "BitmapLoadUtils";

    public static int exifToDegrees(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int exifToTranslation(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    public static void decodeBitmapInBackground(android.content.Context context, android.net.Uri uri, android.net.Uri uri2, int i, int i2, com.yalantis.ucrop.callback.BitmapLoadCallback bitmapLoadCallback) {
        new com.yalantis.ucrop.task.BitmapLoadTask(context, uri, uri2, i, i2, bitmapLoadCallback).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
    }

    public static android.graphics.Bitmap transformBitmap(android.graphics.Bitmap bitmap, android.graphics.Matrix matrix) {
        try {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(createBitmap) ? createBitmap : bitmap;
        } catch (java.lang.OutOfMemoryError e) {
            android.util.Log.e(TAG, "transformBitmap: ", e);
            return bitmap;
        }
    }

    @java.lang.Deprecated
    public static int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            while (true) {
                if (i3 / i5 <= i2 && i4 / i5 <= i) {
                    break;
                }
                i5 *= 2;
            }
        }
        return i5;
    }

    public static int computeSize(int i, int i2) {
        if (i % 2 == 1) {
            i++;
        }
        if (i2 % 2 == 1) {
            i2++;
        }
        int max = java.lang.Math.max(i, i2);
        float min = java.lang.Math.min(i, i2) / max;
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

    public static int[] getMaxImageSize(android.content.Context context, android.net.Uri uri) {
        if (com.yalantis.ucrop.util.FileUtils.isHasHttp(uri.toString())) {
            return new int[]{0, 0};
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            android.graphics.BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
            options.inSampleSize = computeSize(options.outWidth, options.outHeight);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        options.inJustDecodeBounds = false;
        android.graphics.Bitmap bitmap = null;
        boolean z = false;
        while (!z) {
            try {
                java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    bitmap = android.graphics.BitmapFactory.decodeStream(openInputStream, null, options);
                    close(openInputStream);
                    if (!checkSize(bitmap, options)) {
                        z = true;
                    }
                } catch (java.lang.Throwable th) {
                    close(openInputStream);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                android.util.Log.e(TAG, "doInBackground: ImageDecoder.createSource: ", e2);
            } catch (java.lang.OutOfMemoryError e3) {
                android.util.Log.e(TAG, "doInBackground: BitmapFactory.decodeFileDescriptor: ", e3);
                options.inSampleSize *= 2;
            }
        }
        return bitmap == null ? new int[]{0, 0} : new int[]{bitmap.getWidth(), bitmap.getHeight()};
    }

    public static boolean checkSize(android.graphics.Bitmap bitmap, android.graphics.BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= getTotalMemory()) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    public static long getTotalMemory() {
        long j = java.lang.Runtime.getRuntime().totalMemory();
        if (j > 104857600) {
            return 104857600L;
        }
        return j;
    }

    public static int getExifOrientation(android.content.Context context, android.net.Uri uri) {
        int i = 0;
        try {
            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            i = new com.yalantis.ucrop.util.ImageHeaderParser(openInputStream).getOrientation();
            close(openInputStream);
            return i;
        } catch (java.io.IOException e) {
            android.util.Log.e(TAG, "getExifOrientation: " + uri.toString(), e);
            return i;
        }
    }

    public static int calculateMaxBitmapSize(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        android.graphics.Point point = new android.graphics.Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int sqrt = (int) java.lang.Math.sqrt(java.lang.Math.pow(point.x, 2.0d) + java.lang.Math.pow(point.y, 2.0d));
        android.graphics.Canvas canvas = new android.graphics.Canvas();
        int min = java.lang.Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = java.lang.Math.min(sqrt, min);
        }
        int maxTextureSize = com.yalantis.ucrop.util.EglUtils.getMaxTextureSize();
        if (maxTextureSize > 0) {
            sqrt = java.lang.Math.min(sqrt, maxTextureSize);
        }
        android.util.Log.d(TAG, "maxBitmapSize: " + sqrt);
        return sqrt;
    }

    public static void close(java.io.Closeable closeable) {
        if (closeable == null || !(closeable instanceof java.io.Closeable)) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    public static boolean hasContentScheme(android.net.Uri uri) {
        return uri != null && CONTENT_SCHEME.equals(uri.getScheme());
    }
}
