package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ViewDateSwitchBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageBefore;
    public final android.widget.ImageView imageNext;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvDateTitle;

    private ViewDateSwitchBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageBefore, android.widget.ImageView imageNext, android.widget.TextView tvDateTitle) {
        this.rootView = rootView;
        this.imageBefore = imageBefore;
        this.imageNext = imageNext;
        this.tvDateTitle = tvDateTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ViewDateSwitchBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ViewDateSwitchBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.view_date_switch, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ViewDateSwitchBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_before;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_before);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.image_next;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_next);
            if (imageView2 != null) {
                i = com.qcwireless.qcwatch.R.id.tv_date_title;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_date_title);
                if (textView != null) {
                    return new com.qcwireless.qcwatch.databinding.ViewDateSwitchBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
