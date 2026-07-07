package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityCardBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnConfirm;
    public final android.widget.Button btnConfirmCancel;
    public final android.view.View line1;
    public final android.widget.ImageView qrCodeIcon;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tv1;
    public final android.widget.TextView tv2;
    public final android.widget.TextView tvQrCode;
    public final android.widget.TextView userNotUse;

    private ActivityCardBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnConfirm, android.widget.Button btnConfirmCancel, android.view.View line1, android.widget.ImageView qrCodeIcon, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tv1, android.widget.TextView tv2, android.widget.TextView tvQrCode, android.widget.TextView userNotUse) {
        this.rootView = rootView;
        this.btnConfirm = btnConfirm;
        this.btnConfirmCancel = btnConfirmCancel;
        this.line1 = line1;
        this.qrCodeIcon = qrCodeIcon;
        this.titleBar = titleBar;
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tvQrCode = tvQrCode;
        this.userNotUse = userNotUse;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityCardBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityCardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_card, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityCardBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_confirm;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_confirm);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.btn_confirm_cancel;
            android.widget.Button button2 = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_confirm_cancel);
            if (button2 != null) {
                i = com.qcwireless.qcwatch.R.id.line_1;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                if (findChildViewById != null) {
                    i = com.qcwireless.qcwatch.R.id.qr_code_icon;
                    android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qr_code_icon);
                    if (imageView != null) {
                        i = 2131297388;
                        android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                        if (findChildViewById2 != null) {
                            com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2);
                            i = com.qcwireless.qcwatch.R.id.tv_1;
                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1);
                            if (textView != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_2;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_2);
                                if (textView2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_qr_code;
                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_qr_code);
                                    if (textView3 != null) {
                                        i = com.qcwireless.qcwatch.R.id.user_not_use;
                                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_not_use);
                                        if (textView4 != null) {
                                            return new com.qcwireless.qcwatch.databinding.ActivityCardBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, button2, findChildViewById, imageView, bind, textView, textView2, textView3, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
