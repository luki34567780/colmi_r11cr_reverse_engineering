package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentDialMarketBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnTryAgain;
    public final androidx.constraintlayout.widget.ConstraintLayout ctlNoDevice;
    public final androidx.constraintlayout.widget.ConstraintLayout ctlNoNetwork;
    public final com.qcwireless.qcwatch.ui.base.view.MyRecycleView dialCardRcv;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvNoDeviceTitle;
    public final android.widget.TextView tvNoNetwork;

    private FragmentDialMarketBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnTryAgain, androidx.constraintlayout.widget.ConstraintLayout ctlNoDevice, androidx.constraintlayout.widget.ConstraintLayout ctlNoNetwork, com.qcwireless.qcwatch.ui.base.view.MyRecycleView dialCardRcv, android.widget.TextView tvNoDeviceTitle, android.widget.TextView tvNoNetwork) {
        this.rootView = rootView;
        this.btnTryAgain = btnTryAgain;
        this.ctlNoDevice = ctlNoDevice;
        this.ctlNoNetwork = ctlNoNetwork;
        this.dialCardRcv = dialCardRcv;
        this.tvNoDeviceTitle = tvNoDeviceTitle;
        this.tvNoNetwork = tvNoNetwork;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDialMarketBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDialMarketBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_dial_market, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDialMarketBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_try_again;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_try_again);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.ctl_no_device;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ctl_no_device);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.ctl_no_network;
                androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ctl_no_network);
                if (findChildViewById2 != null) {
                    i = com.qcwireless.qcwatch.R.id.dial_card_rcv;
                    com.qcwireless.qcwatch.ui.base.view.MyRecycleView myRecycleView = (com.qcwireless.qcwatch.ui.base.view.MyRecycleView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.dial_card_rcv);
                    if (myRecycleView != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_no_device_title;
                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_no_device_title);
                        if (textView != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_no_network;
                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_no_network);
                            if (textView2 != null) {
                                return new com.qcwireless.qcwatch.databinding.FragmentDialMarketBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, findChildViewById, findChildViewById2, myRecycleView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
