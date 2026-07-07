package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemManagerEbookBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView bookImage;
    public final android.widget.ImageView imageSelect;
    public final android.widget.TextView rcvBookName;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemManagerEbookBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView bookImage, android.widget.ImageView imageSelect, android.widget.TextView rcvBookName) {
        this.rootView = rootView;
        this.bookImage = bookImage;
        this.imageSelect = imageSelect;
        this.rcvBookName = rcvBookName;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemManagerEbookBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemManagerEbookBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_manager_ebook, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemManagerEbookBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.book_image;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.book_image);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.image_select;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_select);
            if (imageView2 != null) {
                i = com.qcwireless.qcwatch.R.id.rcv_book_name;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_book_name);
                if (textView != null) {
                    return new com.qcwireless.qcwatch.databinding.RecycleviewItemManagerEbookBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
