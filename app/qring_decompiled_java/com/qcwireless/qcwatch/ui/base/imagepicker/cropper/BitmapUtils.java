package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
final class BitmapUtils {
    private static int mMaxTextureSize;
    static android.util.Pair<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> mStateBitmap;
    static final android.graphics.Rect EMPTY_RECT = new android.graphics.Rect();
    static final android.graphics.RectF EMPTY_RECT_F = new android.graphics.RectF();
    static final android.graphics.RectF RECT = new android.graphics.RectF();
    static final float[] POINTS = new float[6];
    static final float[] POINTS2 = new float[6];

    BitmapUtils() {
    }

    static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RotateBitmapResult rotateBitmapByExif(android.graphics.Bitmap bitmap, android.content.Context context, android.net.Uri uri) {
        try {
            java.io.File fileFromUri = getFileFromUri(context, uri);
            if (fileFromUri.exists()) {
                return rotateBitmapByExif(bitmap, new android.media.ExifInterface(fileFromUri.getAbsolutePath()));
            }
        } catch (java.lang.Exception unused) {
        }
        return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RotateBitmapResult(bitmap, 0);
    }

    static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RotateBitmapResult rotateBitmapByExif(android.graphics.Bitmap bitmap, android.media.ExifInterface exif) {
        int attributeInt = exif.getAttributeInt("Orientation", 1);
        return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RotateBitmapResult(bitmap, attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180);
    }

    static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled decodeSampledBitmap(android.content.Context context, android.net.Uri uri, int reqWidth, int reqHeight) {
        try {
            android.content.ContentResolver contentResolver = context.getContentResolver();
            android.graphics.BitmapFactory.Options decodeImageForOption = decodeImageForOption(contentResolver, uri);
            decodeImageForOption.inSampleSize = java.lang.Math.max(calculateInSampleSizeByReqestedSize(decodeImageForOption.outWidth, decodeImageForOption.outHeight, reqWidth, reqHeight), calculateInSampleSizeByMaxTextureSize(decodeImageForOption.outWidth, decodeImageForOption.outHeight));
            return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled(decodeImage(contentResolver, uri, decodeImageForOption), decodeImageForOption.inSampleSize);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
        }
    }

    static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled cropBitmapObjectHandleOOM(android.graphics.Bitmap bitmap, float[] points, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY) {
        int i = 1;
        do {
            try {
                return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled(cropBitmapObjectWithScale(bitmap, points, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY, 1.0f / i), i);
            } catch (java.lang.OutOfMemoryError e) {
                i *= 2;
            }
        } while (i <= 8);
        throw e;
    }

