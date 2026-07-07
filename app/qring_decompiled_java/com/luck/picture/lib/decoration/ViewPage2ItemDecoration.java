package com.luck.picture.lib.decoration;

/* loaded from: /tmp/dex/classes2.dex */
public class ViewPage2ItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final int spacing;
    private final int spanCount;

    public ViewPage2ItemDecoration(int i, int i2) {
        this.spanCount = i;
        this.spacing = i2;
    }

    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.spanCount;
        int i2 = childAdapterPosition % i;
        int i3 = this.spacing;
        rect.left = i3 - ((i2 * i3) / i);
        rect.right = ((i2 + 1) * this.spacing) / this.spanCount;
    }
}
