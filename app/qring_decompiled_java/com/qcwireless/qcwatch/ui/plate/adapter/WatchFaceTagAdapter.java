package com.qcwireless.qcwatch.ui.plate.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class WatchFaceTagAdapter extends com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter<com.qcwireless.qcwatch.ui.plate.adapter.WatchFaceTagAdapter.MyViewHolder> {
    private android.content.Context context;
    private java.util.List<com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag> data;
    private android.view.LayoutInflater mInflater;

    public WatchFaceTagAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag> data) {
        this.context = context;
        this.mInflater = android.view.LayoutInflater.from(context);
        this.data = data == null ? new java.util.ArrayList<>() : data;
    }

    @Override // com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter
    public void whenBindViewHolder(com.qcwireless.qcwatch.ui.plate.adapter.WatchFaceTagAdapter.MyViewHolder holder, int position) {
        holder.tvName.setText(this.data.get(position).getTag());
        if (this.data.get(position).isCheck()) {
            holder.tvName.setTextColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.watch_face_common_3));
            holder.tvName.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_stroke);
        } else {
            holder.tvName.setTextColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.watch_face_common_2));
            holder.tvName.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_stroke_1);
        }
    }

    public com.qcwireless.qcwatch.ui.plate.adapter.WatchFaceTagAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        return new com.qcwireless.qcwatch.ui.plate.adapter.WatchFaceTagAdapter.MyViewHolder(this.mInflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_watch_face_diy, parent, false));
    }

    public int getItemCount() {
        return this.data.size();
    }

    static class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public android.widget.TextView tvName;

        public MyViewHolder(android.view.View itemView) {
            super(itemView);
            this.tvName = (android.widget.TextView) itemView.findViewById(com.qcwireless.qcwatch.R.id.tv_tag);
        }
    }
}
