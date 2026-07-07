package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityBloodSugarBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem bloodSugarValueDetail;
    public final com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView bloodSugarView;
    public final android.widget.Button btnMeasure;
    public final androidx.constraintlayout.widget.ConstraintLayout currHeartCtl;
    public final android.widget.LinearLayout detailLayout;
    public final android.widget.ImageView imageHeart;
    public final android.view.View line1;
    public final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange;
    public final android.widget.LinearLayout rcvDetailLayout;
    public final androidx.recyclerview.widget.RecyclerView rcvSugarDetail;
    private final androidx.core.widget.NestedScrollView rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView topBg1;
    public final android.widget.TextView tvChartTitle;
    public final android.widget.TextView tvCurrHeart;
    public final android.widget.TextView tvCurrUnit;
    public final android.widget.TextView tvHM;
    public final android.widget.TextView tvHeart1;
    public final android.widget.TextView tvHeartTime;
    public final android.widget.TextView tvInfo1;
    public final android.widget.TextView tvListDetail;
    public final android.widget.TextView tvSugarValue;

    private ActivityBloodSugarBinding(androidx.core.widget.NestedScrollView rootView, com.qcwireless.qcwatch.ui.base.view.QSettingItem bloodSugarValueDetail, com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView bloodSugarView, android.widget.Button btnMeasure, androidx.constraintlayout.widget.ConstraintLayout currHeartCtl, android.widget.LinearLayout detailLayout, android.widget.ImageView imageHeart, android.view.View line1, com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange, android.widget.LinearLayout rcvDetailLayout, androidx.recyclerview.widget.RecyclerView rcvSugarDetail, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView topBg1, android.widget.TextView tvChartTitle, android.widget.TextView tvCurrHeart, android.widget.TextView tvCurrUnit, android.widget.TextView tvHM, android.widget.TextView tvHeart1, android.widget.TextView tvHeartTime, android.widget.TextView tvInfo1, android.widget.TextView tvListDetail, android.widget.TextView tvSugarValue) {
        this.rootView = rootView;
        this.bloodSugarValueDetail = bloodSugarValueDetail;
        this.bloodSugarView = bloodSugarView;
        this.btnMeasure = btnMeasure;
        this.currHeartCtl = currHeartCtl;
        this.detailLayout = detailLayout;
        this.imageHeart = imageHeart;
        this.line1 = line1;
        this.qcDateChange = qcDateChange;
        this.rcvDetailLayout = rcvDetailLayout;
        this.rcvSugarDetail = rcvSugarDetail;
        this.titleBar = titleBar;
        this.topBg1 = topBg1;
        this.tvChartTitle = tvChartTitle;
        this.tvCurrHeart = tvCurrHeart;
        this.tvCurrUnit = tvCurrUnit;
        this.tvHM = tvHM;
        this.tvHeart1 = tvHeart1;
        this.tvHeartTime = tvHeartTime;
        this.tvInfo1 = tvInfo1;
        this.tvListDetail = tvListDetail;
        this.tvSugarValue = tvSugarValue;
    }

    public androidx.core.widget.NestedScrollView getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_blood_sugar, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.blood_sugar_value_detail;
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.blood_sugar_value_detail);
        if (qSettingItem != null) {
            i = com.qcwireless.qcwatch.R.id.blood_sugar_view;
            com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView qBloodSugarLineChartView = (com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.blood_sugar_view);
            if (qBloodSugarLineChartView != null) {
                i = com.qcwireless.qcwatch.R.id.btn_measure;
                android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_measure);
                if (button != null) {
                    i = com.qcwireless.qcwatch.R.id.curr_heart_ctl;
                    androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.curr_heart_ctl);
                    if (findChildViewById != null) {
                        i = com.qcwireless.qcwatch.R.id.detail_layout;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.detail_layout);
                        if (linearLayout != null) {
                            i = com.qcwireless.qcwatch.R.id.image_heart;
                            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_heart);
                            if (imageView != null) {
                                i = com.qcwireless.qcwatch.R.id.line_1;
                                android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                                if (findChildViewById2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.qc_date_change;
                                    com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                                    if (qDateSwitchView != null) {
                                        i = com.qcwireless.qcwatch.R.id.rcv_detail_layout;
                                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_detail_layout);
                                        if (linearLayout2 != null) {
                                            i = com.qcwireless.qcwatch.R.id.rcv_sugar_detail;
                                            androidx.recyclerview.widget.RecyclerView findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_sugar_detail);
                                            if (findChildViewById3 != null) {
                                                i = 2131297388;
                                                android.view.View findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                                if (findChildViewById4 != null) {
                                                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById4);
                                                    i = com.qcwireless.qcwatch.R.id.top_bg_1;
                                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.top_bg_1);
                                                    if (textView != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_chart_title;
                                                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_chart_title);
                                                        if (textView2 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_curr_heart;
                                                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_curr_heart);
                                                            if (textView3 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_curr_unit;
                                                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_curr_unit);
                                                                if (textView4 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_h_m;
                                                                    android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_h_m);
                                                                    if (textView5 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_heart_1;
                                                                        android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_heart_1);
                                                                        if (textView6 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_heart_time;
                                                                            android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_heart_time);
                                                                            if (textView7 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_info_1;
                                                                                android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_1);
                                                                                if (textView8 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_list_detail;
                                                                                    android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_list_detail);
                                                                                    if (textView9 != null) {
                                                                                        i = com.qcwireless.qcwatch.R.id.tv_sugar_value;
                                                                                        android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sugar_value);
                                                                                        if (textView10 != null) {
                                                                                            return new com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding((androidx.core.widget.NestedScrollView) rootView, qSettingItem, qBloodSugarLineChartView, button, findChildViewById, linearLayout, imageView, findChildViewById2, qDateSwitchView, linearLayout2, findChildViewById3, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
