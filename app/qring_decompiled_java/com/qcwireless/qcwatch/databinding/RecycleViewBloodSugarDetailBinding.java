package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleViewBloodSugarDetailBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView bloodSugarTime;
    public final android.widget.TextView bloodSugarValue;
    public final android.widget.ImageView imageSugar;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleViewBloodSugarDetailBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView bloodSugarTime, android.widget.TextView bloodSugarValue, android.widget.ImageView imageSugar) {
        this.rootView = rootView;
        this.bloodSugarTime = bloodSugarTime;
        this.bloodSugarValue = bloodSugarValue;
        this.imageSugar = imageSugar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewBloodSugarDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewBloodSugarDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycle_view_blood_sugar_detail, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewBloodSugarDetailBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.blood_sugar_time;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.blood_sugar_time);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.blood_sugar_value;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.blood_sugar_value);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.image_sugar;
                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_sugar);
                if (imageView != null) {
                    return new com.qcwireless.qcwatch.databinding.RecycleViewBloodSugarDetailBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, imageView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
