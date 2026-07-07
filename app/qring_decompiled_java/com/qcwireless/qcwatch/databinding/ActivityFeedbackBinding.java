package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityFeedbackBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout feedbackSuggest;
    public final androidx.constraintlayout.widget.ConstraintLayout networkLayout;
    public final androidx.recyclerview.widget.RecyclerView rcvFeatures;
    public final androidx.recyclerview.widget.RecyclerView rcvFw;
    public final androidx.recyclerview.widget.RecyclerView rcvHw;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityFeedbackBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.ConstraintLayout feedbackSuggest, androidx.constraintlayout.widget.ConstraintLayout networkLayout, androidx.recyclerview.widget.RecyclerView rcvFeatures, androidx.recyclerview.widget.RecyclerView rcvFw, androidx.recyclerview.widget.RecyclerView rcvHw, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.feedbackSuggest = feedbackSuggest;
        this.networkLayout = networkLayout;
        this.rcvFeatures = rcvFeatures;
        this.rcvFw = rcvFw;
        this.rcvHw = rcvHw;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFeedbackBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFeedbackBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_feedback, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFeedbackBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.feedback_suggest;
        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.feedback_suggest);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.network_layout;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.network_layout);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.rcv_features;
                androidx.recyclerview.widget.RecyclerView findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_features);
                if (findChildViewById3 != null) {
                    i = com.qcwireless.qcwatch.R.id.rcv_fw;
                    androidx.recyclerview.widget.RecyclerView findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_fw);
                    if (findChildViewById4 != null) {
                        i = com.qcwireless.qcwatch.R.id.rcv_hw;
                        androidx.recyclerview.widget.RecyclerView findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_hw);
                        if (findChildViewById5 != null) {
                            i = 2131297388;
                            android.view.View findChildViewById6 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                            if (findChildViewById6 != null) {
                                return new com.qcwireless.qcwatch.databinding.ActivityFeedbackBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById6));
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
