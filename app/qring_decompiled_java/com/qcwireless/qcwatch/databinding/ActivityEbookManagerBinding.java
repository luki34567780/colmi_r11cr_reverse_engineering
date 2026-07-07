package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityEbookManagerBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView btnAddMusic;
    public final android.widget.TextView btnEbook;
    public final androidx.constraintlayout.widget.ConstraintLayout cs2;
    public final androidx.constraintlayout.widget.ConstraintLayout cs3;
    public final androidx.constraintlayout.widget.ConstraintLayout cs4;
    public final androidx.constraintlayout.widget.ConstraintLayout ctlProgress;
    public final androidx.constraintlayout.widget.ConstraintLayout noEbook;
    public final androidx.recyclerview.widget.RecyclerView rcvDeviceEbookList;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvEbookDelete;
    public final android.widget.TextView tvText1;
    public final android.widget.TextView tvTextIndex;
    public final android.widget.TextView tvTextProgress;
    public final android.widget.TextView tvTitle2;

    private ActivityEbookManagerBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView btnAddMusic, android.widget.TextView btnEbook, androidx.constraintlayout.widget.ConstraintLayout cs2, androidx.constraintlayout.widget.ConstraintLayout cs3, androidx.constraintlayout.widget.ConstraintLayout cs4, androidx.constraintlayout.widget.ConstraintLayout ctlProgress, androidx.constraintlayout.widget.ConstraintLayout noEbook, androidx.recyclerview.widget.RecyclerView rcvDeviceEbookList, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvEbookDelete, android.widget.TextView tvText1, android.widget.TextView tvTextIndex, android.widget.TextView tvTextProgress, android.widget.TextView tvTitle2) {
        this.rootView = rootView;
        this.btnAddMusic = btnAddMusic;
        this.btnEbook = btnEbook;
        this.cs2 = cs2;
        this.cs3 = cs3;
        this.cs4 = cs4;
        this.ctlProgress = ctlProgress;
        this.noEbook = noEbook;
        this.rcvDeviceEbookList = rcvDeviceEbookList;
        this.titleBar = titleBar;
        this.tvEbookDelete = tvEbookDelete;
        this.tvText1 = tvText1;
        this.tvTextIndex = tvTextIndex;
        this.tvTextProgress = tvTextProgress;
        this.tvTitle2 = tvTitle2;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_ebook_manager, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_add_music;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_add_music);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.btn_ebook;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_ebook);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.cs_2;
                androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cs_2);
                if (findChildViewById != null) {
                    i = com.qcwireless.qcwatch.R.id.cs_3;
                    androidx.constraintlayout.widget.ConstraintLayout findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cs_3);
                    if (findChildViewById2 != null) {
                        i = com.qcwireless.qcwatch.R.id.cs_4;
                        androidx.constraintlayout.widget.ConstraintLayout findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cs_4);
                        if (findChildViewById3 != null) {
                            i = com.qcwireless.qcwatch.R.id.ctl_progress;
                            androidx.constraintlayout.widget.ConstraintLayout findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ctl_progress);
                            if (findChildViewById4 != null) {
                                i = com.qcwireless.qcwatch.R.id.no_ebook;
                                androidx.constraintlayout.widget.ConstraintLayout findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.no_ebook);
                                if (findChildViewById5 != null) {
                                    i = com.qcwireless.qcwatch.R.id.rcv_device_ebook_list;
                                    androidx.recyclerview.widget.RecyclerView findChildViewById6 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_device_ebook_list);
                                    if (findChildViewById6 != null) {
                                        i = com.qcwireless.qcwatch.R.id.titleBar;
                                        android.view.View findChildViewById7 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                        if (findChildViewById7 != null) {
                                            com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById7);
                                            i = com.qcwireless.qcwatch.R.id.tv_ebook_delete;
                                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_ebook_delete);
                                            if (textView3 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_text_1;
                                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_1);
                                                if (textView4 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.tv_text_index;
                                                    android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_index);
                                                    if (textView5 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.tv_text_progress;
                                                        android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_text_progress);
                                                        if (textView6 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.tv_title_2;
                                                            android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title_2);
                                                            if (textView7 != null) {
                                                                return new com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, bind, textView3, textView4, textView5, textView6, textView7);
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
