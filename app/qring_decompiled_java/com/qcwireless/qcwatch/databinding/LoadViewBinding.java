package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LoadViewBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView indication;
    public final android.widget.TextView promptTV;
    private final android.view.View rootView;
    public final com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView shapeLoadingView;

    private LoadViewBinding(android.view.View rootView, android.widget.ImageView indication, android.widget.TextView promptTV, com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView shapeLoadingView) {
        this.rootView = rootView;
        this.indication = indication;
        this.promptTV = promptTV;
        this.shapeLoadingView = shapeLoadingView;
    }

    public android.view.View getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LoadViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent) {
        java.util.Objects.requireNonNull(parent, "parent");
        inflater.inflate(com.qcwireless.qcwatch.R.layout.load_view, parent);
        return bind(parent);
    }

    public static com.qcwireless.qcwatch.databinding.LoadViewBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.indication;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.indication);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.promptTV;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.promptTV);
            if (textView != null) {
                i = com.qcwireless.qcwatch.R.id.shapeLoadingView;
                com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView shapeLoadingView = (com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.shapeLoadingView);
                if (shapeLoadingView != null) {
                    return new com.qcwireless.qcwatch.databinding.LoadViewBinding(rootView, imageView, textView, shapeLoadingView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
