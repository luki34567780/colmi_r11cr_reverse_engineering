package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemAlbumBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageResult;
    public final android.widget.ImageView imageSelect;
    public final android.widget.ProgressBar progressStyle;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvProgressValue;
    public final android.widget.TextView tvStatus;

    private RecycleviewItemAlbumBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageResult, android.widget.ImageView imageSelect, android.widget.ProgressBar progressStyle, android.widget.TextView tvProgressValue, android.widget.TextView tvStatus) {
        this.rootView = rootView;
        this.imageResult = imageResult;
        this.imageSelect = imageSelect;
        this.progressStyle = progressStyle;
        this.tvProgressValue = tvProgressValue;
        this.tvStatus = tvStatus;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemAlbumBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemAlbumBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_album, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemAlbumBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_result;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_result);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.image_select;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_select);
            if (imageView2 != null) {
                i = com.qcwireless.qcwatch.R.id.progress_style;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.progress_style);
                if (progressBar != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_progress_value;
                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_progress_value);
                    if (textView != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_status;
                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_status);
                        if (textView2 != null) {
                            return new com.qcwireless.qcwatch.databinding.RecycleviewItemAlbumBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, progressBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
