package com.luck.picture.lib.photoview;

/* loaded from: /tmp/dex/classes2.dex */
public class PhotoViewAttacher implements android.view.View.OnTouchListener, android.view.View.OnLayoutChangeListener {
    private static final float DEFAULT_MAX_SCALE = 3.0f;
    private static final float DEFAULT_MID_SCALE = 1.75f;
    private static final float DEFAULT_MIN_SCALE = 1.0f;
    private static final int DEFAULT_ZOOM_DURATION = 200;
    private static final int HORIZONTAL_EDGE_BOTH = 2;
    private static final int HORIZONTAL_EDGE_LEFT = 0;
    private static final int HORIZONTAL_EDGE_NONE = -1;
    private static final int HORIZONTAL_EDGE_RIGHT = 1;
    private static final int SINGLE_TOUCH = 1;
    private static final int VERTICAL_EDGE_BOTH = 2;
    private static final int VERTICAL_EDGE_BOTTOM = 1;
    private static final int VERTICAL_EDGE_NONE = -1;
    private static final int VERTICAL_EDGE_TOP = 0;
    private float mBaseRotation;
    private com.luck.picture.lib.photoview.PhotoViewAttacher.FlingRunnable mCurrentFlingRunnable;
    private android.view.GestureDetector mGestureDetector;
    private final android.widget.ImageView mImageView;
    private android.view.View.OnLongClickListener mLongClickListener;
    private com.luck.picture.lib.photoview.OnMatrixChangedListener mMatrixChangeListener;
    private android.view.View.OnClickListener mOnClickListener;
    private com.luck.picture.lib.photoview.OnViewDragListener mOnViewDragListener;
    private com.luck.picture.lib.photoview.OnOutsidePhotoTapListener mOutsidePhotoTapListener;
    private com.luck.picture.lib.photoview.OnPhotoTapListener mPhotoTapListener;
    private com.luck.picture.lib.photoview.OnScaleChangedListener mScaleChangeListener;
    private com.luck.picture.lib.photoview.CustomGestureDetector mScaleDragDetector;
    private com.luck.picture.lib.photoview.OnSingleFlingListener mSingleFlingListener;
    private com.luck.picture.lib.photoview.OnViewTapListener mViewTapListener;
    private final com.luck.picture.lib.photoview.OnGestureListener onGestureListener;
    private android.view.animation.Interpolator mInterpolator = new android.view.animation.AccelerateDecelerateInterpolator();
    private int mZoomDuration = 200;
    private float mMinScale = 1.0f;
    private float mMidScale = DEFAULT_MID_SCALE;
    private float mMaxScale = DEFAULT_MAX_SCALE;
    private boolean mAllowParentInterceptOnEdge = true;
    private boolean mBlockParentIntercept = false;
    private final android.graphics.Matrix mBaseMatrix = new android.graphics.Matrix();
    private final android.graphics.Matrix mDrawMatrix = new android.graphics.Matrix();
    private final android.graphics.Matrix mSuppMatrix = new android.graphics.Matrix();
    private final android.graphics.RectF mDisplayRect = new android.graphics.RectF();
    private final float[] mMatrixValues = new float[9];
    private int mHorizontalScrollEdge = 2;
    private int mVerticalScrollEdge = 2;
    private boolean mZoomEnabled = true;
    private android.widget.ImageView.ScaleType mScaleType = android.widget.ImageView.ScaleType.FIT_CENTER;

