package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityDebugBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnCopy;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcDebug;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcTest;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView text3;
    public final android.widget.TextView text4;
    public final android.widget.TextView tvShow;

    private ActivityDebugBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnCopy, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcDebug, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcTest, android.widget.TextView text3, android.widget.TextView text4, android.widget.TextView tvShow) {
        this.rootView = rootView;
        this.btnCopy = btnCopy;
        this.qcDebug = qcDebug;
        this.qcTest = qcTest;
        this.text3 = text3;
        this.text4 = text4;
        this.tvShow = tvShow;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDebugBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDebugBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_debug, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDebugBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_copy;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_copy);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.qc_debug;
            com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_debug);
            if (qSettingItemWithClickSystem != null) {
                i = com.qcwireless.qcwatch.R.id.qc_test;
                com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_test);
                if (qSettingItemWithClickSystem2 != null) {
                    i = com.qcwireless.qcwatch.R.id.text_3;
                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.text_3);
                    if (textView != null) {
                        i = com.qcwireless.qcwatch.R.id.text_4;
                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.text_4);
                        if (textView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_show;
                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_show);
                            if (textView3 != null) {
                                return new com.qcwireless.qcwatch.databinding.ActivityDebugBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, qSettingItemWithClickSystem, qSettingItemWithClickSystem2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
