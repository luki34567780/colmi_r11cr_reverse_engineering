package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityPlayFileBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageStart;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvFileName;
    public final android.widget.TextView tvFileSync;
    public final android.widget.TextView tvFileTime;

    private ActivityPlayFileBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageStart, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvFileName, android.widget.TextView tvFileSync, android.widget.TextView tvFileTime) {
        this.rootView = rootView;
        this.imageStart = imageStart;
        this.titleBar = titleBar;
        this.tvFileName = tvFileName;
        this.tvFileSync = tvFileSync;
        this.tvFileTime = tvFileTime;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_play_file, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_start;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_start);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.titleBar;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
            if (findChildViewById != null) {
                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                i = com.qcwireless.qcwatch.R.id.tv_file_name;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_file_name);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_file_sync;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_file_sync);
                    if (textView2 != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_file_time;
                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_file_time);
                        if (textView3 != null) {
                            return new com.qcwireless.qcwatch.databinding.ActivityPlayFileBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, bind, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
