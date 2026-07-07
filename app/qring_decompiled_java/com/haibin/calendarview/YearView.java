package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class YearView extends android.view.View {
    protected android.graphics.Paint mCurDayLunarTextPaint;
    protected android.graphics.Paint mCurDayTextPaint;
    protected android.graphics.Paint mCurMonthLunarTextPaint;
    protected android.graphics.Paint mCurMonthTextPaint;
    com.haibin.calendarview.CalendarViewDelegate mDelegate;
    protected int mItemHeight;
    protected int mItemWidth;
    java.util.List<com.haibin.calendarview.Calendar> mItems;
    protected int mLineCount;
    protected int mMonth;
    protected float mMonthTextBaseLine;
    protected android.graphics.Paint mMonthTextPaint;
    protected int mNextDiff;
    protected android.graphics.Paint mOtherMonthLunarTextPaint;
    protected android.graphics.Paint mOtherMonthTextPaint;
    protected android.graphics.Paint mSchemeLunarTextPaint;
    protected android.graphics.Paint mSchemePaint;
    protected android.graphics.Paint mSchemeTextPaint;
    protected android.graphics.Paint mSelectTextPaint;
    protected android.graphics.Paint mSelectedLunarTextPaint;
    protected android.graphics.Paint mSelectedPaint;
    protected float mTextBaseLine;
    protected int mWeekStart;
    protected float mWeekTextBaseLine;
    protected android.graphics.Paint mWeekTextPaint;
    protected int mYear;

    protected abstract void onDrawMonth(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6);

    protected abstract void onDrawScheme(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2);

    protected abstract boolean onDrawSelected(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, boolean z);

    protected abstract void onDrawText(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, boolean z, boolean z2);

    protected abstract void onDrawWeek(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, int i5);

    protected void onPreviewHook() {
    }

    public YearView(android.content.Context context) {
        this(context, null);
    }

    public YearView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurMonthTextPaint = new android.graphics.Paint();
        this.mOtherMonthTextPaint = new android.graphics.Paint();
        this.mCurMonthLunarTextPaint = new android.graphics.Paint();
        this.mSelectedLunarTextPaint = new android.graphics.Paint();
        this.mOtherMonthLunarTextPaint = new android.graphics.Paint();
        this.mSchemeLunarTextPaint = new android.graphics.Paint();
        this.mSchemePaint = new android.graphics.Paint();
        this.mSelectedPaint = new android.graphics.Paint();
        this.mSchemeTextPaint = new android.graphics.Paint();
        this.mSelectTextPaint = new android.graphics.Paint();
        this.mCurDayTextPaint = new android.graphics.Paint();
        this.mCurDayLunarTextPaint = new android.graphics.Paint();
        this.mMonthTextPaint = new android.graphics.Paint();
        this.mWeekTextPaint = new android.graphics.Paint();
        initPaint();
    }

    private void initPaint() {
        this.mCurMonthTextPaint.setAntiAlias(true);
        this.mCurMonthTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mCurMonthTextPaint.setColor(-15658735);
        this.mCurMonthTextPaint.setFakeBoldText(true);
        this.mOtherMonthTextPaint.setAntiAlias(true);
        this.mOtherMonthTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mOtherMonthTextPaint.setColor(-1973791);
        this.mOtherMonthTextPaint.setFakeBoldText(true);
        this.mCurMonthLunarTextPaint.setAntiAlias(true);
        this.mCurMonthLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSelectedLunarTextPaint.setAntiAlias(true);
        this.mSelectedLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mOtherMonthLunarTextPaint.setAntiAlias(true);
        this.mOtherMonthLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mMonthTextPaint.setAntiAlias(true);
        this.mMonthTextPaint.setFakeBoldText(true);
        this.mWeekTextPaint.setAntiAlias(true);
        this.mWeekTextPaint.setFakeBoldText(true);
        this.mWeekTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSchemeLunarTextPaint.setAntiAlias(true);
        this.mSchemeLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSchemeTextPaint.setAntiAlias(true);
        this.mSchemeTextPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSchemeTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSchemeTextPaint.setColor(-1223853);
        this.mSchemeTextPaint.setFakeBoldText(true);
        this.mSelectTextPaint.setAntiAlias(true);
        this.mSelectTextPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSelectTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSelectTextPaint.setColor(-1223853);
        this.mSelectTextPaint.setFakeBoldText(true);
        this.mSchemePaint.setAntiAlias(true);
        this.mSchemePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSchemePaint.setStrokeWidth(2.0f);
        this.mSchemePaint.setColor(-1052689);
        this.mCurDayTextPaint.setAntiAlias(true);
        this.mCurDayTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mCurDayTextPaint.setColor(-65536);
        this.mCurDayTextPaint.setFakeBoldText(true);
        this.mCurDayLunarTextPaint.setAntiAlias(true);
        this.mCurDayLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mCurDayLunarTextPaint.setColor(-65536);
        this.mCurDayLunarTextPaint.setFakeBoldText(true);
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSelectedPaint.setStrokeWidth(2.0f);
    }

    final void setup(com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
        updateStyle();
    }

    final void updateStyle() {
        if (this.mDelegate == null) {
            return;
        }
        this.mCurMonthTextPaint.setTextSize(r0.getYearViewDayTextSize());
        this.mSchemeTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mOtherMonthTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mCurDayTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mSelectTextPaint.setTextSize(this.mDelegate.getYearViewDayTextSize());
        this.mSchemeTextPaint.setColor(this.mDelegate.getYearViewSchemeTextColor());
        this.mCurMonthTextPaint.setColor(this.mDelegate.getYearViewDayTextColor());
        this.mOtherMonthTextPaint.setColor(this.mDelegate.getYearViewDayTextColor());
        this.mCurDayTextPaint.setColor(this.mDelegate.getYearViewCurDayTextColor());
        this.mSelectTextPaint.setColor(this.mDelegate.getYearViewSelectTextColor());
        this.mMonthTextPaint.setTextSize(this.mDelegate.getYearViewMonthTextSize());
        this.mMonthTextPaint.setColor(this.mDelegate.getYearViewMonthTextColor());
        this.mWeekTextPaint.setColor(this.mDelegate.getYearViewWeekTextColor());
        this.mWeekTextPaint.setTextSize(this.mDelegate.getYearViewWeekTextSize());
    }

    final void init(int i, int i2) {
        this.mYear = i;
        this.mMonth = i2;
        this.mNextDiff = com.haibin.calendarview.CalendarUtil.getMonthEndDiff(i, i2, this.mDelegate.getWeekStart());
        com.haibin.calendarview.CalendarUtil.getMonthViewStartDiff(this.mYear, this.mMonth, this.mDelegate.getWeekStart());
        this.mItems = com.haibin.calendarview.CalendarUtil.initCalendarForMonthView(this.mYear, this.mMonth, this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart());
        this.mLineCount = 6;
        addSchemesFromMap();
    }

    final void measureSize(int i, int i2) {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.mCurMonthTextPaint.getTextBounds("1", 0, 1, rect);
        int height = (rect.height() * 12) + getMonthViewTop();
        if (i2 < height) {
            i2 = height;
        }
        getLayoutParams().width = i;
        getLayoutParams().height = i2;
        this.mItemHeight = (i2 - getMonthViewTop()) / 6;
        android.graphics.Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
        android.graphics.Paint.FontMetrics fontMetrics2 = this.mMonthTextPaint.getFontMetrics();
        this.mMonthTextBaseLine = ((this.mDelegate.getYearViewMonthHeight() / 2) - fontMetrics2.descent) + ((fontMetrics2.bottom - fontMetrics2.top) / 2.0f);
        android.graphics.Paint.FontMetrics fontMetrics3 = this.mWeekTextPaint.getFontMetrics();
        this.mWeekTextBaseLine = ((this.mDelegate.getYearViewWeekHeight() / 2) - fontMetrics3.descent) + ((fontMetrics3.bottom - fontMetrics3.top) / 2.0f);
        invalidate();
    }

    private void addSchemesFromMap() {
        if (this.mDelegate.mSchemeDatesMap == null || this.mDelegate.mSchemeDatesMap.size() == 0) {
            return;
        }
        for (com.haibin.calendarview.Calendar calendar : this.mItems) {
            if (this.mDelegate.mSchemeDatesMap.containsKey(calendar.toString())) {
                com.haibin.calendarview.Calendar calendar2 = this.mDelegate.mSchemeDatesMap.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(android.text.TextUtils.isEmpty(calendar2.getScheme()) ? this.mDelegate.getSchemeText() : calendar2.getScheme());
                    calendar.setSchemeColor(calendar2.getSchemeColor());
                    calendar.setSchemes(calendar2.getSchemes());
                }
            } else {
                calendar.setScheme("");
                calendar.setSchemeColor(0);
                calendar.setSchemes(null);
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        this.mItemWidth = ((getWidth() - this.mDelegate.getYearViewMonthPaddingLeft()) - this.mDelegate.getYearViewMonthPaddingRight()) / 7;
        onPreviewHook();
        onDrawMonth(canvas);
        onDrawWeek(canvas);
        onDrawMonthView(canvas);
    }

    private void onDrawMonth(android.graphics.Canvas canvas) {
        onDrawMonth(canvas, this.mYear, this.mMonth, this.mDelegate.getYearViewMonthPaddingLeft(), this.mDelegate.getYearViewMonthPaddingTop(), getWidth() - (this.mDelegate.getYearViewMonthPaddingRight() * 2), this.mDelegate.getYearViewMonthHeight() + this.mDelegate.getYearViewMonthPaddingTop());
    }

    private int getMonthViewTop() {
        return this.mDelegate.getYearViewMonthPaddingTop() + this.mDelegate.getYearViewMonthHeight() + this.mDelegate.getYearViewMonthPaddingBottom() + this.mDelegate.getYearViewWeekHeight();
    }

    private void onDrawWeek(android.graphics.Canvas canvas) {
        if (this.mDelegate.getYearViewWeekHeight() <= 0) {
            return;
        }
        int weekStart = this.mDelegate.getWeekStart();
        if (weekStart > 0) {
            weekStart--;
        }
        int width = ((getWidth() - this.mDelegate.getYearViewMonthPaddingLeft()) - this.mDelegate.getYearViewMonthPaddingRight()) / 7;
        for (int i = 0; i < 7; i++) {
            onDrawWeek(canvas, weekStart, this.mDelegate.getYearViewMonthPaddingLeft() + (i * width), this.mDelegate.getYearViewMonthHeight() + this.mDelegate.getYearViewMonthPaddingTop() + this.mDelegate.getYearViewMonthPaddingBottom(), width, this.mDelegate.getYearViewWeekHeight());
            weekStart++;
            if (weekStart >= 7) {
                weekStart = 0;
            }
        }
    }

    private void onDrawMonthView(android.graphics.Canvas canvas) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.mLineCount) {
            int i3 = i;
            for (int i4 = 0; i4 < 7; i4++) {
                com.haibin.calendarview.Calendar calendar = this.mItems.get(i3);
                if (i3 > this.mItems.size() - this.mNextDiff) {
                    return;
                }
                if (calendar.isCurrentMonth()) {
                    draw(canvas, calendar, i2, i4, i3);
                }
                i3++;
            }
            i2++;
            i = i3;
        }
    }

    private void draw(android.graphics.Canvas canvas, com.haibin.calendarview.Calendar calendar, int i, int i2, int i3) {
        int yearViewMonthPaddingLeft = (i2 * this.mItemWidth) + this.mDelegate.getYearViewMonthPaddingLeft();
        int monthViewTop = (i * this.mItemHeight) + getMonthViewTop();
        boolean equals = calendar.equals(this.mDelegate.mSelectedCalendar);
        boolean hasScheme = calendar.hasScheme();
        if (hasScheme) {
            if ((equals ? onDrawSelected(canvas, calendar, yearViewMonthPaddingLeft, monthViewTop, true) : false) || !equals) {
                this.mSchemePaint.setColor(calendar.getSchemeColor() != 0 ? calendar.getSchemeColor() : this.mDelegate.getSchemeThemeColor());
                onDrawScheme(canvas, calendar, yearViewMonthPaddingLeft, monthViewTop);
            }
        } else if (equals) {
            onDrawSelected(canvas, calendar, yearViewMonthPaddingLeft, monthViewTop, false);
        }
        onDrawText(canvas, calendar, yearViewMonthPaddingLeft, monthViewTop, hasScheme, equals);
    }
}
