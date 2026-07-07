package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class DialogPrivaryBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnEnter;
    public final android.widget.Button btnExit;
    public final android.widget.LinearLayout layoutToDo;
    public final android.view.View line;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvNote;
    public final android.widget.TextView tvPrivacyTips;

    private DialogPrivaryBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnEnter, android.widget.Button btnExit, android.widget.LinearLayout layoutToDo, android.view.View line, android.widget.TextView tvNote, android.widget.TextView tvPrivacyTips) {
        this.rootView = rootView;
        this.btnEnter = btnEnter;
        this.btnExit = btnExit;
        this.layoutToDo = layoutToDo;
        this.line = line;
        this.tvNote = tvNote;
        this.tvPrivacyTips = tvPrivacyTips;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.DialogPrivaryBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.DialogPrivaryBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.dialog_privary, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.DialogPrivaryBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_enter;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_enter);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.btn_exit;
            android.widget.Button button2 = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_exit);
            if (button2 != null) {
                i = com.qcwireless.qcwatch.R.id.layout_to_do;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.layout_to_do);
                if (linearLayout != null) {
                    i = 2131296904;
                    android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131296904);
                    if (findChildViewById != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_note;
                        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_note);
                        if (textView != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_privacy_tips;
                            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_privacy_tips);
                            if (textView2 != null) {
                                return new com.qcwireless.qcwatch.databinding.DialogPrivaryBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, button2, linearLayout, findChildViewById, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
