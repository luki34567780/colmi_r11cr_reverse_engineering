package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityMyMenuMusicBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.recyclerview.widget.RecyclerView rcvMyMusicList;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;

    private ActivityMyMenuMusicBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.recyclerview.widget.RecyclerView rcvMyMusicList, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar) {
        this.rootView = rootView;
        this.rcvMyMusicList = rcvMyMusicList;
        this.titleBar = titleBar;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_my_menu_music, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.rcv_my_music_list;
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_my_music_list);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.titleBar;
            android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
            if (findChildViewById2 != null) {
                return new com.qcwireless.qcwatch.databinding.ActivityMyMenuMusicBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2));
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
