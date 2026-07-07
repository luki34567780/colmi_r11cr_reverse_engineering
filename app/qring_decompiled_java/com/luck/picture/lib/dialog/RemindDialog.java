package com.luck.picture.lib.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class RemindDialog extends android.app.Dialog implements android.view.View.OnClickListener {
    private final android.widget.TextView btnOk;
    private com.luck.picture.lib.dialog.RemindDialog.OnDialogClickListener listener;
    private final android.widget.TextView tvContent;

    public interface OnDialogClickListener {
        void onClick(android.view.View view);
    }

    public RemindDialog(android.content.Context context, java.lang.String str) {
        super(context, com.luck.picture.lib.R.style.Picture_Theme_Dialog);
        setContentView(com.luck.picture.lib.R.layout.ps_remind_dialog);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.luck.picture.lib.R.id.btnOk);
        this.btnOk = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.luck.picture.lib.R.id.tv_content);
        this.tvContent = textView2;
        textView2.setText(str);
        textView.setOnClickListener(this);
        setDialogSize();
    }

    @java.lang.Deprecated
    public static android.app.Dialog showTipsDialog(android.content.Context context, java.lang.String str) {
        return new com.luck.picture.lib.dialog.RemindDialog(context, str);
    }

    public static com.luck.picture.lib.dialog.RemindDialog buildDialog(android.content.Context context, java.lang.String str) {
        return new com.luck.picture.lib.dialog.RemindDialog(context, str);
    }

    public void setButtonText(java.lang.String str) {
        this.btnOk.setText(str);
    }

    public void setButtonTextColor(int i) {
        this.btnOk.setTextColor(i);
    }

    public void setContent(java.lang.String str) {
        this.tvContent.setText(str);
    }

    public void setContentTextColor(int i) {
        this.tvContent.setTextColor(i);
    }

    private void setDialogSize() {
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(com.luck.picture.lib.R.style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view.getId() == com.luck.picture.lib.R.id.btnOk) {
            com.luck.picture.lib.dialog.RemindDialog.OnDialogClickListener onDialogClickListener = this.listener;
            if (onDialogClickListener != null) {
                onDialogClickListener.onClick(view);
            } else {
                dismiss();
            }
        }
    }

    public void setOnDialogClickListener(com.luck.picture.lib.dialog.RemindDialog.OnDialogClickListener onDialogClickListener) {
        this.listener = onDialogClickListener;
    }
}
