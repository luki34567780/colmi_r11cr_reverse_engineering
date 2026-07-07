package com.luck.picture.lib.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureCommonDialog extends android.app.Dialog implements android.view.View.OnClickListener {
    private com.luck.picture.lib.dialog.PictureCommonDialog.OnDialogEventListener eventListener;

    public interface OnDialogEventListener {
        void onConfirm();
    }

    public static com.luck.picture.lib.dialog.PictureCommonDialog showDialog(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.luck.picture.lib.dialog.PictureCommonDialog pictureCommonDialog = new com.luck.picture.lib.dialog.PictureCommonDialog(context, str, str2);
        pictureCommonDialog.show();
        return pictureCommonDialog;
    }

    public PictureCommonDialog(android.content.Context context, java.lang.String str, java.lang.String str2) {
        super(context, com.luck.picture.lib.R.style.Picture_Theme_Dialog);
        setContentView(com.luck.picture.lib.R.layout.ps_common_dialog);
        android.widget.Button button = (android.widget.Button) findViewById(com.luck.picture.lib.R.id.btn_cancel);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.luck.picture.lib.R.id.btn_commit);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.luck.picture.lib.R.id.tvTitle);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.luck.picture.lib.R.id.tv_content);
        textView.setText(str);
        textView2.setText(str2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        setDialogSize();
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
        int id = view.getId();
        if (id == com.luck.picture.lib.R.id.btn_cancel) {
            dismiss();
            return;
        }
        if (id == com.luck.picture.lib.R.id.btn_commit) {
            dismiss();
            com.luck.picture.lib.dialog.PictureCommonDialog.OnDialogEventListener onDialogEventListener = this.eventListener;
            if (onDialogEventListener != null) {
                onDialogEventListener.onConfirm();
            }
        }
    }

    public void setOnDialogEventListener(com.luck.picture.lib.dialog.PictureCommonDialog.OnDialogEventListener onDialogEventListener) {
        this.eventListener = onDialogEventListener;
    }
}
