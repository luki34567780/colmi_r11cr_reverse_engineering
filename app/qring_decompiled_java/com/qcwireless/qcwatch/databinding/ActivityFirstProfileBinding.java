package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityFirstProfileBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ProgressBar progressBar;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final com.qcwireless.qcwatch.ui.base.view.ucenter.NoScrollViewPager vp2;

    private ActivityFirstProfileBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ProgressBar progressBar, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, com.qcwireless.qcwatch.ui.base.view.ucenter.NoScrollViewPager vp2) {
        this.rootView = rootView;
        this.progressBar = progressBar;
        this.titleBar = titleBar;
        this.vp2 = vp2;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_first_profile, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.progress_bar;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.progress_bar);
        if (progressBar != null) {
            i = 2131297388;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
            if (findChildViewById != null) {
                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                com.qcwireless.qcwatch.ui.base.view.ucenter.NoScrollViewPager noScrollViewPager = (com.qcwireless.qcwatch.ui.base.view.ucenter.NoScrollViewPager) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.vp2);
                if (noScrollViewPager != null) {
                    return new com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, progressBar, bind, noScrollViewPager);
                }
                i = com.qcwireless.qcwatch.R.id.vp2;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
