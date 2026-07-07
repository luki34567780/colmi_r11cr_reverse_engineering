package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentBirthdayBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnNext;
    public final androidx.constraintlayout.widget.ConstraintLayout ctlBirthday;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvCenter;
    public final android.widget.TextView tvTitle;
    public final com.contrarywind.view.WheelView wheelViewMonth;
    public final com.contrarywind.view.WheelView wheelViewYear;

    private FragmentBirthdayBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnNext, androidx.constraintlayout.widget.ConstraintLayout ctlBirthday, android.widget.TextView tvCenter, android.widget.TextView tvTitle, com.contrarywind.view.WheelView wheelViewMonth, com.contrarywind.view.WheelView wheelViewYear) {
        this.rootView = rootView;
        this.btnNext = btnNext;
        this.ctlBirthday = ctlBirthday;
        this.tvCenter = tvCenter;
        this.tvTitle = tvTitle;
        this.wheelViewMonth = wheelViewMonth;
        this.wheelViewYear = wheelViewYear;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_birthday, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_next;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_next);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.ctl_birthday;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.ctl_birthday);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.tv_center;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_center);
                if (textView != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_title;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title);
                    if (textView2 != null) {
                        i = com.qcwireless.qcwatch.R.id.wheel_view_month;
                        com.contrarywind.view.WheelView wheelView = (com.contrarywind.view.WheelView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.wheel_view_month);
                        if (wheelView != null) {
                            i = com.qcwireless.qcwatch.R.id.wheel_view_year;
                            com.contrarywind.view.WheelView wheelView2 = (com.contrarywind.view.WheelView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.wheel_view_year);
                            if (wheelView2 != null) {
                                return new com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, findChildViewById, textView, textView2, wheelView, wheelView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
