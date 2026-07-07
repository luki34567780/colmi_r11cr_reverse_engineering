package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityBloodSugarGuideBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvInfo1;
    public final android.widget.TextView tvInfo2;
    public final android.widget.ImageView watchDisplay;

    private ActivityBloodSugarGuideBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvInfo1, android.widget.TextView tvInfo2, android.widget.ImageView watchDisplay) {
        this.rootView = rootView;
        this.titleBar = titleBar;
        this.tvInfo1 = tvInfo1;
        this.tvInfo2 = tvInfo2;
        this.watchDisplay = watchDisplay;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodSugarGuideBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodSugarGuideBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_blood_sugar_guide, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodSugarGuideBinding bind(android.view.View rootView) {
        int i = 2131297388;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
        if (findChildViewById != null) {
            com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
            i = com.qcwireless.qcwatch.R.id.tv_info_1;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_1);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.tv_info_2;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info_2);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.watch_display;
                    android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.watch_display);
                    if (imageView != null) {
                        return new com.qcwireless.qcwatch.databinding.ActivityBloodSugarGuideBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, bind, textView, textView2, imageView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
