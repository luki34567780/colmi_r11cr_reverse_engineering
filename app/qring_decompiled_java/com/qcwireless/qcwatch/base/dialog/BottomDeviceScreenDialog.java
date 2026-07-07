package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomDeviceScreenDialog {
    private android.widget.TextView cancel;
    private android.widget.TextView confirm;
    private android.view.View contentView;
    private android.app.Dialog dialog;
    private java.lang.String finalSecond;
    private com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.SelectSecondListener listener;
    private java.util.List<java.lang.String> screenItems;
    private com.contrarywind.view.WheelView screenSecond;

    public interface SelectSecondListener {
        void showSecond(java.lang.String number);
    }

    private BottomDeviceScreenDialog() {
        this.screenItems = new java.util.ArrayList();
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

    public com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.SelectSecondListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.SelectSecondListener listener) {
        this.listener = listener;
    }

    public void setCurr(int second) {
        this.screenSecond.setCurrentItem(second - 4);
    }

    public void initData(android.content.Context context) {
        this.screenSecond = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_second);
        this.cancel = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        this.confirm = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        for (int i = 4; i <= 10; i++) {
            this.screenItems.add(java.lang.String.valueOf(i));
        }
        this.screenSecond.setAdapter(new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(this.screenItems));
        this.screenSecond.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.screenSecond.setTextSize(30.0f);
        this.screenSecond.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.screenSecond.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.screenSecond.setItemsVisibleCount(5);
        this.screenSecond.setLabel("s");
        this.screenSecond.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog bottomDeviceScreenDialog = com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.this;
                bottomDeviceScreenDialog.finalSecond = (java.lang.String) bottomDeviceScreenDialog.screenItems.get(index);
            }
        });
        this.cancel.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.this.dismiss();
            }
        });
        this.confirm.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                if (com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.this.listener != null && !android.text.TextUtils.isEmpty(com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.this.finalSecond)) {
                    com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.this.listener.showSecond(com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.this.finalSecond);
                }
                com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.this.dismiss();
            }
        });
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

        public com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.Builder setContentView(int layoutId) {
            this.layoutId = layoutId;
            this.contentView = android.view.LayoutInflater.from(this.context).inflate(this.layoutId, (android.view.ViewGroup) this.bottomLayout);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.Builder setContentView(android.view.View contentView) {
            this.contentView = contentView;
            this.bottomLayout.addView(contentView);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.Builder setHasAnimation(boolean hasAnimation) {
            this.hasAnimation = hasAnimation;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog create() {
            com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog bottomDeviceScreenDialog = new com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog();
            this.dialog = new android.app.Dialog(this.context, com.qcwireless.qcwatch.R.style.BottomDialog);
            this.contentView.measure(0, 0);
            this.bottomLayout.measure(0, 0);
            this.dialog.setContentView((android.view.View) this.bottomLayout);
            android.view.Window window = this.dialog.getWindow();
            window.setGravity(80);
            if (this.hasAnimation) {
                window.setWindowAnimations(com.qcwireless.qcwatch.R.style.DialogAnimation);
            }
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 0;
            attributes.y = (int) com.qcwireless.qcwatch.base.dialog.BottomDeviceScreenDialog.dp2px(this.context, 16.0f);
            attributes.width = this.context.getResources().getDisplayMetrics().widthPixels;
            attributes.height = this.bottomLayout.getMeasuredHeight();
            window.setAttributes(attributes);
            this.dialog.show();
            bottomDeviceScreenDialog.dialog = this.dialog;
            bottomDeviceScreenDialog.contentView = this.contentView;
            return bottomDeviceScreenDialog;
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
}
