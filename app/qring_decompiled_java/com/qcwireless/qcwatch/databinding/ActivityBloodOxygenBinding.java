package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityBloodOxygenBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView bloodOxygenChatView;
    public final com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView bloodOxygenCircleView;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem boValueDetail;
    public final android.widget.Button btnMeasure;
    public final androidx.constraintlayout.widget.ConstraintLayout cslInfoView;
    public final androidx.constraintlayout.widget.ConstraintLayout cslPieView;
    public final androidx.constraintlayout.widget.ConstraintLayout currHeartCtl;
    public final android.widget.LinearLayout detailLayout;
    public final android.widget.ImageView imageHeart;
    public final android.widget.LinearLayout layout1;
    public final android.view.View line1;
    public final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qcSettingBloodOxygen;
    public final androidx.recyclerview.widget.RecyclerView rcvBloodOxygenDetail;
    public final android.widget.LinearLayout rcvDetailLayout;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView topBg1;
    public final android.widget.TextView tv1;
    public final android.widget.TextView tv4;
    public final android.widget.TextView tv5;
    public final android.widget.TextView tvBloodOxygenValue;
    public final android.widget.TextView tvChartTitle;
    public final android.widget.TextView tvCurrHeart;
    public final android.widget.TextView tvCurrUnit;
    public final android.widget.TextView tvHM;
    public final android.widget.TextView tvHeart1;
    public final android.widget.TextView tvHeartTime;
    public final android.widget.TextView tvInfo1;
    public final android.widget.TextView tvInfo2;
    public final android.widget.TextView tvListDetail;
    public final android.widget.TextView tvValue1;
    public final android.widget.TextView tvValue2;
    public final android.widget.TextView tvValue3;

    private ActivityBloodOxygenBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView bloodOxygenChatView, com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView bloodOxygenCircleView, com.qcwireless.qcwatch.ui.base.view.QSettingItem boValueDetail, android.widget.Button btnMeasure, androidx.constraintlayout.widget.ConstraintLayout cslInfoView, androidx.constraintlayout.widget.ConstraintLayout cslPieView, androidx.constraintlayout.widget.ConstraintLayout currHeartCtl, android.widget.LinearLayout detailLayout, android.widget.ImageView imageHeart, android.widget.LinearLayout layout1, android.view.View line1, com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange, com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qcSettingBloodOxygen, androidx.recyclerview.widget.RecyclerView rcvBloodOxygenDetail, android.widget.LinearLayout rcvDetailLayout, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView topBg1, android.widget.TextView tv1, android.widget.TextView tv4, android.widget.TextView tv5, android.widget.TextView tvBloodOxygenValue, android.widget.TextView tvChartTitle, android.widget.TextView tvCurrHeart, android.widget.TextView tvCurrUnit, android.widget.TextView tvHM, android.widget.TextView tvHeart1, android.widget.TextView tvHeartTime, android.widget.TextView tvInfo1, android.widget.TextView tvInfo2, android.widget.TextView tvListDetail, android.widget.TextView tvValue1, android.widget.TextView tvValue2, android.widget.TextView tvValue3) {
        this.rootView = rootView;
        this.bloodOxygenChatView = bloodOxygenChatView;
        this.bloodOxygenCircleView = bloodOxygenCircleView;
        this.boValueDetail = boValueDetail;
        this.btnMeasure = btnMeasure;
        this.cslInfoView = cslInfoView;
        this.cslPieView = cslPieView;
        this.currHeartCtl = currHeartCtl;
        this.detailLayout = detailLayout;
        this.imageHeart = imageHeart;
        this.layout1 = layout1;
        this.line1 = line1;
        this.qcDateChange = qcDateChange;
        this.qcSettingBloodOxygen = qcSettingBloodOxygen;
        this.rcvBloodOxygenDetail = rcvBloodOxygenDetail;
        this.rcvDetailLayout = rcvDetailLayout;
        this.titleBar = titleBar;
        this.topBg1 = topBg1;
        this.tv1 = tv1;
        this.tv4 = tv4;
        this.tv5 = tv5;
        this.tvBloodOxygenValue = tvBloodOxygenValue;
        this.tvChartTitle = tvChartTitle;
        this.tvCurrHeart = tvCurrHeart;
        this.tvCurrUnit = tvCurrUnit;
        this.tvHM = tvHM;
        this.tvHeart1 = tvHeart1;
        this.tvHeartTime = tvHeartTime;
        this.tvInfo1 = tvInfo1;
        this.tvInfo2 = tvInfo2;
        this.tvListDetail = tvListDetail;
        this.tvValue1 = tvValue1;
        this.tvValue2 = tvValue2;
        this.tvValue3 = tvValue3;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_blood_oxygen, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.blood_oxygen_chat_view;
        com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView qBloodOxygenLineChartView = (com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.blood_oxygen_chat_view);
        if (qBloodOxygenLineChartView != null) {
            i = com.qcwireless.qcwatch.R.id.blood_oxygen_circle_view;
            com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView qCircleBloodOxygenPieView = (com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.blood_oxygen_circle_view);
            if (qCircleBloodOxygenPieView != null) {
                i = com.qcwireless.qcwatch.R.id.bo_value_detail;
                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.bo_value_detail);
                if (qSettingItem != null) {
                    i = com.qcwireless.qcwatch.R.id.btn_measure;
                    android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_measure);
                    if (button != null) {
                        i = com.qcwireless.qcwatch.R.id.csl_info_view;
                        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_info_view);
                        if (findChildViewById != null) {
                            i = com.qcwireless.qcwatch.R.id.csl_pie_view;
                            androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_pie_view);
                            if (findChildViewById2 != null) {
                                i = com.qcwireless.qcwatch.R.id.curr_heart_ctl;
                                androidx.constraintlayout.widget.ConstraintLayout findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.curr_heart_ctl);
                                if (findChildViewById3 != null) {
                                    i = com.qcwireless.qcwatch.R.id.detail_layout;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.detail_layout);
                                    if (linearLayout != null) {
                                        i = com.qcwireless.qcwatch.R.id.image_heart;
                                        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_heart);
                                        if (imageView != null) {
                                            i = com.qcwireless.qcwatch.R.id.layout_1;
                                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.layout_1);
                                            if (linearLayout2 != null) {
                                                i = com.qcwireless.qcwatch.R.id.line_1;
                                                android.view.View findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                                                if (findChildViewById4 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.qc_date_change;
                                                    com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                                                    if (qDateSwitchView != null) {
                                                        i = com.qcwireless.qcwatch.R.id.qc_setting_blood_oxygen;
                                                        com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qSettingItemTitleSubTitleSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_blood_oxygen);
                                                        if (qSettingItemTitleSubTitleSystem != null) {
                                                            i = com.qcwireless.qcwatch.R.id.rcv_blood_oxygen_detail;
                                                            androidx.recyclerview.widget.RecyclerView findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_blood_oxygen_detail);
                                                            if (findChildViewById5 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.rcv_detail_layout;
                                                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_detail_layout);
                                                                if (linearLayout3 != null) {
                                                                    i = 2131297388;
                                                                    android.view.View findChildViewById6 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                                                    if (findChildViewById6 != null) {
                                                                        com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById6);
                                                                        i = com.qcwireless.qcwatch.R.id.top_bg_1;
                                                                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.top_bg_1);
                                                                        if (textView != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_1;
                                                                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1);
                                                                            if (textView2 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_4;
                                                                                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_4);
                                                                                if (textView3 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_5;
                                                                                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_5);
                                                                                    if (textView4 != null) {
                                                                                        i = com.qcwireless.qcwatch.R.id.tv_blood_oxygen_value;
                                                                                        android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_blood_oxygen_value);
                                                                                        if (textView5 != null) {
                                                                                            i = com.qcwireless.qcwatch.R.id.tv_chart_title;
                                                                                            android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_chart_title);
                                                                                            if (textView6 != null) {
                                                                                                i = com.qcwireless.qcwatch.R.id.tv_curr_heart;
                                                                                                android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_curr_heart);
                                                                                                if (textView7 != null) {
                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_curr_unit;
                                                                                                    android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_curr_unit);
                                                                                                    if (textView8 != null) {
                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_h_m;
                                                                                                        android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_h_m);
                                                                                                        if (textView9 != null) {
                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_heart_1;
                                                                                                            android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_heart_1);
                                                                                                            if (textView10 != null) {
                                                                                                                i = com.qcwireless.qcwatch.R.id.tv_heart_time;
                                                                                                                android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_heart_time);
                                                                                                                if (textView11 != null) {
                                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_info_1;
                                                                                                                    android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_1);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_info_2;
                                                                                                                        android.widget.TextView textView13 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_2);
                                                                                                                        if (textView13 != null) {
                                                                                                                            i = com.qcwireless.qcwatch.R.id.tv_list_detail;
                                                                                                                            android.widget.TextView textView14 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_list_detail);
                                                                                                                            if (textView14 != null) {
                                                                                                                                i = com.qcwireless.qcwatch.R.id.tv_value_1;
                                                                                                                                android.widget.TextView textView15 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_1);
                                                                                                                                if (textView15 != null) {
                                                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_value_2;
                                                                                                                                    android.widget.TextView textView16 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_2);
                                                                                                                                    if (textView16 != null) {
                                                                                                                                        i = com.qcwireless.qcwatch.R.id.tv_value_3;
                                                                                                                                        android.widget.TextView textView17 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_3);
                                                                                                                                        if (textView17 != null) {
                                                                                                                                            return new com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qBloodOxygenLineChartView, qCircleBloodOxygenPieView, qSettingItem, button, findChildViewById, findChildViewById2, findChildViewById3, linearLayout, imageView, linearLayout2, findChildViewById4, qDateSwitchView, qSettingItemTitleSubTitleSystem, findChildViewById5, linearLayout3, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17);
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
