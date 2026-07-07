package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleViewTemperatureDetailBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.ImageView temperatureIcon;
    public final android.widget.TextView temperatureTime;
    public final android.widget.TextView temperatureValue;
    public final android.widget.TextView temperatureValueUnit;

    private RecycleViewTemperatureDetailBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView temperatureIcon, android.widget.TextView temperatureTime, android.widget.TextView temperatureValue, android.widget.TextView temperatureValueUnit) {
        this.rootView = rootView;
        this.temperatureIcon = temperatureIcon;
        this.temperatureTime = temperatureTime;
        this.temperatureValue = temperatureValue;
        this.temperatureValueUnit = temperatureValueUnit;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewTemperatureDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewTemperatureDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycle_view_temperature_detail, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewTemperatureDetailBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.temperature_icon;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.temperature_icon);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.temperature_time;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.temperature_time);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.temperature_value;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.temperature_value);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.temperature_value_unit;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.temperature_value_unit);
                    if (textView3 != null) {
                        return new com.qcwireless.qcwatch.databinding.RecycleViewTemperatureDetailBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
