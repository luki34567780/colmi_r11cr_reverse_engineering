package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcDeviceItemWithClickBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView ivLefticon;
    public final android.widget.ImageView ivRighticon;
    public final androidx.appcompat.widget.AppCompatCheckBox rightcheck;
    public final android.widget.FrameLayout rightlayout;
    public final com.qcwireless.qcwatch.ui.base.view.QSwitchView rightswitch;
    public final androidx.constraintlayout.widget.ConstraintLayout rootLayout;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvLeftSubText;
    public final android.widget.TextView tvLefttext;
    public final android.widget.TextView tvRighttext;

    private QcDeviceItemWithClickBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView ivLefticon, android.widget.ImageView ivRighticon, androidx.appcompat.widget.AppCompatCheckBox rightcheck, android.widget.FrameLayout rightlayout, com.qcwireless.qcwatch.ui.base.view.QSwitchView rightswitch, androidx.constraintlayout.widget.ConstraintLayout rootLayout, android.widget.TextView tvLeftSubText, android.widget.TextView tvLefttext, android.widget.TextView tvRighttext) {
        this.rootView = rootView;
        this.ivLefticon = ivLefticon;
        this.ivRighticon = ivRighticon;
        this.rightcheck = rightcheck;
        this.rightlayout = rightlayout;
        this.rightswitch = rightswitch;
        this.rootLayout = rootLayout;
        this.tvLeftSubText = tvLeftSubText;
        this.tvLefttext = tvLefttext;
        this.tvRighttext = tvRighttext;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.QcDeviceItemWithClickBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.QcDeviceItemWithClickBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.qc_device_item_with_click, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.QcDeviceItemWithClickBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.iv_lefticon;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_lefticon);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.iv_righticon;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_righticon);
            if (imageView2 != null) {
                i = com.qcwireless.qcwatch.R.id.rightcheck;
                androidx.appcompat.widget.AppCompatCheckBox findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rightcheck);
                if (findChildViewById != null) {
                    i = com.qcwireless.qcwatch.R.id.rightlayout;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rightlayout);
                    if (frameLayout != null) {
                        i = com.qcwireless.qcwatch.R.id.rightswitch;
                        com.qcwireless.qcwatch.ui.base.view.QSwitchView qSwitchView = (com.qcwireless.qcwatch.ui.base.view.QSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rightswitch);
                        if (qSwitchView != null) {
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) rootView;
                            i = com.qcwireless.qcwatch.R.id.tv_left_sub_text;
                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_left_sub_text);
                            if (textView != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_lefttext;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_lefttext);
                                if (textView2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_righttext;
                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_righttext);
                                    if (textView3 != null) {
                                        return new com.qcwireless.qcwatch.databinding.QcDeviceItemWithClickBinding(constraintLayout, imageView, imageView2, findChildViewById, frameLayout, qSwitchView, constraintLayout, textView, textView2, textView3);
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
