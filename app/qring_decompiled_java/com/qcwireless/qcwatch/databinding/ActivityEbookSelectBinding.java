package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityEbookSelectBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout cs4;
    public final android.widget.ImageView deleteText;
    public final android.widget.EditText edtSearch;
    public final android.widget.LinearLayout musicLayout;
    public final androidx.recyclerview.widget.RecyclerView recyclerView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout sidebar;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvAddMyBook;
    public final android.widget.TextView tvBookDelete;

    private ActivityEbookSelectBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.ConstraintLayout cs4, android.widget.ImageView deleteText, android.widget.EditText edtSearch, android.widget.LinearLayout musicLayout, androidx.recyclerview.widget.RecyclerView recyclerView, com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout sidebar, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvAddMyBook, android.widget.TextView tvBookDelete) {
        this.rootView = rootView;
        this.cs4 = cs4;
        this.deleteText = deleteText;
        this.edtSearch = edtSearch;
        this.musicLayout = musicLayout;
        this.recyclerView = recyclerView;
        this.sidebar = sidebar;
        this.titleBar = titleBar;
        this.tvAddMyBook = tvAddMyBook;
        this.tvBookDelete = tvBookDelete;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_ebook_select, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.cs_4;
        androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cs_4);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.delete_text;
            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.delete_text);
            if (imageView != null) {
                i = com.qcwireless.qcwatch.R.id.edt_search;
                android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.edt_search);
                if (editText != null) {
                    i = com.qcwireless.qcwatch.R.id.music_layout;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.music_layout);
                    if (linearLayout != null) {
                        i = com.qcwireless.qcwatch.R.id.recyclerView;
                        androidx.recyclerview.widget.RecyclerView findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.recyclerView);
                        if (findChildViewById2 != null) {
                            i = com.qcwireless.qcwatch.R.id.sidebar;
                            com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout sideBarLayout = (com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sidebar);
                            if (sideBarLayout != null) {
                                i = com.qcwireless.qcwatch.R.id.titleBar;
                                android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                if (findChildViewById3 != null) {
                                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById3);
                                    i = com.qcwireless.qcwatch.R.id.tv_add_my_book;
                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_add_my_book);
                                    if (textView != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_book_delete;
                                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_book_delete);
                                        if (textView2 != null) {
                                            return new com.qcwireless.qcwatch.databinding.ActivityEbookSelectBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, imageView, editText, linearLayout, findChildViewById2, sideBarLayout, bind, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
