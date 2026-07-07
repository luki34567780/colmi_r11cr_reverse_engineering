package com.qcwireless.qcwatch.ui.device.week.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class ModeAdapter extends com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter<com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter.MyViewHolder> {
    private android.content.Context context;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat> data;
    private android.view.LayoutInflater mInflater;

    public long getItemId(int position) {
        return position;
    }

    public ModeAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat> data) {
        this.context = context;
        this.mInflater = android.view.LayoutInflater.from(context);
        this.data = data == null ? new java.util.ArrayList<>() : data;
    }

    public com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        return new com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter.MyViewHolder(this.mInflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_week, parent, false));
    }

    public int getItemCount() {
        return this.data.size();
    }

    @Override // com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter
    public void whenBindViewHolder(com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter.MyViewHolder holder, int position) {
        holder.tvName.setText(this.data.get(position).getDay());
        if (this.data.get(position).isCheck()) {
            holder.check.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.qc_check_on);
        } else {
            holder.check.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.qc_check_off);
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
