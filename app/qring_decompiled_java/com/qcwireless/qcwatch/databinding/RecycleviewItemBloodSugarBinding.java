package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemBloodSugarBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Group heartMeasuringGroup;
    public final android.widget.TextView homeHeartValueMeasuring;
    public final android.widget.TextView homeHeartValueMeasuring1;
    public final android.widget.TextView homeSugarDate;
    public final android.widget.TextView homeSugarTitle;
    public final android.widget.TextView homeSugarUnit;
    public final android.widget.TextView homeSugarValue;
    public final com.qcwireless.qcwatch.ui.base.view.PGBloodSugarView homeSugarView;
    public final android.widget.TextView homeTextMeasure;
    public final android.widget.ImageView imageIcon;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.LinearLayout sugarLl;

    private RecycleviewItemBloodSugarBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.Group heartMeasuringGroup, android.widget.TextView homeHeartValueMeasuring, android.widget.TextView homeHeartValueMeasuring1, android.widget.TextView homeSugarDate, android.widget.TextView homeSugarTitle, android.widget.TextView homeSugarUnit, android.widget.TextView homeSugarValue, com.qcwireless.qcwatch.ui.base.view.PGBloodSugarView homeSugarView, android.widget.TextView homeTextMeasure, android.widget.ImageView imageIcon, android.widget.LinearLayout sugarLl) {
        this.rootView = rootView;
        this.heartMeasuringGroup = heartMeasuringGroup;
        this.homeHeartValueMeasuring = homeHeartValueMeasuring;
        this.homeHeartValueMeasuring1 = homeHeartValueMeasuring1;
        this.homeSugarDate = homeSugarDate;
        this.homeSugarTitle = homeSugarTitle;
        this.homeSugarUnit = homeSugarUnit;
        this.homeSugarValue = homeSugarValue;
        this.homeSugarView = homeSugarView;
        this.homeTextMeasure = homeTextMeasure;
        this.imageIcon = imageIcon;
        this.sugarLl = sugarLl;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemBloodSugarBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemBloodSugarBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_blood_sugar, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemBloodSugarBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.heart_measuring_group;
        androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_measuring_group);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.home_heart_value_measuring;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_value_measuring);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.home_heart_value_measuring_1;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_value_measuring_1);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.home_sugar_date;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sugar_date);
                    if (textView3 != null) {
                        i = com.qcwireless.qcwatch.R.id.home_sugar_title;
                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sugar_title);
                        if (textView4 != null) {
                            i = com.qcwireless.qcwatch.R.id.home_sugar_unit;
                            android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sugar_unit);
                            if (textView5 != null) {
                                i = com.qcwireless.qcwatch.R.id.home_sugar_value;
                                android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sugar_value);
                                if (textView6 != null) {
                                    i = com.qcwireless.qcwatch.R.id.home_sugar_view;
                                    com.qcwireless.qcwatch.ui.base.view.PGBloodSugarView pGBloodSugarView = (com.qcwireless.qcwatch.ui.base.view.PGBloodSugarView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_sugar_view);
                                    if (pGBloodSugarView != null) {
                                        i = com.qcwireless.qcwatch.R.id.home_text_measure;
                                        android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_text_measure);
                                        if (textView7 != null) {
                                            i = com.qcwireless.qcwatch.R.id.image_icon;
                                            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_icon);
                                            if (imageView != null) {
                                                i = com.qcwireless.qcwatch.R.id.sugar_ll;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sugar_ll);
                                                if (linearLayout != null) {
                                                    return new com.qcwireless.qcwatch.databinding.RecycleviewItemBloodSugarBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, textView, textView2, textView3, textView4, textView5, textView6, pGBloodSugarView, textView7, imageView, linearLayout);
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
