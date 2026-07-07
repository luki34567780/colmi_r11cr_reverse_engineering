package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemSportDetailBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Group groupSpeed;
    public final android.widget.ImageView imageClick;
    public final android.widget.ImageView imageDuration;
    public final android.widget.ImageView imageSpeed;
    public final androidx.constraintlayout.widget.ConstraintLayout itemLayout;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.ImageView sportTypeImage;
    public final android.widget.TextView tvSportDistance;
    public final android.widget.TextView tvSportDuration;
    public final android.widget.TextView tvSportSpeed;

    private RecycleviewItemSportDetailBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.Group groupSpeed, android.widget.ImageView imageClick, android.widget.ImageView imageDuration, android.widget.ImageView imageSpeed, androidx.constraintlayout.widget.ConstraintLayout itemLayout, android.widget.ImageView sportTypeImage, android.widget.TextView tvSportDistance, android.widget.TextView tvSportDuration, android.widget.TextView tvSportSpeed) {
        this.rootView = rootView;
        this.groupSpeed = groupSpeed;
        this.imageClick = imageClick;
        this.imageDuration = imageDuration;
        this.imageSpeed = imageSpeed;
        this.itemLayout = itemLayout;
        this.sportTypeImage = sportTypeImage;
        this.tvSportDistance = tvSportDistance;
        this.tvSportDuration = tvSportDuration;
        this.tvSportSpeed = tvSportSpeed;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSportDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSportDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_sport_detail, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSportDetailBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.group_speed;
        androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.group_speed);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.image_click;
            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_click);
            if (imageView != null) {
                i = com.qcwireless.qcwatch.R.id.image_duration;
                android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_duration);
                if (imageView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.image_speed;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_speed);
                    if (imageView3 != null) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) rootView;
                        i = com.qcwireless.qcwatch.R.id.sport_type_image;
                        android.widget.ImageView imageView4 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sport_type_image);
                        if (imageView4 != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_sport_distance;
                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_distance);
                            if (textView != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_sport_duration;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_duration);
                                if (textView2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_sport_speed;
                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_sport_speed);
                                    if (textView3 != null) {
                                        return new com.qcwireless.qcwatch.databinding.RecycleviewItemSportDetailBinding(constraintLayout, findChildViewById, imageView, imageView2, imageView3, constraintLayout, imageView4, textView, textView2, textView3);
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
