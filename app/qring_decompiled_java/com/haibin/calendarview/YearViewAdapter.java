package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
final class YearViewAdapter extends com.haibin.calendarview.BaseRecyclerAdapter<com.haibin.calendarview.Month> {
    private com.haibin.calendarview.CalendarViewDelegate mDelegate;
    private int mItemHeight;
    private int mItemWidth;

    YearViewAdapter(android.content.Context context) {
        super(context);
    }

    final void setup(com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
    }

    final void setYearViewSize(int i, int i2) {
        this.mItemWidth = i;
        this.mItemHeight = i2;
    }

    @Override // com.haibin.calendarview.BaseRecyclerAdapter
    androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateDefaultViewHolder(android.view.ViewGroup viewGroup, int i) {
        com.haibin.calendarview.YearView defaultYearView;
        if (android.text.TextUtils.isEmpty(this.mDelegate.getYearViewClassPath())) {
            defaultYearView = new com.haibin.calendarview.DefaultYearView(this.mContext);
        } else {
            try {
                defaultYearView = (com.haibin.calendarview.YearView) this.mDelegate.getYearViewClass().getConstructor(android.content.Context.class).newInstance(this.mContext);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                defaultYearView = new com.haibin.calendarview.DefaultYearView(this.mContext);
            }
        }
        defaultYearView.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -1));
        return new com.haibin.calendarview.YearViewAdapter.YearViewHolder(defaultYearView, this.mDelegate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.haibin.calendarview.BaseRecyclerAdapter
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, com.haibin.calendarview.Month month, int i) {
        com.haibin.calendarview.YearView yearView = ((com.haibin.calendarview.YearViewAdapter.YearViewHolder) viewHolder).mYearView;
        yearView.init(month.getYear(), month.getMonth());
        yearView.measureSize(this.mItemWidth, this.mItemHeight);
    }

    private static class YearViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        com.haibin.calendarview.YearView mYearView;

        YearViewHolder(android.view.View view, com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate) {
            super(view);
            com.haibin.calendarview.YearView yearView = (com.haibin.calendarview.YearView) view;
            this.mYearView = yearView;
            yearView.setup(calendarViewDelegate);
        }
    }
}
