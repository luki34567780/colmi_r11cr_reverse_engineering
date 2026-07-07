package com.yalantis.ucrop.view;

/* loaded from: classes3.dex */
public class TransformImageView extends androidx.appcompat.widget.AppCompatImageView {
    private static final int MATRIX_VALUES_COUNT = 9;
    private static final int RECT_CENTER_POINT_COORDS = 2;
    private static final int RECT_CORNER_POINTS_COORDS = 8;
    private static final java.lang.String TAG = "TransformImageView";
    protected boolean mBitmapDecoded;
    protected boolean mBitmapLaidOut;
    protected final float[] mCurrentImageCenter;
    protected final float[] mCurrentImageCorners;
    protected android.graphics.Matrix mCurrentImageMatrix;
    private com.yalantis.ucrop.model.ExifInfo mExifInfo;
    private java.lang.String mImageInputPath;
    private android.net.Uri mImageInputUri;
    private java.lang.String mImageOutputPath;
    private android.net.Uri mImageOutputUri;
    private float[] mInitialImageCenter;
    private float[] mInitialImageCorners;
    private final float[] mMatrixValues;
    private int mMaxBitmapSize;
    protected int mThisHeight;
    protected int mThisWidth;
    protected com.yalantis.ucrop.view.TransformImageView.TransformImageListener mTransformImageListener;

    public interface TransformImageListener {
        void onLoadComplete();

        void onLoadFailure(java.lang.Exception exc);

        void onRotate(float f);

        void onScale(float f);
    }

    public TransformImageView(android.content.Context context) {
        this(context, null);
    }

