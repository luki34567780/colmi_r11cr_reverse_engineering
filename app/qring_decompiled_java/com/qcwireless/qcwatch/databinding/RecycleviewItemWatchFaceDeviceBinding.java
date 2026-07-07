package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemWatchFaceDeviceBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageDelete;
    public final android.widget.ImageView imageWatchFace;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemWatchFaceDeviceBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageDelete, android.widget.ImageView imageWatchFace) {
        this.rootView = rootView;
        this.imageDelete = imageDelete;
        this.imageWatchFace = imageWatchFace;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemWatchFaceDeviceBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemWatchFaceDeviceBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_watch_face_device, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemWatchFaceDeviceBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_delete;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_delete);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.image_watch_face;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_watch_face);
            if (imageView2 != null) {
                return new com.qcwireless.qcwatch.databinding.RecycleviewItemWatchFaceDeviceBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
