package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityDeviceConnectWarmingBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvWarmingDesc;
    public final android.widget.TextView tvWarmingTitle;

    private ActivityDeviceConnectWarmingBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvWarmingDesc, android.widget.TextView tvWarmingTitle) {
        this.rootView = rootView;
        this.titleBar = titleBar;
        this.tvWarmingDesc = tvWarmingDesc;
        this.tvWarmingTitle = tvWarmingTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDeviceConnectWarmingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDeviceConnectWarmingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_device_connect_warming, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDeviceConnectWarmingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.titleBar;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
        if (findChildViewById != null) {
            com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_warming_desc);
            if (textView != null) {
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_warming_title);
                if (textView2 != null) {
                    return new com.qcwireless.qcwatch.databinding.ActivityDeviceConnectWarmingBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, bind, textView, textView2);
                }
                i = com.qcwireless.qcwatch.R.id.tv_warming_title;
            } else {
                i = com.qcwireless.qcwatch.R.id.tv_warming_desc;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
