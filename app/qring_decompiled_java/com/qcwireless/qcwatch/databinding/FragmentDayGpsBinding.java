package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentDayGpsBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView gpsDetailRcv;
    public final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange;
    private final androidx.core.widget.NestedScrollView rootView;
    public final android.widget.TextView todayTotalDuring;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalCal;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalDistance;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalTimes;
    public final android.widget.TextView tvRecent;

    private FragmentDayGpsBinding(androidx.core.widget.NestedScrollView rootView, androidx.recyclerview.widget.RecyclerView gpsDetailRcv, com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange, android.widget.TextView todayTotalDuring, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalCal, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalDistance, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalTimes, android.widget.TextView tvRecent) {
        this.rootView = rootView;
        this.gpsDetailRcv = gpsDetailRcv;
        this.qcDateChange = qcDateChange;
        this.todayTotalDuring = todayTotalDuring;
        this.totalCal = totalCal;
        this.totalDistance = totalDistance;
        this.totalTimes = totalTimes;
        this.tvRecent = tvRecent;
    }

    public androidx.core.widget.NestedScrollView getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_day_gps, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.gps_detail_rcv;
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.gps_detail_rcv);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.qc_date_change;
            com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
            if (qDateSwitchView != null) {
                i = com.qcwireless.qcwatch.R.id.today_total_during;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.today_total_during);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.total_cal;
                    com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_cal);
                    if (qSportItemView != null) {
                        i = com.qcwireless.qcwatch.R.id.total_distance;
                        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_distance);
                        if (qSportItemView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.total_times;
                            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_times);
                            if (qSportItemView3 != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_recent;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_recent);
                                if (textView2 != null) {
                                    return new com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding((androidx.core.widget.NestedScrollView) rootView, findChildViewById, qDateSwitchView, textView, qSportItemView, qSportItemView2, qSportItemView3, textView2);
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
