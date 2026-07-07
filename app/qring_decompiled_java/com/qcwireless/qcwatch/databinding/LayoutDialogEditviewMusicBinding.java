package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogEditviewMusicBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.ImageView btnCancel;
    public final android.widget.ImageView btnSave;
    public final android.view.View line;
    public final android.widget.EditText nameEdt;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;

    private LayoutDialogEditviewMusicBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, android.widget.ImageView btnCancel, android.widget.ImageView btnSave, android.view.View line, android.widget.EditText nameEdt) {
        this.rootView = rootView;
        this.btnCancel = btnCancel;
        this.btnSave = btnSave;
        this.line = line;
        this.nameEdt = nameEdt;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogEditviewMusicBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogEditviewMusicBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_editview_music, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogEditviewMusicBinding bind(android.view.View rootView) {
        int i = 2131296417;
        android.widget.ImageView imageView = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131296417);
        if (imageView != null) {
            i = com.qcwireless.qcwatch.R.id.btn_save;
            android.widget.ImageView imageView2 = (android.widget.ImageView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_save);
            if (imageView2 != null) {
                i = 2131296904;
                android.view.View findChildViewById = androidx.viewbinding.ViewBindings.findChildViewById(rootView, 2131296904);
                if (findChildViewById != null) {
                    i = com.qcwireless.qcwatch.R.id.name_edt;
                    android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.name_edt);
                    if (editText != null) {
                        return new com.qcwireless.qcwatch.databinding.LayoutDialogEditviewMusicBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, imageView, imageView2, findChildViewById, editText);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
