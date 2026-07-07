package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemGpsDetailBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView detail0;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView detail1;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView detail2;
    public final androidx.constraintlayout.widget.Group groupSportDetail;
    public final android.widget.ImageView imageClick;
    public final androidx.constraintlayout.widget.ConstraintLayout itemLayout;
    public final android.widget.TextView line1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView sportTypeImage;
    public final com.qcwireless.qcwatch.ui.base.view.QSportItemView totalDays;
    public final android.widget.TextView tvGpsStartTime;
    public final android.widget.TextView tvTitle1;

    private RecycleviewItemGpsDetailBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSportItemView detail0, com.qcwireless.qcwatch.ui.base.view.QSportItemView detail1, com.qcwireless.qcwatch.ui.base.view.QSportItemView detail2, androidx.constraintlayout.widget.Group groupSportDetail, android.widget.ImageView imageClick, androidx.constraintlayout.widget.ConstraintLayout itemLayout, android.widget.TextView line1, android.widget.TextView sportTypeImage, com.qcwireless.qcwatch.ui.base.view.QSportItemView totalDays, android.widget.TextView tvGpsStartTime, android.widget.TextView tvTitle1) {
        this.rootView = rootView;
        this.detail0 = detail0;
        this.detail1 = detail1;
        this.detail2 = detail2;
        this.groupSportDetail = groupSportDetail;
        this.imageClick = imageClick;
        this.itemLayout = itemLayout;
        this.line1 = line1;
        this.sportTypeImage = sportTypeImage;
        this.totalDays = totalDays;
        this.tvGpsStartTime = tvGpsStartTime;
        this.tvTitle1 = tvTitle1;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemGpsDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemGpsDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_gps_detail, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemGpsDetailBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.detail_0;
        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.detail_0);
        if (qSportItemView != null) {
            i = com.qcwireless.qcwatch.R.id.detail_1;
            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.detail_1);
            if (qSportItemView2 != null) {
                i = com.qcwireless.qcwatch.R.id.detail_2;
                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.detail_2);
                if (qSportItemView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.group_sport_detail;
                    androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.group_sport_detail);
                    if (findChildViewById != null) {
                        i = com.qcwireless.qcwatch.R.id.image_click;
                        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_click);
                        if (imageView != null) {
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) rootView;
                            i = com.qcwireless.qcwatch.R.id.line_1;
                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                            if (textView != null) {
                                i = com.qcwireless.qcwatch.R.id.sport_type_image;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_type_image);
                                if (textView2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.total_days;
                                    com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView4 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.total_days);
                                    if (qSportItemView4 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_gps_start_time;
                                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_gps_start_time);
                                        if (textView3 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_title_1;
                                            android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_1);
                                            if (textView4 != null) {
                                                return new com.qcwireless.qcwatch.databinding.RecycleviewItemGpsDetailBinding(constraintLayout, qSportItemView, qSportItemView2, qSportItemView3, findChildViewById, imageView, constraintLayout, textView, textView2, qSportItemView4, textView3, textView4);
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
