package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ContactItemRcvBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnDelete;
    public final android.widget.ImageView itemListMenuImageView;
    public final android.widget.TextView itemListTextTextView;
    public final android.view.View line1;
    private final com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout rootView;

    private ContactItemRcvBinding(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout rootView, android.widget.Button btnDelete, android.widget.ImageView itemListMenuImageView, android.widget.TextView itemListTextTextView, android.view.View line1) {
        this.rootView = rootView;
        this.btnDelete = btnDelete;
        this.itemListMenuImageView = itemListMenuImageView;
        this.itemListTextTextView = itemListTextTextView;
        this.line1 = line1;
    }

    public com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ContactItemRcvBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ContactItemRcvBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.contact_item_rcv, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ContactItemRcvBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_delete;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_delete);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.item_list_menu_imageView;
            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.item_list_menu_imageView);
            if (imageView != null) {
                i = com.qcwireless.qcwatch.R.id.item_list_text_textView;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.item_list_text_textView);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.line_1;
                    android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                    if (findChildViewById != null) {
                        return new com.qcwireless.qcwatch.databinding.ContactItemRcvBinding((com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout) rootView, button, imageView, textView, findChildViewById);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
