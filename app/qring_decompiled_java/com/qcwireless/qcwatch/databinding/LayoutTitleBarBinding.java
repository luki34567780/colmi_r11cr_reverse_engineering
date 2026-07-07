package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutTitleBarBinding implements androidx.viewbinding.ViewBinding {
    public final android.view.View divider;
    public final android.widget.ImageView ivNavigateBefore;
    private final android.widget.RelativeLayout rootView;
    public final android.widget.RelativeLayout titleBar;
    public final android.widget.ImageView tvRightImage;
    public final android.widget.TextView tvRightText;
    public final android.widget.TextView tvTitle;

    private LayoutTitleBarBinding(android.widget.RelativeLayout rootView, android.view.View divider, android.widget.ImageView ivNavigateBefore, android.widget.RelativeLayout titleBar, android.widget.ImageView tvRightImage, android.widget.TextView tvRightText, android.widget.TextView tvTitle) {
        this.rootView = rootView;
        this.divider = divider;
        this.ivNavigateBefore = ivNavigateBefore;
        this.titleBar = titleBar;
        this.tvRightImage = tvRightImage;
        this.tvRightText = tvRightText;
        this.tvTitle = tvTitle;
    }

    public android.widget.RelativeLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_title_bar, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.divider;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.divider);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.ivNavigateBefore;
            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ivNavigateBefore);
            if (imageView != null) {
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) rootView;
                i = com.qcwireless.qcwatch.R.id.tvRightImage;
                android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tvRightImage);
                if (imageView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.tvRightText;
                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tvRightText);
                    if (textView != null) {
                        i = 2131297422;
                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297422);
                        if (textView2 != null) {
                            return new com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding(relativeLayout, findChildViewById, imageView, relativeLayout, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
