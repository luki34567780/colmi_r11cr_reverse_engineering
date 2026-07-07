package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class WeekView extends com.haibin.calendarview.BaseWeekView {
    protected abstract void onDrawScheme(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i);

    protected abstract boolean onDrawSelected(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, boolean z);

    protected abstract void onDrawText(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, boolean z, boolean z2);

    public WeekView(android.content.Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.mItems.size() == 0) {
            return;
        }
        this.mItemWidth = ((getWidth() - this.mDelegate.getCalendarPaddingLeft()) - this.mDelegate.getCalendarPaddingRight()) / 7;
        onPreviewHook();
        int i = 0;
        while (i < this.mItems.size()) {
            int calendarPaddingLeft = (this.mItemWidth * i) + this.mDelegate.getCalendarPaddingLeft();
            onLoopStart(calendarPaddingLeft);
            com.haibin.calendarview.Calendar calendar = this.mItems.get(i);
            boolean z = i == this.mCurrentItem;
            boolean hasScheme = calendar.hasScheme();
            if (hasScheme) {
                if ((z ? onDrawSelected(canvas, calendar, calendarPaddingLeft, true) : false) || !z) {
                    this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.getSchemeThemeColor());
                    onDrawScheme(canvas, calendar, calendarPaddingLeft);
                }
            } else if (z) {
                onDrawSelected(canvas, calendar, calendarPaddingLeft, false);
            }
            onDrawText(canvas, calendar, calendarPaddingLeft, hasScheme, z);
            i++;
        }
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
                if (this.mDelegate.mCalendarSelectListener != null) {
                    this.mDelegate.mCalendarSelectListener.onCalendarOutOfRange(index);
                    return;
                }
                return;
            }
            this.mCurrentItem = this.mItems.indexOf(index);
            if (this.mDelegate.mInnerListener != null) {
                this.mDelegate.mInnerListener.onWeekDateSelected(index, true);
            }
            if (this.mParentLayout != null) {
                this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(index, this.mDelegate.getWeekStart()));
            }
            if (this.mDelegate.mCalendarSelectListener != null) {
                this.mDelegate.mCalendarSelectListener.onCalendarSelect(index, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.haibin.calendarview.Calendar index;
        if (this.mDelegate.mCalendarLongClickListener == null || !this.isClick || (index = getIndex()) == null) {
            return false;
        }
        if (onCalendarIntercept(index)) {
            this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(index, true);
            return true;
        }
        if (!isInRange(index)) {
            if (this.mDelegate.mCalendarLongClickListener != null) {
                this.mDelegate.mCalendarLongClickListener.onCalendarLongClickOutOfRange(index);
            }
            return true;
        }
        if (this.mDelegate.isPreventLongPressedSelected()) {
            if (this.mDelegate.mCalendarLongClickListener != null) {
                this.mDelegate.mCalendarLongClickListener.onCalendarLongClick(index);
            }
            return true;
        }
        this.mCurrentItem = this.mItems.indexOf(index);
        this.mDelegate.mIndexCalendar = this.mDelegate.mSelectedCalendar;
        if (this.mDelegate.mInnerListener != null) {
            this.mDelegate.mInnerListener.onWeekDateSelected(index, true);
        }
        if (this.mParentLayout != null) {
            this.mParentLayout.updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(index, this.mDelegate.getWeekStart()));
        }
        if (this.mDelegate.mCalendarSelectListener != null) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(index, true);
        }
        if (this.mDelegate.mCalendarLongClickListener != null) {
            this.mDelegate.mCalendarLongClickListener.onCalendarLongClick(index);
        }
        invalidate();
        return true;
    }
}
