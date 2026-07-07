package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityGpsMapBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsCalorie;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsDistance;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsTimes;
    public final android.widget.ImageView imageBack;
    public final com.google.android.gms.maps.MapView mapView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private ActivityGpsMapBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsCalorie, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsDistance, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsTimes, android.widget.ImageView imageBack, com.google.android.gms.maps.MapView mapView) {
        this.rootView = rootView;
        this.gpsCalorie = gpsCalorie;
        this.gpsDistance = gpsDistance;
        this.gpsTimes = gpsTimes;
        this.imageBack = imageBack;
        this.mapView = mapView;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_gps_map, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.gps_calorie;
        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_calorie);
        if (qSportItemView != null) {
            i = com.qcwireless.qcwatch.R.id.gps_distance;
            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_distance);
            if (qSportItemView2 != null) {
                i = com.qcwireless.qcwatch.R.id.gps_times;
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_times);
                if (qSportItemView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.image_back;
                    android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_back);
                    if (imageView != null) {
                        i = com.qcwireless.qcwatch.R.id.map_view;
                        com.google.android.gms.maps.MapView mapView = (com.google.android.gms.maps.MapView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.map_view);
                        if (mapView != null) {
                            return new com.qcwireless.qcwatch.databinding.ActivityGpsMapBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qSportItemView, qSportItemView2, qSportItemView3, imageView, mapView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
