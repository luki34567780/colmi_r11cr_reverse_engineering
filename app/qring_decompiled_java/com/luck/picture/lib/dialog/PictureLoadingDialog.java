package com.luck.picture.lib.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureLoadingDialog extends android.app.Dialog {
    public PictureLoadingDialog(android.content.Context context) {
        super(context, com.luck.picture.lib.R.style.Picture_Theme_AlertDialog);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.luck.picture.lib.R.layout.ps_alert_dialog);
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
}
