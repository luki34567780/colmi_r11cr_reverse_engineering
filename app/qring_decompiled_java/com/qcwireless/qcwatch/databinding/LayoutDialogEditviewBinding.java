package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class LayoutDialogEditviewBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.TextView btnSave;
    public final android.widget.EditText nameEdt;
    private final android.widget.LinearLayout rootView;

    private LayoutDialogEditviewBinding(android.widget.LinearLayout rootView, android.widget.TextView btnSave, android.widget.EditText nameEdt) {
        this.rootView = rootView;
        this.btnSave = btnSave;
        this.nameEdt = nameEdt;
    }

    public android.widget.LinearLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogEditviewBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogEditviewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.layout_dialog_editview, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.LayoutDialogEditviewBinding bind(android.view.View rootView) {
        int i = com.qcwireless.qcwatch.R.id.btn_save;
        android.widget.TextView textView = (android.widget.TextView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.btn_save);
        if (textView != null) {
            i = com.qcwireless.qcwatch.R.id.name_edt;
            android.widget.EditText editText = (android.widget.EditText) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.name_edt);
            if (editText != null) {
                return new com.qcwireless.qcwatch.databinding.LayoutDialogEditviewBinding((android.widget.LinearLayout) rootView, textView, editText);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
