package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityAiReminderBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView addAlarm;
    public final android.view.View dot2;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcDrink;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcDrink1;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcLongSit;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcLongSit1;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingUnit;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingWeather;
    public final androidx.recyclerview.widget.RecyclerView rcvAlarm;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView subTitle1;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvReminderTitle;

    private ActivityAiReminderBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView addAlarm, android.view.View dot2, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcDrink, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcDrink1, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcLongSit, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcLongSit1, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingUnit, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingWeather, androidx.recyclerview.widget.RecyclerView rcvAlarm, android.widget.TextView subTitle1, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvReminderTitle) {
        this.rootView = rootView;
        this.addAlarm = addAlarm;
        this.dot2 = dot2;
        this.qcDrink = qcDrink;
        this.qcDrink1 = qcDrink1;
        this.qcLongSit = qcLongSit;
        this.qcLongSit1 = qcLongSit1;
        this.qcSettingUnit = qcSettingUnit;
        this.qcSettingWeather = qcSettingWeather;
        this.rcvAlarm = rcvAlarm;
        this.subTitle1 = subTitle1;
        this.titleBar = titleBar;
        this.tvReminderTitle = tvReminderTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_ai_reminder, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.add_alarm;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.add_alarm);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.dot_2;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.dot_2);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.qc_drink;
                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_drink);
                if (qSettingItem != null) {
                    i = com.qcwireless.qcwatch.R.id.qc_drink_1;
                    com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_drink_1);
                    if (qSettingItem2 != null) {
                        i = com.qcwireless.qcwatch.R.id.qc_long_sit;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem3 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_long_sit);
                        if (qSettingItem3 != null) {
                            i = com.qcwireless.qcwatch.R.id.qc_long_sit_1;
                            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem4 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_long_sit_1);
                            if (qSettingItem4 != null) {
                                i = com.qcwireless.qcwatch.R.id.qc_setting_unit;
                                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem5 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_unit);
                                if (qSettingItem5 != null) {
                                    i = com.qcwireless.qcwatch.R.id.qc_setting_weather;
                                    com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem6 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_weather);
                                    if (qSettingItem6 != null) {
                                        i = com.qcwireless.qcwatch.R.id.rcv_alarm;
                                        androidx.recyclerview.widget.RecyclerView findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_alarm);
                                        if (findChildViewById2 != null) {
                                            i = com.qcwireless.qcwatch.R.id.sub_title_1;
                                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sub_title_1);
                                            if (textView != null) {
                                                i = com.qcwireless.qcwatch.R.id.titleBar;
                                                android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                                if (findChildViewById3 != null) {
                                                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById3);
                                                    i = com.qcwireless.qcwatch.R.id.tv_reminder_title;
                                                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_reminder_title);
                                                    if (textView2 != null) {
                                                        return new com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, findChildViewById, qSettingItem, qSettingItem2, qSettingItem3, qSettingItem4, qSettingItem5, qSettingItem6, findChildViewById2, textView, bind, textView2);
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
