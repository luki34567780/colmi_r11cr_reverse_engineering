package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityDrivingBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.FrameLayout fragmentContent;
    public final android.widget.FrameLayout mapContainer;
    private final android.widget.FrameLayout rootView;

    private ActivityDrivingBinding(android.widget.FrameLayout rootView, android.widget.FrameLayout fragmentContent, android.widget.FrameLayout mapContainer) {
        this.rootView = rootView;
        this.fragmentContent = fragmentContent;
        this.mapContainer = mapContainer;
    }

    public android.widget.FrameLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDrivingBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDrivingBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_driving, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityDrivingBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.fragment_content;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.fragment_content);
        if (frameLayout != null) {
            i = com.qcwireless.qcwatch.R.id.map_container;
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.map_container);
            if (frameLayout2 != null) {
                return new com.qcwireless.qcwatch.databinding.ActivityDrivingBinding((android.widget.FrameLayout) rootView, frameLayout, frameLayout2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
