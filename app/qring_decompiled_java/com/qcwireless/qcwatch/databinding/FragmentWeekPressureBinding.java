package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentWeekPressureBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout cslHeartPie;
    public final com.qcwireless.qcwatch.ui.base.view.QCirclePieView heartCircleView;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView pressureAvg;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView pressureTotal;
    public final com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qcDateChange;
    public final com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart qcPressureChart;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView topBg1;
    public final android.widget.TextView tv1;
    public final android.widget.TextView tv11;
    public final android.widget.TextView tv2;
    public final android.widget.TextView tv22;
    public final android.widget.TextView tv3;
    public final android.widget.TextView tv4;
    public final android.widget.TextView tv42;
    public final android.widget.TextView tv5;
    public final android.widget.TextView tv51;
    public final android.widget.TextView tvDayPressure;
    public final android.widget.TextView tvDayPressureUnit;
    public final android.widget.TextView tvPressureRange;
    public final android.widget.TextView tvValue1;
    public final android.widget.TextView tvValue2;
    public final android.widget.TextView tvValue3;
    public final android.widget.TextView tvValue4;
    public final android.widget.TextView tvValue5;

    private FragmentWeekPressureBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.ConstraintLayout cslHeartPie, com.qcwireless.qcwatch.ui.base.view.QCirclePieView heartCircleView, com.qcwireless.qcwatch.ui.base.view.QStepComponentView pressureAvg, com.qcwireless.qcwatch.ui.base.view.QStepComponentView pressureTotal, com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qcDateChange, com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart qcPressureChart, android.widget.TextView topBg1, android.widget.TextView tv1, android.widget.TextView tv11, android.widget.TextView tv2, android.widget.TextView tv22, android.widget.TextView tv3, android.widget.TextView tv4, android.widget.TextView tv42, android.widget.TextView tv5, android.widget.TextView tv51, android.widget.TextView tvDayPressure, android.widget.TextView tvDayPressureUnit, android.widget.TextView tvPressureRange, android.widget.TextView tvValue1, android.widget.TextView tvValue2, android.widget.TextView tvValue3, android.widget.TextView tvValue4, android.widget.TextView tvValue5) {
        this.rootView = rootView;
        this.cslHeartPie = cslHeartPie;
        this.heartCircleView = heartCircleView;
        this.pressureAvg = pressureAvg;
        this.pressureTotal = pressureTotal;
        this.qcDateChange = qcDateChange;
        this.qcPressureChart = qcPressureChart;
        this.topBg1 = topBg1;
        this.tv1 = tv1;
        this.tv11 = tv11;
        this.tv2 = tv2;
        this.tv22 = tv22;
        this.tv3 = tv3;
        this.tv4 = tv4;
        this.tv42 = tv42;
        this.tv5 = tv5;
        this.tv51 = tv51;
        this.tvDayPressure = tvDayPressure;
        this.tvDayPressureUnit = tvDayPressureUnit;
        this.tvPressureRange = tvPressureRange;
        this.tvValue1 = tvValue1;
        this.tvValue2 = tvValue2;
        this.tvValue3 = tvValue3;
        this.tvValue4 = tvValue4;
        this.tvValue5 = tvValue5;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_week_pressure, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.csl_heart_pie;
        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_heart_pie);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.heart_circle_view;
            com.qcwireless.qcwatch.ui.base.view.QCirclePieView qCirclePieView = (com.qcwireless.qcwatch.ui.base.view.QCirclePieView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_circle_view);
            if (qCirclePieView != null) {
                i = com.qcwireless.qcwatch.R.id.pressure_avg;
                com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView = (com.qcwireless.qcwatch.ui.base.view.QStepComponentView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.pressure_avg);
                if (qStepComponentView != null) {
                    i = com.qcwireless.qcwatch.R.id.pressure_total;
                    com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView2 = (com.qcwireless.qcwatch.ui.base.view.QStepComponentView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.pressure_total);
                    if (qStepComponentView2 != null) {
                        i = com.qcwireless.qcwatch.R.id.qc_date_change;
                        com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qDateWeekSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                        if (qDateWeekSwitchView != null) {
                            i = com.qcwireless.qcwatch.R.id.qc_pressure_chart;
                            com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart qPressureWeekHistoryBarChart = (com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_pressure_chart);
                            if (qPressureWeekHistoryBarChart != null) {
                                i = com.qcwireless.qcwatch.R.id.top_bg_1;
                                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.top_bg_1);
                                if (textView != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_1;
                                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1);
                                    if (textView2 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_1_1;
                                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1_1);
                                        if (textView3 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_2;
                                            android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_2);
                                            if (textView4 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_2_2;
                                                android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_2_2);
                                                if (textView5 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_3;
                                                    android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_3);
                                                    if (textView6 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_4;
                                                        android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_4);
                                                        if (textView7 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_4_2;
                                                            android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_4_2);
                                                            if (textView8 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_5;
                                                                android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_5);
                                                                if (textView9 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_5_1;
                                                                    android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_5_1);
                                                                    if (textView10 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_day_pressure;
                                                                        android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_day_pressure);
                                                                        if (textView11 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_day_pressure_unit;
                                                                            android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_day_pressure_unit);
                                                                            if (textView12 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_pressure_range;
                                                                                android.widget.TextView textView13 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_pressure_range);
                                                                                if (textView13 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_value_1;
                                                                                    android.widget.TextView textView14 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_1);
                                                                                    if (textView14 != null) {
                                                                                        i = com.qcwireless.qcwatch.R.id.tv_value_2;
                                                                                        android.widget.TextView textView15 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_2);
                                                                                        if (textView15 != null) {
                                                                                            i = com.qcwireless.qcwatch.R.id.tv_value_3;
                                                                                            android.widget.TextView textView16 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_3);
                                                                                            if (textView16 != null) {
                                                                                                i = com.qcwireless.qcwatch.R.id.tv_value_4;
                                                                                                android.widget.TextView textView17 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_4);
                                                                                                if (textView17 != null) {
                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_value_5;
                                                                                                    android.widget.TextView textView18 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_5);
                                                                                                    if (textView18 != null) {
                                                                                                        return new com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, qCirclePieView, qStepComponentView, qStepComponentView2, qDateWeekSwitchView, qPressureWeekHistoryBarChart, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18);
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
