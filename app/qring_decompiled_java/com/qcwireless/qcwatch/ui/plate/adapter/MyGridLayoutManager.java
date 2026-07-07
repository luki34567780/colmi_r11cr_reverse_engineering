package com.qcwireless.qcwatch.ui.plate.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class MyGridLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    public MyGridLayoutManager(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public MyGridLayoutManager(android.content.Context context, int spanCount) {
        super(context, spanCount);
    }

    public MyGridLayoutManager(android.content.Context context, int spanCount, int orientation, boolean reverseLayout) {
        super(context, spanCount, orientation, reverseLayout);
    }

    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
