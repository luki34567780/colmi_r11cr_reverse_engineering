package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemBloodOxygenBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.LinearLayout boLl;
    public final androidx.constraintlayout.widget.Group heartMeasuringGroup;
    public final androidx.constraintlayout.widget.Group heartMeasuringGroup2;
    public final android.widget.TextView homeBoDate;
    public final android.widget.TextView homeBoTitle;
    public final android.widget.TextView homeBoUnit;
    public final android.widget.TextView homeBoUnit1;
    public final android.widget.TextView homeBoValue;
    public final com.qcwireless.qcwatch.ui.base.view.PGBloodOxygenView homeBoView;
    public final android.widget.TextView homeHeartValueMeasuring;
    public final android.widget.TextView homeHeartValueMeasuring1;
    public final android.widget.TextView homeTextMeasure;
    public final android.widget.ImageView imageIcon;
    public final android.widget.ImageView imageNoData;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemBloodOxygenBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.LinearLayout boLl, androidx.constraintlayout.widget.Group heartMeasuringGroup, androidx.constraintlayout.widget.Group heartMeasuringGroup2, android.widget.TextView homeBoDate, android.widget.TextView homeBoTitle, android.widget.TextView homeBoUnit, android.widget.TextView homeBoUnit1, android.widget.TextView homeBoValue, com.qcwireless.qcwatch.ui.base.view.PGBloodOxygenView homeBoView, android.widget.TextView homeHeartValueMeasuring, android.widget.TextView homeHeartValueMeasuring1, android.widget.TextView homeTextMeasure, android.widget.ImageView imageIcon, android.widget.ImageView imageNoData) {
        this.rootView = rootView;
        this.boLl = boLl;
        this.heartMeasuringGroup = heartMeasuringGroup;
        this.heartMeasuringGroup2 = heartMeasuringGroup2;
        this.homeBoDate = homeBoDate;
        this.homeBoTitle = homeBoTitle;
        this.homeBoUnit = homeBoUnit;
        this.homeBoUnit1 = homeBoUnit1;
        this.homeBoValue = homeBoValue;
        this.homeBoView = homeBoView;
        this.homeHeartValueMeasuring = homeHeartValueMeasuring;
        this.homeHeartValueMeasuring1 = homeHeartValueMeasuring1;
        this.homeTextMeasure = homeTextMeasure;
        this.imageIcon = imageIcon;
        this.imageNoData = imageNoData;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemBloodOxygenBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemBloodOxygenBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_blood_oxygen, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemBloodOxygenBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.bo_ll;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.bo_ll);
        if (linearLayout != null) {
            i = com.qcwireless.qcwatch.R.id.heart_measuring_group;
            androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_measuring_group);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.heart_measuring_group_2;
                androidx.constraintlayout.widget.Group findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.heart_measuring_group_2);
                if (findChildViewById2 != null) {
                    i = com.qcwireless.qcwatch.R.id.home_bo_date;
                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_date);
                    if (textView != null) {
                        i = com.qcwireless.qcwatch.R.id.home_bo_title;
                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_title);
                        if (textView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.home_bo_unit;
                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_unit);
                            if (textView3 != null) {
                                i = com.qcwireless.qcwatch.R.id.home_bo_unit_1;
                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_unit_1);
                                if (textView4 != null) {
                                    i = com.qcwireless.qcwatch.R.id.home_bo_value;
                                    android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_value);
                                    if (textView5 != null) {
                                        i = com.qcwireless.qcwatch.R.id.home_bo_view;
                                        com.qcwireless.qcwatch.ui.base.view.PGBloodOxygenView pGBloodOxygenView = (com.qcwireless.qcwatch.ui.base.view.PGBloodOxygenView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_view);
                                        if (pGBloodOxygenView != null) {
                                            i = com.qcwireless.qcwatch.R.id.home_heart_value_measuring;
                                            android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_value_measuring);
                                            if (textView6 != null) {
                                                i = com.qcwireless.qcwatch.R.id.home_heart_value_measuring_1;
                                                android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_heart_value_measuring_1);
                                                if (textView7 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.home_text_measure;
                                                    android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_text_measure);
                                                    if (textView8 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.image_icon;
                                                        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_icon);
                                                        if (imageView != null) {
                                                            i = com.qcwireless.qcwatch.R.id.image_no_data;
                                                            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_no_data);
                                                            if (imageView2 != null) {
                                                                return new com.qcwireless.qcwatch.databinding.RecycleviewItemBloodOxygenBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, linearLayout, findChildViewById, findChildViewById2, textView, textView2, textView3, textView4, textView5, pGBloodOxygenView, textView6, textView7, textView8, imageView, imageView2);
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
