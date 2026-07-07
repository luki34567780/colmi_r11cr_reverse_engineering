package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogPermissionWarmingBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvDialogCancel;
    public final android.widget.TextView tvDialogConfirm;
    public final android.widget.TextView tvDialogTitle;

    private LayoutDialogPermissionWarmingBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView tvDialogCancel, android.widget.TextView tvDialogConfirm, android.widget.TextView tvDialogTitle) {
        this.rootView = rootView;
        this.tvDialogCancel = tvDialogCancel;
        this.tvDialogConfirm = tvDialogConfirm;
        this.tvDialogTitle = tvDialogTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogPermissionWarmingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogPermissionWarmingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_permission_warming, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogPermissionWarmingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.tv_dialog_cancel;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_dialog_confirm;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.tv_dialog_title;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_dialog_title);
                if (textView3 != null) {
                    return new com.qcwireless.qcwatch.databinding.LayoutDialogPermissionWarmingBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
