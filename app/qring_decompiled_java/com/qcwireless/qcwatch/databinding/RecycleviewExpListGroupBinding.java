package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewExpListGroupBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageClick;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvItemGroupTitle;

    private RecycleviewExpListGroupBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageClick, android.widget.TextView tvItemGroupTitle) {
        this.rootView = rootView;
        this.imageClick = imageClick;
        this.tvItemGroupTitle = tvItemGroupTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewExpListGroupBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewExpListGroupBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_exp_list_group, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewExpListGroupBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_click;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_click);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_item_group_title;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_item_group_title);
            if (textView != null) {
                return new com.qcwireless.qcwatch.databinding.RecycleviewExpListGroupBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
