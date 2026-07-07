package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentPlateBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvLine1;
    public final android.widget.TextView tvLine2;
    public final android.widget.TextView tvTab1Title;
    public final android.widget.TextView tvTab2Title;
    public final androidx.viewpager2.widget.ViewPager2 viewPager;

    private FragmentPlateBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView tvLine1, android.widget.TextView tvLine2, android.widget.TextView tvTab1Title, android.widget.TextView tvTab2Title, androidx.viewpager2.widget.ViewPager2 viewPager) {
        this.rootView = rootView;
        this.tvLine1 = tvLine1;
        this.tvLine2 = tvLine2;
        this.tvTab1Title = tvTab1Title;
        this.tvTab2Title = tvTab2Title;
        this.viewPager = viewPager;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentPlateBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentPlateBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_plate, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentPlateBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.tv_line_1;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_line_1);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_line_2;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_line_2);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.tv_tab1_title;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_tab1_title);
                if (textView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_tab2_title;
                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_tab2_title);
                    if (textView4 != null) {
                        i = com.qcwireless.qcwatch.R.id.view_pager;
                        androidx.viewpager2.widget.ViewPager2 findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.view_pager);
                        if (findChildViewById != null) {
                            return new com.qcwireless.qcwatch.databinding.FragmentPlateBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3, textView4, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
