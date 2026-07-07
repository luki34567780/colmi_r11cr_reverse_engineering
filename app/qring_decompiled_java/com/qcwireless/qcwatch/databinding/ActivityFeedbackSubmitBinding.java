package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityFeedbackSubmitBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView addImage;
    public final android.widget.EditText etContactEmail;
    public final android.view.View line1;
    public final android.view.View line2;
    public final android.view.View line3;
    public final androidx.recyclerview.widget.RecyclerView rcvFeedbackPic;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvContact;
    public final android.widget.TextView tvFeedbackName;
    public final android.widget.TextView tvImageNumber;
    public final android.widget.TextView tvMaxLength;
    public final android.widget.EditText userFeedbackEt;

    private ActivityFeedbackSubmitBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView addImage, android.widget.EditText etContactEmail, android.view.View line1, android.view.View line2, android.view.View line3, androidx.recyclerview.widget.RecyclerView rcvFeedbackPic, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvContact, android.widget.TextView tvFeedbackName, android.widget.TextView tvImageNumber, android.widget.TextView tvMaxLength, android.widget.EditText userFeedbackEt) {
        this.rootView = rootView;
        this.addImage = addImage;
        this.etContactEmail = etContactEmail;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.rcvFeedbackPic = rcvFeedbackPic;
        this.titleBar = titleBar;
        this.tvContact = tvContact;
        this.tvFeedbackName = tvFeedbackName;
        this.tvImageNumber = tvImageNumber;
        this.tvMaxLength = tvMaxLength;
        this.userFeedbackEt = userFeedbackEt;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_feedback_submit, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.add_image;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.add_image);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.et_contact_email;
            android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.et_contact_email);
            if (editText != null) {
                i = com.qcwireless.qcwatch.R.id.line_1;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                if (findChildViewById != null) {
                    i = com.qcwireless.qcwatch.R.id.line_2;
                    android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_2);
                    if (findChildViewById2 != null) {
                        i = com.qcwireless.qcwatch.R.id.line_3;
                        android.view.View findChildViewById3 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_3);
                        if (findChildViewById3 != null) {
                            i = com.qcwireless.qcwatch.R.id.rcv_feedback_pic;
                            androidx.recyclerview.widget.RecyclerView findChildViewById4 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.rcv_feedback_pic);
                            if (findChildViewById4 != null) {
                                i = 2131297388;
                                android.view.View findChildViewById5 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                                if (findChildViewById5 != null) {
                                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById5);
                                    i = com.qcwireless.qcwatch.R.id.tv_contact;
                                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_contact);
                                    if (textView != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_feedback_name;
                                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_feedback_name);
                                        if (textView2 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_image_number;
                                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_image_number);
                                            if (textView3 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_max_length;
                                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_max_length);
                                                if (textView4 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.user_feedback_et;
                                                    android.widget.EditText editText2 = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_feedback_et);
                                                    if (editText2 != null) {
                                                        return new com.qcwireless.qcwatch.databinding.ActivityFeedbackSubmitBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, editText, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, bind, textView, textView2, textView3, textView4, editText2);
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
