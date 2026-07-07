package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityHealthyCheckBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcMoreHeartWarming;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreHeartWarmingUp;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSettingBloodOxygen;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSettingHeart;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSettingHeartNot;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSettingPressure;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityHealthyCheckBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcMoreHeartWarming, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreHeartWarmingUp, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSettingBloodOxygen, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSettingHeart, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSettingHeartNot, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSettingPressure, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.qcMoreHeartWarming = qcMoreHeartWarming;
        this.qcMoreHeartWarmingUp = qcMoreHeartWarmingUp;
        this.qcSettingBloodOxygen = qcSettingBloodOxygen;
        this.qcSettingHeart = qcSettingHeart;
        this.qcSettingHeartNot = qcSettingHeartNot;
        this.qcSettingPressure = qcSettingPressure;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_healthy_check, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.qc_more_heart_warming;
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_more_heart_warming);
        if (qSettingItemWithClickSystem != null) {
            i = com.qcwireless.qcwatch.R.id.qc_more_heart_warming_up;
            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_more_heart_warming_up);
            if (qSettingItem != null) {
                i = com.qcwireless.qcwatch.R.id.qc_setting_blood_oxygen;
                com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_blood_oxygen);
                if (qSettingItemWithClickSystem2 != null) {
                    i = com.qcwireless.qcwatch.R.id.qc_setting_heart;
                    com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem3 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_heart);
                    if (qSettingItemWithClickSystem3 != null) {
                        i = com.qcwireless.qcwatch.R.id.qc_setting_heart_not;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem4 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_heart_not);
                        if (qSettingItemWithClickSystem4 != null) {
                            i = com.qcwireless.qcwatch.R.id.qc_setting_pressure;
                            com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem5 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_pressure);
                            if (qSettingItemWithClickSystem5 != null) {
                                i = com.qcwireless.qcwatch.R.id.titleBar;
                                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                if (findChildViewById != null) {
                                    return new com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qSettingItemWithClickSystem, qSettingItem, qSettingItemWithClickSystem2, qSettingItemWithClickSystem3, qSettingItemWithClickSystem4, qSettingItemWithClickSystem5, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById));
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
