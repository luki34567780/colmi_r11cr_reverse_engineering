package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class ToastUtils {
    private static final long TIME = 1000;
    private static long lastClickTime;
    private static java.lang.String mLastText;

    public static void showToast(final android.content.Context context, final java.lang.String str) {
        if (isFastDoubleClick() && android.text.TextUtils.equals(str, mLastText)) {
            return;
        }
        android.content.Context appContext = com.luck.picture.lib.app.PictureAppMaster.getInstance().getAppContext();
        if (appContext == null) {
            appContext = context.getApplicationContext();
        }
        if (com.luck.picture.lib.thread.PictureThreadUtils.isInUiThread()) {
            android.widget.Toast.makeText(appContext, str, 0).show();
            mLastText = str;
        } else {
            com.luck.picture.lib.thread.PictureThreadUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.luck.picture.lib.utils.ToastUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    android.content.Context appContext2 = com.luck.picture.lib.app.PictureAppMaster.getInstance().getAppContext();
                    if (appContext2 == null) {
                        appContext2 = context.getApplicationContext();
                    }
                    android.widget.Toast.makeText(appContext2, str, 0).show();
                    java.lang.String unused = com.luck.picture.lib.utils.ToastUtils.mLastText = str;
                }
            });
        }
    }

    public static boolean isFastDoubleClick() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - lastClickTime < 1000) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }
}
