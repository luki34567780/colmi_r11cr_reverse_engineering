package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityBiliTestingBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button button;
    public final android.widget.Button button2;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private ActivityBiliTestingBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button button, android.widget.Button button2) {
        this.rootView = rootView;
        this.button = button;
        this.button2 = button2;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBiliTestingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBiliTestingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_bili_testing, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityBiliTestingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.button;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.button);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.button2;
            android.widget.Button button2 = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.button2);
            if (button2 != null) {
                return new com.qcwireless.qcwatch.databinding.ActivityBiliTestingBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, button2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
