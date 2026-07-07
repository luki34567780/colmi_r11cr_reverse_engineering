package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ViewSleepAnalysisBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tv1;
    public final androidx.constraintlayout.widget.Group tvDetailGroup;
    public final android.widget.TextView tvSleepHour;
    public final android.widget.TextView tvSleepMin;
    public final android.widget.TextView tvSleepStatus;
    public final android.widget.TextView tvSleepTotalTime;
    public final android.widget.TextView tvSleepUnitH;
    public final android.widget.TextView tvSleepUnitMin;

    private ViewSleepAnalysisBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView tv1, androidx.constraintlayout.widget.Group tvDetailGroup, android.widget.TextView tvSleepHour, android.widget.TextView tvSleepMin, android.widget.TextView tvSleepStatus, android.widget.TextView tvSleepTotalTime, android.widget.TextView tvSleepUnitH, android.widget.TextView tvSleepUnitMin) {
        this.rootView = rootView;
        this.tv1 = tv1;
        this.tvDetailGroup = tvDetailGroup;
        this.tvSleepHour = tvSleepHour;
        this.tvSleepMin = tvSleepMin;
        this.tvSleepStatus = tvSleepStatus;
        this.tvSleepTotalTime = tvSleepTotalTime;
        this.tvSleepUnitH = tvSleepUnitH;
        this.tvSleepUnitMin = tvSleepUnitMin;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ViewSleepAnalysisBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ViewSleepAnalysisBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.view_sleep_analysis, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ViewSleepAnalysisBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.tv_1;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_detail_group;
            androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_detail_group);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.tv_sleep_hour;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_hour);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_sleep_min;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_min);
                    if (textView3 != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_sleep_status;
                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_status);
                        if (textView4 != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_sleep_total_time;
                            android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_total_time);
                            if (textView5 != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_sleep_unit_h;
                                android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_unit_h);
                                if (textView6 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_sleep_unit_min;
                                    android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_unit_min);
                                    if (textView7 != null) {
                                        return new com.qcwireless.qcwatch.databinding.ViewSleepAnalysisBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, findChildViewById, textView2, textView3, textView4, textView5, textView6, textView7);
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
