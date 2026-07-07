package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleViewSportTypeBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView iconRight;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.ImageView sportTypeIcon;
    public final android.widget.TextView tvSportName;

    private RecycleViewSportTypeBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView iconRight, android.widget.ImageView sportTypeIcon, android.widget.TextView tvSportName) {
        this.rootView = rootView;
        this.iconRight = iconRight;
        this.sportTypeIcon = sportTypeIcon;
        this.tvSportName = tvSportName;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewSportTypeBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewSportTypeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycle_view_sport_type, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleViewSportTypeBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.icon_right;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.icon_right);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.sport_type_icon;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_type_icon);
            if (imageView2 != null) {
                i = com.qcwireless.qcwatch.R.id.tv_sport_name;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_name);
                if (textView != null) {
                    return new com.qcwireless.qcwatch.databinding.RecycleViewSportTypeBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
