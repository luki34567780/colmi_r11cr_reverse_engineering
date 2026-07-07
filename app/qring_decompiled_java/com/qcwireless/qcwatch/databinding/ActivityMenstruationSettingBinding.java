package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityMenstruationSettingBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Group alarmGroup;
    public final android.view.View line1;
    public final android.view.View line2;
    public final androidx.constraintlayout.widget.ConstraintLayout menstruationGroup;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsAlarm1;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsAlarm2;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsAlarm3;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcMsAlarmSwitch;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsCycle;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsDuring;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsLast;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcMsSwitch;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvTitle1;
    public final android.widget.TextView tvTitle2;
    public final android.widget.TextView tvTitle3;

    private ActivityMenstruationSettingBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.Group alarmGroup, android.view.View line1, android.view.View line2, androidx.constraintlayout.widget.ConstraintLayout menstruationGroup, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsAlarm1, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsAlarm2, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsAlarm3, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcMsAlarmSwitch, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsCycle, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsDuring, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMsLast, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcMsSwitch, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvTitle1, android.widget.TextView tvTitle2, android.widget.TextView tvTitle3) {
        this.rootView = rootView;
        this.alarmGroup = alarmGroup;
        this.line1 = line1;
        this.line2 = line2;
        this.menstruationGroup = menstruationGroup;
        this.qcMsAlarm1 = qcMsAlarm1;
        this.qcMsAlarm2 = qcMsAlarm2;
        this.qcMsAlarm3 = qcMsAlarm3;
        this.qcMsAlarmSwitch = qcMsAlarmSwitch;
        this.qcMsCycle = qcMsCycle;
        this.qcMsDuring = qcMsDuring;
        this.qcMsLast = qcMsLast;
        this.qcMsSwitch = qcMsSwitch;
        this.titleBar = titleBar;
        this.tvTitle1 = tvTitle1;
        this.tvTitle2 = tvTitle2;
        this.tvTitle3 = tvTitle3;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_menstruation_setting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.alarm_group;
        androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.alarm_group);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.line_1;
            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.line_2;
                android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_2);
                if (findChildViewById3 != null) {
                    i = com.qcwireless.qcwatch.R.id.menstruation_group;
                    androidx.constraintlayout.widget.ConstraintLayout findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.menstruation_group);
                    if (findChildViewById4 != null) {
                        i = com.qcwireless.qcwatch.R.id.qc_ms_alarm_1;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_ms_alarm_1);
                        if (qSettingItem != null) {
                            i = com.qcwireless.qcwatch.R.id.qc_ms_alarm_2;
                            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_ms_alarm_2);
                            if (qSettingItem2 != null) {
                                i = com.qcwireless.qcwatch.R.id.qc_ms_alarm_3;
                                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem3 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_ms_alarm_3);
                                if (qSettingItem3 != null) {
                                    i = com.qcwireless.qcwatch.R.id.qc_ms_alarm_switch;
                                    com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_ms_alarm_switch);
                                    if (qSettingItemWithClickSystem != null) {
                                        i = com.qcwireless.qcwatch.R.id.qc_ms_cycle;
                                        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem4 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_ms_cycle);
                                        if (qSettingItem4 != null) {
                                            i = com.qcwireless.qcwatch.R.id.qc_ms_during;
                                            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem5 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_ms_during);
                                            if (qSettingItem5 != null) {
                                                i = com.qcwireless.qcwatch.R.id.qc_ms_last;
                                                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem6 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_ms_last);
                                                if (qSettingItem6 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.qc_ms_switch;
                                                    com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_ms_switch);
                                                    if (qSettingItemWithClickSystem2 != null) {
                                                        i = 2131297388;
                                                        android.view.View findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                                        if (findChildViewById5 != null) {
                                                            com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById5);
                                                            i = com.qcwireless.qcwatch.R.id.tv_title_1;
                                                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_1);
                                                            if (textView != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_title_2;
                                                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_2);
                                                                if (textView2 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_title_3;
                                                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_3);
                                                                    if (textView3 != null) {
                                                                        return new com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, qSettingItem, qSettingItem2, qSettingItem3, qSettingItemWithClickSystem, qSettingItem4, qSettingItem5, qSettingItem6, qSettingItemWithClickSystem2, bind, textView, textView2, textView3);
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
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
