package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class MultiMonthView extends com.haibin.calendarview.BaseMonthView {
    protected abstract void onDrawScheme(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, boolean z);

    protected abstract boolean onDrawSelected(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, boolean z, boolean z2, boolean z3);

    protected abstract void onDrawText(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, boolean z, boolean z2);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        return false;
    }

    public MultiMonthView(android.content.Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.mLineCount == 0) {
            return;
        }
        this.mItemWidth = ((getWidth() - this.mDelegate.getCalendarPaddingLeft()) - this.mDelegate.getCalendarPaddingRight()) / 7;
        onPreviewHook();
        int i = this.mLineCount * 7;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.mLineCount) {
            int i4 = i2;
            for (int i5 = 0; i5 < 7; i5++) {
                com.haibin.calendarview.Calendar calendar = this.mItems.get(i4);
                if (this.mDelegate.getMonthViewShowMode() == 1) {
                    if (i4 > this.mItems.size() - this.mNextDiff) {
                        return;
                    }
                    if (!calendar.isCurrentMonth()) {
                        i4++;
                    }
                } else if (this.mDelegate.getMonthViewShowMode() == 2 && i4 >= i) {
                    return;
                }
                draw(canvas, calendar, i4, i3, i5);
                i4++;
            }
            i3++;
            i2 = i4;
        }
    }

    private void draw(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, int i3) {
        int calendarPaddingLeft = (i3 * this.mItemWidth) + this.mDelegate.getCalendarPaddingLeft();
        int i4 = i2 * this.mItemHeight;
        onLoopStart(calendarPaddingLeft, i4);
        boolean isCalendarSelected = isCalendarSelected(calendar);
        boolean hasScheme = calendar.hasScheme();
        boolean isSelectPreCalendar = isSelectPreCalendar(calendar, i);
        boolean isSelectNextCalendar = isSelectNextCalendar(calendar, i);
        if (hasScheme) {
            if ((isCalendarSelected ? onDrawSelected(canvas, calendar, calendarPaddingLeft, i4, true, isSelectPreCalendar, isSelectNextCalendar) : false) || !isCalendarSelected) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.getSchemeThemeColor());
                onDrawScheme(canvas, calendar, calendarPaddingLeft, i4, true);
            }
        } else if (isCalendarSelected) {
            onDrawSelected(canvas, calendar, calendarPaddingLeft, i4, false, isSelectPreCalendar, isSelectNextCalendar);
        }
        onDrawText(canvas, calendar, calendarPaddingLeft, i4, hasScheme, isCalendarSelected);
    }

    protected boolean isCalendarSelected(com.haibin.calendarview.Calendar calendar) {
        return !onCalendarIntercept(calendar) && this.mDelegate.mSelectedCalendars.containsKey(calendar.toString());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.haibin.calendarview.Calendar index;
        if (this.isClick && (index = getIndex()) != null) {
            if (this.mDelegate.getMonthViewShowMode() != 1 || index.isCurrentMonth()) {
                if (onCalendarIntercept(index)) {
                    this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(index, true);
                    return;
                }
                if (!isInRange(index)) {
                    if (this.mDelegate.mCalendarMultiSelectListener != null) {
                        this.mDelegate.mCalendarMultiSelectListener.onCalendarMultiSelectOutOfRange(index);
                        return;
                    }
                    return;
                }
                java.lang.String calendar = index.toString();
                if (this.mDelegate.mSelectedCalendars.containsKey(calendar)) {
                    this.mDelegate.mSelectedCalendars.remove(calendar);
                } else {
                    if (this.mDelegate.mSelectedCalendars.size() >= this.mDelegate.getMaxMultiSelectSize()) {
                        if (this.mDelegate.mCalendarMultiSelectListener != null) {
                            this.mDelegate.mCalendarMultiSelectListener.onMultiSelectOutOfSize(index, this.mDelegate.getMaxMultiSelectSize());
                            return;
                        }
                        return;
                    }
                    this.mDelegate.mSelectedCalendars.put(calendar, index);
                }
                this.mCurrentItem = this.mItems.indexOf(index);
                if (!index.isCurrentMonth() && this.mMonthViewPager != null) {
                    int currentItem = this.mMonthViewPager.getCurrentItem();
                    this.mMonthViewPager.setCurrentItem(this.mCurrentItem < 7 ? currentItem - 1 : currentItem + 1);
                }
                if (this.mDelegate.mInnerListener != null) {
                    this.mDelegate.mInnerListener.onMonthDateSelected(index, true);
                }
                if (this.mParentLayout != null) {
                    if (index.isCurrentMonth()) {
                        this.mParentLayout.updateSelectPosition(this.mItems.indexOf(index));
                    } else {
                        this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(index, this.mDelegate.getWeekStart()));
                    }
                }
                if (this.mDelegate.mCalendarMultiSelectListener != null) {
                    this.mDelegate.mCalendarMultiSelectListener.onCalendarMultiSelect(index, this.mDelegate.mSelectedCalendars.size(), this.mDelegate.getMaxMultiSelectSize());
                }
            }
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
        return isCalendarSelected(calendar2);
    }

    protected final boolean isSelectNextCalendar(com.haibin.calendarview.Calendar calendar, int i) {
        com.haibin.calendarview.Calendar calendar2;
        if (i == this.mItems.size() - 1) {
            calendar2 = com.haibin.calendarview.CalendarUtil.getNextCalendar(calendar);
            this.mDelegate.updateCalendarScheme(calendar2);
        } else {
            calendar2 = this.mItems.get(i + 1);
        }
        return isCalendarSelected(calendar2);
    }
}
