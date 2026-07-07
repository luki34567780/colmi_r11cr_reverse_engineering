package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivitySleepBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.FrameLayout sleepContainer;
    public final com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView sleepQsvView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivitySleepBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.FrameLayout sleepContainer, com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView sleepQsvView, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.sleepContainer = sleepContainer;
        this.sleepQsvView = sleepQsvView;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySleepBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySleepBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_sleep, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySleepBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.sleepContainer;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sleepContainer);
        if (frameLayout != null) {
            i = com.qcwireless.qcwatch.R.id.sleep_qsv_view;
            com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = (com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sleep_qsv_view);
            if (qSwitchButtonView != null) {
                i = 2131297388;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                if (findChildViewById != null) {
                    return new com.qcwireless.qcwatch.databinding.ActivitySleepBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, frameLayout, qSwitchButtonView, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById));
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
