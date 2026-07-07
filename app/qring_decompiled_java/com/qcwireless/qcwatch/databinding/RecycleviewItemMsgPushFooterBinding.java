package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemMsgPushFooterBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcOtherSwitch;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private RecycleviewItemMsgPushFooterBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qcOtherSwitch) {
        this.rootView = rootView;
        this.qcOtherSwitch = qcOtherSwitch;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMsgPushFooterBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMsgPushFooterBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_msg_push_footer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemMsgPushFooterBinding bind(android.view.View rootView) {
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.qc_other_switch);
        if (qSettingItemWithClickSystem != null) {
            return new com.qcwireless.qcwatch.databinding.RecycleviewItemMsgPushFooterBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qSettingItemWithClickSystem);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.qc_other_switch)));
    }
}
