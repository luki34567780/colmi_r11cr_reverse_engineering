package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class LoadingView extends android.widget.LinearLayout {
    private static final int ANIMATION_DURATION = 500;
    private static final float FACTOR = 1.2f;
    private static float mDistance = 200.0f;
    private int mDelay;
    private android.animation.AnimatorSet mDownAnimatorSet;
    private java.lang.Runnable mFreeFallRunnable;
    private android.widget.ImageView mIndicationIm;
    private java.lang.String mLoadText;
    private android.widget.TextView mLoadTextView;
    private com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView mShapeLoadingView;
    private boolean mStopped;
    private int mTextAppearance;
    private android.animation.AnimatorSet mUpAnimatorSet;

    public LoadingView(android.content.Context context) {
        super(context);
        this.mStopped = false;
        this.mFreeFallRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.view.LoadingView.1
            @Override // java.lang.Runnable
            public void run() {
                com.nineoldandroids.view.ViewHelper.setRotation(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mShapeLoadingView, 180.0f);
                com.nineoldandroids.view.ViewHelper.setTranslationY(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mShapeLoadingView, 0.0f);
                com.nineoldandroids.view.ViewHelper.setScaleX(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mIndicationIm, 0.2f);
                com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mStopped = false;
                com.qcwireless.qcwatch.ui.base.view.LoadingView.this.freeFall();
            }
        };
        init(context, null);
    }

    public LoadingView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mStopped = false;
        this.mFreeFallRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.view.LoadingView.1
            @Override // java.lang.Runnable
            public void run() {
                com.nineoldandroids.view.ViewHelper.setRotation(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mShapeLoadingView, 180.0f);
                com.nineoldandroids.view.ViewHelper.setTranslationY(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mShapeLoadingView, 0.0f);
                com.nineoldandroids.view.ViewHelper.setScaleX(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mIndicationIm, 0.2f);
                com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mStopped = false;
                com.qcwireless.qcwatch.ui.base.view.LoadingView.this.freeFall();
            }
        };
        init(context, attrs);
    }

    public LoadingView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mStopped = false;
        this.mFreeFallRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.view.LoadingView.1
            @Override // java.lang.Runnable
            public void run() {
                com.nineoldandroids.view.ViewHelper.setRotation(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mShapeLoadingView, 180.0f);
                com.nineoldandroids.view.ViewHelper.setTranslationY(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mShapeLoadingView, 0.0f);
                com.nineoldandroids.view.ViewHelper.setScaleX(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mIndicationIm, 0.2f);
                com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mStopped = false;
                com.qcwireless.qcwatch.ui.base.view.LoadingView.this.freeFall();
            }
        };
        init(context, attrs);
    }

    public LoadingView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mStopped = false;
        this.mFreeFallRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.view.LoadingView.1
            @Override // java.lang.Runnable
            public void run() {
                com.nineoldandroids.view.ViewHelper.setRotation(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mShapeLoadingView, 180.0f);
                com.nineoldandroids.view.ViewHelper.setTranslationY(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mShapeLoadingView, 0.0f);
                com.nineoldandroids.view.ViewHelper.setScaleX(com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mIndicationIm, 0.2f);
                com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mStopped = false;
                com.qcwireless.qcwatch.ui.base.view.LoadingView.this.freeFall();
            }
        };
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        setOrientation(1);
        mDistance = dip2px(context, 54.0f);
        android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.load_view, (android.view.ViewGroup) this, true);
        this.mShapeLoadingView = (com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView) findViewById(com.qcwireless.qcwatch.R.id.shapeLoadingView);
        this.mIndicationIm = (android.widget.ImageView) findViewById(com.qcwireless.qcwatch.R.id.indication);
        this.mLoadTextView = (android.widget.TextView) findViewById(com.qcwireless.qcwatch.R.id.promptTV);
        com.nineoldandroids.view.ViewHelper.setScaleX(this.mIndicationIm, 0.2f);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.LoadingView);
        java.lang.String string = obtainStyledAttributes.getString(1);
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        this.mDelay = obtainStyledAttributes.getInteger(0, 80);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                this.mLoadTextView.setTextAppearance(resourceId);
            } else {
                this.mLoadTextView.setTextAppearance(getContext(), resourceId);
            }
        }
        setLoadingText(string);
    }

    private int dip2px(android.content.Context context, float dipValue) {
        return (int) ((dipValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getVisibility() == 0) {
            startLoading(this.mDelay);
        }
    }

    private void startLoading(long delay) {
        android.animation.AnimatorSet animatorSet = this.mDownAnimatorSet;
        if (animatorSet == null || !animatorSet.isRunning()) {
            removeCallbacks(this.mFreeFallRunnable);
            if (delay > 0) {
                postDelayed(this.mFreeFallRunnable, delay);
            } else {
                post(this.mFreeFallRunnable);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopLoading();
    }

    private void stopLoading() {
        this.mStopped = true;
        android.animation.AnimatorSet animatorSet = this.mUpAnimatorSet;
        if (animatorSet != null) {
            if (animatorSet.isRunning()) {
                this.mUpAnimatorSet.cancel();
            }
            this.mUpAnimatorSet.removeAllListeners();
            java.util.Iterator<android.animation.Animator> it = this.mUpAnimatorSet.getChildAnimations().iterator();
            while (it.hasNext()) {
                it.next().removeAllListeners();
            }
            this.mUpAnimatorSet = null;
        }
        android.animation.AnimatorSet animatorSet2 = this.mDownAnimatorSet;
        if (animatorSet2 != null) {
            if (animatorSet2.isRunning()) {
                this.mDownAnimatorSet.cancel();
            }
            this.mDownAnimatorSet.removeAllListeners();
            java.util.Iterator<android.animation.Animator> it2 = this.mDownAnimatorSet.getChildAnimations().iterator();
            while (it2.hasNext()) {
                it2.next().removeAllListeners();
            }
            this.mDownAnimatorSet = null;
        }
        removeCallbacks(this.mFreeFallRunnable);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        setVisibility(visibility, this.mDelay);
    }

    public void setVisibility(int visibility, int delay) {
        super.setVisibility(visibility);
        if (visibility == 0) {
            startLoading(delay);
        } else {
            stopLoading();
        }
    }

    public void setDelay(int delay) {
        this.mDelay = delay;
    }

    public int getDelay() {
        return this.mDelay;
    }

    public void setLoadingText(java.lang.CharSequence loadingText) {
        if (android.text.TextUtils.isEmpty(loadingText)) {
            this.mLoadTextView.setVisibility(8);
        } else {
            this.mLoadTextView.setVisibility(0);
        }
        this.mLoadTextView.setText(loadingText);
    }

    public java.lang.CharSequence getLoadingText() {
        return this.mLoadTextView.getText();
    }

    public void upThrow() {
        if (this.mUpAnimatorSet == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.mShapeLoadingView, "translationY", mDistance, 0.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.mIndicationIm, "scaleX", 1.0f, 0.2f);
            android.animation.ObjectAnimator objectAnimator = null;
            int i = com.qcwireless.qcwatch.ui.base.view.LoadingView.AnonymousClass4.$SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape[this.mShapeLoadingView.getShape().ordinal()];
            if (i == 1) {
                objectAnimator = android.animation.ObjectAnimator.ofFloat(this.mShapeLoadingView, "rotation", 0.0f, 180.0f);
            } else if (i == 2) {
                objectAnimator = android.animation.ObjectAnimator.ofFloat(this.mShapeLoadingView, "rotation", 0.0f, 180.0f);
            } else if (i == 3) {
                objectAnimator = android.animation.ObjectAnimator.ofFloat(this.mShapeLoadingView, "rotation", 0.0f, 180.0f);
            }
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.mUpAnimatorSet = animatorSet;
            animatorSet.playTogether(ofFloat, objectAnimator, ofFloat2);
            this.mUpAnimatorSet.setDuration(500L);
            this.mUpAnimatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator(FACTOR));
            this.mUpAnimatorSet.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.qcwireless.qcwatch.ui.base.view.LoadingView.2
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(android.animation.Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animation) {
                    if (com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mStopped) {
                        return;
                    }
                    com.qcwireless.qcwatch.ui.base.view.LoadingView.this.freeFall();
                }
            });
        }
        this.mUpAnimatorSet.start();
    }

    /* renamed from: com.qcwireless.qcwatch.ui.base.view.LoadingView$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape;

        static {
            int[] iArr = new int[com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.values().length];
            $SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape = iArr;
            try {
                iArr[com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_RECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape[com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_CIRCLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape[com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_TRIANGLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public void freeFall() {
        if (this.mDownAnimatorSet == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.mShapeLoadingView, "translationY", 0.0f, mDistance);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.mIndicationIm, "scaleX", 0.2f, 1.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.mDownAnimatorSet = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            this.mDownAnimatorSet.setDuration(500L);
            this.mDownAnimatorSet.setInterpolator(new android.view.animation.AccelerateInterpolator(FACTOR));
            this.mDownAnimatorSet.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.qcwireless.qcwatch.ui.base.view.LoadingView.3
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(android.animation.Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animation) {
                    if (com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mStopped) {
                        return;
                    }
                    com.qcwireless.qcwatch.ui.base.view.LoadingView.this.mShapeLoadingView.changeShape();
                    com.qcwireless.qcwatch.ui.base.view.LoadingView.this.upThrow();
                }
            });
        }
        this.mDownAnimatorSet.start();
    }
}
