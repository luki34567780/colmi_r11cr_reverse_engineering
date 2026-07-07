package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutBottomdialogBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout bottomLayout;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private LayoutBottomdialogBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, androidx.constraintlayout.widget.ConstraintLayout bottomLayout) {
        this.rootView = rootView;
        this.bottomLayout = bottomLayout;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutBottomdialogBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutBottomdialogBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_bottomdialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutBottomdialogBinding bind(android.view.View rootView) {
        java.util.Objects.requireNonNull(rootView, "rootView");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) rootView;
        return new com.qcwireless.qcwatch.databinding.LayoutBottomdialogBinding(constraintLayout, constraintLayout);
    }
}
