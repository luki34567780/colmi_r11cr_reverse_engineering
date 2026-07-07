package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class SportDetailItemBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageItem;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvItemTitle;
    public final android.widget.TextView tvItemValue;
    public final android.widget.TextView tvItemValueUnit;

    private SportDetailItemBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageItem, android.widget.TextView tvItemTitle, android.widget.TextView tvItemValue, android.widget.TextView tvItemValueUnit) {
        this.rootView = rootView;
        this.imageItem = imageItem;
        this.tvItemTitle = tvItemTitle;
        this.tvItemValue = tvItemValue;
        this.tvItemValueUnit = tvItemValueUnit;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.SportDetailItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.SportDetailItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.sport_detail_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.SportDetailItemBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_item;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_item);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_item_title;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_item_title);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.tv_item_value;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_item_value);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_item_value_unit;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_item_value_unit);
                    if (textView3 != null) {
                        return new com.qcwireless.qcwatch.databinding.SportDetailItemBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
