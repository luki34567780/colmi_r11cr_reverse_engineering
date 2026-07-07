package com.qcwireless.qcwatch.ui.base;

/* compiled from: BaseActivity.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\fJ\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0014J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u000eH\u0014J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u000eH\u0014J\b\u0010\u001e\u001a\u00020\u000eH\u0014J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u000eH\u0016J\b\u0010%\u001a\u00020\u000eH\u0014J\u0006\u0010&\u001a\u00020\u000eJ\u000e\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020#J\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020#R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseThemeActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "dialog", "Lcom/qcwireless/qcwatch/base/dialog/loading/ShapeLoadingDialog;", "handler", "Landroid/os/Handler;", "isActive", "", "dismissLoadingDialog", "", "getDelegate", "Landroidx/appcompat/app/AppCompatDelegate;", "isDialogShowing", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onRestart", "onRestoreInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "setContentView", "layoutView", "Landroid/view/View;", "layoutResID", "", "setStatusBarNoBackground", "setupViews", "showLoadingDialog", "showLoadingDialogTimeout", "timeout", "showLoadingDialogTimeoutNotCancel", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class BaseActivity extends com.qcwireless.qcwatch.ui.base.BaseThemeActivity {
    private final java.lang.String TAG;
    private com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog dialog;
    private final android.os.Handler handler;
    private boolean isActive;

    public BaseActivity() {
        java.lang.String simpleName = getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
        this.TAG = simpleName;
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.base.BaseActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    protected final java.lang.String getTAG() {
        return this.TAG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.appcompat.app.AppCompatDelegate getDelegate() {
        androidx.appcompat.app.AppCompatDelegate appCompatDelegate = androidx.appcompat.app.SkinAppCompatDelegateImpl.get((android.app.Activity) this, (androidx.appcompat.app.AppCompatCallback) this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatDelegate, "get(this, this)");
        return appCompatDelegate;
    }

    protected void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
    }

    protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }

    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    protected void onRestart() {
        super.onRestart();
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onResume() {
        super.onResume();
        this.isActive = true;
    }

    protected void onPause() {
        super.onPause();
        this.isActive = false;
    }

    protected void onStop() {
        super.onStop();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setupViews();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    public void setContentView(android.view.View layoutView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutView, "layoutView");
        super.setContentView(layoutView);
        setupViews();
    }

    protected void setupViews() {
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.qcwireless.qcwatch.R.id.ivNavigateBefore);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131297422);
        if (imageView != null) {
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.BaseActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.qcwireless.qcwatch.ui.base.BaseActivity.m503setupViews$lambda0(com.qcwireless.qcwatch.ui.base.BaseActivity.this, view);
                }
            });
        }
        if (textView == null) {
            return;
        }
        textView.setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-0, reason: not valid java name */
    public static final void m503setupViews$lambda0(com.qcwireless.qcwatch.ui.base.BaseActivity baseActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseActivity, "this$0");
        baseActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStatusBarNoBackground() {
        com.gyf.immersionbar.ImmersionBar.with((android.app.Activity) this).transparentStatusBar().transparentNavigationBar().fitsSystemWindows(false).init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showLoadingDialog() {
        try {
            if (getActivity() != null) {
                android.app.Activity activity = getActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
                if (activity.isDestroyed()) {
                    return;
                }
                if (this.dialog == null) {
                    android.view.WindowManager windowManager = getWindowManager();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowManager, "windowManager");
                    android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultDisplay, "winManage.defaultDisplay");
                    this.dialog = new com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder((android.content.Context) this).setScreenAndStatus(defaultDisplay.getHeight(), com.qcwireless.qcwatch.ui.base.util.AppToolsKt.getStatusBarHeight((android.content.Context) this)).build();
                }
                com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog = this.dialog;
                kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
                shapeLoadingDialog.show();
                this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.BaseActivity$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.base.BaseActivity.m504showLoadingDialog$lambda1(com.qcwireless.qcwatch.ui.base.BaseActivity.this);
                    }
                }, 10000L);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoadingDialog$lambda-1, reason: not valid java name */
    public static final void m504showLoadingDialog$lambda1(com.qcwireless.qcwatch.ui.base.BaseActivity baseActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseActivity, "this$0");
        baseActivity.dismissLoadingDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showLoadingDialogTimeoutNotCancel(int timeout) {
        try {
            if (getActivity() != null) {
                android.app.Activity activity = getActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
                if (activity.isDestroyed()) {
                    return;
                }
                if (this.dialog == null) {
                    android.view.WindowManager windowManager = getWindowManager();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowManager, "windowManager");
                    android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultDisplay, "winManage.defaultDisplay");
                    this.dialog = new com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder((android.content.Context) this).cancelable(false).setScreenAndStatus(defaultDisplay.getHeight(), com.qcwireless.qcwatch.ui.base.util.AppToolsKt.getStatusBarHeight((android.content.Context) this)).build();
                }
                com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog = this.dialog;
                kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
                shapeLoadingDialog.show();
                com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog2 = this.dialog;
                kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog2);
                shapeLoadingDialog2.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() { // from class: com.qcwireless.qcwatch.ui.base.BaseActivity$showLoadingDialogTimeoutNotCancel$1
                    @Override // android.content.DialogInterface.OnKeyListener
                    public boolean onKey(android.content.DialogInterface dialog, int keyCode, android.view.KeyEvent event) {
                        if (keyCode != 4) {
                            return false;
                        }
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "------------");
                        return true;
                    }
                });
                this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.BaseActivity$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.base.BaseActivity.m506showLoadingDialogTimeoutNotCancel$lambda2(com.qcwireless.qcwatch.ui.base.BaseActivity.this);
                    }
                }, timeout);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoadingDialogTimeoutNotCancel$lambda-2, reason: not valid java name */
    public static final void m506showLoadingDialogTimeoutNotCancel$lambda2(com.qcwireless.qcwatch.ui.base.BaseActivity baseActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseActivity, "this$0");
        baseActivity.dismissLoadingDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showLoadingDialogTimeout(int timeout) {
        try {
            if (getActivity() != null) {
                android.app.Activity activity = getActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
                if (activity.isDestroyed()) {
                    return;
                }
                if (this.dialog == null) {
                    android.view.WindowManager windowManager = getWindowManager();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowManager, "windowManager");
                    android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultDisplay, "winManage.defaultDisplay");
                    this.dialog = new com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder((android.content.Context) this).setScreenAndStatus(defaultDisplay.getHeight(), com.qcwireless.qcwatch.ui.base.util.AppToolsKt.getStatusBarHeight((android.content.Context) this)).build();
                }
                com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog = this.dialog;
                kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
                shapeLoadingDialog.show();
                this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.BaseActivity$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.base.BaseActivity.m505showLoadingDialogTimeout$lambda3(com.qcwireless.qcwatch.ui.base.BaseActivity.this);
                    }
                }, timeout);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoadingDialogTimeout$lambda-3, reason: not valid java name */
    public static final void m505showLoadingDialogTimeout$lambda3(com.qcwireless.qcwatch.ui.base.BaseActivity baseActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseActivity, "this$0");
        baseActivity.dismissLoadingDialog();
    }

    public final boolean isDialogShowing() {
        com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog;
        if (getActivity() == null || (shapeLoadingDialog = this.dialog) == null) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
        return shapeLoadingDialog.isShowing();
    }

    public final void dismissLoadingDialog() {
        com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog;
        try {
            if (getActivity() != null) {
                android.app.Activity activity = getActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
                if (activity.isDestroyed() || (shapeLoadingDialog = this.dialog) == null) {
                    return;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
                if (shapeLoadingDialog.isShowing()) {
                    com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog2 = this.dialog;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog2);
                    shapeLoadingDialog2.dismiss();
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