    private static android.graphics.Bitmap cropBitmapObjectWithScale(android.graphics.Bitmap bitmap, float[] points, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, float scale) {
        android.graphics.Rect rectFromPoints = getRectFromPoints(points, bitmap.getWidth(), bitmap.getHeight(), fixAspectRatio, aspectRatioX, aspectRatioY);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(scale, scale);
        matrix.postRotate(degreesRotated, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, rectFromPoints.left, rectFromPoints.top, rectFromPoints.width(), rectFromPoints.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return degreesRotated % 90 != 0 ? cropForRotatedImage(createBitmap, points, rectFromPoints, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY) : createBitmap;
    }

    static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled cropBitmap(android.content.Context context, android.net.Uri loadedImageUri, float[] points, int degreesRotated, int orgWidth, int orgHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int reqWidth, int reqHeight) {
        int i = 1;
        do {
            try {
                return cropBitmap(context, loadedImageUri, points, degreesRotated, orgWidth, orgHeight, fixAspectRatio, aspectRatioX, aspectRatioY, reqWidth, reqHeight, i);
            } catch (java.lang.OutOfMemoryError e) {
                i *= 2;
            }
        } while (i <= 16);
        throw new java.lang.RuntimeException("Failed to handle OOM by sampling (" + i + "): " + loadedImageUri + "\r\n" + e.getMessage(), e);
    }

    static float getRectLeft(float[] points) {
        return java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(points[0], points[2]), points[4]), points[6]);
    }

    static float getRectTop(float[] points) {
        return java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(points[1], points[3]), points[5]), points[7]);
    }

    static float getRectRight(float[] points) {
        return java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(points[0], points[2]), points[4]), points[6]);
    }

    static float getRectBottom(float[] points) {
        return java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(points[1], points[3]), points[5]), points[7]);
    }

    static float getRectWidth(float[] points) {
        return getRectRight(points) - getRectLeft(points);
    }

    static float getRectHeight(float[] points) {
        return getRectBottom(points) - getRectTop(points);
    }

    static float getRectCenterX(float[] points) {
        return (getRectRight(points) + getRectLeft(points)) / 2.0f;
    }

    static float getRectCenterY(float[] points) {
        return (getRectBottom(points) + getRectTop(points)) / 2.0f;
    }

    static android.graphics.Rect getRectFromPoints(float[] points, int imageWidth, int imageHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY) {
        android.graphics.Rect rect = new android.graphics.Rect(java.lang.Math.round(java.lang.Math.max(0.0f, getRectLeft(points))), java.lang.Math.round(java.lang.Math.max(0.0f, getRectTop(points))), java.lang.Math.round(java.lang.Math.min(imageWidth, getRectRight(points))), java.lang.Math.round(java.lang.Math.min(imageHeight, getRectBottom(points))));
        if (fixAspectRatio) {
            fixRectForAspectRatio(rect, aspectRatioX, aspectRatioY);
        }
        return rect;
    }

    private static void fixRectForAspectRatio(android.graphics.Rect rect, int aspectRatioX, int aspectRatioY) {
        if (aspectRatioX != aspectRatioY || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    static void writeBitmapToUri(android.content.Context context, android.graphics.Bitmap bitmap, android.net.Uri uri, android.graphics.Bitmap.CompressFormat compressFormat, int compressQuality) throws java.io.FileNotFoundException {
        java.io.OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, compressQuality, outputStream);
        } finally {
            closeSafe(outputStream);
        }
    }

    static android.graphics.Bitmap resizeBitmap(android.graphics.Bitmap bitmap, int reqWidth, int reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions options) {
        if (reqWidth > 0 && reqHeight > 0) {
            try {
                if (options == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.RESIZE_FIT || options == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.RESIZE_INSIDE || options == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                    android.graphics.Bitmap bitmap2 = null;
                    if (options == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                        bitmap2 = android.graphics.Bitmap.createScaledBitmap(bitmap, reqWidth, reqHeight, false);
                    } else {
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float max = java.lang.Math.max(width / reqWidth, height / reqHeight);
                        if (max > 1.0f || options == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.RESIZE_FIT) {
                            bitmap2 = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                        }
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (java.lang.Exception e) {
                android.util.Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e);
            }
        }
        return bitmap;
    }

    private static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled cropBitmap(android.content.Context context, android.net.Uri loadedImageUri, float[] points, int degreesRotated, int orgWidth, int orgHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int reqWidth, int reqHeight, int sampleMulti) {
        android.graphics.Rect rectFromPoints = getRectFromPoints(points, orgWidth, orgHeight, fixAspectRatio, aspectRatioX, aspectRatioY);
        int width = reqWidth > 0 ? reqWidth : rectFromPoints.width();
        int height = reqHeight > 0 ? reqHeight : rectFromPoints.height();
        android.graphics.Bitmap bitmap = null;
        int i = 1;
        try {
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled decodeSampledBitmapRegion = decodeSampledBitmapRegion(context, loadedImageUri, rectFromPoints, width, height, sampleMulti);
            bitmap = decodeSampledBitmapRegion.bitmap;
            i = decodeSampledBitmapRegion.sampleSize;
        } catch (java.lang.Exception unused) {
        }
        if (bitmap != null) {
            try {
                android.graphics.Bitmap rotateBitmapInt = rotateBitmapInt(bitmap, degreesRotated);
                try {
                    if (degreesRotated % 90 != 0) {
                        rotateBitmapInt = cropForRotatedImage(rotateBitmapInt, points, rectFromPoints, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY);
                    }
                    return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled(rotateBitmapInt, i);
                } catch (java.lang.OutOfMemoryError e) {
                    e = e;
                    bitmap = rotateBitmapInt;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    throw e;
                }
            } catch (java.lang.OutOfMemoryError e2) {
                e = e2;
            }
        } else {
            return cropBitmap(context, loadedImageUri, points, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY, sampleMulti, rectFromPoints, width, height);
        }
    }

    private static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled cropBitmap(android.content.Context context, android.net.Uri loadedImageUri, float[] points, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int sampleMulti, android.graphics.Rect rect, int width, int height) {
        android.graphics.Bitmap bitmap = null;
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            int calculateInSampleSizeByReqestedSize = calculateInSampleSizeByReqestedSize(rect.width(), rect.height(), width, height) * sampleMulti;
            options.inSampleSize = calculateInSampleSizeByReqestedSize;
            android.graphics.Bitmap decodeImage = decodeImage(context.getContentResolver(), loadedImageUri, options);
            if (decodeImage != null) {
                try {
                    int length = points.length;
                    float[] fArr = new float[length];
                    java.lang.System.arraycopy(points, 0, fArr, 0, points.length);
                    for (int i = 0; i < length; i++) {
                        fArr[i] = fArr[i] / options.inSampleSize;
                    }
                    bitmap = cropBitmapObjectWithScale(decodeImage, fArr, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY, 1.0f);
                    if (bitmap != decodeImage) {
                        decodeImage.recycle();
                    }
                } catch (java.lang.Throwable th) {
                    if (decodeImage != null) {
                        decodeImage.recycle();
                    }
                    throw th;
                }
            }
            return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled(bitmap, calculateInSampleSizeByReqestedSize);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Failed to load sampled bitmap: " + loadedImageUri + "\r\n" + e.getMessage(), e);
        } catch (java.lang.OutOfMemoryError e2) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw e2;
        }
    }

    private static android.graphics.BitmapFactory.Options decodeImageForOption(android.content.ContentResolver resolver, android.net.Uri uri) throws java.io.FileNotFoundException {
        java.io.InputStream inputStream;
        try {
            inputStream = resolver.openInputStream(uri);
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                android.graphics.BitmapFactory.decodeStream(inputStream, EMPTY_RECT, options);
                options.inJustDecodeBounds = false;
                closeSafe(inputStream);
                return options;
            } catch (java.lang.Throwable th) {
                th = th;
                closeSafe(inputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static android.graphics.Bitmap decodeImage(android.content.ContentResolver resolver, android.net.Uri uri, android.graphics.BitmapFactory.Options options) throws java.io.FileNotFoundException {
        do {
            java.io.InputStream inputStream = null;
            try {
                try {
                    inputStream = resolver.openInputStream(uri);
                    return android.graphics.BitmapFactory.decodeStream(inputStream, EMPTY_RECT, options);
                } catch (java.lang.OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    closeSafe(inputStream);
                }
            } finally {
                closeSafe(inputStream);
            }
        } while (options.inSampleSize <= 512);
        throw new java.lang.RuntimeException("Failed to decode image: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled decodeSampledBitmapRegion(android.content.Context r4, android.net.Uri r5, android.graphics.Rect r6, int r7, int r8, int r9) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            int r2 = r6.width()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            int r3 = r6.height()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            int r7 = calculateInSampleSizeByReqestedSize(r2, r3, r7, r8)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            int r9 = r9 * r7
            r1.inSampleSize = r9     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r7 = 0
            android.graphics.BitmapRegionDecoder r7 = android.graphics.BitmapRegionDecoder.newInstance(r4, r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L5a
        L23:
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils$BitmapSampled r8 = new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils$BitmapSampled     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            android.graphics.Bitmap r9 = r7.decodeRegion(r6, r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            int r2 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            r8.<init>(r9, r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L3b
            closeSafe(r4)
            if (r7 == 0) goto L36
            r7.recycle()
        L36:
            return r8
        L37:
            r5 = move-exception
            goto L58
        L39:
            r6 = move-exception
            goto L5c
        L3b:
            int r8 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            int r8 = r8 * 2
            r1.inSampleSize = r8     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            int r8 = r1.inSampleSize     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r9 = 512(0x200, float:7.17E-43)
            if (r8 <= r9) goto L23
            closeSafe(r4)
            if (r7 == 0) goto L4f
            r7.recycle()
        L4f:
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils$BitmapSampled r4 = new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils$BitmapSampled
            r5 = 1
            r4.<init>(r0, r5)
            return r4
        L56:
            r5 = move-exception
            r7 = r0
        L58:
            r0 = r4
            goto L87
        L5a:
            r6 = move-exception
            r7 = r0
        L5c:
            r0 = r4
            goto L63
        L5e:
            r5 = move-exception
            r7 = r0
            goto L87
        L61:
            r6 = move-exception
            r7 = r0
        L63:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r8.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r9 = "Failed to load sampled bitmap: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L86
            r8.append(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "\r\n"
            r8.append(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r6.getMessage()     // Catch: java.lang.Throwable -> L86
            r8.append(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L86
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L86
            throw r4     // Catch: java.lang.Throwable -> L86
        L86:
            r5 = move-exception
        L87:
            closeSafe(r0)
            if (r7 == 0) goto L8f
            r7.recycle()
        L8f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.decodeSampledBitmapRegion(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils$BitmapSampled");
    }

    private static android.graphics.Bitmap cropForRotatedImage(android.graphics.Bitmap bitmap, float[] points, android.graphics.Rect rect, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY) {
        int i;
        int i2;
        int i3;
        if (degreesRotated % 90 == 0) {
            return bitmap;
        }
        double radians = java.lang.Math.toRadians(degreesRotated);
        int i4 = (degreesRotated < 90 || (degreesRotated > 180 && degreesRotated < 270)) ? rect.left : rect.right;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= points.length) {
                i = 0;
                i2 = 0;
                i3 = 0;
                break;
            }
            if (points[i6] >= i4 - 1 && points[i6] <= i4 + 1) {
                int i7 = i6 + 1;
                i5 = (int) java.lang.Math.abs(java.lang.Math.sin(radians) * (rect.bottom - points[i7]));
                i2 = (int) java.lang.Math.abs(java.lang.Math.cos(radians) * (points[i7] - rect.top));
                i3 = (int) java.lang.Math.abs((points[i7] - rect.top) / java.lang.Math.sin(radians));
                i = (int) java.lang.Math.abs((rect.bottom - points[i7]) / java.lang.Math.cos(radians));
                break;
            }
            i6 += 2;
        }
        rect.set(i5, i2, i3 + i5, i + i2);
        if (fixAspectRatio) {
            fixRectForAspectRatio(rect, aspectRatioX, aspectRatioY);
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    private static int calculateInSampleSizeByReqestedSize(int width, int height, int reqWidth, int reqHeight) {
        int i = 1;
        if (height > reqHeight || width > reqWidth) {
            while ((height / 2) / i > reqHeight && (width / 2) / i > reqWidth) {
                i *= 2;
            }
        }
        return i;
    }

    private static int calculateInSampleSizeByMaxTextureSize(int width, int height) {
        if (mMaxTextureSize == 0) {
            mMaxTextureSize = getMaxTextureSize();
        }
        int i = 1;
        if (mMaxTextureSize > 0) {
            while (true) {
                int i2 = height / i;
                int i3 = mMaxTextureSize;
                if (i2 <= i3 && width / i <= i3) {
                    break;
                }
                i *= 2;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.File getFileFromUri(android.content.Context r9, android.net.Uri r10) {
        /*
            java.lang.String r0 = "_data"
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r10.getPath()
            r1.<init>(r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L12
            return r1
        L12:
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L43
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L43
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L43
            if (r2 == 0) goto L36
            int r9 = r2.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L43
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L43
            java.lang.String r9 = r2.getString(r9)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L43
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L43
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L43
            r1 = r10
        L36:
            if (r2 == 0) goto L47
        L38:
            r2.close()
            goto L47
        L3c:
            r9 = move-exception
            if (r2 == 0) goto L42
            r2.close()
        L42:
            throw r9
        L43:
            if (r2 == 0) goto L47
            goto L38
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getFileFromUri(android.content.Context, android.net.Uri):java.io.File");
    }

    private static android.graphics.Bitmap rotateBitmapInt(android.graphics.Bitmap bitmap, int degrees) {
        if (degrees <= 0) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(degrees);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    private static int getMaxTextureSize() {
        try {
            javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[iArr[0]];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
            int[] iArr2 = new int[1];
            int i = 0;
            for (int i2 = 0; i2 < iArr[0]; i2++) {
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12332, iArr2);
                if (i < iArr2[0]) {
                    i = iArr2[0];
                }
            }
            egl10.eglTerminate(eglGetDisplay);
            return java.lang.Math.max(i, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.GAMING_MODE_EQ);
        } catch (java.lang.Exception unused) {
            return com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.GAMING_MODE_EQ;
        }
    }

    private static void closeSafe(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    static final class BitmapSampled {
        public final android.graphics.Bitmap bitmap;
        final int sampleSize;

        BitmapSampled(android.graphics.Bitmap bitmap, int sampleSize) {
            this.bitmap = bitmap;
            this.sampleSize = sampleSize;
        }
    }

    static final class RotateBitmapResult {
        public final android.graphics.Bitmap bitmap;
        final int degrees;

        RotateBitmapResult(android.graphics.Bitmap bitmap, int degrees) {
            this.bitmap = bitmap;
            this.degrees = degrees;
        }
    }
}
