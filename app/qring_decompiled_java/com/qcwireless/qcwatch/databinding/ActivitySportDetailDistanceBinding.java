package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivitySportDetailDistanceBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout detailCtl1;
    public final androidx.constraintlayout.widget.Guideline guideLine;
    public final com.qcwireless.qcwatch.ui.base.view.QCirclePieView heartCircleView;
    public final android.view.View line1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.ui.base.view.QHeartSportDetailLineChartView sportDetailHeartLine;
    public final com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportDurationTime;
    public final com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportHeart;
    public final com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportHourBufu;
    public final com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportHourSpeed;
    public final com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportKcal;
    public final com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportSpeed;
    public final com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportStepBuping;
    public final com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportStepCount;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tv1;
    public final android.widget.TextView tv2;
    public final android.widget.TextView tv3;
    public final android.widget.TextView tv4;
    public final android.widget.TextView tv5;
    public final android.widget.TextView tvDesc;
    public final android.widget.TextView tvHeartMaxInfo;
    public final android.widget.TextView tvHeartMaxValue;
    public final android.widget.TextView tvHeartMinInfo;
    public final android.widget.TextView tvHeartMinValue;
    public final android.widget.TextView tvHeartTitle;
    public final android.widget.TextView tvKcal;
    public final android.widget.TextView tvKcalUnit;
    public final android.widget.TextView tvSportName;
    public final android.widget.TextView tvSportStartTime;
    public final android.widget.TextView tvValue1;
    public final android.widget.TextView tvValue2;
    public final android.widget.TextView tvValue3;
    public final android.widget.TextView tvValue4;
    public final android.widget.TextView tvValue5;

    private ActivitySportDetailDistanceBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.ConstraintLayout detailCtl1, androidx.constraintlayout.widget.Guideline guideLine, com.qcwireless.qcwatch.ui.base.view.QCirclePieView heartCircleView, android.view.View line1, com.qcwireless.qcwatch.ui.base.view.QHeartSportDetailLineChartView sportDetailHeartLine, com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportDurationTime, com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportHeart, com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportHourBufu, com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportHourSpeed, com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportKcal, com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportSpeed, com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportStepBuping, com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem sportStepCount, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tv1, android.widget.TextView tv2, android.widget.TextView tv3, android.widget.TextView tv4, android.widget.TextView tv5, android.widget.TextView tvDesc, android.widget.TextView tvHeartMaxInfo, android.widget.TextView tvHeartMaxValue, android.widget.TextView tvHeartMinInfo, android.widget.TextView tvHeartMinValue, android.widget.TextView tvHeartTitle, android.widget.TextView tvKcal, android.widget.TextView tvKcalUnit, android.widget.TextView tvSportName, android.widget.TextView tvSportStartTime, android.widget.TextView tvValue1, android.widget.TextView tvValue2, android.widget.TextView tvValue3, android.widget.TextView tvValue4, android.widget.TextView tvValue5) {
        this.rootView = rootView;
        this.detailCtl1 = detailCtl1;
        this.guideLine = guideLine;
        this.heartCircleView = heartCircleView;
        this.line1 = line1;
        this.sportDetailHeartLine = sportDetailHeartLine;
        this.sportDurationTime = sportDurationTime;
        this.sportHeart = sportHeart;
        this.sportHourBufu = sportHourBufu;
        this.sportHourSpeed = sportHourSpeed;
        this.sportKcal = sportKcal;
        this.sportSpeed = sportSpeed;
        this.sportStepBuping = sportStepBuping;
        this.sportStepCount = sportStepCount;
        this.titleBar = titleBar;
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tv3 = tv3;
        this.tv4 = tv4;
        this.tv5 = tv5;
        this.tvDesc = tvDesc;
        this.tvHeartMaxInfo = tvHeartMaxInfo;
        this.tvHeartMaxValue = tvHeartMaxValue;
        this.tvHeartMinInfo = tvHeartMinInfo;
        this.tvHeartMinValue = tvHeartMinValue;
        this.tvHeartTitle = tvHeartTitle;
        this.tvKcal = tvKcal;
        this.tvKcalUnit = tvKcalUnit;
        this.tvSportName = tvSportName;
        this.tvSportStartTime = tvSportStartTime;
        this.tvValue1 = tvValue1;
        this.tvValue2 = tvValue2;
        this.tvValue3 = tvValue3;
        this.tvValue4 = tvValue4;
        this.tvValue5 = tvValue5;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySportDetailDistanceBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySportDetailDistanceBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_sport_detail_distance, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySportDetailDistanceBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.detail_ctl_1;
        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.detail_ctl_1);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.guide_line;
            androidx.constraintlayout.widget.Guideline findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.guide_line);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.heart_circle_view;
                com.qcwireless.qcwatch.ui.base.view.QCirclePieView qCirclePieView = (com.qcwireless.qcwatch.ui.base.view.QCirclePieView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_circle_view);
                if (qCirclePieView != null) {
                    i = com.qcwireless.qcwatch.R.id.line_1;
                    android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                    if (findChildViewById3 != null) {
                        i = com.qcwireless.qcwatch.R.id.sport_detail_heart_line;
                        com.qcwireless.qcwatch.ui.base.view.QHeartSportDetailLineChartView qHeartSportDetailLineChartView = (com.qcwireless.qcwatch.ui.base.view.QHeartSportDetailLineChartView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_detail_heart_line);
                        if (qHeartSportDetailLineChartView != null) {
                            i = com.qcwireless.qcwatch.R.id.sport_duration_time;
                            com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem qSportDetailItem = (com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_duration_time);
                            if (qSportDetailItem != null) {
                                i = com.qcwireless.qcwatch.R.id.sport_heart;
                                com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem qSportDetailItem2 = (com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_heart);
                                if (qSportDetailItem2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.sport_hour_bufu;
                                    com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem qSportDetailItem3 = (com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_hour_bufu);
                                    if (qSportDetailItem3 != null) {
                                        i = com.qcwireless.qcwatch.R.id.sport_hour_speed;
                                        com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem qSportDetailItem4 = (com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_hour_speed);
                                        if (qSportDetailItem4 != null) {
                                            i = com.qcwireless.qcwatch.R.id.sport_kcal;
                                            com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem qSportDetailItem5 = (com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_kcal);
                                            if (qSportDetailItem5 != null) {
                                                i = com.qcwireless.qcwatch.R.id.sport_speed;
                                                com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem qSportDetailItem6 = (com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_speed);
                                                if (qSportDetailItem6 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.sport_step_buping;
                                                    com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem qSportDetailItem7 = (com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_step_buping);
                                                    if (qSportDetailItem7 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.sport_step_count;
                                                        com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem qSportDetailItem8 = (com.qcwireless.qcwatch.ui.base.view.sport.QSportDetailItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_step_count);
                                                        if (qSportDetailItem8 != null) {
                                                            i = 2131297388;
                                                            android.view.View findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                                            if (findChildViewById4 != null) {
                                                                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById4);
                                                                i = com.qcwireless.qcwatch.R.id.tv_1;
                                                                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1);
                                                                if (textView != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_2;
                                                                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_2);
                                                                    if (textView2 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_3;
                                                                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_3);
                                                                        if (textView3 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_4;
                                                                            android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_4);
                                                                            if (textView4 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_5;
                                                                                android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_5);
                                                                                if (textView5 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_desc;
                                                                                    android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_desc);
                                                                                    if (textView6 != null) {
                                                                                        i = com.qcwireless.qcwatch.R.id.tv_heart_max_info;
                                                                                        android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_heart_max_info);
                                                                                        if (textView7 != null) {
                                                                                            i = com.qcwireless.qcwatch.R.id.tv_heart_max_value;
                                                                                            android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_heart_max_value);
                                                                                            if (textView8 != null) {
                                                                                                i = com.qcwireless.qcwatch.R.id.tv_heart_min_info;
                                                                                                android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_heart_min_info);
                                                                                                if (textView9 != null) {
                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_heart_min_value;
                                                                                                    android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_heart_min_value);
                                                                                                    if (textView10 != null) {
                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_heart_title;
                                                                                                        android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_heart_title);
                                                                                                        if (textView11 != null) {
                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_kcal;
                                                                                                            android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_kcal);
                                                                                                            if (textView12 != null) {
                                                                                                                i = com.qcwireless.qcwatch.R.id.tv_kcal_unit;
                                                                                                                android.widget.TextView textView13 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_kcal_unit);
                                                                                                                if (textView13 != null) {
                                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_sport_name;
                                                                                                                    android.widget.TextView textView14 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_name);
                                                                                                                    if (textView14 != null) {
                                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_sport_start_time;
                                                                                                                        android.widget.TextView textView15 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_start_time);
                                                                                                                        if (textView15 != null) {
                                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_value_1;
                                                                                                                            android.widget.TextView textView16 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_1);
                                                                                                                            if (textView16 != null) {
                                                                                                                                i = com.qcwireless.qcwatch.R.id.tv_value_2;
                                                                                                                                android.widget.TextView textView17 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_2);
                                                                                                                                if (textView17 != null) {
                                                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_value_3;
                                                                                                                                    android.widget.TextView textView18 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_3);
                                                                                                                                    if (textView18 != null) {
                                                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_value_4;
                                                                                                                                        android.widget.TextView textView19 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_4);
                                                                                                                                        if (textView19 != null) {
                                                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_value_5;
                                                                                                                                            android.widget.TextView textView20 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_5);
                                                                                                                                            if (textView20 != null) {
                                                                                                                                                return new com.qcwireless.qcwatch.databinding.ActivitySportDetailDistanceBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, findChildViewById2, qCirclePieView, findChildViewById3, qHeartSportDetailLineChartView, qSportDetailItem, qSportDetailItem2, qSportDetailItem3, qSportDetailItem4, qSportDetailItem5, qSportDetailItem6, qSportDetailItem7, qSportDetailItem8, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20);
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
