package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
public class CropImageView extends android.widget.FrameLayout {
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageAnimation mAnimation;
    private boolean mAutoZoomEnabled;
    private android.graphics.Bitmap mBitmap;
    private java.lang.ref.WeakReference<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask> mBitmapCroppingWorkerTask;
    private java.lang.ref.WeakReference<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask> mBitmapLoadingWorkerTask;
    private final com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView mCropOverlayView;
    private int mDegreesRotated;
    private final android.graphics.Matrix mImageInverseMatrix;
    private final android.graphics.Matrix mImageMatrix;
    private final float[] mImagePoints;
    private int mImageResource;
    private final android.widget.ImageView mImageView;
    private int mLayoutHeight;
    private int mLayoutWidth;
    private android.net.Uri mLoadedImageUri;
    private int mLoadedSampleSize;
    private int mMaxZoom;
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnCropImageCompleteListener mOnCropImageCompleteListener;

    @java.lang.Deprecated
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnGetCroppedImageCompleteListener mOnGetCroppedImageCompleteListener;

    @java.lang.Deprecated
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnSaveCroppedImageCompleteListener mOnSaveCroppedImageCompleteListener;
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnSetImageUriCompleteListener mOnSetImageUriCompleteListener;
    private final android.widget.ProgressBar mProgressBar;
    private android.graphics.RectF mRestoreCropWindowRect;
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType mScaleType;
    private boolean mShowCropOverlay;
    private boolean mShowProgressBar;
    private boolean mSizeChanged;
    private float mZoom;
    private float mZoomOffsetX;
    private float mZoomOffsetY;

    public enum CropShape {
        RECTANGLE,
        OVAL
    }

    public enum Guidelines {
        OFF,
        ON_TOUCH,
        ON
    }

    public interface OnCropImageCompleteListener {
        void onCropImageComplete(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView view, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropResult result);
    }

    @java.lang.Deprecated
    public interface OnGetCroppedImageCompleteListener {
        void onGetCroppedImageComplete(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView view, android.graphics.Bitmap bitmap, java.lang.Exception error);
    }

    @java.lang.Deprecated
    public interface OnSaveCroppedImageCompleteListener {
        void onSaveCroppedImageComplete(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView view, android.net.Uri uri, java.lang.Exception error);
    }

    public interface OnSetImageUriCompleteListener {
        void onSetImageUriComplete(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView view, android.net.Uri uri, java.lang.Exception error);
    }

    public enum RequestSizeOptions {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    public enum ScaleType {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(android.content.Context context) {
        this(context, null);
    }

