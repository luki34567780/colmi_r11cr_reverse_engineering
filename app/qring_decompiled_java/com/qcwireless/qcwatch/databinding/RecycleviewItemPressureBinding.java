package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemPressureBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Group heartMeasuringGroup;
    public final android.widget.TextView homeBoDate;
    public final android.widget.TextView homeBoUnit;
    public final android.widget.TextView homeHeartValueMeasuring;
    public final android.widget.TextView homeHeartValueMeasuring1;
    public final android.widget.TextView homePressureTitle;
    public final android.widget.TextView homePressureValue;
    public final com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView homePressureView;
    public final android.widget.TextView homeTextMeasure;
    public final android.widget.ImageView imageIcon;
    public final android.widget.LinearLayout pressureLl;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvNoData;

    private RecycleviewItemPressureBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.Group heartMeasuringGroup, android.widget.TextView homeBoDate, android.widget.TextView homeBoUnit, android.widget.TextView homeHeartValueMeasuring, android.widget.TextView homeHeartValueMeasuring1, android.widget.TextView homePressureTitle, android.widget.TextView homePressureValue, com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView homePressureView, android.widget.TextView homeTextMeasure, android.widget.ImageView imageIcon, android.widget.LinearLayout pressureLl, android.widget.TextView tvNoData) {
        this.rootView = rootView;
        this.heartMeasuringGroup = heartMeasuringGroup;
        this.homeBoDate = homeBoDate;
        this.homeBoUnit = homeBoUnit;
        this.homeHeartValueMeasuring = homeHeartValueMeasuring;
        this.homeHeartValueMeasuring1 = homeHeartValueMeasuring1;
        this.homePressureTitle = homePressureTitle;
        this.homePressureValue = homePressureValue;
        this.homePressureView = homePressureView;
        this.homeTextMeasure = homeTextMeasure;
        this.imageIcon = imageIcon;
        this.pressureLl = pressureLl;
        this.tvNoData = tvNoData;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemPressureBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemPressureBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_pressure, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemPressureBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.heart_measuring_group;
        androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_measuring_group);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.home_bo_date;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_date);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.home_bo_unit;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_unit);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.home_heart_value_measuring;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_value_measuring);
                    if (textView3 != null) {
                        i = com.qcwireless.qcwatch.R.id.home_heart_value_measuring_1;
                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_value_measuring_1);
                        if (textView4 != null) {
                            i = com.qcwireless.qcwatch.R.id.home_pressure_title;
                            android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_pressure_title);
                            if (textView5 != null) {
                                i = com.qcwireless.qcwatch.R.id.home_pressure_value;
                                android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_pressure_value);
                                if (textView6 != null) {
                                    i = com.qcwireless.qcwatch.R.id.home_pressure_view;
                                    com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView qPressureLineChartHomeView = (com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_pressure_view);
                                    if (qPressureLineChartHomeView != null) {
                                        i = com.qcwireless.qcwatch.R.id.home_text_measure;
                                        android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_text_measure);
                                        if (textView7 != null) {
                                            i = com.qcwireless.qcwatch.R.id.image_icon;
                                            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_icon);
                                            if (imageView != null) {
                                                i = com.qcwireless.qcwatch.R.id.pressure_ll;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.pressure_ll);
                                                if (linearLayout != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_no_data;
                                                    android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_no_data);
                                                    if (textView8 != null) {
                                                        return new com.qcwireless.qcwatch.databinding.RecycleviewItemPressureBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, textView, textView2, textView3, textView4, textView5, textView6, qPressureLineChartHomeView, textView7, imageView, linearLayout, textView8);
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
