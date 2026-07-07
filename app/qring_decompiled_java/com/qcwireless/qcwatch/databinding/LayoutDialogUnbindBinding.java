package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogUnbindBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvCancel;
    public final android.widget.TextView tvConfirm;
    public final android.widget.TextView tvContent;

    private LayoutDialogUnbindBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView tvCancel, android.widget.TextView tvConfirm, android.widget.TextView tvContent) {
        this.rootView = rootView;
        this.tvCancel = tvCancel;
        this.tvConfirm = tvConfirm;
        this.tvContent = tvContent;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogUnbindBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogUnbindBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_unbind, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogUnbindBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.tv_cancel;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_cancel);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_confirm;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_confirm);
            if (textView2 != null) {
                i = 2131297477;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297477);
                if (textView3 != null) {
                    return new com.qcwireless.qcwatch.databinding.LayoutDialogUnbindBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
