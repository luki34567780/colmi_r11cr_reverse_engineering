package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
final class BitmapLoadingWorkerTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask.Result> {
    private final android.content.Context mContext;
    private final java.lang.ref.WeakReference<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView> mCropImageViewReference;
    private final int mHeight;
    private final android.net.Uri mUri;
    private final int mWidth;

    public BitmapLoadingWorkerTask(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView cropImageView, android.net.Uri uri) {
        this.mUri = uri;
        this.mCropImageViewReference = new java.lang.ref.WeakReference<>(cropImageView);
        this.mContext = cropImageView.getContext();
        double d = cropImageView.getResources().getDisplayMetrics().density > 1.0f ? 1.0f / r5.density : 1.0d;
        this.mWidth = (int) (r5.widthPixels * d);
        this.mHeight = (int) (r5.heightPixels * d);
    }

    public android.net.Uri getUri() {
        return this.mUri;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask.Result doInBackground(java.lang.Void... params) {
        try {
            if (isCancelled()) {
                return null;
            }
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.BitmapSampled decodeSampledBitmap = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.decodeSampledBitmap(this.mContext, this.mUri, this.mWidth, this.mHeight);
            if (isCancelled()) {
                return null;
            }
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RotateBitmapResult rotateBitmapByExif = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.rotateBitmapByExif(decodeSampledBitmap.bitmap, this.mContext, this.mUri);
            return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask.Result(this.mUri, rotateBitmapByExif.bitmap, decodeSampledBitmap.sampleSize, rotateBitmapByExif.degrees);
        } catch (java.lang.Exception e) {
            return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask.Result(this.mUri, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask.Result result) {
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView cropImageView;
        if (result != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.mCropImageViewReference.get()) != null) {
                z = true;
                cropImageView.onSetImageUriAsyncComplete(result);
            }
            if (z || result.bitmap == null) {
                return;
            }
            result.bitmap.recycle();
        }
    }

    public static final class Result {
        public final android.graphics.Bitmap bitmap;
        public final int degreesRotated;
        public final java.lang.Exception error;
        public final int loadSampleSize;
        public final android.net.Uri uri;

        Result(android.net.Uri uri, android.graphics.Bitmap bitmap, int loadSampleSize, int degreesRotated) {
            this.uri = uri;
            this.bitmap = bitmap;
            this.loadSampleSize = loadSampleSize;
            this.degreesRotated = degreesRotated;
            this.error = null;
        }

        Result(android.net.Uri uri, java.lang.Exception error) {
            this.uri = uri;
            this.bitmap = null;
            this.loadSampleSize = 0;
            this.degreesRotated = 0;
            this.error = error;
        }
    }
}
