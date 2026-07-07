package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public final class MonthViewPager extends androidx.viewpager.widget.ViewPager {
    private boolean isUpdateMonthView;
    private boolean isUsingScrollToCalendar;
    private int mCurrentViewHeight;
    private com.haibin.calendarview.CalendarViewDelegate mDelegate;
    private int mMonthCount;
    private int mNextViewHeight;
    com.haibin.calendarview.CalendarLayout mParentLayout;
    private int mPreViewHeight;
    com.haibin.calendarview.WeekBar mWeekBar;
    com.haibin.calendarview.WeekViewPager mWeekPager;

    public MonthViewPager(android.content.Context context) {
        this(context, null);
    }

    public MonthViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isUsingScrollToCalendar = false;
    }

    void setup(com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
        updateMonthViewHeight(calendarViewDelegate.getCurrentDay().getYear(), this.mDelegate.getCurrentDay().getMonth());
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
        init();
    }

    private void init() {
        this.mMonthCount = (((this.mDelegate.getMaxYear() - this.mDelegate.getMinYear()) * 12) - this.mDelegate.getMinYearMonth()) + 1 + this.mDelegate.getMaxYearMonth();
        setAdapter(new com.haibin.calendarview.MonthViewPager.MonthViewPagerAdapter());
        addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener() { // from class: com.haibin.calendarview.MonthViewPager.1
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
                float f2;
                int i3;
                if (com.haibin.calendarview.MonthViewPager.this.mDelegate.getMonthViewShowMode() == 0) {
                    return;
                }
                if (i < com.haibin.calendarview.MonthViewPager.this.getCurrentItem()) {
                    f2 = com.haibin.calendarview.MonthViewPager.this.mPreViewHeight * (1.0f - f);
                    i3 = com.haibin.calendarview.MonthViewPager.this.mCurrentViewHeight;
                } else {
                    f2 = com.haibin.calendarview.MonthViewPager.this.mCurrentViewHeight * (1.0f - f);
                    i3 = com.haibin.calendarview.MonthViewPager.this.mNextViewHeight;
                }
                int i4 = (int) (f2 + (i3 * f));
                android.view.ViewGroup.LayoutParams layoutParams = com.haibin.calendarview.MonthViewPager.this.getLayoutParams();
                layoutParams.height = i4;
                com.haibin.calendarview.MonthViewPager.this.setLayoutParams(layoutParams);
            }

            public void onPageSelected(int i) {
                com.haibin.calendarview.Calendar firstCalendarFromMonthViewPager = com.haibin.calendarview.CalendarUtil.getFirstCalendarFromMonthViewPager(i, com.haibin.calendarview.MonthViewPager.this.mDelegate);
                if (com.haibin.calendarview.MonthViewPager.this.getVisibility() == 0) {
                    if (!com.haibin.calendarview.MonthViewPager.this.mDelegate.isShowYearSelectedLayout && com.haibin.calendarview.MonthViewPager.this.mDelegate.mIndexCalendar != null && firstCalendarFromMonthViewPager.getYear() != com.haibin.calendarview.MonthViewPager.this.mDelegate.mIndexCalendar.getYear() && com.haibin.calendarview.MonthViewPager.this.mDelegate.mYearChangeListener != null) {
                        com.haibin.calendarview.MonthViewPager.this.mDelegate.mYearChangeListener.onYearChange(firstCalendarFromMonthViewPager.getYear());
                    }
                    com.haibin.calendarview.MonthViewPager.this.mDelegate.mIndexCalendar = firstCalendarFromMonthViewPager;
                }
                if (com.haibin.calendarview.MonthViewPager.this.mDelegate.mMonthChangeListener != null) {
                    com.haibin.calendarview.MonthViewPager.this.mDelegate.mMonthChangeListener.onMonthChange(firstCalendarFromMonthViewPager.getYear(), firstCalendarFromMonthViewPager.getMonth());
                }
                if (com.haibin.calendarview.MonthViewPager.this.mWeekPager.getVisibility() == 0) {
                    com.haibin.calendarview.MonthViewPager.this.updateMonthViewHeight(firstCalendarFromMonthViewPager.getYear(), firstCalendarFromMonthViewPager.getMonth());
                    return;
                }
                if (com.haibin.calendarview.MonthViewPager.this.mDelegate.getSelectMode() != 0) {
                    if (com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedStartRangeCalendar == null || !com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedStartRangeCalendar.isSameMonth(com.haibin.calendarview.MonthViewPager.this.mDelegate.mIndexCalendar)) {
                        if (firstCalendarFromMonthViewPager.isSameMonth(com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedCalendar)) {
                            com.haibin.calendarview.MonthViewPager.this.mDelegate.mIndexCalendar = com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedCalendar;
                        }
                    } else {
                        com.haibin.calendarview.MonthViewPager.this.mDelegate.mIndexCalendar = com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedStartRangeCalendar;
                    }
                } else {
                    if (!firstCalendarFromMonthViewPager.isCurrentMonth()) {
                        com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedCalendar = firstCalendarFromMonthViewPager;
                    } else {
                        com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedCalendar = com.haibin.calendarview.CalendarUtil.getRangeEdgeCalendar(firstCalendarFromMonthViewPager, com.haibin.calendarview.MonthViewPager.this.mDelegate);
                    }
                    com.haibin.calendarview.MonthViewPager.this.mDelegate.mIndexCalendar = com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedCalendar;
                }
                com.haibin.calendarview.MonthViewPager.this.mDelegate.updateSelectCalendarScheme();
                if (!com.haibin.calendarview.MonthViewPager.this.isUsingScrollToCalendar && com.haibin.calendarview.MonthViewPager.this.mDelegate.getSelectMode() == 0) {
                    com.haibin.calendarview.MonthViewPager.this.mWeekBar.onDateSelected(com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedCalendar, com.haibin.calendarview.MonthViewPager.this.mDelegate.getWeekStart(), false);
                    if (com.haibin.calendarview.MonthViewPager.this.mDelegate.mCalendarSelectListener != null) {
                        com.haibin.calendarview.MonthViewPager.this.mDelegate.mCalendarSelectListener.onCalendarSelect(com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedCalendar, false);
                    }
                }
                com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) com.haibin.calendarview.MonthViewPager.this.findViewWithTag(java.lang.Integer.valueOf(i));
                if (baseMonthView != null) {
                    int selectedIndex = baseMonthView.getSelectedIndex(com.haibin.calendarview.MonthViewPager.this.mDelegate.mIndexCalendar);
                    if (com.haibin.calendarview.MonthViewPager.this.mDelegate.getSelectMode() == 0) {
                        baseMonthView.mCurrentItem = selectedIndex;
                    }
                    if (selectedIndex >= 0 && com.haibin.calendarview.MonthViewPager.this.mParentLayout != null) {
                        com.haibin.calendarview.MonthViewPager.this.mParentLayout.updateSelectPosition(selectedIndex);
                    }
                    baseMonthView.invalidate();
                }
                com.haibin.calendarview.MonthViewPager.this.mWeekPager.updateSelected(com.haibin.calendarview.MonthViewPager.this.mDelegate.mIndexCalendar, false);
                com.haibin.calendarview.MonthViewPager.this.updateMonthViewHeight(firstCalendarFromMonthViewPager.getYear(), firstCalendarFromMonthViewPager.getMonth());
                com.haibin.calendarview.MonthViewPager.this.isUsingScrollToCalendar = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMonthViewHeight(int i, int i2) {
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mCurrentViewHeight = this.mDelegate.getCalendarItemHeight() * 6;
            getLayoutParams().height = this.mCurrentViewHeight;
            return;
        }
        if (this.mParentLayout != null) {
            if (getVisibility() != 0) {
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(i, i2, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
                setLayoutParams(layoutParams);
            }
            this.mParentLayout.updateContentViewTranslateY();
        }
        this.mCurrentViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(i, i2, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        if (i2 == 1) {
            this.mPreViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(i - 1, 12, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            this.mNextViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(i, 2, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            return;
        }
        this.mPreViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(i, i2 - 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        if (i2 == 12) {
            this.mNextViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(i + 1, 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        } else {
            this.mNextViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(i, i2 + 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        }
    }

    void notifyDataSetChanged() {
        this.mMonthCount = (((this.mDelegate.getMaxYear() - this.mDelegate.getMinYear()) * 12) - this.mDelegate.getMinYearMonth()) + 1 + this.mDelegate.getMaxYearMonth();
        notifyAdapterDataSetChanged();
    }

    void updateMonthViewClass() {
        this.isUpdateMonthView = true;
        notifyAdapterDataSetChanged();
        this.isUpdateMonthView = false;
    }

    final void updateRange() {
        this.isUpdateMonthView = true;
        notifyDataSetChanged();
        this.isUpdateMonthView = false;
        if (getVisibility() != 0) {
            return;
        }
        this.isUsingScrollToCalendar = false;
        com.haibin.calendarview.Calendar calendar = this.mDelegate.mSelectedCalendar;
        int year = (((calendar.getYear() - this.mDelegate.getMinYear()) * 12) + calendar.getMonth()) - this.mDelegate.getMinYearMonth();
        setCurrentItem(year, false);
        com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) findViewWithTag(java.lang.Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.mDelegate.mIndexCalendar);
            baseMonthView.invalidate();
            com.haibin.calendarview.CalendarLayout calendarLayout = this.mParentLayout;
            if (calendarLayout != null) {
                calendarLayout.updateSelectPosition(baseMonthView.getSelectedIndex(this.mDelegate.mIndexCalendar));
            }
        }
        if (this.mParentLayout != null) {
            this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
        }
        if (this.mDelegate.mInnerListener != null) {
            this.mDelegate.mInnerListener.onMonthDateSelected(calendar, false);
        }
        if (this.mDelegate.mCalendarSelectListener != null) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        updateSelected();
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
        int year = (((calendar.getYear() - this.mDelegate.getMinYear()) * 12) + calendar.getMonth()) - this.mDelegate.getMinYearMonth();
        if (getCurrentItem() == year) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(year, z);
        com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) findViewWithTag(java.lang.Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.mDelegate.mIndexCalendar);
            baseMonthView.invalidate();
            com.haibin.calendarview.CalendarLayout calendarLayout = this.mParentLayout;
            if (calendarLayout != null) {
                calendarLayout.updateSelectPosition(baseMonthView.getSelectedIndex(this.mDelegate.mIndexCalendar));
            }
        }
        if (this.mParentLayout != null) {
            this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
        }
        if (this.mDelegate.mCalendarSelectListener != null && z2) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(calendar, false);
        }
        if (this.mDelegate.mInnerListener != null) {
            this.mDelegate.mInnerListener.onMonthDateSelected(calendar, false);
        }
        updateSelected();
    }

    void scrollToCurrent(boolean z) {
        this.isUsingScrollToCalendar = true;
        int year = (((this.mDelegate.getCurrentDay().getYear() - this.mDelegate.getMinYear()) * 12) + this.mDelegate.getCurrentDay().getMonth()) - this.mDelegate.getMinYearMonth();
        if (getCurrentItem() == year) {
            this.isUsingScrollToCalendar = false;
        }
        setCurrentItem(year, z);
        com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) findViewWithTag(java.lang.Integer.valueOf(year));
        if (baseMonthView != null) {
            baseMonthView.setSelectedCalendar(this.mDelegate.getCurrentDay());
            baseMonthView.invalidate();
            com.haibin.calendarview.CalendarLayout calendarLayout = this.mParentLayout;
            if (calendarLayout != null) {
                calendarLayout.updateSelectPosition(baseMonthView.getSelectedIndex(this.mDelegate.getCurrentDay()));
            }
        }
        if (this.mDelegate.mCalendarSelectListener == null || getVisibility() != 0) {
            return;
        }
        this.mDelegate.mCalendarSelectListener.onCalendarSelect(this.mDelegate.mSelectedCalendar, false);
    }

    java.util.List<com.haibin.calendarview.Calendar> getCurrentMonthCalendars() {
        com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) findViewWithTag(java.lang.Integer.valueOf(getCurrentItem()));
        if (baseMonthView == null) {
            return null;
        }
        return baseMonthView.mItems;
    }

    void updateDefaultSelect() {
        com.haibin.calendarview.CalendarLayout calendarLayout;
        com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) findViewWithTag(java.lang.Integer.valueOf(getCurrentItem()));
        if (baseMonthView != null) {
            int selectedIndex = baseMonthView.getSelectedIndex(this.mDelegate.mSelectedCalendar);
            baseMonthView.mCurrentItem = selectedIndex;
            if (selectedIndex >= 0 && (calendarLayout = this.mParentLayout) != null) {
                calendarLayout.updateSelectPosition(selectedIndex);
            }
            baseMonthView.invalidate();
        }
    }

    void updateSelected() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) getChildAt(i);
            baseMonthView.setSelectedCalendar(this.mDelegate.mSelectedCalendar);
            baseMonthView.invalidate();
        }
    }

    final void updateStyle() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) getChildAt(i);
            baseMonthView.updateStyle();
            baseMonthView.invalidate();
        }
    }

    void updateScheme() {
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.BaseMonthView) getChildAt(i)).update();
        }
    }

    void updateCurrentDate() {
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.BaseMonthView) getChildAt(i)).updateCurrentDate();
        }
    }

    void updateShowMode() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) getChildAt(i);
            baseMonthView.updateShowMode();
            baseMonthView.requestLayout();
        }
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            int calendarItemHeight = this.mDelegate.getCalendarItemHeight() * 6;
            this.mCurrentViewHeight = calendarItemHeight;
            this.mNextViewHeight = calendarItemHeight;
            this.mPreViewHeight = calendarItemHeight;
        } else {
            updateMonthViewHeight(this.mDelegate.mSelectedCalendar.getYear(), this.mDelegate.mSelectedCalendar.getMonth());
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
        com.haibin.calendarview.CalendarLayout calendarLayout = this.mParentLayout;
        if (calendarLayout != null) {
            calendarLayout.updateContentViewTranslateY();
        }
    }

    void updateWeekStart() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) getChildAt(i);
            baseMonthView.updateWeekStart();
            baseMonthView.requestLayout();
        }
        updateMonthViewHeight(this.mDelegate.mSelectedCalendar.getYear(), this.mDelegate.mSelectedCalendar.getMonth());
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
        if (this.mParentLayout != null) {
            this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(this.mDelegate.mSelectedCalendar, this.mDelegate.getWeekStart()));
        }
        updateSelected();
    }

    final void updateItemHeight() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) getChildAt(i);
            baseMonthView.updateItemHeight();
            baseMonthView.requestLayout();
        }
        int year = this.mDelegate.mIndexCalendar.getYear();
        int month = this.mDelegate.mIndexCalendar.getMonth();
        this.mCurrentViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(year, month, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        if (month == 1) {
            this.mPreViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(year - 1, 12, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            this.mNextViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(year, 2, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        } else {
            this.mPreViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(year, month - 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            if (month == 12) {
                this.mNextViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(year + 1, 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            } else {
                this.mNextViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(year, month + 1, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.mCurrentViewHeight;
        setLayoutParams(layoutParams);
    }

    final void clearSelectRange() {
        for (int i = 0; i < getChildCount(); i++) {
            ((com.haibin.calendarview.BaseMonthView) getChildAt(i)).invalidate();
        }
    }

    final void clearSingleSelect() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) getChildAt(i);
            baseMonthView.mCurrentItem = -1;
            baseMonthView.invalidate();
        }
    }

    final void clearMultiSelect() {
        for (int i = 0; i < getChildCount(); i++) {
            com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) getChildAt(i);
            baseMonthView.mCurrentItem = -1;
            baseMonthView.invalidate();
        }
    }

    private void notifyAdapterDataSetChanged() {
        if (getAdapter() == null) {
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mDelegate.isMonthViewScrollable() && super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mDelegate.isMonthViewScrollable() && super.onInterceptTouchEvent(motionEvent);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setCurrentItem(int i, boolean z) {
        if (java.lang.Math.abs(getCurrentItem() - i) > 1) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i, z);
        }
    }

    private final class MonthViewPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
        private MonthViewPagerAdapter() {
        }

        public int getCount() {
            return com.haibin.calendarview.MonthViewPager.this.mMonthCount;
        }

        public int getItemPosition(java.lang.Object obj) {
            if (com.haibin.calendarview.MonthViewPager.this.isUpdateMonthView) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
            return view.equals(obj);
        }

        public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
            int minYearMonth = (((com.haibin.calendarview.MonthViewPager.this.mDelegate.getMinYearMonth() + i) - 1) / 12) + com.haibin.calendarview.MonthViewPager.this.mDelegate.getMinYear();
            int minYearMonth2 = (((com.haibin.calendarview.MonthViewPager.this.mDelegate.getMinYearMonth() + i) - 1) % 12) + 1;
            try {
                com.haibin.calendarview.BaseMonthView baseMonthView = (com.haibin.calendarview.BaseMonthView) com.haibin.calendarview.MonthViewPager.this.mDelegate.getMonthViewClass().getConstructor(android.content.Context.class).newInstance(com.haibin.calendarview.MonthViewPager.this.getContext());
                baseMonthView.mMonthViewPager = com.haibin.calendarview.MonthViewPager.this;
                baseMonthView.mParentLayout = com.haibin.calendarview.MonthViewPager.this.mParentLayout;
                baseMonthView.setup(com.haibin.calendarview.MonthViewPager.this.mDelegate);
                baseMonthView.setTag(java.lang.Integer.valueOf(i));
                baseMonthView.initMonthWithDate(minYearMonth, minYearMonth2);
                baseMonthView.setSelectedCalendar(com.haibin.calendarview.MonthViewPager.this.mDelegate.mSelectedCalendar);
                viewGroup.addView(baseMonthView);
                return baseMonthView;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return new com.haibin.calendarview.DefaultMonthView(com.haibin.calendarview.MonthViewPager.this.getContext());
            }
        }

        public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
            com.haibin.calendarview.BaseView baseView = (com.haibin.calendarview.BaseView) obj;
            baseView.onDestroy();
            viewGroup.removeView(baseView);
        }
    }
}
