package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemManagerMusicBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageSelect;
    public final android.widget.ImageView imageShowPop;
    public final android.view.View itemLine;
    public final android.widget.TextView rcvDeviceAddress;
    public final android.widget.TextView rcvDeviceName;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvLyrics;

    private RecycleviewItemManagerMusicBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageSelect, android.widget.ImageView imageShowPop, android.view.View itemLine, android.widget.TextView rcvDeviceAddress, android.widget.TextView rcvDeviceName, android.widget.TextView tvLyrics) {
        this.rootView = rootView;
        this.imageSelect = imageSelect;
        this.imageShowPop = imageShowPop;
        this.itemLine = itemLine;
        this.rcvDeviceAddress = rcvDeviceAddress;
        this.rcvDeviceName = rcvDeviceName;
        this.tvLyrics = tvLyrics;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemManagerMusicBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemManagerMusicBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_manager_music, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemManagerMusicBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_select;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_select);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.image_show_pop;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_show_pop);
            if (imageView2 != null) {
                i = com.qcwireless.qcwatch.R.id.item_line;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.item_line);
                if (findChildViewById != null) {
                    i = com.qcwireless.qcwatch.R.id.rcv_device_address;
                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_device_address);
                    if (textView != null) {
                        i = com.qcwireless.qcwatch.R.id.rcv_device_name;
                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_device_name);
                        if (textView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_lyrics;
                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_lyrics);
                            if (textView3 != null) {
                                return new com.qcwireless.qcwatch.databinding.RecycleviewItemManagerMusicBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, findChildViewById, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
