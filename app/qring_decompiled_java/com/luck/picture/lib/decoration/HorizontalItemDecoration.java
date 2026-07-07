package com.luck.picture.lib.decoration;

/* loaded from: /tmp/dex/classes2.dex */
public class HorizontalItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final int spacing;
    private final int spanCount;

    public HorizontalItemDecoration(int i, int i2) {
        this.spanCount = i;
        this.spacing = i2;
    }

    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.spanCount;
        int i2 = childAdapterPosition % i;
        if (childAdapterPosition == 0) {
            int i3 = this.spacing;
            rect.left = i3 - ((i2 * i3) / i);
        } else {
            rect.left = (this.spacing * i2) / i;
        }
        int i4 = this.spacing;
        rect.right = i4 - (((i2 + 1) * i4) / this.spanCount);
        if (childAdapterPosition < this.spanCount) {
            rect.top = this.spacing;
        }
        rect.bottom = this.spacing;
    }
}
