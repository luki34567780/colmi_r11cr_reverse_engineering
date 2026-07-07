package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityAboutBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView appIcon;
    public final android.view.View line1;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcAppCache;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tv1;
    public final android.widget.TextView tv2;
    public final android.widget.TextView tvAppName;
    public final android.widget.TextView tvAppVersion;
    public final android.widget.TextView userAgreement;
    public final android.widget.TextView userPrivacy;

    private ActivityAboutBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView appIcon, android.view.View line1, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcAppCache, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tv1, android.widget.TextView tv2, android.widget.TextView tvAppName, android.widget.TextView tvAppVersion, android.widget.TextView userAgreement, android.widget.TextView userPrivacy) {
        this.rootView = rootView;
        this.appIcon = appIcon;
        this.line1 = line1;
        this.qcAppCache = qcAppCache;
        this.titleBar = titleBar;
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tvAppName = tvAppName;
        this.tvAppVersion = tvAppVersion;
        this.userAgreement = userAgreement;
        this.userPrivacy = userPrivacy;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAboutBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAboutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_about, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAboutBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.app_icon;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.app_icon);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.line_1;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.qc_app_cache;
                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_app_cache);
                if (qSettingItem != null) {
                    i = 2131297388;
                    android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                    if (findChildViewById2 != null) {
                        com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2);
                        i = com.qcwireless.qcwatch.R.id.tv_1;
                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1);
                        if (textView != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_2;
                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_2);
                            if (textView2 != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_app_name;
                                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_app_name);
                                if (textView3 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_app_version;
                                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_app_version);
                                    if (textView4 != null) {
                                        i = com.qcwireless.qcwatch.R.id.user_agreement;
                                        android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_agreement);
                                        if (textView5 != null) {
                                            i = com.qcwireless.qcwatch.R.id.user_privacy;
                                            android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_privacy);
                                            if (textView6 != null) {
                                                return new com.qcwireless.qcwatch.databinding.ActivityAboutBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, findChildViewById, qSettingItem, bind, textView, textView2, textView3, textView4, textView5, textView6);
                                            }
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
