package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemMusicMenuBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageMusicMenu;
    public final android.widget.ImageView imageRight;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvMenuName;
    public final android.widget.TextView tvSongCount;

    private RecycleviewItemMusicMenuBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageMusicMenu, android.widget.ImageView imageRight, android.widget.TextView tvMenuName, android.widget.TextView tvSongCount) {
        this.rootView = rootView;
        this.imageMusicMenu = imageMusicMenu;
        this.imageRight = imageRight;
        this.tvMenuName = tvMenuName;
        this.tvSongCount = tvSongCount;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMusicMenuBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMusicMenuBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_music_menu, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMusicMenuBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_music_menu;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_music_menu);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.image_right;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_right);
            if (imageView2 != null) {
                i = com.qcwireless.qcwatch.R.id.tv_menu_name;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_menu_name);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_song_count;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_song_count);
                    if (textView2 != null) {
                        return new com.qcwireless.qcwatch.databinding.RecycleviewItemMusicMenuBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
