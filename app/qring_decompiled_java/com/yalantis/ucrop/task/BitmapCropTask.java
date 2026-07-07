package com.yalantis.ucrop.task;

/* loaded from: classes3.dex */
public class BitmapCropTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Throwable> {
    private static final java.lang.String CONTENT_SCHEME = "content";
    private static final int MIN_CROPPED_HEIGHT = 1;
    private static final java.lang.String TAG = "BitmapCropTask";
    private int cropOffsetX;
    private int cropOffsetY;
    private final android.graphics.Bitmap.CompressFormat mCompressFormat;
    private final int mCompressQuality;
    private final java.lang.ref.WeakReference<android.content.Context> mContext;
    private final com.yalantis.ucrop.callback.BitmapCropCallback mCropCallback;
    private final android.graphics.RectF mCropRect;
    private int mCroppedImageHeight;
    private int mCroppedImageWidth;
    private float mCurrentAngle;
    private final android.graphics.RectF mCurrentImageRect;
    private float mCurrentScale;
    private final com.yalantis.ucrop.model.ExifInfo mExifInfo;
    private final java.lang.String mImageInputPath;
    private final android.net.Uri mImageInputUri;
    private final java.lang.String mImageOutputPath;
    private final android.net.Uri mImageOutputUri;
    private final int mMaxResultImageSizeX;
    private final int mMaxResultImageSizeY;
    private android.graphics.Bitmap mViewBitmap;

