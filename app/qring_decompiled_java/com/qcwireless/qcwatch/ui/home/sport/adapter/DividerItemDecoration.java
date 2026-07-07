package com.qcwireless.qcwatch.ui.home.sport.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class DividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private static final int[] ATTRS = {android.R.attr.listDivider};
    public static final int HORIZONTAL_LIST = 0;
    public static final int VERTICAL_LIST = 1;
    private android.graphics.drawable.Drawable mDivider;
    private int mOrientation;

    public DividerItemDecoration(android.content.Context context, int orientation) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        this.mDivider = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        setOrientation(orientation);
    }

    public void setOrientation(int orientation) {
        if (orientation != 0 && orientation != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation");
        }
        this.mOrientation = orientation;
    }

    public void onDraw(android.graphics.Canvas c, androidx.recyclerview.widget.RecyclerView parent) {
        if (this.mOrientation == 1) {
            drawVertical(c, parent);
        } else {
            drawHorizontal(c, parent);
        }
    }

    public void drawVertical(android.graphics.Canvas c, androidx.recyclerview.widget.RecyclerView parent) {
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = parent.getChildAt(i);
            new androidx.recyclerview.widget.RecyclerView(parent.getContext());
            int bottom = childAt.getBottom() + childAt.getLayoutParams().bottomMargin;
            this.mDivider.setBounds(paddingLeft, bottom, width, this.mDivider.getIntrinsicHeight() + bottom);
            this.mDivider.draw(c);
        }
    }

    public void drawHorizontal(android.graphics.Canvas c, androidx.recyclerview.widget.RecyclerView parent) {
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = parent.getChildAt(i);
            int right = childAt.getRight() + childAt.getLayoutParams().rightMargin;
            this.mDivider.setBounds(right, paddingTop, this.mDivider.getIntrinsicHeight() + right, height);
            this.mDivider.draw(c);
        }
    }

    public void getItemOffsets(android.graphics.Rect outRect, int itemPosition, androidx.recyclerview.widget.RecyclerView parent) {
        if (this.mOrientation == 1) {
            outRect.set(0, 0, 0, this.mDivider.getIntrinsicHeight());
        } else {
            outRect.set(0, 0, this.mDivider.getIntrinsicWidth(), 0);
        }
    }
}
