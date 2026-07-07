package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogHeightWeightViewBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvCenter;
    public final android.widget.TextView tvDialogCancel;
    public final android.widget.TextView tvDialogConfirm;
    public final android.widget.TextView tvDialogTitle;
    public final com.contrarywind.view.WheelView wheelView;
    public final com.contrarywind.view.WheelView wheelViewUnit;

    private LayoutDialogHeightWeightViewBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.TextView tvCenter, android.widget.TextView tvDialogCancel, android.widget.TextView tvDialogConfirm, android.widget.TextView tvDialogTitle, com.contrarywind.view.WheelView wheelView, com.contrarywind.view.WheelView wheelViewUnit) {
        this.rootView = rootView;
        this.tvCenter = tvCenter;
        this.tvDialogCancel = tvDialogCancel;
        this.tvDialogConfirm = tvDialogConfirm;
        this.tvDialogTitle = tvDialogTitle;
        this.wheelView = wheelView;
        this.wheelViewUnit = wheelViewUnit;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogHeightWeightViewBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogHeightWeightViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_height_weight_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogHeightWeightViewBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.tv_center;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_center);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.tv_dialog_cancel;
            android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
            if (textView2 != null) {
                i = com.qcwireless.qcwatch.R.id.tv_dialog_confirm;
                android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
                if (textView3 != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_dialog_title;
                    android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_dialog_title);
                    if (textView4 != null) {
                        i = com.qcwireless.qcwatch.R.id.wheel_view;
                        com.contrarywind.view.WheelView wheelView = (com.contrarywind.view.WheelView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.wheel_view);
                        if (wheelView != null) {
                            i = com.qcwireless.qcwatch.R.id.wheel_view_unit;
                            com.contrarywind.view.WheelView wheelView2 = (com.contrarywind.view.WheelView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.wheel_view_unit);
                            if (wheelView2 != null) {
                                return new com.qcwireless.qcwatch.databinding.LayoutDialogHeightWeightViewBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, textView3, textView4, wheelView, wheelView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
