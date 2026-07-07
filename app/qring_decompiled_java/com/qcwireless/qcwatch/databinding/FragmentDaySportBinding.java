package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentDaySportBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageSportNoData;
    public final androidx.constraintlayout.widget.ConstraintLayout noDataLayout;
    public final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange;
    private final androidx.core.widget.NestedScrollView rootView;
    public final androidx.recyclerview.widget.RecyclerView sportDetailRcv;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalCal;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalDays;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalTimes;
    public final android.widget.TextView tvInfo;
    public final android.widget.TextView tvRecent;
    public final android.widget.TextView weekTotal;

    private FragmentDaySportBinding(androidx.core.widget.NestedScrollView rootView, android.widget.ImageView imageSportNoData, androidx.constraintlayout.widget.ConstraintLayout noDataLayout, com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qcDateChange, androidx.recyclerview.widget.RecyclerView sportDetailRcv, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalCal, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalDays, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalTimes, android.widget.TextView tvInfo, android.widget.TextView tvRecent, android.widget.TextView weekTotal) {
        this.rootView = rootView;
        this.imageSportNoData = imageSportNoData;
        this.noDataLayout = noDataLayout;
        this.qcDateChange = qcDateChange;
        this.sportDetailRcv = sportDetailRcv;
        this.totalCal = totalCal;
        this.totalDays = totalDays;
        this.totalTimes = totalTimes;
        this.tvInfo = tvInfo;
        this.tvRecent = tvRecent;
        this.weekTotal = weekTotal;
    }

    public androidx.core.widget.NestedScrollView getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDaySportBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDaySportBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_day_sport, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentDaySportBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_sport_no_data;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_sport_no_data);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.no_data_layout;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.no_data_layout);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.qc_date_change;
                com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                if (qDateSwitchView != null) {
                    i = com.qcwireless.qcwatch.R.id.sport_detail_rcv;
                    androidx.recyclerview.widget.RecyclerView findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_detail_rcv);
                    if (findChildViewById2 != null) {
                        i = com.qcwireless.qcwatch.R.id.total_cal;
                        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_cal);
                        if (qSportItemView != null) {
                            i = com.qcwireless.qcwatch.R.id.total_days;
                            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_days);
                            if (qSportItemView2 != null) {
                                i = com.qcwireless.qcwatch.R.id.total_times;
                                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_times);
                                if (qSportItemView3 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_info;
                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info);
                                    if (textView != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_recent;
                                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_recent);
                                        if (textView2 != null) {
                                            i = com.qcwireless.qcwatch.R.id.week_total;
                                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.week_total);
                                            if (textView3 != null) {
                                                return new com.qcwireless.qcwatch.databinding.FragmentDaySportBinding((androidx.core.widget.NestedScrollView) rootView, imageView, findChildViewById, qDateSwitchView, findChildViewById2, qSportItemView, qSportItemView2, qSportItemView3, textView, textView2, textView3);
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
