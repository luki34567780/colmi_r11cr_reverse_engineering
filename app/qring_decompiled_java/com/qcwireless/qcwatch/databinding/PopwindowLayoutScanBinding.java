package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class PopwindowLayoutScanBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvAdd;

    private PopwindowLayoutScanBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView tvAdd) {
        this.rootView = rootView;
        this.tvAdd = tvAdd;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.PopwindowLayoutScanBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.PopwindowLayoutScanBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.popwindow_layout_scan, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.PopwindowLayoutScanBinding bind(android.view.View rootView) {
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_add);
        if (textView != null) {
            return new com.qcwireless.qcwatch.databinding.PopwindowLayoutScanBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.tv_add)));
    }
}
