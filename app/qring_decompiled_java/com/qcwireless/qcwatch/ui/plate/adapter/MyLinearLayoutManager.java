package com.qcwireless.qcwatch.ui.plate.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class MyLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public MyLinearLayoutManager(android.content.Context context) {
        super(context);
    }

    public MyLinearLayoutManager(android.content.Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public MyLinearLayoutManager(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler recycler, androidx.recyclerview.widget.RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
