package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public final class YearRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    private com.haibin.calendarview.YearViewAdapter mAdapter;
    private com.haibin.calendarview.CalendarViewDelegate mDelegate;
    private com.haibin.calendarview.YearRecyclerView.OnMonthSelectedListener mListener;

    interface OnMonthSelectedListener {
        void onMonthSelected(int i, int i2);
    }

    public YearRecyclerView(android.content.Context context) {
        this(context, null);
    }

    public YearRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdapter = new com.haibin.calendarview.YearViewAdapter(context);
        setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 3));
        setAdapter(this.mAdapter);
        this.mAdapter.setOnItemClickListener(new com.haibin.calendarview.BaseRecyclerAdapter.OnItemClickListener() { // from class: com.haibin.calendarview.YearRecyclerView.1
            @Override // com.haibin.calendarview.BaseRecyclerAdapter.OnItemClickListener
            public void onItemClick(int i, long j) {
                com.haibin.calendarview.Month item;
                if (com.haibin.calendarview.YearRecyclerView.this.mListener == null || com.haibin.calendarview.YearRecyclerView.this.mDelegate == null || (item = com.haibin.calendarview.YearRecyclerView.this.mAdapter.getItem(i)) == null || !com.haibin.calendarview.CalendarUtil.isMonthInRange(item.getYear(), item.getMonth(), com.haibin.calendarview.YearRecyclerView.this.mDelegate.getMinYear(), com.haibin.calendarview.YearRecyclerView.this.mDelegate.getMinYearMonth(), com.haibin.calendarview.YearRecyclerView.this.mDelegate.getMaxYear(), com.haibin.calendarview.YearRecyclerView.this.mDelegate.getMaxYearMonth())) {
                    return;
                }
                com.haibin.calendarview.YearRecyclerView.this.mListener.onMonthSelected(item.getYear(), item.getMonth());
                if (com.haibin.calendarview.YearRecyclerView.this.mDelegate.mYearViewChangeListener != null) {
                    com.haibin.calendarview.YearRecyclerView.this.mDelegate.mYearViewChangeListener.onYearViewChange(true);
                }
            }
        });
    }

    final void setup(com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
        this.mAdapter.setup(calendarViewDelegate);
    }

    final void init(int i) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        for (int i2 = 1; i2 <= 12; i2++) {
            calendar.set(i, i2 - 1, 1);
            int monthDaysCount = com.haibin.calendarview.CalendarUtil.getMonthDaysCount(i, i2);
            com.haibin.calendarview.Month month = new com.haibin.calendarview.Month();
            month.setDiff(com.haibin.calendarview.CalendarUtil.getMonthViewStartDiff(i, i2, this.mDelegate.getWeekStart()));
            month.setCount(monthDaysCount);
            month.setMonth(i2);
            month.setYear(i);
            this.mAdapter.addItem(month);
        }
    }

    final void updateWeekStart() {
        for (com.haibin.calendarview.Month month : this.mAdapter.getItems()) {
            month.setDiff(com.haibin.calendarview.CalendarUtil.getMonthViewStartDiff(month.getYear(), month.getMonth(), this.mDelegate.getWeekStart()));
        }
    }

    final void updateStyle() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.YearView yearView = (com.haibin.calendarview.YearView) getChildAt(i);
            yearView.updateStyle();
            yearView.invalidate();
        }
    }

    final void setOnMonthSelectedListener(com.haibin.calendarview.YearRecyclerView.OnMonthSelectedListener onMonthSelectedListener) {
        this.mListener = onMonthSelectedListener;
    }

    void notifyAdapterDataSetChanged() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        this.mAdapter.setYearViewSize(android.view.View.MeasureSpec.getSize(i) / 3, size / 4);
    }
}
