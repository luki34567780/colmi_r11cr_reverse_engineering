package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class SimpleMonthView extends com.haibin.calendarview.MonthView {
    private int mRadius;

    public SimpleMonthView(android.content.Context context) {
        super(context);
    }

    @Override // com.haibin.calendarview.BaseMonthView, com.haibin.calendarview.BaseView
    protected void onPreviewHook() {
        this.mRadius = (java.lang.Math.min(this.mItemWidth, this.mItemHeight) / 5) * 2;
    }

    @Override // com.haibin.calendarview.MonthView
    protected boolean onDrawSelected(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int x, int y, boolean hasScheme) {
        int i = x + (this.mItemWidth / 2);
        int i2 = y + (this.mItemHeight / 2);
        this.mSelectedPaint.setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(i, i2, this.mRadius + 2, this.mSelectedPaint);
        return true;
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawScheme(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int x, int y) {
        canvas.drawCircle(x + (this.mItemWidth / 2), y + (this.mItemHeight / 2), this.mRadius, this.mSchemePaint);
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawText(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int x, int y, boolean hasScheme, boolean isSelected) {
        android.graphics.Paint paint;
        android.graphics.Paint paint2;
        float f = this.mTextBaseLine + y;
        int i = x + (this.mItemWidth / 2);
        if (isSelected) {
            canvas.drawText(java.lang.String.valueOf(calendar.getDay()), i, f, this.mSelectTextPaint);
            return;
        }
        if (hasScheme) {
            java.lang.String valueOf = java.lang.String.valueOf(calendar.getDay());
            float f2 = i;
            if (calendar.isCurrentDay()) {
                paint2 = this.mCurDayTextPaint;
            } else {
                paint2 = calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf, f2, f, paint2);
            return;
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(calendar.getDay());
        float f3 = i;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(valueOf2, f3, f, paint);
    }
}
