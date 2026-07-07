package com.google.android.material.snackbar;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseTransientBottomBar<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>> {
    static final int ANIMATION_DURATION = 250;
    static final int ANIMATION_FADE_DURATION = 180;
    private static final int ANIMATION_FADE_IN_DURATION = 150;
    private static final int ANIMATION_FADE_OUT_DURATION = 75;
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    static final int MSG_DISMISS = 1;
    static final int MSG_SHOW = 0;
    private static final int[] SNACKBAR_STYLE_ATTR;
    private static final java.lang.String TAG;
    private static final boolean USE_OFFSET_API;
    static final android.os.Handler handler;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private android.view.View anchorView;
    private com.google.android.material.snackbar.BaseTransientBottomBar.Behavior behavior;
    private java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B>> callbacks;
    private final com.google.android.material.snackbar.ContentViewCallback contentViewCallback;
    private final android.content.Context context;
    private int duration;
    private int extraBottomMarginAnchorView;
    private int extraBottomMarginGestureInset;
    private int extraBottomMarginWindowInset;
    private int extraLeftMarginWindowInset;
    private int extraRightMarginWindowInset;
    private boolean gestureInsetBottomIgnored;
    private android.graphics.Rect originalMargins;
    private final android.view.ViewGroup targetParent;
    protected final com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout view;
    private final java.lang.Runnable bottomMarginGestureInsetRunnable = new java.lang.Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.2
        @Override // java.lang.Runnable
        public void run() {
            int screenHeight;
            if (com.google.android.material.snackbar.BaseTransientBottomBar.this.view == null || com.google.android.material.snackbar.BaseTransientBottomBar.this.context == null || (screenHeight = (com.google.android.material.snackbar.BaseTransientBottomBar.this.getScreenHeight() - com.google.android.material.snackbar.BaseTransientBottomBar.this.getViewAbsoluteBottom()) + ((int) com.google.android.material.snackbar.BaseTransientBottomBar.this.view.getTranslationY())) >= com.google.android.material.snackbar.BaseTransientBottomBar.this.extraBottomMarginGestureInset) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = com.google.android.material.snackbar.BaseTransientBottomBar.this.view.getLayoutParams();
            if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                android.util.Log.w(com.google.android.material.snackbar.BaseTransientBottomBar.TAG, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += com.google.android.material.snackbar.BaseTransientBottomBar.this.extraBottomMarginGestureInset - screenHeight;
            com.google.android.material.snackbar.BaseTransientBottomBar.this.view.requestLayout();
        }
    };
    com.google.android.material.snackbar.SnackbarManager.Callback managerCallback = new com.google.android.material.snackbar.SnackbarManager.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.5
        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public void show() {
            com.google.android.material.snackbar.BaseTransientBottomBar.handler.sendMessage(com.google.android.material.snackbar.BaseTransientBottomBar.handler.obtainMessage(0, com.google.android.material.snackbar.BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public void dismiss(int i) {
            com.google.android.material.snackbar.BaseTransientBottomBar.handler.sendMessage(com.google.android.material.snackbar.BaseTransientBottomBar.handler.obtainMessage(1, i, 0, com.google.android.material.snackbar.BaseTransientBottomBar.this));
        }
    };

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        public void onDismissed(B b, int i) {
        }

        public void onShown(B b) {
        }
    }

    @java.lang.Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    protected interface OnAttachStateChangeListener {
        void onViewAttachedToWindow(android.view.View view);

        void onViewDetachedFromWindow(android.view.View view);
    }

    protected interface OnLayoutChangeListener {
        void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4);
    }

    static {
        USE_OFFSET_API = android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 19;
        SNACKBAR_STYLE_ATTR = new int[]{com.google.android.material.R.attr.snackbarStyle};
        TAG = "BaseTransientBottomBar";
        handler = new android.os.Handler(android.os.Looper.getMainLooper(), new android.os.Handler.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                int i = message.what;
                if (i == 0) {
                    ((com.google.android.material.snackbar.BaseTransientBottomBar) message.obj).showView();
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                ((com.google.android.material.snackbar.BaseTransientBottomBar) message.obj).hideView(message.arg1);
                return true;
            }
        });
    }

    protected BaseTransientBottomBar(android.view.ViewGroup viewGroup, android.view.View view, com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (contentViewCallback == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.targetParent = viewGroup;
        this.contentViewCallback = contentViewCallback;
        android.content.Context context = viewGroup.getContext();
        this.context = context;
        com.google.android.material.internal.ThemeEnforcement.checkAppCompatTheme(context);
        com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = (com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout) android.view.LayoutInflater.from(context).inflate(getSnackbarBaseLayoutResId(), viewGroup, false);
        this.view = snackbarBaseLayout;
        if (view instanceof com.google.android.material.snackbar.SnackbarContentLayout) {
            ((com.google.android.material.snackbar.SnackbarContentLayout) view).updateActionTextColorAlphaIfNeeded(snackbarBaseLayout.getActionTextColorAlpha());
        }
        snackbarBaseLayout.addView(view);
        android.view.ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            this.originalMargins = new android.graphics.Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        androidx.core.view.ViewCompat.setAccessibilityLiveRegion(snackbarBaseLayout, 1);
        androidx.core.view.ViewCompat.setImportantForAccessibility(snackbarBaseLayout, 1);
        androidx.core.view.ViewCompat.setFitsSystemWindows(snackbarBaseLayout, true);
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(snackbarBaseLayout, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.3
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                com.google.android.material.snackbar.BaseTransientBottomBar.this.extraBottomMarginWindowInset = windowInsetsCompat.getSystemWindowInsetBottom();
                com.google.android.material.snackbar.BaseTransientBottomBar.this.extraLeftMarginWindowInset = windowInsetsCompat.getSystemWindowInsetLeft();
                com.google.android.material.snackbar.BaseTransientBottomBar.this.extraRightMarginWindowInset = windowInsetsCompat.getSystemWindowInsetRight();
                com.google.android.material.snackbar.BaseTransientBottomBar.this.updateMargins();
                return windowInsetsCompat;
            }
        });
        androidx.core.view.ViewCompat.setAccessibilityDelegate(snackbarBaseLayout, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.4
            public void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(1048576);
                accessibilityNodeInfoCompat.setDismissable(true);
            }

            public boolean performAccessibilityAction(android.view.View view2, int i, android.os.Bundle bundle) {
                if (i == 1048576) {
                    com.google.android.material.snackbar.BaseTransientBottomBar.this.dismiss();
                    return true;
                }
                return super.performAccessibilityAction(view2, i, bundle);
            }
        });
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMargins() {
        android.graphics.Rect rect;
        android.view.ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) || (rect = this.originalMargins) == null) {
            android.util.Log.w(TAG, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.anchorView != null ? this.extraBottomMarginAnchorView : this.extraBottomMarginWindowInset);
        marginLayoutParams.leftMargin = this.originalMargins.left + this.extraLeftMarginWindowInset;
        marginLayoutParams.rightMargin = this.originalMargins.right + this.extraRightMarginWindowInset;
        this.view.requestLayout();
        if (android.os.Build.VERSION.SDK_INT < 29 || !shouldUpdateGestureInset()) {
            return;
        }
        this.view.removeCallbacks(this.bottomMarginGestureInsetRunnable);
        this.view.post(this.bottomMarginGestureInsetRunnable);
    }

    private boolean shouldUpdateGestureInset() {
        return this.extraBottomMarginGestureInset > 0 && !this.gestureInsetBottomIgnored && isSwipeDismissable();
    }

    private boolean isSwipeDismissable() {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = this.view.getLayoutParams();
        return (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) && (layoutParams.getBehavior() instanceof com.google.android.material.behavior.SwipeDismissBehavior);
    }

    protected int getSnackbarBaseLayoutResId() {
        return hasSnackbarStyleAttr() ? com.google.android.material.R.layout.mtrl_layout_snackbar : com.google.android.material.R.layout.design_layout_snackbar;
    }

    protected boolean hasSnackbarStyleAttr() {
        android.content.res.TypedArray obtainStyledAttributes = this.context.obtainStyledAttributes(SNACKBAR_STYLE_ATTR);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public B setDuration(int i) {
        this.duration = i;
        return this;
    }

    public int getDuration() {
        return this.duration;
    }

    public B setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
        return this;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public int getAnimationMode() {
        return this.view.getAnimationMode();
    }

    public B setAnimationMode(int i) {
        this.view.setAnimationMode(i);
        return this;
    }

    public android.view.View getAnchorView() {
        return this.anchorView;
    }

    public B setAnchorView(android.view.View view) {
        this.anchorView = view;
        return this;
    }

    public B setAnchorView(int i) {
        android.view.View findViewById = this.targetParent.findViewById(i);
        this.anchorView = findViewById;
        if (findViewById != null) {
            return this;
        }
        throw new java.lang.IllegalArgumentException("Unable to find anchor view with id: " + i);
    }

    public B setBehavior(com.google.android.material.snackbar.BaseTransientBottomBar.Behavior behavior) {
        this.behavior = behavior;
        return this;
    }

    public com.google.android.material.snackbar.BaseTransientBottomBar.Behavior getBehavior() {
        return this.behavior;
    }

    public android.content.Context getContext() {
        return this.context;
    }

    public android.view.View getView() {
        return this.view;
    }

    public void show() {
        com.google.android.material.snackbar.SnackbarManager.getInstance().show(getDuration(), this.managerCallback);
    }

    public void dismiss() {
        dispatchDismiss(3);
    }

    protected void dispatchDismiss(int i) {
        com.google.android.material.snackbar.SnackbarManager.getInstance().dismiss(this.managerCallback, i);
    }

    public B addCallback(com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        if (this.callbacks == null) {
            this.callbacks = new java.util.ArrayList();
        }
        this.callbacks.add(baseCallback);
        return this;
    }

    public B removeCallback(com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B> baseCallback) {
        java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B>> list;
        if (baseCallback == null || (list = this.callbacks) == null) {
            return this;
        }
        list.remove(baseCallback);
        return this;
    }

    public boolean isShown() {
        return com.google.android.material.snackbar.SnackbarManager.getInstance().isCurrent(this.managerCallback);
    }

    public boolean isShownOrQueued() {
        return com.google.android.material.snackbar.SnackbarManager.getInstance().isCurrentOrNext(this.managerCallback);
    }

    protected com.google.android.material.behavior.SwipeDismissBehavior<? extends android.view.View> getNewBehavior() {
        return new com.google.android.material.snackbar.BaseTransientBottomBar.Behavior();
    }

    final void showView() {
        this.view.setOnAttachStateChangeListener(new com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.6
            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view) {
                android.view.WindowInsets rootWindowInsets;
                if (android.os.Build.VERSION.SDK_INT < 29 || (rootWindowInsets = com.google.android.material.snackbar.BaseTransientBottomBar.this.view.getRootWindowInsets()) == null) {
                    return;
                }
                com.google.android.material.snackbar.BaseTransientBottomBar.this.extraBottomMarginGestureInset = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                com.google.android.material.snackbar.BaseTransientBottomBar.this.updateMargins();
            }

            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view) {
                if (com.google.android.material.snackbar.BaseTransientBottomBar.this.isShownOrQueued()) {
                    com.google.android.material.snackbar.BaseTransientBottomBar.handler.post(new java.lang.Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.google.android.material.snackbar.BaseTransientBottomBar.this.onViewHidden(3);
                        }
                    });
                }
            }
        });
        if (this.view.getParent() == null) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = this.view.getLayoutParams();
            if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) {
                setUpBehavior(layoutParams);
            }
            this.extraBottomMarginAnchorView = calculateBottomMarginForAnchorView();
            updateMargins();
            this.view.setVisibility(4);
            this.targetParent.addView(this.view);
        }
        if (androidx.core.view.ViewCompat.isLaidOut(this.view)) {
            showViewImpl();
        } else {
            this.view.setOnLayoutChangeListener(new com.google.android.material.snackbar.BaseTransientBottomBar.OnLayoutChangeListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.7
                @Override // com.google.android.material.snackbar.BaseTransientBottomBar.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4) {
                    com.google.android.material.snackbar.BaseTransientBottomBar.this.view.setOnLayoutChangeListener(null);
                    com.google.android.material.snackbar.BaseTransientBottomBar.this.showViewImpl();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showViewImpl() {
        if (shouldAnimate()) {
            animateViewIn();
        } else {
            this.view.setVisibility(0);
            onViewShown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getViewAbsoluteBottom() {
        int[] iArr = new int[2];
        this.view.getLocationOnScreen(iArr);
        return iArr[1] + this.view.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScreenHeight() {
        android.view.WindowManager windowManager = (android.view.WindowManager) this.context.getSystemService("window");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private void setUpBehavior(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
        com.google.android.material.behavior.SwipeDismissBehavior<? extends android.view.View> swipeDismissBehavior = this.behavior;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = getNewBehavior();
        }
        if (swipeDismissBehavior instanceof com.google.android.material.snackbar.BaseTransientBottomBar.Behavior) {
            ((com.google.android.material.snackbar.BaseTransientBottomBar.Behavior) swipeDismissBehavior).setBaseTransientBottomBar(this);
        }
        swipeDismissBehavior.setListener(new com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.8
            @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
            public void onDismiss(android.view.View view) {
                view.setVisibility(8);
                com.google.android.material.snackbar.BaseTransientBottomBar.this.dispatchDismiss(0);
            }

            @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
            public void onDragStateChanged(int i) {
                if (i == 0) {
                    com.google.android.material.snackbar.SnackbarManager.getInstance().restoreTimeoutIfPaused(com.google.android.material.snackbar.BaseTransientBottomBar.this.managerCallback);
                } else if (i == 1 || i == 2) {
                    com.google.android.material.snackbar.SnackbarManager.getInstance().pauseTimeout(com.google.android.material.snackbar.BaseTransientBottomBar.this.managerCallback);
                }
            }
        });
        layoutParams.setBehavior(swipeDismissBehavior);
        if (this.anchorView == null) {
            layoutParams.insetEdge = 80;
        }
    }

    private int calculateBottomMarginForAnchorView() {
        android.view.View view = this.anchorView;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.targetParent.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.targetParent.getHeight()) - i;
    }

    void animateViewIn() {
        this.view.post(new java.lang.Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.9
            @Override // java.lang.Runnable
            public void run() {
                if (com.google.android.material.snackbar.BaseTransientBottomBar.this.view == null) {
                    return;
                }
                com.google.android.material.snackbar.BaseTransientBottomBar.this.view.setVisibility(0);
                if (com.google.android.material.snackbar.BaseTransientBottomBar.this.view.getAnimationMode() == 1) {
                    com.google.android.material.snackbar.BaseTransientBottomBar.this.startFadeInAnimation();
                } else {
                    com.google.android.material.snackbar.BaseTransientBottomBar.this.startSlideInAnimation();
                }
            }
        });
    }

    private void animateViewOut(int i) {
        if (this.view.getAnimationMode() == 1) {
            startFadeOutAnimation(i);
        } else {
            startSlideOutAnimation(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startFadeInAnimation() {
        android.animation.ValueAnimator alphaAnimator = getAlphaAnimator(0.0f, 1.0f);
        android.animation.ValueAnimator scaleAnimator = getScaleAnimator(0.8f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(alphaAnimator, scaleAnimator);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.snackbar.BaseTransientBottomBar.this.onViewShown();
            }
        });
        animatorSet.start();
    }

    private void startFadeOutAnimation(final int i) {
        android.animation.ValueAnimator alphaAnimator = getAlphaAnimator(1.0f, 0.0f);
        alphaAnimator.setDuration(75L);
        alphaAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.11
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.snackbar.BaseTransientBottomBar.this.onViewHidden(i);
            }
        });
        alphaAnimator.start();
    }

    private android.animation.ValueAnimator getAlphaAnimator(float... fArr) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.12
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.snackbar.BaseTransientBottomBar.this.view.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    private android.animation.ValueAnimator getScaleAnimator(float... fArr) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.13
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.google.android.material.snackbar.BaseTransientBottomBar.this.view.setScaleX(floatValue);
                com.google.android.material.snackbar.BaseTransientBottomBar.this.view.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSlideInAnimation() {
        int translationYBottom = getTranslationYBottom();
        if (USE_OFFSET_API) {
            androidx.core.view.ViewCompat.offsetTopAndBottom(this.view, translationYBottom);
        } else {
            this.view.setTranslationY(translationYBottom);
        }
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(translationYBottom, 0);
        valueAnimator.setInterpolator(com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.14
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.snackbar.BaseTransientBottomBar.this.contentViewCallback.animateContentIn(70, com.google.android.material.snackbar.BaseTransientBottomBar.ANIMATION_FADE_DURATION);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.snackbar.BaseTransientBottomBar.this.onViewShown();
            }
        });
        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(translationYBottom) { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.15
            private int previousAnimatedIntValue;
            final /* synthetic */ int val$translationYBottom;

            {
                this.val$translationYBottom = translationYBottom;
                this.previousAnimatedIntValue = translationYBottom;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                int intValue = ((java.lang.Integer) valueAnimator2.getAnimatedValue()).intValue();
                if (com.google.android.material.snackbar.BaseTransientBottomBar.USE_OFFSET_API) {
                    androidx.core.view.ViewCompat.offsetTopAndBottom(com.google.android.material.snackbar.BaseTransientBottomBar.this.view, intValue - this.previousAnimatedIntValue);
                } else {
                    com.google.android.material.snackbar.BaseTransientBottomBar.this.view.setTranslationY(intValue);
                }
                this.previousAnimatedIntValue = intValue;
            }
        });
        valueAnimator.start();
    }

    private void startSlideOutAnimation(final int i) {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(0, getTranslationYBottom());
        valueAnimator.setInterpolator(com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.16
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.snackbar.BaseTransientBottomBar.this.contentViewCallback.animateContentOut(0, com.google.android.material.snackbar.BaseTransientBottomBar.ANIMATION_FADE_DURATION);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.snackbar.BaseTransientBottomBar.this.onViewHidden(i);
            }
        });
        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.17
            private int previousAnimatedIntValue = 0;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                int intValue = ((java.lang.Integer) valueAnimator2.getAnimatedValue()).intValue();
                if (com.google.android.material.snackbar.BaseTransientBottomBar.USE_OFFSET_API) {
                    androidx.core.view.ViewCompat.offsetTopAndBottom(com.google.android.material.snackbar.BaseTransientBottomBar.this.view, intValue - this.previousAnimatedIntValue);
                } else {
                    com.google.android.material.snackbar.BaseTransientBottomBar.this.view.setTranslationY(intValue);
                }
                this.previousAnimatedIntValue = intValue;
            }
        });
        valueAnimator.start();
    }

    private int getTranslationYBottom() {
        int height = this.view.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? height + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    final void hideView(int i) {
        if (shouldAnimate() && this.view.getVisibility() == 0) {
            animateViewOut(i);
        } else {
            onViewHidden(i);
        }
    }

    void onViewShown() {
        com.google.android.material.snackbar.SnackbarManager.getInstance().onShown(this.managerCallback);
        java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B>> list = this.callbacks;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.callbacks.get(size).onShown(this);
            }
        }
    }

    void onViewHidden(int i) {
        com.google.android.material.snackbar.SnackbarManager.getInstance().onDismissed(this.managerCallback);
        java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B>> list = this.callbacks;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.callbacks.get(size).onDismissed(this, i);
            }
        }
        android.view.ViewParent parent = this.view.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.view);
        }
    }

    boolean shouldAnimate() {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    protected static class SnackbarBaseLayout extends android.widget.FrameLayout {
        private static final android.view.View.OnTouchListener consumeAllTouchListener = new android.view.View.OnTouchListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return true;
            }
        };
        private final float actionTextColorAlpha;
        private int animationMode;
        private final float backgroundOverlayColorAlpha;
        private android.content.res.ColorStateList backgroundTint;
        private android.graphics.PorterDuff.Mode backgroundTintMode;
        private com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener onAttachStateChangeListener;
        private com.google.android.material.snackbar.BaseTransientBottomBar.OnLayoutChangeListener onLayoutChangeListener;

        protected SnackbarBaseLayout(android.content.Context context) {
            this(context, null);
        }

        protected SnackbarBaseLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, 0, 0), attributeSet);
            android.content.Context context2 = getContext();
            android.content.res.TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.SnackbarLayout_elevation)) {
                androidx.core.view.ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.SnackbarLayout_elevation, 0));
            }
            this.animationMode = obtainStyledAttributes.getInt(com.google.android.material.R.styleable.SnackbarLayout_animationMode, 0);
            this.backgroundOverlayColorAlpha = obtainStyledAttributes.getFloat(com.google.android.material.R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(com.google.android.material.resources.MaterialResources.getColorStateList(context2, obtainStyledAttributes, com.google.android.material.R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(com.google.android.material.internal.ViewUtils.parseTintMode(obtainStyledAttributes.getInt(com.google.android.material.R.styleable.SnackbarLayout_backgroundTintMode, -1), android.graphics.PorterDuff.Mode.SRC_IN));
            this.actionTextColorAlpha = obtainStyledAttributes.getFloat(com.google.android.material.R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(consumeAllTouchListener);
            setFocusable(true);
            if (getBackground() == null) {
                androidx.core.view.ViewCompat.setBackground(this, createThemedBackground());
            }
        }

        @Override // android.view.View
        public void setBackground(android.graphics.drawable.Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
            if (drawable != null && this.backgroundTint != null) {
                drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable.mutate());
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, this.backgroundTint);
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawable, this.backgroundTintMode);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
            this.backgroundTint = colorStateList;
            if (getBackground() != null) {
                android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(getBackground().mutate());
                androidx.core.graphics.drawable.DrawableCompat.setTintList(wrap, colorStateList);
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(wrap, this.backgroundTintMode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
            this.backgroundTintMode = mode;
            if (getBackground() != null) {
                android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(getBackground().mutate());
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(wrap, mode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : consumeAllTouchListener);
            super.setOnClickListener(onClickListener);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            com.google.android.material.snackbar.BaseTransientBottomBar.OnLayoutChangeListener onLayoutChangeListener = this.onLayoutChangeListener;
            if (onLayoutChangeListener != null) {
                onLayoutChangeListener.onLayoutChange(this, i, i2, i3, i4);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener onAttachStateChangeListener = this.onAttachStateChangeListener;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewAttachedToWindow(this);
            }
            androidx.core.view.ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener onAttachStateChangeListener = this.onAttachStateChangeListener;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewDetachedFromWindow(this);
            }
        }

        void setOnLayoutChangeListener(com.google.android.material.snackbar.BaseTransientBottomBar.OnLayoutChangeListener onLayoutChangeListener) {
            this.onLayoutChangeListener = onLayoutChangeListener;
        }

        void setOnAttachStateChangeListener(com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.onAttachStateChangeListener = onAttachStateChangeListener;
        }

        int getAnimationMode() {
            return this.animationMode;
        }

        void setAnimationMode(int i) {
            this.animationMode = i;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.backgroundOverlayColorAlpha;
        }

        float getActionTextColorAlpha() {
            return this.actionTextColorAlpha;
        }

        private android.graphics.drawable.Drawable createThemedBackground() {
            float dimension = getResources().getDimension(com.google.android.material.R.dimen.mtrl_snackbar_background_corner_radius);
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(com.google.android.material.color.MaterialColors.layer(this, com.google.android.material.R.attr.colorSurface, com.google.android.material.R.attr.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.backgroundTint != null) {
                android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(gradientDrawable);
                androidx.core.graphics.drawable.DrawableCompat.setTintList(wrap, this.backgroundTint);
                return wrap;
            }
            return androidx.core.graphics.drawable.DrawableCompat.wrap(gradientDrawable);
        }
    }

    public static class Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {
        private final com.google.android.material.snackbar.BaseTransientBottomBar.BehaviorDelegate delegate = new com.google.android.material.snackbar.BaseTransientBottomBar.BehaviorDelegate(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(com.google.android.material.snackbar.BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.delegate.setBaseTransientBottomBar(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(android.view.View view) {
            return this.delegate.canSwipeDismissView(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            this.delegate.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    public static class BehaviorDelegate {
        private com.google.android.material.snackbar.SnackbarManager.Callback managerCallback;

        public BehaviorDelegate(com.google.android.material.behavior.SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.setStartAlphaSwipeDistance(0.1f);
            swipeDismissBehavior.setEndAlphaSwipeDistance(0.6f);
            swipeDismissBehavior.setSwipeDirection(0);
        }

        public void setBaseTransientBottomBar(com.google.android.material.snackbar.BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.managerCallback = baseTransientBottomBar.managerCallback;
        }

        public boolean canSwipeDismissView(android.view.View view) {
            return view instanceof com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout;
        }

        public void onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.SnackbarManager.getInstance().pauseTimeout(this.managerCallback);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.SnackbarManager.getInstance().restoreTimeoutIfPaused(this.managerCallback);
            }
        }
    }
}
