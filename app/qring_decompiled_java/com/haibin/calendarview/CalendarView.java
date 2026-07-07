package com.haibin.calendarview;

/* loaded from: /tmp/dex/classes2.dex */
public class CalendarView extends android.widget.FrameLayout {
    private final com.haibin.calendarview.CalendarViewDelegate mDelegate;
    private com.haibin.calendarview.MonthViewPager mMonthPager;
    com.haibin.calendarview.CalendarLayout mParentLayout;
    private com.haibin.calendarview.WeekBar mWeekBar;
    private android.view.View mWeekLine;
    private com.haibin.calendarview.WeekViewPager mWeekPager;
    private com.haibin.calendarview.YearViewPager mYearViewPager;

    public interface OnCalendarInterceptListener {
        boolean onCalendarIntercept(com.haibin.calendarview.Calendar calendar);

        void onCalendarInterceptClick(com.haibin.calendarview.Calendar calendar, boolean z);
    }

    public interface OnCalendarLongClickListener {
        void onCalendarLongClick(com.haibin.calendarview.Calendar calendar);

        void onCalendarLongClickOutOfRange(com.haibin.calendarview.Calendar calendar);
    }

    public interface OnCalendarMultiSelectListener {
        void onCalendarMultiSelect(com.haibin.calendarview.Calendar calendar, int i, int i2);

        void onCalendarMultiSelectOutOfRange(com.haibin.calendarview.Calendar calendar);

        void onMultiSelectOutOfSize(com.haibin.calendarview.Calendar calendar, int i);
    }

    public interface OnCalendarRangeSelectListener {
        void onCalendarRangeSelect(com.haibin.calendarview.Calendar calendar, boolean z);

        void onCalendarSelectOutOfRange(com.haibin.calendarview.Calendar calendar);

        void onSelectOutOfRange(com.haibin.calendarview.Calendar calendar, boolean z);
    }

    public interface OnCalendarSelectListener {
        void onCalendarOutOfRange(com.haibin.calendarview.Calendar calendar);

        void onCalendarSelect(com.haibin.calendarview.Calendar calendar, boolean z);
    }

    public interface OnClickCalendarPaddingListener {
        void onClickCalendarPadding(float f, float f2, boolean z, com.haibin.calendarview.Calendar calendar, java.lang.Object obj);
    }

    interface OnInnerDateSelectedListener {
        void onMonthDateSelected(com.haibin.calendarview.Calendar calendar, boolean z);

        void onWeekDateSelected(com.haibin.calendarview.Calendar calendar, boolean z);
    }

    public interface OnMonthChangeListener {
        void onMonthChange(int i, int i2);
    }

    public interface OnViewChangeListener {
        void onViewChange(boolean z);
    }

    public interface OnWeekChangeListener {
        void onWeekChange(java.util.List<com.haibin.calendarview.Calendar> list);
    }

    public interface OnYearChangeListener {
        void onYearChange(int i);
    }

    public interface OnYearViewChangeListener {
        void onYearViewChange(boolean z);
    }

    public CalendarView(android.content.Context context) {
        this(context, null);
    }

