package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityGpsRunCnBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsCalorie;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsDistance;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsHeart;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsPace;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsTimes;
    public final android.widget.ImageView imageBack;
    public final com.qcwireless.qcwatch.ui.base.view.gps.GpsStartView imageContinue;
    public final com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView imageEnd;
    public final android.widget.ImageView imageScreenLock;
    public final android.widget.ImageView imageSignal;
    public final com.qcwireless.qcwatch.ui.base.view.gps.LockView imageStop;
    public final com.amap.api.maps.MapView map;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvLabelEnd;
    public final android.widget.TextView tvLabelUnlock;
    public final android.widget.TextView viewTopOfLayout;

    private ActivityGpsRunCnBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsCalorie, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsDistance, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsHeart, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsPace, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsTimes, android.widget.ImageView imageBack, com.qcwireless.qcwatch.ui.base.view.gps.GpsStartView imageContinue, com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView imageEnd, android.widget.ImageView imageScreenLock, android.widget.ImageView imageSignal, com.qcwireless.qcwatch.ui.base.view.gps.LockView imageStop, com.amap.api.maps.MapView map, android.widget.TextView tvLabelEnd, android.widget.TextView tvLabelUnlock, android.widget.TextView viewTopOfLayout) {
        this.rootView = rootView;
        this.gpsCalorie = gpsCalorie;
        this.gpsDistance = gpsDistance;
        this.gpsHeart = gpsHeart;
        this.gpsPace = gpsPace;
        this.gpsTimes = gpsTimes;
        this.imageBack = imageBack;
        this.imageContinue = imageContinue;
        this.imageEnd = imageEnd;
        this.imageScreenLock = imageScreenLock;
        this.imageSignal = imageSignal;
        this.imageStop = imageStop;
        this.map = map;
        this.tvLabelEnd = tvLabelEnd;
        this.tvLabelUnlock = tvLabelUnlock;
        this.viewTopOfLayout = viewTopOfLayout;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_gps_run_cn, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.gps_calorie;
        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_calorie);
        if (qSportItemView != null) {
            i = com.qcwireless.qcwatch.R.id.gps_distance;
            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_distance);
            if (qSportItemView2 != null) {
                i = com.qcwireless.qcwatch.R.id.gps_heart;
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_heart);
                if (qSportItemView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.gps_pace;
                    com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView4 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_pace);
                    if (qSportItemView4 != null) {
                        i = com.qcwireless.qcwatch.R.id.gps_times;
                        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView5 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_times);
                        if (qSportItemView5 != null) {
                            i = com.qcwireless.qcwatch.R.id.image_back;
                            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_back);
                            if (imageView != null) {
                                i = com.qcwireless.qcwatch.R.id.image_continue;
                                com.qcwireless.qcwatch.ui.base.view.gps.GpsStartView gpsStartView = (com.qcwireless.qcwatch.ui.base.view.gps.GpsStartView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_continue);
                                if (gpsStartView != null) {
                                    i = com.qcwireless.qcwatch.R.id.image_end;
                                    com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView gpsEndView = (com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_end);
                                    if (gpsEndView != null) {
                                        i = com.qcwireless.qcwatch.R.id.image_screen_lock;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_screen_lock);
                                        if (imageView2 != null) {
                                            i = com.qcwireless.qcwatch.R.id.image_signal;
                                            android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_signal);
                                            if (imageView3 != null) {
                                                i = com.qcwireless.qcwatch.R.id.image_stop;
                                                com.qcwireless.qcwatch.ui.base.view.gps.LockView lockView = (com.qcwireless.qcwatch.ui.base.view.gps.LockView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_stop);
                                                if (lockView != null) {
                                                    i = com.qcwireless.qcwatch.R.id.map;
                                                    com.amap.api.maps.MapView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.map);
                                                    if (findChildViewById != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_label_end;
                                                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_label_end);
                                                        if (textView != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_label_unlock;
                                                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_label_unlock);
                                                            if (textView2 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.view_top_of_layout;
                                                                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.view_top_of_layout);
                                                                if (textView3 != null) {
                                                                    return new com.qcwireless.qcwatch.databinding.ActivityGpsRunCnBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qSportItemView, qSportItemView2, qSportItemView3, qSportItemView4, qSportItemView5, imageView, gpsStartView, gpsEndView, imageView2, imageView3, lockView, findChildViewById, textView, textView2, textView3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
