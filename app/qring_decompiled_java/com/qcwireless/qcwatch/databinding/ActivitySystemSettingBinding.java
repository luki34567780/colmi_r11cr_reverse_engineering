package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivitySystemSettingBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreFactory;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreRestart;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivitySystemSettingBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreFactory, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreRestart, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.qcMoreFactory = qcMoreFactory;
        this.qcMoreRestart = qcMoreRestart;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySystemSettingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySystemSettingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_system_setting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySystemSettingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.qc_more_factory;
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_more_factory);
        if (qSettingItem != null) {
            i = com.qcwireless.qcwatch.R.id.qc_more_restart;
            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_more_restart);
            if (qSettingItem2 != null) {
                i = com.qcwireless.qcwatch.R.id.titleBar;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                if (findChildViewById != null) {
                    return new com.qcwireless.qcwatch.databinding.ActivitySystemSettingBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qSettingItem, qSettingItem2, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById));
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
