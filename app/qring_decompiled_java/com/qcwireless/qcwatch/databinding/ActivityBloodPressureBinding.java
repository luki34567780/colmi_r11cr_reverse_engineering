package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityBloodPressureBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView bloodPressureChatView;
    public final android.widget.TextView bpValue;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem bpValueDetail;
    public final android.widget.LinearLayout detailLayout;
    public final androidx.constraintlayout.widget.Guideline guide1;
    public final android.widget.LinearLayout layout1;
    public final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qcSettingBloodPressure;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView topBg1;
    public final android.widget.TextView tvHM;
    public final android.widget.TextView tvInfo1;
    public final android.widget.TextView tvInfo2;
    public final android.widget.TextView tvText1;
    public final android.widget.TextView tvText2;

    private ActivityBloodPressureBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView bloodPressureChatView, android.widget.TextView bpValue, com.qcwireless.qcwatch.ui.base.view.QSettingItem bpValueDetail, android.widget.LinearLayout detailLayout, androidx.constraintlayout.widget.Guideline guide1, android.widget.LinearLayout layout1, com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange, com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qcSettingBloodPressure, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView topBg1, android.widget.TextView tvHM, android.widget.TextView tvInfo1, android.widget.TextView tvInfo2, android.widget.TextView tvText1, android.widget.TextView tvText2) {
        this.rootView = rootView;
        this.bloodPressureChatView = bloodPressureChatView;
        this.bpValue = bpValue;
        this.bpValueDetail = bpValueDetail;
        this.detailLayout = detailLayout;
        this.guide1 = guide1;
        this.layout1 = layout1;
        this.qcDateChange = qcDateChange;
        this.qcSettingBloodPressure = qcSettingBloodPressure;
        this.titleBar = titleBar;
        this.topBg1 = topBg1;
        this.tvHM = tvHM;
        this.tvInfo1 = tvInfo1;
        this.tvInfo2 = tvInfo2;
        this.tvText1 = tvText1;
        this.tvText2 = tvText2;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_blood_pressure, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.blood_pressure_chat_view;
        com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView qBloodPressureChartView = (com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.blood_pressure_chat_view);
        if (qBloodPressureChartView != null) {
            i = com.qcwireless.qcwatch.R.id.bp_value;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.bp_value);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.bp_value_detail;
                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.bp_value_detail);
                if (qSettingItem != null) {
                    i = com.qcwireless.qcwatch.R.id.detail_layout;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.detail_layout);
                    if (linearLayout != null) {
                        i = com.qcwireless.qcwatch.R.id.guide_1;
                        androidx.constraintlayout.widget.Guideline findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.guide_1);
                        if (findChildViewById != null) {
                            i = com.qcwireless.qcwatch.R.id.layout_1;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.layout_1);
                            if (linearLayout2 != null) {
                                i = com.qcwireless.qcwatch.R.id.qc_date_change;
                                com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                                if (qDateSwitchView != null) {
                                    i = com.qcwireless.qcwatch.R.id.qc_setting_blood_pressure;
                                    com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qSettingItemTitleSubTitleSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_blood_pressure);
                                    if (qSettingItemTitleSubTitleSystem != null) {
                                        i = 2131297388;
                                        android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                        if (findChildViewById2 != null) {
                                            com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2);
                                            i = com.qcwireless.qcwatch.R.id.top_bg_1;
                                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.top_bg_1);
                                            if (textView2 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_h_m;
                                                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_h_m);
                                                if (textView3 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_info_1;
                                                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_1);
                                                    if (textView4 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_info_2;
                                                        android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_2);
                                                        if (textView5 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_text_1;
                                                            android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_1);
                                                            if (textView6 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_text_2;
                                                                android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_2);
                                                                if (textView7 != null) {
                                                                    return new com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qBloodPressureChartView, textView, qSettingItem, linearLayout, findChildViewById, linearLayout2, qDateSwitchView, qSettingItemTitleSubTitleSystem, bind, textView2, textView3, textView4, textView5, textView6, textView7);
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
