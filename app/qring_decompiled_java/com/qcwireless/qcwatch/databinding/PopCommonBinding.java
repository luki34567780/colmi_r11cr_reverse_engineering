package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class PopCommonBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.LinearLayout mCommonRootLayout;
    public final androidx.recyclerview.widget.RecyclerView mRvCommon;
    private final android.widget.LinearLayout rootView;

    private PopCommonBinding(android.widget.LinearLayout rootView, android.widget.LinearLayout mCommonRootLayout, androidx.recyclerview.widget.RecyclerView mRvCommon) {
        this.rootView = rootView;
        this.mCommonRootLayout = mCommonRootLayout;
        this.mRvCommon = mRvCommon;
    }

    public android.widget.LinearLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.PopCommonBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.PopCommonBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.pop_common, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.PopCommonBinding bind(android.view.View rootView) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) rootView;
        androidx.recyclerview.widget.RecyclerView findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.mRvCommon);
        if (findChildViewById != null) {
            return new com.qcwireless.qcwatch.databinding.PopCommonBinding(linearLayout, linearLayout, findChildViewById);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.mRvCommon)));
    }
}
