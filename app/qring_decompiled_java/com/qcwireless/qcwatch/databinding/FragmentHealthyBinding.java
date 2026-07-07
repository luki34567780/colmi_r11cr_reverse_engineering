package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentHealthyBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader classHeader;
    public final android.view.View healthyBottom1;
    public final com.qcwireless.qcwatch.ui.base.view.MyRecycleView healthyCardRcv;
    public final android.widget.TextView healthyTop1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.scwang.smart.refresh.layout.SmartRefreshLayout syncRefresh;

    private FragmentHealthyBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader classHeader, android.view.View healthyBottom1, com.qcwireless.qcwatch.ui.base.view.MyRecycleView healthyCardRcv, android.widget.TextView healthyTop1, com.scwang.smart.refresh.layout.SmartRefreshLayout syncRefresh) {
        this.rootView = rootView;
        this.classHeader = classHeader;
        this.healthyBottom1 = healthyBottom1;
        this.healthyCardRcv = healthyCardRcv;
        this.healthyTop1 = healthyTop1;
        this.syncRefresh = syncRefresh;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentHealthyBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentHealthyBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_healthy, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentHealthyBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.class_header;
        com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader classicsHeader = (com.qcwireless.qcwatch.ui.base.view.pullrefresh.ClassicsHeader) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.class_header);
        if (classicsHeader != null) {
            i = com.qcwireless.qcwatch.R.id.healthy_bottom_1;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.healthy_bottom_1);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.healthy_card_rcv;
                com.qcwireless.qcwatch.ui.base.view.MyRecycleView myRecycleView = (com.qcwireless.qcwatch.ui.base.view.MyRecycleView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.healthy_card_rcv);
                if (myRecycleView != null) {
                    i = com.qcwireless.qcwatch.R.id.healthy_top_1;
                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.healthy_top_1);
                    if (textView != null) {
                        i = com.qcwireless.qcwatch.R.id.sync_refresh;
                        com.scwang.smart.refresh.layout.SmartRefreshLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sync_refresh);
                        if (findChildViewById2 != null) {
                            return new com.qcwireless.qcwatch.databinding.FragmentHealthyBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, classicsHeader, findChildViewById, myRecycleView, textView, findChildViewById2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
