package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityUserProfileBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView btnExit;
    public final android.widget.LinearLayout layoutProfile;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterBirthday;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterGender;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterHeight;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterName;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterWeight;
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItem userLogOff;

    private ActivityUserProfileBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView btnExit, android.widget.LinearLayout layoutProfile, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterBirthday, com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterGender, com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterHeight, com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterName, com.qcwireless.qcwatch.ui.base.view.QSettingItem userCenterWeight, com.qcwireless.qcwatch.ui.base.view.QSettingItem userLogOff) {
        this.rootView = rootView;
        this.btnExit = btnExit;
        this.layoutProfile = layoutProfile;
        this.titleBar = titleBar;
        this.userCenterBirthday = userCenterBirthday;
        this.userCenterGender = userCenterGender;
        this.userCenterHeight = userCenterHeight;
        this.userCenterName = userCenterName;
        this.userCenterWeight = userCenterWeight;
        this.userLogOff = userLogOff;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_user_profile, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_exit;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_exit);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.layout_profile;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.layout_profile);
            if (linearLayout != null) {
                i = 2131297388;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                if (findChildViewById != null) {
                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                    i = com.qcwireless.qcwatch.R.id.user_center_birthday;
                    com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_center_birthday);
                    if (qSettingItem != null) {
                        i = com.qcwireless.qcwatch.R.id.user_center_gender;
                        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_center_gender);
                        if (qSettingItem2 != null) {
                            i = com.qcwireless.qcwatch.R.id.user_center_height;
                            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem3 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_center_height);
                            if (qSettingItem3 != null) {
                                i = com.qcwireless.qcwatch.R.id.user_center_name;
                                com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem4 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_center_name);
                                if (qSettingItem4 != null) {
                                    i = com.qcwireless.qcwatch.R.id.user_center_weight;
                                    com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem5 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_center_weight);
                                    if (qSettingItem5 != null) {
                                        i = com.qcwireless.qcwatch.R.id.user_log_off;
                                        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem6 = (com.qcwireless.qcwatch.ui.base.view.QSettingItem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_log_off);
                                        if (qSettingItem6 != null) {
                                            return new com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, linearLayout, bind, qSettingItem, qSettingItem2, qSettingItem3, qSettingItem4, qSettingItem5, qSettingItem6);
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
