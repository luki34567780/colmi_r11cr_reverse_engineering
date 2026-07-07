package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemSportBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnSportGo;
    public final androidx.constraintlayout.widget.Group group1;
    public final android.widget.TextView homeSportDate;
    public final android.widget.TextView homeSportTitle;
    public final android.widget.TextView homeSportValue;
    public final com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView homeSportView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final androidx.constraintlayout.widget.ConstraintLayout scl1;
    public final android.widget.TextView tv1;
    public final android.widget.TextView tv2;
    public final android.widget.TextView tv3;
    public final android.widget.TextView tv4;
    public final android.widget.TextView tv4Unit;
    public final android.widget.TextView tv5;
    public final android.widget.TextView tv5Unit;
    public final android.widget.TextView tv6;
    public final android.widget.TextView tv6Unit;
    public final android.widget.TextView tvNoData;
    public final android.widget.TextView tvSportName;

    private RecycleviewItemSportBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnSportGo, androidx.constraintlayout.widget.Group group1, android.widget.TextView homeSportDate, android.widget.TextView homeSportTitle, android.widget.TextView homeSportValue, com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView homeSportView, androidx.constraintlayout.widget.ConstraintLayout scl1, android.widget.TextView tv1, android.widget.TextView tv2, android.widget.TextView tv3, android.widget.TextView tv4, android.widget.TextView tv4Unit, android.widget.TextView tv5, android.widget.TextView tv5Unit, android.widget.TextView tv6, android.widget.TextView tv6Unit, android.widget.TextView tvNoData, android.widget.TextView tvSportName) {
        this.rootView = rootView;
        this.btnSportGo = btnSportGo;
        this.group1 = group1;
        this.homeSportDate = homeSportDate;
        this.homeSportTitle = homeSportTitle;
        this.homeSportValue = homeSportValue;
        this.homeSportView = homeSportView;
        this.scl1 = scl1;
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tv3 = tv3;
        this.tv4 = tv4;
        this.tv4Unit = tv4Unit;
        this.tv5 = tv5;
        this.tv5Unit = tv5Unit;
        this.tv6 = tv6;
        this.tv6Unit = tv6Unit;
        this.tvNoData = tvNoData;
        this.tvSportName = tvSportName;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSportBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSportBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_sport, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSportBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_sport_go;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_sport_go);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.group_1;
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
                                i = com.qcwireless.qcwatch.R.id.scl_1;
                                androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.scl_1);
                                if (findChildViewById2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_1;
                                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1);
                                    if (textView4 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_2;
                                        android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_2);
                                        if (textView5 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_3;
                                            android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_3);
                                            if (textView6 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_4;
                                                android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_4);
                                                if (textView7 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_4_unit;
                                                    android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_4_unit);
                                                    if (textView8 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_5;
                                                        android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_5);
                                                        if (textView9 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_5_unit;
                                                            android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_5_unit);
                                                            if (textView10 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_6;
                                                                android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_6);
                                                                if (textView11 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_6_unit;
                                                                    android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_6_unit);
                                                                    if (textView12 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_no_data;
                                                                        android.widget.TextView textView13 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_no_data);
                                                                        if (textView13 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_sport_name;
                                                                            android.widget.TextView textView14 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_name);
                                                                            if (textView14 != null) {
                                                                                return new com.qcwireless.qcwatch.databinding.RecycleviewItemSportBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, findChildViewById, textView, textView2, textView3, pGHeartSportDetailLineChartView, findChildViewById2, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
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
