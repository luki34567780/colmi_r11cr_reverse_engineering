package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentYearSportBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private FragmentYearSportBinding(androidx.constraintlayout.widget.ConstraintLayout rootView) {
        this.rootView = rootView;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentYearSportBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentYearSportBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_year_sport, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentYearSportBinding bind(android.view.View rootView) {
        java.util.Objects.requireNonNull(rootView, "rootView");
        return new com.qcwireless.qcwatch.databinding.FragmentYearSportBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView);
    }
}
