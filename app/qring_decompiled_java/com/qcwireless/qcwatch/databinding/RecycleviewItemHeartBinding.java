package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemHeartBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.LinearLayout heartLl;
    public final androidx.constraintlayout.widget.Group heartMeasuringGroup;
    public final android.widget.TextView homeHeartDate;
    public final android.widget.TextView homeHeartTitle;
    public final android.widget.TextView homeHeartUnit;
    public final android.widget.TextView homeHeartValue;
    public final android.widget.TextView homeHeartValueMeasuring;
    public final android.widget.TextView homeHeartValueMeasuring1;
    public final com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView homeHeartView;
    public final android.widget.TextView homeTextMeasureHeart;
    public final android.widget.ImageView imageIcon;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvNoData;

    private RecycleviewItemHeartBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.LinearLayout heartLl, androidx.constraintlayout.widget.Group heartMeasuringGroup, android.widget.TextView homeHeartDate, android.widget.TextView homeHeartTitle, android.widget.TextView homeHeartUnit, android.widget.TextView homeHeartValue, android.widget.TextView homeHeartValueMeasuring, android.widget.TextView homeHeartValueMeasuring1, com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView homeHeartView, android.widget.TextView homeTextMeasureHeart, android.widget.ImageView imageIcon, android.widget.TextView tvNoData) {
        this.rootView = rootView;
        this.heartLl = heartLl;
        this.heartMeasuringGroup = heartMeasuringGroup;
        this.homeHeartDate = homeHeartDate;
        this.homeHeartTitle = homeHeartTitle;
        this.homeHeartUnit = homeHeartUnit;
        this.homeHeartValue = homeHeartValue;
        this.homeHeartValueMeasuring = homeHeartValueMeasuring;
        this.homeHeartValueMeasuring1 = homeHeartValueMeasuring1;
        this.homeHeartView = homeHeartView;
        this.homeTextMeasureHeart = homeTextMeasureHeart;
        this.imageIcon = imageIcon;
        this.tvNoData = tvNoData;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemHeartBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemHeartBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_heart, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemHeartBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.heart_ll;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_ll);
        if (linearLayout != null) {
            i = com.qcwireless.qcwatch.R.id.heart_measuring_group;
            androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_measuring_group);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.home_heart_date;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_date);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.home_heart_title;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_title);
                    if (textView2 != null) {
                        i = com.qcwireless.qcwatch.R.id.home_heart_unit;
                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_unit);
                        if (textView3 != null) {
                            i = com.qcwireless.qcwatch.R.id.home_heart_value;
                            android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_value);
                            if (textView4 != null) {
                                i = com.qcwireless.qcwatch.R.id.home_heart_value_measuring;
                                android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_value_measuring);
                                if (textView5 != null) {
                                    i = com.qcwireless.qcwatch.R.id.home_heart_value_measuring_1;
                                    android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_value_measuring_1);
                                    if (textView6 != null) {
                                        i = com.qcwireless.qcwatch.R.id.home_heart_view;
                                        com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView qHomeHeartLineChartView = (com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_view);
                                        if (qHomeHeartLineChartView != null) {
                                            i = com.qcwireless.qcwatch.R.id.home_text_measure_heart;
                                            android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_text_measure_heart);
                                            if (textView7 != null) {
                                                i = com.qcwireless.qcwatch.R.id.image_icon;
                                                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_icon);
                                                if (imageView != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_no_data;
                                                    android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_no_data);
                                                    if (textView8 != null) {
                                                        return new com.qcwireless.qcwatch.databinding.RecycleviewItemHeartBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, linearLayout, findChildViewById, textView, textView2, textView3, textView4, textView5, textView6, qHomeHeartLineChartView, textView7, imageView, textView8);
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
