package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemGpsSportBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView homeGpsDate;
    public final android.widget.TextView homeGpsDistance;
    public final android.widget.TextView homeGpsDistanceUnit;
    public final android.widget.TextView homeGpsTitle;
    public final android.widget.ImageView imageGps;
    public final android.widget.ImageView imageIcon;
    public final android.widget.ImageView imageNoData;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemGpsSportBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView homeGpsDate, android.widget.TextView homeGpsDistance, android.widget.TextView homeGpsDistanceUnit, android.widget.TextView homeGpsTitle, android.widget.ImageView imageGps, android.widget.ImageView imageIcon, android.widget.ImageView imageNoData) {
        this.rootView = rootView;
        this.homeGpsDate = homeGpsDate;
        this.homeGpsDistance = homeGpsDistance;
        this.homeGpsDistanceUnit = homeGpsDistanceUnit;
        this.homeGpsTitle = homeGpsTitle;
        this.imageGps = imageGps;
        this.imageIcon = imageIcon;
        this.imageNoData = imageNoData;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemGpsSportBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemGpsSportBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_gps_sport, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemGpsSportBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.home_gps_date;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_gps_date);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.home_gps_distance;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_gps_distance);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.home_gps_distance_unit;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_gps_distance_unit);
                if (textView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.home_gps_title;
                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_gps_title);
                    if (textView4 != null) {
                        i = com.qcwireless.qcwatch.R.id.image_gps;
                        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_gps);
                        if (imageView != null) {
                            i = com.qcwireless.qcwatch.R.id.image_icon;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_icon);
                            if (imageView2 != null) {
                                i = com.qcwireless.qcwatch.R.id.image_no_data;
                                android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_no_data);
                                if (imageView3 != null) {
                                    return new com.qcwireless.qcwatch.databinding.RecycleviewItemGpsSportBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3, textView4, imageView, imageView2, imageView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
