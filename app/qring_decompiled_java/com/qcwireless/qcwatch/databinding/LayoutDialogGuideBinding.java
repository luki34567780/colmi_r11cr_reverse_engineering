package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogGuideBinding implements androidx.viewbinding.ViewBinding {
    public final android.view.View line1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvCancel;
    public final android.widget.TextView tvTakePhoto;
    public final android.widget.TextView tvTakePicture;

    private LayoutDialogGuideBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.view.View line1, android.widget.TextView tvCancel, android.widget.TextView tvTakePhoto, android.widget.TextView tvTakePicture) {
        this.rootView = rootView;
        this.line1 = line1;
        this.tvCancel = tvCancel;
        this.tvTakePhoto = tvTakePhoto;
        this.tvTakePicture = tvTakePicture;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogGuideBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogGuideBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_guide, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogGuideBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.line_1;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.tv_cancel;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_cancel);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.tv_take_photo;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_take_photo);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_take_picture;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_take_picture);
                    if (textView3 != null) {
                        return new com.qcwireless.qcwatch.databinding.LayoutDialogGuideBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
