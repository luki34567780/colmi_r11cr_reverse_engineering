package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivitySportPrepareBinding implements androidx.viewbinding.ViewBinding {
    public final android.view.View coverView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvNumber1;
    public final android.widget.TextView tvNumber2;

    private ActivitySportPrepareBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.view.View coverView, android.widget.TextView tvNumber1, android.widget.TextView tvNumber2) {
        this.rootView = rootView;
        this.coverView = coverView;
        this.tvNumber1 = tvNumber1;
        this.tvNumber2 = tvNumber2;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_sport_prepare, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.cover_view;
        android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cover_view);
        if (findChildViewById != null) {
            i = com.qcwireless.qcwatch.R.id.tv_number_1;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_number_1);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.tv_number_2;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_number_2);
                if (textView2 != null) {
                    return new com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, findChildViewById, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
