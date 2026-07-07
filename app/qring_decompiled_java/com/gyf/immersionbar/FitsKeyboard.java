package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
class FitsKeyboard implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private android.view.View mChildView;
    private android.view.View mContentView;
    private android.view.View mDecorView;
    private com.gyf.immersionbar.ImmersionBar mImmersionBar;
    private boolean mIsAddListener;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private int mTempKeyboardHeight;
    private android.view.Window mWindow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View] */
    FitsKeyboard(com.gyf.immersionbar.ImmersionBar immersionBar) {
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mImmersionBar = immersionBar;
        android.view.Window window = immersionBar.getWindow();
        this.mWindow = window;
        android.view.View decorView = window.getDecorView();
        this.mDecorView = decorView;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) decorView.findViewById(android.R.id.content);
        if (immersionBar.isDialogFragment()) {
            androidx.fragment.app.Fragment supportFragment = immersionBar.getSupportFragment();
            if (supportFragment != null) {
                this.mChildView = supportFragment.getView();
            } else {
                android.app.Fragment fragment = immersionBar.getFragment();
                if (fragment != null) {
                    this.mChildView = fragment.getView();
                }
            }
        } else {
            androidx.drawerlayout.widget.DrawerLayout childAt = frameLayout.getChildAt(0);
            this.mChildView = childAt;
            if (childAt != null && (childAt instanceof androidx.drawerlayout.widget.DrawerLayout)) {
                this.mChildView = childAt.getChildAt(0);
            }
        }
        android.view.View view = this.mChildView;
        if (view != null) {
            this.mPaddingLeft = view.getPaddingLeft();
            this.mPaddingTop = this.mChildView.getPaddingTop();
            this.mPaddingRight = this.mChildView.getPaddingRight();
            this.mPaddingBottom = this.mChildView.getPaddingBottom();
        }
        ?? r4 = this.mChildView;
        this.mContentView = r4 != 0 ? r4 : frameLayout;
    }

    void enable(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            this.mWindow.setSoftInputMode(i);
            if (this.mIsAddListener) {
                return;
            }
            this.mDecorView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.mIsAddListener = true;
        }
    }

    void disable() {
        if (android.os.Build.VERSION.SDK_INT < 19 || !this.mIsAddListener) {
            return;
        }
        if (this.mChildView != null) {
            this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
        } else {
            this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), this.mImmersionBar.getPaddingBottom());
        }
    }

    void cancel() {
        if (android.os.Build.VERSION.SDK_INT < 19 || !this.mIsAddListener) {
            return;
        }
        this.mDecorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.mIsAddListener = false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i;
        com.gyf.immersionbar.ImmersionBar immersionBar = this.mImmersionBar;
        if (immersionBar == null || immersionBar.getBarParams() == null || !this.mImmersionBar.getBarParams().keyboardEnable) {
            return;
        }
        com.gyf.immersionbar.BarConfig barConfig = this.mImmersionBar.getBarConfig();
        int navigationBarHeight = barConfig.isNavigationAtBottom() ? barConfig.getNavigationBarHeight() : barConfig.getNavigationBarWidth();
        android.graphics.Rect rect = new android.graphics.Rect();
        this.mDecorView.getWindowVisibleDisplayFrame(rect);
        int height = this.mContentView.getHeight() - rect.bottom;
        if (height != this.mTempKeyboardHeight) {
            this.mTempKeyboardHeight = height;
            boolean z = true;
            if (com.gyf.immersionbar.ImmersionBar.checkFitsSystemWindows(this.mWindow.getDecorView().findViewById(android.R.id.content))) {
                height -= navigationBarHeight;
                if (height <= navigationBarHeight) {
                    z = false;
                }
            } else if (this.mChildView != null) {
                if (this.mImmersionBar.getBarParams().isSupportActionBar) {
                    height += this.mImmersionBar.getActionBarHeight() + barConfig.getStatusBarHeight();
                }
                if (this.mImmersionBar.getBarParams().fits) {
                    height += barConfig.getStatusBarHeight();
                }
                if (height > navigationBarHeight) {
                    i = this.mPaddingBottom + height;
                } else {
                    i = 0;
                    z = false;
                }
                this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, i);
            } else {
                int paddingBottom = this.mImmersionBar.getPaddingBottom();
                height -= navigationBarHeight;
                if (height > navigationBarHeight) {
                    paddingBottom = height + navigationBarHeight;
                } else {
                    z = false;
                }
                this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), paddingBottom);
            }
            int i2 = height >= 0 ? height : 0;
            if (this.mImmersionBar.getBarParams().onKeyboardListener != null) {
                this.mImmersionBar.getBarParams().onKeyboardListener.onKeyboardChange(z, i2);
            }
            if (z || this.mImmersionBar.getBarParams().barHide == com.gyf.immersionbar.BarHide.FLAG_SHOW_BAR) {
                return;
            }
            this.mImmersionBar.setBar();
        }
    }
}
