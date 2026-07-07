package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityLoginBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnLogin;
    public final android.widget.CheckBox imgPwd;
    public final android.view.View line1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvCenter;
    public final android.widget.TextView tvEmailTitle;
    public final android.widget.TextView tvError;
    public final android.widget.TextView tvForgetPws;
    public final android.widget.TextView tvPwd;
    public final android.widget.TextView tvRegister;
    public final android.widget.TextView tvWelcome;
    public final android.widget.TextView userAgreement;
    public final android.widget.EditText userEmail;
    public final android.widget.TextView userPrivacy;
    public final android.widget.TextView userPrivacyEn;
    public final android.widget.EditText userPwd;

    private ActivityLoginBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnLogin, android.widget.CheckBox imgPwd, android.view.View line1, android.widget.TextView tvCenter, android.widget.TextView tvEmailTitle, android.widget.TextView tvError, android.widget.TextView tvForgetPws, android.widget.TextView tvPwd, android.widget.TextView tvRegister, android.widget.TextView tvWelcome, android.widget.TextView userAgreement, android.widget.EditText userEmail, android.widget.TextView userPrivacy, android.widget.TextView userPrivacyEn, android.widget.EditText userPwd) {
        this.rootView = rootView;
        this.btnLogin = btnLogin;
        this.imgPwd = imgPwd;
        this.line1 = line1;
        this.tvCenter = tvCenter;
        this.tvEmailTitle = tvEmailTitle;
        this.tvError = tvError;
        this.tvForgetPws = tvForgetPws;
        this.tvPwd = tvPwd;
        this.tvRegister = tvRegister;
        this.tvWelcome = tvWelcome;
        this.userAgreement = userAgreement;
        this.userEmail = userEmail;
        this.userPrivacy = userPrivacy;
        this.userPrivacyEn = userPrivacyEn;
        this.userPwd = userPwd;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityLoginBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityLoginBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_login, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityLoginBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_login;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_login);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.img_pwd;
            android.widget.CheckBox checkBox = (android.widget.CheckBox) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.img_pwd);
            if (checkBox != null) {
                i = com.qcwireless.qcwatch.R.id.line_1;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
                if (findChildViewById != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_center;
                    android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_center);
                    if (textView != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_email_title;
                        android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_email_title);
                        if (textView2 != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_error;
                            android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_error);
                            if (textView3 != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_forget_pws;
                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_forget_pws);
                                if (textView4 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_pwd;
                                    android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_pwd);
                                    if (textView5 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_register;
                                        android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_register);
                                        if (textView6 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_welcome;
                                            android.widget.TextView textView7 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_welcome);
                                            if (textView7 != null) {
                                                i = com.qcwireless.qcwatch.R.id.user_agreement;
                                                android.widget.TextView textView8 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_agreement);
                                                if (textView8 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.user_email;
                                                    android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_email);
                                                    if (editText != null) {
                                                        i = com.qcwireless.qcwatch.R.id.user_privacy;
                                                        android.widget.TextView textView9 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_privacy);
                                                        if (textView9 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.user_privacy_en;
                                                            android.widget.TextView textView10 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_privacy_en);
                                                            if (textView10 != null) {
                                                                i = com.qcwireless.qcwatch.R.id.user_pwd;
                                                                android.widget.EditText editText2 = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_pwd);
                                                                if (editText2 != null) {
                                                                    return new com.qcwireless.qcwatch.databinding.ActivityLoginBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, checkBox, findChildViewById, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, editText, textView9, textView10, editText2);
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
