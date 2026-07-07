package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseView extends android.view.View implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    static final int TEXT_SIZE = 14;
    boolean isClick;
    protected android.graphics.Paint mCurDayLunarTextPaint;
    protected android.graphics.Paint mCurDayTextPaint;
    protected android.graphics.Paint mCurMonthLunarTextPaint;
    protected android.graphics.Paint mCurMonthTextPaint;
    int mCurrentItem;
    com.haibin.calendarview.CalendarViewDelegate mDelegate;
    protected int mItemHeight;
    protected int mItemWidth;
    protected java.util.List<com.haibin.calendarview.Calendar> mItems;
    protected android.graphics.Paint mOtherMonthLunarTextPaint;
    protected android.graphics.Paint mOtherMonthTextPaint;
    com.haibin.calendarview.CalendarLayout mParentLayout;
    protected android.graphics.Paint mSchemeLunarTextPaint;
    protected android.graphics.Paint mSchemePaint;
    protected android.graphics.Paint mSchemeTextPaint;
    protected android.graphics.Paint mSelectTextPaint;
    protected android.graphics.Paint mSelectedLunarTextPaint;
    protected android.graphics.Paint mSelectedPaint;
    protected float mTextBaseLine;
    int mWeekStartWidth;
    protected float mX;
    protected float mY;

    protected void initPaint() {
    }

    protected abstract void onDestroy();

    protected void onPreviewHook() {
    }

    abstract void updateCurrentDate();

    public BaseView(android.content.Context context) {
        this(context, null);
    }

    public BaseView(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        this.isClick = true;
        this.mCurrentItem = -1;
        initPaint(context);
    }

    private void initPaint(android.content.Context context) {
        this.mCurMonthTextPaint.setAntiAlias(true);
        this.mCurMonthTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mCurMonthTextPaint.setColor(-15658735);
        this.mCurMonthTextPaint.setFakeBoldText(true);
        this.mCurMonthTextPaint.setTextSize(com.haibin.calendarview.CalendarUtil.dipToPx(context, 14.0f));
        this.mOtherMonthTextPaint.setAntiAlias(true);
        this.mOtherMonthTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mOtherMonthTextPaint.setColor(-1973791);
        this.mOtherMonthTextPaint.setFakeBoldText(true);
        this.mOtherMonthTextPaint.setTextSize(com.haibin.calendarview.CalendarUtil.dipToPx(context, 14.0f));
        this.mCurMonthLunarTextPaint.setAntiAlias(true);
        this.mCurMonthLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSelectedLunarTextPaint.setAntiAlias(true);
        this.mSelectedLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mOtherMonthLunarTextPaint.setAntiAlias(true);
        this.mOtherMonthLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSchemeLunarTextPaint.setAntiAlias(true);
        this.mSchemeLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSchemeTextPaint.setAntiAlias(true);
        this.mSchemeTextPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSchemeTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSchemeTextPaint.setColor(-1223853);
        this.mSchemeTextPaint.setFakeBoldText(true);
        this.mSchemeTextPaint.setTextSize(com.haibin.calendarview.CalendarUtil.dipToPx(context, 14.0f));
        this.mSelectTextPaint.setAntiAlias(true);
        this.mSelectTextPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSelectTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mSelectTextPaint.setColor(-1223853);
        this.mSelectTextPaint.setFakeBoldText(true);
        this.mSelectTextPaint.setTextSize(com.haibin.calendarview.CalendarUtil.dipToPx(context, 14.0f));
        this.mSchemePaint.setAntiAlias(true);
        this.mSchemePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSchemePaint.setStrokeWidth(2.0f);
        this.mSchemePaint.setColor(-1052689);
        this.mCurDayTextPaint.setAntiAlias(true);
        this.mCurDayTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mCurDayTextPaint.setColor(-65536);
        this.mCurDayTextPaint.setFakeBoldText(true);
        this.mCurDayTextPaint.setTextSize(com.haibin.calendarview.CalendarUtil.dipToPx(context, 14.0f));
        this.mCurDayLunarTextPaint.setAntiAlias(true);
        this.mCurDayLunarTextPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mCurDayLunarTextPaint.setColor(-65536);
        this.mCurDayLunarTextPaint.setFakeBoldText(true);
        this.mCurDayLunarTextPaint.setTextSize(com.haibin.calendarview.CalendarUtil.dipToPx(context, 14.0f));
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSelectedPaint.setStrokeWidth(2.0f);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    final void setup(com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
        this.mWeekStartWidth = calendarViewDelegate.getWeekStart();
        updateStyle();
        updateItemHeight();
        initPaint();
    }

    final void updateStyle() {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null) {
            return;
        }
        this.mCurDayTextPaint.setColor(calendarViewDelegate.getCurDayTextColor());
        this.mCurDayLunarTextPaint.setColor(this.mDelegate.getCurDayLunarTextColor());
        this.mCurMonthTextPaint.setColor(this.mDelegate.getCurrentMonthTextColor());
        this.mOtherMonthTextPaint.setColor(this.mDelegate.getOtherMonthTextColor());
        this.mCurMonthLunarTextPaint.setColor(this.mDelegate.getCurrentMonthLunarTextColor());
        this.mSelectedLunarTextPaint.setColor(this.mDelegate.getSelectedLunarTextColor());
        this.mSelectTextPaint.setColor(this.mDelegate.getSelectedTextColor());
        this.mOtherMonthLunarTextPaint.setColor(this.mDelegate.getOtherMonthLunarTextColor());
        this.mSchemeLunarTextPaint.setColor(this.mDelegate.getSchemeLunarTextColor());
        this.mSchemePaint.setColor(this.mDelegate.getSchemeThemeColor());
        this.mSchemeTextPaint.setColor(this.mDelegate.getSchemeTextColor());
        this.mCurMonthTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mOtherMonthTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mCurDayTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mSchemeTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mSelectTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mCurMonthLunarTextPaint.setTextSize(this.mDelegate.getLunarTextSize());
        this.mSelectedLunarTextPaint.setTextSize(this.mDelegate.getLunarTextSize());
        this.mCurDayLunarTextPaint.setTextSize(this.mDelegate.getLunarTextSize());
        this.mOtherMonthLunarTextPaint.setTextSize(this.mDelegate.getLunarTextSize());
        this.mSchemeLunarTextPaint.setTextSize(this.mDelegate.getLunarTextSize());
        this.mSelectedPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSelectedPaint.setColor(this.mDelegate.getSelectedThemeColor());
    }

    void updateItemHeight() {
        this.mItemHeight = this.mDelegate.getCalendarItemHeight();
        android.graphics.Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
    }

    final void removeSchemes() {
        for (com.haibin.calendarview.Calendar calendar : this.mItems) {
            calendar.setScheme("");
            calendar.setSchemeColor(0);
            calendar.setSchemes(null);
        }
    }

    final void addSchemesFromMap() {
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
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
            this.isClick = true;
        } else if (action != 1) {
            if (action == 2 && this.isClick) {
                this.isClick = java.lang.Math.abs(motionEvent.getY() - this.mY) <= 50.0f;
            }
        } else {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    protected boolean isSelected(com.haibin.calendarview.Calendar calendar) {
        java.util.List<com.haibin.calendarview.Calendar> list = this.mItems;
        return list != null && list.indexOf(calendar) == this.mCurrentItem;
    }

    final void update() {
        if (this.mDelegate.mSchemeDatesMap == null || this.mDelegate.mSchemeDatesMap.size() == 0) {
            removeSchemes();
            invalidate();
        } else {
            addSchemesFromMap();
            invalidate();
        }
    }

    protected final boolean onCalendarIntercept(com.haibin.calendarview.Calendar calendar) {
        return this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(calendar);
    }

    protected final boolean isInRange(com.haibin.calendarview.Calendar calendar) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        return calendarViewDelegate != null && com.haibin.calendarview.CalendarUtil.isCalendarInRange(calendar, calendarViewDelegate);
    }

    protected int getWeekStartWith() {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            return calendarViewDelegate.getWeekStart();
        }
        return 1;
    }

    protected int getCalendarPaddingLeft() {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            return calendarViewDelegate.getCalendarPaddingLeft();
        }
        return 0;
    }

    protected int getCalendarPaddingRight() {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            return calendarViewDelegate.getCalendarPaddingRight();
        }
        return 0;
    }
}
