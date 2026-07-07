package com.amap.api.maps.offlinemap;

/* loaded from: classes.dex */
public class DownLoadListView extends android.widget.ListView {
    public DownLoadListView(android.content.Context context) {
        super(context);
    }

    public DownLoadListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }
}
