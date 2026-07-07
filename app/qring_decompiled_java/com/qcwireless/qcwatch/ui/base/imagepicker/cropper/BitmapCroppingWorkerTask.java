package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
final class BitmapCroppingWorkerTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask.Result> {
    private final int mAspectRatioX;
    private final int mAspectRatioY;
    private final android.graphics.Bitmap mBitmap;
    private final android.content.Context mContext;
    private final java.lang.ref.WeakReference<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView> mCropImageViewReference;
    private final float[] mCropPoints;
    private final int mDegreesRotated;
    private final boolean mFixAspectRatio;
    private final int mOrgHeight;
    private final int mOrgWidth;
    private final int mReqHeight;
    private final com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions mReqSizeOptions;
    private final int mReqWidth;
    private final android.graphics.Bitmap.CompressFormat mSaveCompressFormat;
    private final int mSaveCompressQuality;
    private final android.net.Uri mSaveUri;
    private final android.net.Uri mUri;

    BitmapCroppingWorkerTask(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView cropImageView, android.graphics.Bitmap bitmap, float[] cropPoints, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int reqWidth, int reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions options, android.net.Uri saveUri, android.graphics.Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality) {
        this.mCropImageViewReference = new java.lang.ref.WeakReference<>(cropImageView);
        this.mContext = cropImageView.getContext();
        this.mBitmap = bitmap;
        this.mCropPoints = cropPoints;
        this.mUri = null;
        this.mDegreesRotated = degreesRotated;
        this.mFixAspectRatio = fixAspectRatio;
        this.mAspectRatioX = aspectRatioX;
        this.mAspectRatioY = aspectRatioY;
        this.mReqWidth = reqWidth;
        this.mReqHeight = reqHeight;
        this.mReqSizeOptions = options;
        this.mSaveUri = saveUri;
        this.mSaveCompressFormat = saveCompressFormat;
        this.mSaveCompressQuality = saveCompressQuality;
        this.mOrgWidth = 0;
        this.mOrgHeight = 0;
    }

    BitmapCroppingWorkerTask(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView cropImageView, android.net.Uri uri, float[] cropPoints, int degreesRotated, int orgWidth, int orgHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int reqWidth, int reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions options, android.net.Uri saveUri, android.graphics.Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality) {
        this.mCropImageViewReference = new java.lang.ref.WeakReference<>(cropImageView);
        this.mContext = cropImageView.getContext();
        this.mUri = uri;
        this.mCropPoints = cropPoints;
        this.mDegreesRotated = degreesRotated;
        this.mFixAspectRatio = fixAspectRatio;
        this.mAspectRatioX = aspectRatioX;
        this.mAspectRatioY = aspectRatioY;
        this.mOrgWidth = orgWidth;
        this.mOrgHeight = orgHeight;
        this.mReqWidth = reqWidth;
        this.mReqHeight = reqHeight;
        this.mReqSizeOptions = options;
        this.mSaveUri = saveUri;
        this.mSaveCompressFormat = saveCompressFormat;
        this.mSaveCompressQuality = saveCompressQuality;
        this.mBitmap = null;
    }

    public android.net.Uri getUri() {
        return this.mUri;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask.Result doInBackground(java.lang.Void... params) {
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled cropBitmapObjectHandleOOM;
        try {
            if (isCancelled()) {
                return null;
            }
            android.net.Uri uri = this.mUri;
            if (uri != null) {
                cropBitmapObjectHandleOOM = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.cropBitmap(this.mContext, uri, this.mCropPoints, this.mDegreesRotated, this.mOrgWidth, this.mOrgHeight, this.mFixAspectRatio, this.mAspectRatioX, this.mAspectRatioY, this.mReqWidth, this.mReqHeight);
            } else {
                android.graphics.Bitmap bitmap = this.mBitmap;
                if (bitmap != null) {
                    cropBitmapObjectHandleOOM = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.cropBitmapObjectHandleOOM(bitmap, this.mCropPoints, this.mDegreesRotated, this.mFixAspectRatio, this.mAspectRatioX, this.mAspectRatioY);
                } else {
                    return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask.Result((android.graphics.Bitmap) null, 1);
                }
            }
            android.graphics.Bitmap resizeBitmap = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.resizeBitmap(cropBitmapObjectHandleOOM.bitmap, this.mReqWidth, this.mReqHeight, this.mReqSizeOptions);
            android.net.Uri uri2 = this.mSaveUri;
            if (uri2 == null) {
                return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask.Result(resizeBitmap, cropBitmapObjectHandleOOM.sampleSize);
            }
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.writeBitmapToUri(this.mContext, resizeBitmap, uri2, this.mSaveCompressFormat, this.mSaveCompressQuality);
            if (resizeBitmap != null) {
                resizeBitmap.recycle();
            }
            return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask.Result(this.mSaveUri, cropBitmapObjectHandleOOM.sampleSize);
        } catch (java.lang.Exception e) {
            return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask.Result(e, this.mSaveUri != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask.Result result) {
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView cropImageView;
        if (result != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.mCropImageViewReference.get()) != null) {
                z = true;
                cropImageView.onImageCroppingAsyncComplete(result);
            }
            if (z || result.bitmap == null) {
                return;
            }
            result.bitmap.recycle();
        }
    }

    static final class Result {
        public final android.graphics.Bitmap bitmap;
        final java.lang.Exception error;
        final boolean isSave;
        final int sampleSize;
        public final android.net.Uri uri;

        Result(android.graphics.Bitmap bitmap, int sampleSize) {
            this.bitmap = bitmap;
            this.uri = null;
            this.error = null;
            this.isSave = false;
            this.sampleSize = sampleSize;
        }

        Result(android.net.Uri uri, int sampleSize) {
            this.bitmap = null;
            this.uri = uri;
            this.error = null;
            this.isSave = true;
            this.sampleSize = sampleSize;
        }

        Result(java.lang.Exception error, boolean isSave) {
            this.bitmap = null;
            this.uri = null;
            this.error = error;
            this.isSave = isSave;
            this.sampleSize = 1;
        }
    }
}
