package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityTest1Binding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView bleConnect;
    public final android.widget.TextView bleDisconnect;
    public final android.widget.TextView bleScan;
    public final android.widget.TextView info;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private ActivityTest1Binding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView bleConnect, android.widget.TextView bleDisconnect, android.widget.TextView bleScan, android.widget.TextView info) {
        this.rootView = rootView;
        this.bleConnect = bleConnect;
        this.bleDisconnect = bleDisconnect;
        this.bleScan = bleScan;
        this.info = info;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityTest1Binding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityTest1Binding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_test1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityTest1Binding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.ble_connect;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ble_connect);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.ble_disconnect;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ble_disconnect);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.ble_scan;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ble_scan);
                if (textView3 != null) {
                    i = 2131296847;
                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131296847);
                    if (textView4 != null) {
                        return new com.qcwireless.qcwatch.databinding.ActivityTest1Binding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
