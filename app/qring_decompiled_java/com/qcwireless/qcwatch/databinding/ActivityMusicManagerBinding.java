package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityMusicManagerBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView btnAddMusic;
    public final androidx.constraintlayout.widget.ConstraintLayout cs1;
    public final androidx.constraintlayout.widget.ConstraintLayout cs2;
    public final androidx.constraintlayout.widget.ConstraintLayout cs3;
    public final androidx.constraintlayout.widget.ConstraintLayout cs4;
    public final androidx.constraintlayout.widget.ConstraintLayout ctlProgress;
    public final androidx.constraintlayout.widget.ConstraintLayout noMusic;
    public final androidx.recyclerview.widget.RecyclerView rcvDeviceMusicList;
    public final androidx.recyclerview.widget.RecyclerView rcvMyMusicList;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvAddMusic;
    public final android.widget.TextView tvAddMyMusic;
    public final android.widget.TextView tvMusicAll;
    public final android.widget.TextView tvMusicDelete;
    public final android.widget.TextView tvMusicLyrics;
    public final android.widget.TextView tvText1;
    public final android.widget.TextView tvTextIndex;
    public final android.widget.TextView tvTextProgress;
    public final android.widget.TextView tvTitle1;
    public final android.widget.TextView tvTitle2;

    private ActivityMusicManagerBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView btnAddMusic, androidx.constraintlayout.widget.ConstraintLayout cs1, androidx.constraintlayout.widget.ConstraintLayout cs2, androidx.constraintlayout.widget.ConstraintLayout cs3, androidx.constraintlayout.widget.ConstraintLayout cs4, androidx.constraintlayout.widget.ConstraintLayout ctlProgress, androidx.constraintlayout.widget.ConstraintLayout noMusic, androidx.recyclerview.widget.RecyclerView rcvDeviceMusicList, androidx.recyclerview.widget.RecyclerView rcvMyMusicList, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvAddMusic, android.widget.TextView tvAddMyMusic, android.widget.TextView tvMusicAll, android.widget.TextView tvMusicDelete, android.widget.TextView tvMusicLyrics, android.widget.TextView tvText1, android.widget.TextView tvTextIndex, android.widget.TextView tvTextProgress, android.widget.TextView tvTitle1, android.widget.TextView tvTitle2) {
        this.rootView = rootView;
        this.btnAddMusic = btnAddMusic;
        this.cs1 = cs1;
        this.cs2 = cs2;
        this.cs3 = cs3;
        this.cs4 = cs4;
        this.ctlProgress = ctlProgress;
        this.noMusic = noMusic;
        this.rcvDeviceMusicList = rcvDeviceMusicList;
        this.rcvMyMusicList = rcvMyMusicList;
        this.titleBar = titleBar;
        this.tvAddMusic = tvAddMusic;
        this.tvAddMyMusic = tvAddMyMusic;
        this.tvMusicAll = tvMusicAll;
        this.tvMusicDelete = tvMusicDelete;
        this.tvMusicLyrics = tvMusicLyrics;
        this.tvText1 = tvText1;
        this.tvTextIndex = tvTextIndex;
        this.tvTextProgress = tvTextProgress;
        this.tvTitle1 = tvTitle1;
        this.tvTitle2 = tvTitle2;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_music_manager, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_add_music;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_add_music);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.cs_1;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cs_1);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.cs_2;
                androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cs_2);
                if (findChildViewById2 != null) {
                    i = com.qcwireless.qcwatch.R.id.cs_3;
                    androidx.constraintlayout.widget.ConstraintLayout findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cs_3);
                    if (findChildViewById3 != null) {
                        i = com.qcwireless.qcwatch.R.id.cs_4;
                        androidx.constraintlayout.widget.ConstraintLayout findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cs_4);
                        if (findChildViewById4 != null) {
                            i = com.qcwireless.qcwatch.R.id.ctl_progress;
                            androidx.constraintlayout.widget.ConstraintLayout findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ctl_progress);
                            if (findChildViewById5 != null) {
                                i = com.qcwireless.qcwatch.R.id.no_music;
                                androidx.constraintlayout.widget.ConstraintLayout findChildViewById6 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.no_music);
                                if (findChildViewById6 != null) {
                                    i = com.qcwireless.qcwatch.R.id.rcv_device_music_list;
                                    androidx.recyclerview.widget.RecyclerView findChildViewById7 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_device_music_list);
                                    if (findChildViewById7 != null) {
                                        i = com.qcwireless.qcwatch.R.id.rcv_my_music_list;
                                        androidx.recyclerview.widget.RecyclerView findChildViewById8 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_my_music_list);
                                        if (findChildViewById8 != null) {
                                            i = com.qcwireless.qcwatch.R.id.titleBar;
                                            android.view.View findChildViewById9 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                            if (findChildViewById9 != null) {
                                                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById9);
                                                i = com.qcwireless.qcwatch.R.id.tv_add_music;
                                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_add_music);
                                                if (textView2 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_add_my_music;
                                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_add_my_music);
                                                    if (textView3 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_music_all;
                                                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_music_all);
                                                        if (textView4 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_music_delete;
                                                            android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_music_delete);
                                                            if (textView5 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.tv_music_lyrics;
                                                                android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_music_lyrics);
                                                                if (textView6 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.tv_text_1;
                                                                    android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_1);
                                                                    if (textView7 != null) {
                                                                        i = com.qcwireless.qcwatch.R.id.tv_text_index;
                                                                        android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_index);
                                                                        if (textView8 != null) {
                                                                            i = com.qcwireless.qcwatch.R.id.tv_text_progress;
                                                                            android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_progress);
                                                                            if (textView9 != null) {
                                                                                i = com.qcwireless.qcwatch.R.id.tv_title_1;
                                                                                android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_1);
                                                                                if (textView10 != null) {
                                                                                    i = com.qcwireless.qcwatch.R.id.tv_title_2;
                                                                                    android.widget.TextView textView11 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_2);
                                                                                    if (textView11 != null) {
                                                                                        return new com.qcwireless.qcwatch.databinding.ActivityMusicManagerBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, findChildViewById7, findChildViewById8, bind, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