    public PhotoViewAttacher(android.widget.ImageView imageView) {
        com.luck.picture.lib.photoview.OnGestureListener onGestureListener = new com.luck.picture.lib.photoview.OnGestureListener() { // from class: com.luck.picture.lib.photoview.PhotoViewAttacher.1
            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onDrag(float f, float f2) {
                if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mScaleDragDetector.isScaling()) {
                    return;
                }
                if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mOnViewDragListener != null) {
                    com.luck.picture.lib.photoview.PhotoViewAttacher.this.mOnViewDragListener.onDrag(f, f2);
                }
                com.luck.picture.lib.photoview.PhotoViewAttacher.this.mSuppMatrix.postTranslate(f, f2);
                com.luck.picture.lib.photoview.PhotoViewAttacher.this.checkAndDisplayMatrix();
                android.view.ViewParent parent = com.luck.picture.lib.photoview.PhotoViewAttacher.this.mImageView.getParent();
                if (!com.luck.picture.lib.photoview.PhotoViewAttacher.this.mAllowParentInterceptOnEdge || com.luck.picture.lib.photoview.PhotoViewAttacher.this.mScaleDragDetector.isScaling() || com.luck.picture.lib.photoview.PhotoViewAttacher.this.mBlockParentIntercept) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((com.luck.picture.lib.photoview.PhotoViewAttacher.this.mHorizontalScrollEdge == 2 || ((com.luck.picture.lib.photoview.PhotoViewAttacher.this.mHorizontalScrollEdge == 0 && f >= 1.0f) || ((com.luck.picture.lib.photoview.PhotoViewAttacher.this.mHorizontalScrollEdge == 1 && f <= -1.0f) || ((com.luck.picture.lib.photoview.PhotoViewAttacher.this.mVerticalScrollEdge == 0 && f2 >= 1.0f) || (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mVerticalScrollEdge == 1 && f2 <= -1.0f))))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }

            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onFling(float f, float f2, float f3, float f4) {
                com.luck.picture.lib.photoview.PhotoViewAttacher photoViewAttacher = com.luck.picture.lib.photoview.PhotoViewAttacher.this;
                photoViewAttacher.mCurrentFlingRunnable = photoViewAttacher.new FlingRunnable(photoViewAttacher.mImageView.getContext());
                com.luck.picture.lib.photoview.PhotoViewAttacher.FlingRunnable flingRunnable = com.luck.picture.lib.photoview.PhotoViewAttacher.this.mCurrentFlingRunnable;
                com.luck.picture.lib.photoview.PhotoViewAttacher photoViewAttacher2 = com.luck.picture.lib.photoview.PhotoViewAttacher.this;
                int imageViewWidth = photoViewAttacher2.getImageViewWidth(photoViewAttacher2.mImageView);
                com.luck.picture.lib.photoview.PhotoViewAttacher photoViewAttacher3 = com.luck.picture.lib.photoview.PhotoViewAttacher.this;
                flingRunnable.fling(imageViewWidth, photoViewAttacher3.getImageViewHeight(photoViewAttacher3.mImageView), (int) f3, (int) f4);
                com.luck.picture.lib.photoview.PhotoViewAttacher.this.mImageView.post(com.luck.picture.lib.photoview.PhotoViewAttacher.this.mCurrentFlingRunnable);
            }

            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onScale(float f, float f2, float f3) {
                onScale(f, f2, f3, 0.0f, 0.0f);
            }

            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onScale(float f, float f2, float f3, float f4, float f5) {
                if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.getScale() < com.luck.picture.lib.photoview.PhotoViewAttacher.this.mMaxScale || f < 1.0f) {
                    if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mScaleChangeListener != null) {
                        com.luck.picture.lib.photoview.PhotoViewAttacher.this.mScaleChangeListener.onScaleChange(f, f2, f3);
                    }
                    com.luck.picture.lib.photoview.PhotoViewAttacher.this.mSuppMatrix.postScale(f, f, f2, f3);
                    com.luck.picture.lib.photoview.PhotoViewAttacher.this.mSuppMatrix.postTranslate(f4, f5);
                    com.luck.picture.lib.photoview.PhotoViewAttacher.this.checkAndDisplayMatrix();
                }
            }
        };
        this.onGestureListener = onGestureListener;
        this.mImageView = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.mBaseRotation = 0.0f;
        this.mScaleDragDetector = new com.luck.picture.lib.photoview.CustomGestureDetector(imageView.getContext(), onGestureListener);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(imageView.getContext(), new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.luck.picture.lib.photoview.PhotoViewAttacher.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(android.view.MotionEvent motionEvent) {
                if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mLongClickListener != null) {
                    com.luck.picture.lib.photoview.PhotoViewAttacher.this.mLongClickListener.onLongClick(com.luck.picture.lib.photoview.PhotoViewAttacher.this.mImageView);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
                if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mSingleFlingListener == null || com.luck.picture.lib.photoview.PhotoViewAttacher.this.getScale() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                return com.luck.picture.lib.photoview.PhotoViewAttacher.this.mSingleFlingListener.onFling(motionEvent, motionEvent2, f, f2);
            }
        });
        this.mGestureDetector = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new android.view.GestureDetector.OnDoubleTapListener() { // from class: com.luck.picture.lib.photoview.PhotoViewAttacher.3
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mOnClickListener != null) {
                    com.luck.picture.lib.photoview.PhotoViewAttacher.this.mOnClickListener.onClick(com.luck.picture.lib.photoview.PhotoViewAttacher.this.mImageView);
                }
                android.graphics.RectF displayRect = com.luck.picture.lib.photoview.PhotoViewAttacher.this.getDisplayRect();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mViewTapListener != null) {
                    com.luck.picture.lib.photoview.PhotoViewAttacher.this.mViewTapListener.onViewTap(com.luck.picture.lib.photoview.PhotoViewAttacher.this.mImageView, x, y);
                }
                if (displayRect == null) {
                    return false;
                }
                if (!displayRect.contains(x, y)) {
                    if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mOutsidePhotoTapListener == null) {
                        return false;
                    }
                    com.luck.picture.lib.photoview.PhotoViewAttacher.this.mOutsidePhotoTapListener.onOutsidePhotoTap(com.luck.picture.lib.photoview.PhotoViewAttacher.this.mImageView);
                    return false;
                }
                float width = (x - displayRect.left) / displayRect.width();
                float height = (y - displayRect.top) / displayRect.height();
                if (com.luck.picture.lib.photoview.PhotoViewAttacher.this.mPhotoTapListener == null) {
                    return true;
                }
                com.luck.picture.lib.photoview.PhotoViewAttacher.this.mPhotoTapListener.onPhotoTap(com.luck.picture.lib.photoview.PhotoViewAttacher.this.mImageView, width, height);
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                try {
                    float scale = com.luck.picture.lib.photoview.PhotoViewAttacher.this.getScale();
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (scale < com.luck.picture.lib.photoview.PhotoViewAttacher.this.getMediumScale()) {
                        com.luck.picture.lib.photoview.PhotoViewAttacher photoViewAttacher = com.luck.picture.lib.photoview.PhotoViewAttacher.this;
                        photoViewAttacher.setScale(photoViewAttacher.getMediumScale(), x, y, true);
                    } else if (scale >= com.luck.picture.lib.photoview.PhotoViewAttacher.this.getMediumScale() && scale < com.luck.picture.lib.photoview.PhotoViewAttacher.this.getMaximumScale()) {
                        com.luck.picture.lib.photoview.PhotoViewAttacher photoViewAttacher2 = com.luck.picture.lib.photoview.PhotoViewAttacher.this;
                        photoViewAttacher2.setScale(photoViewAttacher2.getMaximumScale(), x, y, true);
                    } else {
                        com.luck.picture.lib.photoview.PhotoViewAttacher photoViewAttacher3 = com.luck.picture.lib.photoview.PhotoViewAttacher.this;
                        photoViewAttacher3.setScale(photoViewAttacher3.getMinimumScale(), x, y, true);
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                }
                return true;
            }
        });
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mGestureDetector.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnScaleChangeListener(com.luck.picture.lib.photoview.OnScaleChangedListener onScaleChangedListener) {
        this.mScaleChangeListener = onScaleChangedListener;
    }

    public void setOnSingleFlingListener(com.luck.picture.lib.photoview.OnSingleFlingListener onSingleFlingListener) {
        this.mSingleFlingListener = onSingleFlingListener;
    }

    @java.lang.Deprecated
    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public android.graphics.RectF getDisplayRect() {
        checkMatrixBounds();
        return getDisplayRect(getDrawMatrix());
    }

    public boolean setDisplayMatrix(android.graphics.Matrix matrix) {
        if (matrix == null) {
            throw new java.lang.IllegalArgumentException("Matrix cannot be null");
        }
        if (this.mImageView.getDrawable() == null) {
            return false;
        }
        this.mSuppMatrix.set(matrix);
        checkAndDisplayMatrix();
        return true;
    }

    public void setBaseRotation(float f) {
        this.mBaseRotation = f % 360.0f;
        update();
        setRotationBy(this.mBaseRotation);
        checkAndDisplayMatrix();
    }

    public void setRotationTo(float f) {
        this.mSuppMatrix.setRotate(f % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setRotationBy(float f) {
        this.mSuppMatrix.postRotate(f % 360.0f);
        checkAndDisplayMatrix();
    }

    public float getMinimumScale() {
        return this.mMinScale;
    }

    public float getMediumScale() {
        return this.mMidScale;
    }

    public float getMaximumScale() {
        return this.mMaxScale;
    }

    public float getScale() {
        return (float) java.lang.Math.sqrt(((float) java.lang.Math.pow(getValue(this.mSuppMatrix, 0), 2.0d)) + ((float) java.lang.Math.pow(getValue(this.mSuppMatrix, 3), 2.0d)));
    }

    public android.widget.ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        updateBaseMatrix(this.mImageView.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.mZoomEnabled
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lbe
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = com.luck.picture.lib.photoview.Util.hasDrawable(r0)
            if (r0 == 0) goto Lbe
            int r0 = r12.getAction()
            if (r0 == 0) goto L6e
            if (r0 == r2) goto L1b
            r3 = 3
            if (r0 == r3) goto L1b
            goto L7a
        L1b:
            float r0 = r10.getScale()
            float r3 = r10.mMinScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L44
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L7a
            com.luck.picture.lib.photoview.PhotoViewAttacher$AnimatedZoomRunnable r9 = new com.luck.picture.lib.photoview.PhotoViewAttacher$AnimatedZoomRunnable
            float r5 = r10.getScale()
            float r6 = r10.mMinScale
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L6c
        L44:
            float r0 = r10.getScale()
            float r3 = r10.mMaxScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7a
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L7a
            com.luck.picture.lib.photoview.PhotoViewAttacher$AnimatedZoomRunnable r9 = new com.luck.picture.lib.photoview.PhotoViewAttacher$AnimatedZoomRunnable
            float r5 = r10.getScale()
            float r6 = r10.mMaxScale
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L6c:
            r11 = 1
            goto L7b
        L6e:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L77
            r11.requestDisallowInterceptTouchEvent(r2)
        L77:
            r10.cancelFling()
        L7a:
            r11 = 0
        L7b:
            com.luck.picture.lib.photoview.CustomGestureDetector r0 = r10.mScaleDragDetector
            if (r0 == 0) goto Lb2
            boolean r11 = r0.isScaling()
            com.luck.picture.lib.photoview.CustomGestureDetector r0 = r10.mScaleDragDetector
            boolean r0 = r0.isDragging()
            com.luck.picture.lib.photoview.CustomGestureDetector r3 = r10.mScaleDragDetector
            boolean r3 = r3.onTouchEvent(r12)
            if (r11 != 0) goto L9b
            com.luck.picture.lib.photoview.CustomGestureDetector r11 = r10.mScaleDragDetector
            boolean r11 = r11.isScaling()
            if (r11 != 0) goto L9b
            r11 = 1
            goto L9c
        L9b:
            r11 = 0
        L9c:
            if (r0 != 0) goto La8
            com.luck.picture.lib.photoview.CustomGestureDetector r0 = r10.mScaleDragDetector
            boolean r0 = r0.isDragging()
            if (r0 != 0) goto La8
            r0 = 1
            goto La9
        La8:
            r0 = 0
        La9:
            if (r11 == 0) goto Lae
            if (r0 == 0) goto Lae
            r1 = 1
        Lae:
            r10.mBlockParentIntercept = r1
            r1 = r3
            goto Lb3
        Lb2:
            r1 = r11
        Lb3:
            android.view.GestureDetector r11 = r10.mGestureDetector
            if (r11 == 0) goto Lbe
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto Lbe
            r1 = 1
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.photoview.PhotoViewAttacher.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.mAllowParentInterceptOnEdge = z;
    }

    public void setMinimumScale(float f) {
        com.luck.picture.lib.photoview.Util.checkZoomLevels(f, this.mMidScale, this.mMaxScale);
        this.mMinScale = f;
    }

    public void setMediumScale(float f) {
        com.luck.picture.lib.photoview.Util.checkZoomLevels(this.mMinScale, f, this.mMaxScale);
        this.mMidScale = f;
    }

    public void setMaximumScale(float f) {
        com.luck.picture.lib.photoview.Util.checkZoomLevels(this.mMinScale, this.mMidScale, f);
        this.mMaxScale = f;
    }

    public void setScaleLevels(float f, float f2, float f3) {
        com.luck.picture.lib.photoview.Util.checkZoomLevels(f, f2, f3);
        this.mMinScale = f;
        this.mMidScale = f2;
        this.mMaxScale = f3;
    }

    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    public void setOnMatrixChangeListener(com.luck.picture.lib.photoview.OnMatrixChangedListener onMatrixChangedListener) {
        this.mMatrixChangeListener = onMatrixChangedListener;
    }

    public void setOnPhotoTapListener(com.luck.picture.lib.photoview.OnPhotoTapListener onPhotoTapListener) {
        this.mPhotoTapListener = onPhotoTapListener;
    }

    public void setOnOutsidePhotoTapListener(com.luck.picture.lib.photoview.OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.mOutsidePhotoTapListener = onOutsidePhotoTapListener;
    }

    public void setOnViewTapListener(com.luck.picture.lib.photoview.OnViewTapListener onViewTapListener) {
        this.mViewTapListener = onViewTapListener;
    }

    public void setOnViewDragListener(com.luck.picture.lib.photoview.OnViewDragListener onViewDragListener) {
        this.mOnViewDragListener = onViewDragListener;
    }

    public void setScale(float f) {
        setScale(f, false);
    }

    public void setScale(float f, boolean z) {
        setScale(f, this.mImageView.getRight() / 2, this.mImageView.getBottom() / 2, z);
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        if (f < this.mMinScale || f > this.mMaxScale) {
            throw new java.lang.IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.mImageView.post(new com.luck.picture.lib.photoview.PhotoViewAttacher.AnimatedZoomRunnable(getScale(), f, f2, f3));
        } else {
            this.mSuppMatrix.setScale(f, f, f2, f3);
            checkAndDisplayMatrix();
        }
    }

    public void setZoomInterpolator(android.view.animation.Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        if (!com.luck.picture.lib.photoview.Util.isSupportedScaleType(scaleType) || scaleType == this.mScaleType) {
            return;
        }
        this.mScaleType = scaleType;
        update();
    }

    public boolean isZoomable() {
        return this.mZoomEnabled;
    }

    public void setZoomable(boolean z) {
        this.mZoomEnabled = z;
        update();
    }

    public void update() {
        if (this.mZoomEnabled) {
            updateBaseMatrix(this.mImageView.getDrawable());
        } else {
            resetMatrix();
        }
    }

    public void getDisplayMatrix(android.graphics.Matrix matrix) {
        matrix.set(getDrawMatrix());
    }

    public void getSuppMatrix(android.graphics.Matrix matrix) {
        matrix.set(this.mSuppMatrix);
    }

    private android.graphics.Matrix getDrawMatrix() {
        this.mDrawMatrix.set(this.mBaseMatrix);
        this.mDrawMatrix.postConcat(this.mSuppMatrix);
        return this.mDrawMatrix;
    }

    public android.graphics.Matrix getImageMatrix() {
        return this.mDrawMatrix;
    }

    public void setZoomTransitionDuration(int i) {
        this.mZoomDuration = i;
    }

    private float getValue(android.graphics.Matrix matrix, int i) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i];
    }

    private void resetMatrix() {
        this.mSuppMatrix.reset();
        setRotationBy(this.mBaseRotation);
        setImageViewMatrix(getDrawMatrix());
        checkMatrixBounds();
    }

    private void setImageViewMatrix(android.graphics.Matrix matrix) {
        android.graphics.RectF displayRect;
        this.mImageView.setImageMatrix(matrix);
        if (this.mMatrixChangeListener == null || (displayRect = getDisplayRect(matrix)) == null) {
            return;
        }
        this.mMatrixChangeListener.onMatrixChanged(displayRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndDisplayMatrix() {
        if (checkMatrixBounds()) {
            setImageViewMatrix(getDrawMatrix());
        }
    }

    private android.graphics.RectF getDisplayRect(android.graphics.Matrix matrix) {
        if (this.mImageView.getDrawable() == null) {
            return null;
        }
        this.mDisplayRect.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.mDisplayRect);
        return this.mDisplayRect;
    }

    private void updateBaseMatrix(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float imageViewWidth = getImageViewWidth(this.mImageView);
        float imageViewHeight = getImageViewHeight(this.mImageView);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.mBaseMatrix.reset();
        float f = intrinsicWidth;
        float f2 = imageViewWidth / f;
        float f3 = intrinsicHeight;
        float f4 = imageViewHeight / f3;
        if (this.mScaleType == android.widget.ImageView.ScaleType.CENTER) {
            this.mBaseMatrix.postTranslate((imageViewWidth - f) / 2.0f, (imageViewHeight - f3) / 2.0f);
        } else if (this.mScaleType == android.widget.ImageView.ScaleType.CENTER_CROP) {
            float max = java.lang.Math.max(f2, f4);
            this.mBaseMatrix.postScale(max, max);
            this.mBaseMatrix.postTranslate((imageViewWidth - (f * max)) / 2.0f, (imageViewHeight - (f3 * max)) / 2.0f);
        } else if (this.mScaleType == android.widget.ImageView.ScaleType.CENTER_INSIDE) {
            float min = java.lang.Math.min(1.0f, java.lang.Math.min(f2, f4));
            this.mBaseMatrix.postScale(min, min);
            this.mBaseMatrix.postTranslate((imageViewWidth - (f * min)) / 2.0f, (imageViewHeight - (f3 * min)) / 2.0f);
        } else {
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f, f3);
            android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, 0.0f, imageViewWidth, imageViewHeight);
            if (((int) this.mBaseRotation) % 180 != 0) {
                rectF = new android.graphics.RectF(0.0f, 0.0f, f3, f);
            }
            int i = com.luck.picture.lib.photoview.PhotoViewAttacher.AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i == 1) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.FILL);
            }
        }
        resetMatrix();
    }

    /* renamed from: com.luck.picture.lib.photoview.PhotoViewAttacher$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[android.widget.ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private boolean checkMatrixBounds() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        android.graphics.RectF displayRect = getDisplayRect(getDrawMatrix());
        if (displayRect == null) {
            return false;
        }
        float height = displayRect.height();
        float width = displayRect.width();
        float imageViewHeight = getImageViewHeight(this.mImageView);
        float f6 = 0.0f;
        if (height <= imageViewHeight) {
            int i = com.luck.picture.lib.photoview.PhotoViewAttacher.AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    f4 = imageViewHeight - height;
                    f5 = displayRect.top;
                } else {
                    f4 = (imageViewHeight - height) / 2.0f;
                    f5 = displayRect.top;
                }
                f = f4 - f5;
            } else {
                f = -displayRect.top;
            }
            this.mVerticalScrollEdge = 2;
        } else if (displayRect.top > 0.0f) {
            this.mVerticalScrollEdge = 0;
            f = -displayRect.top;
        } else if (displayRect.bottom < imageViewHeight) {
            this.mVerticalScrollEdge = 1;
            f = imageViewHeight - displayRect.bottom;
        } else {
            this.mVerticalScrollEdge = -1;
            f = 0.0f;
        }
        float imageViewWidth = getImageViewWidth(this.mImageView);
        if (width <= imageViewWidth) {
            int i2 = com.luck.picture.lib.photoview.PhotoViewAttacher.AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    f2 = imageViewWidth - width;
                    f3 = displayRect.left;
                } else {
                    f2 = (imageViewWidth - width) / 2.0f;
                    f3 = displayRect.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -displayRect.left;
            }
            this.mHorizontalScrollEdge = 2;
        } else if (displayRect.left > 0.0f) {
            this.mHorizontalScrollEdge = 0;
            f6 = -displayRect.left;
        } else if (displayRect.right < imageViewWidth) {
            f6 = imageViewWidth - displayRect.right;
            this.mHorizontalScrollEdge = 1;
        } else {
            this.mHorizontalScrollEdge = -1;
        }
        this.mSuppMatrix.postTranslate(f6, f);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageViewWidth(android.widget.ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageViewHeight(android.widget.ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    private void cancelFling() {
        com.luck.picture.lib.photoview.PhotoViewAttacher.FlingRunnable flingRunnable = this.mCurrentFlingRunnable;
        if (flingRunnable != null) {
            flingRunnable.cancelFling();
            this.mCurrentFlingRunnable = null;
        }
    }

    private class AnimatedZoomRunnable implements java.lang.Runnable {
        private final float mFocalX;
        private final float mFocalY;
        private final long mStartTime = java.lang.System.currentTimeMillis();
        private final float mZoomEnd;
        private final float mZoomStart;

        public AnimatedZoomRunnable(float f, float f2, float f3, float f4) {
            this.mFocalX = f3;
            this.mFocalY = f4;
            this.mZoomStart = f;
            this.mZoomEnd = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            float interpolate = interpolate();
            float f = this.mZoomStart;
            com.luck.picture.lib.photoview.PhotoViewAttacher.this.onGestureListener.onScale((f + ((this.mZoomEnd - f) * interpolate)) / com.luck.picture.lib.photoview.PhotoViewAttacher.this.getScale(), this.mFocalX, this.mFocalY);
            if (interpolate < 1.0f) {
                com.luck.picture.lib.photoview.Compat.postOnAnimation(com.luck.picture.lib.photoview.PhotoViewAttacher.this.mImageView, this);
            }
        }

        private float interpolate() {
            return com.luck.picture.lib.photoview.PhotoViewAttacher.this.mInterpolator.getInterpolation(java.lang.Math.min(1.0f, ((java.lang.System.currentTimeMillis() - this.mStartTime) * 1.0f) / com.luck.picture.lib.photoview.PhotoViewAttacher.this.mZoomDuration));
        }
    }

    private class FlingRunnable implements java.lang.Runnable {
        private int mCurrentX;
        private int mCurrentY;
        private final android.widget.OverScroller mScroller;

        public FlingRunnable(android.content.Context context) {
            this.mScroller = new android.widget.OverScroller(context);
        }

        public void cancelFling() {
            this.mScroller.forceFinished(true);
        }

        public void fling(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            android.graphics.RectF displayRect = com.luck.picture.lib.photoview.PhotoViewAttacher.this.getDisplayRect();
            if (displayRect == null) {
                return;
            }
            int round = java.lang.Math.round(-displayRect.left);
            float f = i;
            if (f < displayRect.width()) {
                i6 = java.lang.Math.round(displayRect.width() - f);
                i5 = 0;
            } else {
                i5 = round;
                i6 = i5;
            }
            int round2 = java.lang.Math.round(-displayRect.top);
            float f2 = i2;
            if (f2 < displayRect.height()) {
                i8 = java.lang.Math.round(displayRect.height() - f2);
                i7 = 0;
            } else {
                i7 = round2;
                i8 = i7;
            }
            this.mCurrentX = round;
            this.mCurrentY = round2;
            if (round == i6 && round2 == i8) {
                return;
            }
            this.mScroller.fling(round, round2, i3, i4, i5, i6, i7, i8, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                com.luck.picture.lib.photoview.PhotoViewAttacher.this.mSuppMatrix.postTranslate(this.mCurrentX - currX, this.mCurrentY - currY);
                com.luck.picture.lib.photoview.PhotoViewAttacher.this.checkAndDisplayMatrix();
                this.mCurrentX = currX;
                this.mCurrentY = currY;
                com.luck.picture.lib.photoview.Compat.postOnAnimation(com.luck.picture.lib.photoview.PhotoViewAttacher.this.mImageView, this);
            }
        }
    }
}
