package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseMonthView extends com.haibin.calendarview.BaseView {
    protected int mHeight;
    protected int mLineCount;
    protected int mMonth;
    com.haibin.calendarview.MonthViewPager mMonthViewPager;
    protected int mNextDiff;
    protected int mYear;

    protected java.lang.Object getClickCalendarPaddingObject(float f, float f2, com.haibin.calendarview.Calendar calendar) {
        return null;
    }

    @Override // com.haibin.calendarview.BaseView
    protected void onDestroy() {
    }

    protected void onLoopStart(int i, int i2) {
    }

    @Override // com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
    }

    public BaseMonthView(android.content.Context context) {
        super(context);
    }

    final void initMonthWithDate(int i, int i2) {
        this.mYear = i;
        this.mMonth = i2;
        initCalendar();
        this.mHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(i, i2, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
    }

    private void initCalendar() {
        this.mNextDiff = com.haibin.calendarview.CalendarUtil.getMonthEndDiff(this.mYear, this.mMonth, this.mDelegate.getWeekStart());
        int monthViewStartDiff = com.haibin.calendarview.CalendarUtil.getMonthViewStartDiff(this.mYear, this.mMonth, this.mDelegate.getWeekStart());
        int monthDaysCount = com.haibin.calendarview.CalendarUtil.getMonthDaysCount(this.mYear, this.mMonth);
        this.mItems = com.haibin.calendarview.CalendarUtil.initCalendarForMonthView(this.mYear, this.mMonth, this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart());
        if (this.mItems.contains(this.mDelegate.getCurrentDay())) {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.getCurrentDay());
        } else {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.mSelectedCalendar);
        }
        if (this.mCurrentItem > 0 && this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(this.mDelegate.mSelectedCalendar)) {
            this.mCurrentItem = -1;
        }
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mLineCount = 6;
        } else {
            this.mLineCount = ((monthViewStartDiff + monthDaysCount) + this.mNextDiff) / 7;
        }
        addSchemesFromMap();
        invalidate();
    }

    protected com.haibin.calendarview.Calendar getIndex() {
        if (this.mItemWidth != 0 && this.mItemHeight != 0) {
            if (this.mX <= this.mDelegate.getCalendarPaddingLeft() || this.mX >= getWidth() - this.mDelegate.getCalendarPaddingRight()) {
                onClickCalendarPadding();
            } else {
                int calendarPaddingLeft = ((int) (this.mX - this.mDelegate.getCalendarPaddingLeft())) / this.mItemWidth;
                if (calendarPaddingLeft >= 7) {
                    calendarPaddingLeft = 6;
                }
                int i = ((((int) this.mY) / this.mItemHeight) * 7) + calendarPaddingLeft;
                if (i < 0 || i >= this.mItems.size()) {
                    return null;
                }
                return this.mItems.get(i);
            }
        }
        return null;
    }

    private void onClickCalendarPadding() {
        if (this.mDelegate.mClickCalendarPaddingListener == null) {
            return;
        }
        com.haibin.calendarview.Calendar calendar = null;
        int calendarPaddingLeft = ((int) (this.mX - this.mDelegate.getCalendarPaddingLeft())) / this.mItemWidth;
        if (calendarPaddingLeft >= 7) {
            calendarPaddingLeft = 6;
        }
        int i = ((((int) this.mY) / this.mItemHeight) * 7) + calendarPaddingLeft;
        if (i >= 0 && i < this.mItems.size()) {
            calendar = this.mItems.get(i);
        }
        com.haibin.calendarview.Calendar calendar2 = calendar;
        if (calendar2 == null) {
            return;
        }
        this.mDelegate.mClickCalendarPaddingListener.onClickCalendarPadding(this.mX, this.mY, true, calendar2, getClickCalendarPaddingObject(this.mX, this.mY, calendar2));
    }

    final void setSelectedCalendar(com.haibin.calendarview.Calendar calendar) {
        this.mCurrentItem = this.mItems.indexOf(calendar);
    }

    final void updateShowMode() {
        this.mLineCount = com.haibin.calendarview.CalendarUtil.getMonthViewLineCount(this.mYear, this.mMonth, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        this.mHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        invalidate();
    }

    final void updateWeekStart() {
        initCalendar();
        this.mHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
    }

    @Override // com.haibin.calendarview.BaseView
    void updateItemHeight() {
        super.updateItemHeight();
        this.mHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
    }

    @Override // com.haibin.calendarview.BaseView
    void updateCurrentDate() {
        if (this.mItems == null) {
            return;
        }
        if (this.mItems.contains(this.mDelegate.getCurrentDay())) {
            java.util.Iterator<com.haibin.calendarview.Calendar> it = this.mItems.iterator();
            while (it.hasNext()) {
                it.next().setCurrentDay(false);
            }
            this.mItems.get(this.mItems.indexOf(this.mDelegate.getCurrentDay())).setCurrentDay(true);
        }
        invalidate();
    }

    protected final int getSelectedIndex(com.haibin.calendarview.Calendar calendar) {
        return this.mItems.indexOf(calendar);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mLineCount != 0) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
