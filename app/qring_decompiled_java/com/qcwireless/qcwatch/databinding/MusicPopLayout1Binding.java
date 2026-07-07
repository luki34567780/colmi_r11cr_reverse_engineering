package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class MusicPopLayout1Binding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout rootLayout;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tv1;
    public final android.widget.TextView tv2;

    private MusicPopLayout1Binding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.ConstraintLayout rootLayout, android.widget.TextView tv1, android.widget.TextView tv2) {
        this.rootView = rootView;
        this.rootLayout = rootLayout;
        this.tv1 = tv1;
        this.tv2 = tv2;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.MusicPopLayout1Binding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.MusicPopLayout1Binding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.music_pop_layout_1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.MusicPopLayout1Binding bind(android.view.View rootView) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) rootView;
        int i = com.qcwireless.qcwatch.R.id.tv_1;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_1);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_2;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_2);
            if (textView2 != null) {
                return new com.qcwireless.qcwatch.databinding.MusicPopLayout1Binding(constraintLayout, constraintLayout, textView, textView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
