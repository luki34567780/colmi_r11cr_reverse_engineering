package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityCameraBinding implements androidx.viewbinding.ViewBinding {
    public final android.view.View bottomLayout;
    public final io.fotoapparat.view.CameraView cameraView;
    public final io.fotoapparat.view.FocusView focusView;
    public final android.widget.ImageView imagePre;
    public final android.widget.ImageView imageSwitch;
    public final android.widget.ImageView imageTakePicture;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private ActivityCameraBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.view.View bottomLayout, io.fotoapparat.view.CameraView cameraView, io.fotoapparat.view.FocusView focusView, android.widget.ImageView imagePre, android.widget.ImageView imageSwitch, android.widget.ImageView imageTakePicture) {
        this.rootView = rootView;
        this.bottomLayout = bottomLayout;
        this.cameraView = cameraView;
        this.focusView = focusView;
        this.imagePre = imagePre;
        this.imageSwitch = imageSwitch;
        this.imageTakePicture = imageTakePicture;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityCameraBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityCameraBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_camera, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityCameraBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.bottom_layout;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.bottom_layout);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.camera_view;
            io.fotoapparat.view.CameraView findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.camera_view);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.focusView;
                io.fotoapparat.view.FocusView findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.focusView);
                if (findChildViewById3 != null) {
                    i = com.qcwireless.qcwatch.R.id.image_pre;
                    android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_pre);
                    if (imageView != null) {
                        i = com.qcwireless.qcwatch.R.id.image_switch;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_switch);
                        if (imageView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.image_take_picture;
                            android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_take_picture);
                            if (imageView3 != null) {
                                return new com.qcwireless.qcwatch.databinding.ActivityCameraBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, imageView, imageView2, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
