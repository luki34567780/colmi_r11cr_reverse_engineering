package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogRemindSelectorBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView centerText;
    private final android.widget.LinearLayout rootView;
    public final androidx.constraintlayout.widget.ConstraintLayout selectView;
    public final android.widget.TextView tvDialogCancel;
    public final android.widget.TextView tvDialogConfirm;
    public final android.widget.EditText tvDialogTitle;
    public final androidx.recyclerview.widget.RecyclerView weekDayRecycler;
    public final android.widget.TextView weekDayTitle;
    public final com.contrarywind.view.WheelView wheelViewHour;
    public final com.contrarywind.view.WheelView wheelViewMin;

    private LayoutDialogRemindSelectorBinding(android.widget.LinearLayout rootView, android.widget.TextView centerText, androidx.constraintlayout.widget.ConstraintLayout selectView, android.widget.TextView tvDialogCancel, android.widget.TextView tvDialogConfirm, android.widget.EditText tvDialogTitle, androidx.recyclerview.widget.RecyclerView weekDayRecycler, android.widget.TextView weekDayTitle, com.contrarywind.view.WheelView wheelViewHour, com.contrarywind.view.WheelView wheelViewMin) {
        this.rootView = rootView;
        this.centerText = centerText;
        this.selectView = selectView;
        this.tvDialogCancel = tvDialogCancel;
        this.tvDialogConfirm = tvDialogConfirm;
        this.tvDialogTitle = tvDialogTitle;
        this.weekDayRecycler = weekDayRecycler;
        this.weekDayTitle = weekDayTitle;
        this.wheelViewHour = wheelViewHour;
        this.wheelViewMin = wheelViewMin;
    }

    public android.widget.LinearLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogRemindSelectorBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogRemindSelectorBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_remind_selector, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogRemindSelectorBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.center_text;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.center_text);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.select_view;
            androidx.constraintlayout.widget.ConstraintLayout findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.select_view);
            if (findChildViewById != null) {
                i = com.qcwireless.qcwatch.R.id.tv_dialog_cancel;
                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
                if (textView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.tv_dialog_confirm;
                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
                    if (textView3 != null) {
                        i = com.qcwireless.qcwatch.R.id.tv_dialog_title;
                        android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_dialog_title);
                        if (editText != null) {
                            i = com.qcwireless.qcwatch.R.id.week_day_recycler;
                            androidx.recyclerview.widget.RecyclerView findChildViewById2 = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.week_day_recycler);
                            if (findChildViewById2 != null) {
                                i = com.qcwireless.qcwatch.R.id.week_day_title;
                                android.widget.TextView textView4 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.week_day_title);
                                if (textView4 != null) {
                                    i = com.qcwireless.qcwatch.R.id.wheel_view_hour;
                                    com.contrarywind.view.WheelView wheelView = (com.contrarywind.view.WheelView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.wheel_view_hour);
                                    if (wheelView != null) {
                                        i = com.qcwireless.qcwatch.R.id.wheel_view_min;
                                        com.contrarywind.view.WheelView wheelView2 = (com.contrarywind.view.WheelView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.wheel_view_min);
                                        if (wheelView2 != null) {
                                            return new com.qcwireless.qcwatch.databinding.LayoutDialogRemindSelectorBinding((android.widget.LinearLayout) rootView, textView, findChildViewById, textView2, textView3, editText, findChildViewById2, textView4, wheelView, wheelView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
