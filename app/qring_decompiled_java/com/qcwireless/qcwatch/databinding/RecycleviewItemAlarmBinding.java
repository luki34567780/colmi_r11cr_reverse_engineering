package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemAlarmBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem alarmDetail;
    public final android.widget.Button btnDelete;
    public final android.widget.RelativeLayout main;
    private final com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout rootView;

    private RecycleviewItemAlarmBinding(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout rootView, com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem alarmDetail, android.widget.Button btnDelete, android.widget.RelativeLayout main) {
        this.rootView = rootView;
        this.alarmDetail = alarmDetail;
        this.btnDelete = btnDelete;
        this.main = main;
    }

    public com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemAlarmBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemAlarmBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_alarm, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemAlarmBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.alarm_detail;
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.alarm_detail);
        if (qSettingItemWithClickSystem != null) {
            i = com.qcwireless.qcwatch.R.id.btn_delete;
            android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_delete);
            if (button != null) {
                i = com.qcwireless.qcwatch.R.id.main;
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.main);
                if (relativeLayout != null) {
                    return new com.qcwireless.qcwatch.databinding.RecycleviewItemAlarmBinding((com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout) rootView, qSettingItemWithClickSystem, button, relativeLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
