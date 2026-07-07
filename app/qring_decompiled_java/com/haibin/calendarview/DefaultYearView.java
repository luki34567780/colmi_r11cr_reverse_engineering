package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public class DefaultYearView extends com.haibin.calendarview.YearView {
    private int mTextPadding;

    @Override // com.haibin.calendarview.YearView
    protected void onDrawScheme(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2) {
    }

    @Override // com.haibin.calendarview.YearView
    protected boolean onDrawSelected(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, boolean z) {
        return false;
    }

    public DefaultYearView(android.content.Context context) {
        super(context);
        this.mTextPadding = com.haibin.calendarview.CalendarUtil.dipToPx(context, 3.0f);
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawMonth(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6) {
        canvas.drawText(getContext().getResources().getStringArray(com.haibin.calendarview.R.array.month_string_array)[i2 - 1], (i3 + (this.mItemWidth / 2)) - this.mTextPadding, i4 + this.mMonthTextBaseLine, this.mMonthTextPaint);
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawWeek(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        canvas.drawText(getContext().getResources().getStringArray(com.haibin.calendarview.R.array.year_view_week_string_array)[i], i2 + (i4 / 2), i3 + this.mWeekTextBaseLine, this.mWeekTextPaint);
    }

    @Override // com.haibin.calendarview.YearView
    protected void onDrawText(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, boolean z, boolean z2) {
        android.graphics.Paint paint;
        android.graphics.Paint paint2;
        float f = this.mTextBaseLine + i2;
        int i3 = i + (this.mItemWidth / 2);
        if (z2) {
            canvas.drawText(java.lang.String.valueOf(calendar.getDay()), i3, f, z ? this.mSchemeTextPaint : this.mSelectTextPaint);
            return;
        }
        if (z) {
            java.lang.String valueOf = java.lang.String.valueOf(calendar.getDay());
            float f2 = i3;
            if (calendar.isCurrentDay()) {
                paint2 = this.mCurDayTextPaint;
            } else {
                paint2 = calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf, f2, f, paint2);
            return;
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(calendar.getDay());
        float f3 = i3;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(valueOf2, f3, f, paint);
    }
}
