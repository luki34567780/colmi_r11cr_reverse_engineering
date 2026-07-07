package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
public class CropOverlayView extends android.view.View {
    private boolean initializedCropWindow;
    private int mAspectRatioX;
    private int mAspectRatioY;
    private android.graphics.Paint mBackgroundPaint;
    private float mBorderCornerLength;
    private float mBorderCornerOffset;
    private android.graphics.Paint mBorderCornerPaint;
    private android.graphics.Paint mBorderPaint;
    private final float[] mBoundsPoints;
    private final android.graphics.RectF mCalcBounds;
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape mCropShape;
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.CropWindowChangeListener mCropWindowChangeListener;
    private final com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowHandler mCropWindowHandler;
    private final android.graphics.RectF mDrawRect;
    private boolean mFixAspectRatio;
    private android.graphics.Paint mGuidelinePaint;
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines mGuidelines;
    private float mInitialCropWindowPaddingRatio;
    private final android.graphics.Rect mInitialCropWindowRect;
    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler mMoveHandler;
    private boolean mMultiTouchEnabled;
    private java.lang.Integer mOriginalLayerType;
    private android.graphics.Path mPath;
    private android.view.ScaleGestureDetector mScaleDetector;
    private float mSnapRadius;
    private float mTargetAspectRatio;
    private float mTouchRadius;
    private int mViewHeight;
    private int mViewWidth;

    public interface CropWindowChangeListener {
        void onCropWindowChanged(boolean inProgress);
    }

    public CropOverlayView(android.content.Context context) {
        this(context, null);
    }

