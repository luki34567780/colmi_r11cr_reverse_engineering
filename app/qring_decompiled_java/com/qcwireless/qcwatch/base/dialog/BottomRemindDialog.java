package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomRemindDialog {
    private com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.ModeAdapter adapter;
    private java.lang.String alarmTitle;
    private android.widget.TextView cancel;
    private android.widget.TextView confirm;
    private android.view.View contentView;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat> data;
    private android.app.Dialog dialog;
    private int h;
    private com.contrarywind.view.WheelView hour;
    private java.util.List<java.lang.String> hourItems;
    com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.RemindDialogListener listener;
    private int m;
    private com.contrarywind.view.WheelView min;
    private java.util.List<java.lang.String> minItems;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.EditText title;
    private int week;

    public interface RemindDialogListener {
        void time(int h, int m, java.lang.String title, int week);
    }

    private BottomRemindDialog() {
        this.hourItems = new java.util.ArrayList();
        this.minItems = new java.util.ArrayList();
        this.data = new java.util.ArrayList();
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

    public com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.RemindDialogListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.RemindDialogListener listener) {
        this.listener = listener;
    }

    public void setTitle(java.lang.String text) {
        this.title.setText(text);
        this.alarmTitle = text;
    }

    public java.lang.String getTitle() {
        return android.text.TextUtils.isEmpty(this.title.getText().toString()) ? "" : this.title.getText().toString();
    }

    public void initData(android.content.Context context, int repeat) {
        this.hour = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_hour);
        this.min = (com.contrarywind.view.WheelView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.wheel_view_min);
        this.recyclerView = this.contentView.findViewById(com.qcwireless.qcwatch.R.id.week_day_recycler);
        this.cancel = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        this.confirm = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        this.title = (android.widget.EditText) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_title);
        com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.ModeAdapter modeAdapter = new com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.ModeAdapter(context);
        this.adapter = modeAdapter;
        modeAdapter.setSelectMode(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.SelectMode.MULTI_SELECT);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.setAdapter(this.adapter);
        this.adapter.notifyDataSetChanged();
        for (int i = 0; i < 24; i++) {
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
        this.title.addTextChangedListener(new com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.MyTextWatcher(this.title, 27));
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
        this.hour.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.h = index;
            }
        });
        this.min.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.2
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int index) {
                com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.m = index;
            }
        });
        this.cancel.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.dismiss();
            }
        });
        this.confirm.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                if (com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.listener != null) {
                    com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.listener.time(com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.h, com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.m, com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.getTitle(), com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.week);
                }
                com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.dismiss();
            }
        });
        this.adapter.setOnItemMultiSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.5
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemMultiSelectListener
            public void onSelected(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.Operation operation, int itemPosition, boolean isSelected) {
                ((com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat) com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.data.get(itemPosition)).setCheck(!((com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat) com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.data.get(itemPosition)).isCheck());
                com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.modifyWeek();
            }
        });
        weekInit(context, repeat);
    }

    private void weekInit(android.content.Context activity, int repeat) {
        this.data.clear();
        this.week = repeat;
        if ((repeat & 1) != 0) {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_208), true));
        } else {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_208), false));
        }
        if ((repeat & 2) != 0) {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_202), true));
        } else {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_202), false));
        }
        if ((repeat & 4) != 0) {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_203), true));
        } else {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_203), false));
        }
        if ((repeat & 8) != 0) {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_204), true));
        } else {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_204), false));
        }
        if ((repeat & 16) != 0) {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_205), true));
        } else {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_205), false));
        }
        if ((repeat & 32) != 0) {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_206), true));
        } else {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_206), false));
        }
        if ((repeat & 64) != 0) {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_207), true));
        } else {
            this.data.add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(activity.getString(com.qcwireless.qcwatch.R.string.qc_text_207), false));
        }
        this.adapter.notifyDataSetChanged();
    }

    private class MyTextWatcher implements android.text.TextWatcher {
        private int editEnd;
        private int editStart;
        private android.widget.EditText editText;
        private int maxCount;
        private java.lang.CharSequence temp;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
        }

        MyTextWatcher(android.widget.EditText editText, int maxCount) {
            this.editText = editText;
            this.maxCount = maxCount;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
            this.temp = s;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable s) {
            android.text.Editable text = this.editText.getText();
            if (text.toString().getBytes().length > this.maxCount) {
                int selectionEnd = android.text.Selection.getSelectionEnd(text);
                this.editText.setText(com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.getWholeText(text.toString(), this.maxCount));
                android.text.Editable text2 = this.editText.getText();
                if (selectionEnd > text2.length()) {
                    selectionEnd = text2.length();
                }
                android.text.Selection.setSelection(text2, selectionEnd);
            }
        }
    }

    public java.lang.String getWholeText(java.lang.String text, int byteCount) {
        if (text == null) {
            return text;
        }
        try {
            if (text.getBytes("utf-8").length <= byteCount) {
                return text;
            }
            char[] charArray = text.toCharArray();
            int length = charArray.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    i = 0;
                    break;
                }
                char c = charArray[i];
                i2 = (c < 0 || c > 127) ? (c < 128 || c > 2047) ? i2 + 3 : i2 + 2 : i2 + 1;
                if (i2 > byteCount) {
                    break;
                }
                i++;
            }
            return java.lang.String.valueOf(charArray, 0, i);
        } catch (java.io.UnsupportedEncodingException unused) {
            return text;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void modifyWeek() {
        int i;
        byte b = 0;
        for (int i2 = 0; i2 < this.data.size(); i2++) {
            switch (i2) {
                case 0:
                    if (this.data.get(0).isCheck()) {
                        i = b | 1;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (this.data.get(1).isCheck()) {
                        i = b | 2;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (this.data.get(2).isCheck()) {
                        i = b | 4;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (this.data.get(3).isCheck()) {
                        i = b | 8;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (this.data.get(4).isCheck()) {
                        i = b | 16;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (this.data.get(5).isCheck()) {
                        i = b | 32;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (this.data.get(6).isCheck()) {
                        i = b | 64;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.week = b;
    }

    public void setCurrTime(int currHour, int currMin) {
        this.hour.setCurrentItem(currHour);
        this.min.setCurrentItem(currMin);
        this.h = currHour;
        this.m = currMin;
    }

    class ModeAdapter extends com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter<com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.MyViewHolder> {
        private android.content.Context context;
        private android.view.LayoutInflater mInflater;

        public long getItemId(int position) {
            return position;
        }

        public ModeAdapter(android.content.Context context) {
            this.context = context;
            this.mInflater = android.view.LayoutInflater.from(context);
        }

        public com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
            return new com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.MyViewHolder(this.mInflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_week, parent, false));
        }

        public int getItemCount() {
            return com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.data.size();
        }

        @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter
        public void whenBindViewHolder(com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.MyViewHolder holder, int position) {
            holder.tvName.setText(((com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat) com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.data.get(position)).getDay());
            if (((com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat) com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.this.data.get(position)).isCheck()) {
                holder.check.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.qc_check_on);
            } else {
                holder.check.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.qc_check_off);
            }
        }
    }

    static class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.ImageView check;
        public android.widget.TextView tvName;

        public MyViewHolder(android.view.View itemView) {
            super(itemView);
            this.tvName = (android.widget.TextView) itemView.findViewById(com.qcwireless.qcwatch.R.id.tv_week_name);
            this.check = (android.widget.ImageView) itemView.findViewById(com.qcwireless.qcwatch.R.id.image_week);
        }
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

        public com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.Builder setContentView(int layoutId) {
            this.layoutId = layoutId;
            this.contentView = android.view.LayoutInflater.from(this.context).inflate(this.layoutId, (android.view.ViewGroup) this.bottomLayout);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.Builder setContentView(android.view.View contentView) {
            this.contentView = contentView;
            this.bottomLayout.addView(contentView);
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.Builder setHasAnimation(boolean hasAnimation) {
            this.hasAnimation = hasAnimation;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomRemindDialog create() {
            com.qcwireless.qcwatch.base.dialog.BottomRemindDialog bottomRemindDialog = new com.qcwireless.qcwatch.base.dialog.BottomRemindDialog();
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
            attributes.y = (int) com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.dp2px(this.context, 16.0f);
            attributes.width = this.context.getResources().getDisplayMetrics().widthPixels;
            attributes.height = this.bottomLayout.getMeasuredHeight();
            window.setAttributes(attributes);
            this.dialog.show();
            bottomRemindDialog.dialog = this.dialog;
            bottomRemindDialog.contentView = this.contentView;
            return bottomRemindDialog;
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