    public CropImageView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mImageMatrix = new android.graphics.Matrix();
        this.mImageInverseMatrix = new android.graphics.Matrix();
        this.mImagePoints = new float[8];
        this.mShowCropOverlay = true;
        this.mShowProgressBar = true;
        this.mAutoZoomEnabled = true;
        this.mLoadedSampleSize = 1;
        this.mZoom = 1.0f;
        android.content.Intent intent = context instanceof android.app.Activity ? ((android.app.Activity) context).getIntent() : null;
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions cropImageOptions = intent != null ? (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions) intent.getParcelableExtra(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImage.CROP_IMAGE_EXTRA_OPTIONS) : null;
        if (cropImageOptions == null) {
            cropImageOptions = new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions();
            if (attrs != null) {
                android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.CropImageView, 0, 0);
                try {
                    cropImageOptions.fixAspectRatio = obtainStyledAttributes.getBoolean(10, cropImageOptions.fixAspectRatio);
                    cropImageOptions.aspectRatioX = obtainStyledAttributes.getInteger(0, cropImageOptions.aspectRatioX);
                    cropImageOptions.aspectRatioY = obtainStyledAttributes.getInteger(1, cropImageOptions.aspectRatioY);
                    cropImageOptions.scaleType = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType.values()[obtainStyledAttributes.getInt(23, cropImageOptions.scaleType.ordinal())];
                    cropImageOptions.autoZoomEnabled = obtainStyledAttributes.getBoolean(2, cropImageOptions.autoZoomEnabled);
                    cropImageOptions.multiTouchEnabled = obtainStyledAttributes.getBoolean(22, cropImageOptions.multiTouchEnabled);
                    cropImageOptions.maxZoom = obtainStyledAttributes.getInteger(17, cropImageOptions.maxZoom);
                    cropImageOptions.cropShape = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.values()[obtainStyledAttributes.getInt(24, cropImageOptions.cropShape.ordinal())];
                    cropImageOptions.guidelines = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines.values()[obtainStyledAttributes.getInt(11, cropImageOptions.guidelines.ordinal())];
                    cropImageOptions.snapRadius = obtainStyledAttributes.getDimension(27, cropImageOptions.snapRadius);
                    cropImageOptions.touchRadius = obtainStyledAttributes.getDimension(28, cropImageOptions.touchRadius);
                    cropImageOptions.initialCropWindowPaddingRatio = obtainStyledAttributes.getFloat(14, cropImageOptions.initialCropWindowPaddingRatio);
                    cropImageOptions.borderLineThickness = obtainStyledAttributes.getDimension(9, cropImageOptions.borderLineThickness);
                    cropImageOptions.borderLineColor = obtainStyledAttributes.getInteger(8, cropImageOptions.borderLineColor);
                    cropImageOptions.borderCornerThickness = obtainStyledAttributes.getDimension(7, cropImageOptions.borderCornerThickness);
                    cropImageOptions.borderCornerOffset = obtainStyledAttributes.getDimension(6, cropImageOptions.borderCornerOffset);
                    cropImageOptions.borderCornerLength = obtainStyledAttributes.getDimension(5, cropImageOptions.borderCornerLength);
                    cropImageOptions.borderCornerColor = obtainStyledAttributes.getInteger(4, cropImageOptions.borderCornerColor);
                    cropImageOptions.guidelinesThickness = obtainStyledAttributes.getDimension(13, cropImageOptions.guidelinesThickness);
                    cropImageOptions.guidelinesColor = obtainStyledAttributes.getInteger(12, cropImageOptions.guidelinesColor);
                    cropImageOptions.backgroundColor = obtainStyledAttributes.getInteger(3, cropImageOptions.backgroundColor);
                    cropImageOptions.showCropOverlay = obtainStyledAttributes.getBoolean(25, this.mShowCropOverlay);
                    cropImageOptions.showProgressBar = obtainStyledAttributes.getBoolean(26, this.mShowProgressBar);
                    cropImageOptions.borderCornerThickness = obtainStyledAttributes.getDimension(7, cropImageOptions.borderCornerThickness);
                    cropImageOptions.minCropWindowWidth = (int) obtainStyledAttributes.getDimension(21, cropImageOptions.minCropWindowWidth);
                    cropImageOptions.minCropWindowHeight = (int) obtainStyledAttributes.getDimension(20, cropImageOptions.minCropWindowHeight);
                    cropImageOptions.minCropResultWidth = (int) obtainStyledAttributes.getFloat(19, cropImageOptions.minCropResultWidth);
                    cropImageOptions.minCropResultHeight = (int) obtainStyledAttributes.getFloat(18, cropImageOptions.minCropResultHeight);
                    cropImageOptions.maxCropResultWidth = (int) obtainStyledAttributes.getFloat(16, cropImageOptions.maxCropResultWidth);
                    cropImageOptions.maxCropResultHeight = (int) obtainStyledAttributes.getFloat(15, cropImageOptions.maxCropResultHeight);
                    if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.hasValue(0) && !obtainStyledAttributes.hasValue(10)) {
                        cropImageOptions.fixAspectRatio = true;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        cropImageOptions.validate();
        this.mScaleType = cropImageOptions.scaleType;
        this.mAutoZoomEnabled = cropImageOptions.autoZoomEnabled;
        this.mMaxZoom = cropImageOptions.maxZoom;
        this.mShowCropOverlay = cropImageOptions.showCropOverlay;
        this.mShowProgressBar = cropImageOptions.showProgressBar;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.crop_image_view, (android.view.ViewGroup) this, true);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.qcwireless.qcwatch.R.id.ImageView_image);
        this.mImageView = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView cropOverlayView = (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView) inflate.findViewById(com.qcwireless.qcwatch.R.id.CropOverlayView);
        this.mCropOverlayView = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.CropWindowChangeListener() { // from class: com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.1
            @Override // com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.CropWindowChangeListener
            public void onCropWindowChanged(boolean inProgress) {
                com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.this.handleCropWindowChanged(inProgress, true);
            }
        });
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        this.mProgressBar = (android.widget.ProgressBar) inflate.findViewById(com.qcwireless.qcwatch.R.id.CropProgressBar);
        setProgressBarVisibility();
    }

    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public void setScaleType(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType scaleType) {
        if (scaleType != this.mScaleType) {
            this.mScaleType = scaleType;
            this.mZoom = 1.0f;
            this.mZoomOffsetY = 0.0f;
            this.mZoomOffsetX = 0.0f;
            this.mCropOverlayView.resetCropOverlayView();
            requestLayout();
        }
    }

    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape getCropShape() {
        return this.mCropOverlayView.getCropShape();
    }

    public void setCropShape(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape cropShape) {
        this.mCropOverlayView.setCropShape(cropShape);
    }

    public boolean isAutoZoomEnabled() {
        return this.mAutoZoomEnabled;
    }

