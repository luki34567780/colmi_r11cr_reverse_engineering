package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleStepTagetLayoutBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView imageIcon;
    public final androidx.constraintlayout.widget.ConstraintLayout layoutBg;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvContent;

    private RecycleStepTagetLayoutBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView imageIcon, androidx.constraintlayout.widget.ConstraintLayout layoutBg, android.widget.TextView tvContent) {
        this.rootView = rootView;
        this.imageIcon = imageIcon;
        this.layoutBg = layoutBg;
        this.tvContent = tvContent;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleStepTagetLayoutBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleStepTagetLayoutBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycle_step_taget_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleStepTagetLayoutBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.image_icon;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_icon);
        if (imageView != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) rootView;
            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131297477);
            if (textView != null) {
                return new com.qcwireless.qcwatch.databinding.RecycleStepTagetLayoutBinding(constraintLayout, imageView, constraintLayout, textView);
            }
            i = 2131297477;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
