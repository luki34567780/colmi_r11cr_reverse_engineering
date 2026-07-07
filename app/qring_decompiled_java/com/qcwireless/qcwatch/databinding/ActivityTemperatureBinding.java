package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityTemperatureBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout cslInfoView;
    public final androidx.constraintlayout.widget.ConstraintLayout cslPieView;
    public final android.widget.LinearLayout detailLayout;
    public final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView temperatureChatView;
    public final com.qcwireless.qcwatch.ui.base.view.QCirclePieView temperatureCircleView;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem temperatureValueDetail;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView topBg1;
    public final android.widget.TextView tv1;
    public final android.widget.TextView tv4;
    public final android.widget.TextView tv5;
    public final android.widget.TextView tvHM;
    public final android.widget.TextView tvInfo1;
    public final android.widget.TextView tvInfo2;
    public final android.widget.TextView tvTemperatureUnit;
    public final android.widget.TextView tvTemperatureValue;
    public final android.widget.TextView tvValue1;
    public final android.widget.TextView tvValue2;
    public final android.widget.TextView tvValue3;

    private ActivityTemperatureBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.ConstraintLayout cslInfoView, androidx.constraintlayout.widget.ConstraintLayout cslPieView, android.widget.LinearLayout detailLayout, com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange, com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView temperatureChatView, com.qcwireless.qcwatch.ui.base.view.QCirclePieView temperatureCircleView, com.qcwireless.qcwatch.ui.base.view.QSettingItem temperatureValueDetail, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView topBg1, android.widget.TextView tv1, android.widget.TextView tv4, android.widget.TextView tv5, android.widget.TextView tvHM, android.widget.TextView tvInfo1, android.widget.TextView tvInfo2, android.widget.TextView tvTemperatureUnit, android.widget.TextView tvTemperatureValue, android.widget.TextView tvValue1, android.widget.TextView tvValue2, android.widget.TextView tvValue3) {
        this.rootView = rootView;
        this.cslInfoView = cslInfoView;
        this.cslPieView = cslPieView;
        this.detailLayout = detailLayout;
        this.qcDateChange = qcDateChange;
        this.temperatureChatView = temperatureChatView;
        this.temperatureCircleView = temperatureCircleView;
        this.temperatureValueDetail = temperatureValueDetail;
        this.titleBar = titleBar;
        this.topBg1 = topBg1;
        this.tv1 = tv1;
        this.tv4 = tv4;
        this.tv5 = tv5;
        this.tvHM = tvHM;
        this.tvInfo1 = tvInfo1;
        this.tvInfo2 = tvInfo2;
        this.tvTemperatureUnit = tvTemperatureUnit;
        this.tvTemperatureValue = tvTemperatureValue;
        this.tvValue1 = tvValue1;
        this.tvValue2 = tvValue2;
        this.tvValue3 = tvValue3;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_temperature, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.csl_info_view;
        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_info_view);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.csl_pie_view;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_pie_view);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.detail_layout;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.detail_layout);
                if (linearLayout != null) {
                    i = com.qcwireless.qcwatch.R.id.qc_date_change;
                    com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                    if (qDateSwitchView != null) {
                        i = com.qcwireless.qcwatch.R.id.temperature_chat_view;
                        com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView qTemperatureLineChartView = (com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.temperature_chat_view);
                        if (qTemperatureLineChartView != null) {
                            i = com.qcwireless.qcwatch.R.id.temperature_circle_view;
                            com.qcwireless.qcwatch.ui.base.view.QCirclePieView qCirclePieView = (com.qcwireless.qcwatch.ui.base.view.QCirclePieView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.temperature_circle_view);
                            if (qCirclePieView != null) {
                                i = com.qcwireless.qcwatch.R.id.temperature_value_detail;
                                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.temperature_value_detail);
                                if (qSettingItem != null) {
                                    i = 2131297388;
                                    android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                    if (findChildViewById3 != null) {
                                        com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById3);
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
                                                        i = com.qcwireless.qcwatch.R.id.tv_h_m;
                                                        android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_h_m);
                                                        if (textView5 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_info_1;
                                                            android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_1);
                                                            if (textView6 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_info_2;
                                                                android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_2);
                                                                if (textView7 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_temperature_unit;
                                                                    android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_temperature_unit);
                                                                    if (textView8 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_temperature_value;
                                                                        android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_temperature_value);
                                                                        if (textView9 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_value_1;
                                                                            android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_1);
                                                                            if (textView10 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_value_2;
                                                                                android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_2);
                                                                                if (textView11 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_value_3;
                                                                                    android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_value_3);
                                                                                    if (textView12 != null) {
                                                                                        return new com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, findChildViewById2, linearLayout, qDateSwitchView, qTemperatureLineChartView, qCirclePieView, qSettingItem, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
