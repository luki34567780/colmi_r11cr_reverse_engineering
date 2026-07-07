package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogBinding implements androidx.viewbinding.ViewBinding {
    public final com.qcwireless.qcwatch.ui.base.view.LoadingView loadView;
    private final android.widget.FrameLayout rootView;

    private LayoutDialogBinding(android.widget.FrameLayout rootView, com.qcwireless.qcwatch.ui.base.view.LoadingView loadView) {
        this.rootView = rootView;
        this.loadView = loadView;
    }

    public android.widget.FrameLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogBinding bind(android.view.View rootView) {
        com.qcwireless.qcwatch.ui.base.view.LoadingView loadingView = (com.qcwireless.qcwatch.ui.base.view.LoadingView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.loadView);
        if (loadingView != null) {
            return new com.qcwireless.qcwatch.databinding.LayoutDialogBinding((android.widget.FrameLayout) rootView, loadingView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.loadView)));
    }
}
