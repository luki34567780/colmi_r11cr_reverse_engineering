package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityAlbumToDeviceBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageTest;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvProgress;
    public final android.widget.TextView tvSelect;

    private ActivityAlbumToDeviceBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageTest, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvProgress, android.widget.TextView tvSelect) {
        this.rootView = rootView;
        this.imageTest = imageTest;
        this.titleBar = titleBar;
        this.tvProgress = tvProgress;
        this.tvSelect = tvSelect;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_album_to_device, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_test;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_test);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.titleBar;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
            if (findChildViewById != null) {
                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                i = com.qcwireless.qcwatch.R.id.tv_progress;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_progress);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_select;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_select);
                    if (textView2 != null) {
                        return new com.qcwireless.qcwatch.databinding.ActivityAlbumToDeviceBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, bind, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
