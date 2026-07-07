package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ViewSidebarLayoutBinding implements androidx.viewbinding.ViewBinding {
    private final android.widget.RelativeLayout rootView;
    public final com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView sortView;
    public final android.widget.TextView tvTips;

    private ViewSidebarLayoutBinding(android.widget.RelativeLayout rootView, com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView sortView, android.widget.TextView tvTips) {
        this.rootView = rootView;
        this.sortView = sortView;
        this.tvTips = tvTips;
    }

    public android.widget.RelativeLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ViewSidebarLayoutBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ViewSidebarLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.view_sidebar_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ViewSidebarLayoutBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.sortView;
        com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView sideBarSortView = (com.qcwireless.qcwatch.ui.device.contact.widget.SideBarSortView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sortView);
        if (sideBarSortView != null) {
            i = com.qcwireless.qcwatch.R.id.tvTips;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tvTips);
            if (textView != null) {
                return new com.qcwireless.qcwatch.databinding.ViewSidebarLayoutBinding((android.widget.RelativeLayout) rootView, sideBarSortView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
