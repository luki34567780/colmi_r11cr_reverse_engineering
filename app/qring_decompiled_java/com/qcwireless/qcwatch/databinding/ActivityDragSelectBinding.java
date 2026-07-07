package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityDragSelectBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView dragRcv;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvBottom;

    private ActivityDragSelectBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.recyclerview.widget.RecyclerView dragRcv, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvBottom) {
        this.rootView = rootView;
        this.dragRcv = dragRcv;
        this.titleBar = titleBar;
        this.tvBottom = tvBottom;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_drag_select, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.drag_rcv;
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.drag_rcv);
        if (findChildViewById != null) {
            i = 2131297388;
            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
            if (findChildViewById2 != null) {
                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2);
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_bottom);
                if (textView != null) {
                    return new com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, bind, textView);
                }
                i = com.qcwireless.qcwatch.R.id.tv_bottom;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
