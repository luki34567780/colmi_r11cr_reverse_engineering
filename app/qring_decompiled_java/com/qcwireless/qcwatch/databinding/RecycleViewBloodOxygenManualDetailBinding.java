package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleViewBloodOxygenManualDetailBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView bloodOxygenTime;
    public final android.widget.TextView bloodOxygenValue;
    public final android.widget.ImageView imageSpo2;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleViewBloodOxygenManualDetailBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView bloodOxygenTime, android.widget.TextView bloodOxygenValue, android.widget.ImageView imageSpo2) {
        this.rootView = rootView;
        this.bloodOxygenTime = bloodOxygenTime;
        this.bloodOxygenValue = bloodOxygenValue;
        this.imageSpo2 = imageSpo2;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewBloodOxygenManualDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewBloodOxygenManualDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycle_view_blood_oxygen_manual_detail, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewBloodOxygenManualDetailBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.blood_oxygen_time;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.blood_oxygen_time);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.blood_oxygen_value;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.blood_oxygen_value);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.image_spo2;
                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_spo2);
                if (imageView != null) {
                    return new com.qcwireless.qcwatch.databinding.RecycleViewBloodOxygenManualDetailBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, imageView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
