package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityDialDetailBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.ProgressButton btnDialDelete;
    public final com.qcwireless.qcwatch.ui.base.view.ProgressButton btnDialSave;
    public final android.widget.ImageView imageWatchFace;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvDownload;
    public final android.widget.TextView tvPrice;
    public final android.widget.TextView tvWarming;

    private ActivityDialDetailBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.ProgressButton btnDialDelete, com.qcwireless.qcwatch.ui.base.view.ProgressButton btnDialSave, android.widget.ImageView imageWatchFace, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvDownload, android.widget.TextView tvPrice, android.widget.TextView tvWarming) {
        this.rootView = rootView;
        this.btnDialDelete = btnDialDelete;
        this.btnDialSave = btnDialSave;
        this.imageWatchFace = imageWatchFace;
        this.titleBar = titleBar;
        this.tvDownload = tvDownload;
        this.tvPrice = tvPrice;
        this.tvWarming = tvWarming;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDialDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDialDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_dial_detail, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDialDetailBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_dial_delete;
        com.qcwireless.qcwatch.ui.base.view.ProgressButton progressButton = (com.qcwireless.qcwatch.ui.base.view.ProgressButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_dial_delete);
        if (progressButton != null) {
            i = com.qcwireless.qcwatch.R.id.btn_dial_save;
            com.qcwireless.qcwatch.ui.base.view.ProgressButton progressButton2 = (com.qcwireless.qcwatch.ui.base.view.ProgressButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_dial_save);
            if (progressButton2 != null) {
                i = com.qcwireless.qcwatch.R.id.image_watch_face;
                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_watch_face);
                if (imageView != null) {
                    i = 2131297388;
                    android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                    if (findChildViewById != null) {
                        com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                        i = com.qcwireless.qcwatch.R.id.tv_download;
                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_download);
                        if (textView != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_price;
                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_price);
                            if (textView2 != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_warming;
                                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_warming);
                                if (textView3 != null) {
                                    return new com.qcwireless.qcwatch.databinding.ActivityDialDetailBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, progressButton, progressButton2, imageView, bind, textView, textView2, textView3);
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
