package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class CenterDialog {
    private android.view.View contentView;
    private android.app.Dialog dialog;

    private CenterDialog() {
    }

    public android.view.View getContentView() {
        return this.contentView;
    }

    public void setCancelable(boolean cancelable) {
        this.dialog.setCancelable(cancelable);
    }

    public void setCanceledOnTouchOutside(boolean cancel) {
        this.dialog.setCanceledOnTouchOutside(cancel);
    }

    public static class Builder {
        private androidx.constraintlayout.widget.ConstraintLayout bottomLayout;
        private android.view.View contentView;
        private android.content.Context context;
        private android.app.Dialog dialog;
        private boolean hasAnimation = true;
        private int layoutId;

        public Builder(android.content.Context context) {
            this.context = context;
            this.bottomLayout = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.layout_bottomdialog, (android.view.ViewGroup) null);
        }

        public com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder setContentView(int layoutId) {
            this.layoutId = layoutId;
            this.contentView = android.view.LayoutInflater.from(this.context).inflate(this.layoutId, (android.view.ViewGroup) this.bottomLayout);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder setContentView(android.view.View contentView) {
            this.contentView = contentView;
            this.bottomLayout.addView(contentView);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder setHasAnimation(boolean hasAnimation) {
            this.hasAnimation = hasAnimation;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.CenterDialog create() {
            com.qcwireless.qcwatch.base.dialog.CenterDialog centerDialog = new com.qcwireless.qcwatch.base.dialog.CenterDialog();
            this.dialog = new android.app.Dialog(this.context, com.qcwireless.qcwatch.R.style.CenterDialog);
            this.contentView.measure(0, 0);
            this.bottomLayout.measure(0, 0);
            this.dialog.setContentView((android.view.View) this.bottomLayout);
            android.view.Window window = this.dialog.getWindow();
            window.setGravity(17);
            if (this.hasAnimation) {
                window.setWindowAnimations(com.qcwireless.qcwatch.R.style.DialogAnimation);
            }
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 0;
            attributes.y = (int) com.qcwireless.qcwatch.base.dialog.CenterDialog.dp2px(this.context, 16.0f);
            attributes.width = this.context.getResources().getDisplayMetrics().widthPixels;
            attributes.height = -2;
            attributes.horizontalMargin = 20.0f;
            window.setAttributes(attributes);
            this.dialog.show();
            centerDialog.dialog = this.dialog;
            centerDialog.contentView = this.contentView;
            return centerDialog;
        }
    }

    public static float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public void show() {
        this.dialog.show();
    }

    public void dismiss() {
        this.dialog.dismiss();
    }

    public boolean isShowing() {
        return this.dialog.isShowing();
    }
}
