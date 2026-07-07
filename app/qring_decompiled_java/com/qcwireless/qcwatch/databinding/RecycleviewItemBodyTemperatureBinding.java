package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemBodyTemperatureBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView homeBodyTempDate;
    public final android.widget.TextView homeBodyTempTitle;
    public final android.widget.TextView homeBodyTempValue;
    public final android.widget.TextView homeStepDistanceUnit;
    public final com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView homeTemperatureView;
    public final android.widget.ImageView imageNoData;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemBodyTemperatureBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView homeBodyTempDate, android.widget.TextView homeBodyTempTitle, android.widget.TextView homeBodyTempValue, android.widget.TextView homeStepDistanceUnit, com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView homeTemperatureView, android.widget.ImageView imageNoData) {
        this.rootView = rootView;
        this.homeBodyTempDate = homeBodyTempDate;
        this.homeBodyTempTitle = homeBodyTempTitle;
        this.homeBodyTempValue = homeBodyTempValue;
        this.homeStepDistanceUnit = homeStepDistanceUnit;
        this.homeTemperatureView = homeTemperatureView;
        this.imageNoData = imageNoData;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemBodyTemperatureBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemBodyTemperatureBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_body_temperature, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemBodyTemperatureBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.home_body_temp_date;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_body_temp_date);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.home_body_temp_title;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_body_temp_title);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.home_body_temp_value;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_body_temp_value);
                if (textView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.home_step_distance_unit;
                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_step_distance_unit);
                    if (textView4 != null) {
                        i = com.qcwireless.qcwatch.R.id.home_temperature_view;
                        com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView qTemperatureLineHomeChartView = (com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_temperature_view);
                        if (qTemperatureLineHomeChartView != null) {
                            i = com.qcwireless.qcwatch.R.id.image_no_data;
                            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_no_data);
                            if (imageView != null) {
                                return new com.qcwireless.qcwatch.databinding.RecycleviewItemBodyTemperatureBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3, textView4, qTemperatureLineHomeChartView, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
