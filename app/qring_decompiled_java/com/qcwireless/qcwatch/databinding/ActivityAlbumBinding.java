package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityAlbumBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnSelectPic;
    public final android.widget.ImageView imageNoData;
    public final androidx.recyclerview.widget.RecyclerView rcvImage;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityAlbumBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnSelectPic, android.widget.ImageView imageNoData, androidx.recyclerview.widget.RecyclerView rcvImage, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.btnSelectPic = btnSelectPic;
        this.imageNoData = imageNoData;
        this.rcvImage = rcvImage;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAlbumBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAlbumBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_album, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityAlbumBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_select_pic;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_select_pic);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.image_no_data;
            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_no_data);
            if (imageView != null) {
                i = com.qcwireless.qcwatch.R.id.rcv_image;
                androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_image);
                if (findChildViewById != null) {
                    i = com.qcwireless.qcwatch.R.id.titleBar;
                    android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                    if (findChildViewById2 != null) {
                        return new com.qcwireless.qcwatch.databinding.ActivityAlbumBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, imageView, findChildViewById, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2));
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
