package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleViewPressureManualDetailAppBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageSpo2;
    public final android.widget.TextView pressureTime;
    public final android.widget.TextView pressureValue;
    public final android.widget.TextView pressureValueStatus;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleViewPressureManualDetailAppBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageSpo2, android.widget.TextView pressureTime, android.widget.TextView pressureValue, android.widget.TextView pressureValueStatus) {
        this.rootView = rootView;
        this.imageSpo2 = imageSpo2;
        this.pressureTime = pressureTime;
        this.pressureValue = pressureValue;
        this.pressureValueStatus = pressureValueStatus;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewPressureManualDetailAppBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewPressureManualDetailAppBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycle_view_pressure_manual_detail_app, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewPressureManualDetailAppBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_spo2;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_spo2);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.pressure_time;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.pressure_time);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.pressure_value;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.pressure_value);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.pressure_value_status;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.pressure_value_status);
                    if (textView3 != null) {
                        return new com.qcwireless.qcwatch.databinding.RecycleViewPressureManualDetailAppBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
