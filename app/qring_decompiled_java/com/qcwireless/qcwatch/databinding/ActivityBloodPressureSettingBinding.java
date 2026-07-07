package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityBloodPressureSettingBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private ActivityBloodPressureSettingBinding(androidx.constraintlayout.widget.ConstraintLayout rootView) {
        this.rootView = rootView;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodPressureSettingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodPressureSettingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_blood_pressure_setting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodPressureSettingBinding bind(android.view.View rootView) {
        java.util.Objects.requireNonNull(rootView, "rootView");
        return new com.qcwireless.qcwatch.databinding.ActivityBloodPressureSettingBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView);
    }
}
