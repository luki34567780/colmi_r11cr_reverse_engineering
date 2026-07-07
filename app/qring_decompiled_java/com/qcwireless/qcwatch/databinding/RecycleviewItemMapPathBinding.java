package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemMapPathBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvDistance;
    public final android.widget.TextView tvTime;
    public final android.widget.TextView tvTitle;

    private RecycleviewItemMapPathBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView tvDistance, android.widget.TextView tvTime, android.widget.TextView tvTitle) {
        this.rootView = rootView;
        this.tvDistance = tvDistance;
        this.tvTime = tvTime;
        this.tvTitle = tvTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMapPathBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMapPathBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_map_path, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMapPathBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.tv_distance;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_distance);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_time;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_time);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.tv_title;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title);
                if (textView3 != null) {
                    return new com.qcwireless.qcwatch.databinding.RecycleviewItemMapPathBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
