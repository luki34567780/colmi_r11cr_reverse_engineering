package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityThirdPathSyncBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView btnAuthor;
    public final android.view.View line1;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcGoogleFitSync;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvGoogleFit;
    public final android.widget.TextView userPrivacy;

    private ActivityThirdPathSyncBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView btnAuthor, android.view.View line1, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcGoogleFitSync, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvGoogleFit, android.widget.TextView userPrivacy) {
        this.rootView = rootView;
        this.btnAuthor = btnAuthor;
        this.line1 = line1;
        this.qcGoogleFitSync = qcGoogleFitSync;
        this.titleBar = titleBar;
        this.tvGoogleFit = tvGoogleFit;
        this.userPrivacy = userPrivacy;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_third_path_sync, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_author;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_author);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.line_1;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.qc_google_fit_sync;
                com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_google_fit_sync);
                if (qSettingItemWithClickSystem != null) {
                    i = 2131297388;
                    android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                    if (findChildViewById2 != null) {
                        com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2);
                        i = com.qcwireless.qcwatch.R.id.tv_google_fit;
                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_google_fit);
                        if (textView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.user_privacy;
                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_privacy);
                            if (textView3 != null) {
                                return new com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, findChildViewById, qSettingItemWithClickSystem, bind, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
