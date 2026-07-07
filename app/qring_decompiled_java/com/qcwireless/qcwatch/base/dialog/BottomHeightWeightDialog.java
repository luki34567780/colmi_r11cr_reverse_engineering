package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomHeightWeightDialog {
    private com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter adapter;
    private android.widget.TextView cancel;
    private android.view.View contentView;
    private android.content.Context context;
    private int currNumber;
    private java.util.List<java.lang.String> data;
    private android.app.Dialog dialog;
    private boolean heightOrWeight;
    private java.util.List<java.lang.String> imperialList;
    private int lastIndex;
    private com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.DialogSaveClickListener listener;
    private boolean mOrI;
    private java.util.List<java.lang.String> metricList;
    private int minInch;
    private int minInchWeight;
    private int minMetric;
    private int minWeight;
    private android.widget.TextView save;
    private android.widget.TextView title;
    private com.contrarywind.view.WheelView wheelView;
    private com.contrarywind.view.WheelView wheelViewUnit;

    public interface DialogSaveClickListener {
        void itemClick(int index, boolean mOrI, boolean type);
    }

    public static float inch2Cm(int in) {
        return in * 2.54f;
    }

    private BottomHeightWeightDialog() {
        this.minInch = 13;
        this.minMetric = 33;
        this.minWeight = 30;
        this.minInchWeight = 60;
        this.lastIndex = -1;
    }

    public com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.DialogSaveClickListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.DialogSaveClickListener listener) {
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
            androidx.constraintlayout.widget.ConstraintLayout inflate = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_height_weight_view, (android.view.ViewGroup) null);
            this.bottomLayout = inflate;
            this.contentView = inflate;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.Builder setContentView(int layoutId) {
            this.layoutId = layoutId;
            this.contentView = android.view.LayoutInflater.from(this.context).inflate(this.layoutId, (android.view.ViewGroup) this.bottomLayout);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.Builder setContentView(android.view.View contentView) {
            this.contentView = contentView;
            this.bottomLayout.addView(contentView);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.Builder setHasAnimation(boolean hasAnimation) {
            this.hasAnimation = hasAnimation;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog create() {
            com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog = new com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog();
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
            attributes.y = (int) com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.dp2px(this.context, 16.0f);
            attributes.width = this.context.getResources().getDisplayMetrics().widthPixels;
            attributes.height = this.bottomLayout.getMeasuredHeight();
            window.setAttributes(attributes);
            this.dialog.show();
            bottomHeightWeightDialog.dialog = this.dialog;
            bottomHeightWeightDialog.contentView = this.contentView;
            return bottomHeightWeightDialog;
        }
    }

    public void initData(android.content.Context context, java.util.List<java.lang.String> dataList, java.util.List<java.lang.String> dataList1, boolean metric, boolean height) {
        this.context = context;
        this.title = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_title);
        this.wheelView = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view);
        this.wheelViewUnit = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_unit);
        this.cancel = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        this.save = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        this.metricList = dataList;
        this.imperialList = dataList1;
        if (metric) {
            this.mOrI = true;
            this.data = dataList;
        } else {
            this.mOrI = false;
            this.data = dataList1;
        }
        initData();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (height) {
            this.heightOrWeight = true;
            arrayList.add("cm");
            arrayList.add("Ft-in");
        } else {
            this.heightOrWeight = false;
            arrayList.add("kg");
            arrayList.add("lbs");
        }
        this.wheelViewUnit.setAdapter(new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(arrayList));
        this.wheelViewUnit.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.wheelViewUnit.setTextSize(30.0f);
        this.wheelViewUnit.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.wheelViewUnit.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.wheelViewUnit.setItemsVisibleCount(2);
        this.wheelViewUnit.setCyclic(false);
        this.wheelViewUnit.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(index));
                if (index == com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.lastIndex) {
                    return;
                }
                com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.lastIndex = index;
                if (index == 0) {
                    com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.mOrI = true;
                    com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog = com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this;
                    bottomHeightWeightDialog.data = bottomHeightWeightDialog.metricList;
                    if (com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.listener != null) {
                        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.listener.itemClick(com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.currNumber, true, false);
                    }
                    com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.initData();
                    return;
                }
                if (index == 1) {
                    com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog2 = com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this;
                    bottomHeightWeightDialog2.data = bottomHeightWeightDialog2.imperialList;
                    com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.mOrI = false;
                    if (com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.listener != null) {
                        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.listener.itemClick(com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.currNumber, false, false);
                    }
                    com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.initData();
                }
            }
        });
        this.cancel.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.dismiss();
            }
        });
        this.save.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                if (com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.listener != null) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.currNumber));
                    com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.listener.itemClick(com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.currNumber, com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.mOrI, true);
                    com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.dismiss();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initData() {
        com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter arrayWheelAdapter = new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(this.data);
        this.adapter = arrayWheelAdapter;
        this.wheelView.setAdapter(arrayWheelAdapter);
        this.wheelView.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        this.wheelView.setTextSize(30.0f);
        this.wheelView.setDividerColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        this.wheelView.setTextColorOut(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        this.wheelView.setItemsVisibleCount(5);
        this.wheelView.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.4
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                if (com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.heightOrWeight) {
                    if (!com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.mOrI) {
                        java.lang.String str = (java.lang.String) com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.data.get(index);
                        if (str.length() == 5) {
                            java.lang.String substring = str.substring(0, 1);
                            java.lang.String substring2 = str.substring(2, 3);
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf((java.lang.Integer.parseInt(substring) * 12) + java.lang.Integer.parseInt(substring2)));
                            com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.currNumber = (int) com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.inch2Cm((java.lang.Integer.parseInt(substring) * 12) + java.lang.Integer.parseInt(substring2));
                        } else if (str.length() == 6) {
                            java.lang.String substring3 = str.substring(0, 1);
                            java.lang.String substring4 = str.substring(2, 4);
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf((java.lang.Integer.parseInt(substring3) * 12) + java.lang.Integer.parseInt(substring4)));
                            com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.currNumber = (int) com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.inch2Cm((java.lang.Integer.parseInt(substring3) * 12) + java.lang.Integer.parseInt(substring4));
                        }
                    } else {
                        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog = com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this;
                        bottomHeightWeightDialog.currNumber = java.lang.Integer.parseInt((java.lang.String) bottomHeightWeightDialog.data.get(index));
                    }
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this.currNumber));
                    return;
                }
                com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog2 = com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.this;
                bottomHeightWeightDialog2.currNumber = java.lang.Integer.parseInt((java.lang.String) bottomHeightWeightDialog2.data.get(index));
            }
        });
        if (this.heightOrWeight) {
            if (this.mOrI) {
                this.wheelView.setCurrentItem(this.currNumber - this.minMetric);
                return;
            } else {
                this.wheelView.setCurrentItem((int) (cm2Inch(this.currNumber) - this.minInch));
                return;
            }
        }
        if (this.mOrI) {
            int round = java.lang.Math.round(lbs2Kg(this.currNumber));
            this.currNumber = round;
            this.wheelView.setCurrentItem(round - this.minWeight);
        } else {
            int round2 = java.lang.Math.round(kg2Lbs(this.currNumber));
            this.currNumber = round2;
            this.wheelView.setCurrentItem(round2 - this.minInchWeight);
        }
    }

    public void setDialogTitle(java.lang.String text) {
        android.widget.TextView textView = this.title;
        if (textView != null) {
            textView.setText(text);
        }
    }

    public void setCurrItem(int number, boolean unit) {
        this.currNumber = number;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(number));
        if (this.wheelViewUnit != null) {
            if (this.heightOrWeight) {
                if (unit) {
                    this.wheelView.setCurrentItem(number - this.minMetric);
                    this.wheelViewUnit.setCurrentItem(0);
                    return;
                } else {
                    this.wheelView.setCurrentItem(((int) cm2Inch(number)) - this.minInch);
                    this.wheelViewUnit.setCurrentItem(1);
                    return;
                }
            }
            if (unit) {
                this.wheelView.setCurrentItem(number - this.minWeight);
                this.wheelViewUnit.setCurrentItem(0);
                this.lastIndex = 0;
            } else {
                this.wheelView.setCurrentItem(number - this.minInchWeight);
                this.wheelViewUnit.setCurrentItem(1);
                this.lastIndex = 1;
            }
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

    public static float cm2Inch(float cm) {
        try {
            return java.lang.Math.round(cm / 2.54f);
        } catch (java.lang.NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static float kg2Lbs(float kg) {
        return new java.math.BigDecimal(kg * 2.2046226d).floatValue();
    }

    public static float lbs2Kg(float lbs) {
        return new java.math.BigDecimal(lbs * 0.45359f).floatValue();
    }
}
