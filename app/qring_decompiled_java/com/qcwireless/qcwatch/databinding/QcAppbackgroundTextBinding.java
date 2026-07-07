package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcAppbackgroundTextBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView appDes;
    public final android.widget.TextView appTitle;
    public final android.widget.TextView btnAppSetting;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private QcAppbackgroundTextBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView appDes, android.widget.TextView appTitle, android.widget.TextView btnAppSetting) {
        this.rootView = rootView;
        this.appDes = appDes;
        this.appTitle = appTitle;
        this.btnAppSetting = btnAppSetting;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.QcAppbackgroundTextBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.QcAppbackgroundTextBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.qc_appbackground_text, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.QcAppbackgroundTextBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.app_des;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.app_des);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.app_title;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.app_title);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.btn_app_setting;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_app_setting);
                if (textView3 != null) {
                    return new com.qcwireless.qcwatch.databinding.QcAppbackgroundTextBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
