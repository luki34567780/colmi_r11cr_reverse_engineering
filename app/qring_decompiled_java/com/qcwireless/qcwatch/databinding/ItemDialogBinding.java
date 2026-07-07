package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ItemDialogBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView address;
    public final android.widget.TextView name;
    private final android.widget.LinearLayout rootView;
    public final android.widget.LinearLayout tv;

    private ItemDialogBinding(android.widget.LinearLayout rootView, android.widget.TextView address, android.widget.TextView name, android.widget.LinearLayout tv) {
        this.rootView = rootView;
        this.address = address;
        this.name = name;
        this.tv = tv;
    }

    public android.widget.LinearLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ItemDialogBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ItemDialogBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.item_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ItemDialogBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.address;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.address);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.name;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.name);
            if (textView2 != null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) rootView;
                return new com.qcwireless.qcwatch.databinding.ItemDialogBinding(linearLayout, textView, textView2, linearLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
