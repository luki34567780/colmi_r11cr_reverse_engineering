package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemFooterBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView healthyTvBottomEdit;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemFooterBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView healthyTvBottomEdit) {
        this.rootView = rootView;
        this.healthyTvBottomEdit = healthyTvBottomEdit;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemFooterBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemFooterBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_footer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemFooterBinding bind(android.view.View rootView) {
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.healthy_tv_bottom_edit);
        if (textView != null) {
            return new com.qcwireless.qcwatch.databinding.RecycleviewItemFooterBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.healthy_tv_bottom_edit)));
    }
}
