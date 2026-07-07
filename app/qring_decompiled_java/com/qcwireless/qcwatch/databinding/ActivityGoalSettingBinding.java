package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityGoalSettingBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingCalorie;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingDistance;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingSleepTime;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingSportTime;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingStep;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityGoalSettingBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingCalorie, com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingDistance, com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingSleepTime, com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingSportTime, com.qcwireless.qcwatch.ui.base.view.QSettingItem goalSettingStep, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.goalSettingCalorie = goalSettingCalorie;
        this.goalSettingDistance = goalSettingDistance;
        this.goalSettingSleepTime = goalSettingSleepTime;
        this.goalSettingSportTime = goalSettingSportTime;
        this.goalSettingStep = goalSettingStep;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_goal_setting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.goal_setting_calorie;
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.goal_setting_calorie);
        if (qSettingItem != null) {
            i = com.qcwireless.qcwatch.R.id.goal_setting_distance;
            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.goal_setting_distance);
            if (qSettingItem2 != null) {
                i = com.qcwireless.qcwatch.R.id.goal_setting_sleep_time;
                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem3 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.goal_setting_sleep_time);
                if (qSettingItem3 != null) {
                    i = com.qcwireless.qcwatch.R.id.goal_setting_sport_time;
                    com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem4 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.goal_setting_sport_time);
                    if (qSettingItem4 != null) {
                        i = com.qcwireless.qcwatch.R.id.goal_setting_step;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem5 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.goal_setting_step);
                        if (qSettingItem5 != null) {
                            i = 2131297388;
                            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                            if (findChildViewById != null) {
                                return new com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qSettingItem, qSettingItem2, qSettingItem3, qSettingItem4, qSettingItem5, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById));
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
