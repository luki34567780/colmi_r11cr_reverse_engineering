package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentNickNameBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnNext;
    public final android.view.View line1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvTitle;
    public final com.qcwireless.qcwatch.ui.base.view.CircleImageView userIconCenter;
    public final android.widget.EditText userNick;

    private FragmentNickNameBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnNext, android.view.View line1, android.widget.TextView tvTitle, com.qcwireless.qcwatch.ui.base.view.CircleImageView userIconCenter, android.widget.EditText userNick) {
        this.rootView = rootView;
        this.btnNext = btnNext;
        this.line1 = line1;
        this.tvTitle = tvTitle;
        this.userIconCenter = userIconCenter;
        this.userNick = userNick;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentNickNameBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentNickNameBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_nick_name, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentNickNameBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_next;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_next);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.line_1;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.line_1);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.tv_title;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.user_icon_center;
                    com.qcwireless.qcwatch.ui.base.view.CircleImageView circleImageView = (com.qcwireless.qcwatch.ui.base.view.CircleImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_icon_center);
                    if (circleImageView != null) {
                        i = com.qcwireless.qcwatch.R.id.user_nick;
                        android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.user_nick);
                        if (editText != null) {
                            return new com.qcwireless.qcwatch.databinding.FragmentNickNameBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, findChildViewById, textView, circleImageView, editText);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
