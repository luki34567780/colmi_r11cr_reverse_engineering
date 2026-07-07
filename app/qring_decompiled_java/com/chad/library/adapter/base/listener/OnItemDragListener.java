package com.chad.library.adapter.base.listener;

/* loaded from: /tmp/dex/classes2.dex */
public interface OnItemDragListener {
    void onItemDragEnd(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i);

    void onItemDragMoving(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, int i2);

    void onItemDragStart(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i);
}
