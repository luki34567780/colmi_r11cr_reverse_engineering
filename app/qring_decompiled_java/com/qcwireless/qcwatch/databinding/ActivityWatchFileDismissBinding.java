package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityWatchFileDismissBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QProgressCircle progressValue;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvError;
    public final android.widget.TextView tvFileStatus;
    public final android.widget.TextView tvProgressUnit;
    public final android.widget.TextView tvProgressValue;
    public final android.widget.TextView tvWarming;

    private ActivityWatchFileDismissBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QProgressCircle progressValue, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvError, android.widget.TextView tvFileStatus, android.widget.TextView tvProgressUnit, android.widget.TextView tvProgressValue, android.widget.TextView tvWarming) {
        this.rootView = rootView;
        this.progressValue = progressValue;
        this.titleBar = titleBar;
        this.tvError = tvError;
        this.tvFileStatus = tvFileStatus;
        this.tvProgressUnit = tvProgressUnit;
        this.tvProgressValue = tvProgressValue;
        this.tvWarming = tvWarming;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_watch_file_dismiss, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.progress_value;
        com.qcwireless.qcwatch.ui.base.view.QProgressCircle qProgressCircle = (com.qcwireless.qcwatch.ui.base.view.QProgressCircle) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.progress_value);
        if (qProgressCircle != null) {
            i = 2131297388;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
            if (findChildViewById != null) {
                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                i = com.qcwireless.qcwatch.R.id.tv_error;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_error);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_file_status;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_file_status);
                    if (textView2 != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_progress_unit;
                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_progress_unit);
                        if (textView3 != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_progress_value;
                            android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_progress_value);
                            if (textView4 != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_warming;
                                android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_warming);
                                if (textView5 != null) {
                                    return new com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qProgressCircle, bind, textView, textView2, textView3, textView4, textView5);
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