    public CalendarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDelegate = new com.haibin.calendarview.CalendarViewDelegate(context, attributeSet);
        init(context);
    }

    private void init(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.haibin.calendarview.R.layout.cv_layout_calendar_view, (android.view.ViewGroup) this, true);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.haibin.calendarview.R.id.frameContent);
        com.haibin.calendarview.WeekViewPager weekViewPager = (com.haibin.calendarview.WeekViewPager) findViewById(com.haibin.calendarview.R.id.vp_week);
        this.mWeekPager = weekViewPager;
        weekViewPager.setup(this.mDelegate);
        try {
            this.mWeekBar = (com.haibin.calendarview.WeekBar) this.mDelegate.getWeekBarClass().getConstructor(android.content.Context.class).newInstance(getContext());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        frameLayout.addView(this.mWeekBar, 2);
        this.mWeekBar.setup(this.mDelegate);
        this.mWeekBar.onWeekStartChange(this.mDelegate.getWeekStart());
        android.view.View findViewById = findViewById(com.haibin.calendarview.R.id.line);
        this.mWeekLine = findViewById;
        findViewById.setBackgroundColor(this.mDelegate.getWeekLineBackground());
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.mWeekLine.getLayoutParams();
        layoutParams.setMargins(this.mDelegate.getWeekLineMargin(), this.mDelegate.getWeekBarHeight(), this.mDelegate.getWeekLineMargin(), 0);
        this.mWeekLine.setLayoutParams(layoutParams);
        com.haibin.calendarview.MonthViewPager monthViewPager = (com.haibin.calendarview.MonthViewPager) findViewById(com.haibin.calendarview.R.id.vp_month);
        this.mMonthPager = monthViewPager;
        monthViewPager.mWeekPager = this.mWeekPager;
        this.mMonthPager.mWeekBar = this.mWeekBar;
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.mMonthPager.getLayoutParams();
        layoutParams2.setMargins(0, this.mDelegate.getWeekBarHeight() + com.haibin.calendarview.CalendarUtil.dipToPx(context, 1.0f), 0, 0);
        this.mWeekPager.setLayoutParams(layoutParams2);
        com.haibin.calendarview.YearViewPager yearViewPager = (com.haibin.calendarview.YearViewPager) findViewById(com.haibin.calendarview.R.id.selectLayout);
        this.mYearViewPager = yearViewPager;
        yearViewPager.setPadding(this.mDelegate.getYearViewPaddingLeft(), 0, this.mDelegate.getYearViewPaddingRight(), 0);
        this.mYearViewPager.setBackgroundColor(this.mDelegate.getYearViewBackground());
        this.mYearViewPager.addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener() { // from class: com.haibin.calendarview.CalendarView.1
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                if (com.haibin.calendarview.CalendarView.this.mWeekPager.getVisibility() == 0 || com.haibin.calendarview.CalendarView.this.mDelegate.mYearChangeListener == null) {
                    return;
                }
                com.haibin.calendarview.CalendarView.this.mDelegate.mYearChangeListener.onYearChange(i + com.haibin.calendarview.CalendarView.this.mDelegate.getMinYear());
            }
        });
        this.mDelegate.mInnerListener = new com.haibin.calendarview.CalendarView.OnInnerDateSelectedListener() { // from class: com.haibin.calendarview.CalendarView.2
            @Override // com.haibin.calendarview.CalendarView.OnInnerDateSelectedListener
            public void onMonthDateSelected(com.haibin.calendarview.Calendar calendar, boolean z) {
                if (calendar.getYear() == com.haibin.calendarview.CalendarView.this.mDelegate.getCurrentDay().getYear() && calendar.getMonth() == com.haibin.calendarview.CalendarView.this.mDelegate.getCurrentDay().getMonth() && com.haibin.calendarview.CalendarView.this.mMonthPager.getCurrentItem() != com.haibin.calendarview.CalendarView.this.mDelegate.mCurrentMonthViewItem) {
                    return;
                }
                com.haibin.calendarview.CalendarView.this.mDelegate.mIndexCalendar = calendar;
                if (com.haibin.calendarview.CalendarView.this.mDelegate.getSelectMode() == 0 || z) {
                    com.haibin.calendarview.CalendarView.this.mDelegate.mSelectedCalendar = calendar;
                }
                com.haibin.calendarview.CalendarView.this.mWeekPager.updateSelected(com.haibin.calendarview.CalendarView.this.mDelegate.mIndexCalendar, false);
                com.haibin.calendarview.CalendarView.this.mMonthPager.updateSelected();
                if (com.haibin.calendarview.CalendarView.this.mWeekBar != null) {
                    if (com.haibin.calendarview.CalendarView.this.mDelegate.getSelectMode() == 0 || z) {
                        com.haibin.calendarview.CalendarView.this.mWeekBar.onDateSelected(calendar, com.haibin.calendarview.CalendarView.this.mDelegate.getWeekStart(), z);
                    }
                }
            }

            @Override // com.haibin.calendarview.CalendarView.OnInnerDateSelectedListener
            public void onWeekDateSelected(com.haibin.calendarview.Calendar calendar, boolean z) {
                com.haibin.calendarview.CalendarView.this.mDelegate.mIndexCalendar = calendar;
                if (com.haibin.calendarview.CalendarView.this.mDelegate.getSelectMode() == 0 || z || com.haibin.calendarview.CalendarView.this.mDelegate.mIndexCalendar.equals(com.haibin.calendarview.CalendarView.this.mDelegate.mSelectedCalendar)) {
                    com.haibin.calendarview.CalendarView.this.mDelegate.mSelectedCalendar = calendar;
                }
                int year = (((calendar.getYear() - com.haibin.calendarview.CalendarView.this.mDelegate.getMinYear()) * 12) + com.haibin.calendarview.CalendarView.this.mDelegate.mIndexCalendar.getMonth()) - com.haibin.calendarview.CalendarView.this.mDelegate.getMinYearMonth();
                com.haibin.calendarview.CalendarView.this.mWeekPager.updateSingleSelect();
                com.haibin.calendarview.CalendarView.this.mMonthPager.setCurrentItem(year, false);
                com.haibin.calendarview.CalendarView.this.mMonthPager.updateSelected();
                if (com.haibin.calendarview.CalendarView.this.mWeekBar != null) {
                    if (com.haibin.calendarview.CalendarView.this.mDelegate.getSelectMode() == 0 || z || com.haibin.calendarview.CalendarView.this.mDelegate.mIndexCalendar.equals(com.haibin.calendarview.CalendarView.this.mDelegate.mSelectedCalendar)) {
                        com.haibin.calendarview.CalendarView.this.mWeekBar.onDateSelected(calendar, com.haibin.calendarview.CalendarView.this.mDelegate.getWeekStart(), z);
                    }
                }
            }
        };
        if (this.mDelegate.getSelectMode() == 0) {
            if (isInRange(this.mDelegate.getCurrentDay())) {
                com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
                calendarViewDelegate.mSelectedCalendar = calendarViewDelegate.createCurrentDate();
            } else {
                com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
                calendarViewDelegate2.mSelectedCalendar = calendarViewDelegate2.getMinRangeCalendar();
            }
        } else {
            this.mDelegate.mSelectedCalendar = new com.haibin.calendarview.Calendar();
        }
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate3 = this.mDelegate;
        calendarViewDelegate3.mIndexCalendar = calendarViewDelegate3.mSelectedCalendar;
        this.mWeekBar.onDateSelected(this.mDelegate.mSelectedCalendar, this.mDelegate.getWeekStart(), false);
        this.mMonthPager.setup(this.mDelegate);
        this.mMonthPager.setCurrentItem(this.mDelegate.mCurrentMonthViewItem);
        this.mYearViewPager.setOnMonthSelectedListener(new com.haibin.calendarview.YearRecyclerView.OnMonthSelectedListener() { // from class: com.haibin.calendarview.CalendarView.3
            @Override // com.haibin.calendarview.YearRecyclerView.OnMonthSelectedListener
            public void onMonthSelected(int i, int i2) {
                com.haibin.calendarview.CalendarView.this.closeSelectLayout((((i - com.haibin.calendarview.CalendarView.this.mDelegate.getMinYear()) * 12) + i2) - com.haibin.calendarview.CalendarView.this.mDelegate.getMinYearMonth());
                com.haibin.calendarview.CalendarView.this.mDelegate.isShowYearSelectedLayout = false;
            }
        });
        this.mYearViewPager.setup(this.mDelegate);
        this.mWeekPager.updateSelected(this.mDelegate.createCurrentDate(), false);
    }

    public void setRange(int i, int i2, int i3, int i4, int i5, int i6) {
        if (com.haibin.calendarview.CalendarUtil.compareTo(i, i2, i3, i4, i5, i6) > 0) {
            return;
        }
        this.mDelegate.setRange(i, i2, i3, i4, i5, i6);
        this.mWeekPager.notifyDataSetChanged();
        this.mYearViewPager.notifyDataSetChanged();
        this.mMonthPager.notifyDataSetChanged();
        if (!isInRange(this.mDelegate.mSelectedCalendar)) {
            com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
            calendarViewDelegate.mSelectedCalendar = calendarViewDelegate.getMinRangeCalendar();
            this.mDelegate.updateSelectCalendarScheme();
            com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
            calendarViewDelegate2.mIndexCalendar = calendarViewDelegate2.mSelectedCalendar;
        }
        this.mWeekPager.updateRange();
        this.mMonthPager.updateRange();
        this.mYearViewPager.updateRange();
    }

    public int getCurDay() {
        return this.mDelegate.getCurrentDay().getDay();
    }

    public int getCurMonth() {
        return this.mDelegate.getCurrentDay().getMonth();
    }

    public int getCurYear() {
        return this.mDelegate.getCurrentDay().getYear();
    }

    public void showYearSelectLayout(int i) {
        showSelectLayout(i);
    }

    private void showSelectLayout(final int i) {
        com.haibin.calendarview.CalendarLayout calendarLayout = this.mParentLayout;
        if (calendarLayout != null && calendarLayout.mContentView != null && !this.mParentLayout.isExpand()) {
            this.mParentLayout.expand();
        }
        this.mWeekPager.setVisibility(8);
        this.mDelegate.isShowYearSelectedLayout = true;
        com.haibin.calendarview.CalendarLayout calendarLayout2 = this.mParentLayout;
        if (calendarLayout2 != null) {
            calendarLayout2.hideContentView();
        }
        this.mWeekBar.animate().translationY(-this.mWeekBar.getHeight()).setInterpolator(new android.view.animation.LinearInterpolator()).setDuration(260L).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.haibin.calendarview.CalendarView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                com.haibin.calendarview.CalendarView.this.mWeekBar.setVisibility(8);
                com.haibin.calendarview.CalendarView.this.mYearViewPager.setVisibility(0);
                com.haibin.calendarview.CalendarView.this.mYearViewPager.scrollToYear(i, false);
                if (com.haibin.calendarview.CalendarView.this.mParentLayout == null || com.haibin.calendarview.CalendarView.this.mParentLayout.mContentView == null) {
                    return;
                }
                com.haibin.calendarview.CalendarView.this.mParentLayout.expand();
            }
        });
        this.mMonthPager.animate().scaleX(0.0f).scaleY(0.0f).setDuration(260L).setInterpolator(new android.view.animation.LinearInterpolator()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.haibin.calendarview.CalendarView.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                if (com.haibin.calendarview.CalendarView.this.mDelegate.mYearViewChangeListener != null) {
                    com.haibin.calendarview.CalendarView.this.mDelegate.mYearViewChangeListener.onYearViewChange(false);
                }
            }
        });
    }

    public boolean isYearSelectLayoutVisible() {
        return this.mYearViewPager.getVisibility() == 0;
    }

    public void closeYearSelectLayout() {
        if (this.mYearViewPager.getVisibility() == 8) {
            return;
        }
        closeSelectLayout((((this.mDelegate.mSelectedCalendar.getYear() - this.mDelegate.getMinYear()) * 12) + this.mDelegate.mSelectedCalendar.getMonth()) - this.mDelegate.getMinYearMonth());
        this.mDelegate.isShowYearSelectedLayout = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeSelectLayout(int i) {
        this.mYearViewPager.setVisibility(8);
        this.mWeekBar.setVisibility(0);
        if (i == this.mMonthPager.getCurrentItem()) {
            if (this.mDelegate.mCalendarSelectListener != null && this.mDelegate.getSelectMode() != 1) {
                this.mDelegate.mCalendarSelectListener.onCalendarSelect(this.mDelegate.mSelectedCalendar, false);
            }
        } else {
            this.mMonthPager.setCurrentItem(i, false);
        }
        this.mWeekBar.animate().translationY(0.0f).setInterpolator(new android.view.animation.LinearInterpolator()).setDuration(280L).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.haibin.calendarview.CalendarView.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                com.haibin.calendarview.CalendarView.this.mWeekBar.setVisibility(0);
            }
        });
        this.mMonthPager.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).setInterpolator(new android.view.animation.LinearInterpolator()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.haibin.calendarview.CalendarView.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                if (com.haibin.calendarview.CalendarView.this.mDelegate.mYearViewChangeListener != null) {
                    com.haibin.calendarview.CalendarView.this.mDelegate.mYearViewChangeListener.onYearViewChange(true);
                }
                if (com.haibin.calendarview.CalendarView.this.mParentLayout == null) {
                    com.haibin.calendarview.CalendarView.this.mMonthPager.setVisibility(0);
                } else {
                    com.haibin.calendarview.CalendarView.this.mParentLayout.showContentView();
                    if (com.haibin.calendarview.CalendarView.this.mParentLayout.isExpand()) {
                        com.haibin.calendarview.CalendarView.this.mMonthPager.setVisibility(0);
                    } else {
                        com.haibin.calendarview.CalendarView.this.mWeekPager.setVisibility(0);
                        com.haibin.calendarview.CalendarView.this.mParentLayout.shrink();
                    }
                }
                com.haibin.calendarview.CalendarView.this.mMonthPager.clearAnimation();
            }
        });
    }

    public void scrollToCurrent() {
        scrollToCurrent(false);
    }

    public void scrollToCurrent(boolean z) {
        if (isInRange(this.mDelegate.getCurrentDay())) {
            com.haibin.calendarview.Calendar createCurrentDate = this.mDelegate.createCurrentDate();
            if (this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(createCurrentDate)) {
                this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(createCurrentDate, false);
                return;
            }
            com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
            calendarViewDelegate.mSelectedCalendar = calendarViewDelegate.createCurrentDate();
            com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
            calendarViewDelegate2.mIndexCalendar = calendarViewDelegate2.mSelectedCalendar;
            this.mDelegate.updateSelectCalendarScheme();
            this.mWeekBar.onDateSelected(this.mDelegate.mSelectedCalendar, this.mDelegate.getWeekStart(), false);
            if (this.mMonthPager.getVisibility() == 0) {
                this.mMonthPager.scrollToCurrent(z);
                this.mWeekPager.updateSelected(this.mDelegate.mIndexCalendar, false);
            } else {
                this.mWeekPager.scrollToCurrent(z);
            }
            this.mYearViewPager.scrollToYear(this.mDelegate.getCurrentDay().getYear(), z);
        }
    }

    public void scrollToNext() {
        scrollToNext(false);
    }

    public void scrollToNext(boolean z) {
        if (isYearSelectLayoutVisible()) {
            com.haibin.calendarview.YearViewPager yearViewPager = this.mYearViewPager;
            yearViewPager.setCurrentItem(yearViewPager.getCurrentItem() + 1, z);
        } else if (this.mWeekPager.getVisibility() == 0) {
            com.haibin.calendarview.WeekViewPager weekViewPager = this.mWeekPager;
            weekViewPager.setCurrentItem(weekViewPager.getCurrentItem() + 1, z);
        } else {
            com.haibin.calendarview.MonthViewPager monthViewPager = this.mMonthPager;
            monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() + 1, z);
        }
    }

    public void scrollToPre() {
        scrollToPre(false);
    }

    public void scrollToPre(boolean z) {
        if (isYearSelectLayoutVisible()) {
            this.mYearViewPager.setCurrentItem(r0.getCurrentItem() - 1, z);
        } else if (this.mWeekPager.getVisibility() == 0) {
            this.mWeekPager.setCurrentItem(r0.getCurrentItem() - 1, z);
        } else {
            this.mMonthPager.setCurrentItem(r0.getCurrentItem() - 1, z);
        }
    }

    public void scrollToSelectCalendar() {
        if (this.mDelegate.mSelectedCalendar.isAvailable()) {
            scrollToCalendar(this.mDelegate.mSelectedCalendar.getYear(), this.mDelegate.mSelectedCalendar.getMonth(), this.mDelegate.mSelectedCalendar.getDay(), false, true);
        }
    }

    public void scrollToCalendar(int i, int i2, int i3) {
        scrollToCalendar(i, i2, i3, false, true);
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z) {
        scrollToCalendar(i, i2, i3, z, true);
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2) {
        com.haibin.calendarview.Calendar calendar = new com.haibin.calendarview.Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        if (calendar.isAvailable() && isInRange(calendar)) {
            if (this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(calendar)) {
                this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(calendar, false);
            } else if (this.mWeekPager.getVisibility() == 0) {
                this.mWeekPager.scrollToCalendar(i, i2, i3, z, z2);
            } else {
                this.mMonthPager.scrollToCalendar(i, i2, i3, z, z2);
            }
        }
    }

    public void scrollToYear(int i) {
        scrollToYear(i, false);
    }

    public void scrollToYear(int i, boolean z) {
        if (this.mYearViewPager.getVisibility() != 0) {
            return;
        }
        this.mYearViewPager.scrollToYear(i, z);
    }

    public final void setMonthViewScrollable(boolean z) {
        this.mDelegate.setMonthViewScrollable(z);
    }

    public final void setWeekViewScrollable(boolean z) {
        this.mDelegate.setWeekViewScrollable(z);
    }

    public final void setYearViewScrollable(boolean z) {
        this.mDelegate.setYearViewScrollable(z);
    }

    public final void setDefaultMonthViewSelectDay() {
        this.mDelegate.setDefaultCalendarSelectDay(0);
    }

    public final void setLastMonthViewSelectDay() {
        this.mDelegate.setDefaultCalendarSelectDay(1);
    }

    public final void setLastMonthViewSelectDayIgnoreCurrent() {
        this.mDelegate.setDefaultCalendarSelectDay(2);
    }

    public final void clearSelectRange() {
        this.mDelegate.clearSelectRange();
        this.mMonthPager.clearSelectRange();
        this.mWeekPager.clearSelectRange();
    }

    public final void clearSingleSelect() {
        this.mDelegate.mSelectedCalendar = new com.haibin.calendarview.Calendar();
        this.mMonthPager.clearSingleSelect();
        this.mWeekPager.clearSingleSelect();
    }

    public final void clearMultiSelect() {
        this.mDelegate.mSelectedCalendars.clear();
        this.mMonthPager.clearMultiSelect();
        this.mWeekPager.clearMultiSelect();
    }

    public final void putMultiSelect(com.haibin.calendarview.Calendar... calendarArr) {
        if (calendarArr == null || calendarArr.length == 0) {
            return;
        }
        for (com.haibin.calendarview.Calendar calendar : calendarArr) {
            if (calendar != null && !this.mDelegate.mSelectedCalendars.containsKey(calendar.toString())) {
                this.mDelegate.mSelectedCalendars.put(calendar.toString(), calendar);
            }
        }
        update();
    }

    public final void removeMultiSelect(com.haibin.calendarview.Calendar... calendarArr) {
        if (calendarArr == null || calendarArr.length == 0) {
            return;
        }
        for (com.haibin.calendarview.Calendar calendar : calendarArr) {
            if (calendar != null && this.mDelegate.mSelectedCalendars.containsKey(calendar.toString())) {
                this.mDelegate.mSelectedCalendars.remove(calendar.toString());
            }
        }
        update();
    }

    public final java.util.List<com.haibin.calendarview.Calendar> getMultiSelectCalendars() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.mDelegate.mSelectedCalendars.size() == 0) {
            return arrayList;
        }
        arrayList.addAll(this.mDelegate.mSelectedCalendars.values());
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    public final java.util.List<com.haibin.calendarview.Calendar> getSelectCalendarRange() {
        return this.mDelegate.getSelectCalendarRange();
    }

    public final void setCalendarItemHeight(int i) {
        if (this.mDelegate.getCalendarItemHeight() == i) {
            return;
        }
        this.mDelegate.setCalendarItemHeight(i);
        this.mMonthPager.updateItemHeight();
        this.mWeekPager.updateItemHeight();
        com.haibin.calendarview.CalendarLayout calendarLayout = this.mParentLayout;
        if (calendarLayout == null) {
            return;
        }
        calendarLayout.updateCalendarItemHeight();
    }

    public final void setMonthView(java.lang.Class<?> cls) {
        if (cls == null || this.mDelegate.getMonthViewClass().equals(cls)) {
            return;
        }
        this.mDelegate.setMonthViewClass(cls);
        this.mMonthPager.updateMonthViewClass();
    }

    public final void setWeekView(java.lang.Class<?> cls) {
        if (cls == null || this.mDelegate.getWeekBarClass().equals(cls)) {
            return;
        }
        this.mDelegate.setWeekViewClass(cls);
        this.mWeekPager.updateWeekViewClass();
    }

    public final void setWeekBar(java.lang.Class<?> cls) {
        if (cls == null || this.mDelegate.getWeekBarClass().equals(cls)) {
            return;
        }
        this.mDelegate.setWeekBarClass(cls);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.haibin.calendarview.R.id.frameContent);
        frameLayout.removeView(this.mWeekBar);
        try {
            this.mWeekBar = (com.haibin.calendarview.WeekBar) cls.getConstructor(android.content.Context.class).newInstance(getContext());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        frameLayout.addView(this.mWeekBar, 2);
        this.mWeekBar.setup(this.mDelegate);
        this.mWeekBar.onWeekStartChange(this.mDelegate.getWeekStart());
        this.mMonthPager.mWeekBar = this.mWeekBar;
        this.mWeekBar.onDateSelected(this.mDelegate.mSelectedCalendar, this.mDelegate.getWeekStart(), false);
    }

    public final void setOnCalendarInterceptListener(com.haibin.calendarview.CalendarView.OnCalendarInterceptListener onCalendarInterceptListener) {
        if (onCalendarInterceptListener == null) {
            this.mDelegate.mCalendarInterceptListener = null;
        }
        if (onCalendarInterceptListener == null || this.mDelegate.getSelectMode() == 0) {
            return;
        }
        this.mDelegate.mCalendarInterceptListener = onCalendarInterceptListener;
        if (onCalendarInterceptListener.onCalendarIntercept(this.mDelegate.mSelectedCalendar)) {
            this.mDelegate.mSelectedCalendar = new com.haibin.calendarview.Calendar();
        }
    }

    public final void setOnClickCalendarPaddingListener(com.haibin.calendarview.CalendarView.OnClickCalendarPaddingListener onClickCalendarPaddingListener) {
        if (onClickCalendarPaddingListener == null) {
            this.mDelegate.mClickCalendarPaddingListener = null;
        }
        if (onClickCalendarPaddingListener == null) {
            return;
        }
        this.mDelegate.mClickCalendarPaddingListener = onClickCalendarPaddingListener;
    }

    public void setOnYearChangeListener(com.haibin.calendarview.CalendarView.OnYearChangeListener onYearChangeListener) {
        this.mDelegate.mYearChangeListener = onYearChangeListener;
    }

    public void setOnMonthChangeListener(com.haibin.calendarview.CalendarView.OnMonthChangeListener onMonthChangeListener) {
        this.mDelegate.mMonthChangeListener = onMonthChangeListener;
    }

    public void setOnWeekChangeListener(com.haibin.calendarview.CalendarView.OnWeekChangeListener onWeekChangeListener) {
        this.mDelegate.mWeekChangeListener = onWeekChangeListener;
    }

    public void setOnCalendarSelectListener(com.haibin.calendarview.CalendarView.OnCalendarSelectListener onCalendarSelectListener) {
        this.mDelegate.mCalendarSelectListener = onCalendarSelectListener;
        if (this.mDelegate.mCalendarSelectListener != null && this.mDelegate.getSelectMode() == 0 && isInRange(this.mDelegate.mSelectedCalendar)) {
            this.mDelegate.updateSelectCalendarScheme();
        }
    }

    public final void setOnCalendarRangeSelectListener(com.haibin.calendarview.CalendarView.OnCalendarRangeSelectListener onCalendarRangeSelectListener) {
        this.mDelegate.mCalendarRangeSelectListener = onCalendarRangeSelectListener;
    }

    public final void setOnCalendarMultiSelectListener(com.haibin.calendarview.CalendarView.OnCalendarMultiSelectListener onCalendarMultiSelectListener) {
        this.mDelegate.mCalendarMultiSelectListener = onCalendarMultiSelectListener;
    }

    public final void setSelectRange(int i, int i2) {
        if (i > i2) {
            return;
        }
        this.mDelegate.setSelectRange(i, i2);
    }

    public final void setSelectStartCalendar(int i, int i2, int i3) {
        if (this.mDelegate.getSelectMode() != 2) {
            return;
        }
        com.haibin.calendarview.Calendar calendar = new com.haibin.calendarview.Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        setSelectStartCalendar(calendar);
    }

    public final void setSelectStartCalendar(com.haibin.calendarview.Calendar calendar) {
        if (this.mDelegate.getSelectMode() == 2 && calendar != null) {
            if (!isInRange(calendar)) {
                if (this.mDelegate.mCalendarRangeSelectListener != null) {
                    this.mDelegate.mCalendarRangeSelectListener.onSelectOutOfRange(calendar, true);
                }
            } else if (onCalendarIntercept(calendar)) {
                if (this.mDelegate.mCalendarInterceptListener != null) {
                    this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(calendar, false);
                }
            } else {
                this.mDelegate.mSelectedEndRangeCalendar = null;
                this.mDelegate.mSelectedStartRangeCalendar = calendar;
                scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
            }
        }
    }

    public final void setSelectEndCalendar(int i, int i2, int i3) {
        if (this.mDelegate.getSelectMode() == 2 && this.mDelegate.mSelectedStartRangeCalendar != null) {
            com.haibin.calendarview.Calendar calendar = new com.haibin.calendarview.Calendar();
            calendar.setYear(i);
            calendar.setMonth(i2);
            calendar.setDay(i3);
            setSelectEndCalendar(calendar);
        }
    }

    public final void setSelectEndCalendar(com.haibin.calendarview.Calendar calendar) {
        if (this.mDelegate.getSelectMode() == 2 && this.mDelegate.mSelectedStartRangeCalendar != null) {
            setSelectCalendarRange(this.mDelegate.mSelectedStartRangeCalendar, calendar);
        }
    }

    public final void setSelectCalendarRange(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.mDelegate.getSelectMode() != 2) {
            return;
        }
        com.haibin.calendarview.Calendar calendar = new com.haibin.calendarview.Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        com.haibin.calendarview.Calendar calendar2 = new com.haibin.calendarview.Calendar();
        calendar2.setYear(i4);
        calendar2.setMonth(i5);
        calendar2.setDay(i6);
        setSelectCalendarRange(calendar, calendar2);
    }

    public final void setSelectCalendarRange(com.haibin.calendarview.Calendar calendar, com.haibin.calendarview.Calendar calendar2) {
        if (this.mDelegate.getSelectMode() != 2 || calendar == null || calendar2 == null) {
            return;
        }
        if (onCalendarIntercept(calendar)) {
            if (this.mDelegate.mCalendarInterceptListener != null) {
                this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(calendar, false);
                return;
            }
            return;
        }
        if (onCalendarIntercept(calendar2)) {
            if (this.mDelegate.mCalendarInterceptListener != null) {
                this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(calendar2, false);
                return;
            }
            return;
        }
        int differ = calendar2.differ(calendar);
        if (differ >= 0 && isInRange(calendar) && isInRange(calendar2)) {
            if (this.mDelegate.getMinSelectRange() != -1 && this.mDelegate.getMinSelectRange() > differ + 1) {
                if (this.mDelegate.mCalendarRangeSelectListener != null) {
                    this.mDelegate.mCalendarRangeSelectListener.onSelectOutOfRange(calendar2, true);
                    return;
                }
                return;
            }
            if (this.mDelegate.getMaxSelectRange() != -1 && this.mDelegate.getMaxSelectRange() < differ + 1) {
                if (this.mDelegate.mCalendarRangeSelectListener != null) {
                    this.mDelegate.mCalendarRangeSelectListener.onSelectOutOfRange(calendar2, false);
                }
            } else {
                if (this.mDelegate.getMinSelectRange() == -1 && differ == 0) {
                    this.mDelegate.mSelectedStartRangeCalendar = calendar;
                    this.mDelegate.mSelectedEndRangeCalendar = null;
                    if (this.mDelegate.mCalendarRangeSelectListener != null) {
                        this.mDelegate.mCalendarRangeSelectListener.onCalendarRangeSelect(calendar, false);
                    }
                    scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
                    return;
                }
                this.mDelegate.mSelectedStartRangeCalendar = calendar;
                this.mDelegate.mSelectedEndRangeCalendar = calendar2;
                if (this.mDelegate.mCalendarRangeSelectListener != null) {
                    this.mDelegate.mCalendarRangeSelectListener.onCalendarRangeSelect(calendar, false);
                    this.mDelegate.mCalendarRangeSelectListener.onCalendarRangeSelect(calendar2, true);
                }
                scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
            }
        }
    }

    protected final boolean onCalendarIntercept(com.haibin.calendarview.Calendar calendar) {
        return this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(calendar);
    }

    public final int getMaxMultiSelectSize() {
        return this.mDelegate.getMaxMultiSelectSize();
    }

    public final void setMaxMultiSelectSize(int i) {
        this.mDelegate.setMaxMultiSelectSize(i);
    }

    public final int getMinSelectRange() {
        return this.mDelegate.getMinSelectRange();
    }

    public final int getMaxSelectRange() {
        return this.mDelegate.getMaxSelectRange();
    }

    public void setOnCalendarLongClickListener(com.haibin.calendarview.CalendarView.OnCalendarLongClickListener onCalendarLongClickListener) {
        this.mDelegate.mCalendarLongClickListener = onCalendarLongClickListener;
    }

    public void setOnCalendarLongClickListener(com.haibin.calendarview.CalendarView.OnCalendarLongClickListener onCalendarLongClickListener, boolean z) {
        this.mDelegate.mCalendarLongClickListener = onCalendarLongClickListener;
        this.mDelegate.setPreventLongPressedSelected(z);
    }

    public void setOnViewChangeListener(com.haibin.calendarview.CalendarView.OnViewChangeListener onViewChangeListener) {
        this.mDelegate.mViewChangeListener = onViewChangeListener;
    }

    public void setOnYearViewChangeListener(com.haibin.calendarview.CalendarView.OnYearViewChangeListener onYearViewChangeListener) {
        this.mDelegate.mYearViewChangeListener = onYearViewChangeListener;
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        if (this.mDelegate == null) {
            return super.onSaveInstanceState();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", this.mDelegate.mSelectedCalendar);
        bundle.putSerializable("index_calendar", this.mDelegate.mIndexCalendar);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        android.os.Parcelable parcelable2 = bundle.getParcelable("super");
        this.mDelegate.mSelectedCalendar = (com.haibin.calendarview.Calendar) bundle.getSerializable("selected_calendar");
        this.mDelegate.mIndexCalendar = (com.haibin.calendarview.Calendar) bundle.getSerializable("index_calendar");
        if (this.mDelegate.mCalendarSelectListener != null) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(this.mDelegate.mSelectedCalendar, false);
        }
        if (this.mDelegate.mIndexCalendar != null) {
            scrollToCalendar(this.mDelegate.mIndexCalendar.getYear(), this.mDelegate.mIndexCalendar.getMonth(), this.mDelegate.mIndexCalendar.getDay());
        }
        update();
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() == null || !(getParent() instanceof com.haibin.calendarview.CalendarLayout)) {
            return;
        }
        com.haibin.calendarview.CalendarLayout calendarLayout = (com.haibin.calendarview.CalendarLayout) getParent();
        this.mParentLayout = calendarLayout;
        this.mMonthPager.mParentLayout = calendarLayout;
        this.mWeekPager.mParentLayout = this.mParentLayout;
        this.mParentLayout.mWeekBar = this.mWeekBar;
        this.mParentLayout.setup(this.mDelegate);
        this.mParentLayout.initStatus();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i2);
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || !calendarViewDelegate.isFullScreenCalendar()) {
            super.onMeasure(i, i2);
        } else {
            setCalendarItemHeight((size - this.mDelegate.getWeekBarHeight()) / 6);
            super.onMeasure(i, i2);
        }
    }

    public final void setSchemeDate(java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> map) {
        this.mDelegate.mSchemeDatesMap = map;
        this.mDelegate.updateSelectCalendarScheme();
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public final void clearSchemeDate() {
        this.mDelegate.mSchemeDatesMap = null;
        this.mDelegate.clearSelectedScheme();
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public final void addSchemeDate(com.haibin.calendarview.Calendar calendar) {
        if (calendar == null || !calendar.isAvailable()) {
            return;
        }
        if (this.mDelegate.mSchemeDatesMap == null) {
            this.mDelegate.mSchemeDatesMap = new java.util.HashMap();
        }
        this.mDelegate.mSchemeDatesMap.remove(calendar.toString());
        this.mDelegate.mSchemeDatesMap.put(calendar.toString(), calendar);
        this.mDelegate.updateSelectCalendarScheme();
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public final void addSchemeDate(java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> map) {
        if (this.mDelegate == null || map == null || map.size() == 0) {
            return;
        }
        if (this.mDelegate.mSchemeDatesMap == null) {
            this.mDelegate.mSchemeDatesMap = new java.util.HashMap();
        }
        this.mDelegate.addSchemes(map);
        this.mDelegate.updateSelectCalendarScheme();
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public final void removeSchemeDate(com.haibin.calendarview.Calendar calendar) {
        if (calendar == null || this.mDelegate.mSchemeDatesMap == null || this.mDelegate.mSchemeDatesMap.size() == 0) {
            return;
        }
        this.mDelegate.mSchemeDatesMap.remove(calendar.toString());
        if (this.mDelegate.mSelectedCalendar.equals(calendar)) {
            this.mDelegate.clearSelectedScheme();
        }
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public void setBackground(int i, int i2, int i3) {
        this.mWeekBar.setBackgroundColor(i2);
        this.mYearViewPager.setBackgroundColor(i);
        this.mWeekLine.setBackgroundColor(i3);
    }

    public void setTextColor(int i, int i2, int i3, int i4, int i5) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        calendarViewDelegate.setTextColor(i, i2, i3, i4, i5);
        this.mMonthPager.updateStyle();
        this.mWeekPager.updateStyle();
    }

    public void setSelectedColor(int i, int i2, int i3) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        calendarViewDelegate.setSelectColor(i, i2, i3);
        this.mMonthPager.updateStyle();
        this.mWeekPager.updateStyle();
    }

    public void setThemeColor(int i, int i2) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        calendarViewDelegate.setThemeColor(i, i2);
        this.mMonthPager.updateStyle();
        this.mWeekPager.updateStyle();
    }

    public void setSchemeColor(int i, int i2, int i3) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        calendarViewDelegate.setSchemeColor(i, i2, i3);
        this.mMonthPager.updateStyle();
        this.mWeekPager.updateStyle();
    }

    public void setYearViewTextColor(int i, int i2, int i3) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || this.mYearViewPager == null) {
            return;
        }
        calendarViewDelegate.setYearViewTextColor(i, i2, i3);
        this.mYearViewPager.updateStyle();
    }

    public void setWeeColor(int i, int i2) {
        com.haibin.calendarview.WeekBar weekBar = this.mWeekBar;
        if (weekBar == null) {
            return;
        }
        weekBar.setBackgroundColor(i);
        this.mWeekBar.setTextColor(i2);
    }

    public void setCalendarPadding(int i) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null) {
            return;
        }
        calendarViewDelegate.setCalendarPadding(i);
        update();
    }

    public void setCalendarPaddingLeft(int i) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null) {
            return;
        }
        calendarViewDelegate.setCalendarPaddingLeft(i);
        update();
    }

    public void setCalendarPaddingRight(int i) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null) {
            return;
        }
        calendarViewDelegate.setCalendarPaddingRight(i);
        update();
    }

    public final void setSelectDefaultMode() {
        if (this.mDelegate.getSelectMode() == 0) {
            return;
        }
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        calendarViewDelegate.mSelectedCalendar = calendarViewDelegate.mIndexCalendar;
        this.mDelegate.setSelectMode(0);
        this.mWeekBar.onDateSelected(this.mDelegate.mSelectedCalendar, this.mDelegate.getWeekStart(), false);
        this.mMonthPager.updateDefaultSelect();
        this.mWeekPager.updateDefaultSelect();
    }

    public void setSelectRangeMode() {
        if (this.mDelegate.getSelectMode() == 2) {
            return;
        }
        this.mDelegate.setSelectMode(2);
        clearSelectRange();
    }

    public void setSelectMultiMode() {
        if (this.mDelegate.getSelectMode() == 3) {
            return;
        }
        this.mDelegate.setSelectMode(3);
        clearMultiSelect();
    }

    public void setSelectSingleMode() {
        if (this.mDelegate.getSelectMode() == 1) {
            return;
        }
        this.mDelegate.setSelectMode(1);
        this.mWeekPager.updateSelected();
        this.mMonthPager.updateSelected();
    }

    public void setWeekStarWithSun() {
        setWeekStart(1);
    }

    public void setWeekStarWithMon() {
        setWeekStart(2);
    }

    public void setWeekStarWithSat() {
        setWeekStart(7);
    }

    private void setWeekStart(int i) {
        if ((i == 1 || i == 2 || i == 7) && i != this.mDelegate.getWeekStart()) {
            this.mDelegate.setWeekStart(i);
            this.mWeekBar.onWeekStartChange(i);
            this.mWeekBar.onDateSelected(this.mDelegate.mSelectedCalendar, i, false);
            this.mWeekPager.updateWeekStart();
            this.mMonthPager.updateWeekStart();
            this.mYearViewPager.updateWeekStart();
        }
    }

    public boolean isSingleSelectMode() {
        return this.mDelegate.getSelectMode() == 1;
    }

    public void setAllMode() {
        setShowMode(0);
    }

    public void setOnlyCurrentMode() {
        setShowMode(1);
    }

    public void setFixMode() {
        setShowMode(2);
    }

    private void setShowMode(int i) {
        if ((i == 0 || i == 1 || i == 2) && this.mDelegate.getMonthViewShowMode() != i) {
            this.mDelegate.setMonthViewShowMode(i);
            this.mWeekPager.updateShowMode();
            this.mMonthPager.updateShowMode();
            this.mWeekPager.notifyDataSetChanged();
        }
    }

    public final void update() {
        this.mWeekBar.onWeekStartChange(this.mDelegate.getWeekStart());
        this.mYearViewPager.update();
        this.mMonthPager.updateScheme();
        this.mWeekPager.updateScheme();
    }

    public void updateWeekBar() {
        this.mWeekBar.onWeekStartChange(this.mDelegate.getWeekStart());
    }

    public final void updateCurrentDate() {
        if (this.mDelegate == null || this.mMonthPager == null || this.mWeekPager == null) {
            return;
        }
        if (getCurDay() == java.util.Calendar.getInstance().get(5)) {
            return;
        }
        this.mDelegate.updateCurrentDay();
        this.mMonthPager.updateCurrentDate();
        this.mWeekPager.updateCurrentDate();
    }

    public java.util.List<com.haibin.calendarview.Calendar> getCurrentWeekCalendars() {
        return this.mWeekPager.getCurrentWeekCalendars();
    }

    public java.util.List<com.haibin.calendarview.Calendar> getCurrentMonthCalendars() {
        return this.mMonthPager.getCurrentMonthCalendars();
    }

    public com.haibin.calendarview.Calendar getSelectedCalendar() {
        return this.mDelegate.mSelectedCalendar;
    }

    public com.haibin.calendarview.Calendar getMinRangeCalendar() {
        return this.mDelegate.getMinRangeCalendar();
    }

    public com.haibin.calendarview.Calendar getMaxRangeCalendar() {
        return this.mDelegate.getMaxRangeCalendar();
    }

    public com.haibin.calendarview.MonthViewPager getMonthViewPager() {
        return this.mMonthPager;
    }

    public com.haibin.calendarview.WeekViewPager getWeekViewPager() {
        return this.mWeekPager;
    }

    protected final boolean isInRange(com.haibin.calendarview.Calendar calendar) {
        com.haibin.calendarview.CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        return calendarViewDelegate != null && com.haibin.calendarview.CalendarUtil.isCalendarInRange(calendar, calendarViewDelegate);
    }
}
