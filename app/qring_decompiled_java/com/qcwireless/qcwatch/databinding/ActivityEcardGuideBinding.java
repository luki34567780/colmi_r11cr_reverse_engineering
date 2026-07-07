package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityEcardGuideBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView rcvGuide;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityEcardGuideBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.recyclerview.widget.RecyclerView rcvGuide, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.rcvGuide = rcvGuide;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityEcardGuideBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityEcardGuideBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_ecard_guide, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityEcardGuideBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.rcv_guide;
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_guide);
        if (findChildViewById != null) {
            i = 2131297388;
            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
            if (findChildViewById2 != null) {
                return new com.qcwireless.qcwatch.databinding.ActivityEcardGuideBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2));
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
