package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityContactBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnAddContact;
    public final com.qcwireless.qcwatch.ui.base.view.ProgressButton btnToDevice;
    public final androidx.constraintlayout.widget.ConstraintLayout cslToDevice;
    public final androidx.constraintlayout.widget.Group group1;
    public final android.widget.ImageView imageContact1;
    public final com.qcwireless.qcwatch.ui.base.view.MyRecycleView rcvContact;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvDesc;
    public final android.widget.TextView tvTitle;
    public final android.widget.TextView tvTotalContacts;

    private ActivityContactBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnAddContact, com.qcwireless.qcwatch.ui.base.view.ProgressButton btnToDevice, androidx.constraintlayout.widget.ConstraintLayout cslToDevice, androidx.constraintlayout.widget.Group group1, android.widget.ImageView imageContact1, com.qcwireless.qcwatch.ui.base.view.MyRecycleView rcvContact, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvDesc, android.widget.TextView tvTitle, android.widget.TextView tvTotalContacts) {
        this.rootView = rootView;
        this.btnAddContact = btnAddContact;
        this.btnToDevice = btnToDevice;
        this.cslToDevice = cslToDevice;
        this.group1 = group1;
        this.imageContact1 = imageContact1;
        this.rcvContact = rcvContact;
        this.titleBar = titleBar;
        this.tvDesc = tvDesc;
        this.tvTitle = tvTitle;
        this.tvTotalContacts = tvTotalContacts;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityContactBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityContactBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_contact, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityContactBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_add_contact;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_add_contact);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.btn_to_device;
            com.qcwireless.qcwatch.ui.base.view.ProgressButton progressButton = (com.qcwireless.qcwatch.ui.base.view.ProgressButton) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_to_device);
            if (progressButton != null) {
                i = com.qcwireless.qcwatch.R.id.csl_to_device;
                androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.csl_to_device);
                if (findChildViewById != null) {
                    i = com.qcwireless.qcwatch.R.id.group_1;
                    androidx.constraintlayout.widget.Group findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.group_1);
                    if (findChildViewById2 != null) {
                        i = com.qcwireless.qcwatch.R.id.image_contact_1;
                        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_contact_1);
                        if (imageView != null) {
                            i = com.qcwireless.qcwatch.R.id.rcv_contact;
                            com.qcwireless.qcwatch.ui.base.view.MyRecycleView myRecycleView = (com.qcwireless.qcwatch.ui.base.view.MyRecycleView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_contact);
                            if (myRecycleView != null) {
                                i = com.qcwireless.qcwatch.R.id.titleBar;
                                android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.titleBar);
                                if (findChildViewById3 != null) {
                                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById3);
                                    i = com.qcwireless.qcwatch.R.id.tv_desc;
                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_desc);
                                    if (textView != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_title;
                                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title);
                                        if (textView2 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_total_contacts;
                                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_total_contacts);
                                            if (textView3 != null) {
                                                return new com.qcwireless.qcwatch.databinding.ActivityContactBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, progressButton, findChildViewById, findChildViewById2, imageView, myRecycleView, bind, textView, textView2, textView3);
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
