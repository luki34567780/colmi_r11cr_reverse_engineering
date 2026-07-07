package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityMusicSelectBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView deleteText;
    public final android.widget.EditText edtSearch;
    public final android.widget.LinearLayout musicLayout;
    public final androidx.recyclerview.widget.RecyclerView recyclerView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView selectConfirm;
    public final com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout sidebar;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityMusicSelectBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView deleteText, android.widget.EditText edtSearch, android.widget.LinearLayout musicLayout, androidx.recyclerview.widget.RecyclerView recyclerView, android.widget.TextView selectConfirm, com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout sidebar, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.deleteText = deleteText;
        this.edtSearch = edtSearch;
        this.musicLayout = musicLayout;
        this.recyclerView = recyclerView;
        this.selectConfirm = selectConfirm;
        this.sidebar = sidebar;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_music_select, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.delete_text;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.delete_text);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.edt_search;
            android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.edt_search);
            if (editText != null) {
                i = com.qcwireless.qcwatch.R.id.music_layout;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.music_layout);
                if (linearLayout != null) {
                    i = com.qcwireless.qcwatch.R.id.recyclerView;
                    androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.recyclerView);
                    if (findChildViewById != null) {
                        i = com.qcwireless.qcwatch.R.id.select_confirm;
                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.select_confirm);
                        if (textView != null) {
                            i = com.qcwireless.qcwatch.R.id.sidebar;
                            com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout sideBarLayout = (com.qcwireless.qcwatch.ui.device.contact.widget.SideBarLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.sidebar);
                            if (sideBarLayout != null) {
                                i = com.qcwireless.qcwatch.R.id.titleBar;
                                android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                if (findChildViewById2 != null) {
                                    return new com.qcwireless.qcwatch.databinding.ActivityMusicSelectBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, editText, linearLayout, findChildViewById, textView, sideBarLayout, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2));
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
