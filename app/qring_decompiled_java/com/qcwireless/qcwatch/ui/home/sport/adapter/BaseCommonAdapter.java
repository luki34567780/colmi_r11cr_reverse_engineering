package com.qcwireless.qcwatch.ui.home.sport.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseCommonAdapter<T> extends android.widget.BaseAdapter {
    protected android.content.Context mContext;
    protected java.util.List<T> mDatas;
    protected int mItemLayoutId;
    protected android.view.LayoutInflater mLayoutInflater;

    public abstract void convert(com.qcwireless.qcwatch.ui.home.sport.adapter.CommonViewHolder holder, T item);

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    public BaseCommonAdapter(android.view.LayoutInflater layoutInflater, java.util.List<T> datas, android.content.Context context, int itemLayoutId) {
        this.mLayoutInflater = android.view.LayoutInflater.from(context);
        this.mDatas = datas;
        this.mContext = context;
        this.mItemLayoutId = itemLayoutId;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List<T> list = this.mDatas;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int position) {
        java.util.List<T> list = this.mDatas;
        if (list != null) {
            return list.get(position);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(final int position, android.view.View convertView, android.view.ViewGroup parent) {
        com.qcwireless.qcwatch.ui.home.sport.adapter.CommonViewHolder holder = getHolder(position, convertView, parent);
        if (this.mDatas.size() > 0) {
            convert(holder, this.mDatas.get(position));
        }
        return holder.getConvertView();
    }

    private com.qcwireless.qcwatch.ui.home.sport.adapter.CommonViewHolder getHolder(int position, android.view.View convertView, android.view.ViewGroup parent) {
        return com.qcwireless.qcwatch.ui.home.sport.adapter.CommonViewHolder.get(convertView, this.mContext, parent, this.mItemLayoutId, position);
    }
}
