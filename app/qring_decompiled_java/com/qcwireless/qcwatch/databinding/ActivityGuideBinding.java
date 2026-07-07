package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class ActivityGuideBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.webkit.WebView webView;

    private ActivityGuideBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.webkit.WebView webView) {
        this.rootView = rootView;
        this.webView = webView;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGuideBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGuideBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.activity_guide, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.ActivityGuideBinding bind(android.view.View rootView) {
        android.webkit.WebView webView = (android.webkit.WebView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.webView);
        if (webView != null) {
            return new com.qcwireless.qcwatch.databinding.ActivityGuideBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, webView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.webView)));
    }
}
