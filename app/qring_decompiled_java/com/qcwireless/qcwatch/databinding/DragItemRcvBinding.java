package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class DragItemRcvBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView itemListMenuImageView;
    public final skin.support.widget.SkinCompatCheckBox itemListSwitchCompat;
    public final android.widget.TextView itemListTextTextView;
    public final android.view.View line1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private DragItemRcvBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView itemListMenuImageView, skin.support.widget.SkinCompatCheckBox itemListSwitchCompat, android.widget.TextView itemListTextTextView, android.view.View line1) {
        this.rootView = rootView;
        this.itemListMenuImageView = itemListMenuImageView;
        this.itemListSwitchCompat = itemListSwitchCompat;
        this.itemListTextTextView = itemListTextTextView;
        this.line1 = line1;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.DragItemRcvBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.DragItemRcvBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.drag_item_rcv, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.DragItemRcvBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.item_list_menu_imageView;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.item_list_menu_imageView);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.item_list_switchCompat;
            skin.support.widget.SkinCompatCheckBox findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.item_list_switchCompat);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.item_list_text_textView;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.item_list_text_textView);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.line_1;
                    android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                    if (findChildViewById2 != null) {
                        return new com.qcwireless.qcwatch.databinding.DragItemRcvBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, findChildViewById, textView, findChildViewById2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
