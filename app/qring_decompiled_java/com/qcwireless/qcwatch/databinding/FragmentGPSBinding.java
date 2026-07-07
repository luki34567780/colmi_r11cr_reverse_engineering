package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentGPSBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView btnGpsGo;
    public final com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView gpsQsvView;
    public final android.widget.ImageView imageSignal;
    public final com.google.android.gms.maps.MapView mapview;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvGpsUnit;
    public final android.widget.TextView tvSportHistory;
    public final android.widget.TextView tvTotalDistance;

    private FragmentGPSBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView btnGpsGo, com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView gpsQsvView, android.widget.ImageView imageSignal, com.google.android.gms.maps.MapView mapview, android.widget.TextView tvGpsUnit, android.widget.TextView tvSportHistory, android.widget.TextView tvTotalDistance) {
        this.rootView = rootView;
        this.btnGpsGo = btnGpsGo;
        this.gpsQsvView = gpsQsvView;
        this.imageSignal = imageSignal;
        this.mapview = mapview;
        this.tvGpsUnit = tvGpsUnit;
        this.tvSportHistory = tvSportHistory;
        this.tvTotalDistance = tvTotalDistance;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentGPSBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentGPSBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_g_p_s, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentGPSBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_gps_go;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_gps_go);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.gps_qsv_view;
            com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = (com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_qsv_view);
            if (qSwitchButtonView != null) {
                i = com.qcwireless.qcwatch.R.id.image_signal;
                android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_signal);
                if (imageView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.mapview;
                    com.google.android.gms.maps.MapView mapView = (com.google.android.gms.maps.MapView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.mapview);
                    if (mapView != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_gps_unit;
                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_gps_unit);
                        if (textView != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_sport_history;
                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_history);
                            if (textView2 != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_total_distance;
                                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_total_distance);
                                if (textView3 != null) {
                                    return new com.qcwireless.qcwatch.databinding.FragmentGPSBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, qSwitchButtonView, imageView2, mapView, textView, textView2, textView3);
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
