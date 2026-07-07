package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class BottomListDialog {
    private com.qcwireless.qcwatch.base.dialog.BottomListDialog.ModeAdapter adapter;
    private android.widget.TextView cancel;
    private android.view.View contentView;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> data;
    private android.app.Dialog dialog;
    private com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener listener;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.TextView tvTitle;

    public interface DialogItemClickListener {
        void onSelected(int itemPosition);
    }

    private BottomListDialog() {
    }

    public android.view.View getContentView() {
        return this.contentView;
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> data) {
        if (data == null) {
            this.data = new java.util.ArrayList();
        } else {
            this.data = data;
        }
        com.qcwireless.qcwatch.base.dialog.BottomListDialog.ModeAdapter modeAdapter = this.adapter;
        if (modeAdapter != null) {
            modeAdapter.notifyDataSetChanged();
        }
    }

    public com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener listener) {
        this.listener = listener;
    }

    public void setCancelable(boolean cancelable) {
        this.dialog.setCancelable(cancelable);
    }

    public void setCanceledOnTouchOutside(boolean cancel) {
        this.dialog.setCanceledOnTouchOutside(cancel);
    }

    public void setSubTitle(java.lang.String text) {
        this.tvTitle.setText(text);
    }

    public void initView() {
        this.recyclerView = this.contentView.findViewById(com.qcwireless.qcwatch.R.id.dialog_rcv);
        this.cancel = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.dialog_cancel);
        this.tvTitle = (android.widget.TextView) this.contentView.findViewById(com.qcwireless.qcwatch.R.id.dialog_title);
        com.qcwireless.qcwatch.base.dialog.BottomListDialog.ModeAdapter modeAdapter = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.ModeAdapter(this.contentView.getContext());
        this.adapter = modeAdapter;
        modeAdapter.setSelectMode(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.SelectMode.SINGLE_SELECT);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this.contentView.getContext());
        linearLayoutManager.setOrientation(1);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.setAdapter(this.adapter);
        this.adapter.setOnItemSingleSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomListDialog.1
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener
            public void onSelected(int itemPosition, boolean isSelected) {
                if (com.qcwireless.qcwatch.base.dialog.BottomListDialog.this.listener != null) {
                    com.qcwireless.qcwatch.base.dialog.BottomListDialog.this.listener.onSelected(itemPosition);
                }
                com.qcwireless.qcwatch.base.dialog.BottomListDialog.this.adapter.notifyDataSetChanged();
                com.qcwireless.qcwatch.base.dialog.BottomListDialog.this.dismiss();
            }
        });
        this.cancel.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.dialog.BottomListDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View v) {
                com.qcwireless.qcwatch.base.dialog.BottomListDialog.this.dismiss();
            }
        });
    }

    public static class Builder {
        private androidx.constraintlayout.widget.ConstraintLayout bottomLayout;
        private android.content.Context context;
        private android.app.Dialog dialog;
        private boolean hasAnimation = true;

        public Builder(android.content.Context context) {
            this.context = context;
            this.bottomLayout = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_list, (android.view.ViewGroup) null);
        }

        public com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder setHasAnimation(boolean hasAnimation) {
            this.hasAnimation = hasAnimation;
            return this;
        }

        public com.qcwireless.qcwatch.base.dialog.BottomListDialog create() {
            com.qcwireless.qcwatch.base.dialog.BottomListDialog bottomListDialog = new com.qcwireless.qcwatch.base.dialog.BottomListDialog();
            this.dialog = new android.app.Dialog(this.context, com.qcwireless.qcwatch.R.style.BottomDialog);
            this.bottomLayout.measure(0, 0);
            this.dialog.setContentView((android.view.View) this.bottomLayout);
            android.view.Window window = this.dialog.getWindow();
            window.setGravity(80);
            if (this.hasAnimation) {
                window.setWindowAnimations(com.qcwireless.qcwatch.R.style.DialogAnimation);
            }
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.x = 0;
            attributes.y = (int) com.qcwireless.qcwatch.base.dialog.BottomListDialog.dp2px(this.context, 16.0f);
            attributes.width = this.context.getResources().getDisplayMetrics().widthPixels;
            attributes.height = this.bottomLayout.getMeasuredHeight();
            window.setAttributes(attributes);
            this.dialog.show();
            bottomListDialog.dialog = this.dialog;
            bottomListDialog.contentView = this.bottomLayout;
            return bottomListDialog;
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

    class ModeAdapter extends com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter<com.qcwireless.qcwatch.base.dialog.BottomListDialog.MyViewHolder> {
        private android.content.Context context;
        private android.view.LayoutInflater mInflater;

        public long getItemId(int position) {
            return position;
        }

        public ModeAdapter(android.content.Context context) {
            this.context = context;
            this.mInflater = android.view.LayoutInflater.from(context);
        }

        public com.qcwireless.qcwatch.base.dialog.BottomListDialog.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
            return new com.qcwireless.qcwatch.base.dialog.BottomListDialog.MyViewHolder(this.mInflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_week, parent, false));
        }

        public int getItemCount() {
            return com.qcwireless.qcwatch.base.dialog.BottomListDialog.this.data.size();
        }

        @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter
        public void whenBindViewHolder(com.qcwireless.qcwatch.base.dialog.BottomListDialog.MyViewHolder holder, int position) {
            holder.tvName.setText(((com.qcwireless.qcwatch.base.dialog.bean.ListDataBean) com.qcwireless.qcwatch.base.dialog.BottomListDialog.this.data.get(position)).getLeftText());
            if (((com.qcwireless.qcwatch.base.dialog.bean.ListDataBean) com.qcwireless.qcwatch.base.dialog.BottomListDialog.this.data.get(position)).isChecked()) {
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
}
