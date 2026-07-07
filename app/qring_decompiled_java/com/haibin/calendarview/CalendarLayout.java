package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public class CalendarLayout extends android.widget.LinearLayout {
    private static final int ACTIVE_POINTER = 1;
    private static final int CALENDAR_SHOW_MODE_BOTH_MONTH_WEEK_VIEW = 0;
    private static final int CALENDAR_SHOW_MODE_ONLY_MONTH_VIEW = 2;
    private static final int CALENDAR_SHOW_MODE_ONLY_WEEK_VIEW = 1;
    private static final int GESTURE_MODE_DEFAULT = 0;
    private static final int GESTURE_MODE_DISABLED = 2;
    private static final int INVALID_POINTER = -1;
    private static final int STATUS_EXPAND = 0;
    private static final int STATUS_SHRINK = 1;
    private float downY;
    private boolean isAnimating;
    private boolean isWeekView;
    private int mActivePointerId;
    private int mCalendarShowMode;
    com.haibin.calendarview.CalendarView mCalendarView;
    android.view.ViewGroup mContentView;
    private int mContentViewId;
    private int mContentViewTranslateY;
    private int mDefaultStatus;
    private com.haibin.calendarview.CalendarViewDelegate mDelegate;
    private int mGestureMode;
    private int mItemHeight;
    private float mLastX;
    private float mLastY;
    private int mMaximumVelocity;
    com.haibin.calendarview.MonthViewPager mMonthView;
    private android.view.VelocityTracker mVelocityTracker;
    private int mViewPagerTranslateY;
    com.haibin.calendarview.WeekBar mWeekBar;
    com.haibin.calendarview.WeekViewPager mWeekPager;
    com.haibin.calendarview.YearViewPager mYearView;

    public interface CalendarScrollView {
        boolean isScrollToTop();
    }

    public CalendarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mViewPagerTranslateY = 0;
        this.isAnimating = false;
        setOrientation(1);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.haibin.calendarview.R.styleable.CalendarLayout);
        this.mContentViewId = obtainStyledAttributes.getResourceId(com.haibin.calendarview.R.styleable.CalendarLayout_calendar_content_view_id, 0);
        this.mDefaultStatus = obtainStyledAttributes.getInt(com.haibin.calendarview.R.styleable.CalendarLayout_default_status, 0);
        this.mCalendarShowMode = obtainStyledAttributes.getInt(com.haibin.calendarview.R.styleable.CalendarLayout_calendar_show_mode, 0);
        this.mGestureMode = obtainStyledAttributes.getInt(com.haibin.calendarview.R.styleable.CalendarLayout_gesture_mode, 0);
        obtainStyledAttributes.recycle();
        this.mVelocityTracker = android.view.VelocityTracker.obtain();
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        viewConfiguration.getScaledTouchSlop();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    final void setup(com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
        this.mItemHeight = calendarViewDelegate.getCalendarItemHeight();
        initCalendarPosition(calendarViewDelegate.mSelectedCalendar.isAvailable() ? calendarViewDelegate.mSelectedCalendar : calendarViewDelegate.createCurrentDate());
        updateContentViewTranslateY();
    }

    private void initCalendarPosition(com.haibin.calendarview.Calendar calendar) {
        updateSelectPosition((com.haibin.calendarview.CalendarUtil.getMonthViewStartDiff(calendar, this.mDelegate.getWeekStart()) + calendar.getDay()) - 1);
    }

    final void updateSelectPosition(int i) {
        this.mViewPagerTranslateY = (((i + 7) / 7) - 1) * this.mItemHeight;
    }

    final void updateSelectWeek(int i) {
        this.mViewPagerTranslateY = (i - 1) * this.mItemHeight;
    }

    void updateContentViewTranslateY() {
        android.view.ViewGroup viewGroup;
        com.haibin.calendarview.Calendar calendar = this.mDelegate.mIndexCalendar;
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mContentViewTranslateY = this.mItemHeight * 5;
        } else {
            this.mContentViewTranslateY = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(calendar.getYear(), calendar.getMonth(), this.mItemHeight, this.mDelegate.getWeekStart()) - this.mItemHeight;
        }
        if (this.mWeekPager.getVisibility() != 0 || (viewGroup = this.mContentView) == null) {
            return;
        }
        viewGroup.setTranslationY(-this.mContentViewTranslateY);
    }

    final void updateCalendarItemHeight() {
        this.mItemHeight = this.mDelegate.getCalendarItemHeight();
        if (this.mContentView == null) {
            return;
        }
        com.haibin.calendarview.Calendar calendar = this.mDelegate.mIndexCalendar;
        updateSelectWeek(com.haibin.calendarview.CalendarUtil.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mContentViewTranslateY = this.mItemHeight * 5;
        } else {
            this.mContentViewTranslateY = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(calendar.getYear(), calendar.getMonth(), this.mItemHeight, this.mDelegate.getWeekStart()) - this.mItemHeight;
        }
        translationViewPager();
        if (this.mWeekPager.getVisibility() == 0) {
            this.mContentView.setTranslationY(-this.mContentViewTranslateY);
        }
    }

    public void hideCalendarView() {
        com.haibin.calendarview.CalendarView calendarView = this.mCalendarView;
        if (calendarView == null) {
            return;
        }
        calendarView.setVisibility(8);
        if (!isExpand()) {
            expand(0);
        }
        requestLayout();
    }

    public void showCalendarView() {
        this.mCalendarView.setVisibility(0);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r0 != 6) goto L86;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.haibin.calendarview.CalendarLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.haibin.calendarview.CalendarView calendarView;
        android.view.ViewGroup viewGroup;
        if (this.isAnimating) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.mGestureMode == 2) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.mYearView == null || (calendarView = this.mCalendarView) == null || calendarView.getVisibility() == 8 || (viewGroup = this.mContentView) == null || viewGroup.getVisibility() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int i = this.mCalendarShowMode;
        if (i == 2 || i == 1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.mYearView.getVisibility() == 0 || this.mDelegate.isShowYearSelectedLayout) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        if (action == 2 && y - this.mLastY > 0.0f && this.mContentView.getTranslationY() == (-this.mContentViewTranslateY) && isScrollTop()) {
            requestDisallowInterceptTouchEvent(false);
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.haibin.calendarview.CalendarView calendarView;
        android.view.ViewGroup viewGroup;
        if (this.isAnimating) {
            return true;
        }
        if (this.mGestureMode == 2) {
            return false;
        }
        if (this.mYearView == null || (calendarView = this.mCalendarView) == null || calendarView.getVisibility() == 8 || (viewGroup = this.mContentView) == null || viewGroup.getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = this.mCalendarShowMode;
        if (i == 2 || i == 1) {
            return false;
        }
        if (this.mYearView.getVisibility() == 0 || this.mDelegate.isShowYearSelectedLayout) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        if (action == 0) {
            this.mActivePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.downY = y;
            this.mLastY = y;
            this.mLastX = x;
        } else if (action == 2) {
            float f = y - this.mLastY;
            float f2 = x - this.mLastX;
            if (f < 0.0f && this.mContentView.getTranslationY() == (-this.mContentViewTranslateY)) {
                return false;
            }
            if (f > 0.0f && this.mContentView.getTranslationY() == (-this.mContentViewTranslateY) && y >= this.mDelegate.getCalendarItemHeight() + this.mDelegate.getWeekBarHeight() && !isScrollTop()) {
                return false;
            }
            if (f > 0.0f && this.mContentView.getTranslationY() == 0.0f && y >= com.haibin.calendarview.CalendarUtil.dipToPx(getContext(), 98.0f)) {
                return false;
            }
            if (java.lang.Math.abs(f) > java.lang.Math.abs(f2) && ((f > 0.0f && this.mContentView.getTranslationY() <= 0.0f) || (f < 0.0f && this.mContentView.getTranslationY() >= (-this.mContentViewTranslateY)))) {
                this.mLastY = y;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private int getPointerIndex(android.view.MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            this.mActivePointerId = -1;
        }
        return findPointerIndex;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mContentView == null || this.mCalendarView == null) {
            super.onMeasure(i, i2);
            return;
        }
        int year = this.mDelegate.mIndexCalendar.getYear();
        int month = this.mDelegate.mIndexCalendar.getMonth();
        int dipToPx = com.haibin.calendarview.CalendarUtil.dipToPx(getContext(), 1.0f) + this.mDelegate.getWeekBarHeight();
        int monthViewHeight = com.haibin.calendarview.CalendarUtil.getMonthViewHeight(year, month, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode()) + dipToPx;
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (this.mDelegate.isFullScreenCalendar()) {
            super.onMeasure(i, i2);
            this.mContentView.measure(i, android.view.View.MeasureSpec.makeMeasureSpec((size - dipToPx) - this.mDelegate.getCalendarItemHeight(), 1073741824));
            android.view.ViewGroup viewGroup = this.mContentView;
            viewGroup.layout(viewGroup.getLeft(), this.mContentView.getTop(), this.mContentView.getRight(), this.mContentView.getBottom());
            return;
        }
        if (monthViewHeight >= size && this.mMonthView.getHeight() > 0) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(monthViewHeight + dipToPx + this.mDelegate.getWeekBarHeight(), 1073741824);
            size = monthViewHeight;
        } else if (monthViewHeight < size && this.mMonthView.getHeight() > 0) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        if (this.mCalendarShowMode == 2 || this.mCalendarView.getVisibility() == 8) {
            monthViewHeight = this.mCalendarView.getVisibility() == 8 ? 0 : this.mCalendarView.getHeight();
        } else if (this.mGestureMode == 2 && !this.isAnimating) {
            if (!isExpand()) {
                size -= dipToPx;
                monthViewHeight = this.mItemHeight;
            }
        } else {
            size -= dipToPx;
            monthViewHeight = this.mItemHeight;
        }
        super.onMeasure(i, i2);
        this.mContentView.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(size - monthViewHeight, 1073741824));
        android.view.ViewGroup viewGroup2 = this.mContentView;
        viewGroup2.layout(viewGroup2.getLeft(), this.mContentView.getTop(), this.mContentView.getRight(), this.mContentView.getBottom());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mMonthView = (com.haibin.calendarview.MonthViewPager) findViewById(com.haibin.calendarview.R.id.vp_month);
        this.mWeekPager = (com.haibin.calendarview.WeekViewPager) findViewById(com.haibin.calendarview.R.id.vp_week);
        if (getChildCount() > 0) {
            this.mCalendarView = (com.haibin.calendarview.CalendarView) getChildAt(0);
        }
        this.mContentView = (android.view.ViewGroup) findViewById(this.mContentViewId);
        this.mYearView = (com.haibin.calendarview.YearViewPager) findViewById(com.haibin.calendarview.R.id.selectLayout);
    }

    private void translationViewPager() {
        this.mMonthView.setTranslationY(this.mViewPagerTranslateY * ((this.mContentView.getTranslationY() * 1.0f) / this.mContentViewTranslateY));
    }

    public void setModeBothMonthWeekView() {
        this.mCalendarShowMode = 0;
        requestLayout();
    }

    public void setModeOnlyWeekView() {
        this.mCalendarShowMode = 1;
        requestLayout();
    }

    public void setModeOnlyMonthView() {
        this.mCalendarShowMode = 2;
        requestLayout();
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putBoolean("isExpand", isExpand());
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        android.os.Parcelable parcelable2 = bundle.getParcelable("super");
        if (bundle.getBoolean("isExpand")) {
            post(new java.lang.Runnable() { // from class: com.haibin.calendarview.CalendarLayout.1
                @Override // java.lang.Runnable
                public void run() {
                    com.haibin.calendarview.CalendarLayout.this.expand(0);
                }
            });
        } else {
            post(new java.lang.Runnable() { // from class: com.haibin.calendarview.CalendarLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    com.haibin.calendarview.CalendarLayout.this.shrink(0);
                }
            });
        }
        super.onRestoreInstanceState(parcelable2);
    }

    public final boolean isExpand() {
        return this.mMonthView.getVisibility() == 0;
    }

    public boolean expand() {
        return expand(240);
    }

    public boolean expand(int i) {
        if (this.isAnimating || this.mCalendarShowMode == 1 || this.mContentView == null) {
            return false;
        }
        if (this.mMonthView.getVisibility() != 0) {
            this.mWeekPager.setVisibility(8);
            onShowMonthView();
            this.isWeekView = false;
            this.mMonthView.setVisibility(0);
        }
        android.view.ViewGroup viewGroup = this.mContentView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), 0.0f);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.haibin.calendarview.CalendarLayout.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.haibin.calendarview.CalendarLayout.this.mMonthView.setTranslationY(com.haibin.calendarview.CalendarLayout.this.mViewPagerTranslateY * ((((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / com.haibin.calendarview.CalendarLayout.this.mContentViewTranslateY));
                com.haibin.calendarview.CalendarLayout.this.isAnimating = true;
            }
        });
        ofFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.haibin.calendarview.CalendarLayout.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                com.haibin.calendarview.CalendarLayout.this.isAnimating = false;
                if (com.haibin.calendarview.CalendarLayout.this.mGestureMode == 2) {
                    com.haibin.calendarview.CalendarLayout.this.requestLayout();
                }
                com.haibin.calendarview.CalendarLayout.this.hideWeek(true);
                if (com.haibin.calendarview.CalendarLayout.this.mDelegate.mViewChangeListener != null && com.haibin.calendarview.CalendarLayout.this.isWeekView) {
                    com.haibin.calendarview.CalendarLayout.this.mDelegate.mViewChangeListener.onViewChange(true);
                }
                com.haibin.calendarview.CalendarLayout.this.isWeekView = false;
            }
        });
        ofFloat.start();
        return true;
    }

    public boolean shrink() {
        return shrink(240);
    }

    public boolean shrink(int i) {
        android.view.ViewGroup viewGroup;
        if (this.mGestureMode == 2) {
            requestLayout();
        }
        if (this.isAnimating || (viewGroup = this.mContentView) == null) {
            return false;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), -this.mContentViewTranslateY);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.haibin.calendarview.CalendarLayout.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.haibin.calendarview.CalendarLayout.this.mMonthView.setTranslationY(com.haibin.calendarview.CalendarLayout.this.mViewPagerTranslateY * ((((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / com.haibin.calendarview.CalendarLayout.this.mContentViewTranslateY));
                com.haibin.calendarview.CalendarLayout.this.isAnimating = true;
            }
        });
        ofFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.haibin.calendarview.CalendarLayout.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                com.haibin.calendarview.CalendarLayout.this.isAnimating = false;
                com.haibin.calendarview.CalendarLayout.this.showWeek();
                com.haibin.calendarview.CalendarLayout.this.isWeekView = true;
            }
        });
        ofFloat.start();
        return true;
    }

    final void initStatus() {
        if ((this.mDefaultStatus == 1 || this.mCalendarShowMode == 1) && this.mCalendarShowMode != 2) {
            if (this.mContentView == null) {
                this.mWeekPager.setVisibility(0);
                this.mMonthView.setVisibility(8);
                return;
            } else {
                post(new java.lang.Runnable() { // from class: com.haibin.calendarview.CalendarLayout.7
                    @Override // java.lang.Runnable
                    public void run() {
                        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.haibin.calendarview.CalendarLayout.this.mContentView, "translationY", com.haibin.calendarview.CalendarLayout.this.mContentView.getTranslationY(), -com.haibin.calendarview.CalendarLayout.this.mContentViewTranslateY);
                        ofFloat.setDuration(0L);
                        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.haibin.calendarview.CalendarLayout.7.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                                com.haibin.calendarview.CalendarLayout.this.mMonthView.setTranslationY(com.haibin.calendarview.CalendarLayout.this.mViewPagerTranslateY * ((((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / com.haibin.calendarview.CalendarLayout.this.mContentViewTranslateY));
                                com.haibin.calendarview.CalendarLayout.this.isAnimating = true;
                            }
                        });
                        ofFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.haibin.calendarview.CalendarLayout.7.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(android.animation.Animator animator) {
                                super.onAnimationEnd(animator);
                                com.haibin.calendarview.CalendarLayout.this.isAnimating = false;
                                com.haibin.calendarview.CalendarLayout.this.isWeekView = true;
                                com.haibin.calendarview.CalendarLayout.this.showWeek();
                                if (com.haibin.calendarview.CalendarLayout.this.mDelegate == null || com.haibin.calendarview.CalendarLayout.this.mDelegate.mViewChangeListener == null) {
                                    return;
                                }
                                com.haibin.calendarview.CalendarLayout.this.mDelegate.mViewChangeListener.onViewChange(false);
                            }
                        });
                        ofFloat.start();
                    }
                });
                return;
            }
        }
        if (this.mDelegate.mViewChangeListener == null) {
            return;
        }
        post(new java.lang.Runnable() { // from class: com.haibin.calendarview.CalendarLayout.8
            @Override // java.lang.Runnable
            public void run() {
                com.haibin.calendarview.CalendarLayout.this.mDelegate.mViewChangeListener.onViewChange(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideWeek(boolean z) {
        if (z) {
            onShowMonthView();
        }
        this.mWeekPager.setVisibility(8);
        this.mMonthView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWeek() {
        onShowWeekView();
        com.haibin.calendarview.WeekViewPager weekViewPager = this.mWeekPager;
        if (weekViewPager != null && weekViewPager.getAdapter() != null) {
            this.mWeekPager.getAdapter().notifyDataSetChanged();
            this.mWeekPager.setVisibility(0);
        }
        this.mMonthView.setVisibility(4);
    }

    private void onShowWeekView() {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate;
        if (this.mWeekPager.getVisibility() == 0 || (calendarViewDelegate = this.mDelegate) == null || calendarViewDelegate.mViewChangeListener == null || this.isWeekView) {
            return;
        }
        this.mDelegate.mViewChangeListener.onViewChange(false);
    }

    private void onShowMonthView() {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate;
        if (this.mMonthView.getVisibility() == 0 || (calendarViewDelegate = this.mDelegate) == null || calendarViewDelegate.mViewChangeListener == null || !this.isWeekView) {
            return;
        }
        this.mDelegate.mViewChangeListener.onViewChange(true);
    }

    protected boolean isScrollTop() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.mContentView;
        if (recyclerView instanceof com.haibin.calendarview.CalendarLayout.CalendarScrollView) {
            return ((com.haibin.calendarview.CalendarLayout.CalendarScrollView) recyclerView).isScrollToTop();
        }
        if (recyclerView instanceof androidx.recyclerview.widget.RecyclerView) {
            return recyclerView.computeVerticalScrollOffset() == 0;
        }
        if (!(recyclerView instanceof android.widget.AbsListView)) {
            return recyclerView.getScrollY() == 0;
        }
        android.widget.AbsListView absListView = (android.widget.AbsListView) recyclerView;
        if (absListView.getFirstVisiblePosition() == 0) {
            return absListView.getChildAt(0).getTop() == 0;
        }
        return false;
    }

    final void hideContentView() {
        android.view.ViewGroup viewGroup = this.mContentView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.animate().translationY(getHeight() - this.mMonthView.getHeight()).setDuration(220L).setInterpolator(new android.view.animation.LinearInterpolator()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.haibin.calendarview.CalendarLayout.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                com.haibin.calendarview.CalendarLayout.this.mContentView.setVisibility(4);
                com.haibin.calendarview.CalendarLayout.this.mContentView.clearAnimation();
            }
        });
    }

    final void showContentView() {
        android.view.ViewGroup viewGroup = this.mContentView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTranslationY(getHeight() - this.mMonthView.getHeight());
        this.mContentView.setVisibility(0);
        this.mContentView.animate().translationY(0.0f).setDuration(180L).setInterpolator(new android.view.animation.LinearInterpolator()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.haibin.calendarview.CalendarLayout.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
    }

    private int getCalendarViewHeight() {
        int weekBarHeight;
        int calendarItemHeight;
        if (this.mMonthView.getVisibility() == 0) {
            weekBarHeight = this.mDelegate.getWeekBarHeight();
            calendarItemHeight = this.mMonthView.getHeight();
        } else {
            weekBarHeight = this.mDelegate.getWeekBarHeight();
            calendarItemHeight = this.mDelegate.getCalendarItemHeight();
        }
        return weekBarHeight + calendarItemHeight;
    }
}
