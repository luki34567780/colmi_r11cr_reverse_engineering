package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutBottomNavigationBarBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.Group btnDevice;
    public final androidx.constraintlayout.widget.Group btnHealth;
    public final androidx.constraintlayout.widget.Group btnMine;
    public final androidx.constraintlayout.widget.Group btnPlate;
    public final android.widget.ImageView ivDevice;
    public final android.widget.ImageView ivHealth;
    public final android.widget.ImageView ivMine;
    public final android.widget.ImageView ivPlate;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvDevice;
    public final android.widget.TextView tvHealth;
    public final android.widget.TextView tvMine;
    public final android.widget.TextView tvPlate;

    private LayoutBottomNavigationBarBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.Group btnDevice, androidx.constraintlayout.widget.Group btnHealth, androidx.constraintlayout.widget.Group btnMine, androidx.constraintlayout.widget.Group btnPlate, android.widget.ImageView ivDevice, android.widget.ImageView ivHealth, android.widget.ImageView ivMine, android.widget.ImageView ivPlate, android.widget.TextView tvDevice, android.widget.TextView tvHealth, android.widget.TextView tvMine, android.widget.TextView tvPlate) {
        this.rootView = rootView;
        this.btnDevice = btnDevice;
        this.btnHealth = btnHealth;
        this.btnMine = btnMine;
        this.btnPlate = btnPlate;
        this.ivDevice = ivDevice;
        this.ivHealth = ivHealth;
        this.ivMine = ivMine;
        this.ivPlate = ivPlate;
        this.tvDevice = tvDevice;
        this.tvHealth = tvHealth;
        this.tvMine = tvMine;
        this.tvPlate = tvPlate;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutBottomNavigationBarBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutBottomNavigationBarBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_bottom_navigation_bar, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutBottomNavigationBarBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_device;
        androidx.constraintlayout.widget.Group findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_device);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.btn_health;
            androidx.constraintlayout.widget.Group findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_health);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.btn_mine;
                androidx.constraintlayout.widget.Group findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_mine);
                if (findChildViewById3 != null) {
                    i = com.qcwireless.qcwatch.R.id.btn_plate;
                    androidx.constraintlayout.widget.Group findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_plate);
                    if (findChildViewById4 != null) {
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
                                                        return new com.qcwireless.qcwatch.databinding.LayoutBottomNavigationBarBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4);
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
