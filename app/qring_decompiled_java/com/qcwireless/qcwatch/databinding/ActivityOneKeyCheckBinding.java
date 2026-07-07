package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityOneKeyCheckBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnOnekey;
    public final androidx.constraintlayout.widget.ConstraintLayout csl1;
    public final androidx.constraintlayout.widget.ConstraintLayout csl2;
    public final androidx.constraintlayout.widget.ConstraintLayout csl3;
    public final androidx.constraintlayout.widget.ConstraintLayout csl4;
    public final androidx.constraintlayout.widget.ConstraintLayout cslTop1;
    public final android.widget.ImageView imageBgOnkey;
    public final android.widget.ImageView imageLine;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvBo;
    public final android.widget.TextView tvBoUnit;
    public final android.widget.TextView tvBoValue;
    public final android.widget.TextView tvBp;
    public final android.widget.TextView tvBpUnit;
    public final android.widget.TextView tvBpValue;
    public final android.widget.TextView tvFatigue;
    public final android.widget.TextView tvFatigueUnit;
    public final android.widget.TextView tvFatigueValue;
    public final android.widget.TextView tvHr;
    public final android.widget.TextView tvHrUnit;
    public final android.widget.TextView tvHrValue;
    public final android.widget.TextView tvInfo;
    public final android.widget.TextView tvTestTime;

    private ActivityOneKeyCheckBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnOnekey, androidx.constraintlayout.widget.ConstraintLayout csl1, androidx.constraintlayout.widget.ConstraintLayout csl2, androidx.constraintlayout.widget.ConstraintLayout csl3, androidx.constraintlayout.widget.ConstraintLayout csl4, androidx.constraintlayout.widget.ConstraintLayout cslTop1, android.widget.ImageView imageBgOnkey, android.widget.ImageView imageLine, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvBo, android.widget.TextView tvBoUnit, android.widget.TextView tvBoValue, android.widget.TextView tvBp, android.widget.TextView tvBpUnit, android.widget.TextView tvBpValue, android.widget.TextView tvFatigue, android.widget.TextView tvFatigueUnit, android.widget.TextView tvFatigueValue, android.widget.TextView tvHr, android.widget.TextView tvHrUnit, android.widget.TextView tvHrValue, android.widget.TextView tvInfo, android.widget.TextView tvTestTime) {
        this.rootView = rootView;
        this.btnOnekey = btnOnekey;
        this.csl1 = csl1;
        this.csl2 = csl2;
        this.csl3 = csl3;
        this.csl4 = csl4;
        this.cslTop1 = cslTop1;
        this.imageBgOnkey = imageBgOnkey;
        this.imageLine = imageLine;
        this.titleBar = titleBar;
        this.tvBo = tvBo;
        this.tvBoUnit = tvBoUnit;
        this.tvBoValue = tvBoValue;
        this.tvBp = tvBp;
        this.tvBpUnit = tvBpUnit;
        this.tvBpValue = tvBpValue;
        this.tvFatigue = tvFatigue;
        this.tvFatigueUnit = tvFatigueUnit;
        this.tvFatigueValue = tvFatigueValue;
        this.tvHr = tvHr;
        this.tvHrUnit = tvHrUnit;
        this.tvHrValue = tvHrValue;
        this.tvInfo = tvInfo;
        this.tvTestTime = tvTestTime;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_one_key_check, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_onekey;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_onekey);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.csl_1;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_1);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.csl_2;
                androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_2);
                if (findChildViewById2 != null) {
                    i = com.qcwireless.qcwatch.R.id.csl_3;
                    androidx.constraintlayout.widget.ConstraintLayout findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_3);
                    if (findChildViewById3 != null) {
                        i = com.qcwireless.qcwatch.R.id.csl_4;
                        androidx.constraintlayout.widget.ConstraintLayout findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_4);
                        if (findChildViewById4 != null) {
                            i = com.qcwireless.qcwatch.R.id.csl_top1;
                            androidx.constraintlayout.widget.ConstraintLayout findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_top1);
                            if (findChildViewById5 != null) {
                                i = com.qcwireless.qcwatch.R.id.image_bg_onkey;
                                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_bg_onkey);
                                if (imageView != null) {
                                    i = com.qcwireless.qcwatch.R.id.image_line;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_line);
                                    if (imageView2 != null) {
                                        i = com.qcwireless.qcwatch.R.id.titleBar;
                                        android.view.View findChildViewById6 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                        if (findChildViewById6 != null) {
                                            com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById6);
                                            i = com.qcwireless.qcwatch.R.id.tv_bo;
                                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_bo);
                                            if (textView != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_bo_unit;
                                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_bo_unit);
                                                if (textView2 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_bo_value;
                                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_bo_value);
                                                    if (textView3 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_bp;
                                                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_bp);
                                                        if (textView4 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_bp_unit;
                                                            android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_bp_unit);
                                                            if (textView5 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_bp_value;
                                                                android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_bp_value);
                                                                if (textView6 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_fatigue;
                                                                    android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_fatigue);
                                                                    if (textView7 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_fatigue_unit;
                                                                        android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_fatigue_unit);
                                                                        if (textView8 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_fatigue_value;
                                                                            android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_fatigue_value);
                                                                            if (textView9 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_hr;
                                                                                android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_hr);
                                                                                if (textView10 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_hr_unit;
                                                                                    android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_hr_unit);
                                                                                    if (textView11 != null) {
                                                                                        i = com.qcwireless.qcwatch.R.id.tv_hr_value;
                                                                                        android.widget.TextView textView12 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_hr_value);
                                                                                        if (textView12 != null) {
                                                                                            i = com.qcwireless.qcwatch.R.id.tv_info;
                                                                                            android.widget.TextView textView13 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_info);
                                                                                            if (textView13 != null) {
                                                                                                i = com.qcwireless.qcwatch.R.id.tv_test_time;
                                                                                                android.widget.TextView textView14 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_test_time);
                                                                                                if (textView14 != null) {
                                                                                                    return new com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, imageView, imageView2, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
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
