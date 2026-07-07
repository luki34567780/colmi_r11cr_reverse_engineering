package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ViewSkinItemBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageSkinCheck;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvSkinBg;
    public final android.widget.TextView tvSkinName;

    private ViewSkinItemBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageSkinCheck, android.widget.TextView tvSkinBg, android.widget.TextView tvSkinName) {
        this.rootView = rootView;
        this.imageSkinCheck = imageSkinCheck;
        this.tvSkinBg = tvSkinBg;
        this.tvSkinName = tvSkinName;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ViewSkinItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ViewSkinItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.view_skin_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ViewSkinItemBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_skin_check;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_skin_check);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_skin_bg;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_skin_bg);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.tv_skin_name;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_skin_name);
                if (textView2 != null) {
                    return new com.qcwireless.qcwatch.databinding.ViewSkinItemBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
