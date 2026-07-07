package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentMonthSportBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView expList;
    public final android.widget.ImageView imageSportNoData;
    public final androidx.constraintlayout.widget.ConstraintLayout noDataLayout;
    public final com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qcDateChange;
    private final androidx.core.widget.NestedScrollView rootView;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalCal;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalDays;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalTimes;
    public final android.widget.TextView weekTotal;

    private FragmentMonthSportBinding(androidx.core.widget.NestedScrollView rootView, androidx.recyclerview.widget.RecyclerView expList, android.widget.ImageView imageSportNoData, androidx.constraintlayout.widget.ConstraintLayout noDataLayout, com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qcDateChange, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalCal, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalDays, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalTimes, android.widget.TextView weekTotal) {
        this.rootView = rootView;
        this.expList = expList;
        this.imageSportNoData = imageSportNoData;
        this.noDataLayout = noDataLayout;
        this.qcDateChange = qcDateChange;
        this.totalCal = totalCal;
        this.totalDays = totalDays;
        this.totalTimes = totalTimes;
        this.weekTotal = weekTotal;
    }

    public androidx.core.widget.NestedScrollView getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_month_sport, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.exp_list;
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.exp_list);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.image_sport_no_data;
            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_sport_no_data);
            if (imageView != null) {
                i = com.qcwireless.qcwatch.R.id.no_data_layout;
                androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.no_data_layout);
                if (findChildViewById2 != null) {
                    i = com.qcwireless.qcwatch.R.id.qc_date_change;
                    com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qDateMonthSwitchView = (com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_date_change);
                    if (qDateMonthSwitchView != null) {
                        i = com.qcwireless.qcwatch.R.id.total_cal;
                        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_cal);
                        if (qSportItemView != null) {
                            i = com.qcwireless.qcwatch.R.id.total_days;
                            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_days);
                            if (qSportItemView2 != null) {
                                i = com.qcwireless.qcwatch.R.id.total_times;
                                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_times);
                                if (qSportItemView3 != null) {
                                    i = com.qcwireless.qcwatch.R.id.week_total;
                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.week_total);
                                    if (textView != null) {
                                        return new com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding((androidx.core.widget.NestedScrollView) rootView, findChildViewById, imageView, findChildViewById2, qDateMonthSwitchView, qSportItemView, qSportItemView2, qSportItemView3, textView);
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
