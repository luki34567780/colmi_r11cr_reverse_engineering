package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class MenstruationWeekBarBinding implements androidx.viewbinding.ViewBinding {
    private final android.view.View rootView;

    private MenstruationWeekBarBinding(android.view.View rootView) {
        this.rootView = rootView;
    }

    public android.view.View getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.MenstruationWeekBarBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent) {
        java.util.Objects.requireNonNull(parent, "parent");
        inflater.inflate(com.qcwireless.qcwatch.R.layout.menstruation_week_bar, parent);
        return bind(parent);
    }

    public static com.qcwireless.qcwatch.databinding.MenstruationWeekBarBinding bind(android.view.View rootView) {
        java.util.Objects.requireNonNull(rootView, "rootView");
        return new com.qcwireless.qcwatch.databinding.MenstruationWeekBarBinding(rootView);
    }
}
