package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemMenstruationBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView homeBoDate;
    public final android.widget.TextView homeBoTitle;
    public final android.widget.TextView homeBoUnit;
    public final android.widget.TextView homeBoValue;
    public final android.widget.ImageView imageIcon;
    public final android.widget.ImageView imageNoData;
    public final com.qcwireless.qcwatch.ui.base.view.QHomeMenstruationView qmsView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemMenstruationBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView homeBoDate, android.widget.TextView homeBoTitle, android.widget.TextView homeBoUnit, android.widget.TextView homeBoValue, android.widget.ImageView imageIcon, android.widget.ImageView imageNoData, com.qcwireless.qcwatch.ui.base.view.QHomeMenstruationView qmsView) {
        this.rootView = rootView;
        this.homeBoDate = homeBoDate;
        this.homeBoTitle = homeBoTitle;
        this.homeBoUnit = homeBoUnit;
        this.homeBoValue = homeBoValue;
        this.imageIcon = imageIcon;
        this.imageNoData = imageNoData;
        this.qmsView = qmsView;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMenstruationBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMenstruationBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_menstruation, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMenstruationBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.home_bo_date;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_date);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.home_bo_title;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_title);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.home_bo_unit;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_unit);
                if (textView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.home_bo_value;
                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.home_bo_value);
                    if (textView4 != null) {
                        i = com.qcwireless.qcwatch.R.id.image_icon;
                        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_icon);
                        if (imageView != null) {
                            i = com.qcwireless.qcwatch.R.id.image_no_data;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_no_data);
                            if (imageView2 != null) {
                                i = com.qcwireless.qcwatch.R.id.qms_view;
                                com.qcwireless.qcwatch.ui.base.view.QHomeMenstruationView qHomeMenstruationView = (com.qcwireless.qcwatch.ui.base.view.QHomeMenstruationView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qms_view);
                                if (qHomeMenstruationView != null) {
                                    return new com.qcwireless.qcwatch.databinding.RecycleviewItemMenstruationBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3, textView4, imageView, imageView2, qHomeMenstruationView);
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
