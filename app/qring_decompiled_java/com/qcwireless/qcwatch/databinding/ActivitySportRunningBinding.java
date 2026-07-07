package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivitySportRunningBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsCalorie;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsDistance;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsHeart;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsPace;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsStep;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsTimes;
    public final android.widget.ImageView imageBleStatus;
    public final com.qcwireless.qcwatch.ui.base.view.gps.GpsStartView imageContinue;
    public final com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView imageEnd;
    public final android.widget.ImageView imageScreenLock;
    public final com.qcwireless.qcwatch.ui.base.view.gps.LockView imageStop;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView timeDuration;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvLabelEnd;
    public final android.widget.TextView tvLabelUnlock;
    public final android.widget.TextView viewTopOfLayout;

    private ActivitySportRunningBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsCalorie, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsDistance, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsHeart, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsPace, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsStep, com.qcwireless.qcwatch.ui.base.view.QSportItemView gpsTimes, android.widget.ImageView imageBleStatus, com.qcwireless.qcwatch.ui.base.view.gps.GpsStartView imageContinue, com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView imageEnd, android.widget.ImageView imageScreenLock, com.qcwireless.qcwatch.ui.base.view.gps.LockView imageStop, android.widget.TextView timeDuration, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvLabelEnd, android.widget.TextView tvLabelUnlock, android.widget.TextView viewTopOfLayout) {
        this.rootView = rootView;
        this.gpsCalorie = gpsCalorie;
        this.gpsDistance = gpsDistance;
        this.gpsHeart = gpsHeart;
        this.gpsPace = gpsPace;
        this.gpsStep = gpsStep;
        this.gpsTimes = gpsTimes;
        this.imageBleStatus = imageBleStatus;
        this.imageContinue = imageContinue;
        this.imageEnd = imageEnd;
        this.imageScreenLock = imageScreenLock;
        this.imageStop = imageStop;
        this.timeDuration = timeDuration;
        this.titleBar = titleBar;
        this.tvLabelEnd = tvLabelEnd;
        this.tvLabelUnlock = tvLabelUnlock;
        this.viewTopOfLayout = viewTopOfLayout;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_sport_running, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding bind(android.view.View rootView) {
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
                        i = com.qcwireless.qcwatch.R.id.gps_step;
                        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView5 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_step);
                        if (qSportItemView5 != null) {
                            i = com.qcwireless.qcwatch.R.id.gps_times;
                            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView6 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_times);
                            if (qSportItemView6 != null) {
                                i = com.qcwireless.qcwatch.R.id.image_ble_status;
                                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_ble_status);
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
                                                i = com.qcwireless.qcwatch.R.id.image_stop;
                                                com.qcwireless.qcwatch.ui.base.view.gps.LockView lockView = (com.qcwireless.qcwatch.ui.base.view.gps.LockView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_stop);
                                                if (lockView != null) {
                                                    i = com.qcwireless.qcwatch.R.id.time_duration;
                                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.time_duration);
                                                    if (textView != null) {
                                                        i = 2131297388;
                                                        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                                        if (findChildViewById != null) {
                                                            com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                                                            i = com.qcwireless.qcwatch.R.id.tv_label_end;
                                                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_label_end);
                                                            if (textView2 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_label_unlock;
                                                                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_label_unlock);
                                                                if (textView3 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.view_top_of_layout;
                                                                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.view_top_of_layout);
                                                                    if (textView4 != null) {
                                                                        return new com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qSportItemView, qSportItemView2, qSportItemView3, qSportItemView4, qSportItemView5, qSportItemView6, imageView, gpsStartView, gpsEndView, imageView2, lockView, textView, bind, textView2, textView3, textView4);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
