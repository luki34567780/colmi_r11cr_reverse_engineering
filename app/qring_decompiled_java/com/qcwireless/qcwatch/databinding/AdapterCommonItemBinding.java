package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class AdapterCommonItemBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView mTvItem;
    private final android.widget.FrameLayout rootView;

    private AdapterCommonItemBinding(android.widget.FrameLayout rootView, android.widget.TextView mTvItem) {
        this.rootView = rootView;
        this.mTvItem = mTvItem;
    }

    public android.widget.FrameLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.AdapterCommonItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.AdapterCommonItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.adapter_common_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.AdapterCommonItemBinding bind(android.view.View rootView) {
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.mTvItem);
        if (textView != null) {
            return new com.qcwireless.qcwatch.databinding.AdapterCommonItemBinding((android.widget.FrameLayout) rootView, textView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.mTvItem)));
    }
}
