package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentMonthSleepBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout cslInfoView;
    public final com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView monthSleepBarView;
    public final com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qcDateChange;
    public final com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qcSleep1;
    public final com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qcSleep2;
    public final com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qcSleep3;
    public final com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qcSleep4;
    private final androidx.core.widget.NestedScrollView rootView;
    public final android.widget.TextView topBg1;
    public final android.widget.TextView tvInfo1;
    public final android.widget.TextView tvSleepAwake;
    public final android.widget.TextView tvSleepDeep;
    public final android.widget.TextView tvSleepH;
    public final android.widget.TextView tvSleepLight;
    public final android.widget.TextView tvSleepMin;
    public final android.widget.TextView tvSleepRange;
    public final android.widget.TextView tvSleepType;
    public final android.widget.TextView tvSleepUnit;

    private FragmentMonthSleepBinding(androidx.core.widget.NestedScrollView rootView, androidx.constraintlayout.widget.ConstraintLayout cslInfoView, com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView monthSleepBarView, com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qcDateChange, com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qcSleep1, com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qcSleep2, com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qcSleep3, com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qcSleep4, android.widget.TextView topBg1, android.widget.TextView tvInfo1, android.widget.TextView tvSleepAwake, android.widget.TextView tvSleepDeep, android.widget.TextView tvSleepH, android.widget.TextView tvSleepLight, android.widget.TextView tvSleepMin, android.widget.TextView tvSleepRange, android.widget.TextView tvSleepType, android.widget.TextView tvSleepUnit) {
        this.rootView = rootView;
        this.cslInfoView = cslInfoView;
        this.monthSleepBarView = monthSleepBarView;
        this.qcDateChange = qcDateChange;
        this.qcSleep1 = qcSleep1;
        this.qcSleep2 = qcSleep2;
        this.qcSleep3 = qcSleep3;
        this.qcSleep4 = qcSleep4;
        this.topBg1 = topBg1;
        this.tvInfo1 = tvInfo1;
        this.tvSleepAwake = tvSleepAwake;
        this.tvSleepDeep = tvSleepDeep;
        this.tvSleepH = tvSleepH;
        this.tvSleepLight = tvSleepLight;
        this.tvSleepMin = tvSleepMin;
        this.tvSleepRange = tvSleepRange;
        this.tvSleepType = tvSleepType;
        this.tvSleepUnit = tvSleepUnit;
    }

    public androidx.core.widget.NestedScrollView getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_month_sleep, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.csl_info_view;
        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_info_view);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.month_sleep_bar_view;
            com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView qSleepMonthBarView = (com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.month_sleep_bar_view);
            if (qSleepMonthBarView != null) {
                i = com.qcwireless.qcwatch.R.id.qc_date_change;
                com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qDateMonthSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                if (qDateMonthSwitchView != null) {
                    i = com.qcwireless.qcwatch.R.id.qc_sleep_1;
                    com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView = (com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_sleep_1);
                    if (qSleepAnalysisView != null) {
                        i = com.qcwireless.qcwatch.R.id.qc_sleep_2;
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView2 = (com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_sleep_2);
                        if (qSleepAnalysisView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.qc_sleep3;
                            com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView3 = (com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_sleep3);
                            if (qSleepAnalysisView3 != null) {
                                i = com.qcwireless.qcwatch.R.id.qc_sleep_4;
                                com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView4 = (com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_sleep_4);
                                if (qSleepAnalysisView4 != null) {
                                    i = com.qcwireless.qcwatch.R.id.top_bg_1;
                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.top_bg_1);
                                    if (textView != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_info_1;
                                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_1);
                                        if (textView2 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_sleep_awake;
                                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_awake);
                                            if (textView3 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_sleep_deep;
                                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_deep);
                                                if (textView4 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_sleep_h;
                                                    android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_h);
                                                    if (textView5 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_sleep_light;
                                                        android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_light);
                                                        if (textView6 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_sleep_min;
                                                            android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_min);
                                                            if (textView7 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_sleep_range;
                                                                android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_range);
                                                                if (textView8 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_sleep_type;
                                                                    android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_type);
                                                                    if (textView9 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_sleep_unit;
                                                                        android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_unit);
                                                                        if (textView10 != null) {
                                                                            return new com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding((androidx.core.widget.NestedScrollView) rootView, findChildViewById, qSleepMonthBarView, qDateMonthSwitchView, qSleepAnalysisView, qSleepAnalysisView2, qSleepAnalysisView3, qSleepAnalysisView4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
