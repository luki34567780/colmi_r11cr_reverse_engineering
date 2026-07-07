package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityStatusBarBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.FrameLayout frameLayoutContentPlace;
    private final android.widget.LinearLayout rootView;
    public final android.view.View viewStatusBarPlace;

    private ActivityStatusBarBinding(android.widget.LinearLayout rootView, android.widget.FrameLayout frameLayoutContentPlace, android.view.View viewStatusBarPlace) {
        this.rootView = rootView;
        this.frameLayoutContentPlace = frameLayoutContentPlace;
        this.viewStatusBarPlace = viewStatusBarPlace;
    }

    public android.widget.LinearLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityStatusBarBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityStatusBarBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_status_bar, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityStatusBarBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.frame_layout_content_place;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.frame_layout_content_place);
        if (frameLayout != null) {
            i = com.qcwireless.qcwatch.R.id.view_status_bar_place;
            android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.view_status_bar_place);
            if (findChildViewById != null) {
                return new com.qcwireless.qcwatch.databinding.ActivityStatusBarBinding((android.widget.LinearLayout) rootView, frameLayout, findChildViewById);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
