package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemSleepBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView homeSleepDate;
    public final android.widget.TextView homeSleepH;
    public final android.widget.TextView homeSleepMin;
    public final android.widget.TextView homeSleepTitle;
    public final android.widget.TextView homeSleepValue;
    public final android.widget.TextView homeSleepValueMin;
    public final com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieView homeSleepView;
    public final android.widget.ImageView imageIcon;
    public final android.widget.ImageView imageNoData;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvNoData;
    public final android.widget.TextView tvSleepAwake;
    public final android.widget.TextView tvSleepDeep;
    public final android.widget.TextView tvSleepLight;

    private RecycleviewItemSleepBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView homeSleepDate, android.widget.TextView homeSleepH, android.widget.TextView homeSleepMin, android.widget.TextView homeSleepTitle, android.widget.TextView homeSleepValue, android.widget.TextView homeSleepValueMin, com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieView homeSleepView, android.widget.ImageView imageIcon, android.widget.ImageView imageNoData, android.widget.TextView tvNoData, android.widget.TextView tvSleepAwake, android.widget.TextView tvSleepDeep, android.widget.TextView tvSleepLight) {
        this.rootView = rootView;
        this.homeSleepDate = homeSleepDate;
        this.homeSleepH = homeSleepH;
        this.homeSleepMin = homeSleepMin;
        this.homeSleepTitle = homeSleepTitle;
        this.homeSleepValue = homeSleepValue;
        this.homeSleepValueMin = homeSleepValueMin;
        this.homeSleepView = homeSleepView;
        this.imageIcon = imageIcon;
        this.imageNoData = imageNoData;
        this.tvNoData = tvNoData;
        this.tvSleepAwake = tvSleepAwake;
        this.tvSleepDeep = tvSleepDeep;
        this.tvSleepLight = tvSleepLight;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSleepBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSleepBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_sleep, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSleepBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.home_sleep_date;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sleep_date);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.home_sleep_h;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sleep_h);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.home_sleep_min;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sleep_min);
                if (textView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.home_sleep_title;
                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sleep_title);
                    if (textView4 != null) {
                        i = com.qcwireless.qcwatch.R.id.home_sleep_value;
                        android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sleep_value);
                        if (textView5 != null) {
                            i = com.qcwireless.qcwatch.R.id.home_sleep_value_min;
                            android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sleep_value_min);
                            if (textView6 != null) {
                                i = com.qcwireless.qcwatch.R.id.home_sleep_view;
                                com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieView qSleepCirclePieView = (com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sleep_view);
                                if (qSleepCirclePieView != null) {
                                    i = com.qcwireless.qcwatch.R.id.image_icon;
                                    android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_icon);
                                    if (imageView != null) {
                                        i = com.qcwireless.qcwatch.R.id.image_no_data;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_no_data);
                                        if (imageView2 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_no_data;
                                            android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_no_data);
                                            if (textView7 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_sleep_awake;
                                                android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_awake);
                                                if (textView8 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_sleep_deep;
                                                    android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_deep);
                                                    if (textView9 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_sleep_light;
                                                        android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sleep_light);
                                                        if (textView10 != null) {
                                                            return new com.qcwireless.qcwatch.databinding.RecycleviewItemSleepBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3, textView4, textView5, textView6, qSleepCirclePieView, imageView, imageView2, textView7, textView8, textView9, textView10);
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
