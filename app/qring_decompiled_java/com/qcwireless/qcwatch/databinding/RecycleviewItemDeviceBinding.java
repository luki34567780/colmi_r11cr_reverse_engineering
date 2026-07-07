package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemDeviceBinding implements androidx.viewbinding.ViewBinding {
    public final android.view.View itemLine;
    public final android.widget.TextView rcvDeviceAddress;
    public final android.widget.TextView rcvDeviceName;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemDeviceBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.view.View itemLine, android.widget.TextView rcvDeviceAddress, android.widget.TextView rcvDeviceName) {
        this.rootView = rootView;
        this.itemLine = itemLine;
        this.rcvDeviceAddress = rcvDeviceAddress;
        this.rcvDeviceName = rcvDeviceName;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemDeviceBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemDeviceBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_device, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemDeviceBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.item_line;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.item_line);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.rcv_device_address;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_device_address);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.rcv_device_name;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_device_name);
                if (textView2 != null) {
                    return new com.qcwireless.qcwatch.databinding.RecycleviewItemDeviceBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
