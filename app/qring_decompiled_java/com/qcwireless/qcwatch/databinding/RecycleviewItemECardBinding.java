package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemECardBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imgSoft;
    public final android.view.View line1;
    public final android.widget.TextView rcvSoftwareName;
    public final android.widget.ImageView rightSwitch;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemECardBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imgSoft, android.view.View line1, android.widget.TextView rcvSoftwareName, android.widget.ImageView rightSwitch) {
        this.rootView = rootView;
        this.imgSoft = imgSoft;
        this.line1 = line1;
        this.rcvSoftwareName = rcvSoftwareName;
        this.rightSwitch = rightSwitch;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemECardBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemECardBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_e_card, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemECardBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.img_soft;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.img_soft);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.line_1;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.rcv_software_name;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_software_name);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.right_switch;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.right_switch);
                    if (imageView2 != null) {
                        return new com.qcwireless.qcwatch.databinding.RecycleviewItemECardBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, findChildViewById, textView, imageView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
