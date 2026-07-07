package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public final class WeekViewPager extends androidx.viewpager.widget.ViewPager {
    private boolean isUpdateWeekView;
    private boolean isUsingScrollToCalendar;
    private com.haibin.calendarview.CalendarViewDelegate mDelegate;
    com.haibin.calendarview.CalendarLayout mParentLayout;
    private int mWeekCount;

    public WeekViewPager(android.content.Context context) {
        this(context, null);
    }

    public WeekViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isUsingScrollToCalendar = false;
    }

    void setup(com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
        init();
    }

    private void init() {
        this.mWeekCount = com.haibin.calendarview.CalendarUtil.getWeekCountBetweenBothCalendar(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getMaxYear(), this.mDelegate.getMaxYearMonth(), this.mDelegate.getMaxYearDay(), this.mDelegate.getWeekStart());
        setAdapter(new com.haibin.calendarview.WeekViewPager.WeekViewPagerAdapter());
        addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener() { // from class: com.haibin.calendarview.WeekViewPager.1
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                if (com.haibin.calendarview.WeekViewPager.this.getVisibility() != 0) {
                    com.haibin.calendarview.WeekViewPager.this.isUsingScrollToCalendar = false;
                    return;
                }
                if (com.haibin.calendarview.WeekViewPager.this.isUsingScrollToCalendar) {
                    com.haibin.calendarview.WeekViewPager.this.isUsingScrollToCalendar = false;
                    return;
                }
                com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) com.haibin.calendarview.WeekViewPager.this.findViewWithTag(java.lang.Integer.valueOf(i));
                if (baseWeekView != null) {
                    baseWeekView.performClickCalendar(com.haibin.calendarview.WeekViewPager.this.mDelegate.getSelectMode() != 0 ? com.haibin.calendarview.WeekViewPager.this.mDelegate.mIndexCalendar : com.haibin.calendarview.WeekViewPager.this.mDelegate.mSelectedCalendar, !com.haibin.calendarview.WeekViewPager.this.isUsingScrollToCalendar);
                    if (com.haibin.calendarview.WeekViewPager.this.mDelegate.mWeekChangeListener != null) {
                        com.haibin.calendarview.WeekViewPager.this.mDelegate.mWeekChangeListener.onWeekChange(com.haibin.calendarview.WeekViewPager.this.getCurrentWeekCalendars());
                    }
                }
                com.haibin.calendarview.WeekViewPager.this.isUsingScrollToCalendar = false;
            }
        });
    }

    java.util.List<com.haibin.calendarview.Calendar> getCurrentWeekCalendars() {
        java.util.List<com.haibin.calendarview.Calendar> weekCalendars = com.haibin.calendarview.CalendarUtil.getWeekCalendars(this.mDelegate.mIndexCalendar, this.mDelegate);
        this.mDelegate.addSchemesFromMap(weekCalendars);
        return weekCalendars;
    }

    void notifyDataSetChanged() {
        this.mWeekCount = com.haibin.calendarview.CalendarUtil.getWeekCountBetweenBothCalendar(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getMaxYear(), this.mDelegate.getMaxYearMonth(), this.mDelegate.getMaxYearDay(), this.mDelegate.getWeekStart());
        notifyAdapterDataSetChanged();
    }

    void updateWeekViewClass() {
        this.isUpdateWeekView = true;
        notifyAdapterDataSetChanged();
        this.isUpdateWeekView = false;
    }

    void updateRange() {
        this.isUpdateWeekView = true;
        notifyDataSetChanged();
        this.isUpdateWeekView = false;
        if (getVisibility() != 0) {
            return;
        }
        this.isUsingScrollToCalendar = true;
        com.haibin.calendarview.Calendar calendar = this.mDelegate.mSelectedCalendar;
        updateSelected(calendar, false);
        if (this.mDelegate.mInnerListener != null) {
            this.mDelegate.mInnerListener.onWeekDateSelected(calendar, false);
        }
        if (this.mDelegate.mCalendarSelectListener != null) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
    }

    void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2) {
        this.isUsingScrollToCalendar = true;
        com.haibin.calendarview.Calendar calendar = new com.haibin.calendarview.Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        calendar.setCurrentDay(calendar.equals(this.mDelegate.getCurrentDay()));
        com.haibin.calendarview.LunarCalendar.setupLunarCalendar(calendar);
        this.mDelegate.mIndexCalendar = calendar;
        this.mDelegate.mSelectedCalendar = calendar;
        this.mDelegate.updateSelectCalendarScheme();
        updateSelected(calendar, z);
        if (this.mDelegate.mInnerListener != null) {
            this.mDelegate.mInnerListener.onWeekDateSelected(calendar, false);
        }
        if (this.mDelegate.mCalendarSelectListener != null && z2) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
    }

    void scrollToCurrent(boolean z) {
        this.isUsingScrollToCalendar = true;
        int weekFromCalendarStartWithMinCalendar = com.haibin.calendarview.CalendarUtil.getWeekFromCalendarStartWithMinCalendar(this.mDelegate.getCurrentDay(), this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getWeekStart()) - 1;
        if (getCurrentItem() == weekFromCalendarStartWithMinCalendar) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(weekFromCalendarStartWithMinCalendar, z);
        com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) findViewWithTag(java.lang.Integer.valueOf(weekFromCalendarStartWithMinCalendar));
        if (baseWeekView != null) {
            baseWeekView.performClickCalendar(this.mDelegate.getCurrentDay(), false);
            baseWeekView.setSelectedCalendar(this.mDelegate.getCurrentDay());
            baseWeekView.invalidate();
        }
        if (this.mDelegate.mCalendarSelectListener != null && getVisibility() == 0) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(this.mDelegate.mSelectedCalendar, false);
        }
        if (getVisibility() == 0) {
            this.mDelegate.mInnerListener.onWeekDateSelected(this.mDelegate.getCurrentDay(), false);
        }
        this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart()));
    }

    void updateSelected(com.haibin.calendarview.Calendar calendar, boolean z) {
        int weekFromCalendarStartWithMinCalendar = com.haibin.calendarview.CalendarUtil.getWeekFromCalendarStartWithMinCalendar(calendar, this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getWeekStart()) - 1;
        this.isUsingScrollToCalendar = getCurrentItem() != weekFromCalendarStartWithMinCalendar;
        setCurrentItem(weekFromCalendarStartWithMinCalendar, z);
        com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) findViewWithTag(java.lang.Integer.valueOf(weekFromCalendarStartWithMinCalendar));
        if (baseWeekView != null) {
            baseWeekView.setSelectedCalendar(calendar);
            baseWeekView.invalidate();
        }
    }

    void updateSingleSelect() {
        if (this.mDelegate.getSelectMode() == 0) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.BaseWeekView) getChildAt(i)).updateSingleSelect();
        }
    }

    void updateDefaultSelect() {
        com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) findViewWithTag(java.lang.Integer.valueOf(getCurrentItem()));
        if (baseWeekView != null) {
            baseWeekView.setSelectedCalendar(this.mDelegate.mSelectedCalendar);
            baseWeekView.invalidate();
        }
    }

    void updateSelected() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) getChildAt(i);
            baseWeekView.setSelectedCalendar(this.mDelegate.mSelectedCalendar);
            baseWeekView.invalidate();
        }
    }

    final void updateStyle() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) getChildAt(i);
            baseWeekView.updateStyle();
            baseWeekView.invalidate();
        }
    }

    void updateScheme() {
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.BaseWeekView) getChildAt(i)).update();
        }
    }

    void updateCurrentDate() {
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.BaseWeekView) getChildAt(i)).updateCurrentDate();
        }
    }

    void updateShowMode() {
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.BaseWeekView) getChildAt(i)).updateShowMode();
        }
    }

    void updateWeekStart() {
        if (getAdapter() == null) {
            return;
        }
        int count = getAdapter().getCount();
        int weekCountBetweenBothCalendar = com.haibin.calendarview.CalendarUtil.getWeekCountBetweenBothCalendar(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), this.mDelegate.getMaxYear(), this.mDelegate.getMaxYearMonth(), this.mDelegate.getMaxYearDay(), this.mDelegate.getWeekStart());
        this.mWeekCount = weekCountBetweenBothCalendar;
        if (count != weekCountBetweenBothCalendar) {
            this.isUpdateWeekView = true;
            getAdapter().notifyDataSetChanged();
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.BaseWeekView) getChildAt(i)).updateWeekStart();
        }
        this.isUpdateWeekView = false;
        updateSelected(this.mDelegate.mSelectedCalendar, false);
    }

    final void updateItemHeight() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) getChildAt(i);
            baseWeekView.updateItemHeight();
            baseWeekView.requestLayout();
        }
    }

    final void clearSelectRange() {
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.BaseWeekView) getChildAt(i)).invalidate();
        }
    }

    final void clearSingleSelect() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) getChildAt(i);
            baseWeekView.mCurrentItem = -1;
            baseWeekView.invalidate();
        }
    }

    final void clearMultiSelect() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) getChildAt(i);
            baseWeekView.mCurrentItem = -1;
            baseWeekView.invalidate();
        }
    }

    private void notifyAdapterDataSetChanged() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mDelegate.isWeekViewScrollable() && super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mDelegate.isWeekViewScrollable() && super.onInterceptTouchEvent(motionEvent);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(this.mDelegate.getCalendarItemHeight(), 1073741824));
    }

    private class WeekViewPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
        private WeekViewPagerAdapter() {
        }

        public int getCount() {
            return com.haibin.calendarview.WeekViewPager.this.mWeekCount;
        }

        public int getItemPosition(java.lang.Object obj) {
            if (com.haibin.calendarview.WeekViewPager.this.isUpdateWeekView) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
            return view.equals(obj);
        }

        public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
            com.haibin.calendarview.Calendar firstCalendarStartWithMinCalendar = com.haibin.calendarview.CalendarUtil.getFirstCalendarStartWithMinCalendar(com.haibin.calendarview.WeekViewPager.this.mDelegate.getMinYear(), com.haibin.calendarview.WeekViewPager.this.mDelegate.getMinYearMonth(), com.haibin.calendarview.WeekViewPager.this.mDelegate.getMinYearDay(), i + 1, com.haibin.calendarview.WeekViewPager.this.mDelegate.getWeekStart());
            try {
                com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) com.haibin.calendarview.WeekViewPager.this.mDelegate.getWeekViewClass().getConstructor(android.content.Context.class).newInstance(com.haibin.calendarview.WeekViewPager.this.getContext());
                baseWeekView.mParentLayout = com.haibin.calendarview.WeekViewPager.this.mParentLayout;
                baseWeekView.setup(com.haibin.calendarview.WeekViewPager.this.mDelegate);
                baseWeekView.setup(firstCalendarStartWithMinCalendar);
                baseWeekView.setTag(java.lang.Integer.valueOf(i));
                baseWeekView.setSelectedCalendar(com.haibin.calendarview.WeekViewPager.this.mDelegate.mSelectedCalendar);
                viewGroup.addView(baseWeekView);
                return baseWeekView;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return new com.haibin.calendarview.DefaultWeekView(com.haibin.calendarview.WeekViewPager.this.getContext());
            }
        }

        public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
            com.haibin.calendarview.BaseWeekView baseWeekView = (com.haibin.calendarview.BaseWeekView) obj;
            baseWeekView.onDestroy();
            viewGroup.removeView(baseWeekView);
        }
    }
}
