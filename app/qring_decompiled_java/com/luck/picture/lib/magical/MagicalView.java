package com.luck.picture.lib.magical;

/* loaded from: /tmp/dex/classes2.dex */
public class MagicalView extends android.widget.FrameLayout {
    private final long animationDuration;
    private final int appInScreenHeight;
    private final android.view.View backgroundView;
    private final android.widget.FrameLayout contentLayout;
    private boolean isAnimating;
    private final boolean isPreviewFullScreenMode;
    private float mAlpha;
    private int mOriginHeight;
    private int mOriginLeft;
    private int mOriginTop;
    private int mOriginWidth;
    private final com.luck.picture.lib.magical.MagicalViewWrapper magicalWrapper;
    private com.luck.picture.lib.magical.OnMagicalViewCallback onMagicalViewCallback;
    private int realHeight;
    private int realWidth;
    private int screenHeight;
    private int screenWidth;
    private final com.luck.picture.lib.config.SelectorConfig selectorConfig;
    private int startX;
    private int startY;
    private int targetEndLeft;
    private int targetImageHeight;
    private int targetImageTop;
    private int targetImageWidth;

    public MagicalView(android.content.Context context) {
        this(context, null);
    }

    public MagicalView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MagicalView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAlpha = 0.0f;
        this.animationDuration = 250L;
        this.isAnimating = false;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
        this.selectorConfig = selectorConfig;
        this.isPreviewFullScreenMode = selectorConfig.isPreviewFullScreenMode;
        this.appInScreenHeight = com.luck.picture.lib.utils.DensityUtil.getRealScreenHeight(getContext());
        getScreenSize();
        android.view.View view = new android.view.View(context);
        this.backgroundView = view;
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        view.setAlpha(this.mAlpha);
        addView(view);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.contentLayout = frameLayout;
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.magicalWrapper = new com.luck.picture.lib.magical.MagicalViewWrapper(frameLayout);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.backgroundView.setBackgroundColor(i);
    }

    public void startNormal(int i, int i2, boolean z) {
        this.realWidth = i;
        this.realHeight = i2;
        this.mOriginLeft = 0;
        this.mOriginTop = 0;
        this.mOriginWidth = 0;
        this.mOriginHeight = 0;
        setVisibility(0);
        setOriginParams();
        showNormalMin(this.targetImageTop, this.targetEndLeft, this.targetImageWidth, this.targetImageHeight);
        if (z) {
            this.mAlpha = 1.0f;
            this.backgroundView.setAlpha(1.0f);
        } else {
            this.mAlpha = 0.0f;
            this.backgroundView.setAlpha(0.0f);
            this.contentLayout.setAlpha(0.0f);
            this.contentLayout.animate().alpha(1.0f).setDuration(250L).start();
            this.backgroundView.animate().alpha(1.0f).setDuration(250L).start();
        }
        setShowEndParams();
    }

    public void start(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
            this.mAlpha = 1.0f;
        } else {
            f = 0.0f;
        }
        this.mAlpha = f;
        this.backgroundView.setAlpha(f);
        setVisibility(0);
        setOriginParams();
        beginShow(z);
    }

    public void resetStart() {
        getScreenSize();
        start(true);
    }

    private void getScreenSize() {
        this.screenWidth = com.luck.picture.lib.utils.DensityUtil.getRealScreenWidth(getContext());
        if (this.isPreviewFullScreenMode) {
            this.screenHeight = com.luck.picture.lib.utils.DensityUtil.getRealScreenHeight(getContext());
        } else {
            this.screenHeight = com.luck.picture.lib.utils.DensityUtil.getScreenHeight(getContext());
        }
    }

    public void changeRealScreenHeight(int i, int i2, boolean z) {
        int i3;
        int i4;
        if (this.isPreviewFullScreenMode || (i3 = this.screenWidth) > (i4 = this.screenHeight)) {
            return;
        }
        if (((int) (i3 / (i / i2))) > i4) {
            this.screenHeight = this.appInScreenHeight;
            if (z) {
                this.magicalWrapper.setWidth(i3);
                this.magicalWrapper.setHeight(this.screenHeight);
            }
        }
    }

    public void resetStartNormal(int i, int i2, boolean z) {
        getScreenSize();
        startNormal(i, i2, z);
    }

    public void setViewParams(int i, int i2, int i3, int i4, int i5, int i6) {
        this.realWidth = i5;
        this.realHeight = i6;
        this.mOriginLeft = i;
        this.mOriginTop = i2;
        this.mOriginWidth = i3;
        this.mOriginHeight = i4;
    }

    private void setOriginParams() {
        this.contentLayout.getLocationOnScreen(new int[2]);
        this.targetEndLeft = 0;
        int i = this.screenWidth;
        int i2 = this.screenHeight;
        float f = i / i2;
        int i3 = this.realWidth;
        int i4 = this.realHeight;
        if (f < i3 / i4) {
            this.targetImageWidth = i;
            int i5 = (int) (i * (i4 / i3));
            this.targetImageHeight = i5;
            this.targetImageTop = (i2 - i5) / 2;
        } else {
            this.targetImageHeight = i2;
            int i6 = (int) (i2 * (i3 / i4));
            this.targetImageWidth = i6;
            this.targetImageTop = 0;
            this.targetEndLeft = (i - i6) / 2;
        }
        this.magicalWrapper.setWidth(this.mOriginWidth);
        this.magicalWrapper.setHeight(this.mOriginHeight);
        this.magicalWrapper.setMarginLeft(this.mOriginLeft);
        this.magicalWrapper.setMarginTop(this.mOriginTop);
    }

    private void beginShow(boolean z) {
        android.view.animation.Interpolator newInterpolator;
        if (z) {
            this.mAlpha = 1.0f;
            this.backgroundView.setAlpha(1.0f);
            showNormalMin(this.targetImageTop, this.targetEndLeft, this.targetImageWidth, this.targetImageHeight);
            setShowEndParams();
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.luck.picture.lib.magical.MagicalView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.luck.picture.lib.magical.MagicalView.this.showNormalMin(floatValue, r0.mOriginTop, com.luck.picture.lib.magical.MagicalView.this.targetImageTop, com.luck.picture.lib.magical.MagicalView.this.mOriginLeft, com.luck.picture.lib.magical.MagicalView.this.targetEndLeft, com.luck.picture.lib.magical.MagicalView.this.mOriginWidth, com.luck.picture.lib.magical.MagicalView.this.targetImageWidth, com.luck.picture.lib.magical.MagicalView.this.mOriginHeight, com.luck.picture.lib.magical.MagicalView.this.targetImageHeight);
            }
        });
        ofFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.luck.picture.lib.magical.MagicalView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.luck.picture.lib.magical.MagicalView.this.setShowEndParams();
            }
        });
        if (this.selectorConfig.interpolatorFactory != null && (newInterpolator = this.selectorConfig.interpolatorFactory.newInterpolator()) != null) {
            ofFloat.setInterpolator(newInterpolator);
        }
        ofFloat.setDuration(250L).start();
        changeBackgroundViewAlpha(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowEndParams() {
        this.isAnimating = false;
        changeContentViewToFullscreen();
        com.luck.picture.lib.magical.OnMagicalViewCallback onMagicalViewCallback = this.onMagicalViewCallback;
        if (onMagicalViewCallback != null) {
            onMagicalViewCallback.onBeginMagicalAnimComplete(this, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNormalMin(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        showNormalMin(false, f, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    private void showNormalMin(float f, float f2, float f3, float f4) {
        showNormalMin(true, 0.0f, 0.0f, f, 0.0f, f2, 0.0f, f3, 0.0f, f4);
    }

    private void showNormalMin(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (z) {
            this.magicalWrapper.setWidth(f7);
            this.magicalWrapper.setHeight(f9);
            this.magicalWrapper.setMarginLeft((int) f5);
            this.magicalWrapper.setMarginTop((int) f3);
            return;
        }
        float f10 = (f5 - f4) * f;
        float f11 = (f7 - f6) * f;
        float f12 = (f9 - f8) * f;
        this.magicalWrapper.setWidth(f6 + f11);
        this.magicalWrapper.setHeight(f8 + f12);
        this.magicalWrapper.setMarginLeft((int) (f4 + f10));
        this.magicalWrapper.setMarginTop((int) (f2 + (f * (f3 - f2))));
    }

    public void backToMin() {
        if (this.isAnimating) {
            return;
        }
        if (this.mOriginWidth == 0 || this.mOriginHeight == 0) {
            backToMinWithoutView();
            return;
        }
        com.luck.picture.lib.magical.OnMagicalViewCallback onMagicalViewCallback = this.onMagicalViewCallback;
        if (onMagicalViewCallback != null) {
            onMagicalViewCallback.onBeginBackMinAnim();
        }
        beginBackToMin(false);
        backToMinWithTransition();
    }

    private void backToMinWithTransition() {
        this.contentLayout.post(new java.lang.Runnable() { // from class: com.luck.picture.lib.magical.MagicalView.3
            @Override // java.lang.Runnable
            public void run() {
                android.transition.TransitionManager.beginDelayedTransition((android.view.ViewGroup) com.luck.picture.lib.magical.MagicalView.this.contentLayout.getParent(), new android.transition.TransitionSet().setDuration(250L).addTransition(new android.transition.ChangeBounds()).addTransition(new android.transition.ChangeTransform()).addTransition(new android.transition.ChangeImageTransform()));
                com.luck.picture.lib.magical.MagicalView.this.beginBackToMin(true);
                com.luck.picture.lib.magical.MagicalView.this.contentLayout.setTranslationX(0.0f);
                com.luck.picture.lib.magical.MagicalView.this.contentLayout.setTranslationY(0.0f);
                com.luck.picture.lib.magical.MagicalView.this.magicalWrapper.setWidth(com.luck.picture.lib.magical.MagicalView.this.mOriginWidth);
                com.luck.picture.lib.magical.MagicalView.this.magicalWrapper.setHeight(com.luck.picture.lib.magical.MagicalView.this.mOriginHeight);
                com.luck.picture.lib.magical.MagicalView.this.magicalWrapper.setMarginTop(com.luck.picture.lib.magical.MagicalView.this.mOriginTop);
                com.luck.picture.lib.magical.MagicalView.this.magicalWrapper.setMarginLeft(com.luck.picture.lib.magical.MagicalView.this.mOriginLeft);
                com.luck.picture.lib.magical.MagicalView.this.changeBackgroundViewAlpha(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void beginBackToMin(boolean z) {
        if (z) {
            this.onMagicalViewCallback.onBeginBackMinMagicalFinish(true);
        }
    }

    private void backToMinWithoutView() {
        this.contentLayout.animate().alpha(0.0f).setDuration(250L).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.luck.picture.lib.magical.MagicalView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (com.luck.picture.lib.magical.MagicalView.this.onMagicalViewCallback != null) {
                    com.luck.picture.lib.magical.MagicalView.this.onMagicalViewCallback.onMagicalViewFinish();
                }
            }
        }).start();
        this.backgroundView.animate().alpha(0.0f).setDuration(250L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeBackgroundViewAlpha(final boolean z) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.mAlpha, z ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.luck.picture.lib.magical.MagicalView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.luck.picture.lib.magical.MagicalView.this.isAnimating = true;
                com.luck.picture.lib.magical.MagicalView.this.mAlpha = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.luck.picture.lib.magical.MagicalView.this.backgroundView.setAlpha(com.luck.picture.lib.magical.MagicalView.this.mAlpha);
                if (com.luck.picture.lib.magical.MagicalView.this.onMagicalViewCallback != null) {
                    com.luck.picture.lib.magical.MagicalView.this.onMagicalViewCallback.onBackgroundAlpha(com.luck.picture.lib.magical.MagicalView.this.mAlpha);
                }
            }
        });
        ofFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.luck.picture.lib.magical.MagicalView.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.luck.picture.lib.magical.MagicalView.this.isAnimating = false;
                if (!z || com.luck.picture.lib.magical.MagicalView.this.onMagicalViewCallback == null) {
                    return;
                }
                com.luck.picture.lib.magical.MagicalView.this.onMagicalViewCallback.onMagicalViewFinish();
            }
        });
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public void setMagicalContent(android.view.View view) {
        this.contentLayout.addView(view);
    }

    private void changeContentViewToFullscreen() {
        int i = this.screenHeight;
        this.targetImageHeight = i;
        this.targetImageWidth = this.screenWidth;
        this.targetImageTop = 0;
        this.magicalWrapper.setHeight(i);
        this.magicalWrapper.setWidth(this.screenWidth);
        this.magicalWrapper.setMarginTop(0);
        this.magicalWrapper.setMarginLeft(0);
    }

    public void setBackgroundAlpha(float f) {
        this.mAlpha = f;
        this.backgroundView.setAlpha(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1 != 3) goto L25;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = r5.contentLayout
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto Le
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            int r1 = r6.getAction()
            r2 = 1
            if (r1 == 0) goto L53
            if (r1 == r2) goto L4d
            r3 = 2
            if (r1 == r3) goto L1f
            r3 = 3
            if (r1 == r3) goto L4d
            goto L66
        L1f:
            float r1 = r6.getX()
            int r1 = (int) r1
            float r3 = r6.getY()
            int r3 = (int) r3
            int r4 = r5.startX
            int r1 = r1 - r4
            int r1 = java.lang.Math.abs(r1)
            int r4 = r5.startY
            int r4 = r3 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r1 <= r4) goto L40
            if (r0 == 0) goto L66
            r0.setUserInputEnabled(r2)
            goto L66
        L40:
            if (r0 == 0) goto L66
            int r1 = r5.startY
            int r1 = r1 - r3
            boolean r1 = r5.canScrollVertically(r1)
            r0.setUserInputEnabled(r1)
            goto L66
        L4d:
            if (r0 == 0) goto L66
            r0.setUserInputEnabled(r2)
            goto L66
        L53:
            float r1 = r6.getX()
            int r1 = (int) r1
            r5.startX = r1
            float r1 = r6.getY()
            int r1 = (int) r1
            r5.startY = r1
            if (r0 == 0) goto L66
            r0.setUserInputEnabled(r2)
        L66:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.magical.MagicalView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnMojitoViewCallback(com.luck.picture.lib.magical.OnMagicalViewCallback onMagicalViewCallback) {
        this.onMagicalViewCallback = onMagicalViewCallback;
    }
}
