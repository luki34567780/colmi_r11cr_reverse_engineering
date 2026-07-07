package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public final class DefaultMonthView extends com.haibin.calendarview.MonthView {
    private int mPadding;
    private float mRadio;
    private float mSchemeBaseLine;
    private android.graphics.Paint mSchemeBasicPaint;
    private android.graphics.Paint mTextPaint;

    public DefaultMonthView(android.content.Context context) {
        super(context);
        this.mTextPaint = new android.graphics.Paint();
        this.mSchemeBasicPaint = new android.graphics.Paint();
        this.mTextPaint.setTextSize(com.haibin.calendarview.CalendarUtil.dipToPx(context, 8.0f));
        this.mTextPaint.setColor(-1);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setFakeBoldText(true);
        this.mSchemeBasicPaint.setAntiAlias(true);
        this.mSchemeBasicPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSchemeBasicPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSchemeBasicPaint.setColor(-1223853);
        this.mSchemeBasicPaint.setFakeBoldText(true);
        this.mRadio = com.haibin.calendarview.CalendarUtil.dipToPx(getContext(), 7.0f);
        this.mPadding = com.haibin.calendarview.CalendarUtil.dipToPx(getContext(), 4.0f);
        android.graphics.Paint.FontMetrics fontMetrics = this.mSchemeBasicPaint.getFontMetrics();
        this.mSchemeBaseLine = (this.mRadio - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + com.haibin.calendarview.CalendarUtil.dipToPx(getContext(), 1.0f);
    }

    @Override // com.haibin.calendarview.MonthView
    protected boolean onDrawSelected(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, boolean z) {
        this.mSelectedPaint.setStyle(android.graphics.Paint.Style.FILL);
        int i3 = this.mPadding;
        canvas.drawRect(i + i3, i3 + i2, (i + this.mItemWidth) - this.mPadding, (i2 + this.mItemHeight) - this.mPadding, this.mSelectedPaint);
        return true;
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawScheme(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2) {
        this.mSchemeBasicPaint.setColor(calendar.getSchemeColor());
        int i3 = this.mItemWidth + i;
        int i4 = this.mPadding;
        float f = this.mRadio;
        canvas.drawCircle((i3 - i4) - (f / 2.0f), i4 + i2 + f, f, this.mSchemeBasicPaint);
        canvas.drawText(calendar.getScheme(), (((i + this.mItemWidth) - this.mPadding) - (this.mRadio / 2.0f)) - (getTextWidth(calendar.getScheme()) / 2.0f), i2 + this.mPadding + this.mSchemeBaseLine, this.mTextPaint);
    }

    private float getTextWidth(java.lang.String str) {
        return this.mTextPaint.measureText(str);
    }

    @Override // com.haibin.calendarview.MonthView
    protected void onDrawText(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, boolean z, boolean z2) {
        android.graphics.Paint paint;
        android.graphics.Paint paint2;
        android.graphics.Paint paint3;
        int i3 = i + (this.mItemWidth / 2);
        int i4 = i2 - (this.mItemHeight / 6);
        if (z2) {
            float f = i3;
            canvas.drawText(java.lang.String.valueOf(calendar.getDay()), f, this.mTextBaseLine + i4, this.mSelectTextPaint);
            canvas.drawText(calendar.getLunar(), f, this.mTextBaseLine + i2 + (this.mItemHeight / 10), this.mSelectedLunarTextPaint);
            return;
        }
        if (z) {
            java.lang.String valueOf = java.lang.String.valueOf(calendar.getDay());
            float f2 = i3;
            float f3 = this.mTextBaseLine + i4;
            if (calendar.isCurrentDay()) {
                paint3 = this.mCurDayTextPaint;
            } else {
                paint3 = calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf, f2, f3, paint3);
            canvas.drawText(calendar.getLunar(), f2, this.mTextBaseLine + i2 + (this.mItemHeight / 10), calendar.isCurrentDay() ? this.mCurDayLunarTextPaint : this.mSchemeLunarTextPaint);
            return;
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(calendar.getDay());
        float f4 = i3;
        float f5 = this.mTextBaseLine + i4;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(valueOf2, f4, f5, paint);
        java.lang.String lunar = calendar.getLunar();
        float f6 = this.mTextBaseLine + i2 + (this.mItemHeight / 10);
        if (calendar.isCurrentDay()) {
            paint2 = this.mCurDayLunarTextPaint;
        } else {
            paint2 = calendar.isCurrentMonth() ? this.mCurMonthLunarTextPaint : this.mOtherMonthLunarTextPaint;
        }
        canvas.drawText(lunar, f4, f6, paint2);
    }
}
