package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityBackgroundRunningGuideTwoBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView image1Right;
    public final android.widget.ImageView image2Right;
    public final android.widget.ImageView image3Right;
    public final android.widget.ImageView image4Right;
    public final android.widget.ImageView imageBatteryRight;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvAutoBattery;
    public final android.widget.TextView tvAutoBatteryTitle;
    public final android.widget.TextView tvAutoDelete;
    public final android.widget.TextView tvAutoDeleteTitle;
    public final android.widget.TextView tvAutoStart;
    public final android.widget.TextView tvBatteryWhite;
    public final android.widget.TextView tvBatteryWhiteSub;
    public final android.widget.TextView tvNotification;
    public final android.widget.TextView tvStatusText1;
    public final android.widget.TextView tvStatusText2;
    public final android.widget.TextView tvStatusText3;
    public final android.widget.TextView tvStatusText4;
    public final android.widget.TextView tvStatusText5;

    private ActivityBackgroundRunningGuideTwoBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView image1Right, android.widget.ImageView image2Right, android.widget.ImageView image3Right, android.widget.ImageView image4Right, android.widget.ImageView imageBatteryRight, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvAutoBattery, android.widget.TextView tvAutoBatteryTitle, android.widget.TextView tvAutoDelete, android.widget.TextView tvAutoDeleteTitle, android.widget.TextView tvAutoStart, android.widget.TextView tvBatteryWhite, android.widget.TextView tvBatteryWhiteSub, android.widget.TextView tvNotification, android.widget.TextView tvStatusText1, android.widget.TextView tvStatusText2, android.widget.TextView tvStatusText3, android.widget.TextView tvStatusText4, android.widget.TextView tvStatusText5) {
        this.rootView = rootView;
        this.image1Right = image1Right;
        this.image2Right = image2Right;
        this.image3Right = image3Right;
        this.image4Right = image4Right;
        this.imageBatteryRight = imageBatteryRight;
        this.titleBar = titleBar;
        this.tvAutoBattery = tvAutoBattery;
        this.tvAutoBatteryTitle = tvAutoBatteryTitle;
        this.tvAutoDelete = tvAutoDelete;
        this.tvAutoDeleteTitle = tvAutoDeleteTitle;
        this.tvAutoStart = tvAutoStart;
        this.tvBatteryWhite = tvBatteryWhite;
        this.tvBatteryWhiteSub = tvBatteryWhiteSub;
        this.tvNotification = tvNotification;
        this.tvStatusText1 = tvStatusText1;
        this.tvStatusText2 = tvStatusText2;
        this.tvStatusText3 = tvStatusText3;
        this.tvStatusText4 = tvStatusText4;
        this.tvStatusText5 = tvStatusText5;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_background_running_guide_two, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_1_right;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_1_right);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.image_2_right;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_2_right);
            if (imageView2 != null) {
                i = com.qcwireless.qcwatch.R.id.image_3_right;
                android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_3_right);
                if (imageView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.image_4_right;
                    android.widget.ImageView imageView4 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_4_right);
                    if (imageView4 != null) {
                        i = com.qcwireless.qcwatch.R.id.image_battery_right;
                        android.widget.ImageView imageView5 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_battery_right);
                        if (imageView5 != null) {
                            i = 2131297388;
                            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                            if (findChildViewById != null) {
                                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                                i = com.qcwireless.qcwatch.R.id.tv_auto_battery;
                                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_auto_battery);
                                if (textView != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_auto_battery_title;
                                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_auto_battery_title);
                                    if (textView2 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_auto_delete;
                                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_auto_delete);
                                        if (textView3 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_auto_delete_title;
                                            android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_auto_delete_title);
                                            if (textView4 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_auto_start;
                                                android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_auto_start);
                                                if (textView5 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_battery_white;
                                                    android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_battery_white);
                                                    if (textView6 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_battery_white_sub;
                                                        android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_battery_white_sub);
                                                        if (textView7 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_notification;
                                                            android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_notification);
                                                            if (textView8 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_status_text_1;
                                                                android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_status_text_1);
                                                                if (textView9 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_status_text_2;
                                                                    android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_status_text_2);
                                                                    if (textView10 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_status_text_3;
                                                                        android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_status_text_3);
                                                                        if (textView11 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_status_text_4;
                                                                            android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_status_text_4);
                                                                            if (textView12 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_status_text_5;
                                                                                android.widget.TextView textView13 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_status_text_5);
                                                                                if (textView13 != null) {
                                                                                    return new com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, imageView3, imageView4, imageView5, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