    public void setAutoZoomEnabled(boolean autoZoomEnabled) {
        if (this.mAutoZoomEnabled != autoZoomEnabled) {
            this.mAutoZoomEnabled = autoZoomEnabled;
            handleCropWindowChanged(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean multiTouchEnabled) {
        if (this.mCropOverlayView.setMultiTouchEnabled(multiTouchEnabled)) {
            handleCropWindowChanged(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public int getMaxZoom() {
        return this.mMaxZoom;
    }

    public void setMaxZoom(int maxZoom) {
        if (this.mMaxZoom == maxZoom || maxZoom <= 0) {
            return;
        }
        this.mMaxZoom = maxZoom;
        handleCropWindowChanged(false, false);
        this.mCropOverlayView.invalidate();
    }

    public void setMinCropResultSize(int minCropResultWidth, int minCropResultHeight) {
        this.mCropOverlayView.setMinCropResultSize(minCropResultWidth, minCropResultHeight);
    }

    public void setMaxCropResultSize(int maxCropResultWidth, int maxCropResultHeight) {
        this.mCropOverlayView.setMaxCropResultSize(maxCropResultWidth, maxCropResultHeight);
    }

    public int getRotatedDegrees() {
        return this.mDegreesRotated;
    }

    public void setRotatedDegrees(int degrees) {
        int i = this.mDegreesRotated;
        if (i != degrees) {
            rotateImage(degrees - i);
        }
    }

    public boolean isFixAspectRatio() {
        return this.mCropOverlayView.isFixAspectRatio();
    }

    public void setFixedAspectRatio(boolean fixAspectRatio) {
        this.mCropOverlayView.setFixedAspectRatio(fixAspectRatio);
    }

    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines getGuidelines() {
        return this.mCropOverlayView.getGuidelines();
    }

    public void setGuidelines(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines guidelines) {
        this.mCropOverlayView.setGuidelines(guidelines);
    }

    public android.util.Pair<java.lang.Integer, java.lang.Integer> getAspectRatio() {
        return new android.util.Pair<>(java.lang.Integer.valueOf(this.mCropOverlayView.getAspectRatioX()), java.lang.Integer.valueOf(this.mCropOverlayView.getAspectRatioY()));
    }

    public void setAspectRatio(int aspectRatioX, int aspectRatioY) {
        this.mCropOverlayView.setAspectRatioX(aspectRatioX);
        this.mCropOverlayView.setAspectRatioY(aspectRatioY);
        setFixedAspectRatio(true);
    }

    public void clearAspectRatio() {
        this.mCropOverlayView.setAspectRatioX(1);
        this.mCropOverlayView.setAspectRatioY(1);
        setFixedAspectRatio(false);
    }

    public void setSnapRadius(float snapRadius) {
        if (snapRadius >= 0.0f) {
            this.mCropOverlayView.setSnapRadius(snapRadius);
        }
    }

    public boolean isShowProgressBar() {
        return this.mShowProgressBar;
    }

    public void setShowProgressBar(boolean showProgressBar) {
        if (this.mShowProgressBar != showProgressBar) {
            this.mShowProgressBar = showProgressBar;
            setProgressBarVisibility();
        }
    }

    public boolean isShowCropOverlay() {
        return this.mShowCropOverlay;
    }

    public void setShowCropOverlay(boolean showCropOverlay) {
        if (this.mShowCropOverlay != showCropOverlay) {
            this.mShowCropOverlay = showCropOverlay;
            setCropOverlayVisibility();
        }
    }

    public int getImageResource() {
        return this.mImageResource;
    }

    public android.net.Uri getImageUri() {
        return this.mLoadedImageUri;
    }

    public android.graphics.Rect getCropRect() {
        if (this.mBitmap == null) {
            return null;
        }
        return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectFromPoints(getCropPoints(), this.mLoadedSampleSize * this.mBitmap.getWidth(), this.mLoadedSampleSize * this.mBitmap.getHeight(), this.mCropOverlayView.isFixAspectRatio(), this.mCropOverlayView.getAspectRatioX(), this.mCropOverlayView.getAspectRatioY());
    }

    public float[] getCropPoints() {
        android.graphics.RectF cropWindowRect = this.mCropOverlayView.getCropWindowRect();
        float[] fArr = new float[8];
        fArr[0] = cropWindowRect.left;
        fArr[1] = cropWindowRect.top;
        fArr[2] = cropWindowRect.right;
        fArr[3] = cropWindowRect.top;
        fArr[4] = cropWindowRect.right;
        fArr[5] = cropWindowRect.bottom;
        fArr[6] = cropWindowRect.left;
        fArr[7] = cropWindowRect.bottom;
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapPoints(fArr);
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * this.mLoadedSampleSize;
        }
        return fArr;
    }

    public void setCropRect(android.graphics.Rect rect) {
        this.mCropOverlayView.setInitialCropWindowRect(rect);
    }

    public void resetCropRect() {
        this.mZoom = 1.0f;
        this.mZoomOffsetX = 0.0f;
        this.mZoomOffsetY = 0.0f;
        this.mDegreesRotated = 0;
        applyImageMatrix(getWidth(), getHeight(), false, false);
        this.mCropOverlayView.resetCropWindowRect();
    }

    public android.graphics.Bitmap getCroppedImage() {
        return getCroppedImage(0, 0, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.NONE);
    }

    public android.graphics.Bitmap getCroppedImage(int reqWidth, int reqHeight) {
        return getCroppedImage(reqWidth, reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.RESIZE_INSIDE);
    }

    public android.graphics.Bitmap getCroppedImage(int reqWidth, int reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions options) {
        android.graphics.Bitmap bitmap;
        if (this.mBitmap == null) {
            return null;
        }
        this.mImageView.clearAnimation();
        int i = options != com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.NONE ? reqWidth : 0;
        int i2 = options != com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.NONE ? reqHeight : 0;
        if (this.mLoadedImageUri != null && (this.mLoadedSampleSize > 1 || options == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.SAMPLING)) {
            bitmap = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.cropBitmap(getContext(), this.mLoadedImageUri, getCropPoints(), this.mDegreesRotated, this.mBitmap.getWidth() * this.mLoadedSampleSize, this.mBitmap.getHeight() * this.mLoadedSampleSize, this.mCropOverlayView.isFixAspectRatio(), this.mCropOverlayView.getAspectRatioX(), this.mCropOverlayView.getAspectRatioY(), i, i2).bitmap;
        } else {
            bitmap = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.cropBitmapObjectHandleOOM(this.mBitmap, getCropPoints(), this.mDegreesRotated, this.mCropOverlayView.isFixAspectRatio(), this.mCropOverlayView.getAspectRatioX(), this.mCropOverlayView.getAspectRatioY()).bitmap;
        }
        return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.resizeBitmap(bitmap, i, i2, options);
    }

    public void getCroppedImageAsync() {
        getCroppedImageAsync(0, 0, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.NONE);
    }

    public void getCroppedImageAsync(int reqWidth, int reqHeight) {
        getCroppedImageAsync(reqWidth, reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.RESIZE_INSIDE);
    }

    public void getCroppedImageAsync(int reqWidth, int reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions options) {
        if (this.mOnCropImageCompleteListener == null && this.mOnGetCroppedImageCompleteListener == null) {
            throw new java.lang.IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        startCropWorkerTask(reqWidth, reqHeight, options, null, null, 0);
    }

    public void saveCroppedImageAsync(android.net.Uri saveUri) {
        saveCroppedImageAsync(saveUri, android.graphics.Bitmap.CompressFormat.JPEG, 90, 0, 0, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.NONE);
    }

    public void saveCroppedImageAsync(android.net.Uri saveUri, android.graphics.Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality) {
        saveCroppedImageAsync(saveUri, saveCompressFormat, saveCompressQuality, 0, 0, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.NONE);
    }

    public void saveCroppedImageAsync(android.net.Uri saveUri, android.graphics.Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality, int reqWidth, int reqHeight) {
        saveCroppedImageAsync(saveUri, saveCompressFormat, saveCompressQuality, reqWidth, reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.RESIZE_INSIDE);
    }

    public void saveCroppedImageAsync(android.net.Uri saveUri, android.graphics.Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality, int reqWidth, int reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions options) {
        if (this.mOnCropImageCompleteListener == null && this.mOnSaveCroppedImageCompleteListener == null) {
            throw new java.lang.IllegalArgumentException("mOnCropImageCompleteListener is not set");
        }
        startCropWorkerTask(reqWidth, reqHeight, options, saveUri, saveCompressFormat, saveCompressQuality);
    }

    public void setOnSetImageUriCompleteListener(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnSetImageUriCompleteListener listener) {
        this.mOnSetImageUriCompleteListener = listener;
    }

    public void setOnCropImageCompleteListener(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnCropImageCompleteListener listener) {
        this.mOnCropImageCompleteListener = listener;
    }

    @java.lang.Deprecated
    public void setOnGetCroppedImageCompleteListener(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnGetCroppedImageCompleteListener listener) {
        this.mOnGetCroppedImageCompleteListener = listener;
    }

    @java.lang.Deprecated
    public void setOnSaveCroppedImageCompleteListener(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnSaveCroppedImageCompleteListener listener) {
        this.mOnSaveCroppedImageCompleteListener = listener;
    }

    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.mCropOverlayView.setInitialCropWindowRect(null);
        setBitmap(bitmap);
    }

    public void setImageBitmap(android.graphics.Bitmap bitmap, android.media.ExifInterface exif) {
        if (bitmap != null && exif != null) {
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RotateBitmapResult rotateBitmapByExif = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.rotateBitmapByExif(bitmap, exif);
            android.graphics.Bitmap bitmap2 = rotateBitmapByExif.bitmap;
            this.mDegreesRotated = rotateBitmapByExif.degrees;
            bitmap = bitmap2;
        }
        this.mCropOverlayView.setInitialCropWindowRect(null);
        setBitmap(bitmap);
    }

    public void setImageResource(int resId) {
        if (resId != 0) {
            this.mCropOverlayView.setInitialCropWindowRect(null);
            setBitmap(android.graphics.BitmapFactory.decodeResource(getResources(), resId), resId);
        }
    }

    public void setImageUriAsync(android.net.Uri uri) {
        if (uri != null) {
            java.lang.ref.WeakReference<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask> weakReference = this.mBitmapLoadingWorkerTask;
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask bitmapLoadingWorkerTask = weakReference != null ? weakReference.get() : null;
            if (bitmapLoadingWorkerTask != null) {
                bitmapLoadingWorkerTask.cancel(true);
            }
            clearImageInt();
            this.mCropOverlayView.setInitialCropWindowRect(null);
            java.lang.ref.WeakReference<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask> weakReference2 = new java.lang.ref.WeakReference<>(new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask(this, uri));
            this.mBitmapLoadingWorkerTask = weakReference2;
            weakReference2.get().execute(new java.lang.Void[0]);
            setProgressBarVisibility();
        }
    }

    public void clearImage() {
        clearImageInt();
        this.mCropOverlayView.setInitialCropWindowRect(null);
    }

    public void rotateImage(int degrees) {
        int i;
        if (this.mBitmap != null) {
            if (degrees < 0) {
                i = (degrees % 360) + 360;
            } else {
                i = degrees % 360;
            }
            boolean z = !this.mCropOverlayView.isFixAspectRatio() && ((i > 45 && i < 135) || (i > 215 && i < 305));
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT.set(this.mCropOverlayView.getCropWindowRect());
            android.graphics.RectF rectF = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT;
            float height = (z ? rectF.height() : rectF.width()) / 2.0f;
            float width = (z ? com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT.width() : com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT.height()) / 2.0f;
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS[0] = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT.centerX();
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS[1] = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT.centerY();
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS[2] = 0.0f;
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS[3] = 0.0f;
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS[4] = 1.0f;
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS[5] = 0.0f;
            this.mImageInverseMatrix.mapPoints(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS);
            this.mDegreesRotated = (this.mDegreesRotated + i) % 360;
            applyImageMatrix(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS);
            float sqrt = (float) (this.mZoom / java.lang.Math.sqrt(java.lang.Math.pow(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[4] - com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[2], 2.0d) + java.lang.Math.pow(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[5] - com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[3], 2.0d)));
            this.mZoom = sqrt;
            this.mZoom = java.lang.Math.max(sqrt, 1.0f);
            applyImageMatrix(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS);
            double sqrt2 = java.lang.Math.sqrt(java.lang.Math.pow(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[4] - com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[2], 2.0d) + java.lang.Math.pow(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[5] - com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[3], 2.0d));
            float f = (float) (height * sqrt2);
            float f2 = (float) (width * sqrt2);
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT.set(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[0] - f, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[1] - f2, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[0] + f, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.POINTS2[1] + f2);
            this.mCropOverlayView.resetCropOverlayView();
            this.mCropOverlayView.setCropWindowRect(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT);
            applyImageMatrix(getWidth(), getHeight(), true, false);
            handleCropWindowChanged(false, false);
            this.mCropOverlayView.fixCurrentCropWindowRect();
        }
    }

    void onSetImageUriAsyncComplete(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask.Result result) {
        this.mBitmapLoadingWorkerTask = null;
        setProgressBarVisibility();
        if (result.error == null) {
            setBitmap(result.bitmap, result.uri, result.loadSampleSize, result.degreesRotated);
        }
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnSetImageUriCompleteListener onSetImageUriCompleteListener = this.mOnSetImageUriCompleteListener;
        if (onSetImageUriCompleteListener != null) {
            onSetImageUriCompleteListener.onSetImageUriComplete(this, result.uri, result.error);
        }
    }

    void onImageCroppingAsyncComplete(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask.Result result) {
        this.mBitmapCroppingWorkerTask = null;
        setProgressBarVisibility();
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnCropImageCompleteListener onCropImageCompleteListener = this.mOnCropImageCompleteListener;
        if (onCropImageCompleteListener != null) {
            onCropImageCompleteListener.onCropImageComplete(this, new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropResult(result.bitmap, result.uri, result.error, getCropPoints(), getCropRect(), getRotatedDegrees(), result.sampleSize));
        }
        if (result.isSave) {
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnSaveCroppedImageCompleteListener onSaveCroppedImageCompleteListener = this.mOnSaveCroppedImageCompleteListener;
            if (onSaveCroppedImageCompleteListener != null) {
                onSaveCroppedImageCompleteListener.onSaveCroppedImageComplete(this, result.uri, result.error);
                return;
            }
            return;
        }
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.OnGetCroppedImageCompleteListener onGetCroppedImageCompleteListener = this.mOnGetCroppedImageCompleteListener;
        if (onGetCroppedImageCompleteListener != null) {
            onGetCroppedImageCompleteListener.onGetCroppedImageComplete(this, result.bitmap, result.error);
        }
    }

    private void setBitmap(android.graphics.Bitmap bitmap) {
        setBitmap(bitmap, 0, null, 1, 0);
    }

    private void setBitmap(android.graphics.Bitmap bitmap, int imageResource) {
        setBitmap(bitmap, imageResource, null, 1, 0);
    }

    private void setBitmap(android.graphics.Bitmap bitmap, android.net.Uri imageUri, int loadSampleSize, int degreesRotated) {
        setBitmap(bitmap, 0, imageUri, loadSampleSize, degreesRotated);
    }

    private void setBitmap(android.graphics.Bitmap bitmap, int imageResource, android.net.Uri imageUri, int loadSampleSize, int degreesRotated) {
        android.graphics.Bitmap bitmap2 = this.mBitmap;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.mImageView.clearAnimation();
            clearImageInt();
            this.mBitmap = bitmap;
            this.mImageView.setImageBitmap(bitmap);
            this.mLoadedImageUri = imageUri;
            this.mImageResource = imageResource;
            this.mLoadedSampleSize = loadSampleSize;
            this.mDegreesRotated = degreesRotated;
            applyImageMatrix(getWidth(), getHeight(), true, false);
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.resetCropOverlayView();
                setCropOverlayVisibility();
            }
        }
    }

    private void clearImageInt() {
        android.graphics.Bitmap bitmap = this.mBitmap;
        if (bitmap != null && (this.mImageResource > 0 || this.mLoadedImageUri != null)) {
            bitmap.recycle();
        }
        this.mBitmap = null;
        this.mImageResource = 0;
        this.mLoadedImageUri = null;
        this.mLoadedSampleSize = 1;
        this.mDegreesRotated = 0;
        this.mZoom = 1.0f;
        this.mZoomOffsetX = 0.0f;
        this.mZoomOffsetY = 0.0f;
        this.mImageMatrix.reset();
        this.mImageView.setImageBitmap(null);
        setCropOverlayVisibility();
    }

    public void startCropWorkerTask(int reqWidth, int reqHeight, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions options, android.net.Uri saveUri, android.graphics.Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality) {
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView cropImageView;
        if (this.mBitmap != null) {
            this.mImageView.clearAnimation();
            java.lang.ref.WeakReference<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask> weakReference = this.mBitmapCroppingWorkerTask;
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask bitmapCroppingWorkerTask = weakReference != null ? weakReference.get() : null;
            if (bitmapCroppingWorkerTask != null) {
                bitmapCroppingWorkerTask.cancel(true);
            }
            int i = options != com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.NONE ? reqWidth : 0;
            int i2 = options != com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.NONE ? reqHeight : 0;
            int width = this.mBitmap.getWidth() * this.mLoadedSampleSize;
            int height = this.mBitmap.getHeight();
            int i3 = this.mLoadedSampleSize;
            int i4 = height * i3;
            if (this.mLoadedImageUri != null && (i3 > 1 || options == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.SAMPLING)) {
                this.mBitmapCroppingWorkerTask = new java.lang.ref.WeakReference<>(new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask(this, this.mLoadedImageUri, getCropPoints(), this.mDegreesRotated, width, i4, this.mCropOverlayView.isFixAspectRatio(), this.mCropOverlayView.getAspectRatioX(), this.mCropOverlayView.getAspectRatioY(), i, i2, options, saveUri, saveCompressFormat, saveCompressQuality));
                cropImageView = this;
            } else {
                cropImageView = this;
                cropImageView.mBitmapCroppingWorkerTask = new java.lang.ref.WeakReference<>(new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapCroppingWorkerTask(this, this.mBitmap, getCropPoints(), this.mDegreesRotated, this.mCropOverlayView.isFixAspectRatio(), this.mCropOverlayView.getAspectRatioX(), this.mCropOverlayView.getAspectRatioY(), i, i2, options, saveUri, saveCompressFormat, saveCompressQuality));
            }
            cropImageView.mBitmapCroppingWorkerTask.get().execute(new java.lang.Void[0]);
            setProgressBarVisibility();
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask bitmapLoadingWorkerTask;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", this.mLoadedImageUri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.mImageResource);
        if (this.mLoadedImageUri == null && this.mImageResource < 1) {
            bundle.putParcelable("SET_BITMAP", this.mBitmap);
        }
        if (this.mLoadedImageUri != null && this.mBitmap != null) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.mStateBitmap = new android.util.Pair<>(uuid, new java.lang.ref.WeakReference(this.mBitmap));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        java.lang.ref.WeakReference<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapLoadingWorkerTask> weakReference = this.mBitmapLoadingWorkerTask;
        if (weakReference != null && (bitmapLoadingWorkerTask = weakReference.get()) != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bitmapLoadingWorkerTask.getUri());
        }
        bundle.putInt("LOADED_SAMPLE_SIZE", this.mLoadedSampleSize);
        bundle.putInt("DEGREES_ROTATED", this.mDegreesRotated);
        bundle.putParcelable("INITIAL_CROP_RECT", this.mCropOverlayView.getInitialCropWindowRect());
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT.set(this.mCropOverlayView.getCropWindowRect());
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapRect(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT);
        bundle.putParcelable("CROP_WINDOW_RECT", com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.RECT);
        bundle.putString("CROP_SHAPE", this.mCropOverlayView.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.mAutoZoomEnabled);
        bundle.putInt("CROP_MAX_ZOOM", this.mMaxZoom);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable state) {
        if (state instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) state;
            if (this.mBitmapLoadingWorkerTask == null && this.mLoadedImageUri == null && this.mBitmap == null && this.mImageResource == 0) {
                android.net.Uri uri = (android.net.Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    java.lang.String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        android.graphics.Bitmap bitmap = (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.mStateBitmap == null || !((java.lang.String) com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.mStateBitmap.first).equals(string)) ? null : (android.graphics.Bitmap) ((java.lang.ref.WeakReference) com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.mStateBitmap.second).get();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.mStateBitmap = null;
                            setBitmap(bitmap, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.mLoadedImageUri == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i > 0) {
                        setImageResource(i);
                    } else {
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) bundle.getParcelable("SET_BITMAP");
                        if (bitmap2 != null) {
                            setBitmap(bitmap2);
                        } else {
                            android.net.Uri uri2 = (android.net.Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                            if (uri2 != null) {
                                setImageUriAsync(uri2);
                            }
                        }
                    }
                }
                this.mDegreesRotated = bundle.getInt("DEGREES_ROTATED");
                this.mCropOverlayView.setInitialCropWindowRect((android.graphics.Rect) bundle.getParcelable("INITIAL_CROP_RECT"));
                this.mRestoreCropWindowRect = (android.graphics.RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                this.mCropOverlayView.setCropShape(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.valueOf(bundle.getString("CROP_SHAPE")));
                this.mAutoZoomEnabled = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.mMaxZoom = bundle.getInt("CROP_MAX_ZOOM");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width;
        int i;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int mode = android.view.View.MeasureSpec.getMode(widthMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = android.view.View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = android.view.View.MeasureSpec.getSize(heightMeasureSpec);
        android.graphics.Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            double width2 = size < this.mBitmap.getWidth() ? size / this.mBitmap.getWidth() : Double.POSITIVE_INFINITY;
            double height = size2 < this.mBitmap.getHeight() ? size2 / this.mBitmap.getHeight() : Double.POSITIVE_INFINITY;
            if (width2 == Double.POSITIVE_INFINITY && height == Double.POSITIVE_INFINITY) {
                width = this.mBitmap.getWidth();
                i = this.mBitmap.getHeight();
            } else if (width2 <= height) {
                i = (int) (this.mBitmap.getHeight() * width2);
                width = size;
            } else {
                width = (int) (this.mBitmap.getWidth() * height);
                i = size2;
            }
            int onMeasureSpec = getOnMeasureSpec(mode, size, width);
            int onMeasureSpec2 = getOnMeasureSpec(mode2, size2, i);
            this.mLayoutWidth = onMeasureSpec;
            this.mLayoutHeight = onMeasureSpec2;
            setMeasuredDimension(onMeasureSpec, onMeasureSpec2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (this.mLayoutWidth > 0 && this.mLayoutHeight > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.mLayoutWidth;
            layoutParams.height = this.mLayoutHeight;
            setLayoutParams(layoutParams);
            if (this.mBitmap != null) {
                applyImageMatrix(r - l, b - t, true, false);
                android.graphics.RectF rectF = this.mRestoreCropWindowRect;
                if (rectF != null) {
                    this.mImageMatrix.mapRect(rectF);
                    this.mCropOverlayView.setCropWindowRect(this.mRestoreCropWindowRect);
                    handleCropWindowChanged(false, false);
                    this.mCropOverlayView.fixCurrentCropWindowRect();
                    this.mRestoreCropWindowRect = null;
                    return;
                }
                if (this.mSizeChanged) {
                    this.mSizeChanged = false;
                    handleCropWindowChanged(false, false);
                    return;
                }
                return;
            }
            updateImageBounds(true);
            return;
        }
        updateImageBounds(true);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mSizeChanged = oldw > 0 && oldh > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleCropWindowChanged(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.handleCropWindowChanged(boolean, boolean):void");
    }

    private void applyImageMatrix(float width, float height, boolean center, boolean animate) {
        if (this.mBitmap != null) {
            if (width <= 0.0f || height <= 0.0f) {
                return;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            android.graphics.RectF cropWindowRect = this.mCropOverlayView.getCropWindowRect();
            this.mImageInverseMatrix.mapRect(cropWindowRect);
            this.mImageMatrix.reset();
            this.mImageMatrix.postTranslate((width - this.mBitmap.getWidth()) / 2.0f, (height - this.mBitmap.getHeight()) / 2.0f);
            mapImagePointsByImageMatrix();
            int i = this.mDegreesRotated;
            if (i > 0) {
                this.mImageMatrix.postRotate(i, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectCenterX(this.mImagePoints), com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectCenterY(this.mImagePoints));
                mapImagePointsByImageMatrix();
            }
            float min = java.lang.Math.min(width / com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectWidth(this.mImagePoints), height / com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectHeight(this.mImagePoints));
            if (this.mScaleType == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType.FIT_CENTER || ((this.mScaleType == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.mAutoZoomEnabled))) {
                this.mImageMatrix.postScale(min, min, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectCenterX(this.mImagePoints), com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectCenterY(this.mImagePoints));
                mapImagePointsByImageMatrix();
            }
            android.graphics.Matrix matrix = this.mImageMatrix;
            float f = this.mZoom;
            matrix.postScale(f, f, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectCenterX(this.mImagePoints), com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectCenterY(this.mImagePoints));
            mapImagePointsByImageMatrix();
            this.mImageMatrix.mapRect(cropWindowRect);
            if (center) {
                this.mZoomOffsetX = width > com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectWidth(this.mImagePoints) ? 0.0f : java.lang.Math.max(java.lang.Math.min((width / 2.0f) - cropWindowRect.centerX(), -com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectLeft(this.mImagePoints)), getWidth() - com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectRight(this.mImagePoints)) / this.mZoom;
                this.mZoomOffsetY = height <= com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectHeight(this.mImagePoints) ? java.lang.Math.max(java.lang.Math.min((height / 2.0f) - cropWindowRect.centerY(), -com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectTop(this.mImagePoints)), getHeight() - com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectBottom(this.mImagePoints)) / this.mZoom : 0.0f;
            } else {
                float min2 = java.lang.Math.min(java.lang.Math.max(this.mZoomOffsetX * this.mZoom, -cropWindowRect.left), (-cropWindowRect.right) + width);
                float f2 = this.mZoom;
                this.mZoomOffsetX = min2 / f2;
                this.mZoomOffsetY = java.lang.Math.min(java.lang.Math.max(this.mZoomOffsetY * f2, -cropWindowRect.top), (-cropWindowRect.bottom) + height) / this.mZoom;
            }
            android.graphics.Matrix matrix2 = this.mImageMatrix;
            float f3 = this.mZoomOffsetX;
            float f4 = this.mZoom;
            matrix2.postTranslate(f3 * f4, this.mZoomOffsetY * f4);
            float f5 = this.mZoomOffsetX;
            float f6 = this.mZoom;
            cropWindowRect.offset(f5 * f6, this.mZoomOffsetY * f6);
            this.mCropOverlayView.setCropWindowRect(cropWindowRect);
            mapImagePointsByImageMatrix();
            if (animate) {
                this.mAnimation.setEndState(this.mImagePoints, this.mImageMatrix);
                this.mImageView.startAnimation(this.mAnimation);
            } else {
                this.mImageView.setImageMatrix(this.mImageMatrix);
            }
            updateImageBounds(false);
        }
    }

    private void mapImagePointsByImageMatrix() {
        float[] fArr = this.mImagePoints;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.mBitmap.getWidth();
        float[] fArr2 = this.mImagePoints;
        fArr2[3] = 0.0f;
        fArr2[4] = this.mBitmap.getWidth();
        this.mImagePoints[5] = this.mBitmap.getHeight();
        float[] fArr3 = this.mImagePoints;
        fArr3[6] = 0.0f;
        fArr3[7] = this.mBitmap.getHeight();
        this.mImageMatrix.mapPoints(this.mImagePoints);
    }

    private static int getOnMeasureSpec(int measureSpecMode, int measureSpecSize, int desiredSize) {
        return measureSpecMode == 1073741824 ? measureSpecSize : measureSpecMode == Integer.MIN_VALUE ? java.lang.Math.min(desiredSize, measureSpecSize) : desiredSize;
    }

    private void setCropOverlayVisibility() {
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.mShowCropOverlay || this.mBitmap == null) ? 4 : 0);
        }
    }

    private void setProgressBarVisibility() {
        this.mProgressBar.setVisibility(this.mShowProgressBar && ((this.mBitmap == null && this.mBitmapLoadingWorkerTask != null) || this.mBitmapCroppingWorkerTask != null) ? 0 : 4);
    }

    private void updateImageBounds(boolean clear) {
        if (this.mBitmap != null && !clear) {
            this.mCropOverlayView.setCropWindowLimits(getWidth(), getHeight(), (r0.getWidth() * this.mLoadedSampleSize) / com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectWidth(this.mImagePoints), (this.mBitmap.getHeight() * this.mLoadedSampleSize) / com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectHeight(this.mImagePoints));
        }
        this.mCropOverlayView.setBounds(clear ? null : this.mImagePoints, getWidth(), getHeight());
    }

    public static class CropResult {
        private final android.graphics.Bitmap mBitmap;
        private final float[] mCropPoints;
        private final android.graphics.Rect mCropRect;
        private final java.lang.Exception mError;
        private final int mRotation;
        private final int mSampleSize;
        private final android.net.Uri mUri;

        CropResult(android.graphics.Bitmap bitmap, android.net.Uri uri, java.lang.Exception error, float[] cropPoints, android.graphics.Rect cropRect, int rotation, int sampleSize) {
            this.mBitmap = bitmap;
            this.mUri = uri;
            this.mError = error;
            this.mCropPoints = cropPoints;
            this.mCropRect = cropRect;
            this.mRotation = rotation;
            this.mSampleSize = sampleSize;
        }

        public boolean isSuccessful() {
            return this.mError == null;
        }

        public android.graphics.Bitmap getBitmap() {
            return this.mBitmap;
        }

        public android.net.Uri getUri() {
            return this.mUri;
        }

        public java.lang.Exception getError() {
            return this.mError;
        }

        public float[] getCropPoints() {
            return this.mCropPoints;
        }

        public android.graphics.Rect getCropRect() {
            return this.mCropRect;
        }

        public int getRotation() {
            return this.mRotation;
        }

        public int getSampleSize() {
            return this.mSampleSize;
        }
    }
}
