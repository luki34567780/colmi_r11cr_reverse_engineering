package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomTimeDialog {
    private android.widget.TextView cancel;
    private android.widget.TextView confirm;
    private android.view.View contentView;
    private android.app.Dialog dialog;
    private int h;
    private com.contrarywind.view.WheelView hour;
    private java.util.List<java.lang.String> hourItems;
    private com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener listener;
    private int m;
    private com.contrarywind.view.WheelView min;
    private java.util.List<java.lang.String> minItems;
    private android.widget.TextView title;

    public interface TimeListener {
        void min(int min);
    }

    private BottomTimeDialog() {
        this.hourItems = new java.util.ArrayList();
        this.minItems = new java.util.ArrayList();
    }

    public com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener listener) {
        this.listener = listener;
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

    public void setCurrTime(int h, int m) {
        this.hour.setCurrentItem(h);
        this.min.setCurrentItem(m);
        this.h = h;
        this.m = m;
    }

    public void setTitle(java.lang.String text) {
        this.title.setText(text);
    }

    public void initData(android.content.Context context) {
        this.hour = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_hour);
        this.min = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_min);
        this.title = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_title);
        this.cancel = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        this.confirm = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        for (int i = 0; i <= 23; i++) {
            if (i < 10) {
                this.hourItems.add("0" + i);
            } else {
                this.hourItems.add(i + "");
            }
        }
        for (int i2 = 0; i2 < 60; i2++) {
            if (i2 < 10) {
                this.minItems.add("0" + i2);
            } else {
                this.minItems.add(i2 + "");
            }
        }
        this.hour.setAdapter(new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(this.hourItems));
        this.hour.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.hour.setTextSize(30.0f);
        this.hour.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.hour.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.min.setAdapter(new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(this.minItems));
        this.min.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.min.setTextSize(30.0f);
        this.min.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.min.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.hour.setItemsVisibleCount(5);
        this.min.setItemsVisibleCount(5);
        this.hour.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.this.h = index;
            }
        });
        this.min.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.2
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.this.m = index;
            }
        });
        this.cancel.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.this.dismiss();
            }
        });
        this.confirm.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                if (com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.this.listener != null) {
                    com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.this.listener.min((com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.this.h * 60) + com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.this.m);
                }
                com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.this.dismiss();
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

        public com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder setContentView(int layoutId) {
            this.layoutId = layoutId;
            this.contentView = android.view.LayoutInflater.from(this.context).inflate(this.layoutId, (android.view.ViewGroup) this.bottomLayout);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder setContentView(android.view.View contentView) {
            this.contentView = contentView;
            this.bottomLayout.addView(contentView);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder setHasAnimation(boolean hasAnimation) {
            this.hasAnimation = hasAnimation;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomTimeDialog create() {
            com.qcwireless.qcwatch.base.dialog.BottomTimeDialog bottomTimeDialog = new com.qcwireless.qcwatch.base.dialog.BottomTimeDialog();
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
            attributes.y = (int) com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.dp2px(this.context, 16.0f);
            attributes.width = this.context.getResources().getDisplayMetrics().widthPixels;
            attributes.height = this.bottomLayout.getMeasuredHeight();
            window.setAttributes(attributes);
            this.dialog.show();
            bottomTimeDialog.dialog = this.dialog;
            bottomTimeDialog.contentView = this.contentView;
            return bottomTimeDialog;
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
