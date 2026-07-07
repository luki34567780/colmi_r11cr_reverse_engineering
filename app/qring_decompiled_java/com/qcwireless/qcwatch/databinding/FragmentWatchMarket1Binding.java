package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentWatchMarket1Binding implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView rcvLocalView;
    public final com.qcwireless.qcwatch.ui.base.view.MyRecycleView rcvNetworkView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private FragmentWatchMarket1Binding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.recyclerview.widget.RecyclerView rcvLocalView, com.qcwireless.qcwatch.ui.base.view.MyRecycleView rcvNetworkView) {
        this.rootView = rootView;
        this.rcvLocalView = rcvLocalView;
        this.rcvNetworkView = rcvNetworkView;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWatchMarket1Binding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWatchMarket1Binding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_watch_market_1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWatchMarket1Binding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.rcv_local_view;
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_local_view);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.rcv_network_view;
            com.qcwireless.qcwatch.ui.base.view.MyRecycleView myRecycleView = (com.qcwireless.qcwatch.ui.base.view.MyRecycleView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_network_view);
            if (myRecycleView != null) {
                return new com.qcwireless.qcwatch.databinding.FragmentWatchMarket1Binding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, myRecycleView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
