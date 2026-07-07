package com.qcwireless.qcwatch.base.dialog.loading;

/* loaded from: /tmp/dex/classes2.dex */
public class ShapeLoadingDialog extends android.app.AlertDialog {
    private com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder mBuilder;
    private com.qcwireless.qcwatch.ui.base.view.LoadingView mLoadingView;

    private ShapeLoadingDialog(com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder builder) {
        super(builder.mContext, com.qcwireless.qcwatch.R.style.loading_dialog);
        this.mBuilder = builder;
        setCancelable(builder.mCancelable);
        setCanceledOnTouchOutside(this.mBuilder.mCanceledOnTouchOutside);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog);
        com.qcwireless.qcwatch.ui.base.view.LoadingView loadingView = (com.qcwireless.qcwatch.ui.base.view.LoadingView) findViewById(com.qcwireless.qcwatch.R.id.loadView);
        this.mLoadingView = loadingView;
        loadingView.setLoadingText(this.mBuilder.mLoadText);
        setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface dialog) {
                com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.this.mLoadingView.setVisibility(8);
            }
        });
    }

    public void setLoadingText(java.lang.String text) {
        com.qcwireless.qcwatch.ui.base.view.LoadingView loadingView = this.mLoadingView;
        if (loadingView != null) {
            loadingView.setLoadingText(text);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.mLoadingView.setVisibility(0);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = this.mBuilder.screenHeight - this.mBuilder.statusBar;
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        getWindow().setAttributes(attributes);
    }

    public com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder getBuilder() {
        return this.mBuilder;
    }

    public static class Builder {
        private android.content.Context mContext;
        private java.lang.CharSequence mLoadText;
        private int screenHeight;
        private int statusBar;
        private int mDelay = 1;
        private boolean mCancelable = true;
        private boolean mCanceledOnTouchOutside = true;

        public Builder(android.content.Context context) {
            this.mContext = context;
        }

        public com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder delay(int delay) {
            this.mDelay = delay;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder loadText(java.lang.CharSequence loadText) {
            this.mLoadText = loadText;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder loadText(int resId) {
            this.mLoadText = this.mContext.getString(resId);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder cancelable(boolean cancelable) {
            this.mCancelable = cancelable;
            this.mCanceledOnTouchOutside = cancelable;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder setScreenAndStatus(int height, int bar) {
            this.screenHeight = height;
            this.statusBar = bar;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog.Builder canceledOnTouchOutside(boolean canceledOnTouchOutside) {
            this.mCanceledOnTouchOutside = canceledOnTouchOutside;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog build() {
            return new com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog(this);
        }

        public com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog show() {
            com.qcwireless.qcwatch.base.dialog.loading.ShapeLoadingDialog build = build();
            build.show();
            return build;
        }
    }
}
