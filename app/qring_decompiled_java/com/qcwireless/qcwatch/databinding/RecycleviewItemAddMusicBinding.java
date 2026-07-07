package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemAddMusicBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageSelect;
    public final android.view.View itemLine;
    public final android.widget.TextView keyWord;
    public final android.widget.TextView rcvDeviceAddress;
    public final android.widget.TextView rcvDeviceName;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemAddMusicBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageSelect, android.view.View itemLine, android.widget.TextView keyWord, android.widget.TextView rcvDeviceAddress, android.widget.TextView rcvDeviceName) {
        this.rootView = rootView;
        this.imageSelect = imageSelect;
        this.itemLine = itemLine;
        this.keyWord = keyWord;
        this.rcvDeviceAddress = rcvDeviceAddress;
        this.rcvDeviceName = rcvDeviceName;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemAddMusicBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemAddMusicBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_add_music, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemAddMusicBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_select;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_select);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.item_line;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.item_line);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.key_word;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.key_word);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.rcv_device_address;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_device_address);
                    if (textView2 != null) {
                        i = com.qcwireless.qcwatch.R.id.rcv_device_name;
                        android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_device_name);
                        if (textView3 != null) {
                            return new com.qcwireless.qcwatch.databinding.RecycleviewItemAddMusicBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, findChildViewById, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
