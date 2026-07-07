package com.qcwireless.qcwatch.ui.base;

/* compiled from: BaseFragment.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0018J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010'\u001a\u0004\u0018\u00010\u00162\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\b\u0010-\u001a\u00020\u001aH\u0016J\b\u0010.\u001a\u00020\u001aH\u0016J\b\u0010/\u001a\u00020\u001aH\u0016J\b\u00100\u001a\u00020\u001aH\u0016J\b\u00101\u001a\u00020\u001aH\u0016J\b\u00102\u001a\u00020\u001aH\u0016J\u001a\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0006\u00105\u001a\u00020\u001aJ\u000e\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001dJ\u000e\u00108\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u000f\u001a\u00060\u0010R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "dialog", "Lcom/qcwireless/qcwatch/base/dialog/loading/ShapeLoadingDialog;", "dialogCallback", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment$DialogCallback;", "getDialogCallback", "()Lcom/qcwireless/qcwatch/ui/base/BaseFragment$DialogCallback;", "handler", "Landroid/os/Handler;", "loadErrorView", "Landroid/view/View;", "mHasLoadedData", "", "dismissLoadingDialog", "", "dismissLoadingDialogDelay", "delay", "", "isDialogShowing", "loadDataOnce", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onDetach", "onPause", "onResume", "onStart", "onStop", "onViewCreated", "view", "showLoadingDialog", "showLoadingDialogTimeout", "timeout", "showLoadingDialogTimeoutNotCancel", "DialogCallback", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class BaseFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG;
    public android.app.Activity activity;
    private com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog dialog;
    private final com.qcwireless.qcwatch.ui.base.BaseFragment.DialogCallback dialogCallback;
    private final android.os.Handler handler;
    private android.view.View loadErrorView;
    private boolean mHasLoadedData;

    public void loadDataOnce() {
    }

    public BaseFragment() {
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.base.BaseFragment$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        java.lang.String simpleName = getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
        this.TAG = simpleName;
        this.dialogCallback = new com.qcwireless.qcwatch.ui.base.BaseFragment.DialogCallback();
    }

    public final android.app.Activity getActivity() {
        android.app.Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("activity");
        return null;
    }

    public final void setActivity(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<set-?>");
        this.activity = activity;
    }

    protected final java.lang.String getTAG() {
        return this.TAG;
    }

    public final com.qcwireless.qcwatch.ui.base.BaseFragment.DialogCallback getDialogCallback() {
        return this.dialogCallback;
    }

    public void onAttach(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        setActivity((android.app.Activity) requireActivity);
    }

    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    public void onActivityCreated(android.os.Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
        if (this.mHasLoadedData) {
            return;
        }
        loadDataOnce();
        this.mHasLoadedData = true;
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDetach() {
        super.onDetach();
    }

    public final void showLoadingDialog() {
        try {
            if (this.dialog == null) {
                android.view.WindowManager windowManager = getActivity().getWindowManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowManager, "activity.windowManager");
                android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultDisplay, "winManage.defaultDisplay");
                this.dialog = new com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder(getContext()).setScreenAndStatus(defaultDisplay.getHeight(), com.qcwireless.qcwatch.ui.base.util.AppToolsKt.getStatusBarHeight(getActivity())).build();
            }
            com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog = this.dialog;
            kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
            shapeLoadingDialog.show();
            this.handler.removeCallbacks(this.dialogCallback);
            this.handler.postDelayed(this.dialogCallback, 10000L);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void showLoadingDialogTimeout(int timeout) {
        try {
            if (this.dialog == null) {
                android.view.WindowManager windowManager = getActivity().getWindowManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowManager, "activity.windowManager");
                android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultDisplay, "winManage.defaultDisplay");
                this.dialog = new com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder(getContext()).setScreenAndStatus(defaultDisplay.getHeight(), com.qcwireless.qcwatch.ui.base.util.AppToolsKt.getStatusBarHeight(getActivity())).build();
            }
            com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog = this.dialog;
            kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
            shapeLoadingDialog.show();
            this.handler.removeCallbacks(this.dialogCallback);
            this.handler.postDelayed(this.dialogCallback, timeout);
        } catch (java.lang.Exception unused) {
        }
    }

    /* compiled from: BaseFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/BaseFragment$DialogCallback;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/base/BaseFragment;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class DialogCallback implements java.lang.Runnable {
        public DialogCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.base.BaseFragment.this.dismissLoadingDialog();
        }
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
        if (getActivity() == null || (shapeLoadingDialog = this.dialog) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
        if (shapeLoadingDialog.isShowing()) {
            com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog2 = this.dialog;
            kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog2);
            shapeLoadingDialog2.dismiss();
        }
    }

    public final void dismissLoadingDialogDelay(int delay) {
        if (getActivity() == null) {
            return;
        }
        this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.BaseFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.base.BaseFragment.m507dismissLoadingDialogDelay$lambda0(com.qcwireless.qcwatch.ui.base.BaseFragment.this);
            }
        }, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dismissLoadingDialogDelay$lambda-0, reason: not valid java name */
    public static final void m507dismissLoadingDialogDelay$lambda0(com.qcwireless.qcwatch.ui.base.BaseFragment baseFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseFragment, "this$0");
        com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog = baseFragment.dialog;
        if (shapeLoadingDialog != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
            if (shapeLoadingDialog.isShowing()) {
                com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog2 = baseFragment.dialog;
                kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog2);
                shapeLoadingDialog2.dismiss();
            }
        }
    }

    public final void showLoadingDialogTimeoutNotCancel(int timeout) {
        try {
            if (getActivity() == null) {
                return;
            }
            if (this.dialog == null) {
                android.view.WindowManager windowManager = getActivity().getWindowManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowManager, "activity.windowManager");
                android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultDisplay, "winManage.defaultDisplay");
                this.dialog = new com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder(getActivity()).cancelable(false).setScreenAndStatus(defaultDisplay.getHeight(), com.qcwireless.qcwatch.ui.base.util.AppToolsKt.getStatusBarHeight(getActivity())).build();
            }
            com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog = this.dialog;
            kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog);
            shapeLoadingDialog.show();
            com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog shapeLoadingDialog2 = this.dialog;
            kotlin.jvm.internal.Intrinsics.checkNotNull(shapeLoadingDialog2);
            shapeLoadingDialog2.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() { // from class: com.qcwireless.qcwatch.ui.base.BaseFragment$showLoadingDialogTimeoutNotCancel$1
                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(android.content.DialogInterface dialog, int keyCode, android.view.KeyEvent event) {
                    if (keyCode != 4) {
                        return false;
                    }
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "------------");
                    return true;
                }
            });
            this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.base.BaseFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.qcwireless.qcwatch.ui.base.BaseFragment.m508showLoadingDialogTimeoutNotCancel$lambda1(com.qcwireless.qcwatch.ui.base.BaseFragment.this);
                }
            }, timeout);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoadingDialogTimeoutNotCancel$lambda-1, reason: not valid java name */
    public static final void m508showLoadingDialogTimeoutNotCancel$lambda1(com.qcwireless.qcwatch.ui.base.BaseFragment baseFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseFragment, "this$0");
        baseFragment.dismissLoadingDialog();
    }
}
