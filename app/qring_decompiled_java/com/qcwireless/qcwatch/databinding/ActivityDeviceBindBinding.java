package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityDeviceBindBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView deviceRcv;
    public final android.widget.ImageView ivWave;
    public final android.widget.ImageView ivWave1;
    public final android.widget.ImageView ivWave2;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.FrameLayout startScan;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvSearchStatus;

    private ActivityDeviceBindBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.recyclerview.widget.RecyclerView deviceRcv, android.widget.ImageView ivWave, android.widget.ImageView ivWave1, android.widget.ImageView ivWave2, android.widget.FrameLayout startScan, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvSearchStatus) {
        this.rootView = rootView;
        this.deviceRcv = deviceRcv;
        this.ivWave = ivWave;
        this.ivWave1 = ivWave1;
        this.ivWave2 = ivWave2;
        this.startScan = startScan;
        this.titleBar = titleBar;
        this.tvSearchStatus = tvSearchStatus;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_device_bind, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.device_rcv;
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.device_rcv);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.iv_wave;
            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_wave);
            if (imageView != null) {
                i = com.qcwireless.qcwatch.R.id.iv_wave_1;
                android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_wave_1);
                if (imageView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.iv_wave_2;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_wave_2);
                    if (imageView3 != null) {
                        i = com.qcwireless.qcwatch.R.id.start_scan;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.start_scan);
                        if (frameLayout != null) {
                            i = com.qcwireless.qcwatch.R.id.titleBar;
                            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                            if (findChildViewById2 != null) {
                                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2);
                                i = com.qcwireless.qcwatch.R.id.tv_search_status;
                                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_search_status);
                                if (textView != null) {
                                    return new com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, imageView, imageView2, imageView3, frameLayout, bind, textView);
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
