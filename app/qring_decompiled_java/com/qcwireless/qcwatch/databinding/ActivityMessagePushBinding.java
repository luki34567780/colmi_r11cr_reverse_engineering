package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityMessagePushBinding implements androidx.viewbinding.ViewBinding {
    public final android.view.View line1;
    public final android.view.View line2;
    public final androidx.constraintlayout.widget.Group messagePushGroup;
    public final androidx.recyclerview.widget.RecyclerView pushRcv;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcMessageSwitch;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSmsSwitch;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvInfo1;

    private ActivityMessagePushBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.view.View line1, android.view.View line2, androidx.constraintlayout.widget.Group messagePushGroup, androidx.recyclerview.widget.RecyclerView pushRcv, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcMessageSwitch, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcSmsSwitch, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvInfo1) {
        this.rootView = rootView;
        this.line1 = line1;
        this.line2 = line2;
        this.messagePushGroup = messagePushGroup;
        this.pushRcv = pushRcv;
        this.qcMessageSwitch = qcMessageSwitch;
        this.qcSmsSwitch = qcSmsSwitch;
        this.titleBar = titleBar;
        this.tvInfo1 = tvInfo1;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_message_push, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.line_1;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.line_2;
            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_2);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.message_push_group;
                androidx.constraintlayout.widget.Group findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.message_push_group);
                if (findChildViewById3 != null) {
                    i = com.qcwireless.qcwatch.R.id.push_rcv;
                    androidx.recyclerview.widget.RecyclerView findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.push_rcv);
                    if (findChildViewById4 != null) {
                        i = com.qcwireless.qcwatch.R.id.qc_message_switch;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_message_switch);
                        if (qSettingItemWithClickSystem != null) {
                            i = com.qcwireless.qcwatch.R.id.qc_sms_switch;
                            com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_sms_switch);
                            if (qSettingItemWithClickSystem2 != null) {
                                i = com.qcwireless.qcwatch.R.id.titleBar;
                                android.view.View findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                if (findChildViewById5 != null) {
                                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById5);
                                    i = com.qcwireless.qcwatch.R.id.tv_info_1;
                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_1);
                                    if (textView != null) {
                                        return new com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, qSettingItemWithClickSystem, qSettingItemWithClickSystem2, bind, textView);
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
