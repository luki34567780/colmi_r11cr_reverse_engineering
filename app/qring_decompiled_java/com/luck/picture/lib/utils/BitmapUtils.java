package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class BitmapUtils {
    private static final int ARGB_8888_MEMORY_BYTE = 4;
    private static final int MAX_BITMAP_SIZE = 104857600;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void rotateImage(android.content.Context r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.utils.BitmapUtils.rotateImage(android.content.Context, java.lang.String):void");
    }

    public static android.graphics.Bitmap rotatingImage(android.graphics.Bitmap bitmap, int i) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(i);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private static void saveBitmapFile(android.graphics.Bitmap bitmap, java.io.FileOutputStream fileOutputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            } catch (java.lang.Exception e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
            com.luck.picture.lib.utils.PictureFileUtils.close(fileOutputStream);
            com.luck.picture.lib.utils.PictureFileUtils.close(byteArrayOutputStream);
        } catch (java.lang.Exception e2) {
            e = e2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            com.luck.picture.lib.utils.PictureFileUtils.close(fileOutputStream);
            com.luck.picture.lib.utils.PictureFileUtils.close(byteArrayOutputStream2);
        } catch (java.lang.Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            com.luck.picture.lib.utils.PictureFileUtils.close(fileOutputStream);
            com.luck.picture.lib.utils.PictureFileUtils.close(byteArrayOutputStream2);
            throw th;
        }
    }

    public static int readPictureDegree(android.content.Context context, java.lang.String str) {
        androidx.exifinterface.media.ExifInterface exifInterface;
        int i;
        java.io.InputStream inputStream = null;
        try {
            if (com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
                inputStream = com.luck.picture.lib.basic.PictureContentResolver.openInputStream(context, android.net.Uri.parse(str));
                exifInterface = new androidx.exifinterface.media.ExifInterface(inputStream);
            } else {
                exifInterface = new androidx.exifinterface.media.ExifInterface(str);
            }
            int attributeInt = exifInterface.getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 6) {
                i = 90;
            } else {
                if (attributeInt != 8) {
                    return 0;
                }
                i = 270;
            }
            return i;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            com.luck.picture.lib.utils.PictureFileUtils.close(inputStream);
        }
    }

    public static int[] getMaxImageSize(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return new int[]{-1, -1};
        }
        int computeSize = computeSize(i, i2);
        long totalMemory = getTotalMemory();
        int i3 = -1;
        int i4 = -1;
        boolean z = false;
        while (!z) {
            i3 = i / computeSize;
            i4 = i2 / computeSize;
            if (i3 * i4 * 4 > totalMemory) {
                computeSize *= 2;
            } else {
                z = true;
            }
        }
        return new int[]{i3, i4};
    }

    public static long getTotalMemory() {
        long j = java.lang.Runtime.getRuntime().totalMemory();
        if (j > 104857600) {
            return 104857600L;
        }
        return j;
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
                int i3 = max / 1280;
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
            return max / 1280;
        }
        return 4;
    }
}
