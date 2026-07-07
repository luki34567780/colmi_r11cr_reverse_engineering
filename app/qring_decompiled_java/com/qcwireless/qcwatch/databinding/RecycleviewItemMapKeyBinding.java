package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemMapKeyBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvAddress;
    public final android.widget.TextView tvCity;

    private RecycleviewItemMapKeyBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView tvAddress, android.widget.TextView tvCity) {
        this.rootView = rootView;
        this.tvAddress = tvAddress;
        this.tvCity = tvCity;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMapKeyBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMapKeyBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_map_key, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMapKeyBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.tv_address;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_address);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_city;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_city);
            if (textView2 != null) {
                return new com.qcwireless.qcwatch.databinding.RecycleviewItemMapKeyBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
