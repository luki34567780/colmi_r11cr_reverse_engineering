package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemHeaderBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnAddDevice;
    public final androidx.constraintlayout.widget.ConstraintLayout dataNoBinding;
    public final android.widget.TextView guide1;
    public final android.widget.TextView healthyTextTitle;
    public final android.widget.TextView homeStepDate;
    public final android.widget.TextView homeStepTitle;
    public final android.widget.ImageView image1;
    public final android.widget.ImageView imageBleStatus;
    public final android.widget.ImageView imageIcon;
    public final android.widget.ImageView imageRight;
    public final android.widget.ImageView imageView1;
    public final com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView;
    public final com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle qcStepChart;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final androidx.constraintlayout.widget.ConstraintLayout todayStepLayout;
    public final android.widget.TextView tvBind;
    public final android.widget.TextView tvCalorie;
    public final android.widget.TextView tvCalorieTitle;
    public final android.widget.TextView tvCalorieUnit;
    public final android.widget.TextView tvDistance;
    public final android.widget.TextView tvDistanceTitle;
    public final android.widget.TextView tvDistanceUnit;
    public final android.widget.TextView tvStepUnit;
    public final android.widget.TextView tvTodaySteps;
    public final android.widget.TextView tvTodayStepsTitle;
    public final androidx.constraintlayout.widget.ConstraintLayout warmingInfo;

    private RecycleviewItemHeaderBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnAddDevice, androidx.constraintlayout.widget.ConstraintLayout dataNoBinding, android.widget.TextView guide1, android.widget.TextView healthyTextTitle, android.widget.TextView homeStepDate, android.widget.TextView homeStepTitle, android.widget.ImageView image1, android.widget.ImageView imageBleStatus, android.widget.ImageView imageIcon, android.widget.ImageView imageRight, android.widget.ImageView imageView1, com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView, com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle qcStepChart, androidx.constraintlayout.widget.ConstraintLayout todayStepLayout, android.widget.TextView tvBind, android.widget.TextView tvCalorie, android.widget.TextView tvCalorieTitle, android.widget.TextView tvCalorieUnit, android.widget.TextView tvDistance, android.widget.TextView tvDistanceTitle, android.widget.TextView tvDistanceUnit, android.widget.TextView tvStepUnit, android.widget.TextView tvTodaySteps, android.widget.TextView tvTodayStepsTitle, androidx.constraintlayout.widget.ConstraintLayout warmingInfo) {
        this.rootView = rootView;
        this.btnAddDevice = btnAddDevice;
        this.dataNoBinding = dataNoBinding;
        this.guide1 = guide1;
        this.healthyTextTitle = healthyTextTitle;
        this.homeStepDate = homeStepDate;
        this.homeStepTitle = homeStepTitle;
        this.image1 = image1;
        this.imageBleStatus = imageBleStatus;
        this.imageIcon = imageIcon;
        this.imageRight = imageRight;
        this.imageView1 = imageView1;
        this.marqueeView = marqueeView;
        this.qcStepChart = qcStepChart;
        this.todayStepLayout = todayStepLayout;
        this.tvBind = tvBind;
        this.tvCalorie = tvCalorie;
        this.tvCalorieTitle = tvCalorieTitle;
        this.tvCalorieUnit = tvCalorieUnit;
        this.tvDistance = tvDistance;
        this.tvDistanceTitle = tvDistanceTitle;
        this.tvDistanceUnit = tvDistanceUnit;
        this.tvStepUnit = tvStepUnit;
        this.tvTodaySteps = tvTodaySteps;
        this.tvTodayStepsTitle = tvTodayStepsTitle;
        this.warmingInfo = warmingInfo;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemHeaderBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemHeaderBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_header, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemHeaderBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_add_device;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_add_device);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.data_no_binding;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.data_no_binding);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.guide_1;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.guide_1);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.healthy_text_title;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.healthy_text_title);
                    if (textView2 != null) {
                        i = com.qcwireless.qcwatch.R.id.home_step_date;
                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_step_date);
                        if (textView3 != null) {
                            i = com.qcwireless.qcwatch.R.id.home_step_title;
                            android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_step_title);
                            if (textView4 != null) {
                                i = com.qcwireless.qcwatch.R.id.image_1;
                                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_1);
                                if (imageView != null) {
                                    i = com.qcwireless.qcwatch.R.id.image_ble_status;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_ble_status);
                                    if (imageView2 != null) {
                                        i = com.qcwireless.qcwatch.R.id.image_icon;
                                        android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_icon);
                                        if (imageView3 != null) {
                                            i = com.qcwireless.qcwatch.R.id.image_right;
                                            android.widget.ImageView imageView4 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_right);
                                            if (imageView4 != null) {
                                                i = com.qcwireless.qcwatch.R.id.image_view_1;
                                                android.widget.ImageView imageView5 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_view_1);
                                                if (imageView5 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.marquee_view;
                                                    com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView = (com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.marquee_view);
                                                    if (marqueeView != null) {
                                                        i = com.qcwireless.qcwatch.R.id.qc_step_chart;
                                                        com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle = (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_step_chart);
                                                        if (pubuProgressCircle != null) {
                                                            i = com.qcwireless.qcwatch.R.id.today_step_layout;
                                                            androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.today_step_layout);
                                                            if (findChildViewById2 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_bind;
                                                                android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_bind);
                                                                if (textView5 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_calorie;
                                                                    android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_calorie);
                                                                    if (textView6 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_calorie_title;
                                                                        android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_calorie_title);
                                                                        if (textView7 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_calorie_unit;
                                                                            android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_calorie_unit);
                                                                            if (textView8 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_distance;
                                                                                android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_distance);
                                                                                if (textView9 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_distance_title;
                                                                                    android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_distance_title);
                                                                                    if (textView10 != null) {
                                                                                        i = com.qcwireless.qcwatch.R.id.tv_distance_unit;
                                                                                        android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_distance_unit);
                                                                                        if (textView11 != null) {
                                                                                            i = com.qcwireless.qcwatch.R.id.tv_step_unit;
                                                                                            android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_step_unit);
                                                                                            if (textView12 != null) {
                                                                                                i = com.qcwireless.qcwatch.R.id.tv_today_steps;
                                                                                                android.widget.TextView textView13 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_today_steps);
                                                                                                if (textView13 != null) {
                                                                                                    i = com.qcwireless.qcwatch.R.id.tv_today_steps_title;
                                                                                                    android.widget.TextView textView14 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_today_steps_title);
                                                                                                    if (textView14 != null) {
                                                                                                        i = com.qcwireless.qcwatch.R.id.warming_info;
                                                                                                        androidx.constraintlayout.widget.ConstraintLayout findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.warming_info);
                                                                                                        if (findChildViewById3 != null) {
                                                                                                            return new com.qcwireless.qcwatch.databinding.RecycleviewItemHeaderBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, findChildViewById, textView, textView2, textView3, textView4, imageView, imageView2, imageView3, imageView4, imageView5, marqueeView, pubuProgressCircle, findChildViewById2, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, findChildViewById3);
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
