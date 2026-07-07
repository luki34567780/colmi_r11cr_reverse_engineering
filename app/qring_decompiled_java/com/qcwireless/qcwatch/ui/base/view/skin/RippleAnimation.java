package com.qcwireless.qcwatch.ui.base.view.skin;

/* loaded from: /tmp/dex/classes2.dex */
public class RippleAnimation extends android.view.View {
    private boolean isStarted;
    private android.animation.Animator.AnimatorListener mAnimatorListener;
    private android.animation.ValueAnimator.AnimatorUpdateListener mAnimatorUpdateListener;
    private android.graphics.Bitmap mBackground;
    private int mCurrentRadius;
    private long mDuration;
    private int mMaxRadius;
    private com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.OnAnimationEndListener mOnAnimationEndListener;
    private android.graphics.Paint mPaint;
    private android.view.ViewGroup mRootView;
    private int mStartRadius;
    private float mStartX;
    private float mStartY;

    public interface OnAnimationEndListener {
        void onAnimationEnd();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        return true;
    }

    public static com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation create(android.view.View onClickView) {
        android.content.Context context = onClickView.getContext();
        int width = onClickView.getWidth() / 2;
        int height = onClickView.getHeight() / 2;
        onClickView.getLocationOnScreen(new int[2]);
        return new com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation(context, getAbsoluteX(onClickView) + width, r2[1] + height, java.lang.Math.max(width, height));
    }

    private RippleAnimation(android.content.Context context, float startX, float startY, int radius) {
        super(context);
        this.mRootView = (android.view.ViewGroup) getActivityFromContext(context).getWindow().getDecorView();
        this.mStartX = startX;
        this.mStartY = startY;
        this.mStartRadius = radius;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        updateMaxRadius();
        initListener();
    }

    private android.app.Activity getActivityFromContext(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        throw new java.lang.RuntimeException("Activity not found!");
    }

    public void start(int delay) {
        if (this.isStarted) {
            return;
        }
        this.isStarted = true;
        updateBackground();
        attachToRootView();
        android.animation.ValueAnimator animator = getAnimator();
        animator.setStartDelay(delay);
        animator.start();
    }

    public com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation setDuration(long duration) {
        this.mDuration = duration;
        return this;
    }

    private void initListener() {
        this.mAnimatorListener = new android.animation.AnimatorListenerAdapter() { // from class: com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animation) {
                if (com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.this.mOnAnimationEndListener != null) {
                    com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.this.mOnAnimationEndListener.onAnimationEnd();
                }
                com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.this.isStarted = false;
                com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.this.detachFromRootView();
            }
        };
        this.mAnimatorUpdateListener = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator animation) {
                com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.this.mCurrentRadius = ((int) ((java.lang.Float) animation.getAnimatedValue()).floatValue()) + com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.this.mStartRadius;
                com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.this.postInvalidate();
            }
        };
    }

    private void updateMaxRadius() {
        float f = this.mStartX;
        int i = this.mStartRadius;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f + i, this.mStartY + i);
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF.right, 0.0f, this.mRootView.getRight(), rectF.bottom);
        android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, rectF.bottom, rectF.right, this.mRootView.getBottom());
        android.graphics.RectF rectF4 = new android.graphics.RectF(rectF3.right, rectF.bottom, this.mRootView.getRight(), rectF3.bottom);
        this.mMaxRadius = (int) java.lang.Math.max(java.lang.Math.max(java.lang.Math.sqrt(java.lang.Math.pow(rectF.width(), 2.0d) + java.lang.Math.pow(rectF.height(), 2.0d)), java.lang.Math.sqrt(java.lang.Math.pow(rectF2.width(), 2.0d) + java.lang.Math.pow(rectF2.height(), 2.0d))), java.lang.Math.max(java.lang.Math.sqrt(java.lang.Math.pow(rectF3.width(), 2.0d) + java.lang.Math.pow(rectF3.height(), 2.0d)), java.lang.Math.sqrt(java.lang.Math.pow(rectF4.width(), 2.0d) + java.lang.Math.pow(rectF4.height(), 2.0d))));
    }

    private void attachToRootView() {
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.mRootView.addView(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void detachFromRootView() {
        android.view.ViewGroup viewGroup = this.mRootView;
        if (viewGroup != null) {
            viewGroup.removeView(this);
            this.mRootView = null;
        }
        android.graphics.Bitmap bitmap = this.mBackground;
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                this.mBackground.recycle();
            }
            this.mBackground = null;
        }
        if (this.mPaint != null) {
            this.mPaint = null;
        }
    }

    private void updateBackground() {
        android.graphics.Bitmap bitmap = this.mBackground;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mBackground.recycle();
        }
        this.mRootView.setDrawingCacheEnabled(true);
        android.graphics.Bitmap drawingCache = this.mRootView.getDrawingCache();
        this.mBackground = drawingCache;
        this.mBackground = android.graphics.Bitmap.createBitmap(drawingCache);
        this.mRootView.setDrawingCacheEnabled(false);
    }

    private static float getAbsoluteX(android.view.View view) {
        float x = view.getX();
        java.lang.Object parent = view.getParent();
        return (parent == null || !(parent instanceof android.view.View)) ? x : x + getAbsoluteX((android.view.View) parent);
    }

    private static float getAbsoluteY(android.view.View view) {
        float y = view.getY();
        java.lang.Object parent = view.getParent();
        return (parent == null || !(parent instanceof android.view.View)) ? y : y + getAbsoluteY((android.view.View) parent);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        int saveLayer;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        }
        canvas.drawBitmap(this.mBackground, 0.0f, 0.0f, (android.graphics.Paint) null);
        canvas.drawCircle(this.mStartX, this.mStartY, this.mCurrentRadius, this.mPaint);
        canvas.restoreToCount(saveLayer);
    }

    private android.animation.ValueAnimator getAnimator() {
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, this.mMaxRadius).setDuration(this.mDuration);
        duration.addUpdateListener(this.mAnimatorUpdateListener);
        duration.addListener(this.mAnimatorListener);
        return duration;
    }

    public com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation setOnAnimationEndListener(com.qcwireless.qcwatch.ui.base.view.skin.RippleAnimation.OnAnimationEndListener listener) {
        this.mOnAnimationEndListener = listener;
        return this;
    }
}
