package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityRecordListBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView btnAddMusic;
    public final androidx.constraintlayout.widget.ConstraintLayout cs2;
    public final android.widget.ImageView imageNoData;
    public final androidx.constraintlayout.widget.ConstraintLayout noMusic;
    public final androidx.recyclerview.widget.RecyclerView rcvDeviceRecordList;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvTitle2;

    private ActivityRecordListBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView btnAddMusic, androidx.constraintlayout.widget.ConstraintLayout cs2, android.widget.ImageView imageNoData, androidx.constraintlayout.widget.ConstraintLayout noMusic, androidx.recyclerview.widget.RecyclerView rcvDeviceRecordList, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvTitle2) {
        this.rootView = rootView;
        this.btnAddMusic = btnAddMusic;
        this.cs2 = cs2;
        this.imageNoData = imageNoData;
        this.noMusic = noMusic;
        this.rcvDeviceRecordList = rcvDeviceRecordList;
        this.titleBar = titleBar;
        this.tvTitle2 = tvTitle2;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityRecordListBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityRecordListBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_record_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityRecordListBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_add_music;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_add_music);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.cs_2;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cs_2);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.image_no_data;
                android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_no_data);
                if (imageView != null) {
                    i = com.qcwireless.qcwatch.R.id.no_music;
                    androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.no_music);
                    if (findChildViewById2 != null) {
                        i = com.qcwireless.qcwatch.R.id.rcv_device_record_list;
                        androidx.recyclerview.widget.RecyclerView findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_device_record_list);
                        if (findChildViewById3 != null) {
                            i = com.qcwireless.qcwatch.R.id.titleBar;
                            android.view.View findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                            if (findChildViewById4 != null) {
                                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById4);
                                i = com.qcwireless.qcwatch.R.id.tv_title_2;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_2);
                                if (textView2 != null) {
                                    return new com.qcwireless.qcwatch.databinding.ActivityRecordListBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, findChildViewById, imageView, findChildViewById2, findChildViewById3, bind, textView2);
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
