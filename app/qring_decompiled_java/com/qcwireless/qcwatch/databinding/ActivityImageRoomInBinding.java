package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityImageRoomInBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageRoomIn;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityImageRoomInBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageRoomIn, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.imageRoomIn = imageRoomIn;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityImageRoomInBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityImageRoomInBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_image_room_in, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityImageRoomInBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_room_in;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_room_in);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.titleBar;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
            if (findChildViewById != null) {
                return new com.qcwireless.qcwatch.databinding.ActivityImageRoomInBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById));
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
