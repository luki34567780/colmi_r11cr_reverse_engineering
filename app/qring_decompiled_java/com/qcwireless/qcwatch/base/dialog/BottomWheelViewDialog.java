package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomWheelViewDialog {
    private android.widget.TextView cancel;
    private android.view.View contentView;
    private int currIndex;
    private java.util.List<java.lang.String> dataList;
    private android.app.Dialog dialog;
    private com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener listener;
    private android.widget.TextView save;
    private android.widget.TextView title;
    private android.widget.TextView unitView;
    private com.contrarywind.view.WheelView wheelView;

    public interface SaveClickListener {
        void itemClick(int index);
    }

    private BottomWheelViewDialog() {
    }

    public com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener listener) {
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

    public static class Builder {
        private androidx.constraintlayout.widget.ConstraintLayout bottomLayout;
        private android.view.View contentView;
        private android.content.Context context;
        private android.app.Dialog dialog;
        private boolean hasAnimation = true;
        private int layoutId;

        public Builder(android.content.Context context) {
            this.context = context;
            androidx.constraintlayout.widget.ConstraintLayout inflate = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_wheel_view, (android.view.ViewGroup) null);
            this.bottomLayout = inflate;
            this.contentView = inflate;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder setContentView(int layoutId) {
            this.layoutId = layoutId;
            this.contentView = android.view.LayoutInflater.from(this.context).inflate(this.layoutId, (android.view.ViewGroup) this.bottomLayout);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder setContentView(android.view.View contentView) {
            this.contentView = contentView;
            this.bottomLayout.addView(contentView);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder setHasAnimation(boolean hasAnimation) {
            this.hasAnimation = hasAnimation;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create() {
            com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog bottomWheelViewDialog = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog();
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
            attributes.y = (int) com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.dp2px(this.context, 16.0f);
            attributes.width = this.context.getResources().getDisplayMetrics().widthPixels;
            attributes.height = this.bottomLayout.getMeasuredHeight();
            window.setAttributes(attributes);
            this.dialog.show();
            bottomWheelViewDialog.dialog = this.dialog;
            bottomWheelViewDialog.contentView = this.contentView;
            return bottomWheelViewDialog;
        }
    }

    public void initData(android.content.Context context, java.util.List<java.lang.String> dataList) {
        this.title = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_title);
        this.wheelView = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view);
        this.cancel = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        this.save = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        this.unitView = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.dialog_unit);
        this.dataList = dataList;
        this.wheelView.setAdapter(new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(dataList));
        this.wheelView.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.wheelView.setTextSize(30.0f);
        this.wheelView.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.wheelView.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.wheelView.setItemsVisibleCount(5);
        this.wheelView.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.this.currIndex = index;
            }
        });
        this.cancel.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.this.dismiss();
            }
        });
        this.save.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                if (com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.this.listener != null) {
                    com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.this.listener.itemClick(com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.this.currIndex);
                    com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.this.dismiss();
                }
            }
        });
    }

    public void setDialogTitle(java.lang.String text) {
        android.widget.TextView textView = this.title;
        if (textView != null) {
            textView.setText(text);
        }
    }

    public void setCurrItem(int index) {
        com.contrarywind.view.WheelView wheelView = this.wheelView;
        if (wheelView != null) {
            this.currIndex = index;
            wheelView.setCurrentItem(index);
        }
    }

    public void setCurrItemText(java.lang.String index) {
        if (this.wheelView != null) {
            for (int i = 0; i < this.dataList.size(); i++) {
                if (this.dataList.get(i).equalsIgnoreCase(index)) {
                    this.currIndex = i;
                    this.wheelView.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    public void setUnitText(java.lang.String text) {
        android.widget.TextView textView = this.unitView;
        if (textView != null) {
            textView.setText(text);
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
