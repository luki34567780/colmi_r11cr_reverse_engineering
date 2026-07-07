package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityGpsHistoryBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.FrameLayout gpsContainer;
    public final com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qsvView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityGpsHistoryBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.FrameLayout gpsContainer, com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qsvView, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.gpsContainer = gpsContainer;
        this.qsvView = qsvView;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGpsHistoryBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGpsHistoryBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_gps_history, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGpsHistoryBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.gpsContainer;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gpsContainer);
        if (frameLayout != null) {
            i = com.qcwireless.qcwatch.R.id.qsv_view;
            com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = (com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qsv_view);
            if (qSwitchButtonView != null) {
                i = 2131297388;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                if (findChildViewById != null) {
                    return new com.qcwireless.qcwatch.databinding.ActivityGpsHistoryBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, frameLayout, qSwitchButtonView, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById));
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