    public CropOverlayView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mCropWindowHandler = new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowHandler();
        this.mDrawRect = new android.graphics.RectF();
        this.mPath = new android.graphics.Path();
        this.mBoundsPoints = new float[8];
        this.mCalcBounds = new android.graphics.RectF();
        this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
        this.mInitialCropWindowRect = new android.graphics.Rect();
    }

    public void setCropWindowChangeListener(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.CropWindowChangeListener listener) {
        this.mCropWindowChangeListener = listener;
    }

    public android.graphics.RectF getCropWindowRect() {
        return this.mCropWindowHandler.getRect();
    }

    public void setCropWindowRect(android.graphics.RectF rect) {
        this.mCropWindowHandler.setRect(rect);
    }

    public void fixCurrentCropWindowRect() {
        android.graphics.RectF cropWindowRect = getCropWindowRect();
        fixCropWindowRectByRules(cropWindowRect);
        this.mCropWindowHandler.setRect(cropWindowRect);
    }

    public void setBounds(float[] boundsPoints, int viewWidth, int viewHeight) {
        if (boundsPoints == null || !java.util.Arrays.equals(this.mBoundsPoints, boundsPoints)) {
            if (boundsPoints == null) {
                java.util.Arrays.fill(this.mBoundsPoints, 0.0f);
            } else {
                java.lang.System.arraycopy(boundsPoints, 0, this.mBoundsPoints, 0, boundsPoints.length);
            }
            this.mViewWidth = viewWidth;
            this.mViewHeight = viewHeight;
            android.graphics.RectF rect = this.mCropWindowHandler.getRect();
            if (rect.width() == 0.0f || rect.height() == 0.0f) {
                initCropWindow();
            }
        }
    }

    public void resetCropOverlayView() {
        if (this.initializedCropWindow) {
            setCropWindowRect(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.EMPTY_RECT_F);
            initCropWindow();
            invalidate();
        }
    }

    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape getCropShape() {
        return this.mCropShape;
    }

    public void setCropShape(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape cropShape) {
        if (this.mCropShape != cropShape) {
            this.mCropShape = cropShape;
            if (android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT <= 17) {
                if (this.mCropShape == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.OVAL) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(getLayerType());
                    this.mOriginalLayerType = valueOf;
                    if (valueOf.intValue() != 1) {
                        setLayerType(1, null);
                    } else {
                        this.mOriginalLayerType = null;
                    }
                } else {
                    java.lang.Integer num = this.mOriginalLayerType;
                    if (num != null) {
                        setLayerType(num.intValue(), null);
                        this.mOriginalLayerType = null;
                    }
                }
            }
            invalidate();
        }
    }

    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines getGuidelines() {
        return this.mGuidelines;
    }

    public void setGuidelines(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines guidelines) {
        if (this.mGuidelines != guidelines) {
            this.mGuidelines = guidelines;
            if (this.initializedCropWindow) {
                invalidate();
            }
        }
    }

    public boolean isFixAspectRatio() {
        return this.mFixAspectRatio;
    }

    public void setFixedAspectRatio(boolean fixAspectRatio) {
        if (this.mFixAspectRatio != fixAspectRatio) {
            this.mFixAspectRatio = fixAspectRatio;
            if (this.initializedCropWindow) {
                initCropWindow();
                invalidate();
            }
        }
    }

    public int getAspectRatioX() {
        return this.mAspectRatioX;
    }

    public void setAspectRatioX(int aspectRatioX) {
        if (aspectRatioX <= 0) {
            throw new java.lang.IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioX != aspectRatioX) {
            this.mAspectRatioX = aspectRatioX;
            this.mTargetAspectRatio = aspectRatioX / this.mAspectRatioY;
            if (this.initializedCropWindow) {
                initCropWindow();
                invalidate();
            }
        }
    }

    public int getAspectRatioY() {
        return this.mAspectRatioY;
    }

    public void setAspectRatioY(int aspectRatioY) {
        if (aspectRatioY <= 0) {
            throw new java.lang.IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.mAspectRatioY != aspectRatioY) {
            this.mAspectRatioY = aspectRatioY;
            this.mTargetAspectRatio = this.mAspectRatioX / aspectRatioY;
            if (this.initializedCropWindow) {
                initCropWindow();
                invalidate();
            }
        }
    }

    public void setSnapRadius(float snapRadius) {
        this.mSnapRadius = snapRadius;
    }

    public boolean setMultiTouchEnabled(boolean multiTouchEnabled) {
        if (android.os.Build.VERSION.SDK_INT < 11 || this.mMultiTouchEnabled == multiTouchEnabled) {
            return false;
        }
        this.mMultiTouchEnabled = multiTouchEnabled;
        if (!multiTouchEnabled || this.mScaleDetector != null) {
            return true;
        }
        this.mScaleDetector = new android.view.ScaleGestureDetector(getContext(), new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.ScaleListener());
        return true;
    }

    public void setMinCropResultSize(int minCropResultWidth, int minCropResultHeight) {
        this.mCropWindowHandler.setMinCropResultSize(minCropResultWidth, minCropResultHeight);
    }

    public void setMaxCropResultSize(int maxCropResultWidth, int maxCropResultHeight) {
        this.mCropWindowHandler.setMaxCropResultSize(maxCropResultWidth, maxCropResultHeight);
    }

    public void setCropWindowLimits(float maxWidth, float maxHeight, float scaleFactorWidth, float scaleFactorHeight) {
        this.mCropWindowHandler.setCropWindowLimits(maxWidth, maxHeight, scaleFactorWidth, scaleFactorHeight);
    }

    public android.graphics.Rect getInitialCropWindowRect() {
        return this.mInitialCropWindowRect;
    }

    public void setInitialCropWindowRect(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.mInitialCropWindowRect;
        if (rect == null) {
            rect = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.EMPTY_RECT;
        }
        rect2.set(rect);
        if (this.initializedCropWindow) {
            initCropWindow();
            invalidate();
            callOnCropWindowChanged(false);
        }
    }

    public void resetCropWindowRect() {
        if (this.initializedCropWindow) {
            initCropWindow();
            invalidate();
            callOnCropWindowChanged(false);
        }
    }

    public void setInitialAttributeValues(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions options) {
        this.mCropWindowHandler.setInitialAttributeValues(options);
        setCropShape(options.cropShape);
        setSnapRadius(options.snapRadius);
        setGuidelines(options.guidelines);
        setFixedAspectRatio(options.fixAspectRatio);
        setAspectRatioX(options.aspectRatioX);
        setAspectRatioY(options.aspectRatioY);
        setMultiTouchEnabled(options.multiTouchEnabled);
        this.mTouchRadius = options.touchRadius;
        this.mInitialCropWindowPaddingRatio = options.initialCropWindowPaddingRatio;
        this.mBorderPaint = getNewPaintOrNull(options.borderLineThickness, options.borderLineColor);
        this.mBorderCornerOffset = options.borderCornerOffset;
        this.mBorderCornerLength = options.borderCornerLength;
        this.mBorderCornerPaint = getNewPaintOrNull(options.borderCornerThickness, options.borderCornerColor);
        this.mGuidelinePaint = getNewPaintOrNull(options.guidelinesThickness, options.guidelinesColor);
        this.mBackgroundPaint = getNewPaint(options.backgroundColor);
    }

    private void initCropWindow() {
        float max = java.lang.Math.max(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectLeft(this.mBoundsPoints), 0.0f);
        float max2 = java.lang.Math.max(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectTop(this.mBoundsPoints), 0.0f);
        float min = java.lang.Math.min(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectRight(this.mBoundsPoints), getWidth());
        float min2 = java.lang.Math.min(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectBottom(this.mBoundsPoints), getHeight());
        if (min <= max || min2 <= max2) {
            return;
        }
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.initializedCropWindow = true;
        float f = this.mInitialCropWindowPaddingRatio;
        float f2 = min - max;
        float f3 = f * f2;
        float f4 = min2 - max2;
        float f5 = f * f4;
        if (this.mInitialCropWindowRect.width() > 0 && this.mInitialCropWindowRect.height() > 0) {
            rectF.left = (this.mInitialCropWindowRect.left / this.mCropWindowHandler.getScaleFactorWidth()) + max;
            rectF.top = (this.mInitialCropWindowRect.top / this.mCropWindowHandler.getScaleFactorHeight()) + max2;
            rectF.right = rectF.left + (this.mInitialCropWindowRect.width() / this.mCropWindowHandler.getScaleFactorWidth());
            rectF.bottom = rectF.top + (this.mInitialCropWindowRect.height() / this.mCropWindowHandler.getScaleFactorHeight());
            rectF.left = java.lang.Math.max(max, rectF.left);
            rectF.top = java.lang.Math.max(max2, rectF.top);
            rectF.right = java.lang.Math.min(min, rectF.right);
            rectF.bottom = java.lang.Math.min(min2, rectF.bottom);
        } else if (!this.mFixAspectRatio || min <= max || min2 <= max2) {
            rectF.left = max + f3;
            rectF.top = max2 + f5;
            rectF.right = min - f3;
            rectF.bottom = min2 - f5;
        } else if (f2 / f4 > this.mTargetAspectRatio) {
            rectF.top = max2 + f5;
            rectF.bottom = min2 - f5;
            float width = getWidth() / 2.0f;
            this.mTargetAspectRatio = this.mAspectRatioX / this.mAspectRatioY;
            float max3 = java.lang.Math.max(this.mCropWindowHandler.getMinCropWidth(), rectF.height() * this.mTargetAspectRatio) / 2.0f;
            rectF.left = width - max3;
            rectF.right = width + max3;
        } else {
            rectF.left = max + f3;
            rectF.right = min - f3;
            float height = getHeight() / 2.0f;
            float max4 = java.lang.Math.max(this.mCropWindowHandler.getMinCropHeight(), rectF.width() / this.mTargetAspectRatio) / 2.0f;
            rectF.top = height - max4;
            rectF.bottom = height + max4;
        }
        fixCropWindowRectByRules(rectF);
        this.mCropWindowHandler.setRect(rectF);
    }

    private void fixCropWindowRectByRules(android.graphics.RectF rect) {
        if (rect.width() < this.mCropWindowHandler.getMinCropWidth()) {
            float minCropWidth = (this.mCropWindowHandler.getMinCropWidth() - rect.width()) / 2.0f;
            rect.left -= minCropWidth;
            rect.right += minCropWidth;
        }
        if (rect.height() < this.mCropWindowHandler.getMinCropHeight()) {
            float minCropHeight = (this.mCropWindowHandler.getMinCropHeight() - rect.height()) / 2.0f;
            rect.top -= minCropHeight;
            rect.bottom += minCropHeight;
        }
        if (rect.width() > this.mCropWindowHandler.getMaxCropWidth()) {
            float width = (rect.width() - this.mCropWindowHandler.getMaxCropWidth()) / 2.0f;
            rect.left += width;
            rect.right -= width;
        }
        if (rect.height() > this.mCropWindowHandler.getMaxCropHeight()) {
            float height = (rect.height() - this.mCropWindowHandler.getMaxCropHeight()) / 2.0f;
            rect.top += height;
            rect.bottom -= height;
        }
        calculateBounds(rect);
        if (this.mCalcBounds.width() > 0.0f && this.mCalcBounds.height() > 0.0f) {
            float max = java.lang.Math.max(this.mCalcBounds.left, 0.0f);
            float max2 = java.lang.Math.max(this.mCalcBounds.top, 0.0f);
            float min = java.lang.Math.min(this.mCalcBounds.right, getWidth());
            float min2 = java.lang.Math.min(this.mCalcBounds.bottom, getHeight());
            if (rect.left < max) {
                rect.left = max;
            }
            if (rect.top < max2) {
                rect.top = max2;
            }
            if (rect.right > min) {
                rect.right = min;
            }
            if (rect.bottom > min2) {
                rect.bottom = min2;
            }
        }
        if (!this.mFixAspectRatio || java.lang.Math.abs(rect.width() - (rect.height() * this.mTargetAspectRatio)) <= 0.1d) {
            return;
        }
        if (rect.width() > rect.height() * this.mTargetAspectRatio) {
            float abs = java.lang.Math.abs((rect.height() * this.mTargetAspectRatio) - rect.width()) / 2.0f;
            rect.left += abs;
            rect.right -= abs;
        } else {
            float abs2 = java.lang.Math.abs((rect.width() / this.mTargetAspectRatio) - rect.height()) / 2.0f;
            rect.top += abs2;
            rect.bottom -= abs2;
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        drawBackground(canvas);
        if (this.mCropWindowHandler.showGuidelines()) {
            if (this.mGuidelines == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines.ON) {
                drawGuidelines(canvas);
            } else if (this.mGuidelines == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines.ON_TOUCH && this.mMoveHandler != null) {
                drawGuidelines(canvas);
            }
        }
        drawBorders(canvas);
        drawCorners(canvas);
    }

    private void drawBackground(android.graphics.Canvas canvas) {
        android.graphics.RectF rect = this.mCropWindowHandler.getRect();
        float max = java.lang.Math.max(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectLeft(this.mBoundsPoints), 0.0f);
        float max2 = java.lang.Math.max(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectTop(this.mBoundsPoints), 0.0f);
        float min = java.lang.Math.min(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectRight(this.mBoundsPoints), getWidth());
        float min2 = java.lang.Math.min(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectBottom(this.mBoundsPoints), getHeight());
        if (this.mCropShape == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.RECTANGLE) {
            if (!isNonStraightAngleRotated() || android.os.Build.VERSION.SDK_INT <= 17) {
                canvas.drawRect(max, max2, min, rect.top, this.mBackgroundPaint);
                canvas.drawRect(max, rect.bottom, min, min2, this.mBackgroundPaint);
                canvas.drawRect(max, rect.top, rect.left, rect.bottom, this.mBackgroundPaint);
                canvas.drawRect(rect.right, rect.top, min, rect.bottom, this.mBackgroundPaint);
                return;
            }
            this.mPath.reset();
            android.graphics.Path path = this.mPath;
            float[] fArr = this.mBoundsPoints;
            path.moveTo(fArr[0], fArr[1]);
            android.graphics.Path path2 = this.mPath;
            float[] fArr2 = this.mBoundsPoints;
            path2.lineTo(fArr2[2], fArr2[3]);
            android.graphics.Path path3 = this.mPath;
            float[] fArr3 = this.mBoundsPoints;
            path3.lineTo(fArr3[4], fArr3[5]);
            android.graphics.Path path4 = this.mPath;
            float[] fArr4 = this.mBoundsPoints;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.mPath.close();
            canvas.save();
            canvas.clipPath(this.mPath, android.graphics.Region.Op.INTERSECT);
            canvas.clipRect(rect, android.graphics.Region.Op.XOR);
            canvas.drawRect(max, max2, min, min2, this.mBackgroundPaint);
            canvas.restore();
            return;
        }
        this.mPath.reset();
        if (android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT <= 17 && this.mCropShape == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.OVAL) {
            this.mDrawRect.set(rect.left + 2.0f, rect.top + 2.0f, rect.right - 2.0f, rect.bottom - 2.0f);
        } else {
            this.mDrawRect.set(rect.left, rect.top, rect.right, rect.bottom);
        }
        this.mPath.addOval(this.mDrawRect, android.graphics.Path.Direction.CW);
        canvas.save();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            canvas.clipPath(this.mPath);
        } else {
            canvas.clipPath(this.mPath, android.graphics.Region.Op.XOR);
        }
        canvas.drawRect(max, max2, min, min2, this.mBackgroundPaint);
        canvas.restore();
    }

    private void drawGuidelines(android.graphics.Canvas canvas) {
        if (this.mGuidelinePaint != null) {
            android.graphics.Paint paint = this.mBorderPaint;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            android.graphics.RectF rect = this.mCropWindowHandler.getRect();
            rect.inset(strokeWidth, strokeWidth);
            float width = rect.width() / 3.0f;
            float height = rect.height() / 3.0f;
            if (this.mCropShape == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.OVAL) {
                float width2 = (rect.width() / 2.0f) - strokeWidth;
                float height2 = (rect.height() / 2.0f) - strokeWidth;
                float f = rect.left + width;
                float f2 = rect.right - width;
                float sin = (float) (height2 * java.lang.Math.sin(java.lang.Math.acos((width2 - width) / width2)));
                canvas.drawLine(f, (rect.top + height2) - sin, f, (rect.bottom - height2) + sin, this.mGuidelinePaint);
                canvas.drawLine(f2, (rect.top + height2) - sin, f2, (rect.bottom - height2) + sin, this.mGuidelinePaint);
                float f3 = rect.top + height;
                float f4 = rect.bottom - height;
                float cos = (float) (width2 * java.lang.Math.cos(java.lang.Math.asin((height2 - height) / height2)));
                canvas.drawLine((rect.left + width2) - cos, f3, (rect.right - width2) + cos, f3, this.mGuidelinePaint);
                canvas.drawLine((rect.left + width2) - cos, f4, (rect.right - width2) + cos, f4, this.mGuidelinePaint);
                return;
            }
            float f5 = rect.left + width;
            float f6 = rect.right - width;
            canvas.drawLine(f5, rect.top, f5, rect.bottom, this.mGuidelinePaint);
            canvas.drawLine(f6, rect.top, f6, rect.bottom, this.mGuidelinePaint);
            float f7 = rect.top + height;
            float f8 = rect.bottom - height;
            canvas.drawLine(rect.left, f7, rect.right, f7, this.mGuidelinePaint);
            canvas.drawLine(rect.left, f8, rect.right, f8, this.mGuidelinePaint);
        }
    }

    private void drawBorders(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.mBorderPaint;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            android.graphics.RectF rect = this.mCropWindowHandler.getRect();
            float f = strokeWidth / 2.0f;
            rect.inset(f, f);
            if (this.mCropShape == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.RECTANGLE) {
                canvas.drawRect(rect, this.mBorderPaint);
            } else {
                canvas.drawOval(rect, this.mBorderPaint);
            }
        }
    }

    private void drawCorners(android.graphics.Canvas canvas) {
        if (this.mBorderCornerPaint != null) {
            android.graphics.Paint paint = this.mBorderPaint;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            float strokeWidth2 = this.mBorderCornerPaint.getStrokeWidth();
            float f = strokeWidth2 / 2.0f;
            float f2 = this.mBorderCornerOffset + f;
            android.graphics.RectF rect = this.mCropWindowHandler.getRect();
            rect.inset(f2, f2);
            float f3 = (strokeWidth2 - strokeWidth) / 2.0f;
            float f4 = f + f3;
            canvas.drawLine(rect.left - f3, rect.top - f4, rect.left - f3, rect.top + this.mBorderCornerLength, this.mBorderCornerPaint);
            canvas.drawLine(rect.left - f4, rect.top - f3, rect.left + this.mBorderCornerLength, rect.top - f3, this.mBorderCornerPaint);
            canvas.drawLine(rect.right + f3, rect.top - f4, rect.right + f3, rect.top + this.mBorderCornerLength, this.mBorderCornerPaint);
            canvas.drawLine(rect.right + f4, rect.top - f3, rect.right - this.mBorderCornerLength, rect.top - f3, this.mBorderCornerPaint);
            canvas.drawLine(rect.left - f3, rect.bottom + f4, rect.left - f3, rect.bottom - this.mBorderCornerLength, this.mBorderCornerPaint);
            canvas.drawLine(rect.left - f4, rect.bottom + f3, rect.left + this.mBorderCornerLength, rect.bottom + f3, this.mBorderCornerPaint);
            canvas.drawLine(rect.right + f3, rect.bottom + f4, rect.right + f3, rect.bottom - this.mBorderCornerLength, this.mBorderCornerPaint);
            canvas.drawLine(rect.right + f4, rect.bottom + f3, rect.right - this.mBorderCornerLength, rect.bottom + f3, this.mBorderCornerPaint);
        }
    }

    private static android.graphics.Paint getNewPaint(int color) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(color);
        return paint;
    }

    private static android.graphics.Paint getNewPaintOrNull(float thickness, int color) {
        if (thickness <= 0.0f) {
            return null;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(color);
        paint.setStrokeWidth(thickness);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        if (!isEnabled()) {
            return false;
        }
        if (this.mMultiTouchEnabled) {
            this.mScaleDetector.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            onActionDown(event.getX(), event.getY());
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                onActionMove(event.getX(), event.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        onActionUp();
        return true;
    }

    private void onActionDown(float x, float y) {
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler moveHandler = this.mCropWindowHandler.getMoveHandler(x, y, this.mTouchRadius, this.mCropShape);
        this.mMoveHandler = moveHandler;
        if (moveHandler != null) {
            invalidate();
        }
    }

    private void onActionUp() {
        if (this.mMoveHandler != null) {
            this.mMoveHandler = null;
            callOnCropWindowChanged(false);
            invalidate();
        }
    }

    private void onActionMove(float x, float y) {
        if (this.mMoveHandler != null) {
            float f = this.mSnapRadius;
            android.graphics.RectF rect = this.mCropWindowHandler.getRect();
            this.mMoveHandler.move(rect, x, y, this.mCalcBounds, this.mViewWidth, this.mViewHeight, calculateBounds(rect) ? 0.0f : f, this.mFixAspectRatio, this.mTargetAspectRatio);
            this.mCropWindowHandler.setRect(rect);
            callOnCropWindowChanged(true);
            invalidate();
        }
    }

    private boolean calculateBounds(android.graphics.RectF rect) {
        float rectLeft = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectLeft(this.mBoundsPoints);
        float rectTop = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectTop(this.mBoundsPoints);
        float rectRight = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectRight(this.mBoundsPoints);
        float rectBottom = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.BitmapUtils.getRectBottom(this.mBoundsPoints);
        if (!isNonStraightAngleRotated()) {
            this.mCalcBounds.set(rectLeft, rectTop, rectRight, rectBottom);
            return false;
        }
        float[] fArr = this.mBoundsPoints;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[4];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f = fArr[6];
                f2 = fArr[7];
                f3 = fArr[2];
                f4 = fArr[3];
                f5 = fArr[4];
                f6 = fArr[5];
            } else {
                f = fArr[4];
                f2 = fArr[5];
                f3 = fArr[0];
                f4 = fArr[1];
                f5 = fArr[2];
                f6 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f = fArr[2];
            f2 = fArr[3];
            f3 = fArr[6];
            f4 = fArr[7];
            f5 = fArr[0];
            f6 = fArr[1];
        }
        float f7 = (f6 - f2) / (f5 - f);
        float f8 = (-1.0f) / f7;
        float f9 = f2 - (f7 * f);
        float f10 = f2 - (f * f8);
        float f11 = f4 - (f7 * f3);
        float f12 = f4 - (f3 * f8);
        float centerY = (rect.centerY() - rect.top) / (rect.centerX() - rect.left);
        float f13 = -centerY;
        float f14 = rect.top - (rect.left * centerY);
        float f15 = rect.top - (rect.right * f13);
        float f16 = f7 - centerY;
        float f17 = (f14 - f9) / f16;
        if (f17 >= rect.right) {
            f17 = rectLeft;
        }
        float max = java.lang.Math.max(rectLeft, f17);
        float f18 = (f14 - f10) / (f8 - centerY);
        if (f18 >= rect.right) {
            f18 = max;
        }
        float max2 = java.lang.Math.max(max, f18);
        float f19 = f8 - f13;
        float f20 = (f15 - f12) / f19;
        if (f20 >= rect.right) {
            f20 = max2;
        }
        float max3 = java.lang.Math.max(max2, f20);
        float f21 = (f15 - f10) / f19;
        if (f21 <= rect.left) {
            f21 = rectRight;
        }
        float min = java.lang.Math.min(rectRight, f21);
        float f22 = (f15 - f11) / (f7 - f13);
        if (f22 <= rect.left) {
            f22 = min;
        }
        float min2 = java.lang.Math.min(min, f22);
        float f23 = (f14 - f11) / f16;
        if (f23 <= rect.left) {
            f23 = min2;
        }
        float min3 = java.lang.Math.min(min2, f23);
        float max4 = java.lang.Math.max(rectTop, java.lang.Math.max((f7 * max3) + f9, (f8 * min3) + f10));
        float min4 = java.lang.Math.min(rectBottom, java.lang.Math.min((f8 * max3) + f12, (f7 * min3) + f11));
        this.mCalcBounds.left = max3;
        this.mCalcBounds.top = max4;
        this.mCalcBounds.right = min3;
        this.mCalcBounds.bottom = min4;
        return true;
    }

    private boolean isNonStraightAngleRotated() {
        float[] fArr = this.mBoundsPoints;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    private void callOnCropWindowChanged(boolean inProgress) {
        try {
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.CropWindowChangeListener cropWindowChangeListener = this.mCropWindowChangeListener;
            if (cropWindowChangeListener != null) {
                cropWindowChangeListener.onCropWindowChanged(inProgress);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e("AIC", "Exception in crop window changed", e);
        }
    }

    private class ScaleListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {
        private ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(android.view.ScaleGestureDetector detector) {
            android.graphics.RectF rect = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.this.mCropWindowHandler.getRect();
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float currentSpanY = detector.getCurrentSpanY() / 2.0f;
            float currentSpanX = detector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 >= f3 || f > f4 || f2 < 0.0f || f3 > com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.this.mCropWindowHandler.getMaxCropWidth() || f < 0.0f || f4 > com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.this.mCropWindowHandler.getMaxCropHeight()) {
                return true;
            }
            rect.set(f2, f, f3, f4);
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.this.mCropWindowHandler.setRect(rect);
            com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView.this.invalidate();
            return true;
        }
    }
}
