package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewHeartEmptyBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageSportNoData;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewHeartEmptyBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageSportNoData) {
        this.rootView = rootView;
        this.imageSportNoData = imageSportNoData;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewHeartEmptyBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewHeartEmptyBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_heart_empty, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewHeartEmptyBinding bind(android.view.View rootView) {
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_sport_no_data);
        if (imageView != null) {
            return new com.qcwireless.qcwatch.databinding.RecycleviewHeartEmptyBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.image_sport_no_data)));
    }
}
