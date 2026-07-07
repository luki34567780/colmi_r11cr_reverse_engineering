package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemOnekeyBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView homeOneKeyDate;
    public final android.widget.TextView homeOneKeyTitle;
    public final android.widget.TextView homeOneKeyUnit;
    public final android.widget.TextView homeOneKeyValue;
    public final android.widget.ImageView homeOneKeyView;
    public final android.widget.ImageView imageNoData;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemOnekeyBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView homeOneKeyDate, android.widget.TextView homeOneKeyTitle, android.widget.TextView homeOneKeyUnit, android.widget.TextView homeOneKeyValue, android.widget.ImageView homeOneKeyView, android.widget.ImageView imageNoData) {
        this.rootView = rootView;
        this.homeOneKeyDate = homeOneKeyDate;
        this.homeOneKeyTitle = homeOneKeyTitle;
        this.homeOneKeyUnit = homeOneKeyUnit;
        this.homeOneKeyValue = homeOneKeyValue;
        this.homeOneKeyView = homeOneKeyView;
        this.imageNoData = imageNoData;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemOnekeyBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemOnekeyBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_onekey, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemOnekeyBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.home_one_key_date;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_one_key_date);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.home_one_key_title;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_one_key_title);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.home_one_key_unit;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_one_key_unit);
                if (textView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.home_one_key_value;
                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_one_key_value);
                    if (textView4 != null) {
                        i = com.qcwireless.qcwatch.R.id.home_one_key_view;
                        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_one_key_view);
                        if (imageView != null) {
                            i = com.qcwireless.qcwatch.R.id.image_no_data;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_no_data);
                            if (imageView2 != null) {
                                return new com.qcwireless.qcwatch.databinding.RecycleviewItemOnekeyBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3, textView4, imageView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
