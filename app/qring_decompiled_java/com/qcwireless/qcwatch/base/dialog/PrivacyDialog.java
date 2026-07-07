package com.qcwireless.qcwatch.base.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class PrivacyDialog extends android.app.Dialog {
    public PrivacyDialog(android.content.Context context) {
        super(context, com.qcwireless.qcwatch.R.style.PrivacyThemeDialog);
        setContentView(com.qcwireless.qcwatch.R.layout.dialog_privary);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
