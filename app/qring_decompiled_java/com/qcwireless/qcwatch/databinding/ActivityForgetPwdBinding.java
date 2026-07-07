package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityForgetPwdBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnConfirm;
    public final android.widget.EditText etVerifyCode;
    public final android.widget.CheckBox imgPwdConfirm;
    public final android.widget.CheckBox imgPwdNew;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView sendCode;
    public final com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar;
    public final android.widget.TextView tvEmailTitle;
    public final android.widget.TextView tvError;
    public final android.widget.TextView tvPwdConfirm;
    public final android.widget.TextView tvPwdNew;
    public final android.widget.TextView tvVerifyCode;
    public final android.widget.EditText userEmail;
    public final android.widget.EditText userPwdConfirm;
    public final android.widget.EditText userPwdNew;

    private ActivityForgetPwdBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnConfirm, android.widget.EditText etVerifyCode, android.widget.CheckBox imgPwdConfirm, android.widget.CheckBox imgPwdNew, android.widget.TextView sendCode, com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding titleBar, android.widget.TextView tvEmailTitle, android.widget.TextView tvError, android.widget.TextView tvPwdConfirm, android.widget.TextView tvPwdNew, android.widget.TextView tvVerifyCode, android.widget.EditText userEmail, android.widget.EditText userPwdConfirm, android.widget.EditText userPwdNew) {
        this.rootView = rootView;
        this.btnConfirm = btnConfirm;
        this.etVerifyCode = etVerifyCode;
        this.imgPwdConfirm = imgPwdConfirm;
        this.imgPwdNew = imgPwdNew;
        this.sendCode = sendCode;
        this.titleBar = titleBar;
        this.tvEmailTitle = tvEmailTitle;
        this.tvError = tvError;
        this.tvPwdConfirm = tvPwdConfirm;
        this.tvPwdNew = tvPwdNew;
        this.tvVerifyCode = tvVerifyCode;
        this.userEmail = userEmail;
        this.userPwdConfirm = userPwdConfirm;
        this.userPwdNew = userPwdNew;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_forget_pwd, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_confirm;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_confirm);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.et_verify_code;
            android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.et_verify_code);
            if (editText != null) {
                i = com.qcwireless.qcwatch.R.id.img_pwd_confirm;
                android.widget.CheckBox checkBox = (android.widget.CheckBox) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.img_pwd_confirm);
                if (checkBox != null) {
                    i = com.qcwireless.qcwatch.R.id.img_pwd_new;
                    android.widget.CheckBox checkBox2 = (android.widget.CheckBox) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.img_pwd_new);
                    if (checkBox2 != null) {
                        i = com.qcwireless.qcwatch.R.id.send_code;
                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.send_code);
                        if (textView != null) {
                            i = 2131297388;
                            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297388);
                            if (findChildViewById != null) {
                                com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding bind = com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding.bind(findChildViewById);
                                i = com.qcwireless.qcwatch.R.id.tv_email_title;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_email_title);
                                if (textView2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_error;
                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_error);
                                    if (textView3 != null) {
                                        i = com.qcwireless.qcwatch.R.id.tv_pwd_confirm;
                                        android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_pwd_confirm);
                                        if (textView4 != null) {
                                            i = com.qcwireless.qcwatch.R.id.tv_pwd_new;
                                            android.widget.TextView textView5 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_pwd_new);
                                            if (textView5 != null) {
                                                i = com.qcwireless.qcwatch.R.id.tv_verify_code;
                                                android.widget.TextView textView6 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_verify_code);
                                                if (textView6 != null) {
                                                    i = com.qcwireless.qcwatch.R.id.user_email;
                                                    android.widget.EditText editText2 = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_email);
                                                    if (editText2 != null) {
                                                        i = com.qcwireless.qcwatch.R.id.user_pwd_confirm;
                                                        android.widget.EditText editText3 = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_pwd_confirm);
                                                        if (editText3 != null) {
                                                            i = com.qcwireless.qcwatch.R.id.user_pwd_new;
                                                            android.widget.EditText editText4 = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_pwd_new);
                                                            if (editText4 != null) {
                                                                return new com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, editText, checkBox, checkBox2, textView, bind, textView2, textView3, textView4, textView5, textView6, editText2, editText3, editText4);
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
