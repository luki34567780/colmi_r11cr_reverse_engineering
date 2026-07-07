package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemDialKeyBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout clickCtl;
    public final androidx.recyclerview.widget.RecyclerView rcvItem;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvRightMore;
    public final android.widget.TextView tvTitle;

    private RecycleviewItemDialKeyBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.ConstraintLayout clickCtl, androidx.recyclerview.widget.RecyclerView rcvItem, android.widget.TextView tvRightMore, android.widget.TextView tvTitle) {
        this.rootView = rootView;
        this.clickCtl = clickCtl;
        this.rcvItem = rcvItem;
        this.tvRightMore = tvRightMore;
        this.tvTitle = tvTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemDialKeyBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemDialKeyBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_dial_key, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemDialKeyBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.click_ctl;
        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.click_ctl);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.rcv_item;
            androidx.recyclerview.widget.RecyclerView findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_item);
            if (findChildViewById2 != null) {
                i = com.qcwireless.qcwatch.R.id.tv_right_more;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_right_more);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_title;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title);
                    if (textView2 != null) {
                        return new com.qcwireless.qcwatch.databinding.RecycleviewItemDialKeyBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, findChildViewById2, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
