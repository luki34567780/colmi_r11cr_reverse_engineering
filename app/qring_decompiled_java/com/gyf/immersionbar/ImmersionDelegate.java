package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
class ImmersionDelegate implements java.lang.Runnable {
    private com.gyf.immersionbar.BarProperties mBarProperties;
    private com.gyf.immersionbar.ImmersionBar mImmersionBar;
    private int mNotchHeight;
    private com.gyf.immersionbar.OnBarListener mOnBarListener;

    ImmersionDelegate(java.lang.Object obj) {
        if (obj instanceof android.app.Activity) {
            if (this.mImmersionBar == null) {
                this.mImmersionBar = new com.gyf.immersionbar.ImmersionBar((android.app.Activity) obj);
                return;
            }
            return;
        }
        if (obj instanceof androidx.fragment.app.Fragment) {
            if (this.mImmersionBar == null) {
                if (obj instanceof androidx.fragment.app.DialogFragment) {
                    this.mImmersionBar = new com.gyf.immersionbar.ImmersionBar((androidx.fragment.app.DialogFragment) obj);
                    return;
                } else {
                    this.mImmersionBar = new com.gyf.immersionbar.ImmersionBar((androidx.fragment.app.Fragment) obj);
                    return;
                }
            }
            return;
        }
        if ((obj instanceof android.app.Fragment) && this.mImmersionBar == null) {
            if (obj instanceof android.app.DialogFragment) {
                this.mImmersionBar = new com.gyf.immersionbar.ImmersionBar((android.app.DialogFragment) obj);
            } else {
                this.mImmersionBar = new com.gyf.immersionbar.ImmersionBar((android.app.Fragment) obj);
            }
        }
    }

    ImmersionDelegate(android.app.Activity activity, android.app.Dialog dialog) {
        if (this.mImmersionBar == null) {
            this.mImmersionBar = new com.gyf.immersionbar.ImmersionBar(activity, dialog);
        }
    }

    public com.gyf.immersionbar.ImmersionBar get() {
        return this.mImmersionBar;
    }

    void onActivityCreated(android.content.res.Configuration configuration) {
        barChanged(configuration);
    }

    void onResume() {
        com.gyf.immersionbar.ImmersionBar immersionBar = this.mImmersionBar;
        if (immersionBar != null) {
            immersionBar.onResume();
        }
    }

    void onDestroy() {
        this.mBarProperties = null;
        com.gyf.immersionbar.ImmersionBar immersionBar = this.mImmersionBar;
        if (immersionBar != null) {
            immersionBar.onDestroy();
            this.mImmersionBar = null;
        }
    }

    void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.gyf.immersionbar.ImmersionBar immersionBar = this.mImmersionBar;
        if (immersionBar != null) {
            immersionBar.onConfigurationChanged(configuration);
            barChanged(configuration);
        }
    }

    private void barChanged(android.content.res.Configuration configuration) {
        com.gyf.immersionbar.ImmersionBar immersionBar = this.mImmersionBar;
        if (immersionBar == null || !immersionBar.initialized() || android.os.Build.VERSION.SDK_INT < 19) {
            return;
        }
        com.gyf.immersionbar.OnBarListener onBarListener = this.mImmersionBar.getBarParams().onBarListener;
        this.mOnBarListener = onBarListener;
        if (onBarListener != null) {
            android.app.Activity activity = this.mImmersionBar.getActivity();
            if (this.mBarProperties == null) {
                this.mBarProperties = new com.gyf.immersionbar.BarProperties();
            }
            this.mBarProperties.setPortrait(configuration.orientation == 1);
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            if (rotation == 1) {
                this.mBarProperties.setLandscapeLeft(true);
                this.mBarProperties.setLandscapeRight(false);
            } else if (rotation == 3) {
                this.mBarProperties.setLandscapeLeft(false);
                this.mBarProperties.setLandscapeRight(true);
            } else {
                this.mBarProperties.setLandscapeLeft(false);
                this.mBarProperties.setLandscapeRight(false);
            }
            activity.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.gyf.immersionbar.ImmersionBar immersionBar = this.mImmersionBar;
        if (immersionBar == null || immersionBar.getActivity() == null) {
            return;
        }
        android.app.Activity activity = this.mImmersionBar.getActivity();
        com.gyf.immersionbar.BarConfig barConfig = new com.gyf.immersionbar.BarConfig(activity);
        this.mBarProperties.setStatusBarHeight(barConfig.getStatusBarHeight());
        this.mBarProperties.setNavigationBar(barConfig.hasNavigationBar());
        this.mBarProperties.setNavigationBarHeight(barConfig.getNavigationBarHeight());
        this.mBarProperties.setNavigationBarWidth(barConfig.getNavigationBarWidth());
        this.mBarProperties.setActionBarHeight(barConfig.getActionBarHeight());
        boolean hasNotchScreen = com.gyf.immersionbar.NotchUtils.hasNotchScreen(activity);
        this.mBarProperties.setNotchScreen(hasNotchScreen);
        if (hasNotchScreen && this.mNotchHeight == 0) {
            int notchHeight = com.gyf.immersionbar.NotchUtils.getNotchHeight(activity);
            this.mNotchHeight = notchHeight;
            this.mBarProperties.setNotchHeight(notchHeight);
        }
        this.mOnBarListener.onBarChange(this.mBarProperties);
    }
}
