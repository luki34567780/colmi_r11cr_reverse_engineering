package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutContactFooterBinding implements androidx.viewbinding.ViewBinding {
    private final android.widget.LinearLayout rootView;
    public final android.widget.TextView tvTotalContacts;

    private LayoutContactFooterBinding(android.widget.LinearLayout rootView, android.widget.TextView tvTotalContacts) {
        this.rootView = rootView;
        this.tvTotalContacts = tvTotalContacts;
    }

    public android.widget.LinearLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutContactFooterBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutContactFooterBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_contact_footer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutContactFooterBinding bind(android.view.View rootView) {
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_total_contacts);
        if (textView != null) {
            return new com.qcwireless.qcwatch.databinding.LayoutContactFooterBinding((android.widget.LinearLayout) rootView, textView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.tv_total_contacts)));
    }
}
