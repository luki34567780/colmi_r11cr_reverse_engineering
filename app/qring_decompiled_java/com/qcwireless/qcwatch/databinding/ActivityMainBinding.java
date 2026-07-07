package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityMainBinding implements androidx.viewbinding.ViewBinding {
    public final android.view.View btnDevice;
    public final android.view.View btnHealth;
    public final android.view.View btnMine;
    public final android.view.View btnPlate;
    public final android.widget.FrameLayout homeContainer;
    public final android.widget.ImageView ivDevice;
    public final android.widget.ImageView ivHealth;
    public final android.widget.ImageView ivMine;
    public final android.widget.ImageView ivPlate;
    private final android.widget.LinearLayout rootView;
    public final android.widget.TextView tvDevice;
    public final android.widget.TextView tvHealth;
    public final android.widget.TextView tvMine;
    public final android.widget.TextView tvPlate;

    private ActivityMainBinding(android.widget.LinearLayout rootView, android.view.View btnDevice, android.view.View btnHealth, android.view.View btnMine, android.view.View btnPlate, android.widget.FrameLayout homeContainer, android.widget.ImageView ivDevice, android.widget.ImageView ivHealth, android.widget.ImageView ivMine, android.widget.ImageView ivPlate, android.widget.TextView tvDevice, android.widget.TextView tvHealth, android.widget.TextView tvMine, android.widget.TextView tvPlate) {
        this.rootView = rootView;
        this.btnDevice = btnDevice;
        this.btnHealth = btnHealth;
        this.btnMine = btnMine;
        this.btnPlate = btnPlate;
        this.homeContainer = homeContainer;
        this.ivDevice = ivDevice;
        this.ivHealth = ivHealth;
        this.ivMine = ivMine;
        this.ivPlate = ivPlate;
        this.tvDevice = tvDevice;
        this.tvHealth = tvHealth;
        this.tvMine = tvMine;
        this.tvPlate = tvPlate;
    }

    public android.widget.LinearLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMainBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_device;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_device);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.btn_health;
            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_health);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.btn_mine;
                android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_mine);
                if (findChildViewById3 != null) {
                    i = com.qcwireless.qcwatch.R.id.btn_plate;
                    android.view.View findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_plate);
                    if (findChildViewById4 != null) {
                        i = com.qcwireless.qcwatch.R.id.homeContainer;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.homeContainer);
                        if (frameLayout != null) {
                            i = com.qcwireless.qcwatch.R.id.iv_device;
                            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_device);
                            if (imageView != null) {
                                i = com.qcwireless.qcwatch.R.id.iv_health;
                                android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_health);
                                if (imageView2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.iv_mine;
                                    android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_mine);
                                    if (imageView3 != null) {
                                        i = com.qcwireless.qcwatch.R.id.iv_plate;
                                        android.widget.ImageView imageView4 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.iv_plate);
                                        if (imageView4 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_device;
                                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_device);
                                            if (textView != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_health;
                                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_health);
                                                if (textView2 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_mine;
                                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_mine);
                                                    if (textView3 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_plate;
                                                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_plate);
                                                        if (textView4 != null) {
                                                            return new com.qcwireless.qcwatch.databinding.ActivityMainBinding((android.widget.LinearLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, frameLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4);
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