    public TransformImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentImageCorners = new float[8];
        this.mCurrentImageCenter = new float[2];
        this.mMatrixValues = new float[9];
        this.mCurrentImageMatrix = new android.graphics.Matrix();
        this.mBitmapDecoded = false;
        this.mBitmapLaidOut = false;
        this.mMaxBitmapSize = 0;
        init();
    }

    public void setTransformImageListener(com.yalantis.ucrop.view.TransformImageView.TransformImageListener transformImageListener) {
        this.mTransformImageListener = transformImageListener;
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        if (scaleType == android.widget.ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            android.util.Log.w(TAG, "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setMaxBitmapSize(int i) {
        this.mMaxBitmapSize = i;
    }

    public int getMaxBitmapSize() {
        if (this.mMaxBitmapSize <= 0) {
            this.mMaxBitmapSize = com.yalantis.ucrop.util.BitmapLoadUtils.calculateMaxBitmapSize(getContext());
        }
        return this.mMaxBitmapSize;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        setImageDrawable(new com.yalantis.ucrop.util.FastBitmapDrawable(bitmap));
    }

    public java.lang.String getImageInputPath() {
        return this.mImageInputPath;
    }

    public java.lang.String getImageOutputPath() {
        return this.mImageOutputPath;
    }

    public android.net.Uri getImageInputUri() {
        return this.mImageInputUri;
    }

    public android.net.Uri getImageOutputUri() {
        return this.mImageOutputUri;
    }

    public com.yalantis.ucrop.model.ExifInfo getExifInfo() {
        return this.mExifInfo;
    }

    public void setImageUri(android.net.Uri uri, android.net.Uri uri2, boolean z) {
        if (com.yalantis.ucrop.UCropDevelopConfig.imageEngine != null && z) {
            useCustomLoaderCrop(uri, uri2);
        } else {
            useDefaultLoaderCrop(uri, uri2);
        }
    }

    private void useCustomLoaderCrop(final android.net.Uri uri, final android.net.Uri uri2) {
        int[] maxImageSize = com.yalantis.ucrop.util.BitmapLoadUtils.getMaxImageSize(getContext(), uri);
        if (maxImageSize[0] > 0 && maxImageSize[1] > 0) {
            com.yalantis.ucrop.UCropDevelopConfig.imageEngine.loadImage(getContext(), uri, maxImageSize[0], maxImageSize[1], new com.yalantis.ucrop.UCropImageEngine.OnCallbackListener<android.graphics.Bitmap>() { // from class: com.yalantis.ucrop.view.TransformImageView.1
                @Override // com.yalantis.ucrop.UCropImageEngine.OnCallbackListener
                public void onCall(android.graphics.Bitmap bitmap) {
                    if (bitmap == null) {
                        com.yalantis.ucrop.view.TransformImageView.this.useDefaultLoaderCrop(uri, uri2);
                    } else {
                        com.yalantis.ucrop.view.TransformImageView.this.setBitmapLoadedResult(bitmap.copy(bitmap.getConfig(), true), new com.yalantis.ucrop.model.ExifInfo(0, 0, 0), uri, uri2);
                    }
                }
            });
        } else {
            useDefaultLoaderCrop(uri, uri2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void useDefaultLoaderCrop(android.net.Uri uri, android.net.Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        com.yalantis.ucrop.util.BitmapLoadUtils.decodeBitmapInBackground(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new com.yalantis.ucrop.callback.BitmapLoadCallback() { // from class: com.yalantis.ucrop.view.TransformImageView.2
            @Override // com.yalantis.ucrop.callback.BitmapLoadCallback
            public void onBitmapLoaded(android.graphics.Bitmap bitmap, com.yalantis.ucrop.model.ExifInfo exifInfo, android.net.Uri uri3, android.net.Uri uri4) {
                com.yalantis.ucrop.view.TransformImageView.this.setBitmapLoadedResult(bitmap, exifInfo, uri3, uri4);
            }

            @Override // com.yalantis.ucrop.callback.BitmapLoadCallback
            public void onFailure(java.lang.Exception exc) {
                android.util.Log.e(com.yalantis.ucrop.view.TransformImageView.TAG, "onFailure: setImageUri", exc);
                if (com.yalantis.ucrop.view.TransformImageView.this.mTransformImageListener != null) {
                    com.yalantis.ucrop.view.TransformImageView.this.mTransformImageListener.onLoadFailure(exc);
                }
            }
        });
    }

    public void setBitmapLoadedResult(android.graphics.Bitmap bitmap, com.yalantis.ucrop.model.ExifInfo exifInfo, android.net.Uri uri, android.net.Uri uri2) {
        java.lang.String str;
        this.mImageInputUri = uri;
        this.mImageOutputUri = uri2;
        this.mImageInputPath = com.yalantis.ucrop.util.FileUtils.isContent(uri.toString()) ? uri.toString() : uri.getPath();
        if (uri2 != null) {
            str = com.yalantis.ucrop.util.FileUtils.isContent(uri2.toString()) ? uri2.toString() : uri2.getPath();
        } else {
            str = null;
        }
        this.mImageOutputPath = str;
        this.mExifInfo = exifInfo;
        this.mBitmapDecoded = true;
        setImageBitmap(bitmap);
    }

    public float getCurrentScale() {
        return getMatrixScale(this.mCurrentImageMatrix);
    }

    public float getMatrixScale(android.graphics.Matrix matrix) {
        return (float) java.lang.Math.sqrt(java.lang.Math.pow(getMatrixValue(matrix, 0), 2.0d) + java.lang.Math.pow(getMatrixValue(matrix, 3), 2.0d));
    }

    public float getCurrentAngle() {
        return getMatrixAngle(this.mCurrentImageMatrix);
    }

    public float getMatrixAngle(android.graphics.Matrix matrix) {
        return (float) (-(java.lang.Math.atan2(getMatrixValue(matrix, 1), getMatrixValue(matrix, 0)) * 57.29577951308232d));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(android.graphics.Matrix matrix) {
        super.setImageMatrix(matrix);
        this.mCurrentImageMatrix.set(matrix);
        updateCurrentImagePoints();
    }

    public android.graphics.Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof com.yalantis.ucrop.util.FastBitmapDrawable)) {
            return null;
        }
        return ((com.yalantis.ucrop.util.FastBitmapDrawable) getDrawable()).getBitmap();
    }

    public void postTranslate(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        this.mCurrentImageMatrix.postTranslate(f, f2);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public void postScale(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.mCurrentImageMatrix.postScale(f, f, f2, f3);
            setImageMatrix(this.mCurrentImageMatrix);
            com.yalantis.ucrop.view.TransformImageView.TransformImageListener transformImageListener = this.mTransformImageListener;
            if (transformImageListener != null) {
                transformImageListener.onScale(getMatrixScale(this.mCurrentImageMatrix));
            }
        }
    }

    public void postRotate(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.mCurrentImageMatrix.postRotate(f, f2, f3);
            setImageMatrix(this.mCurrentImageMatrix);
            com.yalantis.ucrop.view.TransformImageView.TransformImageListener transformImageListener = this.mTransformImageListener;
            if (transformImageListener != null) {
                transformImageListener.onRotate(getMatrixAngle(this.mCurrentImageMatrix));
            }
        }
    }

    protected void init() {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.mBitmapDecoded && !this.mBitmapLaidOut)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            onImageLaidOut();
        }
    }

    protected void onImageLaidOut() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        android.util.Log.d(TAG, java.lang.String.format("Image size: [%d:%d]", java.lang.Integer.valueOf((int) intrinsicWidth), java.lang.Integer.valueOf((int) intrinsicHeight)));
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.mInitialImageCorners = com.yalantis.ucrop.util.RectUtils.getCornersFromRect(rectF);
        this.mInitialImageCenter = com.yalantis.ucrop.util.RectUtils.getCenterFromRect(rectF);
        this.mBitmapLaidOut = true;
        com.yalantis.ucrop.view.TransformImageView.TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onLoadComplete();
        }
    }

    protected float getMatrixValue(android.graphics.Matrix matrix, int i) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i];
    }

    protected void printMatrix(java.lang.String str, android.graphics.Matrix matrix) {
        android.util.Log.d(TAG, str + ": matrix: { x: " + getMatrixValue(matrix, 2) + ", y: " + getMatrixValue(matrix, 5) + ", scale: " + getMatrixScale(matrix) + ", angle: " + getMatrixAngle(matrix) + " }");
    }

    private void updateCurrentImagePoints() {
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCorners, this.mInitialImageCorners);
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCenter, this.mInitialImageCenter);
    }
}
