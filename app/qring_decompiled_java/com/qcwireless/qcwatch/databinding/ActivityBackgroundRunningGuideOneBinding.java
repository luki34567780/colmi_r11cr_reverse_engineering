package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityBackgroundRunningGuideOneBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView icon1;
    public final android.widget.ImageView icon2;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvGoSetting;
    public final android.widget.TextView tvText1;
    public final android.widget.TextView tvText2;
    public final android.widget.TextView tvText3;
    public final android.widget.TextView tvText4;

    private ActivityBackgroundRunningGuideOneBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView icon1, android.widget.ImageView icon2, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvGoSetting, android.widget.TextView tvText1, android.widget.TextView tvText2, android.widget.TextView tvText3, android.widget.TextView tvText4) {
        this.rootView = rootView;
        this.icon1 = icon1;
        this.icon2 = icon2;
        this.titleBar = titleBar;
        this.tvGoSetting = tvGoSetting;
        this.tvText1 = tvText1;
        this.tvText2 = tvText2;
        this.tvText3 = tvText3;
        this.tvText4 = tvText4;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideOneBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideOneBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_background_running_guide_one, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideOneBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.icon_1;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.icon_1);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.icon_2;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.icon_2);
            if (imageView2 != null) {
                i = 2131297388;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                if (findChildViewById != null) {
                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                    i = com.qcwireless.qcwatch.R.id.tv_go_setting;
                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_go_setting);
                    if (textView != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_text_1;
                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_1);
                        if (textView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_text_2;
                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_2);
                            if (textView3 != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_text_3;
                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_3);
                                if (textView4 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_text_4;
                                    android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_4);
                                    if (textView5 != null) {
                                        return new com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideOneBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, bind, textView, textView2, textView3, textView4, textView5);
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
