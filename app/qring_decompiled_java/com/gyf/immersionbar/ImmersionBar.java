package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
public final class ImmersionBar implements com.gyf.immersionbar.ImmersionCallback {
    private int mActionBarHeight;
    private android.app.Activity mActivity;
    private com.gyf.immersionbar.BarConfig mBarConfig;
    private com.gyf.immersionbar.BarParams mBarParams;
    private android.view.ViewGroup mContentView;
    private android.view.ViewGroup mDecorView;
    private android.app.Dialog mDialog;
    private com.gyf.immersionbar.FitsKeyboard mFitsKeyboard;
    private int mFitsStatusBarType;
    private android.app.Fragment mFragment;
    private boolean mInitialized;
    private boolean mIsActionBarBelowLOLLIPOP;
    private boolean mIsActivity;
    private boolean mIsDialog;
    private boolean mIsDialogFragment;
    private boolean mIsFragment;
    private boolean mKeyboardTempEnable;
    private int mNavigationBarHeight;
    private int mNavigationBarWidth;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private com.gyf.immersionbar.ImmersionBar mParentBar;
    private androidx.fragment.app.Fragment mSupportFragment;
    private java.util.Map<java.lang.String, com.gyf.immersionbar.BarParams> mTagMap;
    private android.view.Window mWindow;

    public static com.gyf.immersionbar.ImmersionBar with(android.app.Activity activity) {
        return getRetriever().get(activity);
    }

    public static com.gyf.immersionbar.ImmersionBar with(androidx.fragment.app.Fragment fragment) {
        return getRetriever().get(fragment, false);
    }

    public static com.gyf.immersionbar.ImmersionBar with(androidx.fragment.app.Fragment fragment, boolean z) {
        return getRetriever().get(fragment, z);
    }

    public static com.gyf.immersionbar.ImmersionBar with(android.app.Fragment fragment) {
        return getRetriever().get(fragment, false);
    }

    public static com.gyf.immersionbar.ImmersionBar with(android.app.Fragment fragment, boolean z) {
        return getRetriever().get(fragment, z);
    }

    public static com.gyf.immersionbar.ImmersionBar with(androidx.fragment.app.DialogFragment dialogFragment) {
        return getRetriever().get((androidx.fragment.app.Fragment) dialogFragment, false);
    }

    public static com.gyf.immersionbar.ImmersionBar with(android.app.DialogFragment dialogFragment) {
        return getRetriever().get((android.app.Fragment) dialogFragment, false);
    }

    public static com.gyf.immersionbar.ImmersionBar with(android.app.Activity activity, android.app.Dialog dialog) {
        return getRetriever().get(activity, dialog);
    }

    public static void destroy(androidx.fragment.app.Fragment fragment) {
        getRetriever().destroy(fragment, false);
    }

    public static void destroy(androidx.fragment.app.Fragment fragment, boolean z) {
        getRetriever().destroy(fragment, z);
    }

    public static void destroy(android.app.Activity activity, android.app.Dialog dialog) {
        getRetriever().destroy(activity, dialog);
    }

    public void init() {
        if (android.os.Build.VERSION.SDK_INT < 19 || !this.mBarParams.barEnable) {
            return;
        }
        updateBarParams();
        setBar();
        fitsWindows();
        fitsKeyboard();
        transformView();
        this.mInitialized = true;
    }

    void onDestroy() {
        com.gyf.immersionbar.ImmersionBar immersionBar;
        cancelListener();
        if (this.mIsDialog && (immersionBar = this.mParentBar) != null) {
            immersionBar.mBarParams.keyboardEnable = immersionBar.mKeyboardTempEnable;
            if (this.mParentBar.mBarParams.barHide != com.gyf.immersionbar.BarHide.FLAG_SHOW_BAR) {
                this.mParentBar.setBar();
            }
        }
        this.mInitialized = false;
    }

    void onResume() {
        if (this.mIsFragment || !this.mInitialized || this.mBarParams == null) {
            return;
        }
        if (com.gyf.immersionbar.OSUtils.isEMUI3_x() && this.mBarParams.navigationBarWithEMUI3Enable) {
            init();
        } else if (this.mBarParams.barHide != com.gyf.immersionbar.BarHide.FLAG_SHOW_BAR) {
            setBar();
        }
    }

