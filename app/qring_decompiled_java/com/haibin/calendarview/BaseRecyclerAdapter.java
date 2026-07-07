package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
abstract class BaseRecyclerAdapter<T> extends androidx.recyclerview.widget.RecyclerView.Adapter {
    android.content.Context mContext;
    android.view.LayoutInflater mInflater;
    private java.util.List<T> mItems = new java.util.ArrayList();
    private com.haibin.calendarview.BaseRecyclerAdapter.OnClickListener onClickListener = new com.haibin.calendarview.BaseRecyclerAdapter.OnClickListener() { // from class: com.haibin.calendarview.BaseRecyclerAdapter.1
        @Override // com.haibin.calendarview.BaseRecyclerAdapter.OnClickListener
        public void onClick(int i, long j) {
            if (com.haibin.calendarview.BaseRecyclerAdapter.this.onItemClickListener != null) {
                com.haibin.calendarview.BaseRecyclerAdapter.this.onItemClickListener.onItemClick(i, j);
            }
        }
    };
    private com.haibin.calendarview.BaseRecyclerAdapter.OnItemClickListener onItemClickListener;

    interface OnItemClickListener {
        void onItemClick(int i, long j);
    }

    abstract void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, T t, int i);

    abstract androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateDefaultViewHolder(android.view.ViewGroup viewGroup, int i);

    BaseRecyclerAdapter(android.content.Context context) {
        this.mContext = context;
        this.mInflater = android.view.LayoutInflater.from(context);
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateDefaultViewHolder = onCreateDefaultViewHolder(viewGroup, i);
        if (onCreateDefaultViewHolder != null) {
            onCreateDefaultViewHolder.itemView.setTag(onCreateDefaultViewHolder);
            onCreateDefaultViewHolder.itemView.setOnClickListener(this.onClickListener);
        }
        return onCreateDefaultViewHolder;
    }

    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder(viewHolder, this.mItems.get(i), i);
    }

    public int getItemCount() {
        return this.mItems.size();
    }

    void setOnItemClickListener(com.haibin.calendarview.BaseRecyclerAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    void addAll(java.util.List<T> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mItems.addAll(list);
        notifyItemRangeInserted(this.mItems.size(), list.size());
    }

    final void addItem(T t) {
        if (t != null) {
            this.mItems.add(t);
            notifyItemChanged(this.mItems.size());
        }
    }

    final java.util.List<T> getItems() {
        return this.mItems;
    }

    final T getItem(int i) {
        if (i < 0 || i >= this.mItems.size()) {
            return null;
        }
        return this.mItems.get(i);
    }

    static abstract class OnClickListener implements android.view.View.OnClickListener {
        public abstract void onClick(int i, long j);

        OnClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = (androidx.recyclerview.widget.RecyclerView.ViewHolder) view.getTag();
            onClick(viewHolder.getAdapterPosition(), viewHolder.getItemId());
        }
    }
}
