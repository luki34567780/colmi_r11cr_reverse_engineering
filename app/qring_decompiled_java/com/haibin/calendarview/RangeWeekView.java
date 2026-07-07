package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class RangeWeekView extends com.haibin.calendarview.BaseWeekView {
    protected abstract void onDrawScheme(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, boolean z);

    protected abstract boolean onDrawSelected(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, boolean z, boolean z2, boolean z3);

    protected abstract void onDrawText(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, boolean z, boolean z2);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        return false;
    }

    public RangeWeekView(android.content.Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.mItems.size() == 0) {
            return;
        }
        this.mItemWidth = ((getWidth() - this.mDelegate.getCalendarPaddingLeft()) - this.mDelegate.getCalendarPaddingRight()) / 7;
        onPreviewHook();
        for (int i = 0; i < 7; i++) {
            int calendarPaddingLeft = (this.mItemWidth * i) + this.mDelegate.getCalendarPaddingLeft();
            onLoopStart(calendarPaddingLeft);
            com.haibin.calendarview.Calendar calendar = this.mItems.get(i);
            boolean isCalendarSelected = isCalendarSelected(calendar);
            boolean isSelectPreCalendar = isSelectPreCalendar(calendar, i);
            boolean isSelectNextCalendar = isSelectNextCalendar(calendar, i);
            boolean hasScheme = calendar.hasScheme();
            if (hasScheme) {
                if ((isCalendarSelected ? onDrawSelected(canvas, calendar, calendarPaddingLeft, true, isSelectPreCalendar, isSelectNextCalendar) : false) || !isCalendarSelected) {
                    this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.getSchemeThemeColor());
                    onDrawScheme(canvas, calendar, calendarPaddingLeft, isCalendarSelected);
                }
            } else if (isCalendarSelected) {
                onDrawSelected(canvas, calendar, calendarPaddingLeft, false, isSelectPreCalendar, isSelectNextCalendar);
            }
            onDrawText(canvas, calendar, calendarPaddingLeft, hasScheme, isCalendarSelected);
        }
    }

    protected boolean isCalendarSelected(com.haibin.calendarview.Calendar calendar) {
        if (this.mDelegate.mSelectedStartRangeCalendar == null || onCalendarIntercept(calendar)) {
            return false;
        }
        return this.mDelegate.mSelectedEndRangeCalendar == null ? calendar.compareTo(this.mDelegate.mSelectedStartRangeCalendar) == 0 : calendar.compareTo(this.mDelegate.mSelectedStartRangeCalendar) >= 0 && calendar.compareTo(this.mDelegate.mSelectedEndRangeCalendar) <= 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.haibin.calendarview.Calendar index;
        if (this.isClick && (index = getIndex()) != null) {
            if (onCalendarIntercept(index)) {
                this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(index, true);
                return;
            }
            if (!isInRange(index)) {
                if (this.mDelegate.mCalendarRangeSelectListener != null) {
                    this.mDelegate.mCalendarRangeSelectListener.onCalendarSelectOutOfRange(index);
                    return;
                }
                return;
            }
            if (this.mDelegate.mSelectedStartRangeCalendar != null && this.mDelegate.mSelectedEndRangeCalendar == null) {
                int differ = com.haibin.calendarview.CalendarUtil.differ(index, this.mDelegate.mSelectedStartRangeCalendar);
                if (differ >= 0 && this.mDelegate.getMinSelectRange() != -1 && this.mDelegate.getMinSelectRange() > differ + 1) {
                    if (this.mDelegate.mCalendarRangeSelectListener != null) {
                        this.mDelegate.mCalendarRangeSelectListener.onSelectOutOfRange(index, true);
                        return;
                    }
                    return;
                } else if (this.mDelegate.getMaxSelectRange() != -1 && this.mDelegate.getMaxSelectRange() < com.haibin.calendarview.CalendarUtil.differ(index, this.mDelegate.mSelectedStartRangeCalendar) + 1) {
                    if (this.mDelegate.mCalendarRangeSelectListener != null) {
                        this.mDelegate.mCalendarRangeSelectListener.onSelectOutOfRange(index, false);
                        return;
                    }
                    return;
                }
            }
            if (this.mDelegate.mSelectedStartRangeCalendar == null || this.mDelegate.mSelectedEndRangeCalendar != null) {
                this.mDelegate.mSelectedStartRangeCalendar = index;
                this.mDelegate.mSelectedEndRangeCalendar = null;
            } else {
                int compareTo = index.compareTo(this.mDelegate.mSelectedStartRangeCalendar);
                if (this.mDelegate.getMinSelectRange() == -1 && compareTo <= 0) {
                    this.mDelegate.mSelectedStartRangeCalendar = index;
                    this.mDelegate.mSelectedEndRangeCalendar = null;
                } else if (compareTo < 0) {
                    this.mDelegate.mSelectedStartRangeCalendar = index;
                    this.mDelegate.mSelectedEndRangeCalendar = null;
                } else if (compareTo == 0 && this.mDelegate.getMinSelectRange() == 1) {
                    this.mDelegate.mSelectedEndRangeCalendar = index;
                } else {
                    this.mDelegate.mSelectedEndRangeCalendar = index;
                }
            }
            this.mCurrentItem = this.mItems.indexOf(index);
            if (this.mDelegate.mInnerListener != null) {
                this.mDelegate.mInnerListener.onWeekDateSelected(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(index, this.mDelegate.getWeekStart()));
            }
            if (this.mDelegate.mCalendarRangeSelectListener != null) {
                this.mDelegate.mCalendarRangeSelectListener.onCalendarRangeSelect(index, this.mDelegate.mSelectedEndRangeCalendar != null);
            }
            invalidate();
        }
    }

    protected final boolean isSelectPreCalendar(com.haibin.calendarview.Calendar calendar, int i) {
        com.haibin.calendarview.Calendar calendar2;
        if (i == 0) {
            calendar2 = com.haibin.calendarview.CalendarUtil.getPreCalendar(calendar);
            this.mDelegate.updateCalendarScheme(calendar2);
        } else {
            calendar2 = this.mItems.get(i - 1);
        }
        return this.mDelegate.mSelectedStartRangeCalendar != null && isCalendarSelected(calendar2);
    }

    protected final boolean isSelectNextCalendar(com.haibin.calendarview.Calendar calendar, int i) {
        com.haibin.calendarview.Calendar calendar2;
        if (i == this.mItems.size() - 1) {
            calendar2 = com.haibin.calendarview.CalendarUtil.getNextCalendar(calendar);
            this.mDelegate.updateCalendarScheme(calendar2);
        } else {
            calendar2 = this.mItems.get(i + 1);
        }
        return this.mDelegate.mSelectedStartRangeCalendar != null && isCalendarSelected(calendar2);
    }
}
