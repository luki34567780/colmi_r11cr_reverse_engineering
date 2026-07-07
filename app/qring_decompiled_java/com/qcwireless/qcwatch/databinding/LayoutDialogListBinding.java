package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogListBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView dialogCancel;
    public final androidx.recyclerview.widget.RecyclerView dialogRcv;
    public final android.widget.TextView dialogTitle;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private LayoutDialogListBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView dialogCancel, androidx.recyclerview.widget.RecyclerView dialogRcv, android.widget.TextView dialogTitle) {
        this.rootView = rootView;
        this.dialogCancel = dialogCancel;
        this.dialogRcv = dialogRcv;
        this.dialogTitle = dialogTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogListBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogListBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogListBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.dialog_cancel;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.dialog_cancel);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.dialog_rcv;
            androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.dialog_rcv);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.dialog_title;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.dialog_title);
                if (textView2 != null) {
                    return new com.qcwireless.qcwatch.databinding.LayoutDialogListBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, findChildViewById, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
