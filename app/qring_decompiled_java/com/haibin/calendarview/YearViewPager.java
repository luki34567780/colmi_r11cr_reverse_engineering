package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public final class YearViewPager extends androidx.viewpager.widget.ViewPager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean isUpdateYearView;
    private com.haibin.calendarview.CalendarViewDelegate mDelegate;
    private com.haibin.calendarview.YearRecyclerView.OnMonthSelectedListener mListener;
    private int mYearCount;

    public YearViewPager(android.content.Context context) {
        this(context, null);
    }

    public YearViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    void setup(com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
        this.mYearCount = (calendarViewDelegate.getMaxYear() - this.mDelegate.getMinYear()) + 1;
        setAdapter(new androidx.viewpager.widget.PagerAdapter() { // from class: com.haibin.calendarview.YearViewPager.1
            public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
                return view == obj;
            }

            public int getCount() {
                return com.haibin.calendarview.YearViewPager.this.mYearCount;
            }

            public int getItemPosition(java.lang.Object obj) {
                if (com.haibin.calendarview.YearViewPager.this.isUpdateYearView) {
                    return -2;
                }
                return super.getItemPosition(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.haibin.calendarview.YearRecyclerView, java.lang.Object] */
            public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
                ?? yearRecyclerView = new com.haibin.calendarview.YearRecyclerView(com.haibin.calendarview.YearViewPager.this.getContext());
                viewGroup.addView(yearRecyclerView);
                yearRecyclerView.setup(com.haibin.calendarview.YearViewPager.this.mDelegate);
                yearRecyclerView.setOnMonthSelectedListener(com.haibin.calendarview.YearViewPager.this.mListener);
                yearRecyclerView.init(i + com.haibin.calendarview.YearViewPager.this.mDelegate.getMinYear());
                return yearRecyclerView;
            }

            public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
                viewGroup.removeView((android.view.View) obj);
            }
        });
        setCurrentItem(this.mDelegate.getCurrentDay().getYear() - this.mDelegate.getMinYear());
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, false);
    }

    public void setCurrentItem(int i, boolean z) {
        if (java.lang.Math.abs(getCurrentItem() - i) > 1) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i, false);
        }
    }

    void notifyDataSetChanged() {
        this.mYearCount = (this.mDelegate.getMaxYear() - this.mDelegate.getMinYear()) + 1;
        if (getAdapter() != null) {
            getAdapter().notifyDataSetChanged();
        }
    }

    void scrollToYear(int i, boolean z) {
        setCurrentItem(i - this.mDelegate.getMinYear(), z);
    }

    final void updateRange() {
        this.isUpdateYearView = true;
        notifyDataSetChanged();
        this.isUpdateYearView = false;
    }

    final void update() {
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.YearRecyclerView) getChildAt(i)).notifyAdapterDataSetChanged();
        }
    }

    final void updateWeekStart() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.YearRecyclerView yearRecyclerView = (com.haibin.calendarview.YearRecyclerView) getChildAt(i);
            yearRecyclerView.updateWeekStart();
            yearRecyclerView.notifyAdapterDataSetChanged();
        }
    }

    final void updateStyle() {
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.YearRecyclerView) getChildAt(i)).updateStyle();
        }
    }

    final void setOnMonthSelectedListener(com.haibin.calendarview.YearRecyclerView.OnMonthSelectedListener onMonthSelectedListener) {
        this.mListener = onMonthSelectedListener;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    private static int getHeight(android.content.Context context, android.view.View view) {
        int height = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        view.getLocationOnScreen(iArr);
        return height - iArr[1];
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mDelegate.isYearViewScrollable() && super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mDelegate.isYearViewScrollable() && super.onInterceptTouchEvent(motionEvent);
    }
}
