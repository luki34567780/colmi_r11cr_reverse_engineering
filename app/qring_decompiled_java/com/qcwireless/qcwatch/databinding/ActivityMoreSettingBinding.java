package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityMoreSettingBinding implements androidx.viewbinding.ViewBinding {
    public final android.view.View line1;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreEcard;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreFactory;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreRestart;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreScreen;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingUnit;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingWeather;
    private final android.widget.LinearLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityMoreSettingBinding(android.widget.LinearLayout rootView, android.view.View line1, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreEcard, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreFactory, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreRestart, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcMoreScreen, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingUnit, com.qcwireless.qcwatch.ui.base.view.QSettingItem qcSettingWeather, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.line1 = line1;
        this.qcMoreEcard = qcMoreEcard;
        this.qcMoreFactory = qcMoreFactory;
        this.qcMoreRestart = qcMoreRestart;
        this.qcMoreScreen = qcMoreScreen;
        this.qcSettingUnit = qcSettingUnit;
        this.qcSettingWeather = qcSettingWeather;
        this.titleBar = titleBar;
    }

    public android.widget.LinearLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_more_setting, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.line_1;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.qc_more_ecard;
            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_more_ecard);
            if (qSettingItem != null) {
                i = com.qcwireless.qcwatch.R.id.qc_more_factory;
                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_more_factory);
                if (qSettingItem2 != null) {
                    i = com.qcwireless.qcwatch.R.id.qc_more_restart;
                    com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem3 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_more_restart);
                    if (qSettingItem3 != null) {
                        i = com.qcwireless.qcwatch.R.id.qc_more_screen;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem4 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_more_screen);
                        if (qSettingItem4 != null) {
                            i = com.qcwireless.qcwatch.R.id.qc_setting_unit;
                            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem5 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_unit);
                            if (qSettingItem5 != null) {
                                i = com.qcwireless.qcwatch.R.id.qc_setting_weather;
                                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem6 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_setting_weather);
                                if (qSettingItem6 != null) {
                                    i = com.qcwireless.qcwatch.R.id.titleBar;
                                    android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                    if (findChildViewById2 != null) {
                                        return new com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding((android.widget.LinearLayout) rootView, findChildViewById, qSettingItem, qSettingItem2, qSettingItem3, qSettingItem4, qSettingItem5, qSettingItem6, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2));
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
