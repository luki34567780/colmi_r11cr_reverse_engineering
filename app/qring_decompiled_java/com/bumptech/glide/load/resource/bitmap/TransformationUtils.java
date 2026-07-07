package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public final class TransformationUtils {
    private static final java.util.concurrent.locks.Lock BITMAP_DRAWABLE_LOCK;
    private static final android.graphics.Paint CIRCLE_CROP_BITMAP_PAINT;
    private static final int CIRCLE_CROP_PAINT_FLAGS = 7;
    private static final java.util.Set<java.lang.String> MODELS_REQUIRING_BITMAP_LOCK;
    public static final int PAINT_FLAGS = 6;
    private static final java.lang.String TAG = "TransformationUtils";
    private static final android.graphics.Paint DEFAULT_PAINT = new android.graphics.Paint(6);
    private static final android.graphics.Paint CIRCLE_CROP_SHAPE_PAINT = new android.graphics.Paint(7);

    private interface DrawRoundedCornerFn {
        void drawRoundedCorners(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.RectF rectF);
    }

    public static int getExifOrientationDegrees(int i) {
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

    public static boolean isExifOrientationRequired(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        MODELS_REQUIRING_BITMAP_LOCK = hashSet;
        BITMAP_DRAWABLE_LOCK = hashSet.contains(android.os.Build.MODEL) ? new java.util.concurrent.locks.ReentrantLock() : new com.bumptech.glide.load.resource.bitmap.TransformationUtils.NoLock();
        android.graphics.Paint paint = new android.graphics.Paint(7);
        CIRCLE_CROP_BITMAP_PAINT = paint;
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
    }

    private TransformationUtils() {
    }

    public static java.util.concurrent.locks.Lock getBitmapDrawableLock() {
        return BITMAP_DRAWABLE_LOCK;
    }

    public static android.graphics.Bitmap centerCrop(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        android.graphics.Bitmap bitmap2 = bitmapPool.get(i, i2, getNonNullConfig(bitmap));
        setAlpha(bitmap, bitmap2);
        applyMatrix(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    public static android.graphics.Bitmap fitCenter(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (android.util.Log.isLoggable(TAG, 2)) {
                android.util.Log.v(TAG, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = java.lang.Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = java.lang.Math.round(bitmap.getWidth() * min);
        int round2 = java.lang.Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (android.util.Log.isLoggable(TAG, 2)) {
                android.util.Log.v(TAG, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        android.graphics.Bitmap bitmap2 = bitmapPool.get((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), getNonNullConfig(bitmap));
        setAlpha(bitmap, bitmap2);
        if (android.util.Log.isLoggable(TAG, 2)) {
            android.util.Log.v(TAG, "request: " + i + "x" + i2);
            android.util.Log.v(TAG, "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            android.util.Log.v(TAG, "toReuse: " + bitmap2.getWidth() + "x" + bitmap2.getHeight());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            android.util.Log.v(TAG, sb.toString());
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(min, min);
        applyMatrix(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    public static android.graphics.Bitmap centerInside(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            if (android.util.Log.isLoggable(TAG, 2)) {
                android.util.Log.v(TAG, "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (android.util.Log.isLoggable(TAG, 2)) {
            android.util.Log.v(TAG, "requested target size too big for input, fit centering instead");
        }
        return fitCenter(bitmapPool, bitmap, i, i2);
    }

    public static void setAlpha(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static android.graphics.Bitmap rotateImage(android.graphics.Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        try {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setRotate(i);
            return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (java.lang.Exception e) {
            if (!android.util.Log.isLoggable(TAG, 6)) {
                return bitmap;
            }
            android.util.Log.e(TAG, "Exception when trying to orient image", e);
            return bitmap;
        }
    }

    public static android.graphics.Bitmap rotateImageExif(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, int i) {
        if (!isExifOrientationRequired(i)) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        initializeMatrixForRotation(i, matrix);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        android.graphics.Bitmap bitmap2 = bitmapPool.get(java.lang.Math.round(rectF.width()), java.lang.Math.round(rectF.height()), getNonNullConfig(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        applyMatrix(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    public static android.graphics.Bitmap circleCrop(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, int i, int i2) {
        int min = java.lang.Math.min(i, i2);
        float f = min;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = java.lang.Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        android.graphics.RectF rectF = new android.graphics.RectF(f5, f6, f3 + f5, f4 + f6);
        android.graphics.Bitmap alphaSafeBitmap = getAlphaSafeBitmap(bitmapPool, bitmap);
        android.graphics.Bitmap bitmap2 = bitmapPool.get(min, min, getAlphaSafeConfig(bitmap));
        bitmap2.setHasAlpha(true);
        java.util.concurrent.locks.Lock lock = BITMAP_DRAWABLE_LOCK;
        lock.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
            canvas.drawCircle(f2, f2, f2, CIRCLE_CROP_SHAPE_PAINT);
            canvas.drawBitmap(alphaSafeBitmap, (android.graphics.Rect) null, rectF, CIRCLE_CROP_BITMAP_PAINT);
            clear(canvas);
            lock.unlock();
            if (!alphaSafeBitmap.equals(bitmap)) {
                bitmapPool.put(alphaSafeBitmap);
            }
            return bitmap2;
        } catch (java.lang.Throwable th) {
            BITMAP_DRAWABLE_LOCK.unlock();
            throw th;
        }
    }

    private static android.graphics.Bitmap getAlphaSafeBitmap(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap.Config alphaSafeConfig = getAlphaSafeConfig(bitmap);
        if (alphaSafeConfig.equals(bitmap.getConfig())) {
            return bitmap;
        }
        android.graphics.Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), alphaSafeConfig);
        new android.graphics.Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        return bitmap2;
    }

    private static android.graphics.Bitmap.Config getAlphaSafeConfig(android.graphics.Bitmap bitmap) {
        if (android.os.Build.VERSION.SDK_INT >= 26 && android.graphics.Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return android.graphics.Bitmap.Config.RGBA_F16;
        }
        return android.graphics.Bitmap.Config.ARGB_8888;
    }

    @java.lang.Deprecated
    public static android.graphics.Bitmap roundedCorners(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, int i, int i2, int i3) {
        return roundedCorners(bitmapPool, bitmap, i3);
    }

    public static android.graphics.Bitmap roundedCorners(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, final int i) {
        com.bumptech.glide.util.Preconditions.checkArgument(i > 0, "roundingRadius must be greater than 0.");
        return roundedCorners(bitmapPool, bitmap, new com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn() { // from class: com.bumptech.glide.load.resource.bitmap.TransformationUtils.1
            @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn
            public void drawRoundedCorners(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.RectF rectF) {
                int i2 = i;
                canvas.drawRoundRect(rectF, i2, i2, paint);
            }
        });
    }

    public static android.graphics.Bitmap roundedCorners(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, final float f, final float f2, final float f3, final float f4) {
        return roundedCorners(bitmapPool, bitmap, new com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn() { // from class: com.bumptech.glide.load.resource.bitmap.TransformationUtils.2
            @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn
            public void drawRoundedCorners(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.RectF rectF) {
                android.graphics.Path path = new android.graphics.Path();
                float f5 = f;
                float f6 = f2;
                float f7 = f3;
                float f8 = f4;
                path.addRoundRect(rectF, new float[]{f5, f5, f6, f6, f7, f7, f8, f8}, android.graphics.Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        });
    }

    private static android.graphics.Bitmap roundedCorners(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, com.bumptech.glide.load.resource.bitmap.TransformationUtils.DrawRoundedCornerFn drawRoundedCornerFn) {
        android.graphics.Bitmap.Config alphaSafeConfig = getAlphaSafeConfig(bitmap);
        android.graphics.Bitmap alphaSafeBitmap = getAlphaSafeBitmap(bitmapPool, bitmap);
        android.graphics.Bitmap bitmap2 = bitmapPool.get(alphaSafeBitmap.getWidth(), alphaSafeBitmap.getHeight(), alphaSafeConfig);
        bitmap2.setHasAlpha(true);
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(alphaSafeBitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        java.util.concurrent.locks.Lock lock = BITMAP_DRAWABLE_LOCK;
        lock.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            drawRoundedCornerFn.drawRoundedCorners(canvas, paint, rectF);
            clear(canvas);
            lock.unlock();
            if (!alphaSafeBitmap.equals(bitmap)) {
                bitmapPool.put(alphaSafeBitmap);
            }
            return bitmap2;
        } catch (java.lang.Throwable th) {
            BITMAP_DRAWABLE_LOCK.unlock();
            throw th;
        }
    }

    private static void clear(android.graphics.Canvas canvas) {
        canvas.setBitmap(null);
    }

    private static android.graphics.Bitmap.Config getNonNullConfig(android.graphics.Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : android.graphics.Bitmap.Config.ARGB_8888;
    }

    private static void applyMatrix(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Matrix matrix) {
        java.util.concurrent.locks.Lock lock = BITMAP_DRAWABLE_LOCK;
        lock.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, DEFAULT_PAINT);
            clear(canvas);
            lock.unlock();
        } catch (java.lang.Throwable th) {
            BITMAP_DRAWABLE_LOCK.unlock();
            throw th;
        }
    }

    static void initializeMatrixForRotation(int i, android.graphics.Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    private static final class NoLock implements java.util.concurrent.locks.Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        NoLock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public java.util.concurrent.locks.Condition newCondition() {
            throw new java.lang.UnsupportedOperationException("Should not be called");
        }
    }
}
