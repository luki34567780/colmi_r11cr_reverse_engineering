package com.amap.api.col.p0003sl;

/* compiled from: BottomDialogBase.java */
/* loaded from: classes.dex */
abstract class eu extends android.app.Dialog {
    protected abstract void a();

    public eu(android.content.Context context) {
        super(context);
        b();
    }

    private void b() {
        android.view.Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            a();
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -2;
                attributes.gravity = 80;
            }
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
    }
}
