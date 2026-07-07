package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseWeekView extends com.haibin.calendarview.BaseView {
    protected java.lang.Object getClickCalendarPaddingObject(float f, float f2, com.haibin.calendarview.Calendar calendar) {
        return null;
    }

    @Override // com.haibin.calendarview.BaseView
    protected void onDestroy() {
    }

    protected void onLoopStart(int i) {
    }

    @Override // com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
    }

    public BaseWeekView(android.content.Context context) {
        super(context);
    }

    final void setup(com.haibin.calendarview.Calendar calendar) {
        this.mItems = com.haibin.calendarview.CalendarUtil.initCalendarForWeekView(calendar, this.mDelegate, this.mDelegate.getWeekStart());
        addSchemesFromMap();
        invalidate();
    }

    final void setSelectedCalendar(com.haibin.calendarview.Calendar calendar) {
        if (this.mDelegate.getSelectMode() != 1 || calendar.equals(this.mDelegate.mSelectedCalendar)) {
            this.mCurrentItem = this.mItems.indexOf(calendar);
        }
    }

    final void performClickCalendar(com.haibin.calendarview.Calendar calendar, boolean z) {
        if (this.mParentLayout == null || this.mDelegate.mInnerListener == null || this.mItems == null || this.mItems.size() == 0) {
            return;
        }
        int weekViewIndexFromCalendar = com.haibin.calendarview.CalendarUtil.getWeekViewIndexFromCalendar(calendar, this.mDelegate.getWeekStart());
        if (this.mItems.contains(this.mDelegate.getCurrentDay())) {
            weekViewIndexFromCalendar = com.haibin.calendarview.CalendarUtil.getWeekViewIndexFromCalendar(this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart());
        }
        com.haibin.calendarview.Calendar calendar2 = this.mItems.get(weekViewIndexFromCalendar);
        if (this.mDelegate.getSelectMode() != 0) {
            if (this.mItems.contains(this.mDelegate.mSelectedCalendar)) {
                calendar2 = this.mDelegate.mSelectedCalendar;
            } else {
                this.mCurrentItem = -1;
            }
        }
        if (!isInRange(calendar2)) {
            weekViewIndexFromCalendar = getEdgeIndex(isMinRangeEdge(calendar2));
            calendar2 = this.mItems.get(weekViewIndexFromCalendar);
        }
        calendar2.setCurrentDay(calendar2.equals(this.mDelegate.getCurrentDay()));
        this.mDelegate.mInnerListener.onWeekDateSelected(calendar2, false);
        this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(calendar2, this.mDelegate.getWeekStart()));
        if (this.mDelegate.mCalendarSelectListener != null && z && this.mDelegate.getSelectMode() == 0) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(calendar2, false);
        }
        this.mParentLayout.updateContentViewTranslateY();
        if (this.mDelegate.getSelectMode() == 0) {
            this.mCurrentItem = weekViewIndexFromCalendar;
        }
        if (!this.mDelegate.isShowYearSelectedLayout && this.mDelegate.mIndexCalendar != null && calendar.getYear() != this.mDelegate.mIndexCalendar.getYear() && this.mDelegate.mYearChangeListener != null) {
            this.mDelegate.mYearChangeListener.onYearChange(this.mDelegate.mIndexCalendar.getYear());
        }
        this.mDelegate.mIndexCalendar = calendar2;
        invalidate();
    }

    final boolean isMinRangeEdge(com.haibin.calendarview.Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth() - 1, this.mDelegate.getMinYearDay());
        long timeInMillis = calendar2.getTimeInMillis();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        return calendar2.getTimeInMillis() < timeInMillis;
    }

    final int getEdgeIndex(boolean z) {
        for (int i = 0; i < this.mItems.size(); i++) {
            boolean isInRange = isInRange(this.mItems.get(i));
            if (z && isInRange) {
                return i;
            }
            if (!z && !isInRange) {
                return i - 1;
            }
        }
        return z ? 6 : 0;
    }

    protected com.haibin.calendarview.Calendar getIndex() {
        if (this.mX <= this.mDelegate.getCalendarPaddingLeft() || this.mX >= getWidth() - this.mDelegate.getCalendarPaddingRight()) {
            onClickCalendarPadding();
            return null;
        }
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
        this.mDelegate.mClickCalendarPaddingListener.onClickCalendarPadding(this.mX, this.mY, false, calendar2, getClickCalendarPaddingObject(this.mX, this.mY, calendar2));
    }

    final void updateShowMode() {
        invalidate();
    }

    final void updateWeekStart() {
        com.haibin.calendarview.Calendar firstCalendarStartWithMinCalendar = com.haibin.calendarview.CalendarUtil.getFirstCalendarStartWithMinCalendar(this.mDelegate.getMinYear(), this.mDelegate.getMinYearMonth(), this.mDelegate.getMinYearDay(), ((java.lang.Integer) getTag()).intValue() + 1, this.mDelegate.getWeekStart());
        setSelectedCalendar(this.mDelegate.mSelectedCalendar);
        setup(firstCalendarStartWithMinCalendar);
    }

    final void updateSingleSelect() {
        if (this.mItems.contains(this.mDelegate.mSelectedCalendar)) {
            return;
        }
        this.mCurrentItem = -1;
        invalidate();
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

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(this.mItemHeight, 1073741824));
    }
}
