package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentWeightBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnNext;
    public final androidx.constraintlayout.widget.ConstraintLayout ctsHeight;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvCenter;
    public final android.widget.TextView tvTitle;
    public final com.contrarywind.view.WheelView wheelView;
    public final com.contrarywind.view.WheelView wheelViewUnit;

    private FragmentWeightBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnNext, androidx.constraintlayout.widget.ConstraintLayout ctsHeight, android.widget.TextView tvCenter, android.widget.TextView tvTitle, com.contrarywind.view.WheelView wheelView, com.contrarywind.view.WheelView wheelViewUnit) {
        this.rootView = rootView;
        this.btnNext = btnNext;
        this.ctsHeight = ctsHeight;
        this.tvCenter = tvCenter;
        this.tvTitle = tvTitle;
        this.wheelView = wheelView;
        this.wheelViewUnit = wheelViewUnit;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWeightBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWeightBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_weight, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentWeightBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_next;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_next);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.cts_height;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.cts_height);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.tv_center;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_center);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_title;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title);
                    if (textView2 != null) {
                        i = com.qcwireless.qcwatch.R.id.wheel_view;
                        com.contrarywind.view.WheelView wheelView = (com.contrarywind.view.WheelView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.wheel_view);
                        if (wheelView != null) {
                            i = com.qcwireless.qcwatch.R.id.wheel_view_unit;
                            com.contrarywind.view.WheelView wheelView2 = (com.contrarywind.view.WheelView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.wheel_view_unit);
                            if (wheelView2 != null) {
                                return new com.qcwireless.qcwatch.databinding.FragmentWeightBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, findChildViewById, textView, textView2, wheelView, wheelView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
