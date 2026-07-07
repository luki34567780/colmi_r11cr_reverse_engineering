package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityTestBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btn1;
    public final android.widget.Button btn2;
    public final android.widget.TextView myTextView1;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private ActivityTestBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btn1, android.widget.Button btn2, android.widget.TextView myTextView1) {
        this.rootView = rootView;
        this.btn1 = btn1;
        this.btn2 = btn2;
        this.myTextView1 = myTextView1;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityTestBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityTestBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_test, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityTestBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_1;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_1);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.btn_2;
            android.widget.Button button2 = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_2);
            if (button2 != null) {
                i = com.qcwireless.qcwatch.R.id.my_textView_1;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.my_textView_1);
                if (textView != null) {
                    return new com.qcwireless.qcwatch.databinding.ActivityTestBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, button2, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
