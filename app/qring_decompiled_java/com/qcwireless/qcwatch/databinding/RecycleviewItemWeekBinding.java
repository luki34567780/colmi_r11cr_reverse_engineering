package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemWeekBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageWeek;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvWeekName;

    private RecycleviewItemWeekBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageWeek, android.widget.TextView tvWeekName) {
        this.rootView = rootView;
        this.imageWeek = imageWeek;
        this.tvWeekName = tvWeekName;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemWeekBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemWeekBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_week, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemWeekBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_week;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_week);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_week_name;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_week_name);
            if (textView != null) {
                return new com.qcwireless.qcwatch.databinding.RecycleviewItemWeekBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
