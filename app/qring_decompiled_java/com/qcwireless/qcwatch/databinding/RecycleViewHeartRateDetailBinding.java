package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleViewHeartRateDetailBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView heartRateTime;
    public final android.widget.TextView heartRateValue;
    public final android.widget.TextView heartRateValueUnit;
    public final android.widget.ImageView imageHeartIcon;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleViewHeartRateDetailBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView heartRateTime, android.widget.TextView heartRateValue, android.widget.TextView heartRateValueUnit, android.widget.ImageView imageHeartIcon) {
        this.rootView = rootView;
        this.heartRateTime = heartRateTime;
        this.heartRateValue = heartRateValue;
        this.heartRateValueUnit = heartRateValueUnit;
        this.imageHeartIcon = imageHeartIcon;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewHeartRateDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewHeartRateDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycle_view_heart_rate_detail, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewHeartRateDetailBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.heart_rate_time;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_rate_time);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.heart_rate_value;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_rate_value);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.heart_rate_value_unit;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_rate_value_unit);
                if (textView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.image_heart_icon;
                    android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_heart_icon);
                    if (imageView != null) {
                        return new com.qcwireless.qcwatch.databinding.RecycleViewHeartRateDetailBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3, imageView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
