package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentStepBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.view.View statusBarView;
    public final android.widget.FrameLayout stepContainer;
    public final com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView stepQsvView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private FragmentStepBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.view.View statusBarView, android.widget.FrameLayout stepContainer, com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView stepQsvView, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.statusBarView = statusBarView;
        this.stepContainer = stepContainer;
        this.stepQsvView = stepQsvView;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentStepBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentStepBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_step, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentStepBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.status_bar_view;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.status_bar_view);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.stepContainer;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.stepContainer);
            if (frameLayout != null) {
                i = com.qcwireless.qcwatch.R.id.step_qsv_view;
                com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = (com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.step_qsv_view);
                if (qSwitchButtonView != null) {
                    i = 2131297388;
                    android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                    if (findChildViewById2 != null) {
                        return new com.qcwireless.qcwatch.databinding.FragmentStepBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, frameLayout, qSwitchButtonView, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2));
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
