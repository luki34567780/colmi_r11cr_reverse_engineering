package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemDialMarketBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageWatchFace;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvPrice;

    private RecycleviewItemDialMarketBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageWatchFace, android.widget.TextView tvPrice) {
        this.rootView = rootView;
        this.imageWatchFace = imageWatchFace;
        this.tvPrice = tvPrice;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemDialMarketBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemDialMarketBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_dial_market, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemDialMarketBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_watch_face;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_watch_face);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_price;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_price);
            if (textView != null) {
                return new com.qcwireless.qcwatch.databinding.RecycleviewItemDialMarketBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
