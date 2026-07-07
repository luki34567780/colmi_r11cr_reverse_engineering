package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityRegisterBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnRegister;
    public final android.widget.CheckBox imgPwd;
    public final android.widget.CheckBox imgPwdEye;
    public final android.view.View line1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvCenter;
    public final android.widget.TextView tvEmailTitle;
    public final android.widget.TextView tvError;
    public final android.widget.TextView tvPwd;
    public final android.widget.TextView tvPwdAgain;
    public final android.widget.TextView tvWelcome;
    public final android.widget.TextView userAgreement;
    public final android.widget.EditText userEmail;
    public final android.widget.TextView userPrivacy;
    public final android.widget.EditText userPwd;
    public final android.widget.EditText userPwdAgain;

    private ActivityRegisterBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnRegister, android.widget.CheckBox imgPwd, android.widget.CheckBox imgPwdEye, android.view.View line1, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvCenter, android.widget.TextView tvEmailTitle, android.widget.TextView tvError, android.widget.TextView tvPwd, android.widget.TextView tvPwdAgain, android.widget.TextView tvWelcome, android.widget.TextView userAgreement, android.widget.EditText userEmail, android.widget.TextView userPrivacy, android.widget.EditText userPwd, android.widget.EditText userPwdAgain) {
        this.rootView = rootView;
        this.btnRegister = btnRegister;
        this.imgPwd = imgPwd;
        this.imgPwdEye = imgPwdEye;
        this.line1 = line1;
        this.titleBar = titleBar;
        this.tvCenter = tvCenter;
        this.tvEmailTitle = tvEmailTitle;
        this.tvError = tvError;
        this.tvPwd = tvPwd;
        this.tvPwdAgain = tvPwdAgain;
        this.tvWelcome = tvWelcome;
        this.userAgreement = userAgreement;
        this.userEmail = userEmail;
        this.userPrivacy = userPrivacy;
        this.userPwd = userPwd;
        this.userPwdAgain = userPwdAgain;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityRegisterBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityRegisterBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_register, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityRegisterBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_register;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_register);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.img_pwd;
            android.widget.CheckBox checkBox = (android.widget.CheckBox) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.img_pwd);
            if (checkBox != null) {
                i = com.qcwireless.qcwatch.R.id.img_pwd_eye;
                android.widget.CheckBox checkBox2 = (android.widget.CheckBox) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.img_pwd_eye);
                if (checkBox2 != null) {
                    i = com.qcwireless.qcwatch.R.id.line_1;
                    android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                    if (findChildViewById != null) {
                        i = 2131297388;
                        android.view.View findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                        if (findChildViewById2 != null) {
                            com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById2);
                            i = com.qcwireless.qcwatch.R.id.tv_center;
                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_center);
                            if (textView != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_email_title;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_email_title);
                                if (textView2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_error;
                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_error);
                                    if (textView3 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_pwd;
                                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_pwd);
                                        if (textView4 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_pwd_again;
                                            android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_pwd_again);
                                            if (textView5 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_welcome;
                                                android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_welcome);
                                                if (textView6 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.user_agreement;
                                                    android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_agreement);
                                                    if (textView7 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.user_email;
                                                        android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_email);
                                                        if (editText != null) {
                                                            i = com.qcwireless.qcwatch.R.id.user_privacy;
                                                            android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_privacy);
                                                            if (textView8 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.user_pwd;
                                                                android.widget.EditText editText2 = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_pwd);
                                                                if (editText2 != null) {
                                                                    i = com.qcwireless.qcwatch.R.id.user_pwd_again;
                                                                    android.widget.EditText editText3 = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_pwd_again);
                                                                    if (editText3 != null) {
                                                                        return new com.qcwireless.qcwatch.databinding.ActivityRegisterBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, checkBox, checkBox2, findChildViewById, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7, editText, textView8, editText2, editText3);
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
