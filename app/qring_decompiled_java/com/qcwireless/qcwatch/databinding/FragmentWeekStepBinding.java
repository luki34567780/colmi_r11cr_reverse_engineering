package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentWeekStepBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qcDateChange;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepAvg;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepCalorie;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepDistance;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepTotal;
    public final android.widget.TextView topBg1;
    public final android.widget.TextView tvDayStep;
    public final android.widget.TextView tvDayStepUnit;
    public final android.widget.TextView tvStepRange;
    public final com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart weekStepBarView;

    private FragmentWeekStepBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qcDateChange, com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepAvg, com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepCalorie, com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepDistance, com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepTotal, android.widget.TextView topBg1, android.widget.TextView tvDayStep, android.widget.TextView tvDayStepUnit, android.widget.TextView tvStepRange, com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart weekStepBarView) {
        this.rootView = rootView;
        this.qcDateChange = qcDateChange;
        this.stepAvg = stepAvg;
        this.stepCalorie = stepCalorie;
        this.stepDistance = stepDistance;
        this.stepTotal = stepTotal;
        this.topBg1 = topBg1;
        this.tvDayStep = tvDayStep;
        this.tvDayStepUnit = tvDayStepUnit;
        this.tvStepRange = tvStepRange;
        this.weekStepBarView = weekStepBarView;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_week_step, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.qc_date_change;
        com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qDateWeekSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
        if (qDateWeekSwitchView != null) {
            i = com.qcwireless.qcwatch.R.id.step_avg;
            com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView = (com.qcwireless.qcwatch.ui.base.view.QStepComponentView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.step_avg);
            if (qStepComponentView != null) {
                i = com.qcwireless.qcwatch.R.id.step_calorie;
                com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView2 = (com.qcwireless.qcwatch.ui.base.view.QStepComponentView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.step_calorie);
                if (qStepComponentView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.step_distance;
                    com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView3 = (com.qcwireless.qcwatch.ui.base.view.QStepComponentView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.step_distance);
                    if (qStepComponentView3 != null) {
                        i = com.qcwireless.qcwatch.R.id.step_total;
                        com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView4 = (com.qcwireless.qcwatch.ui.base.view.QStepComponentView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.step_total);
                        if (qStepComponentView4 != null) {
                            i = com.qcwireless.qcwatch.R.id.top_bg_1;
                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.top_bg_1);
                            if (textView != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_day_step;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_day_step);
                                if (textView2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_day_step_unit;
                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_day_step_unit);
                                    if (textView3 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_step_range;
                                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_step_range);
                                        if (textView4 != null) {
                                            i = com.qcwireless.qcwatch.R.id.week_step_bar_view;
                                            com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart qStepWeekHistoryBarChart = (com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.week_step_bar_view);
                                            if (qStepWeekHistoryBarChart != null) {
                                                return new com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qDateWeekSwitchView, qStepComponentView, qStepComponentView2, qStepComponentView3, qStepComponentView4, textView, textView2, textView3, textView4, qStepWeekHistoryBarChart);
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
