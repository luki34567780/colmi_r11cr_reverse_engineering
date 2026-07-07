package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityDeviceFirmwareUpdateChinaBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnGoTo;
    public final com.qcwireless.qcwatch.ui.base.view.QProgressCircle progressValue;
    private final androidx.core.widget.NestedScrollView rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvError;
    public final android.widget.TextView tvProgressUnit;
    public final android.widget.TextView tvProgressValue;
    public final android.widget.TextView tvUpdateDesc;
    public final android.widget.TextView tvUpdateDescTitle;
    public final android.widget.TextView tvWarming;

    private ActivityDeviceFirmwareUpdateChinaBinding(androidx.core.widget.NestedScrollView rootView, android.widget.Button btnGoTo, com.qcwireless.qcwatch.ui.base.view.QProgressCircle progressValue, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvError, android.widget.TextView tvProgressUnit, android.widget.TextView tvProgressValue, android.widget.TextView tvUpdateDesc, android.widget.TextView tvUpdateDescTitle, android.widget.TextView tvWarming) {
        this.rootView = rootView;
        this.btnGoTo = btnGoTo;
        this.progressValue = progressValue;
        this.titleBar = titleBar;
        this.tvError = tvError;
        this.tvProgressUnit = tvProgressUnit;
        this.tvProgressValue = tvProgressValue;
        this.tvUpdateDesc = tvUpdateDesc;
        this.tvUpdateDescTitle = tvUpdateDescTitle;
        this.tvWarming = tvWarming;
    }

    public androidx.core.widget.NestedScrollView getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_device_firmware_update_china, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_go_to;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_go_to);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.progress_value;
            com.qcwireless.qcwatch.ui.base.view.QProgressCircle qProgressCircle = (com.qcwireless.qcwatch.ui.base.view.QProgressCircle) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.progress_value);
            if (qProgressCircle != null) {
                i = 2131297388;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                if (findChildViewById != null) {
                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                    i = com.qcwireless.qcwatch.R.id.tv_error;
                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_error);
                    if (textView != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_progress_unit;
                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_progress_unit);
                        if (textView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_progress_value;
                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_progress_value);
                            if (textView3 != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_update_desc;
                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_update_desc);
                                if (textView4 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_update_desc_title;
                                    android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_update_desc_title);
                                    if (textView5 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_warming;
                                        android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_warming);
                                        if (textView6 != null) {
                                            return new com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding((androidx.core.widget.NestedScrollView) rootView, button, qProgressCircle, bind, textView, textView2, textView3, textView4, textView5, textView6);
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
