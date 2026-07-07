package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentDayStepBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Group group1;
    public final android.widget.TextView homeSportDate;
    public final android.widget.TextView homeSportTitle;
    public final android.widget.TextView homeSportValue;
    public final com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView homeSportView;
    public final me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar pbCalorie;
    public final me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar pbDistance;
    public final me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar pbStep;
    public final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange;
    public final com.qcwireless.qcwatch.ui.base.view.QStepBarChart qcStepChart;
    private final androidx.core.widget.NestedScrollView rootView;
    public final androidx.constraintlayout.widget.ConstraintLayout scl1;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepAvg;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepCalorie;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepDistance;
    public final com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepTotal;
    public final androidx.constraintlayout.widget.ConstraintLayout todayStepActivity;
    public final androidx.constraintlayout.widget.ConstraintLayout todayStepLayout;
    public final android.widget.TextView topBg1;
    public final android.widget.TextView tv1;
    public final android.widget.TextView tv2;
    public final android.widget.TextView tv3;
    public final android.widget.TextView tv4;
    public final android.widget.TextView tv4Unit;
    public final android.widget.TextView tv5;
    public final android.widget.TextView tv5Unit;
    public final android.widget.TextView tv6;
    public final android.widget.TextView tv6Unit;
    public final android.widget.TextView tvCalorie1;
    public final android.widget.TextView tvCalorie2;
    public final android.widget.TextView tvDayStep;
    public final android.widget.TextView tvDayStepTitle;
    public final android.widget.TextView tvDayStepUnit;
    public final android.widget.TextView tvDistance1;
    public final android.widget.TextView tvDistance2;
    public final android.widget.TextView tvMoreText;
    public final android.widget.TextView tvSportName;
    public final android.widget.TextView tvStep1;
    public final android.widget.TextView tvStep2;
    public final android.widget.TextView tvStepRange;

    private FragmentDayStepBinding(androidx.core.widget.NestedScrollView rootView, androidx.constraintlayout.widget.Group group1, android.widget.TextView homeSportDate, android.widget.TextView homeSportTitle, android.widget.TextView homeSportValue, com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView homeSportView, me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar pbCalorie, me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar pbDistance, me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar pbStep, com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange, com.qcwireless.qcwatch.ui.base.view.QStepBarChart qcStepChart, androidx.constraintlayout.widget.ConstraintLayout scl1, com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepAvg, com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepCalorie, com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepDistance, com.qcwireless.qcwatch.ui.base.view.QStepComponentView stepTotal, androidx.constraintlayout.widget.ConstraintLayout todayStepActivity, androidx.constraintlayout.widget.ConstraintLayout todayStepLayout, android.widget.TextView topBg1, android.widget.TextView tv1, android.widget.TextView tv2, android.widget.TextView tv3, android.widget.TextView tv4, android.widget.TextView tv4Unit, android.widget.TextView tv5, android.widget.TextView tv5Unit, android.widget.TextView tv6, android.widget.TextView tv6Unit, android.widget.TextView tvCalorie1, android.widget.TextView tvCalorie2, android.widget.TextView tvDayStep, android.widget.TextView tvDayStepTitle, android.widget.TextView tvDayStepUnit, android.widget.TextView tvDistance1, android.widget.TextView tvDistance2, android.widget.TextView tvMoreText, android.widget.TextView tvSportName, android.widget.TextView tvStep1, android.widget.TextView tvStep2, android.widget.TextView tvStepRange) {
        this.rootView = rootView;
        this.group1 = group1;
        this.homeSportDate = homeSportDate;
        this.homeSportTitle = homeSportTitle;
        this.homeSportValue = homeSportValue;
        this.homeSportView = homeSportView;
        this.pbCalorie = pbCalorie;
        this.pbDistance = pbDistance;
        this.pbStep = pbStep;
        this.qcDateChange = qcDateChange;
        this.qcStepChart = qcStepChart;
        this.scl1 = scl1;
        this.stepAvg = stepAvg;
        this.stepCalorie = stepCalorie;
        this.stepDistance = stepDistance;
        this.stepTotal = stepTotal;
        this.todayStepActivity = todayStepActivity;
        this.todayStepLayout = todayStepLayout;
        this.topBg1 = topBg1;
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tv3 = tv3;
        this.tv4 = tv4;
        this.tv4Unit = tv4Unit;
        this.tv5 = tv5;
        this.tv5Unit = tv5Unit;
        this.tv6 = tv6;
        this.tv6Unit = tv6Unit;
        this.tvCalorie1 = tvCalorie1;
        this.tvCalorie2 = tvCalorie2;
        this.tvDayStep = tvDayStep;
        this.tvDayStepTitle = tvDayStepTitle;
        this.tvDayStepUnit = tvDayStepUnit;
        this.tvDistance1 = tvDistance1;
        this.tvDistance2 = tvDistance2;
        this.tvMoreText = tvMoreText;
        this.tvSportName = tvSportName;
        this.tvStep1 = tvStep1;
        this.tvStep2 = tvStep2;
        this.tvStepRange = tvStepRange;
    }

    public androidx.core.widget.NestedScrollView getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDayStepBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDayStepBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_day_step, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDayStepBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.group_1;
        androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.group_1);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.home_sport_date;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sport_date);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.home_sport_title;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sport_title);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.home_sport_value;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sport_value);
                    if (textView3 != null) {
                        i = com.qcwireless.qcwatch.R.id.home_sport_view;
                        com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView pGHeartSportDetailLineChartView = (com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sport_view);
                        if (pGHeartSportDetailLineChartView != null) {
                            i = com.qcwireless.qcwatch.R.id.pb_calorie;
                            me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.pb_calorie);
                            if (findChildViewById2 != null) {
                                i = com.qcwireless.qcwatch.R.id.pb_distance;
                                me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.pb_distance);
                                if (findChildViewById3 != null) {
                                    i = com.qcwireless.qcwatch.R.id.pb_step;
                                    me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.pb_step);
                                    if (findChildViewById4 != null) {
                                        i = com.qcwireless.qcwatch.R.id.qc_date_change;
                                        com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                                        if (qDateSwitchView != null) {
                                            i = com.qcwireless.qcwatch.R.id.qc_step_chart;
                                            com.qcwireless.qcwatch.ui.base.view.QStepBarChart qStepBarChart = (com.qcwireless.qcwatch.ui.base.view.QStepBarChart) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_step_chart);
                                            if (qStepBarChart != null) {
                                                i = com.qcwireless.qcwatch.R.id.scl_1;
                                                androidx.constraintlayout.widget.ConstraintLayout findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.scl_1);
                                                if (findChildViewById5 != null) {
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
                                                                    i = com.qcwireless.qcwatch.R.id.today_step_activity;
                                                                    androidx.constraintlayout.widget.ConstraintLayout findChildViewById6 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.today_step_activity);
                                                                    if (findChildViewById6 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.today_step_layout;
                                                                        androidx.constraintlayout.widget.ConstraintLayout findChildViewById7 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.today_step_layout);
                                                                        if (findChildViewById7 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.top_bg_1;
                                                                            android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.top_bg_1);
                                                                            if (textView4 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_1;
                                                                                android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1);
                                                                                if (textView5 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_2;
                                                                                    android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_2);
                                                                                    if (textView6 != null) {
                                                                                        i = com.qcwireless.qcwatch.R.id.tv_3;
                                                                                        android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_3);
                                                                                        if (textView7 != null) {
                                                                                            i = com.qcwireless.qcwatch.R.id.tv_4;
                                                                                            android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_4);
                                                                                            if (textView8 != null) {
                                                                                                i = com.qcwireless.qcwatch.R.id.tv_4_unit;
                                                                                                android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_4_unit);
                                                                                                if (textView9 != null) {
                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_5;
                                                                                                    android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_5);
                                                                                                    if (textView10 != null) {
                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_5_unit;
                                                                                                        android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_5_unit);
                                                                                                        if (textView11 != null) {
                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_6;
                                                                                                            android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_6);
                                                                                                            if (textView12 != null) {
                                                                                                                i = com.qcwireless.qcwatch.R.id.tv_6_unit;
                                                                                                                android.widget.TextView textView13 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_6_unit);
                                                                                                                if (textView13 != null) {
                                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_calorie_1;
                                                                                                                    android.widget.TextView textView14 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_calorie_1);
                                                                                                                    if (textView14 != null) {
                                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_calorie_2;
                                                                                                                        android.widget.TextView textView15 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_calorie_2);
                                                                                                                        if (textView15 != null) {
                                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_day_step;
                                                                                                                            android.widget.TextView textView16 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_day_step);
                                                                                                                            if (textView16 != null) {
                                                                                                                                i = com.qcwireless.qcwatch.R.id.tv_day_step_title;
                                                                                                                                android.widget.TextView textView17 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_day_step_title);
                                                                                                                                if (textView17 != null) {
                                                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_day_step_unit;
                                                                                                                                    android.widget.TextView textView18 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_day_step_unit);
                                                                                                                                    if (textView18 != null) {
                                                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_distance_1;
                                                                                                                                        android.widget.TextView textView19 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_distance_1);
                                                                                                                                        if (textView19 != null) {
                                                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_distance_2;
                                                                                                                                            android.widget.TextView textView20 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_distance_2);
                                                                                                                                            if (textView20 != null) {
                                                                                                                                                i = com.qcwireless.qcwatch.R.id.tv_more_text;
                                                                                                                                                android.widget.TextView textView21 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_more_text);
                                                                                                                                                if (textView21 != null) {
                                                                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_sport_name;
                                                                                                                                                    android.widget.TextView textView22 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_name);
                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_step_1;
                                                                                                                                                        android.widget.TextView textView23 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_step_1);
                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_step_2;
                                                                                                                                                            android.widget.TextView textView24 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_step_2);
                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                i = com.qcwireless.qcwatch.R.id.tv_step_range;
                                                                                                                                                                android.widget.TextView textView25 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_step_range);
                                                                                                                                                                if (textView25 != null) {
                                                                                                                                                                    return new com.qcwireless.qcwatch.databinding.FragmentDayStepBinding((androidx.core.widget.NestedScrollView) rootView, findChildViewById, textView, textView2, textView3, pGHeartSportDetailLineChartView, findChildViewById2, findChildViewById3, findChildViewById4, qDateSwitchView, qStepBarChart, findChildViewById5, qStepComponentView, qStepComponentView2, qStepComponentView3, qStepComponentView4, findChildViewById6, findChildViewById7, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25);
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
