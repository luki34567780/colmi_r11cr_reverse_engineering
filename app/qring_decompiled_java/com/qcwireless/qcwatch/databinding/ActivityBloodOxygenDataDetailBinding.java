package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityBloodOxygenDataDetailBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageSportNoData;
    public final androidx.constraintlayout.widget.ConstraintLayout noDataView;
    public final androidx.recyclerview.widget.RecyclerView rcvBloodOxygenDetail;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvDataDate;
    public final android.widget.TextView tvErrorText;

    private ActivityBloodOxygenDataDetailBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageSportNoData, androidx.constraintlayout.widget.ConstraintLayout noDataView, androidx.recyclerview.widget.RecyclerView rcvBloodOxygenDetail, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvDataDate, android.widget.TextView tvErrorText) {
        this.rootView = rootView;
        this.imageSportNoData = imageSportNoData;
        this.noDataView = noDataView;
        this.rcvBloodOxygenDetail = rcvBloodOxygenDetail;
        this.titleBar = titleBar;
        this.tvDataDate = tvDataDate;
        this.tvErrorText = tvErrorText;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodOxygenDataDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodOxygenDataDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_blood_oxygen_data_detail, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBloodOxygenDataDetailBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_sport_no_data;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_sport_no_data);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.no_data_view;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.no_data_view);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.rcv_blood_oxygen_detail;
                androidx.recyclerview.widget.RecyclerView findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_blood_oxygen_detail);
                if (findChildViewById2 != null) {
                    i = 2131297388;
                    android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                    if (findChildViewById3 != null) {
                        com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById3);
                        i = com.qcwireless.qcwatch.R.id.tv_data_date;
                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_data_date);
                        if (textView != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_error_text;
                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_error_text);
                            if (textView2 != null) {
                                return new com.qcwireless.qcwatch.databinding.ActivityBloodOxygenDataDetailBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, findChildViewById, findChildViewById2, bind, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
