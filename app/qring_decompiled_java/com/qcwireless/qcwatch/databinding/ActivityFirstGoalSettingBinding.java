package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityFirstGoalSettingBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView firstGoalRcv;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityFirstGoalSettingBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.recyclerview.widget.RecyclerView firstGoalRcv, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.firstGoalRcv = firstGoalRcv;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFirstGoalSettingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFirstGoalSettingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_first_goal_setting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFirstGoalSettingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.first_goal_rcv;
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.first_goal_rcv);
        if (findChildViewById != null) {
            i = 2131297388;
            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
            if (findChildViewById2 != null) {
                return new com.qcwireless.qcwatch.databinding.ActivityFirstGoalSettingBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2));
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
