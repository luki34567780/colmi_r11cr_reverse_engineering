package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityDisturbBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Group disturbGroup;
    public final android.view.View line1;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcDisturbEnd;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcDisturbStart;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qcDisturbSwitch;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingDisturbManual;
    private final android.widget.LinearLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvDisturb;

    private ActivityDisturbBinding(android.widget.LinearLayout rootView, androidx.constraintlayout.widget.Group disturbGroup, android.view.View line1, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcDisturbEnd, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcDisturbStart, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qcDisturbSwitch, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingDisturbManual, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvDisturb) {
        this.rootView = rootView;
        this.disturbGroup = disturbGroup;
        this.line1 = line1;
        this.qcDisturbEnd = qcDisturbEnd;
        this.qcDisturbStart = qcDisturbStart;
        this.qcDisturbSwitch = qcDisturbSwitch;
        this.qcSettingDisturbManual = qcSettingDisturbManual;
        this.titleBar = titleBar;
        this.tvDisturb = tvDisturb;
    }

    public android.widget.LinearLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDisturbBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDisturbBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_disturb, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDisturbBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.disturb_group;
        androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.disturb_group);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.line_1;
            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.qc_disturb_end;
                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_disturb_end);
                if (qSettingItem != null) {
                    i = com.qcwireless.qcwatch.R.id.qc_disturb_start;
                    com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_disturb_start);
                    if (qSettingItem2 != null) {
                        i = com.qcwireless.qcwatch.R.id.qc_disturb_switch;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_disturb_switch);
                        if (qSettingItemWithClick != null) {
                            i = com.qcwireless.qcwatch.R.id.qc_setting_disturb_manual;
                            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem3 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_disturb_manual);
                            if (qSettingItem3 != null) {
                                i = com.qcwireless.qcwatch.R.id.titleBar;
                                android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                if (findChildViewById3 != null) {
                                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById3);
                                    i = com.qcwireless.qcwatch.R.id.tv_disturb;
                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_disturb);
                                    if (textView != null) {
                                        return new com.qcwireless.qcwatch.databinding.ActivityDisturbBinding((android.widget.LinearLayout) rootView, findChildViewById, findChildViewById2, qSettingItem, qSettingItem2, qSettingItemWithClick, qSettingItem3, bind, textView);
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
