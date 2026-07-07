package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class SrlClassicsHeaderBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.ImageView srlClassicsArrow;
    public final android.widget.ImageView srlClassicsProgress;
    public final android.widget.TextView srlClassicsTitle;
    public final android.widget.TextView srlClassicsUpdate;

    private SrlClassicsHeaderBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView srlClassicsArrow, android.widget.ImageView srlClassicsProgress, android.widget.TextView srlClassicsTitle, android.widget.TextView srlClassicsUpdate) {
        this.rootView = rootView;
        this.srlClassicsArrow = srlClassicsArrow;
        this.srlClassicsProgress = srlClassicsProgress;
        this.srlClassicsTitle = srlClassicsTitle;
        this.srlClassicsUpdate = srlClassicsUpdate;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.SrlClassicsHeaderBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.SrlClassicsHeaderBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.srl_classics_header, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.SrlClassicsHeaderBinding bind(android.view.View rootView) {
        int i = 2131297301;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297301);
        if (imageView != null) {
            i = 2131297302;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297302);
            if (imageView2 != null) {
                i = 2131297303;
                android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297303);
                if (textView != null) {
                    i = 2131297304;
                    android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297304);
                    if (textView2 != null) {
                        return new com.qcwireless.qcwatch.databinding.SrlClassicsHeaderBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
