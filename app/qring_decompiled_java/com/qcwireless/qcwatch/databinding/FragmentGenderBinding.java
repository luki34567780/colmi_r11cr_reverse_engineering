package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class FragmentGenderBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button btnNext;
    public final android.widget.ImageView imageBoy;
    public final android.widget.ImageView imageBoySelect;
    public final android.widget.ImageView imageGirl;
    public final android.widget.ImageView imageGirlSelect;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.TextView tvFemale;
    public final android.widget.TextView tvMale;
    public final android.widget.TextView tvTitle;

    private FragmentGenderBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.Button btnNext, android.widget.ImageView imageBoy, android.widget.ImageView imageBoySelect, android.widget.ImageView imageGirl, android.widget.ImageView imageGirlSelect, android.widget.TextView tvFemale, android.widget.TextView tvMale, android.widget.TextView tvTitle) {
        this.rootView = rootView;
        this.btnNext = btnNext;
        this.imageBoy = imageBoy;
        this.imageBoySelect = imageBoySelect;
        this.imageGirl = imageGirl;
        this.imageGirlSelect = imageGirlSelect;
        this.tvFemale = tvFemale;
        this.tvMale = tvMale;
        this.tvTitle = tvTitle;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.FragmentGenderBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentGenderBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.fragment_gender, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.FragmentGenderBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_next;
        android.widget.Button button = (android.widget.Button) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_next);
        if (button != null) {
            i = com.qcwireless.qcwatch.R.id.image_boy;
            android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_boy);
            if (imageView != null) {
                i = com.qcwireless.qcwatch.R.id.image_boy_select;
                android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_boy_select);
                if (imageView2 != null) {
                    i = com.qcwireless.qcwatch.R.id.image_girl;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_girl);
                    if (imageView3 != null) {
                        i = com.qcwireless.qcwatch.R.id.image_girl_select;
                        android.widget.ImageView imageView4 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.image_girl_select);
                        if (imageView4 != null) {
                            i = com.qcwireless.qcwatch.R.id.tv_female;
                            android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_female);
                            if (textView != null) {
                                i = com.qcwireless.qcwatch.R.id.tv_male;
                                android.widget.TextView textView2 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_male);
                                if (textView2 != null) {
                                    i = com.qcwireless.qcwatch.R.id.tv_title;
                                    android.widget.TextView textView3 = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.tv_title);
                                    if (textView3 != null) {
                                        return new com.qcwireless.qcwatch.databinding.FragmentGenderBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, button, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
