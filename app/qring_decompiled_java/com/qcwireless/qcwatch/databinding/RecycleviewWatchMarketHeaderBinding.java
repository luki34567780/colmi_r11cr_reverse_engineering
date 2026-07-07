package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewWatchMarketHeaderBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView rcvLocalView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewWatchMarketHeaderBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.recyclerview.widget.RecyclerView rcvLocalView) {
        this.rootView = rootView;
        this.rcvLocalView = rcvLocalView;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewWatchMarketHeaderBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewWatchMarketHeaderBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_watch_market_header, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewWatchMarketHeaderBinding bind(android.view.View rootView) {
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_local_view);
        if (findChildViewById != null) {
            return new com.qcwireless.qcwatch.databinding.RecycleviewWatchMarketHeaderBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.rcv_local_view)));
    }
}
