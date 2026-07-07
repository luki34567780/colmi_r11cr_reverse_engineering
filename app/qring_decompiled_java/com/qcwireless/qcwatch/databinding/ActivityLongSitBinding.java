package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityLongSitBinding implements androidx.viewbinding.ViewBinding {
    public final android.view.View line1;
    public final android.view.View line2;
    public final android.widget.RelativeLayout linearRcv;
    public final androidx.constraintlayout.widget.Group longSitGroup;
    public final com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup longSitRadioGroup;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcLongSitEnd;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcLongSitStart;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcLongSwitch;
    public final android.widget.RadioButton rbText1;
    public final android.widget.RadioButton rbText2;
    public final android.widget.RadioButton rbText3;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView subTitle1;
    public final android.widget.TextView subTitle2;
    public final android.widget.TextView subTitle3;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final androidx.recyclerview.widget.RecyclerView weekDayRecycler;

    private ActivityLongSitBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.view.View line1, android.view.View line2, android.widget.RelativeLayout linearRcv, androidx.constraintlayout.widget.Group longSitGroup, com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup longSitRadioGroup, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcLongSitEnd, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcLongSitStart, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcLongSwitch, android.widget.RadioButton rbText1, android.widget.RadioButton rbText2, android.widget.RadioButton rbText3, android.widget.TextView subTitle1, android.widget.TextView subTitle2, android.widget.TextView subTitle3, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, androidx.recyclerview.widget.RecyclerView weekDayRecycler) {
        this.rootView = rootView;
        this.line1 = line1;
        this.line2 = line2;
        this.linearRcv = linearRcv;
        this.longSitGroup = longSitGroup;
        this.longSitRadioGroup = longSitRadioGroup;
        this.qcLongSitEnd = qcLongSitEnd;
        this.qcLongSitStart = qcLongSitStart;
        this.qcLongSwitch = qcLongSwitch;
        this.rbText1 = rbText1;
        this.rbText2 = rbText2;
        this.rbText3 = rbText3;
        this.subTitle1 = subTitle1;
        this.subTitle2 = subTitle2;
        this.subTitle3 = subTitle3;
        this.titleBar = titleBar;
        this.weekDayRecycler = weekDayRecycler;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityLongSitBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityLongSitBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_long_sit, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityLongSitBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.line_1;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.line_2;
            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_2);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.linear_rcv;
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.linear_rcv);
                if (relativeLayout != null) {
                    i = com.qcwireless.qcwatch.R.id.long_sit_group;
                    androidx.constraintlayout.widget.Group findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.long_sit_group);
                    if (findChildViewById3 != null) {
                        i = com.qcwireless.qcwatch.R.id.long_sit_radio_group;
                        com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup constraintRadioGroup = (com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.long_sit_radio_group);
                        if (constraintRadioGroup != null) {
                            i = com.qcwireless.qcwatch.R.id.qc_long_sit_end;
                            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_long_sit_end);
                            if (qSettingItem != null) {
                                i = com.qcwireless.qcwatch.R.id.qc_long_sit_start;
                                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_long_sit_start);
                                if (qSettingItem2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.qc_long_switch;
                                    com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_long_switch);
                                    if (qSettingItemWithClickSystem != null) {
                                        i = com.qcwireless.qcwatch.R.id.rb_text1;
                                        android.widget.RadioButton radioButton = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text1);
                                        if (radioButton != null) {
                                            i = com.qcwireless.qcwatch.R.id.rb_text2;
                                            android.widget.RadioButton radioButton2 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text2);
                                            if (radioButton2 != null) {
                                                i = com.qcwireless.qcwatch.R.id.rb_text3;
                                                android.widget.RadioButton radioButton3 = (android.widget.RadioButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rb_text3);
                                                if (radioButton3 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.sub_title_1;
                                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sub_title_1);
                                                    if (textView != null) {
                                                        i = com.qcwireless.qcwatch.R.id.sub_title_2;
                                                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sub_title_2);
                                                        if (textView2 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.sub_title_3;
                                                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sub_title_3);
                                                            if (textView3 != null) {
                                                                i = 2131297388;
                                                                android.view.View findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                                                if (findChildViewById4 != null) {
                                                                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById4);
                                                                    i = com.qcwireless.qcwatch.R.id.week_day_recycler;
                                                                    androidx.recyclerview.widget.RecyclerView findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.week_day_recycler);
                                                                    if (findChildViewById5 != null) {
                                                                        return new com.qcwireless.qcwatch.databinding.ActivityLongSitBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, findChildViewById2, relativeLayout, findChildViewById3, constraintRadioGroup, qSettingItem, qSettingItem2, qSettingItemWithClickSystem, radioButton, radioButton2, radioButton3, textView, textView2, textView3, bind, findChildViewById5);
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
