package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomDeviceHeartDialog {
    private android.widget.TextView cancel;
    private android.widget.TextView confirm;
    private android.view.View contentView;
    private android.app.Dialog dialog;
    private java.lang.String finalSecond;
    private com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.SelectSecondListener listener;
    private java.util.List<java.lang.String> screenItems;
    private java.util.List<java.lang.String> screenItemsBack;
    private com.contrarywind.view.WheelView screenSecond;

    public interface SelectSecondListener {
        void showSecond(java.lang.String number);
    }

    private BottomDeviceHeartDialog() {
        this.screenItems = new java.util.ArrayList();
        this.screenItemsBack = new java.util.ArrayList();
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

    public com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.SelectSecondListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.SelectSecondListener listener) {
        this.listener = listener;
    }

    public void setCurrItemText(java.lang.String index) {
        if (this.screenSecond != null) {
            for (int i = 0; i < this.screenItems.size(); i++) {
                if (this.screenItems.get(i).equalsIgnoreCase(index)) {
                    this.finalSecond = this.screenItemsBack.get(i);
                    this.screenSecond.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    public void initData(android.content.Context context) {
        this.screenSecond = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_second);
        this.cancel = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        this.confirm = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        this.screenItems.add(10 + context.getString(com.qcwireless.qcwatch.R.string.qc_text_91));
        this.screenItemsBack.add(java.lang.String.valueOf(10));
        this.screenItems.add(15 + context.getString(com.qcwireless.qcwatch.R.string.qc_text_91));
        this.screenItemsBack.add(java.lang.String.valueOf(15));
        this.screenItems.add(20 + context.getString(com.qcwireless.qcwatch.R.string.qc_text_91));
        this.screenItemsBack.add(java.lang.String.valueOf(20));
        this.screenItems.add(30 + context.getString(com.qcwireless.qcwatch.R.string.qc_text_91));
        this.screenItemsBack.add(java.lang.String.valueOf(30));
        this.screenItems.add(60 + context.getString(com.qcwireless.qcwatch.R.string.qc_text_91));
        this.screenItemsBack.add(java.lang.String.valueOf(60));
        this.screenItems.add(context.getString(com.qcwireless.qcwatch.R.string.qc_text_6666063));
        this.screenItemsBack.add(java.lang.String.valueOf(99));
        this.screenSecond.setAdapter(new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(this.screenItems));
        this.screenSecond.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.screenSecond.setTextSize(30.0f);
        this.screenSecond.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.screenSecond.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.screenSecond.setItemsVisibleCount(5);
        this.screenSecond.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog bottomDeviceHeartDialog = com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.this;
                bottomDeviceHeartDialog.finalSecond = (java.lang.String) bottomDeviceHeartDialog.screenItemsBack.get(index);
            }
        });
        this.cancel.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.this.dismiss();
            }
        });
        this.confirm.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                if (com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.this.listener != null && !android.text.TextUtils.isEmpty(com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.this.finalSecond)) {
                    com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.this.listener.showSecond(com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.this.finalSecond);
                }
                com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.this.dismiss();
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

        public com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.Builder setContentView(int layoutId) {
            this.layoutId = layoutId;
            this.contentView = android.view.LayoutInflater.from(this.context).inflate(this.layoutId, (android.view.ViewGroup) this.bottomLayout);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.Builder setContentView(android.view.View contentView) {
            this.contentView = contentView;
            this.bottomLayout.addView(contentView);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.Builder setHasAnimation(boolean hasAnimation) {
            this.hasAnimation = hasAnimation;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog create() {
            com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog bottomDeviceHeartDialog = new com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog();
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
            attributes.y = (int) com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.dp2px(this.context, 16.0f);
            attributes.width = this.context.getResources().getDisplayMetrics().widthPixels;
            attributes.height = this.bottomLayout.getMeasuredHeight();
            window.setAttributes(attributes);
            this.dialog.show();
            bottomDeviceHeartDialog.dialog = this.dialog;
            bottomDeviceHeartDialog.contentView = this.contentView;
            return bottomDeviceHeartDialog;
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
