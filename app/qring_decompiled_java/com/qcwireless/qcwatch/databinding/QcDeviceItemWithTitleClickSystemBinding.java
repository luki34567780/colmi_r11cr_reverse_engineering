package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class QcDeviceItemWithTitleClickSystemBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageTextDown;
    public final com.qcwireless.qcwatch.ui.base.view.QSwitchCompat rightswitch;
    public final androidx.constraintlayout.widget.ConstraintLayout rootLayout;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvLeftSubText;
    public final android.widget.TextView tvLefttext;

    private QcDeviceItemWithTitleClickSystemBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageTextDown, com.qcwireless.qcwatch.ui.base.view.QSwitchCompat rightswitch, androidx.constraintlayout.widget.ConstraintLayout rootLayout, android.widget.TextView tvLeftSubText, android.widget.TextView tvLefttext) {
        this.rootView = rootView;
        this.imageTextDown = imageTextDown;
        this.rightswitch = rightswitch;
        this.rootLayout = rootLayout;
        this.tvLeftSubText = tvLeftSubText;
        this.tvLefttext = tvLefttext;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.QcDeviceItemWithTitleClickSystemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.QcDeviceItemWithTitleClickSystemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.qc_device_item_with_title_click_system, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.QcDeviceItemWithTitleClickSystemBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_text_down;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_text_down);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.rightswitch;
            com.qcwireless.qcwatch.ui.base.view.QSwitchCompat qSwitchCompat = (com.qcwireless.qcwatch.ui.base.view.QSwitchCompat) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rightswitch);
            if (qSwitchCompat != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) rootView;
                i = com.qcwireless.qcwatch.R.id.tv_left_sub_text;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_left_sub_text);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_lefttext;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_lefttext);
                    if (textView2 != null) {
                        return new com.qcwireless.qcwatch.databinding.QcDeviceItemWithTitleClickSystemBinding(constraintLayout, imageView, qSwitchCompat, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
