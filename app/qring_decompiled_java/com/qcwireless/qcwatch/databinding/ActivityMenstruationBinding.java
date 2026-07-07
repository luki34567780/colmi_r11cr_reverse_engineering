package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityMenstruationBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout calendarLayout;
    public final com.haibin.calendarview.CalendarLayout calendarLayout1;
    public final com.haibin.calendarview.CalendarView calendarView;
    public final com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qcDateChange;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qcMenstruationStatus;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvNotDo;
    public final android.widget.TextView tvNumberDay;
    public final android.widget.TextView tvStatus;
    public final android.widget.TextView tvTitle1;
    public final android.widget.TextView tvTitle2;
    public final android.widget.TextView tvTitle3;
    public final android.widget.TextView tvTitle4;

    private ActivityMenstruationBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.ConstraintLayout calendarLayout, com.haibin.calendarview.CalendarLayout calendarLayout1, com.haibin.calendarview.CalendarView calendarView, com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qcDateChange, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qcMenstruationStatus, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvNotDo, android.widget.TextView tvNumberDay, android.widget.TextView tvStatus, android.widget.TextView tvTitle1, android.widget.TextView tvTitle2, android.widget.TextView tvTitle3, android.widget.TextView tvTitle4) {
        this.rootView = rootView;
        this.calendarLayout = calendarLayout;
        this.calendarLayout1 = calendarLayout1;
        this.calendarView = calendarView;
        this.qcDateChange = qcDateChange;
        this.qcMenstruationStatus = qcMenstruationStatus;
        this.titleBar = titleBar;
        this.tvNotDo = tvNotDo;
        this.tvNumberDay = tvNumberDay;
        this.tvStatus = tvStatus;
        this.tvTitle1 = tvTitle1;
        this.tvTitle2 = tvTitle2;
        this.tvTitle3 = tvTitle3;
        this.tvTitle4 = tvTitle4;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_menstruation, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.calendar_layout;
        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.calendar_layout);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.calendarLayout;
            com.haibin.calendarview.CalendarLayout calendarLayout = (com.haibin.calendarview.CalendarLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.calendarLayout);
            if (calendarLayout != null) {
                i = com.qcwireless.qcwatch.R.id.calendarView;
                com.haibin.calendarview.CalendarView calendarView = (com.haibin.calendarview.CalendarView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.calendarView);
                if (calendarView != null) {
                    i = com.qcwireless.qcwatch.R.id.qc_date_change;
                    com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qDateMonthSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                    if (qDateMonthSwitchView != null) {
                        i = com.qcwireless.qcwatch.R.id.qc_menstruation_status;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_menstruation_status);
                        if (qSettingItemWithClick != null) {
                            i = 2131297388;
                            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                            if (findChildViewById2 != null) {
                                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2);
                                i = com.qcwireless.qcwatch.R.id.tv_not_do;
                                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_not_do);
                                if (textView != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_number_day;
                                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_number_day);
                                    if (textView2 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_status;
                                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_status);
                                        if (textView3 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_title_1;
                                            android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_1);
                                            if (textView4 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_title_2;
                                                android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_2);
                                                if (textView5 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_title_3;
                                                    android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_3);
                                                    if (textView6 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_title_4;
                                                        android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_4);
                                                        if (textView7 != null) {
                                                            return new com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, calendarLayout, calendarView, qDateMonthSwitchView, qSettingItemWithClick, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