    void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (com.gyf.immersionbar.OSUtils.isEMUI3_x() || android.os.Build.VERSION.SDK_INT == 19) {
            if (this.mInitialized && !this.mIsFragment && this.mBarParams.navigationBarWithKitkatEnable) {
                init();
                return;
            } else {
                fitsWindows();
                return;
            }
        }
        fitsWindows();
    }

    private void updateBarParams() {
        adjustDarkModeParams();
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            updateBarConfig();
            com.gyf.immersionbar.ImmersionBar immersionBar = this.mParentBar;
            if (immersionBar != null) {
                if (this.mIsFragment) {
                    immersionBar.mBarParams = this.mBarParams;
                }
                if (this.mIsDialog && immersionBar.mKeyboardTempEnable) {
                    immersionBar.mBarParams.keyboardEnable = false;
                }
            }
        }
    }

    void setBar() {
        int i = 256;
        if (android.os.Build.VERSION.SDK_INT >= 21 && !com.gyf.immersionbar.OSUtils.isEMUI3_x()) {
            fitsNotchScreen();
            i = setNavigationIconDark(setStatusBarDarkFont(initBarAboveLOLLIPOP(256)));
        } else {
            initBarBelowLOLLIPOP();
        }
        this.mDecorView.setSystemUiVisibility(hideBar(i));
        setSpecialBarDarkMode();
        if (this.mBarParams.onNavigationBarListener != null) {
            com.gyf.immersionbar.NavigationBarObserver.getInstance().register(this.mActivity.getApplication());
        }
    }

    private void setSpecialBarDarkMode() {
        if (com.gyf.immersionbar.OSUtils.isMIUI6Later()) {
            com.gyf.immersionbar.SpecialBarFontUtils.setMIUIBarDark(this.mWindow, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", this.mBarParams.statusBarDarkFont);
            if (this.mBarParams.navigationBarEnable) {
                com.gyf.immersionbar.SpecialBarFontUtils.setMIUIBarDark(this.mWindow, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", this.mBarParams.navigationBarDarkIcon);
            }
        }
        if (com.gyf.immersionbar.OSUtils.isFlymeOS4Later()) {
            if (this.mBarParams.flymeOSStatusBarFontColor != 0) {
                com.gyf.immersionbar.SpecialBarFontUtils.setStatusBarDarkIcon(this.mActivity, this.mBarParams.flymeOSStatusBarFontColor);
            } else {
                com.gyf.immersionbar.SpecialBarFontUtils.setStatusBarDarkIcon(this.mActivity, this.mBarParams.statusBarDarkFont);
            }
        }
    }

    private void fitsNotchScreen() {
        if (android.os.Build.VERSION.SDK_INT < 28 || this.mInitialized) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        this.mWindow.setAttributes(attributes);
    }

    private int initBarAboveLOLLIPOP(int i) {
        if (!this.mInitialized) {
            this.mBarParams.defaultNavigationBarColor = this.mWindow.getNavigationBarColor();
        }
        int i2 = i | com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2;
        if (this.mBarParams.fullScreen && this.mBarParams.navigationBarEnable) {
            i2 |= 512;
        }
        this.mWindow.clearFlags(67108864);
        if (this.mBarConfig.hasNavigationBar()) {
            this.mWindow.clearFlags(134217728);
        }
        this.mWindow.addFlags(com.bumptech.glide.request.target.Target.SIZE_ORIGINAL);
        if (this.mBarParams.statusBarColorEnabled) {
            this.mWindow.setStatusBarColor(androidx.core.graphics.ColorUtils.blendARGB(this.mBarParams.statusBarColor, this.mBarParams.statusBarColorTransform, this.mBarParams.statusBarAlpha));
        } else {
            this.mWindow.setStatusBarColor(androidx.core.graphics.ColorUtils.blendARGB(this.mBarParams.statusBarColor, 0, this.mBarParams.statusBarAlpha));
        }
        if (this.mBarParams.navigationBarEnable) {
            this.mWindow.setNavigationBarColor(androidx.core.graphics.ColorUtils.blendARGB(this.mBarParams.navigationBarColor, this.mBarParams.navigationBarColorTransform, this.mBarParams.navigationBarAlpha));
        } else {
            this.mWindow.setNavigationBarColor(this.mBarParams.defaultNavigationBarColor);
        }
        return i2;
    }

    private void initBarBelowLOLLIPOP() {
        this.mWindow.addFlags(67108864);
        setupStatusBarView();
        if (this.mBarConfig.hasNavigationBar() || com.gyf.immersionbar.OSUtils.isEMUI3_x()) {
            if (this.mBarParams.navigationBarEnable && this.mBarParams.navigationBarWithKitkatEnable) {
                this.mWindow.addFlags(134217728);
            } else {
                this.mWindow.clearFlags(134217728);
            }
            if (this.mNavigationBarHeight == 0) {
                this.mNavigationBarHeight = this.mBarConfig.getNavigationBarHeight();
            }
            if (this.mNavigationBarWidth == 0) {
                this.mNavigationBarWidth = this.mBarConfig.getNavigationBarWidth();
            }
            setupNavBarView();
        }
    }

    private void setupStatusBarView() {
        android.view.View findViewById = this.mDecorView.findViewById(com.gyf.immersionbar.Constants.IMMERSION_ID_STATUS_BAR_VIEW);
        if (findViewById == null) {
            findViewById = new android.view.View(this.mActivity);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.mBarConfig.getStatusBarHeight());
            layoutParams.gravity = 48;
            findViewById.setLayoutParams(layoutParams);
            findViewById.setVisibility(0);
            findViewById.setId(com.gyf.immersionbar.Constants.IMMERSION_ID_STATUS_BAR_VIEW);
            this.mDecorView.addView(findViewById);
        }
        if (this.mBarParams.statusBarColorEnabled) {
            findViewById.setBackgroundColor(androidx.core.graphics.ColorUtils.blendARGB(this.mBarParams.statusBarColor, this.mBarParams.statusBarColorTransform, this.mBarParams.statusBarAlpha));
        } else {
            findViewById.setBackgroundColor(androidx.core.graphics.ColorUtils.blendARGB(this.mBarParams.statusBarColor, 0, this.mBarParams.statusBarAlpha));
        }
    }

    private void setupNavBarView() {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.view.View findViewById = this.mDecorView.findViewById(com.gyf.immersionbar.Constants.IMMERSION_ID_NAVIGATION_BAR_VIEW);
        if (findViewById == null) {
            findViewById = new android.view.View(this.mActivity);
            findViewById.setId(com.gyf.immersionbar.Constants.IMMERSION_ID_NAVIGATION_BAR_VIEW);
            this.mDecorView.addView(findViewById);
        }
        if (this.mBarConfig.isNavigationAtBottom()) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.mBarConfig.getNavigationBarHeight());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new android.widget.FrameLayout.LayoutParams(this.mBarConfig.getNavigationBarWidth(), -1);
            layoutParams.gravity = 8388613;
        }
        findViewById.setLayoutParams(layoutParams);
        findViewById.setBackgroundColor(androidx.core.graphics.ColorUtils.blendARGB(this.mBarParams.navigationBarColor, this.mBarParams.navigationBarColorTransform, this.mBarParams.navigationBarAlpha));
        if (this.mBarParams.navigationBarEnable && this.mBarParams.navigationBarWithKitkatEnable && !this.mBarParams.hideNavigationBar) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
    }

    private void adjustDarkModeParams() {
        if (this.mBarParams.autoStatusBarDarkModeEnable && this.mBarParams.statusBarColor != 0) {
            statusBarDarkFont(this.mBarParams.statusBarColor > -4539718, this.mBarParams.autoStatusBarDarkModeAlpha);
        }
        if (!this.mBarParams.autoNavigationBarDarkModeEnable || this.mBarParams.navigationBarColor == 0) {
            return;
        }
        navigationBarDarkIcon(this.mBarParams.navigationBarColor > -4539718, this.mBarParams.autoNavigationBarDarkModeAlpha);
    }

    /* renamed from: com.gyf.immersionbar.ImmersionBar$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$gyf$immersionbar$BarHide;

        static {
            int[] iArr = new int[com.gyf.immersionbar.BarHide.values().length];
            $SwitchMap$com$gyf$immersionbar$BarHide = iArr;
            try {
                iArr[com.gyf.immersionbar.BarHide.FLAG_HIDE_BAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$gyf$immersionbar$BarHide[com.gyf.immersionbar.BarHide.FLAG_HIDE_STATUS_BAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$gyf$immersionbar$BarHide[com.gyf.immersionbar.BarHide.FLAG_HIDE_NAVIGATION_BAR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$gyf$immersionbar$BarHide[com.gyf.immersionbar.BarHide.FLAG_SHOW_BAR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private int hideBar(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            int i2 = com.gyf.immersionbar.ImmersionBar.AnonymousClass2.$SwitchMap$com$gyf$immersionbar$BarHide[this.mBarParams.barHide.ordinal()];
            if (i2 == 1) {
                i |= 518;
            } else if (i2 == 2) {
                i |= 1028;
            } else if (i2 == 3) {
                i |= 514;
            } else if (i2 == 4) {
                i |= 0;
            }
        }
        return i | com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_READ_BUFFER_SIZE;
    }

    private void fitsWindows() {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            if (android.os.Build.VERSION.SDK_INT >= 21 && !com.gyf.immersionbar.OSUtils.isEMUI3_x()) {
                fitsWindowsAboveLOLLIPOP();
            } else {
                fitsWindowsBelowLOLLIPOP();
            }
            fitsLayoutOverlap();
        }
    }

    private void fitsWindowsBelowLOLLIPOP() {
        if (this.mBarParams.isSupportActionBar) {
            this.mIsActionBarBelowLOLLIPOP = true;
            this.mContentView.post(this);
        } else {
            this.mIsActionBarBelowLOLLIPOP = false;
            postFitsWindowsBelowLOLLIPOP();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        postFitsWindowsBelowLOLLIPOP();
    }

    private void postFitsWindowsBelowLOLLIPOP() {
        updateBarConfig();
        fitsWindowsKITKAT();
        if (this.mIsFragment || !com.gyf.immersionbar.OSUtils.isEMUI3_x()) {
            return;
        }
        fitsWindowsEMUI();
    }

    private void fitsWindowsAboveLOLLIPOP() {
        updateBarConfig();
        if (checkFitsSystemWindows(this.mDecorView.findViewById(android.R.id.content))) {
            setPadding(0, 0, 0, 0);
            return;
        }
        int statusBarHeight = (this.mBarParams.fits && this.mFitsStatusBarType == 4) ? this.mBarConfig.getStatusBarHeight() : 0;
        if (this.mBarParams.isSupportActionBar) {
            statusBarHeight = this.mBarConfig.getStatusBarHeight() + this.mActionBarHeight;
        }
        setPadding(0, statusBarHeight, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void fitsWindowsKITKAT() {
        /*
            r5 = this;
            android.view.ViewGroup r0 = r5.mDecorView
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            boolean r0 = checkFitsSystemWindows(r0)
            r1 = 0
            if (r0 == 0) goto L14
            r5.setPadding(r1, r1, r1, r1)
            return
        L14:
            com.gyf.immersionbar.BarParams r0 = r5.mBarParams
            boolean r0 = r0.fits
            if (r0 == 0) goto L26
            int r0 = r5.mFitsStatusBarType
            r2 = 4
            if (r0 != r2) goto L26
            com.gyf.immersionbar.BarConfig r0 = r5.mBarConfig
            int r0 = r0.getStatusBarHeight()
            goto L27
        L26:
            r0 = 0
        L27:
            com.gyf.immersionbar.BarParams r2 = r5.mBarParams
            boolean r2 = r2.isSupportActionBar
            if (r2 == 0) goto L36
            com.gyf.immersionbar.BarConfig r0 = r5.mBarConfig
            int r0 = r0.getStatusBarHeight()
            int r2 = r5.mActionBarHeight
            int r0 = r0 + r2
        L36:
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            boolean r2 = r2.hasNavigationBar()
            if (r2 == 0) goto L8a
            com.gyf.immersionbar.BarParams r2 = r5.mBarParams
            boolean r2 = r2.navigationBarEnable
            if (r2 == 0) goto L8a
            com.gyf.immersionbar.BarParams r2 = r5.mBarParams
            boolean r2 = r2.navigationBarWithKitkatEnable
            if (r2 == 0) goto L8a
            com.gyf.immersionbar.BarParams r2 = r5.mBarParams
            boolean r2 = r2.fullScreen
            if (r2 != 0) goto L68
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            boolean r2 = r2.isNavigationAtBottom()
            if (r2 == 0) goto L61
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getNavigationBarHeight()
            r3 = r2
            r2 = 0
            goto L6a
        L61:
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getNavigationBarWidth()
            goto L69
        L68:
            r2 = 0
        L69:
            r3 = 0
        L6a:
            com.gyf.immersionbar.BarParams r4 = r5.mBarParams
            boolean r4 = r4.hideNavigationBar
            if (r4 == 0) goto L7b
            com.gyf.immersionbar.BarConfig r4 = r5.mBarConfig
            boolean r4 = r4.isNavigationAtBottom()
            if (r4 == 0) goto L79
            goto L8b
        L79:
            r2 = 0
            goto L8c
        L7b:
            com.gyf.immersionbar.BarConfig r4 = r5.mBarConfig
            boolean r4 = r4.isNavigationAtBottom()
            if (r4 != 0) goto L8c
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getNavigationBarWidth()
            goto L8c
        L8a:
            r2 = 0
        L8b:
            r3 = 0
        L8c:
            r5.setPadding(r1, r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.immersionbar.ImmersionBar.fitsWindowsKITKAT():void");
    }

    private void fitsWindowsEMUI() {
        android.view.View findViewById = this.mDecorView.findViewById(com.gyf.immersionbar.Constants.IMMERSION_ID_NAVIGATION_BAR_VIEW);
        if (!this.mBarParams.navigationBarEnable || !this.mBarParams.navigationBarWithKitkatEnable) {
            com.gyf.immersionbar.EMUI3NavigationBarObserver.getInstance().removeOnNavigationBarListener(this);
            findViewById.setVisibility(8);
        } else if (findViewById != null) {
            com.gyf.immersionbar.EMUI3NavigationBarObserver.getInstance().addOnNavigationBarListener(this);
            com.gyf.immersionbar.EMUI3NavigationBarObserver.getInstance().register(this.mActivity.getApplication());
        }
    }

    private void updateBarConfig() {
        com.gyf.immersionbar.BarConfig barConfig = new com.gyf.immersionbar.BarConfig(this.mActivity);
        this.mBarConfig = barConfig;
        if (!this.mInitialized || this.mIsActionBarBelowLOLLIPOP) {
            this.mActionBarHeight = barConfig.getActionBarHeight();
        }
    }

    @Override // com.gyf.immersionbar.OnNavigationBarListener
    public void onNavigationBarChange(boolean z) {
        android.view.View findViewById = this.mDecorView.findViewById(com.gyf.immersionbar.Constants.IMMERSION_ID_NAVIGATION_BAR_VIEW);
        if (findViewById != null) {
            this.mBarConfig = new com.gyf.immersionbar.BarConfig(this.mActivity);
            int paddingBottom = this.mContentView.getPaddingBottom();
            int paddingRight = this.mContentView.getPaddingRight();
            if (!z) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
                if (!checkFitsSystemWindows(this.mDecorView.findViewById(android.R.id.content))) {
                    if (this.mNavigationBarHeight == 0) {
                        this.mNavigationBarHeight = this.mBarConfig.getNavigationBarHeight();
                    }
                    if (this.mNavigationBarWidth == 0) {
                        this.mNavigationBarWidth = this.mBarConfig.getNavigationBarWidth();
                    }
                    if (!this.mBarParams.hideNavigationBar) {
                        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) findViewById.getLayoutParams();
                        if (this.mBarConfig.isNavigationAtBottom()) {
                            layoutParams.gravity = 80;
                            layoutParams.height = this.mNavigationBarHeight;
                            paddingBottom = !this.mBarParams.fullScreen ? this.mNavigationBarHeight : 0;
                            paddingRight = 0;
                        } else {
                            layoutParams.gravity = 8388613;
                            layoutParams.width = this.mNavigationBarWidth;
                            paddingRight = !this.mBarParams.fullScreen ? this.mNavigationBarWidth : 0;
                            paddingBottom = 0;
                        }
                        findViewById.setLayoutParams(layoutParams);
                    }
                    setPadding(0, this.mContentView.getPaddingTop(), paddingRight, paddingBottom);
                }
            }
            paddingBottom = 0;
            paddingRight = 0;
            setPadding(0, this.mContentView.getPaddingTop(), paddingRight, paddingBottom);
        }
    }

    private int setStatusBarDarkFont(int i) {
        return (android.os.Build.VERSION.SDK_INT < 23 || !this.mBarParams.statusBarDarkFont) ? i : i | 8192;
    }

    private int setNavigationIconDark(int i) {
        return (android.os.Build.VERSION.SDK_INT < 26 || !this.mBarParams.navigationBarDarkIcon) ? i : i | 16;
    }

    private void fitsLayoutOverlap() {
        int statusBarHeight = this.mBarParams.fitsLayoutOverlapEnable ? getStatusBarHeight(this.mActivity) : 0;
        int i = this.mFitsStatusBarType;
        if (i == 1) {
            setTitleBar(this.mActivity, statusBarHeight, this.mBarParams.titleBarView);
        } else if (i == 2) {
            setTitleBarMarginTop(this.mActivity, statusBarHeight, this.mBarParams.titleBarView);
        } else {
            if (i != 3) {
                return;
            }
            setStatusBarView(this.mActivity, statusBarHeight, this.mBarParams.statusBarView);
        }
    }

    private void transformView() {
        if (this.mBarParams.viewMap.size() != 0) {
            for (java.util.Map.Entry<android.view.View, java.util.Map<java.lang.Integer, java.lang.Integer>> entry : this.mBarParams.viewMap.entrySet()) {
                android.view.View key = entry.getKey();
                java.util.Map<java.lang.Integer, java.lang.Integer> value = entry.getValue();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(this.mBarParams.statusBarColor);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.mBarParams.statusBarColorTransform);
                for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry2 : value.entrySet()) {
                    java.lang.Integer key2 = entry2.getKey();
                    valueOf2 = entry2.getValue();
                    valueOf = key2;
                }
                if (key != null) {
                    if (java.lang.Math.abs(this.mBarParams.viewAlpha - 0.0f) == 0.0f) {
                        key.setBackgroundColor(androidx.core.graphics.ColorUtils.blendARGB(valueOf.intValue(), valueOf2.intValue(), this.mBarParams.statusBarAlpha));
                    } else {
                        key.setBackgroundColor(androidx.core.graphics.ColorUtils.blendARGB(valueOf.intValue(), valueOf2.intValue(), this.mBarParams.viewAlpha));
                    }
                }
            }
        }
    }

    private void cancelListener() {
        if (this.mActivity != null) {
            com.gyf.immersionbar.FitsKeyboard fitsKeyboard = this.mFitsKeyboard;
            if (fitsKeyboard != null) {
                fitsKeyboard.cancel();
                this.mFitsKeyboard = null;
            }
            com.gyf.immersionbar.EMUI3NavigationBarObserver.getInstance().removeOnNavigationBarListener(this);
            com.gyf.immersionbar.NavigationBarObserver.getInstance().removeOnNavigationBarListener(this.mBarParams.onNavigationBarListener);
        }
    }

    private void fitsKeyboard() {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            if (!this.mIsFragment) {
                if (this.mBarParams.keyboardEnable) {
                    if (this.mFitsKeyboard == null) {
                        this.mFitsKeyboard = new com.gyf.immersionbar.FitsKeyboard(this);
                    }
                    this.mFitsKeyboard.enable(this.mBarParams.keyboardMode);
                    return;
                } else {
                    com.gyf.immersionbar.FitsKeyboard fitsKeyboard = this.mFitsKeyboard;
                    if (fitsKeyboard != null) {
                        fitsKeyboard.disable();
                        return;
                    }
                    return;
                }
            }
            com.gyf.immersionbar.ImmersionBar immersionBar = this.mParentBar;
            if (immersionBar != null) {
                if (immersionBar.mBarParams.keyboardEnable) {
                    com.gyf.immersionbar.ImmersionBar immersionBar2 = this.mParentBar;
                    if (immersionBar2.mFitsKeyboard == null) {
                        immersionBar2.mFitsKeyboard = new com.gyf.immersionbar.FitsKeyboard(immersionBar2);
                    }
                    com.gyf.immersionbar.ImmersionBar immersionBar3 = this.mParentBar;
                    immersionBar3.mFitsKeyboard.enable(immersionBar3.mBarParams.keyboardMode);
                    return;
                }
                com.gyf.immersionbar.FitsKeyboard fitsKeyboard2 = this.mParentBar.mFitsKeyboard;
                if (fitsKeyboard2 != null) {
                    fitsKeyboard2.disable();
                }
            }
        }
    }

    public com.gyf.immersionbar.BarParams getBarParams() {
        return this.mBarParams;
    }

    private void setPadding(int i, int i2, int i3, int i4) {
        android.view.ViewGroup viewGroup = this.mContentView;
        if (viewGroup != null) {
            viewGroup.setPadding(i, i2, i3, i4);
        }
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
    }

    int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    int getPaddingTop() {
        return this.mPaddingTop;
    }

    int getPaddingRight() {
        return this.mPaddingRight;
    }

    int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    android.app.Activity getActivity() {
        return this.mActivity;
    }

    android.view.Window getWindow() {
        return this.mWindow;
    }

    androidx.fragment.app.Fragment getSupportFragment() {
        return this.mSupportFragment;
    }

    android.app.Fragment getFragment() {
        return this.mFragment;
    }

    boolean isFragment() {
        return this.mIsFragment;
    }

    boolean isDialogFragment() {
        return this.mIsDialogFragment;
    }

    boolean initialized() {
        return this.mInitialized;
    }

    com.gyf.immersionbar.BarConfig getBarConfig() {
        if (this.mBarConfig == null) {
            this.mBarConfig = new com.gyf.immersionbar.BarConfig(this.mActivity);
        }
        return this.mBarConfig;
    }

    int getActionBarHeight() {
        return this.mActionBarHeight;
    }

    public static boolean isSupportStatusBarDarkFont() {
        return com.gyf.immersionbar.OSUtils.isMIUI6Later() || com.gyf.immersionbar.OSUtils.isFlymeOS4Later() || android.os.Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isSupportNavigationIconDark() {
        return com.gyf.immersionbar.OSUtils.isMIUI6Later() || android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static void setTitleBar(android.app.Activity activity, final int i, android.view.View... viewArr) {
        if (android.os.Build.VERSION.SDK_INT < 19 || activity == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        for (final android.view.View view : viewArr) {
            if (view != null) {
                final java.lang.Integer num = (java.lang.Integer) view.getTag(com.gyf.immersionbar.R.id.immersion_fits_layout_overlap);
                if (num == null) {
                    num = 0;
                }
                if (num.intValue() != i) {
                    view.setTag(com.gyf.immersionbar.R.id.immersion_fits_layout_overlap, java.lang.Integer.valueOf(i));
                    final android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
                    }
                    if (layoutParams.height == -2 || layoutParams.height == -1) {
                        view.post(new java.lang.Runnable() { // from class: com.gyf.immersionbar.ImmersionBar.1
                            @Override // java.lang.Runnable
                            public void run() {
                                layoutParams.height = (view.getHeight() + i) - num.intValue();
                                android.view.View view2 = view;
                                view2.setPadding(view2.getPaddingLeft(), (view.getPaddingTop() + i) - num.intValue(), view.getPaddingRight(), view.getPaddingBottom());
                                view.setLayoutParams(layoutParams);
                            }
                        });
                    } else {
                        layoutParams.height += i - num.intValue();
                        view.setPadding(view.getPaddingLeft(), (view.getPaddingTop() + i) - num.intValue(), view.getPaddingRight(), view.getPaddingBottom());
                        view.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public static void setTitleBar(android.app.Activity activity, android.view.View... viewArr) {
        setTitleBar(activity, getStatusBarHeight(activity), viewArr);
    }

    public static void setTitleBar(androidx.fragment.app.Fragment fragment, int i, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBar((android.app.Activity) fragment.getActivity(), i, viewArr);
    }

    public static void setTitleBar(androidx.fragment.app.Fragment fragment, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBar((android.app.Activity) fragment.getActivity(), viewArr);
    }

    public static void setTitleBar(android.app.Fragment fragment, int i, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBar(fragment.getActivity(), i, viewArr);
    }

    public static void setTitleBar(android.app.Fragment fragment, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBar(fragment.getActivity(), viewArr);
    }

    public static void setTitleBarMarginTop(android.app.Activity activity, int i, android.view.View... viewArr) {
        if (android.os.Build.VERSION.SDK_INT < 19 || activity == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        for (android.view.View view : viewArr) {
            if (view != null) {
                java.lang.Integer num = (java.lang.Integer) view.getTag(com.gyf.immersionbar.R.id.immersion_fits_layout_overlap);
                if (num == null) {
                    num = 0;
                }
                if (num.intValue() != i) {
                    view.setTag(com.gyf.immersionbar.R.id.immersion_fits_layout_overlap, java.lang.Integer.valueOf(i));
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
                    }
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (marginLayoutParams.topMargin + i) - num.intValue(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    view.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public static void setTitleBarMarginTop(android.app.Activity activity, android.view.View... viewArr) {
        setTitleBarMarginTop(activity, getStatusBarHeight(activity), viewArr);
    }

    public static void setTitleBarMarginTop(androidx.fragment.app.Fragment fragment, int i, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBarMarginTop((android.app.Activity) fragment.getActivity(), i, viewArr);
    }

    public static void setTitleBarMarginTop(androidx.fragment.app.Fragment fragment, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBarMarginTop((android.app.Activity) fragment.getActivity(), viewArr);
    }

    public static void setTitleBarMarginTop(android.app.Fragment fragment, int i, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBarMarginTop(fragment.getActivity(), i, viewArr);
    }

    public static void setTitleBarMarginTop(android.app.Fragment fragment, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBarMarginTop(fragment.getActivity(), viewArr);
    }

    public static void setStatusBarView(android.app.Activity activity, int i, android.view.View... viewArr) {
        if (android.os.Build.VERSION.SDK_INT < 19 || activity == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        for (android.view.View view : viewArr) {
            if (view != null) {
                java.lang.Integer num = (java.lang.Integer) view.getTag(com.gyf.immersionbar.R.id.immersion_fits_layout_overlap);
                if (num == null) {
                    num = 0;
                }
                if (num.intValue() != i) {
                    view.setTag(com.gyf.immersionbar.R.id.immersion_fits_layout_overlap, java.lang.Integer.valueOf(i));
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new android.view.ViewGroup.LayoutParams(-1, 0);
                    }
                    layoutParams.height = i;
                    view.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public static void setStatusBarView(android.app.Activity activity, android.view.View... viewArr) {
        setStatusBarView(activity, getStatusBarHeight(activity), viewArr);
    }

    public static void setStatusBarView(androidx.fragment.app.Fragment fragment, int i, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setStatusBarView((android.app.Activity) fragment.getActivity(), i, viewArr);
    }

    public static void setStatusBarView(androidx.fragment.app.Fragment fragment, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setStatusBarView((android.app.Activity) fragment.getActivity(), viewArr);
    }

    public static void setStatusBarView(android.app.Fragment fragment, int i, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setStatusBarView(fragment.getActivity(), i, viewArr);
    }

    public static void setStatusBarView(android.app.Fragment fragment, android.view.View... viewArr) {
        if (fragment == null) {
            return;
        }
        setStatusBarView(fragment.getActivity(), viewArr);
    }

    public static void setFitsSystemWindows(android.app.Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        setFitsSystemWindows(((android.view.ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0), z);
    }

    public static void setFitsSystemWindows(android.app.Activity activity) {
        setFitsSystemWindows(activity, true);
    }

    public static void setFitsSystemWindows(androidx.fragment.app.Fragment fragment, boolean z) {
        if (fragment == null) {
            return;
        }
        setFitsSystemWindows((android.app.Activity) fragment.getActivity(), z);
    }

    public static void setFitsSystemWindows(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return;
        }
        setFitsSystemWindows((android.app.Activity) fragment.getActivity());
    }

    public static void setFitsSystemWindows(android.app.Fragment fragment, boolean z) {
        if (fragment == null) {
            return;
        }
        setFitsSystemWindows(fragment.getActivity(), z);
    }

    public static void setFitsSystemWindows(android.app.Fragment fragment) {
        if (fragment == null) {
            return;
        }
        setFitsSystemWindows(fragment.getActivity());
    }

    private static void setFitsSystemWindows(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup instanceof androidx.drawerlayout.widget.DrawerLayout) {
                setFitsSystemWindows(viewGroup.getChildAt(0), z);
                return;
            } else {
                viewGroup.setFitsSystemWindows(z);
                viewGroup.setClipToPadding(true);
                return;
            }
        }
        view.setFitsSystemWindows(z);
    }

    public static boolean checkFitsSystemWindows(android.view.View view) {
        if (view == null) {
            return false;
        }
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (((childAt instanceof androidx.drawerlayout.widget.DrawerLayout) && checkFitsSystemWindows(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasNavigationBar(android.app.Activity activity) {
        return new com.gyf.immersionbar.BarConfig(activity).hasNavigationBar();
    }

    public static boolean hasNavigationBar(androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return hasNavigationBar((android.app.Activity) fragment.getActivity());
    }

    public static boolean hasNavigationBar(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return hasNavigationBar(fragment.getActivity());
    }

    public static int getNavigationBarHeight(android.app.Activity activity) {
        return new com.gyf.immersionbar.BarConfig(activity).getNavigationBarHeight();
    }

    public static int getNavigationBarHeight(androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNavigationBarHeight((android.app.Activity) fragment.getActivity());
    }

    public static int getNavigationBarHeight(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNavigationBarHeight(fragment.getActivity());
    }

    public static int getNavigationBarWidth(android.app.Activity activity) {
        return new com.gyf.immersionbar.BarConfig(activity).getNavigationBarWidth();
    }

    public static int getNavigationBarWidth(androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNavigationBarWidth((android.app.Activity) fragment.getActivity());
    }

    public static int getNavigationBarWidth(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNavigationBarWidth(fragment.getActivity());
    }

    public static boolean isNavigationAtBottom(android.app.Activity activity) {
        return new com.gyf.immersionbar.BarConfig(activity).isNavigationAtBottom();
    }

    public static boolean isNavigationAtBottom(androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return isNavigationAtBottom((android.app.Activity) fragment.getActivity());
    }

    public static boolean isNavigationAtBottom(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return isNavigationAtBottom(fragment.getActivity());
    }

    public static int getStatusBarHeight(android.app.Activity activity) {
        return new com.gyf.immersionbar.BarConfig(activity).getStatusBarHeight();
    }

    public static int getStatusBarHeight(androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getStatusBarHeight((android.app.Activity) fragment.getActivity());
    }

    public static int getStatusBarHeight(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getStatusBarHeight(fragment.getActivity());
    }

    public static int getActionBarHeight(android.app.Activity activity) {
        return new com.gyf.immersionbar.BarConfig(activity).getActionBarHeight();
    }

    public static int getActionBarHeight(androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getActionBarHeight((android.app.Activity) fragment.getActivity());
    }

    public static int getActionBarHeight(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getActionBarHeight(fragment.getActivity());
    }

    public static boolean hasNotchScreen(android.app.Activity activity) {
        return com.gyf.immersionbar.NotchUtils.hasNotchScreen(activity);
    }

    public static boolean hasNotchScreen(androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return hasNotchScreen((android.app.Activity) fragment.getActivity());
    }

    public static boolean hasNotchScreen(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return hasNotchScreen(fragment.getActivity());
    }

    public static boolean hasNotchScreen(android.view.View view) {
        return com.gyf.immersionbar.NotchUtils.hasNotchScreen(view);
    }

    public static int getNotchHeight(android.app.Activity activity) {
        if (hasNotchScreen(activity)) {
            return com.gyf.immersionbar.NotchUtils.getNotchHeight(activity);
        }
        return 0;
    }

    public static int getNotchHeight(androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNotchHeight((android.app.Activity) fragment.getActivity());
    }

    public static int getNotchHeight(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNotchHeight(fragment.getActivity());
    }

    public static void hideStatusBar(android.view.Window window) {
        window.setFlags(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
    }

    public static void showStatusBar(android.view.Window window) {
        window.clearFlags(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
    }

    ImmersionBar(android.app.Activity activity) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new java.util.HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsActivity = true;
        this.mActivity = activity;
        initCommonParameter(activity.getWindow());
    }

    ImmersionBar(androidx.fragment.app.Fragment fragment) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new java.util.HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsFragment = true;
        this.mActivity = fragment.getActivity();
        this.mSupportFragment = fragment;
        checkInitWithActivity();
        initCommonParameter(this.mActivity.getWindow());
    }

    ImmersionBar(android.app.Fragment fragment) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new java.util.HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsFragment = true;
        this.mActivity = fragment.getActivity();
        this.mFragment = fragment;
        checkInitWithActivity();
        initCommonParameter(this.mActivity.getWindow());
    }

    ImmersionBar(androidx.fragment.app.DialogFragment dialogFragment) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new java.util.HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsDialog = true;
        this.mIsDialogFragment = true;
        this.mActivity = dialogFragment.getActivity();
        this.mSupportFragment = dialogFragment;
        this.mDialog = dialogFragment.getDialog();
        checkInitWithActivity();
        initCommonParameter(this.mDialog.getWindow());
    }

    ImmersionBar(android.app.DialogFragment dialogFragment) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new java.util.HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsDialog = true;
        this.mIsDialogFragment = true;
        this.mActivity = dialogFragment.getActivity();
        this.mFragment = dialogFragment;
        this.mDialog = dialogFragment.getDialog();
        checkInitWithActivity();
        initCommonParameter(this.mDialog.getWindow());
    }

    ImmersionBar(android.app.Activity activity, android.app.Dialog dialog) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new java.util.HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsDialog = true;
        this.mActivity = activity;
        this.mDialog = dialog;
        checkInitWithActivity();
        initCommonParameter(this.mDialog.getWindow());
    }

    private void checkInitWithActivity() {
        if (this.mParentBar == null) {
            this.mParentBar = with(this.mActivity);
        }
        com.gyf.immersionbar.ImmersionBar immersionBar = this.mParentBar;
        if (immersionBar == null || immersionBar.mInitialized) {
            return;
        }
        immersionBar.init();
    }

    private void initCommonParameter(android.view.Window window) {
        this.mWindow = window;
        this.mBarParams = new com.gyf.immersionbar.BarParams();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.mWindow.getDecorView();
        this.mDecorView = viewGroup;
        this.mContentView = (android.view.ViewGroup) viewGroup.findViewById(android.R.id.content);
    }

    public com.gyf.immersionbar.ImmersionBar transparentStatusBar() {
        this.mBarParams.statusBarColor = 0;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar transparentNavigationBar() {
        this.mBarParams.navigationBarColor = 0;
        this.mBarParams.fullScreen = true;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar transparentBar() {
        this.mBarParams.statusBarColor = 0;
        this.mBarParams.navigationBarColor = 0;
        this.mBarParams.fullScreen = true;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColor(int i) {
        return statusBarColorInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i));
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColor(int i, float f) {
        return statusBarColorInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i), f);
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColor(int i, int i2, float f) {
        return statusBarColorInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i), androidx.core.content.ContextCompat.getColor(this.mActivity, i2), f);
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColor(java.lang.String str) {
        return statusBarColorInt(android.graphics.Color.parseColor(str));
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColor(java.lang.String str, float f) {
        return statusBarColorInt(android.graphics.Color.parseColor(str), f);
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColor(java.lang.String str, java.lang.String str2, float f) {
        return statusBarColorInt(android.graphics.Color.parseColor(str), android.graphics.Color.parseColor(str2), f);
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColorInt(int i) {
        this.mBarParams.statusBarColor = i;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColorInt(int i, float f) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.statusBarAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColorInt(int i, int i2, float f) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.statusBarColorTransform = i2;
        this.mBarParams.statusBarAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColor(int i) {
        return navigationBarColorInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i));
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColor(int i, float f) {
        return navigationBarColorInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i), f);
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColor(int i, int i2, float f) {
        return navigationBarColorInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i), androidx.core.content.ContextCompat.getColor(this.mActivity, i2), f);
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColor(java.lang.String str) {
        return navigationBarColorInt(android.graphics.Color.parseColor(str));
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColor(java.lang.String str, float f) {
        return navigationBarColorInt(android.graphics.Color.parseColor(str), f);
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColor(java.lang.String str, java.lang.String str2, float f) {
        return navigationBarColorInt(android.graphics.Color.parseColor(str), android.graphics.Color.parseColor(str2), f);
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColorInt(int i) {
        this.mBarParams.navigationBarColor = i;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColorInt(int i, float f) {
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColorInt(int i, int i2, float f) {
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.navigationBarColorTransform = i2;
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar barColor(int i) {
        return barColorInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i));
    }

    public com.gyf.immersionbar.ImmersionBar barColor(int i, float f) {
        return barColorInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i), i);
    }

    public com.gyf.immersionbar.ImmersionBar barColor(int i, int i2, float f) {
        return barColorInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i), androidx.core.content.ContextCompat.getColor(this.mActivity, i2), f);
    }

    public com.gyf.immersionbar.ImmersionBar barColor(java.lang.String str) {
        return barColorInt(android.graphics.Color.parseColor(str));
    }

    public com.gyf.immersionbar.ImmersionBar barColor(java.lang.String str, float f) {
        return barColorInt(android.graphics.Color.parseColor(str), f);
    }

    public com.gyf.immersionbar.ImmersionBar barColor(java.lang.String str, java.lang.String str2, float f) {
        return barColorInt(android.graphics.Color.parseColor(str), android.graphics.Color.parseColor(str2), f);
    }

    public com.gyf.immersionbar.ImmersionBar barColorInt(int i) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.navigationBarColor = i;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar barColorInt(int i, float f) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.statusBarAlpha = f;
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar barColorInt(int i, int i2, float f) {
        this.mBarParams.statusBarColor = i;
        this.mBarParams.navigationBarColor = i;
        this.mBarParams.statusBarColorTransform = i2;
        this.mBarParams.navigationBarColorTransform = i2;
        this.mBarParams.statusBarAlpha = f;
        this.mBarParams.navigationBarAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColorTransform(int i) {
        return statusBarColorTransformInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i));
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColorTransform(java.lang.String str) {
        return statusBarColorTransformInt(android.graphics.Color.parseColor(str));
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColorTransformInt(int i) {
        this.mBarParams.statusBarColorTransform = i;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColorTransform(int i) {
        return navigationBarColorTransformInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i));
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColorTransform(java.lang.String str) {
        return navigationBarColorTransformInt(android.graphics.Color.parseColor(str));
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarColorTransformInt(int i) {
        this.mBarParams.navigationBarColorTransform = i;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar barColorTransform(int i) {
        return barColorTransformInt(androidx.core.content.ContextCompat.getColor(this.mActivity, i));
    }

    public com.gyf.immersionbar.ImmersionBar barColorTransform(java.lang.String str) {
        return barColorTransformInt(android.graphics.Color.parseColor(str));
    }

    public com.gyf.immersionbar.ImmersionBar barColorTransformInt(int i) {
        this.mBarParams.statusBarColorTransform = i;
        this.mBarParams.navigationBarColorTransform = i;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar addViewSupportTransformColor(android.view.View view) {
        return addViewSupportTransformColorInt(view, this.mBarParams.statusBarColorTransform);
    }

    public com.gyf.immersionbar.ImmersionBar addViewSupportTransformColor(android.view.View view, int i) {
        return addViewSupportTransformColorInt(view, androidx.core.content.ContextCompat.getColor(this.mActivity, i));
    }

    public com.gyf.immersionbar.ImmersionBar addViewSupportTransformColor(android.view.View view, int i, int i2) {
        return addViewSupportTransformColorInt(view, androidx.core.content.ContextCompat.getColor(this.mActivity, i), androidx.core.content.ContextCompat.getColor(this.mActivity, i2));
    }

    public com.gyf.immersionbar.ImmersionBar addViewSupportTransformColor(android.view.View view, java.lang.String str) {
        return addViewSupportTransformColorInt(view, android.graphics.Color.parseColor(str));
    }

    public com.gyf.immersionbar.ImmersionBar addViewSupportTransformColor(android.view.View view, java.lang.String str, java.lang.String str2) {
        return addViewSupportTransformColorInt(view, android.graphics.Color.parseColor(str), android.graphics.Color.parseColor(str2));
    }

    public com.gyf.immersionbar.ImmersionBar addViewSupportTransformColorInt(android.view.View view, int i) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View参数不能为空");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(java.lang.Integer.valueOf(this.mBarParams.statusBarColor), java.lang.Integer.valueOf(i));
        this.mBarParams.viewMap.put(view, hashMap);
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar addViewSupportTransformColorInt(android.view.View view, int i, int i2) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View参数不能为空");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        this.mBarParams.viewMap.put(view, hashMap);
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar viewAlpha(float f) {
        this.mBarParams.viewAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar removeSupportView(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View参数不能为空");
        }
        java.util.Map<java.lang.Integer, java.lang.Integer> map = this.mBarParams.viewMap.get(view);
        if (map != null && map.size() != 0) {
            this.mBarParams.viewMap.remove(view);
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar removeSupportAllView() {
        if (this.mBarParams.viewMap.size() != 0) {
            this.mBarParams.viewMap.clear();
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar fullScreen(boolean z) {
        this.mBarParams.fullScreen = z;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar statusBarAlpha(float f) {
        this.mBarParams.statusBarAlpha = f;
        this.mBarParams.statusBarTempAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarAlpha(float f) {
        this.mBarParams.navigationBarAlpha = f;
        this.mBarParams.navigationBarTempAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar barAlpha(float f) {
        this.mBarParams.statusBarAlpha = f;
        this.mBarParams.statusBarTempAlpha = f;
        this.mBarParams.navigationBarAlpha = f;
        this.mBarParams.navigationBarTempAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar autoDarkModeEnable(boolean z) {
        return autoDarkModeEnable(z, 0.2f);
    }

    public com.gyf.immersionbar.ImmersionBar autoDarkModeEnable(boolean z, float f) {
        this.mBarParams.autoStatusBarDarkModeEnable = z;
        this.mBarParams.autoStatusBarDarkModeAlpha = f;
        this.mBarParams.autoNavigationBarDarkModeEnable = z;
        this.mBarParams.autoNavigationBarDarkModeAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar autoStatusBarDarkModeEnable(boolean z) {
        return autoStatusBarDarkModeEnable(z, 0.2f);
    }

    public com.gyf.immersionbar.ImmersionBar autoStatusBarDarkModeEnable(boolean z, float f) {
        this.mBarParams.autoStatusBarDarkModeEnable = z;
        this.mBarParams.autoStatusBarDarkModeAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar autoNavigationBarDarkModeEnable(boolean z) {
        return autoNavigationBarDarkModeEnable(z, 0.2f);
    }

    public com.gyf.immersionbar.ImmersionBar autoNavigationBarDarkModeEnable(boolean z, float f) {
        this.mBarParams.autoNavigationBarDarkModeEnable = z;
        this.mBarParams.autoNavigationBarDarkModeAlpha = f;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar statusBarDarkFont(boolean z) {
        return statusBarDarkFont(z, 0.2f);
    }

    public com.gyf.immersionbar.ImmersionBar statusBarDarkFont(boolean z, float f) {
        this.mBarParams.statusBarDarkFont = z;
        if (z && !isSupportStatusBarDarkFont()) {
            this.mBarParams.statusBarAlpha = f;
        } else {
            com.gyf.immersionbar.BarParams barParams = this.mBarParams;
            barParams.flymeOSStatusBarFontColor = barParams.flymeOSStatusBarFontTempColor;
            com.gyf.immersionbar.BarParams barParams2 = this.mBarParams;
            barParams2.statusBarAlpha = barParams2.statusBarTempAlpha;
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarDarkIcon(boolean z) {
        return navigationBarDarkIcon(z, 0.2f);
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarDarkIcon(boolean z, float f) {
        this.mBarParams.navigationBarDarkIcon = z;
        if (z && !isSupportNavigationIconDark()) {
            this.mBarParams.navigationBarAlpha = f;
        } else {
            com.gyf.immersionbar.BarParams barParams = this.mBarParams;
            barParams.navigationBarAlpha = barParams.navigationBarTempAlpha;
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar flymeOSStatusBarFontColor(int i) {
        this.mBarParams.flymeOSStatusBarFontColor = androidx.core.content.ContextCompat.getColor(this.mActivity, i);
        com.gyf.immersionbar.BarParams barParams = this.mBarParams;
        barParams.flymeOSStatusBarFontTempColor = barParams.flymeOSStatusBarFontColor;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar flymeOSStatusBarFontColor(java.lang.String str) {
        this.mBarParams.flymeOSStatusBarFontColor = android.graphics.Color.parseColor(str);
        com.gyf.immersionbar.BarParams barParams = this.mBarParams;
        barParams.flymeOSStatusBarFontTempColor = barParams.flymeOSStatusBarFontColor;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar flymeOSStatusBarFontColorInt(int i) {
        this.mBarParams.flymeOSStatusBarFontColor = i;
        com.gyf.immersionbar.BarParams barParams = this.mBarParams;
        barParams.flymeOSStatusBarFontTempColor = barParams.flymeOSStatusBarFontColor;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar hideBar(com.gyf.immersionbar.BarHide barHide) {
        this.mBarParams.barHide = barHide;
        if (android.os.Build.VERSION.SDK_INT == 19 || com.gyf.immersionbar.OSUtils.isEMUI3_x()) {
            com.gyf.immersionbar.BarParams barParams = this.mBarParams;
            barParams.hideNavigationBar = barParams.barHide == com.gyf.immersionbar.BarHide.FLAG_HIDE_NAVIGATION_BAR || this.mBarParams.barHide == com.gyf.immersionbar.BarHide.FLAG_HIDE_BAR;
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar applySystemFits(boolean z) {
        this.mBarParams.fitsLayoutOverlapEnable = !z;
        setFitsSystemWindows(this.mActivity, z);
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar fitsSystemWindows(boolean z) {
        this.mBarParams.fits = z;
        if (this.mBarParams.fits) {
            if (this.mFitsStatusBarType == 0) {
                this.mFitsStatusBarType = 4;
            }
        } else {
            this.mFitsStatusBarType = 0;
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar fitsSystemWindows(boolean z, int i) {
        return fitsSystemWindowsInt(z, androidx.core.content.ContextCompat.getColor(this.mActivity, i));
    }

    public com.gyf.immersionbar.ImmersionBar fitsSystemWindows(boolean z, int i, int i2, float f) {
        return fitsSystemWindowsInt(z, androidx.core.content.ContextCompat.getColor(this.mActivity, i), androidx.core.content.ContextCompat.getColor(this.mActivity, i2), f);
    }

    public com.gyf.immersionbar.ImmersionBar fitsSystemWindowsInt(boolean z, int i) {
        return fitsSystemWindowsInt(z, i, -16777216, 0.0f);
    }

    public com.gyf.immersionbar.ImmersionBar fitsSystemWindowsInt(boolean z, int i, int i2, float f) {
        this.mBarParams.fits = z;
        this.mBarParams.contentColor = i;
        this.mBarParams.contentColorTransform = i2;
        this.mBarParams.contentAlpha = f;
        if (this.mBarParams.fits) {
            if (this.mFitsStatusBarType == 0) {
                this.mFitsStatusBarType = 4;
            }
        } else {
            this.mFitsStatusBarType = 0;
        }
        this.mContentView.setBackgroundColor(androidx.core.graphics.ColorUtils.blendARGB(this.mBarParams.contentColor, this.mBarParams.contentColorTransform, this.mBarParams.contentAlpha));
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar fitsLayoutOverlapEnable(boolean z) {
        this.mBarParams.fitsLayoutOverlapEnable = z;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar statusBarView(android.view.View view) {
        if (view == null) {
            return this;
        }
        this.mBarParams.statusBarView = view;
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 3;
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar statusBarView(int i) {
        return statusBarView(this.mActivity.findViewById(i));
    }

    public com.gyf.immersionbar.ImmersionBar statusBarView(int i, android.view.View view) {
        return statusBarView(view.findViewById(i));
    }

    public com.gyf.immersionbar.ImmersionBar titleBar(android.view.View view) {
        return view == null ? this : titleBar(view, true);
    }

    public com.gyf.immersionbar.ImmersionBar titleBar(android.view.View view, boolean z) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 1;
        }
        this.mBarParams.titleBarView = view;
        this.mBarParams.statusBarColorEnabled = z;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar titleBar(int i) {
        return titleBar(i, true);
    }

    public com.gyf.immersionbar.ImmersionBar titleBar(int i, boolean z) {
        androidx.fragment.app.Fragment fragment = this.mSupportFragment;
        if (fragment != null && fragment.getView() != null) {
            return titleBar(this.mSupportFragment.getView().findViewById(i), z);
        }
        android.app.Fragment fragment2 = this.mFragment;
        if (fragment2 != null && fragment2.getView() != null) {
            return titleBar(this.mFragment.getView().findViewById(i), z);
        }
        return titleBar(this.mActivity.findViewById(i), z);
    }

    public com.gyf.immersionbar.ImmersionBar titleBar(int i, android.view.View view) {
        return titleBar(view.findViewById(i), true);
    }

    public com.gyf.immersionbar.ImmersionBar titleBar(int i, android.view.View view, boolean z) {
        return titleBar(view.findViewById(i), z);
    }

    public com.gyf.immersionbar.ImmersionBar titleBarMarginTop(int i) {
        androidx.fragment.app.Fragment fragment = this.mSupportFragment;
        if (fragment != null && fragment.getView() != null) {
            return titleBarMarginTop(this.mSupportFragment.getView().findViewById(i));
        }
        android.app.Fragment fragment2 = this.mFragment;
        if (fragment2 != null && fragment2.getView() != null) {
            return titleBarMarginTop(this.mFragment.getView().findViewById(i));
        }
        return titleBarMarginTop(this.mActivity.findViewById(i));
    }

    public com.gyf.immersionbar.ImmersionBar titleBarMarginTop(int i, android.view.View view) {
        return titleBarMarginTop(view.findViewById(i));
    }

    public com.gyf.immersionbar.ImmersionBar titleBarMarginTop(android.view.View view) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 2;
        }
        this.mBarParams.titleBarView = view;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar supportActionBar(boolean z) {
        this.mBarParams.isSupportActionBar = z;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar statusBarColorTransformEnable(boolean z) {
        this.mBarParams.statusBarColorEnabled = z;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar reset() {
        this.mBarParams = new com.gyf.immersionbar.BarParams();
        this.mFitsStatusBarType = 0;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar addTag(java.lang.String str) {
        if (isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("tag不能为空");
        }
        this.mTagMap.put(str, this.mBarParams.m85clone());
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar getTag(java.lang.String str) {
        if (isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("tag不能为空");
        }
        com.gyf.immersionbar.BarParams barParams = this.mTagMap.get(str);
        if (barParams != null) {
            this.mBarParams = barParams.m85clone();
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar keyboardEnable(boolean z) {
        return keyboardEnable(z, this.mBarParams.keyboardMode);
    }

    public com.gyf.immersionbar.ImmersionBar keyboardEnable(boolean z, int i) {
        this.mBarParams.keyboardEnable = z;
        this.mBarParams.keyboardMode = i;
        this.mKeyboardTempEnable = z;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar keyboardMode(int i) {
        this.mBarParams.keyboardMode = i;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar setOnKeyboardListener(com.gyf.immersionbar.OnKeyboardListener onKeyboardListener) {
        if (this.mBarParams.onKeyboardListener == null) {
            this.mBarParams.onKeyboardListener = onKeyboardListener;
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar setOnNavigationBarListener(com.gyf.immersionbar.OnNavigationBarListener onNavigationBarListener) {
        if (onNavigationBarListener != null) {
            if (this.mBarParams.onNavigationBarListener == null) {
                this.mBarParams.onNavigationBarListener = onNavigationBarListener;
                com.gyf.immersionbar.NavigationBarObserver.getInstance().addOnNavigationBarListener(this.mBarParams.onNavigationBarListener);
            }
        } else if (this.mBarParams.onNavigationBarListener != null) {
            com.gyf.immersionbar.NavigationBarObserver.getInstance().removeOnNavigationBarListener(this.mBarParams.onNavigationBarListener);
            this.mBarParams.onNavigationBarListener = null;
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar setOnBarListener(com.gyf.immersionbar.OnBarListener onBarListener) {
        if (onBarListener != null) {
            if (this.mBarParams.onBarListener == null) {
                this.mBarParams.onBarListener = onBarListener;
            }
        } else if (this.mBarParams.onBarListener != null) {
            this.mBarParams.onBarListener = null;
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarEnable(boolean z) {
        this.mBarParams.navigationBarEnable = z;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarWithKitkatEnable(boolean z) {
        this.mBarParams.navigationBarWithKitkatEnable = z;
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar navigationBarWithEMUI3Enable(boolean z) {
        if (com.gyf.immersionbar.OSUtils.isEMUI3_x()) {
            this.mBarParams.navigationBarWithEMUI3Enable = z;
            this.mBarParams.navigationBarWithKitkatEnable = z;
        }
        return this;
    }

    public com.gyf.immersionbar.ImmersionBar barEnable(boolean z) {
        this.mBarParams.barEnable = z;
        return this;
    }

    private static com.gyf.immersionbar.RequestManagerRetriever getRetriever() {
        return com.gyf.immersionbar.RequestManagerRetriever.getInstance();
    }

    private static boolean isEmpty(java.lang.String str) {
        return str == null || str.trim().length() == 0;
    }
}
