package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class NestedExpandableListView extends android.widget.ExpandableListView {
    public NestedExpandableListView(android.content.Context context) {
        super(context);
    }

    public NestedExpandableListView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public NestedExpandableListView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(536870911, com.bumptech.glide.request.target.Target.SIZE_ORIGINAL));
    }
}
