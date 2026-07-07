package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomYMDDialog {
    private com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter adapter;
    private android.widget.TextView cancel;
    private android.view.View contentView;
    private android.content.Context context;
    private int currDay;
    private int currMonth;
    private int currYear;
    private java.util.List<java.lang.String> dayData;
    private android.app.Dialog dialog;
    private com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.DialogSaveClickListener listener;
    private java.util.Map<java.lang.Integer, java.lang.String> map;
    private int minYear;
    private com.qcwireless.qcwatch.base.dialog.adapter.MonthArrayWheelAdapter monthAdapter;
    private java.util.List<java.lang.String> monthData;
    private android.widget.TextView save;
    private android.widget.TextView title;
    private com.contrarywind.view.WheelView wheelViewDay;
    private com.contrarywind.view.WheelView wheelViewMonth;
    private com.contrarywind.view.WheelView wheelViewYear;
    private java.util.List<java.lang.String> yearData;

    public interface DialogSaveClickListener {
        void itemClick(int year, int month, int day);
    }

    private BottomYMDDialog() {
        this.minYear = 1920;
        this.map = new java.util.HashMap();
    }

    public com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.DialogSaveClickListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.DialogSaveClickListener listener) {
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
            if (com.qcwireless.qc_utils.date.LanguageUtil.changeDateFormat()) {
                this.bottomLayout = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_dmy_view, (android.view.ViewGroup) null);
            } else {
                this.bottomLayout = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_ymd_view, (android.view.ViewGroup) null);
            }
            this.contentView = this.bottomLayout;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.Builder setContentView(int layoutId) {
            this.layoutId = layoutId;
            this.contentView = android.view.LayoutInflater.from(this.context).inflate(this.layoutId, (android.view.ViewGroup) this.bottomLayout);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.Builder setContentView(android.view.View contentView) {
            this.contentView = contentView;
            this.bottomLayout.addView(contentView);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.Builder setHasAnimation(boolean hasAnimation) {
            this.hasAnimation = hasAnimation;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomYMDDialog create() {
            com.qcwireless.qcwatch.base.dialog.BottomYMDDialog bottomYMDDialog = new com.qcwireless.qcwatch.base.dialog.BottomYMDDialog();
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
            attributes.y = (int) com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.dp2px(this.context, 16.0f);
            attributes.width = this.context.getResources().getDisplayMetrics().widthPixels;
            attributes.height = this.bottomLayout.getMeasuredHeight();
            window.setAttributes(attributes);
            this.dialog.show();
            bottomYMDDialog.dialog = this.dialog;
            bottomYMDDialog.contentView = this.contentView;
            return bottomYMDDialog;
        }
    }

    public void initData(final android.content.Context context) {
        this.context = context;
        this.map.put(1, context.getString(com.qcwireless.qcwatch.R.string.qc_text_435));
        this.map.put(2, context.getString(com.qcwireless.qcwatch.R.string.qc_text_436));
        this.map.put(3, context.getString(com.qcwireless.qcwatch.R.string.qc_text_437));
        this.map.put(4, context.getString(com.qcwireless.qcwatch.R.string.qc_text_438));
        this.map.put(5, context.getString(com.qcwireless.qcwatch.R.string.qc_text_439));
        this.map.put(6, context.getString(com.qcwireless.qcwatch.R.string.qc_text_440));
        this.map.put(7, context.getString(com.qcwireless.qcwatch.R.string.qc_text_441));
        this.map.put(8, context.getString(com.qcwireless.qcwatch.R.string.qc_text_442));
        this.map.put(9, context.getString(com.qcwireless.qcwatch.R.string.qc_text_443));
        this.map.put(10, context.getString(com.qcwireless.qcwatch.R.string.qc_text_444));
        this.map.put(11, context.getString(com.qcwireless.qcwatch.R.string.qc_text_445));
        this.map.put(12, context.getString(com.qcwireless.qcwatch.R.string.qc_text_446));
        this.title = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_title);
        this.wheelViewYear = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_year);
        this.wheelViewMonth = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_month);
        this.wheelViewDay = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_day);
        this.cancel = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        this.save = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        this.yearData = new java.util.ArrayList();
        for (int i = this.minYear; i <= new com.qcwireless.qc_utils.date.DateUtil().getYear(); i++) {
            this.yearData.add(i + "");
        }
        com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter arrayWheelAdapter = new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(this.yearData);
        this.adapter = arrayWheelAdapter;
        this.wheelViewYear.setAdapter(arrayWheelAdapter);
        this.wheelViewYear.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.wheelViewYear.setTextSize(30.0f);
        this.wheelViewYear.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.wheelViewYear.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.wheelViewYear.setItemsVisibleCount(5);
        this.wheelViewYear.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomYMDDialog bottomYMDDialog = com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this;
                bottomYMDDialog.currYear = java.lang.Integer.parseInt((java.lang.String) bottomYMDDialog.yearData.get(index));
            }
        });
        this.monthData = new java.util.ArrayList();
        for (int i2 = 1; i2 <= 12; i2++) {
            if (i2 < 10) {
                this.monthData.add("0" + i2);
            } else {
                this.monthData.add(i2 + "");
            }
        }
        com.qcwireless.qcwatch.base.dialog.adapter.MonthArrayWheelAdapter monthArrayWheelAdapter = new com.qcwireless.qcwatch.base.dialog.adapter.MonthArrayWheelAdapter(this.monthData, this.map);
        this.monthAdapter = monthArrayWheelAdapter;
        this.wheelViewMonth.setAdapter(monthArrayWheelAdapter);
        this.wheelViewMonth.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.wheelViewMonth.setTextSize(30.0f);
        this.wheelViewMonth.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.wheelViewMonth.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.wheelViewMonth.setItemsVisibleCount(5);
        this.wheelViewMonth.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.2
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomYMDDialog bottomYMDDialog = com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this;
                bottomYMDDialog.currMonth = java.lang.Integer.parseInt((java.lang.String) bottomYMDDialog.monthData.get(index));
                com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this.initDays(context);
            }
        });
        initDays(context);
        this.cancel.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this.dismiss();
            }
        });
        this.save.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                if (com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this.listener != null) {
                    com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this.listener.itemClick(com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this.currYear, com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this.currMonth, com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this.currDay);
                    com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this.dismiss();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initDays(android.content.Context context) {
        this.context = context;
        this.dayData = new java.util.ArrayList();
        int daysOfMonth = com.qcwireless.qc_utils.date.DateUtil.getDaysOfMonth(new com.qcwireless.qc_utils.date.DateUtil(this.currYear, this.currMonth, 10).toDate());
        for (int i = 1; i <= daysOfMonth; i++) {
            if (i < 10) {
                this.dayData.add("0" + i);
            } else {
                this.dayData.add(i + "");
            }
        }
        this.wheelViewDay.setAdapter(new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(this.dayData));
        this.wheelViewDay.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.wheelViewDay.setTextSize(30.0f);
        this.wheelViewDay.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.wheelViewDay.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.wheelViewDay.setItemsVisibleCount(5);
        this.wheelViewDay.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.5
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomYMDDialog bottomYMDDialog = com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.this;
                bottomYMDDialog.currDay = java.lang.Integer.parseInt((java.lang.String) bottomYMDDialog.dayData.get(index));
            }
        });
    }

    public void setDialogTitle(java.lang.String text) {
        android.widget.TextView textView = this.title;
        if (textView != null) {
            textView.setText(text);
        }
    }

    public void setCurrItem(int year, int month, int day) {
        int i = 0;
        if (this.wheelViewYear != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.yearData.size()) {
                    break;
                }
                if ((year + "").equalsIgnoreCase(this.yearData.get(i2))) {
                    this.currYear = java.lang.Integer.parseInt(this.yearData.get(i2));
                    break;
                }
                i2++;
            }
            this.wheelViewYear.setCurrentItem(this.currYear - this.minYear);
        }
        if (this.wheelViewMonth != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.monthData.size()) {
                    break;
                }
                if (month == java.lang.Integer.parseInt(this.monthData.get(i3))) {
                    this.currMonth = java.lang.Integer.parseInt(this.monthData.get(i3));
                    break;
                }
                i3++;
            }
            this.wheelViewMonth.setCurrentItem(this.currMonth - 1);
        }
        initDays(this.context);
        if (this.wheelViewDay != null) {
            while (true) {
                if (i >= this.dayData.size()) {
                    break;
                }
                if (day == java.lang.Integer.parseInt(this.dayData.get(i))) {
                    this.currDay = java.lang.Integer.parseInt(this.dayData.get(i));
                    break;
                }
                i++;
            }
            this.wheelViewDay.setCurrentItem(this.currDay - 1);
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