    public BitmapCropTask(android.content.Context context, android.graphics.Bitmap bitmap, com.yalantis.ucrop.model.ImageState imageState, com.yalantis.ucrop.model.CropParameters cropParameters, com.yalantis.ucrop.callback.BitmapCropCallback bitmapCropCallback) {
        this.mContext = new java.lang.ref.WeakReference<>(context);
        this.mViewBitmap = bitmap;
        this.mCropRect = imageState.getCropRect();
        this.mCurrentImageRect = imageState.getCurrentImageRect();
        this.mCurrentScale = imageState.getCurrentScale();
        this.mCurrentAngle = imageState.getCurrentAngle();
        this.mMaxResultImageSizeX = cropParameters.getMaxResultImageSizeX();
        this.mMaxResultImageSizeY = cropParameters.getMaxResultImageSizeY();
        this.mCompressFormat = cropParameters.getCompressFormat();
        this.mCompressQuality = cropParameters.getCompressQuality();
        this.mImageInputPath = cropParameters.getImageInputPath();
        this.mImageOutputPath = cropParameters.getImageOutputPath();
        this.mImageInputUri = cropParameters.getContentImageInputUri();
        this.mImageOutputUri = cropParameters.getContentImageOutputUri();
        this.mExifInfo = cropParameters.getExifInfo();
        this.mCropCallback = bitmapCropCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public java.lang.Throwable doInBackground(java.lang.Void... voidArr) {
        android.graphics.Bitmap bitmap = this.mViewBitmap;
        if (bitmap == null) {
            return new java.lang.NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new java.lang.NullPointerException("ViewBitmap is recycled");
        }
        if (this.mCurrentImageRect.isEmpty()) {
            return new java.lang.NullPointerException("CurrentImageRect is empty");
        }
        if (this.mImageOutputUri == null) {
            return new java.lang.NullPointerException("ImageOutputUri is null");
        }
        try {
            crop();
            this.mViewBitmap = null;
            return null;
        } catch (java.lang.Throwable th) {
            return th;
        }
    }

    private boolean crop() throws java.io.IOException {
        android.content.Context context = this.mContext.get();
        if (context == null) {
            return false;
        }
        if (this.mMaxResultImageSizeX > 0 && this.mMaxResultImageSizeY > 0) {
            float width = this.mCropRect.width() / this.mCurrentScale;
            float height = this.mCropRect.height() / this.mCurrentScale;
            int i = this.mMaxResultImageSizeX;
            if (width > i || height > this.mMaxResultImageSizeY) {
                float min = java.lang.Math.min(i / width, this.mMaxResultImageSizeY / height);
                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(this.mViewBitmap, java.lang.Math.round(r3.getWidth() * min), java.lang.Math.round(this.mViewBitmap.getHeight() * min), false);
                android.graphics.Bitmap bitmap = this.mViewBitmap;
                if (bitmap != createScaledBitmap) {
                    bitmap.recycle();
                }
                this.mViewBitmap = createScaledBitmap;
                this.mCurrentScale /= min;
            }
        }
        if (this.mCurrentAngle != 0.0f) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setRotate(this.mCurrentAngle, this.mViewBitmap.getWidth() / 2, this.mViewBitmap.getHeight() / 2);
            android.graphics.Bitmap bitmap2 = this.mViewBitmap;
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.mViewBitmap.getHeight(), matrix, true);
            android.graphics.Bitmap bitmap3 = this.mViewBitmap;
            if (bitmap3 != createBitmap) {
                bitmap3.recycle();
            }
            this.mViewBitmap = createBitmap;
        }
        this.cropOffsetX = java.lang.Math.round((this.mCropRect.left - this.mCurrentImageRect.left) / this.mCurrentScale);
        this.cropOffsetY = java.lang.Math.round((this.mCropRect.top - this.mCurrentImageRect.top) / this.mCurrentScale);
        this.mCroppedImageWidth = java.lang.Math.round(this.mCropRect.width() / this.mCurrentScale);
        int round = java.lang.Math.round(this.mCropRect.height() / this.mCurrentScale);
        this.mCroppedImageHeight = round;
        boolean shouldCrop = shouldCrop(this.mCroppedImageWidth, round);
        android.util.Log.i(TAG, "Should crop: " + shouldCrop);
        if (shouldCrop) {
            checkValidityCropBounds();
            saveImage(android.graphics.Bitmap.createBitmap(this.mViewBitmap, this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight));
            if (!this.mCompressFormat.equals(android.graphics.Bitmap.CompressFormat.JPEG)) {
                return true;
            }
            copyExifForOutputFile(context);
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && com.yalantis.ucrop.util.FileUtils.isContent(this.mImageInputPath)) {
            com.yalantis.ucrop.util.FileUtils.writeFileFromIS(context.getContentResolver().openInputStream(android.net.Uri.parse(this.mImageInputPath)), new java.io.FileOutputStream(this.mImageOutputPath));
        } else {
            com.yalantis.ucrop.util.FileUtils.copyFile(this.mImageInputPath, this.mImageOutputPath);
        }
        return false;
    }

    private void checkValidityCropBounds() {
        if (this.cropOffsetX < 0) {
            this.cropOffsetX = 0;
            this.mCroppedImageWidth = this.mViewBitmap.getWidth();
        }
        if (this.cropOffsetY < 0) {
            this.cropOffsetY = 0;
            this.mCroppedImageHeight = this.mViewBitmap.getHeight();
        }
    }

    private void copyExifForOutputFile(android.content.Context context) throws java.io.IOException {
        boolean hasContentScheme = com.yalantis.ucrop.util.BitmapLoadUtils.hasContentScheme(this.mImageInputUri);
        boolean hasContentScheme2 = com.yalantis.ucrop.util.BitmapLoadUtils.hasContentScheme(this.mImageOutputUri);
        if (hasContentScheme && hasContentScheme2) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                com.yalantis.ucrop.util.ImageHeaderParser.copyExif(context, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageInputUri, this.mImageOutputUri);
                return;
            } else {
                android.util.Log.e(TAG, "It is not possible to write exif info into file represented by \"content\" Uri if Android < LOLLIPOP");
                return;
            }
        }
        if (hasContentScheme) {
            com.yalantis.ucrop.util.ImageHeaderParser.copyExif(context, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageInputUri, this.mImageOutputPath);
            return;
        }
        if (hasContentScheme2) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                com.yalantis.ucrop.util.ImageHeaderParser.copyExif(context, new androidx.exifinterface.media.ExifInterface(this.mImageInputPath), this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageOutputUri);
                return;
            } else {
                android.util.Log.e(TAG, "It is not possible to write exif info into file represented by \"content\" Uri if Android < LOLLIPOP");
                return;
            }
        }
        com.yalantis.ucrop.util.ImageHeaderParser.copyExif(new androidx.exifinterface.media.ExifInterface(this.mImageInputPath), this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageOutputPath);
    }

    private void saveImage(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        android.content.Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        java.io.OutputStream outputStream = null;
        try {
            java.io.OutputStream openOutputStream = context.getContentResolver().openOutputStream(this.mImageOutputUri);
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    bitmap.compress(this.mCompressFormat, this.mCompressQuality, byteArrayOutputStream);
                    openOutputStream.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    com.yalantis.ucrop.util.BitmapLoadUtils.close(openOutputStream);
                } catch (java.io.IOException e) {
                    e = e;
                    outputStream = openOutputStream;
                    try {
                        android.util.Log.e(TAG, e.getLocalizedMessage());
                        com.yalantis.ucrop.util.BitmapLoadUtils.close(outputStream);
                        com.yalantis.ucrop.util.BitmapLoadUtils.close(byteArrayOutputStream);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        com.yalantis.ucrop.util.BitmapLoadUtils.close(outputStream);
                        com.yalantis.ucrop.util.BitmapLoadUtils.close(byteArrayOutputStream);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    outputStream = openOutputStream;
                    com.yalantis.ucrop.util.BitmapLoadUtils.close(outputStream);
                    com.yalantis.ucrop.util.BitmapLoadUtils.close(byteArrayOutputStream);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
                byteArrayOutputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            byteArrayOutputStream = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        com.yalantis.ucrop.util.BitmapLoadUtils.close(byteArrayOutputStream);
    }

    private boolean shouldCrop(int i, int i2) {
        int round = java.lang.Math.round(java.lang.Math.max(i, i2) / 1000.0f) + 1;
        if (this.mMaxResultImageSizeX > 0 && this.mMaxResultImageSizeY > 0) {
            return true;
        }
        float f = round;
        return java.lang.Math.abs(this.mCropRect.left - this.mCurrentImageRect.left) > f || java.lang.Math.abs(this.mCropRect.top - this.mCurrentImageRect.top) > f || java.lang.Math.abs(this.mCropRect.bottom - this.mCurrentImageRect.bottom) > f || java.lang.Math.abs(this.mCropRect.right - this.mCurrentImageRect.right) > f || this.mCurrentAngle != 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Throwable th) {
        android.net.Uri fromFile;
        com.yalantis.ucrop.callback.BitmapCropCallback bitmapCropCallback = this.mCropCallback;
        if (bitmapCropCallback != null) {
            if (th == null) {
                if (com.yalantis.ucrop.util.BitmapLoadUtils.hasContentScheme(this.mImageOutputUri)) {
                    fromFile = this.mImageOutputUri;
                } else {
                    fromFile = android.net.Uri.fromFile(new java.io.File(this.mImageOutputPath));
                }
                this.mCropCallback.onBitmapCropped(fromFile, this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight);
                return;
            }
            bitmapCropCallback.onCropFailure(th);
        }
    }
}
