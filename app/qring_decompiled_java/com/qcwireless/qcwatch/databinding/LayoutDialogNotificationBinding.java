package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogNotificationBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageNotification;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvConfirm;
    public final android.widget.TextView tvContent;
    public final android.widget.TextView tvTitle;

    private LayoutDialogNotificationBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageNotification, android.widget.TextView tvConfirm, android.widget.TextView tvContent, android.widget.TextView tvTitle) {
        this.rootView = rootView;
        this.imageNotification = imageNotification;
        this.tvConfirm = tvConfirm;
        this.tvContent = tvContent;
        this.tvTitle = tvTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogNotificationBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogNotificationBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_notification, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogNotificationBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_notification;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_notification);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_confirm;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_confirm);
            if (textView != null) {
                i = 2131297477;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297477);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_title;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title);
                    if (textView3 != null) {
                        return new com.qcwireless.qcwatch.databinding.LayoutDialogNotificationBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
