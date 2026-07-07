package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
public class BarParams implements java.lang.Cloneable {
    public int flymeOSStatusBarFontColor;
    public int flymeOSStatusBarFontTempColor;
    com.gyf.immersionbar.OnBarListener onBarListener;
    com.gyf.immersionbar.OnKeyboardListener onKeyboardListener;
    com.gyf.immersionbar.OnNavigationBarListener onNavigationBarListener;
    public android.view.View statusBarView;
    public android.view.View titleBarView;
    public int statusBarColor = 0;
    public int navigationBarColor = -16777216;
    public int defaultNavigationBarColor = -16777216;
    public float statusBarAlpha = 0.0f;
    public float statusBarTempAlpha = 0.0f;
    public float navigationBarAlpha = 0.0f;
    public float navigationBarTempAlpha = 0.0f;
    public boolean fullScreen = false;
    public boolean hideNavigationBar = false;
    public com.gyf.immersionbar.BarHide barHide = com.gyf.immersionbar.BarHide.FLAG_SHOW_BAR;
    public boolean statusBarDarkFont = false;
    public boolean navigationBarDarkIcon = false;
    public boolean autoStatusBarDarkModeEnable = false;
    public boolean autoNavigationBarDarkModeEnable = false;
    public float autoStatusBarDarkModeAlpha = 0.0f;
    public float autoNavigationBarDarkModeAlpha = 0.0f;
    public boolean statusBarColorEnabled = true;
    public int statusBarColorTransform = -16777216;
    public int navigationBarColorTransform = -16777216;
    java.util.Map<android.view.View, java.util.Map<java.lang.Integer, java.lang.Integer>> viewMap = new java.util.HashMap();
    public float viewAlpha = 0.0f;
    public int contentColor = 0;
    public int contentColorTransform = -16777216;
    public float contentAlpha = 0.0f;
    public boolean fits = false;
    public boolean fitsLayoutOverlapEnable = true;
    public boolean isSupportActionBar = false;
    public boolean keyboardEnable = false;
    public int keyboardMode = 18;
    public boolean navigationBarEnable = true;
    public boolean navigationBarWithKitkatEnable = true;
    public boolean navigationBarWithEMUI3Enable = true;
    public boolean barEnable = true;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.gyf.immersionbar.BarParams m85clone() {
        try {
            return (com.gyf.immersionbar.BarParams) super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }
}
