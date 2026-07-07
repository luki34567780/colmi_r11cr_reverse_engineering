package com.yalantis.ucrop.view;

/* loaded from: classes3.dex */
public class OverlayView extends android.view.View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = true;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_PASS_THROUGH = 2;
    private static final long SMOOTH_CENTER_DURATION = 1000;
    private boolean isDragCenter;
    private com.yalantis.ucrop.callback.OverlayViewChangeListener mCallback;
    private boolean mCircleDimmedLayer;
    private android.graphics.Path mCircularPath;
    private android.graphics.Paint mCropFrameCornersPaint;
    private android.graphics.Paint mCropFramePaint;
    protected float[] mCropGridCenter;
    private int mCropGridColumnCount;
    protected float[] mCropGridCorners;
    private android.graphics.Paint mCropGridPaint;
    private int mCropGridRowCount;
    private int mCropRectCornerTouchAreaLineLength;
    private int mCropRectMinSize;
    private final android.graphics.RectF mCropViewRect;
    private int mCurrentTouchCornerIndex;
    private int mDimmedColor;
    private android.graphics.Paint mDimmedStrokePaint;
    private int mFreestyleCropMode;
    private float[] mGridPoints;
    private float mPreviousTouchX;
    private float mPreviousTouchY;
    private boolean mShouldSetupCropBounds;
    private boolean mShowCropFrame;
    private boolean mShowCropGrid;
    private float mTargetAspectRatio;
    private final android.graphics.RectF mTempRect;
    protected int mThisHeight;
    protected int mThisWidth;
    private int mTouchPointThreshold;
    private android.animation.ValueAnimator smoothAnimator;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(android.content.Context context) {
        this(context, null);
    }

    public OverlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCropViewRect = new android.graphics.RectF();
        this.mTempRect = new android.graphics.RectF();
        this.mGridPoints = null;
        this.mCircularPath = new android.graphics.Path();
        this.mDimmedStrokePaint = new android.graphics.Paint(1);
        this.mCropGridPaint = new android.graphics.Paint(1);
        this.mCropFramePaint = new android.graphics.Paint(1);
        this.mCropFrameCornersPaint = new android.graphics.Paint(1);
        this.mFreestyleCropMode = 0;
        this.mPreviousTouchX = -1.0f;
        this.mPreviousTouchY = -1.0f;
        this.mCurrentTouchCornerIndex = -1;
        this.mTouchPointThreshold = getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.mCropRectMinSize = getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_default_crop_rect_min_size);
        this.mCropRectCornerTouchAreaLineLength = getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        init();
    }

    public com.yalantis.ucrop.callback.OverlayViewChangeListener getOverlayViewChangeListener() {
        return this.mCallback;
    }

    public void setOverlayViewChangeListener(com.yalantis.ucrop.callback.OverlayViewChangeListener overlayViewChangeListener) {
        this.mCallback = overlayViewChangeListener;
    }

    public android.graphics.RectF getCropViewRect() {
        return this.mCropViewRect;
    }

    @java.lang.Deprecated
    public boolean isFreestyleCropEnabled() {
        return this.mFreestyleCropMode == 1;
    }

    public void setDragSmoothToCenter(boolean z) {
        this.isDragCenter = z;
    }

    @java.lang.Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.mFreestyleCropMode = z ? 1 : 0;
    }

    public int getFreestyleCropMode() {
        return this.mFreestyleCropMode;
    }

    public void setFreestyleCropMode(int i) {
        this.mFreestyleCropMode = i;
        postInvalidate();
    }

    public void setCircleDimmedLayer(boolean z) {
        this.mCircleDimmedLayer = z;
    }

    public void setCropGridRowCount(int i) {
        this.mCropGridRowCount = i;
        this.mGridPoints = null;
    }

    public void setCropGridColumnCount(int i) {
        this.mCropGridColumnCount = i;
        this.mGridPoints = null;
    }

    public void setShowCropFrame(boolean z) {
        this.mShowCropFrame = z;
    }

    public void setShowCropGrid(boolean z) {
        this.mShowCropGrid = z;
    }

    public void setDimmedColor(int i) {
        this.mDimmedColor = i;
    }

    public void setCircleStrokeColor(int i) {
        this.mDimmedStrokePaint.setColor(i);
    }

    public void setCropFrameStrokeWidth(int i) {
        this.mCropFramePaint.setStrokeWidth(i);
    }

    public void setCropGridStrokeWidth(int i) {
        this.mCropGridPaint.setStrokeWidth(i);
    }

    public void setDimmedStrokeWidth(int i) {
        this.mDimmedStrokePaint.setStrokeWidth(i);
    }

    public void setCropFrameColor(int i) {
        this.mCropFramePaint.setColor(i);
    }

    public void setCropGridColor(int i) {
        this.mCropGridPaint.setColor(i);
    }

    public void setTargetAspectRatio(float f) {
        this.mTargetAspectRatio = f;
        if (this.mThisWidth > 0) {
            setupCropBounds();
            postInvalidate();
        } else {
            this.mShouldSetupCropBounds = true;
        }
    }

    public void setupCropBounds() {
        int i = this.mThisWidth;
        float f = this.mTargetAspectRatio;
        int i2 = (int) (i / f);
        int i3 = this.mThisHeight;
        if (i2 > i3) {
            int i4 = (i - ((int) (i3 * f))) / 2;
            this.mCropViewRect.set(getPaddingLeft() + i4, getPaddingTop(), getPaddingLeft() + r1 + i4, getPaddingTop() + this.mThisHeight);
        } else {
            int i5 = (i3 - i2) / 2;
            this.mCropViewRect.set(getPaddingLeft(), getPaddingTop() + i5, getPaddingLeft() + this.mThisWidth, getPaddingTop() + i2 + i5);
        }
        com.yalantis.ucrop.callback.OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
        if (overlayViewChangeListener != null) {
            overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
        }
        updateGridPoints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateGridPoints() {
        this.mCropGridCorners = com.yalantis.ucrop.util.RectUtils.getCornersFromRect(this.mCropViewRect);
        this.mCropGridCenter = com.yalantis.ucrop.util.RectUtils.getCenterFromRect(this.mCropViewRect);
        this.mGridPoints = null;
        this.mCircularPath.reset();
        this.mCircularPath.addCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), java.lang.Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, android.graphics.Path.Direction.CW);
    }

    protected void init() {
        if (android.os.Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            if (this.mShouldSetupCropBounds) {
                this.mShouldSetupCropBounds = false;
                setTargetAspectRatio(this.mTargetAspectRatio);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        drawDimmedLayer(canvas);
        drawCropGrid(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.mCropViewRect.isEmpty() && this.mFreestyleCropMode != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int currentTouchIndex = getCurrentTouchIndex(x, y);
                this.mCurrentTouchCornerIndex = currentTouchIndex;
                boolean z = currentTouchIndex != -1;
                if (!z) {
                    this.mPreviousTouchX = -1.0f;
                    this.mPreviousTouchY = -1.0f;
                } else if (this.mPreviousTouchX < 0.0f) {
                    this.mPreviousTouchX = x;
                    this.mPreviousTouchY = y;
                }
                return z;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.mCurrentTouchCornerIndex != -1) {
                float min = java.lang.Math.min(java.lang.Math.max(x, getPaddingLeft()), getWidth() - getPaddingRight());
                float min2 = java.lang.Math.min(java.lang.Math.max(y, getPaddingTop()), getHeight() - getPaddingBottom());
                updateCropViewRect(min, min2);
                this.mPreviousTouchX = min;
                this.mPreviousTouchY = min2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.mPreviousTouchX = -1.0f;
                this.mPreviousTouchY = -1.0f;
                this.mCurrentTouchCornerIndex = -1;
                com.yalantis.ucrop.callback.OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
                if (overlayViewChangeListener != null) {
                    overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
                }
                if (this.isDragCenter) {
                    smoothToCenter();
                }
            }
        }
        return false;
    }

    private void updateCropViewRect(float f, float f2) {
        this.mTempRect.set(this.mCropViewRect);
        int i = this.mCurrentTouchCornerIndex;
        if (i == 0) {
            this.mTempRect.set(f, f2, this.mCropViewRect.right, this.mCropViewRect.bottom);
        } else if (i == 1) {
            this.mTempRect.set(this.mCropViewRect.left, f2, f, this.mCropViewRect.bottom);
        } else if (i == 2) {
            this.mTempRect.set(this.mCropViewRect.left, this.mCropViewRect.top, f, f2);
        } else if (i == 3) {
            this.mTempRect.set(f, this.mCropViewRect.top, this.mCropViewRect.right, f2);
        } else if (i == 4) {
            this.mTempRect.offset(f - this.mPreviousTouchX, f2 - this.mPreviousTouchY);
            if (this.mTempRect.left <= getLeft() || this.mTempRect.top <= getTop() || this.mTempRect.right >= getRight() || this.mTempRect.bottom >= getBottom()) {
                return;
            }
            this.mCropViewRect.set(this.mTempRect);
            updateGridPoints();
            postInvalidate();
            return;
        }
        boolean z = this.mTempRect.height() >= ((float) this.mCropRectMinSize);
        boolean z2 = this.mTempRect.width() >= ((float) this.mCropRectMinSize);
        android.graphics.RectF rectF = this.mCropViewRect;
        rectF.set(z2 ? this.mTempRect.left : rectF.left, (z ? this.mTempRect : this.mCropViewRect).top, (z2 ? this.mTempRect : this.mCropViewRect).right, (z ? this.mTempRect : this.mCropViewRect).bottom);
        if (z || z2) {
            updateGridPoints();
            postInvalidate();
        }
    }

    private int getCurrentTouchIndex(float f, float f2) {
        double d = this.mTouchPointThreshold;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double sqrt = java.lang.Math.sqrt(java.lang.Math.pow(f - this.mCropGridCorners[i2], 2.0d) + java.lang.Math.pow(f2 - this.mCropGridCorners[i2 + 1], 2.0d));
            if (sqrt < d) {
                i = i2 / 2;
                d = sqrt;
            }
        }
        if (this.mFreestyleCropMode == 1 && i < 0 && this.mCropViewRect.contains(f, f2)) {
            return 4;
        }
        return i;
    }

    protected void drawDimmedLayer(android.graphics.Canvas canvas) {
        canvas.save();
        if (this.mCircleDimmedLayer) {
            canvas.clipPath(this.mCircularPath, android.graphics.Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.mCropViewRect, android.graphics.Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.mDimmedColor);
        canvas.restore();
        if (this.mCircleDimmedLayer) {
            canvas.drawCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), java.lang.Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, this.mDimmedStrokePaint);
        }
    }

    protected void drawCropGrid(android.graphics.Canvas canvas) {
        if (this.mShowCropGrid) {
            if (this.mGridPoints == null && !this.mCropViewRect.isEmpty()) {
                this.mGridPoints = new float[(this.mCropGridRowCount * 4) + (this.mCropGridColumnCount * 4)];
                int i = 0;
                int i2 = 0;
                while (i < this.mCropGridRowCount) {
                    int i3 = i2 + 1;
                    this.mGridPoints[i2] = this.mCropViewRect.left;
                    int i4 = i3 + 1;
                    float f = i + 1.0f;
                    this.mGridPoints[i3] = (this.mCropViewRect.height() * (f / (this.mCropGridRowCount + 1))) + this.mCropViewRect.top;
                    int i5 = i4 + 1;
                    this.mGridPoints[i4] = this.mCropViewRect.right;
                    this.mGridPoints[i5] = (this.mCropViewRect.height() * (f / (this.mCropGridRowCount + 1))) + this.mCropViewRect.top;
                    i++;
                    i2 = i5 + 1;
                }
                for (int i6 = 0; i6 < this.mCropGridColumnCount; i6++) {
                    int i7 = i2 + 1;
                    float f2 = i6 + 1.0f;
                    this.mGridPoints[i2] = (this.mCropViewRect.width() * (f2 / (this.mCropGridColumnCount + 1))) + this.mCropViewRect.left;
                    int i8 = i7 + 1;
                    this.mGridPoints[i7] = this.mCropViewRect.top;
                    int i9 = i8 + 1;
                    this.mGridPoints[i8] = (this.mCropViewRect.width() * (f2 / (this.mCropGridColumnCount + 1))) + this.mCropViewRect.left;
                    i2 = i9 + 1;
                    this.mGridPoints[i9] = this.mCropViewRect.bottom;
                }
            }
            float[] fArr = this.mGridPoints;
            if (fArr != null) {
                canvas.drawLines(fArr, this.mCropGridPaint);
            }
        }
        if (this.mShowCropFrame) {
            canvas.drawRect(this.mCropViewRect, this.mCropFramePaint);
        }
        if (this.mFreestyleCropMode != 0) {
            canvas.save();
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(this.mCropRectCornerTouchAreaLineLength, -r1);
            canvas.clipRect(this.mTempRect, android.graphics.Region.Op.DIFFERENCE);
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(-r1, this.mCropRectCornerTouchAreaLineLength);
            canvas.clipRect(this.mTempRect, android.graphics.Region.Op.DIFFERENCE);
            canvas.drawRect(this.mCropViewRect, this.mCropFrameCornersPaint);
            canvas.restore();
        }
    }

    protected void processStyledAttributes(android.content.res.TypedArray typedArray) {
        this.mCircleDimmedLayer = typedArray.getBoolean(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_default_dimmed));
        this.mDimmedColor = color;
        this.mDimmedStrokePaint.setColor(color);
        this.mDimmedStrokePaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mDimmedStrokePaint.setStrokeWidth(com.yalantis.ucrop.util.DensityUtil.dip2px(getContext(), 1.0f));
        initCropFrameStyle(typedArray);
        this.mShowCropFrame = typedArray.getBoolean(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_show_frame, true);
        initCropGridStyle(typedArray);
        this.mShowCropGrid = typedArray.getBoolean(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    private void initCropFrameStyle(android.content.res.TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_default_crop_frame));
        this.mCropFramePaint.setStrokeWidth(dimensionPixelSize);
        this.mCropFramePaint.setColor(color);
        this.mCropFramePaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mCropFrameCornersPaint.setStrokeWidth(dimensionPixelSize * 3);
        this.mCropFrameCornersPaint.setColor(color);
        this.mCropFrameCornersPaint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    private void initCropGridStyle(android.content.res.TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_default_crop_grid));
        this.mCropGridPaint.setStrokeWidth(dimensionPixelSize);
        this.mCropGridPaint.setColor(color);
        this.mCropGridRowCount = typedArray.getInt(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.mCropGridColumnCount = typedArray.getInt(com.yalantis.ucrop.R.styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    private void smoothToCenter() {
        android.graphics.Point point = new android.graphics.Point((getRight() + getLeft()) / 2, (getTop() + getBottom()) / 2);
        final int centerY = (int) (point.y - this.mCropViewRect.centerY());
        final int centerX = (int) (point.x - this.mCropViewRect.centerX());
        final android.graphics.RectF rectF = new android.graphics.RectF(this.mCropViewRect);
        new android.graphics.RectF(this.mCropViewRect).offset(centerX, centerY);
        android.animation.ValueAnimator valueAnimator = this.smoothAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.smoothAnimator = ofFloat;
        ofFloat.setDuration(1000L);
        this.smoothAnimator.setInterpolator(new android.view.animation.OvershootInterpolator(1.0f));
        this.smoothAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.yalantis.ucrop.view.OverlayView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (com.yalantis.ucrop.view.OverlayView.this.mCallback != null) {
                    com.yalantis.ucrop.view.OverlayView.this.mCallback.onCropRectUpdated(com.yalantis.ucrop.view.OverlayView.this.mCropViewRect);
                }
            }
        });
        this.smoothAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.yalantis.ucrop.view.OverlayView.2
            float lastAnimationValue = 0.0f;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                float floatValue = centerX * ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                float floatValue2 = centerY * ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                com.yalantis.ucrop.view.OverlayView.this.mCropViewRect.set(new android.graphics.RectF(rectF.left + floatValue, rectF.top + floatValue2, rectF.right + floatValue, rectF.bottom + floatValue2));
                com.yalantis.ucrop.view.OverlayView.this.updateGridPoints();
                com.yalantis.ucrop.view.OverlayView.this.postInvalidate();
                if (com.yalantis.ucrop.view.OverlayView.this.mCallback != null) {
                    com.yalantis.ucrop.view.OverlayView.this.mCallback.postTranslate(centerX * (((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue() - this.lastAnimationValue), centerY * (((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue() - this.lastAnimationValue));
                }
                this.lastAnimationValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
            }
        });
        this.smoothAnimator.start();
    }
}
